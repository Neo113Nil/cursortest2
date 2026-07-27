package com.inmobi.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.AbstractC3680ee;
import com.inmobi.media.AbstractC3914mk;
import com.inmobi.media.AbstractC3942nk;
import com.inmobi.media.Ad;
import com.inmobi.media.Ba;
import com.inmobi.media.C3600bi;
import com.inmobi.media.C3626cf;
import com.inmobi.media.C3653de;
import com.inmobi.media.C3882li;
import com.inmobi.media.C3993pe;
import com.inmobi.media.C4106tf;
import com.inmobi.media.Kc;
import com.inmobi.media.Ok;
import com.inmobi.media.U9;
import com.inmobi.media.Y9;
import com.inmobi.media.Z9;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.ironsource.Te;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\f\u0018\u0000 K2\u00020\u0001:\u0002LKB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u0018J\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010!J\u000f\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b&\u0010!J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b*\u0010!J\u000f\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\n2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u001d\u0010;\u001a\u00020\n2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000204¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u000201¢\u0006\u0004\b@\u00103J#\u0010C\u001a\u00020\n2\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0018\u00010A¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\n2\b\u0010H\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\bI\u0010GJ\r\u0010J\u001a\u00020\n¢\u0006\u0004\bJ\u0010\u0018¨\u0006M"}, d2 = {"Lcom/inmobi/ads/InMobiNative;", "", "Landroid/content/Context;", "context", "", "placementId", "Lcom/inmobi/ads/listeners/NativeAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;JLcom/inmobi/ads/listeners/NativeAdEventListener;)V", "", InAppPurchaseConstants.METHOD_SET_LISTENER, "(Lcom/inmobi/ads/listeners/NativeAdEventListener;)V", "Lcom/inmobi/ads/listeners/VideoEventListener;", "setVideoEventListener", "(Lcom/inmobi/ads/listeners/VideoEventListener;)V", "Lcom/inmobi/ads/InMobiNative$LockScreenListener;", "lockScreenListener", "showOnLockScreen", "(Lcom/inmobi/ads/InMobiNative$LockScreenListener;)V", "", Te.n, "load", "([B)V", "()V", "Lcom/inmobi/media/ads/nativeAd/InMobiNativeViewData;", "inMobiNativeViewData", "registerViewForTracking", "(Lcom/inmobi/media/ads/nativeAd/InMobiNativeViewData;)V", "unTrackViews", "takeAction", "", "getAdTitle", "()Ljava/lang/String;", "getAdDescription", "Lcom/inmobi/media/ads/nativeAd/InMobiNativeImage;", "getAdIcon", "()Lcom/inmobi/media/ads/nativeAd/InMobiNativeImage;", "getCtaText", "", "getAdRating", "()F", "getAdvertiserName", "Lcom/inmobi/media/ads/nativeAd/MediaView;", "getMediaView", "()Lcom/inmobi/media/ads/nativeAd/MediaView;", "Landroid/view/View;", "getAdChoiceIcon", "()Landroid/view/View;", "", "isVideo", "()Z", "", "minBidToWin", "notifyWin", "(D)V", "", "lossReason", "auctionPrice", "notifyLoss", "(ID)V", "Lorg/json/JSONObject;", "getAdContent", "()Lorg/json/JSONObject;", "isReady", "", "extras", "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "destroy", k.M, "LockScreenListener", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InMobiNative {
    public static final String APP_INSTALLS = "AppInstalls";
    public static final String LIKES = "Likes";

    /* renamed from: a, reason: collision with root package name */
    public final C3653de f6438a;
    public static final String b = "InMobiNative";

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/inmobi/ads/InMobiNative$LockScreenListener;", "", "onActionRequired", "", "nativeAd", "Lcom/inmobi/ads/InMobiNative;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface LockScreenListener {
        void onActionRequired(InMobiNative nativeAd);
    }

    public InMobiNative(Context context, long j, NativeAdEventListener adEventListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adEventListener, "listener");
        C3653de c3653de = new C3653de(this, context, j);
        this.f6438a = c3653de;
        if (AbstractC3914mk.c()) {
            Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
            c3653de.b.f7228a = adEventListener;
        } else {
            String TAG = b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            throw new SdkNotInitializedException(TAG);
        }
    }

    public final void destroy() {
        C3653de c3653de = this.f6438a;
        c3653de.getClass();
        try {
            c3653de.e = null;
            C3882li c3882li = c3653de.b;
            c3882li.f7228a = null;
            c3882li.b = null;
            c3882li.c = null;
            c3653de.c.c.clear();
            c3653de.d.b.j();
        } catch (Exception e) {
            String str = AbstractC3680ee.f7085a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            Kc.a((byte) 1, str, "Failed to destroy ad; SDK encountered an unexpected error");
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
    }

    public final View getAdChoiceIcon() {
        C3626cf c3626cf = this.f6438a.e;
        if (c3626cf != null) {
            return c3626cf.j;
        }
        return null;
    }

    public final JSONObject getAdContent() {
        C3626cf c3626cf = this.f6438a.e;
        if (c3626cf != null) {
            return c3626cf.e;
        }
        return null;
    }

    public final String getAdDescription() {
        C3626cf c3626cf = this.f6438a.e;
        if (c3626cf != null) {
            return c3626cf.b;
        }
        return null;
    }

    public final InMobiNativeImage getAdIcon() {
        C3626cf c3626cf = this.f6438a.e;
        if (c3626cf != null) {
            return c3626cf.c;
        }
        return null;
    }

    public final float getAdRating() {
        Float f;
        C3626cf c3626cf = this.f6438a.e;
        if (c3626cf == null || (f = c3626cf.g) == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public final String getAdTitle() {
        C3626cf c3626cf = this.f6438a.e;
        if (c3626cf != null) {
            return c3626cf.f7047a;
        }
        return null;
    }

    public final String getAdvertiserName() {
        C3626cf c3626cf = this.f6438a.e;
        if (c3626cf != null) {
            return c3626cf.f;
        }
        return null;
    }

    public final String getCtaText() {
        C3626cf c3626cf = this.f6438a.e;
        if (c3626cf != null) {
            return c3626cf.d;
        }
        return null;
    }

    public final MediaView getMediaView() {
        C3626cf c3626cf = this.f6438a.e;
        if (c3626cf != null) {
            return c3626cf.i;
        }
        return null;
    }

    public final boolean isReady() {
        return this.f6438a.e != null;
    }

    public final boolean isVideo() {
        C3626cf c3626cf = this.f6438a.e;
        if (c3626cf != null) {
            return c3626cf.h;
        }
        return false;
    }

    public final void load(byte[] response) {
        C3653de c3653de = this.f6438a;
        C3600bi c3600bi = c3653de.f7067a;
        Intrinsics.checkNotNullParameter("AB", "<set-?>");
        c3600bi.h = "AB";
        c3653de.d.b.a(response);
    }

    public final void notifyLoss(int lossReason, double auctionPrice) {
        String a2 = this.f6438a.d.b.a(lossReason, auctionPrice);
        if (a2.length() > 0) {
            Kc.a((byte) 1, "InMobiNative", a2);
        }
    }

    public final void notifyWin(double minBidToWin) {
        String a2 = this.f6438a.d.b.a(minBidToWin);
        if (a2.length() > 0) {
            Kc.a((byte) 1, "InMobiNative", a2);
        }
    }

    public final void registerViewForTracking(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        C3653de c3653de = this.f6438a;
        c3653de.getClass();
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        c3653de.d.a(inMobiNativeViewData);
    }

    public final void setContentUrl(String contentUrl) {
        this.f6438a.f7067a.f = contentUrl;
    }

    public final void setExtras(Map<String, String> extras) {
        C3653de c3653de = this.f6438a;
        if (extras != null) {
            c3653de.getClass();
            String str = extras.get("tp");
            if (!TextUtils.isEmpty(str)) {
                AbstractC3942nk.b = str;
            }
            String str2 = extras.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                AbstractC3942nk.f7270a = str2;
            }
        }
        c3653de.f7067a.d = extras;
    }

    public final void setKeywords(String keywords) {
        this.f6438a.f7067a.c = keywords;
    }

    public final void setListener(NativeAdEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C3653de c3653de = this.f6438a;
        c3653de.getClass();
        Intrinsics.checkNotNullParameter(listener, "adEventListener");
        c3653de.b.f7228a = listener;
    }

    public final void setVideoEventListener(VideoEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C3653de c3653de = this.f6438a;
        c3653de.getClass();
        Intrinsics.checkNotNullParameter(listener, "videoEventListener");
        c3653de.b.b = listener;
    }

    public final void showOnLockScreen(LockScreenListener lockScreenListener) {
        Intrinsics.checkNotNullParameter(lockScreenListener, "lockScreenListener");
        C3653de c3653de = this.f6438a;
        c3653de.getClass();
        Intrinsics.checkNotNullParameter(lockScreenListener, "lockScreenListener");
        c3653de.f7067a.g = true;
        c3653de.b.c = lockScreenListener;
    }

    public final void takeAction() {
        Ad ad = this.f6438a.d.b;
        Ok ok = ad.c;
        C3993pe c3993pe = ok instanceof C3993pe ? (C3993pe) ok : null;
        if (c3993pe != null) {
            Y9 l = c3993pe.l();
            if (l != null) {
                ((Z9) l).a("AUM-NativeLoadedState", "takeAction - delegating to ad unit");
            }
            c3993pe.h.a();
        }
        Ok ok2 = ad.c;
        C4106tf c4106tf = ok2 instanceof C4106tf ? (C4106tf) ok2 : null;
        if (c4106tf != null) {
            Y9 l2 = c4106tf.l();
            if (l2 != null) {
                ((Z9) l2).a("AUM-NativeRenderedState", "takeAction - delegating to ad unit");
            }
            c4106tf.f.a();
        }
    }

    public final void unTrackViews() {
        this.f6438a.d.b.d();
    }

    public final void load() {
        C3653de c3653de = this.f6438a;
        C3600bi c3600bi = c3653de.f7067a;
        Intrinsics.checkNotNullParameter("NonAB", "<set-?>");
        c3600bi.h = "NonAB";
        c3653de.d.b.c();
    }
}
