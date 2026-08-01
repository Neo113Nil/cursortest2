package com.inmobi.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.media.AbstractC3734gb;
import com.inmobi.media.AbstractC3841k6;
import com.inmobi.media.AbstractC3914mk;
import com.inmobi.media.AbstractC3923n1;
import com.inmobi.media.AbstractC3942nk;
import com.inmobi.media.Ba;
import com.inmobi.media.C3600bi;
import com.inmobi.media.C3633cm;
import com.inmobi.media.C3762hb;
import com.inmobi.media.C3791ib;
import com.inmobi.media.C3818jb;
import com.inmobi.media.C3846kb;
import com.inmobi.media.Kc;
import com.inmobi.media.U9;
import com.inmobi.media.V9;
import com.ironsource.Te;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 F2\u00020\u0001:\u0002GHB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\n2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\r¢\u0006\u0004\b\"\u0010\u0010J\u0015\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010\u0012J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020(¢\u0006\u0004\b/\u00100R\"\u00102\u001a\u0002018\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R \u0010E\u001a\u00020?8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010\u0012\u001a\u0004\bB\u0010C¨\u0006I"}, d2 = {"Lcom/inmobi/ads/InMobiInterstitial;", "", "Landroid/content/Context;", "context", "", "placementId", "Lcom/inmobi/ads/listeners/InterstitialAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;JLcom/inmobi/ads/listeners/InterstitialAdEventListener;)V", "", InAppPurchaseConstants.METHOD_SET_LISTENER, "(Lcom/inmobi/ads/listeners/InterstitialAdEventListener;)V", "", "keywords", "setKeywords", "(Ljava/lang/String;)V", "getSignals", "()V", "", Te.n, "load", "([B)V", "loadAdUnit", "show", "(Landroid/content/Context;)V", "", "isReady", "()Z", "", "extras", "setExtras", "(Ljava/util/Map;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/WatermarkData;", "watermarkData", "setWatermarkData", "(Lcom/inmobi/ads/WatermarkData;)V", "disableHardwareAcceleration", "", "minBidToWin", "notifyWin", "(D)V", "", "lossReason", "auctionPrice", "notifyLoss", "(ID)V", "Lcom/inmobi/media/gb;", "mPubListener", "Lcom/inmobi/media/gb;", "getMPubListener$media_release", "()Lcom/inmobi/media/gb;", "setMPubListener$media_release", "(Lcom/inmobi/media/gb;)V", "Lcom/inmobi/media/kb;", "mAdManager", "Lcom/inmobi/media/kb;", "getMAdManager$media_release", "()Lcom/inmobi/media/kb;", "setMAdManager$media_release", "(Lcom/inmobi/media/kb;)V", "Lcom/inmobi/ads/PreloadManager;", "f", "Lcom/inmobi/ads/PreloadManager;", "getPreloadManager", "()Lcom/inmobi/ads/PreloadManager;", "getPreloadManager$annotations", "preloadManager", k.M, "a", "com/inmobi/media/V9", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InMobiInterstitial {
    public static final V9 Companion = new V9();

    /* renamed from: a, reason: collision with root package name */
    public final Context f6436a;
    public boolean b;
    public final WeakReference c;
    public final C3600bi d;
    public final a e;
    public final e f;
    public C3846kb mAdManager;
    public AbstractC3734gb mPubListener;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiInterstitial$a;", "Lcom/inmobi/media/jb;", "Lcom/inmobi/ads/InMobiInterstitial;", "interstitial", "<init>", "(Lcom/inmobi/ads/InMobiInterstitial;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C3818jb {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InMobiInterstitial interstitial) {
            super(interstitial);
            Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        }

        @Override // com.inmobi.media.C3818jb, com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.media.C3818jb, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(InMobiAdRequestStatus status) {
            AbstractC3734gb mPubListener$media_release;
            Intrinsics.checkNotNullParameter(status, "status");
            InMobiInterstitial inMobiInterstitial = this.f7179a.get();
            if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
                return;
            }
            mPubListener$media_release.a(inMobiInterstitial, status);
        }

        @Override // com.inmobi.media.C3818jb, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(AdMetaInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiInterstitial inMobiInterstitial = this.f7179a.get();
            if (inMobiInterstitial != null) {
                try {
                    inMobiInterstitial.getMAdManager$media_release().i();
                } catch (IllegalStateException e) {
                    String access$getTAG$cp = InMobiInterstitial.access$getTAG$cp();
                    Intrinsics.checkNotNullExpressionValue(access$getTAG$cp, "access$getTAG$cp(...)");
                    Kc.a((byte) 1, access$getTAG$cp, e.getMessage());
                    inMobiInterstitial.getMPubListener$media_release().a(inMobiInterstitial, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    public InMobiInterstitial(Context context, long j, InterstitialAdEventListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C3600bi c3600bi = new C3600bi();
        this.d = c3600bi;
        this.e = new a(this);
        this.f = new e(this);
        if (!AbstractC3914mk.c()) {
            Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            throw new SdkNotInitializedException("InMobiInterstitial");
        }
        this.f6436a = context.getApplicationContext();
        c3600bi.f7031a = j;
        this.c = new WeakReference(context);
        setMPubListener$media_release(new C3762hb(listener));
        setMAdManager$media_release(new C3846kb());
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        return "InMobiInterstitial";
    }

    @Deprecated(message = "Preload Flow is deprecated. Use load() instead")
    public static /* synthetic */ void getPreloadManager$annotations() {
    }

    public final void a(Activity activity) {
        try {
            if (this.b) {
                getMAdManager$media_release().a(activity);
            } else {
                Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
                Kc.a((byte) 1, "InMobiInterstitial", "load() must be called before trying to show the ad");
            }
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            Kc.a((byte) 1, "InMobiInterstitial", "Unable to show ad; SDK encountered an unexpected error");
            Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            String str = "Show failed with unexpected error: " + e.getMessage();
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
    }

    public final void disableHardwareAcceleration() {
        this.d.e = true;
    }

    public final C3846kb getMAdManager$media_release() {
        C3846kb c3846kb = this.mAdManager;
        if (c3846kb != null) {
            return c3846kb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAdManager");
        return null;
    }

    public final AbstractC3734gb getMPubListener$media_release() {
        AbstractC3734gb abstractC3734gb = this.mPubListener;
        if (abstractC3734gb != null) {
            return abstractC3734gb;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mPubListener");
        return null;
    }

    public final PreloadManager getPreloadManager() {
        return this.f;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Please use InMobiSdk.getToken() instead.", replaceWith = @ReplaceWith(expression = "InMobiSdk.getToken()", imports = {"com.inmobi.ads.InMobiSdk"}))
    public final void getSignals() {
        C3600bi c3600bi = this.d;
        c3600bi.getClass();
        Intrinsics.checkNotNullParameter("AB", "<set-?>");
        c3600bi.h = "AB";
        C3846kb mAdManager$media_release = getMAdManager$media_release();
        C3600bi c3600bi2 = this.d;
        Context context = this.f6436a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        mAdManager$media_release.a(c3600bi2, context, false, "getToken");
        getMAdManager$media_release().a(this.e);
    }

    public final boolean isReady() {
        C3791ib c3791ib;
        C3633cm c3633cm;
        C3846kb mAdManager$media_release = getMAdManager$media_release();
        C3791ib c3791ib2 = mAdManager$media_release.h;
        boolean z = c3791ib2 != null && 2 == mAdManager$media_release.f6810a && c3791ib2.b == 4;
        if (!z && (((c3791ib = getMAdManager$media_release().h) == null || (c3633cm = c3791ib.I) == null || !c3633cm.b) && c3791ib != null)) {
            c3791ib.c0();
        }
        return z;
    }

    public final void load(byte[] response) {
        this.b = true;
        C3600bi c3600bi = this.d;
        Intrinsics.checkNotNullParameter("AB", "<set-?>");
        c3600bi.h = "AB";
        C3846kb mAdManager$media_release = getMAdManager$media_release();
        C3600bi c3600bi2 = this.d;
        Context context = this.f6436a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        mAdManager$media_release.a(c3600bi2, context, true, "intHtml");
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC3841k6.c((Context) this.c.get());
        }
        getMAdManager$media_release().a(response, this.e);
    }

    public final void loadAdUnit() {
        getMAdManager$media_release().b(this.e);
    }

    public final void notifyLoss(int lossReason, double auctionPrice) {
        String str = "loss notification failed to trigger";
        if (this.mAdManager == null) {
            Kc.a((byte) 1, "InMobi", "loss notification failed to trigger");
            return;
        }
        C3846kb mAdManager$media_release = getMAdManager$media_release();
        if (mAdManager$media_release.f() != null) {
            AbstractC3923n1 f = mAdManager$media_release.f();
            str = f != null ? f.a(lossReason, auctionPrice) : null;
        }
        if (str != null) {
            Kc.a((byte) 1, "InMobi", str);
        }
    }

    public final void notifyWin(double minBidToWin) {
        String str = "win notification failed to trigger";
        if (this.mAdManager == null) {
            Kc.a((byte) 1, "InMobi", "win notification failed to trigger");
            return;
        }
        C3846kb mAdManager$media_release = getMAdManager$media_release();
        if (mAdManager$media_release.f() != null) {
            AbstractC3923n1 f = mAdManager$media_release.f();
            str = f != null ? f.a(minBidToWin) : null;
        }
        if (str != null) {
            Kc.a((byte) 1, "InMobi", str);
        }
    }

    public final void setContentUrl(String contentUrl) {
        Intrinsics.checkNotNullParameter(contentUrl, "contentUrl");
        this.d.f = contentUrl;
    }

    public final void setExtras(Map<String, String> extras) {
        if (extras != null) {
            String str = extras.get("tp");
            if (!TextUtils.isEmpty(str)) {
                AbstractC3942nk.b = str;
            }
            String str2 = extras.get("tp-v");
            if (!TextUtils.isEmpty(str2)) {
                AbstractC3942nk.f7270a = str2;
            }
        }
        this.d.d = extras;
    }

    public final void setKeywords(String keywords) {
        this.d.c = keywords;
    }

    public final void setListener(InterstitialAdEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setMPubListener$media_release(new C3762hb(listener));
    }

    public final void setMAdManager$media_release(C3846kb c3846kb) {
        Intrinsics.checkNotNullParameter(c3846kb, "<set-?>");
        this.mAdManager = c3846kb;
    }

    public final void setMPubListener$media_release(AbstractC3734gb abstractC3734gb) {
        Intrinsics.checkNotNullParameter(abstractC3734gb, "<set-?>");
        this.mPubListener = abstractC3734gb;
    }

    public final void setWatermarkData(WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        getMAdManager$media_release().a(watermarkData);
    }

    public final void show(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context instanceof Activity) {
            a((Activity) context);
            return;
        }
        Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
        Kc.a((byte) 1, "InMobiInterstitial", "Activity context is required to show interstitial ad as expected");
        a(null);
    }

    public final void show() {
        a(null);
    }

    public final void load() {
        try {
            this.b = true;
            C3600bi c3600bi = this.d;
            Intrinsics.checkNotNullParameter("NonAB", "<set-?>");
            c3600bi.h = "NonAB";
            C3846kb mAdManager$media_release = getMAdManager$media_release();
            C3600bi c3600bi2 = this.d;
            Context context = this.f6436a;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
                context = null;
            }
            mAdManager$media_release.a(c3600bi2, context, true, "intHtml");
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC3841k6.c((Context) this.c.get());
            }
            loadAdUnit();
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            Kc.a((byte) 1, "InMobiInterstitial", "Unable to load ad; SDK encountered an unexpected error");
            Intrinsics.checkNotNullExpressionValue("InMobiInterstitial", "TAG");
            String str = "Load failed with unexpected error: " + e.getMessage();
            getMAdManager$media_release().a((short) 2000);
            getMAdManager$media_release().a(getMAdManager$media_release().h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
    }
}
