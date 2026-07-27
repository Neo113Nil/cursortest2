package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d2 extends AbstractC0181d1 {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2738b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2739c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2740d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f2741e;
    public final AtomicReferenceFieldUpdater f;

    public d2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(9);
        this.f2738b = atomicReferenceFieldUpdater;
        this.f2739c = atomicReferenceFieldUpdater2;
        this.f2740d = atomicReferenceFieldUpdater3;
        this.f2741e = atomicReferenceFieldUpdater4;
        this.f = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final boolean A(r2 r2Var, q2 q2Var, q2 q2Var2) {
        return AbstractC0181d1.l(this.f2740d, r2Var, q2Var, q2Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final void i(q2 q2Var, q2 q2Var2) {
        this.f2739c.lazySet(q2Var, q2Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final void r(q2 q2Var, Thread thread) {
        this.f2738b.lazySet(q2Var, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final boolean t(r2 r2Var, F1 f12, F1 f13) {
        return AbstractC0181d1.l(this.f2741e, r2Var, f12, f13);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0181d1
    public final boolean v(r2 r2Var, Object obj, Object obj2) {
        return AbstractC0181d1.l(this.f, r2Var, obj, obj2);
    }
}
