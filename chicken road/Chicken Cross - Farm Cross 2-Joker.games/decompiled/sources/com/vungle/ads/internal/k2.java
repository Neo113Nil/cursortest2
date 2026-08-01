package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public class k2 extends e1 {
    public Long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    public final void a(Long l) {
        this.c = l;
    }

    public final long c() {
        Long l = this.c;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }
}
