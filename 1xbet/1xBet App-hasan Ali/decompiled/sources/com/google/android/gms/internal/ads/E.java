package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class E implements InterfaceC0737a0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8444a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.InterfaceC0737a0
    public final int a(DE de, int i, boolean z3) {
        int e3 = de.e(this.f8444a, 0, Math.min(4096, i));
        if (e3 != -1) {
            return e3;
        }
        if (z3) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0737a0
    public final int b(DE de, int i, boolean z3) {
        return a(de, i, z3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0737a0
    public final void c(int i, C1617tm c1617tm) {
        c1617tm.k(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0737a0
    public final void d(long j5, int i, int i5, int i6, Z z3) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0737a0
    public final void e(C1407p c1407p) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0737a0
    public final void f(C1617tm c1617tm, int i, int i5) {
        c1617tm.k(i);
    }
}
