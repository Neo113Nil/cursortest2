package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class p1 extends k2 {
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    public final boolean d() {
        return this.d;
    }

    public final void e() {
        this.d = true;
    }
}
