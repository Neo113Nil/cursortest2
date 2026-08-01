package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public Sdk.SDKMetric.SDKMetricType f11910a;
    public String b;

    public e1(Sdk.SDKMetric.SDKMetricType metricType) {
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        this.f11910a = metricType;
    }

    public final void a(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        Intrinsics.checkNotNullParameter(sDKMetricType, "<set-?>");
        this.f11910a = sDKMetricType;
    }

    public final Sdk.SDKMetric.SDKMetricType b() {
        return this.f11910a;
    }

    public final String a() {
        return this.b;
    }

    public final void a(String str) {
        this.b = str;
    }
}
