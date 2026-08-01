package com.vungle.ads.internal;

import android.os.Handler;
import com.vungle.ads.VungleError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class h0 implements com.vungle.ads.internal.presenter.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f11923a;

    public h0(i0 i0Var) {
        this.f11923a = i0Var;
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdClick(String str) {
        Handler handler = com.vungle.ads.internal.util.y.f12193a;
        com.vungle.ads.internal.util.y.a(new b0(this.f11923a));
        this.f11923a.getDisplayToClickMetric().d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        q1 displayToClickMetric = this.f11923a.getDisplayToClickMetric();
        analyticsClient.a(displayToClickMetric, this.f11923a.getLogEntry(), displayToClickMetric.b);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdEnd(String str) {
        Handler handler = com.vungle.ads.internal.util.y.f12193a;
        com.vungle.ads.internal.util.y.a(new c0(this.f11923a));
        this.f11923a.getShowToCloseMetric().d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        q1 showToCloseMetric = this.f11923a.getShowToCloseMetric();
        analyticsClient.a(showToCloseMetric, this.f11923a.getLogEntry(), showToCloseMetric.b);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdImpression(String str) {
        Handler handler = com.vungle.ads.internal.util.y.f12193a;
        com.vungle.ads.internal.util.y.a(new d0(this.f11923a));
        this.f11923a.getPresentToDisplayMetric().d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        q1 presentToDisplayMetric = this.f11923a.getPresentToDisplayMetric();
        analyticsClient.a(presentToDisplayMetric, this.f11923a.getLogEntry(), presentToDisplayMetric.b);
        this.f11923a.getDisplayToClickMetric().e();
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdLeftApplication(String str) {
        Handler handler = com.vungle.ads.internal.util.y.f12193a;
        com.vungle.ads.internal.util.y.a(new e0(this.f11923a));
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.f11923a.getLeaveApplicationMetric(), this.f11923a.getLogEntry(), 4);
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdRewarded(String str) {
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onAdStart(String str) {
        com.vungle.ads.internal.signals.j signalManager$vungle_ads_release = this.f11923a.getSignalManager$vungle_ads_release();
        synchronized (signalManager$vungle_ads_release) {
            signalManager$vungle_ads_release.h.f++;
        }
        this.f11923a.getAdInternal$vungle_ads_release().l.d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        q1 q1Var = this.f11923a.getAdInternal$vungle_ads_release().l;
        analyticsClient.a(q1Var, this.f11923a.getLogEntry(), q1Var.b);
        this.f11923a.getPresentToDisplayMetric().e();
        Handler handler = com.vungle.ads.internal.util.y.f12193a;
        com.vungle.ads.internal.util.y.a(new f0(this.f11923a));
    }

    @Override // com.vungle.ads.internal.presenter.b
    public final void onFailure(VungleError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Handler handler = com.vungle.ads.internal.util.y.f12193a;
        com.vungle.ads.internal.util.y.a(new g0(this.f11923a, error));
        this.f11923a.getShowToFailMetric().d();
        AnalyticsClient.INSTANCE.a(this.f11923a.getShowToFailMetric(), this.f11923a.getLogEntry(), error.getCom.tiktok.appevents.edp.TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE java.lang.String() + '-' + error.getErrorMessage());
    }
}
