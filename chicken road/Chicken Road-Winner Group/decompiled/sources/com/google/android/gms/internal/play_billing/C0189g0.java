package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.play_billing.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189g0 extends AbstractC0181d1 {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2754b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2755c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2756d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2757e;
    public final AtomicReferenceFieldUpdater f;

    public C0189g0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(7);
        this.f2754b = atomicReferenceFieldUpdater;
        this.f2755c = atomicReferenceFieldUpdater2;
        this.f2756d = atomicReferenceFieldUpdater3;
        this.f2757e = atomicReferenceFieldUpdater4;
        this.f = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final boolean D(AbstractC0210n0 abstractC0210n0, Object obj, Object obj2) {
        return AbstractC0181d1.k(this.f, abstractC0210n0, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final boolean F(AbstractC0210n0 abstractC0210n0, C0207m0 c0207m0, C0207m0 c0207m02) {
        return AbstractC0181d1.k(this.f2756d, abstractC0210n0, c0207m0, c0207m02);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final C0186f0 d(AbstractC0210n0 abstractC0210n0) {
        return (C0186f0) this.f2757e.getAndSet(abstractC0210n0, C0186f0.f2747d);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final C0207m0 o(AbstractC0210n0 abstractC0210n0) {
        return (C0207m0) this.f2756d.getAndSet(abstractC0210n0, C0207m0.f2775c);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final void s(C0207m0 c0207m0, C0207m0 c0207m02) {
        this.f2755c.lazySet(c0207m0, c0207m02);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final void u(C0207m0 c0207m0, Thread thread) {
        this.f2754b.lazySet(c0207m0, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final boolean z(AbstractC0210n0 abstractC0210n0, C0186f0 c0186f0, C0186f0 c0186f02) {
        return AbstractC0181d1.k(this.f2757e, abstractC0210n0, c0186f0, c0186f02);
    }
}
