package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.jh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1163jh implements S2.m {

    /* renamed from: k, reason: collision with root package name */
    public final Yh f14126k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f14127l = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f14128m = new AtomicBoolean(false);

    public C1163jh(Yh yh) {
        this.f14126k = yh;
    }

    @Override // S2.m
    public final void N2() {
        this.f14126k.n1(new Jh(6));
    }

    @Override // S2.m
    public final void Q1() {
        AtomicBoolean atomicBoolean = this.f14128m;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f14126k.n1(new Jh(4));
    }

    @Override // S2.m
    public final void Z2() {
    }

    @Override // S2.m
    public final void d1(int i) {
        this.f14127l.set(true);
        AtomicBoolean atomicBoolean = this.f14128m;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.f14126k.n1(new Jh(4));
    }

    @Override // S2.m
    public final void h1() {
    }

    @Override // S2.m
    public final void t1() {
    }
}
