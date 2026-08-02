package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class R1 implements InterfaceC0737a0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0737a0 f11301a;

    /* renamed from: b, reason: collision with root package name */
    public final O1 f11302b;

    /* renamed from: g, reason: collision with root package name */
    public P1 f11306g;

    /* renamed from: h, reason: collision with root package name */
    public C1407p f11307h;

    /* renamed from: d, reason: collision with root package name */
    public int f11304d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f11305e = 0;
    public byte[] f = AbstractC1260lo.f;

    /* renamed from: c, reason: collision with root package name */
    public final C1617tm f11303c = new C1617tm();

    public R1(InterfaceC0737a0 interfaceC0737a0, O1 o12) {
        this.f11301a = interfaceC0737a0;
        this.f11302b = o12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0737a0
    public final int a(DE de, int i, boolean z3) {
        if (this.f11306g == null) {
            return this.f11301a.a(de, i, z3);
        }
        g(i);
        int e3 = de.e(this.f, this.f11305e, i);
        if (e3 != -1) {
            this.f11305e += e3;
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
        f(c1617tm, i, 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0737a0
    public final void d(long j5, int i, int i5, int i6, Z z3) {
        if (this.f11306g == null) {
            this.f11301a.d(j5, i, i5, i6, z3);
            return;
        }
        AbstractC1668us.W("DRM on subtitles is not supported", z3 == null);
        int i7 = (this.f11305e - i6) - i5;
        this.f11306g.f(this.f, i7, i5, new Q1(this, j5, i));
        int i8 = i7 + i5;
        this.f11304d = i8;
        if (i8 == this.f11305e) {
            this.f11304d = 0;
            this.f11305e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0737a0
    public final void e(C1407p c1407p) {
        String str = c1407p.f14904m;
        str.getClass();
        AbstractC1668us.S(AbstractC1593t6.b(str) == 3);
        boolean equals = c1407p.equals(this.f11307h);
        O1 o12 = this.f11302b;
        if (!equals) {
            this.f11307h = c1407p;
            this.f11306g = o12.e(c1407p) ? o12.f(c1407p) : null;
        }
        P1 p12 = this.f11306g;
        InterfaceC0737a0 interfaceC0737a0 = this.f11301a;
        if (p12 == null) {
            interfaceC0737a0.e(c1407p);
            return;
        }
        C1649uH c1649uH = new C1649uH(c1407p);
        c1649uH.c("application/x-media3-cues");
        c1649uH.i = c1407p.f14904m;
        c1649uH.f15853q = Long.MAX_VALUE;
        c1649uH.f15837G = o12.j(c1407p);
        interfaceC0737a0.e(new C1407p(c1649uH));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0737a0
    public final void f(C1617tm c1617tm, int i, int i5) {
        if (this.f11306g == null) {
            this.f11301a.f(c1617tm, i, i5);
            return;
        }
        g(i);
        c1617tm.f(this.f, this.f11305e, i);
        this.f11305e += i;
    }

    public final void g(int i) {
        int length = this.f.length;
        int i5 = this.f11305e;
        if (length - i5 >= i) {
            return;
        }
        int i6 = i5 - this.f11304d;
        int max = Math.max(i6 + i6, i + i6);
        byte[] bArr = this.f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.f11304d, bArr2, 0, i6);
        this.f11304d = 0;
        this.f11305e = i6;
        this.f = bArr2;
    }
}
