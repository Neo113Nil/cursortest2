package com.moloco.sdk.acm.services;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.services.i f6923a;
    public final java.util.concurrent.atomic.AtomicLong b;

    public h(com.moloco.sdk.acm.services.i timeProviderService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f6923a = timeProviderService;
        this.b = new java.util.concurrent.atomic.AtomicLong(0L);
    }

    public final long a() {
        return this.f6923a.invoke() - this.b.get();
    }

    public final java.util.concurrent.atomic.AtomicLong b() {
        return this.b;
    }

    public final void c() {
        this.b.set(this.f6923a.invoke());
    }
}
