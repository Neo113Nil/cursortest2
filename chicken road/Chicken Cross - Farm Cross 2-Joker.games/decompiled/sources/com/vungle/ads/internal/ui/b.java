package com.vungle.ads.internal.ui;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class b extends com.vungle.ads.internal.util.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f12144a;

    public b(l lVar) {
        this.f12144a = lVar;
    }

    @Override // com.vungle.ads.internal.util.b
    public final void a() {
        com.vungle.ads.internal.presenter.r rVar = this.f12144a.f12154a;
        Long l = (rVar == null || rVar.j) ? null : 1L;
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("AdActivity", "App is in background, status: " + l);
        if (l != null) {
            AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.AD_BACKGROUND_BEFORE_IMPRESSION, l.longValue(), this.f12144a.e, null, 8);
        }
    }

    @Override // com.vungle.ads.internal.util.b
    public final void b() {
    }
}
