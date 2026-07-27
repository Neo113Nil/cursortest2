package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.play_billing.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0333g0 extends AbstractC0325d1 {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5185b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5186c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5187d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5188e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f5189f;

    public C0333g0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(7);
        this.f5185b = atomicReferenceFieldUpdater;
        this.f5186c = atomicReferenceFieldUpdater2;
        this.f5187d = atomicReferenceFieldUpdater3;
        this.f5188e = atomicReferenceFieldUpdater4;
        this.f5189f = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final void B(C0351m0 c0351m0, Thread thread) {
        this.f5185b.lazySet(c0351m0, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final boolean H(AbstractC0354n0 abstractC0354n0, C0330f0 c0330f0, C0330f0 c0330f02) {
        return AbstractC0325d1.m(this.f5188e, abstractC0354n0, c0330f0, c0330f02);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final boolean L(AbstractC0354n0 abstractC0354n0, Object obj, Object obj2) {
        return AbstractC0325d1.m(this.f5189f, abstractC0354n0, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final boolean N(AbstractC0354n0 abstractC0354n0, C0351m0 c0351m0, C0351m0 c0351m02) {
        return AbstractC0325d1.m(this.f5187d, abstractC0354n0, c0351m0, c0351m02);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final C0330f0 e(AbstractC0354n0 abstractC0354n0) {
        return (C0330f0) this.f5188e.getAndSet(abstractC0354n0, C0330f0.f5178d);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final C0351m0 r(AbstractC0354n0 abstractC0354n0) {
        return (C0351m0) this.f5187d.getAndSet(abstractC0354n0, C0351m0.f5208c);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final void z(C0351m0 c0351m0, C0351m0 c0351m02) {
        this.f5186c.lazySet(c0351m0, c0351m02);
    }
}
