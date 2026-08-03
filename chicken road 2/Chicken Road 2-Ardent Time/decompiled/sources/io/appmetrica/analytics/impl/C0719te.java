package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.te, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0719te implements io.appmetrica.analytics.impl.S8, io.appmetrica.analytics.impl.InterfaceC0745ue {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.L6 f6856a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f6857b;

    public C0719te(io.appmetrica.analytics.impl.L6 l6) {
        this.f6856a = l6;
        this.f6857b = new java.util.concurrent.atomic.AtomicLong(l6.a());
        l6.a(this);
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void a(java.util.List<java.lang.Integer> list) {
        this.f6857b.addAndGet(list.size());
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void b(java.util.List<java.lang.Integer> list) {
        this.f6857b.addAndGet(-list.size());
    }

    @Override // io.appmetrica.analytics.impl.S8
    public final void a() {
        this.f6857b.set(this.f6856a.a());
    }

    public final long b() {
        return this.f6857b.get();
    }
}
