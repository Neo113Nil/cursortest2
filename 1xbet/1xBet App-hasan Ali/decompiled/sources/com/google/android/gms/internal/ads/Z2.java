package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Z2 implements InterfaceC0874d3 {

    /* renamed from: a, reason: collision with root package name */
    public final Y2 f12445a;

    /* renamed from: b, reason: collision with root package name */
    public final C1617tm f12446b = new C1617tm(32);

    /* renamed from: c, reason: collision with root package name */
    public int f12447c;

    /* renamed from: d, reason: collision with root package name */
    public int f12448d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12449e;
    public boolean f;

    public Z2(Y2 y22) {
        this.f12445a = y22;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0874d3
    public final void a(int i, C1617tm c1617tm) {
        int i5 = i & 1;
        int v4 = i5 != 0 ? c1617tm.f15725b + c1617tm.v() : -1;
        if (this.f) {
            if (i5 == 0) {
                return;
            }
            this.f = false;
            c1617tm.j(v4);
            this.f12448d = 0;
        }
        while (c1617tm.o() > 0) {
            int i6 = this.f12448d;
            C1617tm c1617tm2 = this.f12446b;
            if (i6 < 3) {
                if (i6 == 0) {
                    int v5 = c1617tm.v();
                    c1617tm.j(c1617tm.f15725b - 1);
                    if (v5 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(c1617tm.o(), 3 - this.f12448d);
                c1617tm.f(c1617tm2.f15724a, this.f12448d, min);
                int i7 = this.f12448d + min;
                this.f12448d = i7;
                if (i7 == 3) {
                    c1617tm2.j(0);
                    c1617tm2.i(3);
                    c1617tm2.k(1);
                    int v6 = c1617tm2.v();
                    boolean z3 = (v6 & 128) != 0;
                    int v7 = c1617tm2.v();
                    this.f12449e = z3;
                    int i8 = (((v6 & 15) << 8) | v7) + 3;
                    this.f12447c = i8;
                    byte[] bArr = c1617tm2.f15724a;
                    if (bArr.length < i8) {
                        int length = bArr.length;
                        c1617tm2.e(Math.min(4098, Math.max(i8, length + length)));
                    }
                }
            } else {
                int min2 = Math.min(c1617tm.o(), this.f12447c - i6);
                c1617tm.f(c1617tm2.f15724a, this.f12448d, min2);
                int i9 = this.f12448d + min2;
                this.f12448d = i9;
                int i10 = this.f12447c;
                if (i9 != i10) {
                    continue;
                } else {
                    if (!this.f12449e) {
                        c1617tm2.i(i10);
                    } else {
                        if (AbstractC1260lo.k(0, i10, -1, c1617tm2.f15724a) != 0) {
                            this.f = true;
                            return;
                        }
                        c1617tm2.i(this.f12447c - 4);
                    }
                    c1617tm2.j(0);
                    this.f12445a.c(c1617tm2);
                    this.f12448d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0874d3
    public final void b(Kn kn, H h3, C0829c3 c0829c3) {
        this.f12445a.b(kn, h3, c0829c3);
        this.f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0874d3
    public final void i() {
        this.f = true;
    }
}
