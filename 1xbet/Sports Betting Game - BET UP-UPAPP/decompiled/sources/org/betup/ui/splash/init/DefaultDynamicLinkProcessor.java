package org.betup.ui.splash.init;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.collection.SieveCacheKt;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import io.bidmachine.media3.exoplayer.upstream.CmcdData;
import java.util.List;
import org.betup.BuildConfig;
import org.betup.utils.InviteHelper;
import org.betup.utils.ShareInstallLinkCodec;
import org.betup.utils.SharedPrefs;

/* loaded from: classes4.dex */
public class DefaultDynamicLinkProcessor implements DynamicLinkProcessor {
    private static final int EXECUTION_TIMEOUT = 2000;
    private Activity activity;
    private boolean linkProcessed = false;

    public DefaultDynamicLinkProcessor(Activity activity) {
        this.activity = activity;
    }

    @Override // org.betup.ui.splash.init.DynamicLinkProcessor
    public void processDynamicLinks(final DynamicLinkListener listener) {
        Log.d("VERSIONTEST", "PROCESSING DYNAMIC LINKS... " + this.linkProcessed);
        if (this.linkProcessed) {
            listener.linkProcessed();
        } else if (trySaveDeepLinkFromAppLink(this.activity.getIntent())) {
            this.linkProcessed = true;
            listener.linkProcessed();
        } else {
            FirebaseDynamicLinks.getInstance().getDynamicLink(this.activity.getIntent()).addOnCanceledListener(new OnCanceledListener() { // from class: org.betup.ui.splash.init.DefaultDynamicLinkProcessor$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.tasks.OnCanceledListener
                public final void onCanceled() {
                    DefaultDynamicLinkProcessor.this.m14328xb5e45f20(listener);
                }
            }).addOnSuccessListener(new OnSuccessListener() { // from class: org.betup.ui.splash.init.DefaultDynamicLinkProcessor$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    DefaultDynamicLinkProcessor.this.m14329xcfffddbf(listener, (PendingDynamicLinkData) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: org.betup.ui.splash.init.DefaultDynamicLinkProcessor$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    DefaultDynamicLinkProcessor.this.m14330xea1b5c5e(listener, exc);
                }
            });
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.betup.ui.splash.init.DefaultDynamicLinkProcessor$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDynamicLinkProcessor.this.m14331x436dafd(listener);
                }
            }, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        }
    }

    /* renamed from: lambda$processDynamicLinks$0$org-betup-ui-splash-init-DefaultDynamicLinkProcessor, reason: not valid java name */
    /* synthetic */ void m14328xb5e45f20(DynamicLinkListener dynamicLinkListener) {
        if (this.linkProcessed) {
            return;
        }
        this.linkProcessed = true;
        dynamicLinkListener.linkProcessed();
    }

    /* renamed from: lambda$processDynamicLinks$2$org-betup-ui-splash-init-DefaultDynamicLinkProcessor, reason: not valid java name */
    /* synthetic */ void m14330xea1b5c5e(DynamicLinkListener dynamicLinkListener, Exception exc) {
        Log.d("VERSIONTEST", "CANNOT LOAD LINK");
        if (this.linkProcessed) {
            return;
        }
        this.linkProcessed = true;
        dynamicLinkListener.linkProcessed();
    }

    /* renamed from: lambda$processDynamicLinks$3$org-betup-ui-splash-init-DefaultDynamicLinkProcessor, reason: not valid java name */
    /* synthetic */ void m14331x436dafd(DynamicLinkListener dynamicLinkListener) {
        if (this.linkProcessed) {
            return;
        }
        this.linkProcessed = true;
        dynamicLinkListener.linkProcessed();
    }

    private static boolean isMatchDeepLinkHost(String hostLower) {
        if (hostLower == null) {
            return false;
        }
        return BuildConfig.MATCH_SHARE_LINK_HOST.equals(hostLower) || hostLower.endsWith(".betup.org") || "qbetapp.info".equals(hostLower) || hostLower.endsWith(".qbetapp.info");
    }

    private boolean trySaveDeepLinkFromAppLink(Intent intent) {
        Uri data;
        String host;
        if (intent == null || (data = intent.getData()) == null || (host = data.getHost()) == null || !isMatchDeepLinkHost(host.toLowerCase())) {
            return false;
        }
        List<String> pathSegments = data.getPathSegments();
        if (trySaveDeepLinkFromShortInstallToken(pathSegments) || trySaveDeepLinkFromInstallPath(pathSegments, data)) {
            return true;
        }
        for (int i = 0; i < pathSegments.size() - 1; i++) {
            String str = pathSegments.get(i);
            if ("matches".equalsIgnoreCase(str)) {
                try {
                    long parseLong = Long.parseLong(pathSegments.get(i + 1));
                    if (parseLong > 0 && parseLong <= SieveCacheKt.NodeLinkMask) {
                        SharedPrefs.saveMatchLink(this.activity, (int) parseLong);
                        Log.d("SHARE_OFFER", "App Link match id saved: " + parseLong);
                        return true;
                    }
                } catch (NumberFormatException unused) {
                    continue;
                }
            } else if ("bets".equalsIgnoreCase(str)) {
                long parseLong2 = Long.parseLong(pathSegments.get(i + 1));
                if (parseLong2 > 0 && parseLong2 <= SieveCacheKt.NodeLinkMask) {
                    SharedPrefs.saveBetLinkId(this.activity, (int) parseLong2);
                    SharedPrefs.saveBetLinkOwnerUserIdFromUri(this.activity, data);
                    Log.d("SHARE_OFFER", "App Link bet id saved: " + parseLong2);
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private boolean trySaveDeepLinkFromShortInstallToken(List<String> segments) {
        if (segments.size() == 2 && "share".equalsIgnoreCase(segments.get(0)) && applyDecodedShareToken(segments.get(1))) {
            return true;
        }
        if (segments.size() == 4 && "api".equalsIgnoreCase(segments.get(0)) && "v7".equalsIgnoreCase(segments.get(1)) && "share".equalsIgnoreCase(segments.get(2)) && applyDecodedShareToken(segments.get(3))) {
            return true;
        }
        for (int i = 0; i < segments.size() - 1; i++) {
            if (CmcdData.OBJECT_TYPE_INIT_SEGMENT.equalsIgnoreCase(segments.get(i)) && applyDecodedShareToken(segments.get(i + 1))) {
                return true;
            }
        }
        return false;
    }

    private boolean applyDecodedShareToken(String token) {
        ShareInstallLinkCodec.Decoded decode = ShareInstallLinkCodec.decode(token);
        if (decode == null) {
            return false;
        }
        if (decode.isBet()) {
            SharedPrefs.saveBetLinkId(this.activity, decode.getEntityId());
            SharedPrefs.saveBetLinkOwnerUserId(this.activity, Math.max(0, decode.getOwnerUserId()));
            Log.d("SHARE_OFFER", "App Link bet id saved (share token): " + decode.getEntityId());
            return true;
        }
        SharedPrefs.saveMatchLink(this.activity, decode.getEntityId());
        Log.d("SHARE_OFFER", "App Link match id saved (share token): " + decode.getEntityId());
        return true;
    }

    private boolean trySaveDeepLinkFromInstallPath(List<String> segments, Uri uri) {
        for (int i = 0; i < segments.size() - 1; i++) {
            if ("install".equalsIgnoreCase(segments.get(i))) {
                try {
                    long parseLong = Long.parseLong(segments.get(i + 1));
                    if (parseLong > 0 && parseLong <= SieveCacheKt.NodeLinkMask) {
                        boolean z = false;
                        boolean z2 = false;
                        for (int i2 = 0; i2 < i; i2++) {
                            if ("matches".equalsIgnoreCase(segments.get(i2))) {
                                z = true;
                            }
                            if ("bets".equalsIgnoreCase(segments.get(i2))) {
                                z2 = true;
                            }
                        }
                        if (z && !z2) {
                            SharedPrefs.saveMatchLink(this.activity, (int) parseLong);
                            Log.d("SHARE_OFFER", "App Link match id saved (install path): " + parseLong);
                            return true;
                        }
                        if (z2 && !z) {
                            SharedPrefs.saveBetLinkId(this.activity, (int) parseLong);
                            SharedPrefs.saveBetLinkOwnerUserIdFromUri(this.activity, uri);
                            Log.d("SHARE_OFFER", "App Link bet id saved (install path): " + parseLong);
                            return true;
                        }
                    }
                } catch (NumberFormatException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processSuccessfulLink, reason: merged with bridge method [inline-methods] */
    public void m14329xcfffddbf(PendingDynamicLinkData pendingDynamicLinkData, DynamicLinkListener listener) {
        String str;
        this.linkProcessed = true;
        Log.d("VERSIONTEST", "GOT LINK!");
        Uri link = pendingDynamicLinkData != null ? pendingDynamicLinkData.getLink() : null;
        Log.d("SHARE_OFFER", "GOT DEEP LINK = " + link);
        if (link != null) {
            try {
                String[] split = link.toString().split("/");
                if (link.toString().contains("matches")) {
                    str = split[split.length - 2];
                    try {
                        SharedPrefs.saveMatchLink(this.activity, Integer.valueOf(split[split.length - 1]).intValue());
                    } catch (Exception unused) {
                    }
                } else {
                    str = split[split.length - 1];
                }
                Log.d("INVITE", "GOT INVITE CODE " + str);
                InviteHelper.saveInvited(this.activity.getApplicationContext(), str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        listener.linkProcessed();
    }
}
