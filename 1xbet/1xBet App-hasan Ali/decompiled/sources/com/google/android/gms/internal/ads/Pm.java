package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class Pm implements InterfaceC0808bi, Ph {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f11111m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static int f11112n;

    /* renamed from: k, reason: collision with root package name */
    public final T2.I f11113k;

    /* renamed from: l, reason: collision with root package name */
    public final Tm f11114l;

    public Pm(Tm tm, T2.I i) {
        this.f11114l = tm;
        this.f11113k = i;
    }

    public final void a(boolean z3) {
        int i;
        int intValue;
        A7 a7 = F7.P5;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && !this.f11113k.n()) {
            Object obj = f11111m;
            synchronized (obj) {
                i = f11112n;
                intValue = ((Integer) rVar.f5056c.a(F7.Q5)).intValue();
            }
            if (i < intValue) {
                Tm tm = this.f11114l;
                Cr e3 = tm.f11676d.e(new Bundle());
                e3.a(new Kw(0, e3, new Sm(tm, z3)), AbstractC0613Id.f9544g);
                synchronized (obj) {
                    f11112n++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0808bi
    public final void j0() {
        a(true);
    }

    @Override // com.google.android.gms.internal.ads.Ph
    public final void l0(C0387u0 c0387u0) {
        a(false);
    }
}
