package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class a0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Sdk.SDKMetric.SDKMetricType f11885a;
    public final /* synthetic */ long b;
    public final /* synthetic */ com.vungle.ads.internal.util.s c;
    public final /* synthetic */ Sdk.SDKMetric.Builder d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Sdk.SDKMetric.SDKMetricType sDKMetricType, long j, com.vungle.ads.internal.util.s sVar, Sdk.SDKMetric.Builder builder) {
        super(0);
        this.f11885a = sDKMetricType;
        this.b = j;
        this.c = sVar;
        this.d = builder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder append = com.iab.omid.library.vungle.internal.l.a("Logging Metric ").append(this.f11885a).append(" with value ").append(this.b).append(" for placement ");
        com.vungle.ads.internal.util.s sVar = this.c;
        return append.append(sVar != null ? sVar.f12189a : null).append(" mediation:").append(this.d.getMediationName()).toString();
    }
}
