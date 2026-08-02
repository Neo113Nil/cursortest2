package v;

/* renamed from: v.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1661l extends AbstractC1662m {
    @Override // v.AbstractC1662m
    public final void V(int i7, int i8, int i9, int i10) {
        int i11 = this.f17058A0 + this.f17059B0;
        int i12 = this.f17065w0 + this.f17066x0;
        if (this.f17056v0 > 0) {
            i11 += this.f17055u0[0].r();
            i12 += this.f17055u0[0].l();
        }
        int max = Math.max(this.f16949d0, i11);
        int max2 = Math.max(this.f16951e0, i12);
        if (i7 != 1073741824) {
            i8 = i7 == Integer.MIN_VALUE ? Math.min(max, i8) : i7 == 0 ? max : 0;
        }
        if (i9 != 1073741824) {
            i10 = i9 == Integer.MIN_VALUE ? Math.min(max2, i10) : i9 == 0 ? max2 : 0;
        }
        this.f17061D0 = i8;
        this.f17062E0 = i10;
        P(i8);
        M(i10);
        this.f17060C0 = this.f17056v0 > 0;
    }

    @Override // v.C1654e
    public final void b(t.c cVar, boolean z4) {
        super.b(cVar, z4);
        if (this.f17056v0 > 0) {
            C1654e c1654e = this.f17055u0[0];
            c1654e.E();
            c1654e.f16955g0 = 0.5f;
            c1654e.f16953f0 = 0.5f;
            c1654e.e(2, this, 2, 0);
            c1654e.e(4, this, 4, 0);
            c1654e.e(3, this, 3, 0);
            c1654e.e(5, this, 5, 0);
        }
    }
}
