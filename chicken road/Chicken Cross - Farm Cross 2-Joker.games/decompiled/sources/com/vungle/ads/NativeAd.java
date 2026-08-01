package com.vungle.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.exifinterface.media.ExifInterface;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.internal.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.h;
import com.vungle.ads.internal.k2;
import com.vungle.ads.internal.l2;
import com.vungle.ads.internal.network.p;
import com.vungle.ads.internal.o1;
import com.vungle.ads.internal.platform.c;
import com.vungle.ads.internal.presenter.a;
import com.vungle.ads.internal.presenter.b;
import com.vungle.ads.internal.presenter.w;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.q1;
import com.vungle.ads.internal.s;
import com.vungle.ads.internal.signals.j;
import com.vungle.ads.internal.ui.a0;
import com.vungle.ads.internal.ui.view.MediaView;
import com.vungle.ads.internal.ui.view.e;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.y;
import com.vungle.ads.nativead.NativeVideoOptions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ;2\u00020\u0001:\u0002<;B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u00108\u001a\u00020\b¢\u0006\u0004\b9\u0010:J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\bJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0013J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0011J0\u0010\"\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fJ\u0006\u0010#\u001a\u00020\u0017R(\u0010-\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u00103\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0011\u00107\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006="}, d2 = {"Lcom/vungle/ads/NativeAd;", "Lcom/vungle/ads/BaseAd;", "Landroid/content/Context;", "context", "Lcom/vungle/ads/internal/o1;", "constructAdInternal$vungle_ads_release", "(Landroid/content/Context;)Lcom/vungle/ads/internal/o1;", "constructAdInternal", "", "getAppIcon", "getAdTitle", "getAdBodyText", "getAdCallToActionText", "", "getAdStarRating", "()Ljava/lang/Double;", "getAdSponsoredText", "", "hasCallToAction", "", "getMediaAspectRatio", "Lcom/vungle/ads/internal/ui/view/MediaView;", "getMediaView", "", "unregisterView", "hasVideoContent", "Landroid/widget/FrameLayout;", "rootView", "mediaView", "Landroid/widget/ImageView;", "adIconView", "", "Landroid/view/View;", "clickableViews", "registerViewForInteraction", "performCTA", "", "x", "I", "getAdOptionsPosition", "()I", "setAdOptionsPosition", "(I)V", "getAdOptionsPosition$annotations", "()V", "adOptionsPosition", "Lcom/vungle/ads/internal/l2;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/vungle/ads/internal/l2;", "getNativeDisplayDurationMetric$vungle_ads_release", "()Lcom/vungle/ads/internal/l2;", "nativeDisplayDurationMetric", "Lcom/vungle/ads/nativead/NativeVideoOptions;", "getVideoOptions", "()Lcom/vungle/ads/nativead/NativeVideoOptions;", "videoOptions", "placementId", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", k.M, "AdOptionsPosition", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class NativeAd extends BaseAd {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;

    /* renamed from: A, reason: from kotlin metadata */
    public final l2 nativeDisplayDurationMetric;
    public final AtomicBoolean B;
    public final NativeAd$adPlayCallback$1 C;
    public ImageView s;
    public MediaView t;
    public FrameLayout u;
    public Collection v;
    public com.vungle.ads.internal.ui.view.k w;

    /* renamed from: x, reason: from kotlin metadata */
    public int adOptionsPosition;
    public final o1 y;
    public int z;

    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/vungle/ads/NativeAd$AdOptionsPosition;", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public @interface AdOptionsPosition {
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.vungle.ads.NativeAd$adPlayCallback$1] */
    public NativeAd(Context context, String str, AdConfig adConfig) {
        super(context, str, adConfig);
        this.adOptionsPosition = 1;
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        Intrinsics.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.NativeAdInternal");
        this.y = (o1) adInternal$vungle_ads_release;
        this.nativeDisplayDurationMetric = new l2(Sdk.SDKMetric.SDKMetricType.NATIVE_AD_DISPLAY_DURATION);
        this.B = new AtomicBoolean(false);
        this.C = new b() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.b
            public void onAdClick(String id) {
                Handler handler = y.f12193a;
                final NativeAd nativeAd = NativeAd.this;
                y.a(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdClick$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(NativeAd.this);
                        }
                    }
                });
                NativeAd.this.getDisplayToClickMetric().d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                q1 displayToClickMetric = NativeAd.this.getDisplayToClickMetric();
                analyticsClient.a(displayToClickMetric, NativeAd.this.getLogEntry(), displayToClickMetric.b);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdEnd(String id) {
                if (NativeAd.this.getAdInternal$vungle_ads_release().i()) {
                    NativeAd.this.getAdInternal$vungle_ads_release().a(h.c);
                }
                Handler handler = y.f12193a;
                final NativeAd nativeAd = NativeAd.this;
                y.a(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdEnd$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(NativeAd.this);
                        }
                    }
                });
                NativeAd.this.getShowToCloseMetric().d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                q1 showToCloseMetric = NativeAd.this.getShowToCloseMetric();
                analyticsClient.a(showToCloseMetric, NativeAd.this.getLogEntry(), showToCloseMetric.b);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdImpression(String id) {
                NativeAd.this.getAdInternal$vungle_ads_release().a(h.e);
                Handler handler = y.f12193a;
                final NativeAd nativeAd = NativeAd.this;
                y.a(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdImpression$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(NativeAd.this);
                        }
                    }
                });
                NativeAd.this.getPresentToDisplayMetric().d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                q1 presentToDisplayMetric = NativeAd.this.getPresentToDisplayMetric();
                analyticsClient.a(presentToDisplayMetric, NativeAd.this.getLogEntry(), presentToDisplayMetric.b);
                NativeAd.this.getDisplayToClickMetric().e();
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdLeftApplication(String id) {
                Handler handler = y.f12193a;
                final NativeAd nativeAd = NativeAd.this;
                y.a(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdLeftApplication$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(NativeAd.this);
                        }
                    }
                });
                AnalyticsClient.a(AnalyticsClient.INSTANCE, NativeAd.this.getLeaveApplicationMetric(), NativeAd.this.getLogEntry(), 4);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdRewarded(String id) {
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdStart(String id) {
                NativeAd.this.getAdInternal$vungle_ads_release().a(h.d);
                j signalManager$vungle_ads_release = NativeAd.this.getSignalManager$vungle_ads_release();
                synchronized (signalManager$vungle_ads_release) {
                    signalManager$vungle_ads_release.h.f++;
                }
                NativeAd.this.getAdInternal$vungle_ads_release().l.d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                q1 q1Var = NativeAd.this.getAdInternal$vungle_ads_release().l;
                analyticsClient.a(q1Var, NativeAd.this.getLogEntry(), q1Var.b);
                NativeAd.this.getPresentToDisplayMetric().e();
                Handler handler = y.f12193a;
                final NativeAd nativeAd = NativeAd.this;
                y.a(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdStart$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(NativeAd.this);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onFailure(final VungleError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                NativeAd.this.getAdInternal$vungle_ads_release().a(h.g);
                Handler handler = y.f12193a;
                final NativeAd nativeAd = NativeAd.this;
                y.a(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onFailure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(NativeAd.this, error);
                        }
                    }
                });
                NativeAd.this.getShowToFailMetric().d();
                AnalyticsClient.INSTANCE.a(NativeAd.this.getShowToFailMetric(), NativeAd.this.getLogEntry(), error.getCom.tiktok.appevents.edp.TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE java.lang.String() + '-' + error.getErrorMessage());
            }
        };
    }

    public static final void a(NativeAd this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y.v();
    }

    public static final void b(NativeAd this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.y.w();
    }

    @AdOptionsPosition
    public static /* synthetic */ void getAdOptionsPosition$annotations() {
    }

    public final String getAdBodyText() {
        String str;
        LinkedHashMap linkedHashMap = this.y.u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("APP_DESCRIPTION")) == null) ? "" : str;
    }

    public final String getAdCallToActionText() {
        String str;
        LinkedHashMap linkedHashMap = this.y.u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("CTA_BUTTON_TEXT")) == null) ? "" : str;
    }

    public final int getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    public final String getAdSponsoredText() {
        String str;
        LinkedHashMap linkedHashMap = this.y.u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("SPONSORED_BY")) == null) ? "" : str;
    }

    public final Double getAdStarRating() {
        return this.y.m();
    }

    public final String getAdTitle() {
        String str;
        LinkedHashMap linkedHashMap = this.y.u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("APP_NAME")) == null) ? "" : str;
    }

    public final String getAppIcon() {
        String str;
        LinkedHashMap linkedHashMap = this.y.u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("APP_ICON")) == null) ? "" : str;
    }

    public final float getMediaAspectRatio() {
        return this.y.x;
    }

    /* renamed from: getMediaView, reason: from getter */
    public final MediaView getT() {
        return this.t;
    }

    /* renamed from: getNativeDisplayDurationMetric$vungle_ads_release, reason: from getter */
    public final l2 getNativeDisplayDurationMetric() {
        return this.nativeDisplayDurationMetric;
    }

    public final NativeVideoOptions getVideoOptions() {
        return this.y.r();
    }

    public final boolean hasCallToAction() {
        String str;
        LinkedHashMap linkedHashMap = this.y.u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("CTA_BUTTON_URL")) == null) {
            str = "";
        }
        return str.length() > 0;
    }

    public final boolean hasVideoContent() {
        return this.y.s();
    }

    public final void performCTA() {
        String str;
        o1 o1Var = this.y;
        w wVar = o1Var.t;
        if (wVar != null) {
            LinkedHashMap linkedHashMap = o1Var.u;
            if (linkedHashMap == null || (str = (String) linkedHashMap.get("CTA_BUTTON_URL")) == null) {
                str = "";
            }
            wVar.a("download", (String) null, str);
        }
    }

    public final void registerViewForInteraction(FrameLayout rootView, MediaView mediaView, ImageView adIconView, Collection<? extends View> clickableViews) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        boolean z = u.f12190a;
        t.c("NativeAd", l.a("registerViewForInteraction ").append(hashCode()).toString());
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.a(analyticsClient, new k2(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry(), 4);
        this.z++;
        this.nativeDisplayDurationMetric.e();
        getResponseToShowMetric().d();
        AnalyticsClient.a(analyticsClient, getResponseToShowMetric(), getLogEntry());
        getAdInternal$vungle_ads_release().g().e();
        getShowToFailMetric().e();
        getShowToCloseMetric().e();
        if (getAdInternal$vungle_ads_release().i()) {
            if (Intrinsics.areEqual(this.u, rootView)) {
                t.a("NativeAd", "no-op when re-play it on the same root view");
                return;
            }
            unregisterView();
        }
        this.B.set(false);
        VungleError a2 = getAdInternal$vungle_ads_release().a(true);
        if (a2 != null) {
            t.c("NativeAd", l.a("registerViewForInteraction can NOT play. ").append(hashCode()).append(' ').append(a2).toString());
            if (getAdInternal$vungle_ads_release().a(a2.getCom.tiktok.appevents.edp.TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE java.lang.String())) {
                getAdInternal$vungle_ads_release().a(h.g);
            }
            BaseAdListener adListener = getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this, a2);
                return;
            }
            return;
        }
        this.u = rootView;
        this.t = mediaView;
        this.s = adIconView;
        this.v = clickableViews;
        this.y.a(rootView, this.C);
        if (this.w == null) {
            this.w = new com.vungle.ads.internal.ui.view.k(getContext());
        }
        com.vungle.ads.internal.ui.view.k kVar = this.w;
        if (kVar != null) {
            kVar.setOnClickListener(new View.OnClickListener() { // from class: com.vungle.ads.NativeAd$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NativeAd.a(NativeAd.this, view);
                }
            });
        }
        if (clickableViews == null) {
            clickableViews = CollectionsKt.listOf(mediaView);
        }
        Iterator<T> it = clickableViews.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener() { // from class: com.vungle.ads.NativeAd$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NativeAd.b(NativeAd.this, view);
                }
            });
        }
        com.vungle.ads.internal.ui.view.k kVar2 = this.w;
        if (kVar2 != null) {
            kVar2.a(rootView, this.adOptionsPosition);
        }
        this.y.a(mediaView);
        mediaView.a(this.y);
        this.y.a(adIconView);
        o1 o1Var = this.y;
        com.vungle.ads.internal.ui.view.k kVar3 = this.w;
        o1Var.c(kVar3 != null ? kVar3.getPrivacyIcon$vungle_ads_release() : null);
        this.y.a(rootView, getAdConfig().getWatermark$vungle_ads_release());
        getAdInternal$vungle_ads_release().g().d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, getAdInternal$vungle_ads_release().g(), getLogEntry());
        getAdInternal$vungle_ads_release().h().e();
    }

    public final void setAdOptionsPosition(int i) {
        this.adOptionsPosition = i;
    }

    public final void unregisterView() {
        boolean z = u.f12190a;
        t.c("NativeAd", l.a("unregisterView  ").append(hashCode()).toString());
        if (this.B.getAndSet(true)) {
            return;
        }
        this.nativeDisplayDurationMetric.d();
        this.nativeDisplayDurationMetric.b = String.valueOf(this.z);
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.nativeDisplayDurationMetric, getLogEntry(), 4);
        Collection collection = this.v;
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setOnClickListener(null);
            }
        }
        this.v = null;
        this.u = null;
        MediaView mediaView = this.t;
        if (mediaView != null) {
            mediaView.setOnClickListener(null);
            mediaView.setOnTouchListener(null);
            mediaView.removeAllViews();
            e eVar = mediaView.b;
            if (eVar != null) {
                eVar.a();
            }
            mediaView.b = null;
        }
        this.t = null;
        com.vungle.ads.internal.ui.view.k kVar = this.w;
        if (kVar != null) {
            kVar.a();
        }
        this.w = null;
        o1 o1Var = this.y;
        a0 a0Var = o1Var.z;
        if (a0Var != null) {
            ViewParent parent = a0Var.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(a0Var);
            }
        }
        o1Var.z = null;
        o1Var.n().a();
        w wVar = o1Var.t;
        if (wVar != null) {
            com.vungle.ads.internal.omsdk.b bVar = wVar.n;
            if (bVar != null) {
                AdSession adSession = bVar.b;
                if (adSession != null) {
                    adSession.finish();
                }
                bVar.b = null;
                bVar.c = null;
                bVar.d = null;
            }
            AlertDialog alertDialog = wVar.h;
            if (alertDialog != null && alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
            Long l = wVar.e;
            if (l != null) {
                List b = wVar.c.b("ad.close", String.valueOf(System.currentTimeMillis() - l.longValue()), String.valueOf(((c) wVar.d).k()));
                if (b != null) {
                    Iterator it2 = b.iterator();
                    while (it2.hasNext()) {
                        p pVar = new p((String) it2.next());
                        pVar.i = "ad.close";
                        pVar.j = wVar.a();
                        wVar.b().a(pVar.a(), false);
                    }
                }
            }
            a aVar = wVar.f;
            if (aVar != null) {
                aVar.a("end", null, ((o1) wVar.b).q());
            }
        }
        try {
            ImageView imageView = this.s;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e) {
            boolean z2 = u.f12190a;
            t.c("NativeAd", l.a("error msg: ").append(e.getLocalizedMessage()).toString());
        }
        ImageView imageView2 = this.s;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        this.s = null;
    }

    @Override // com.vungle.ads.BaseAd
    public o1 constructAdInternal$vungle_ads_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new o1(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAd(Context context, String placementId) {
        this(context, placementId, new AdConfig());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
    }
}
