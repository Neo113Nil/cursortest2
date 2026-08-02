package org.betup.services.share;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.share.Sharer;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import org.betup.bus.ShareMessage;
import org.betup.services.user.UserService;
import org.betup.utils.FacebookSdkHelper;
import org.betup.utils.InviteHelper;
import org.betup.utils.ShareHelper;

/* loaded from: classes2.dex */
public class ShareFacebookProvider implements ShareProvider {
    private CallbackManager callbackManager;
    private Activity context;
    private ShareDialog shareDialog;
    private final UserService userService;

    public ShareFacebookProvider(Activity context, UserService userService) {
        this.context = context;
        this.userService = userService;
        init();
    }

    @Override // org.betup.services.share.ShareProvider
    public void share(final ShareMessage shareMessage) {
        if (this.shareDialog == null || this.callbackManager == null) {
            Log.w(ShareHelper.SHARED_LOG, "Facebook share unavailable (SDK or ShareDialog not ready)");
            return;
        }
        Log.d(ShareHelper.SHARED_LOG, "Making share " + shareMessage.getLinkType());
        if (shareMessage.getLinkType() == InviteHelper.LinkType.MATCH && (shareMessage.getBundle() == null || shareMessage.getBundle().getInt("matchId") == 0)) {
            Log.d(ShareHelper.SHARED_LOG, "return");
        } else {
            InviteHelper.getLink(this.context, this.userService, shareMessage.getLinkType(), new InviteHelper.OnLinkGotListener() { // from class: org.betup.services.share.ShareFacebookProvider.1
                @Override // org.betup.utils.InviteHelper.OnLinkGotListener
                public void linkGot(final String shareLink) {
                    if (shareLink == null) {
                        Log.d(ShareHelper.SHARED_LOG, "LINK NULL");
                        return;
                    }
                    if (ShareFacebookProvider.this.shareDialog == null || ShareFacebookProvider.this.callbackManager == null) {
                        Log.w(ShareHelper.SHARED_LOG, "Facebook share became unavailable before link was ready");
                        return;
                    }
                    Activity activity = ShareFacebookProvider.this.context;
                    if (activity.isFinishing() || activity.isDestroyed()) {
                        return;
                    }
                    try {
                        Log.d(ShareHelper.SHARED_LOG, "LINK = " + shareLink);
                        if (ShareDialog.canShow((Class<? extends ShareContent<?, ?>>) ShareLinkContent.class)) {
                            ShareLinkContent build = new ShareLinkContent.Builder().setQuote(ShareHelper.getSharedText(shareMessage, ShareFacebookProvider.this.context, ShareFacebookProvider.this.userService)).setContentUrl(Uri.parse(shareLink)).build();
                            Log.d(ShareHelper.SHARED_LOG, "FACEBOOK!!!");
                            ShareFacebookProvider.this.shareDialog.show(build);
                        }
                    } catch (Throwable th) {
                        Log.e(ShareHelper.SHARED_LOG, "Facebook share failed", th);
                        if (th instanceof FacebookException) {
                            return;
                        }
                        FirebaseCrashlytics.getInstance().recordException(th);
                    }
                }
            }, shareMessage.getBundle());
        }
    }

    @Override // org.betup.services.share.ShareProvider
    public boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        CallbackManager callbackManager = this.callbackManager;
        if (callbackManager == null) {
            return false;
        }
        return callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    private void init() {
        try {
            if (FacebookSdkHelper.ensureInitialized(this.context)) {
                this.callbackManager = CallbackManager.Factory.create();
                ShareDialog shareDialog = new ShareDialog(this.context);
                this.shareDialog = shareDialog;
                shareDialog.registerCallback(this.callbackManager, new FacebookCallback<Sharer.Result>() { // from class: org.betup.services.share.ShareFacebookProvider.2
                    @Override // com.facebook.FacebookCallback
                    public void onSuccess(Sharer.Result result) {
                        Log.d(ShareHelper.SHARED_LOG, "FACEBOOK SHARE COMPLETED ");
                    }

                    @Override // com.facebook.FacebookCallback
                    public void onCancel() {
                        Log.d("REZUP", "FACEBOOK NO!");
                    }

                    @Override // com.facebook.FacebookCallback
                    public void onError(FacebookException e) {
                        Log.w(ShareHelper.SHARED_LOG, "Facebook share callback error", e);
                    }
                });
            }
        } catch (Throwable th) {
            Log.e(ShareHelper.SHARED_LOG, "Facebook ShareDialog init failed", th);
            FirebaseCrashlytics.getInstance().recordException(th);
            this.callbackManager = null;
            this.shareDialog = null;
        }
    }
}
