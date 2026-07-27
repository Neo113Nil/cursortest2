package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public class l2 extends e1 {
    public Long c;
    public Long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        Intrinsics.checkNotNullParameter(metricType, "metricType");
    }

    public final long c() {
        long nanoTime = System.nanoTime();
        Long l = this.d;
        long longValue = l != null ? l.longValue() : nanoTime;
        Long l2 = this.c;
        if (l2 != null) {
            nanoTime = l2.longValue();
        }
        return (longValue - nanoTime) / 1000000;
    }

    public void d() {
        this.d = Long.valueOf(System.nanoTime());
    }

    public void e() {
        this.c = Long.valueOf(System.nanoTime());
    }
}
