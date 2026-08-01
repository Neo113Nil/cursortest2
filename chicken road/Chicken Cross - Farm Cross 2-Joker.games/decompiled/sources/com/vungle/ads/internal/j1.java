package com.vungle.ads.internal;

import android.view.View;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;

/* loaded from: classes7.dex */
public final class j1 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o1 f11928a;

    public j1(o1 o1Var) {
        this.f11928a = o1Var;
    }

    @Override // com.vungle.ads.internal.z0
    public final void onImpression(View view) {
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("NativeAdInternal", "ImpressionTracker checked the native ad view become visible.");
        o1 o1Var = this.f11928a;
        o1Var.getClass();
        o1.a(o1Var, "checkpoint.0");
        o1Var.a(11, (Map) null);
        o1 o1Var2 = this.f11928a;
        long j = o1Var2.r.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        k2 k2Var = new k2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        k2Var.c = Long.valueOf(j);
        AnalyticsClient.a(analyticsClient, k2Var, o1Var2.m, 4);
        com.vungle.ads.internal.util.t.a("NativeAdInternal", "Log metric AD_VISIBILITY: " + j);
    }

    @Override // com.vungle.ads.internal.z0
    public final void onViewInvisible(View view) {
        if (this.f11928a.r.getAndSet(true)) {
            return;
        }
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("NativeAdInternal", "ImpressionTracker checked the native ad view invisible on play, log AD_VISIBILITY_INVISIBLE.");
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        k2 k2Var = new k2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        k2Var.c = 1L;
        AnalyticsClient.a(analyticsClient, k2Var, this.f11928a.m, 4);
    }
}
