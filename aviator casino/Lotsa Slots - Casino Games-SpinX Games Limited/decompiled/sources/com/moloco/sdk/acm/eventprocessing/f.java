package com.moloco.sdk.acm.eventprocessing;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.services.i f6893a;
    public final long b;

    public f(com.moloco.sdk.acm.services.i timeProviderService, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f6893a = timeProviderService;
        this.b = j;
    }

    public final boolean a(com.moloco.sdk.acm.db.b eventEntity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventEntity, "eventEntity");
        return this.f6893a.invoke() - eventEntity.l() >= this.b * ((long) 1000);
    }
}
