package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.ji, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1164ji extends BC implements Vh, InterfaceC1031gi {

    /* renamed from: m, reason: collision with root package name */
    public final Lq f14129m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f14130n;

    public C1164ji(Set set, Lq lq) {
        super(set);
        this.f14130n = new AtomicBoolean();
        this.f14129m = lq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1031gi
    public final void f() {
        if (this.f14129m.f10491b == 1) {
            p1();
        }
    }

    public final void p1() {
        Q2.b1 b1Var;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.w7)).booleanValue() && this.f14130n.compareAndSet(false, true) && (b1Var = this.f14129m.f10498e0) != null && b1Var.f4992k == 3) {
            n1(new U4(15, b1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.Vh
    public final void t() {
        int i = this.f14129m.f10491b;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            p1();
        }
    }
}
