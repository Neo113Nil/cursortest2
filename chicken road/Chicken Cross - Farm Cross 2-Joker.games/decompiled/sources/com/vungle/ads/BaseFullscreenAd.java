package com.vungle.ads;

import android.content.Context;
import android.os.Handler;
import com.ironsource.Wf;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.k2;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.presenter.b;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.q1;
import com.vungle.ads.internal.s;
import com.vungle.ads.internal.signals.j;
import com.vungle.ads.internal.signals.m;
import com.vungle.ads.internal.util.y;
import com.vungle.ads.internal.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/BaseFullscreenAd;", "Lcom/vungle/ads/BaseAd;", "Lcom/vungle/ads/FullscreenAd;", "", "adMarkup", "", "load", "Lcom/vungle/ads/internal/model/i0;", "advertisement", "onAdLoaded$vungle_ads_release", "(Lcom/vungle/ads/internal/model/i0;)V", Wf.j, "Landroid/content/Context;", "context", "play", "placementId", "Lcom/vungle/ads/AdConfig;", "adConfig", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes7.dex */
public abstract class BaseFullscreenAd extends BaseAd implements FullscreenAd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFullscreenAd(Context context, String placementId, AdConfig adConfig) {
        super(context, placementId, adConfig);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.BaseAd, com.vungle.ads.Ad
    public void load(String adMarkup) {
        setSignaledAd$vungle_ads_release(getSignalManager$vungle_ads_release().a(getPlacementId()));
        super.load(adMarkup);
    }

    @Override // com.vungle.ads.BaseAd
    public void onAdLoaded$vungle_ads_release(i0 advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        super.onAdLoaded$vungle_ads_release(advertisement);
        m signaledAd = getSignaledAd();
        if (signaledAd == null) {
            return;
        }
        signaledAd.a(System.currentTimeMillis());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.vungle.ads.BaseFullscreenAd$play$2] */
    @Override // com.vungle.ads.FullscreenAd
    public void play(Context context) {
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.a(analyticsClient, new k2(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry(), 4);
        getResponseToShowMetric().d();
        AnalyticsClient.a(analyticsClient, getResponseToShowMetric(), getLogEntry());
        getShowToFailMetric().e();
        getShowToCloseMetric().e();
        m signaledAd = getSignaledAd();
        if (signaledAd != null) {
            signaledAd.i = System.currentTimeMillis();
            signaledAd.f = m.a(Long.valueOf(signaledAd.h), signaledAd.i);
            getSignalManager$vungle_ads_release().a(context, signaledAd);
        }
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        Intrinsics.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.FullscreenAdInternal");
        ((y0) adInternal$vungle_ads_release).a(context, new b() { // from class: com.vungle.ads.BaseFullscreenAd$play$2
            @Override // com.vungle.ads.internal.presenter.b
            public void onAdClick(String id) {
                Handler handler = y.f12193a;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                y.a(new Function0<Unit>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdClick$1
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
                        BaseAdListener adListener = BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(BaseFullscreenAd.this);
                        }
                    }
                });
                BaseFullscreenAd.this.getDisplayToClickMetric().d();
                AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                q1 displayToClickMetric = BaseFullscreenAd.this.getDisplayToClickMetric();
                analyticsClient2.a(displayToClickMetric, BaseFullscreenAd.this.getLogEntry(), displayToClickMetric.b);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdEnd(String id) {
                Handler handler = y.f12193a;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                y.a(new Function0<Unit>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdEnd$1
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
                        BaseAdListener adListener = BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(BaseFullscreenAd.this);
                        }
                    }
                });
                BaseFullscreenAd.this.getShowToCloseMetric().d();
                AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                q1 showToCloseMetric = BaseFullscreenAd.this.getShowToCloseMetric();
                analyticsClient2.a(showToCloseMetric, BaseFullscreenAd.this.getLogEntry(), showToCloseMetric.b);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdImpression(String id) {
                Handler handler = y.f12193a;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                y.a(new Function0<Unit>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdImpression$1
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
                        BaseAdListener adListener = BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(BaseFullscreenAd.this);
                        }
                    }
                });
                BaseFullscreenAd.this.getPresentToDisplayMetric().d();
                AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                q1 presentToDisplayMetric = BaseFullscreenAd.this.getPresentToDisplayMetric();
                analyticsClient2.a(presentToDisplayMetric, BaseFullscreenAd.this.getLogEntry(), presentToDisplayMetric.b);
                BaseFullscreenAd.this.getDisplayToClickMetric().e();
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdLeftApplication(String id) {
                Handler handler = y.f12193a;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                y.a(new Function0<Unit>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdLeftApplication$1
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
                        BaseAdListener adListener = BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(BaseFullscreenAd.this);
                        }
                    }
                });
                AnalyticsClient.a(AnalyticsClient.INSTANCE, BaseFullscreenAd.this.getLeaveApplicationMetric(), BaseFullscreenAd.this.getLogEntry(), 4);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdRewarded(String id) {
                Handler handler = y.f12193a;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                y.a(new Function0<Unit>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdRewarded$1
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
                        BaseAdListener adListener = BaseFullscreenAd.this.getAdListener();
                        RewardedAdListener rewardedAdListener = adListener instanceof RewardedAdListener ? (RewardedAdListener) adListener : null;
                        if (rewardedAdListener != null) {
                            rewardedAdListener.onAdRewarded(BaseFullscreenAd.this);
                        }
                    }
                });
                AnalyticsClient.a(AnalyticsClient.INSTANCE, BaseFullscreenAd.this.getRewardedMetric(), BaseFullscreenAd.this.getLogEntry(), 4);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdStart(String id) {
                j signalManager$vungle_ads_release = BaseFullscreenAd.this.getSignalManager$vungle_ads_release();
                synchronized (signalManager$vungle_ads_release) {
                    signalManager$vungle_ads_release.h.f++;
                }
                BaseFullscreenAd.this.getPresentToDisplayMetric().e();
                Handler handler = y.f12193a;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                y.a(new Function0<Unit>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdStart$1
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
                        BaseAdListener adListener = BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(BaseFullscreenAd.this);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onFailure(final VungleError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                Handler handler = y.f12193a;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                y.a(new Function0<Unit>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onFailure$1
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
                        BaseAdListener adListener = BaseFullscreenAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(BaseFullscreenAd.this, error);
                        }
                    }
                });
                BaseFullscreenAd.this.getShowToFailMetric().d();
                AnalyticsClient.INSTANCE.a(BaseFullscreenAd.this.getShowToFailMetric(), BaseFullscreenAd.this.getLogEntry(), error.getCom.tiktok.appevents.edp.TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE java.lang.String() + '-' + error.getErrorMessage());
            }
        });
    }
}
