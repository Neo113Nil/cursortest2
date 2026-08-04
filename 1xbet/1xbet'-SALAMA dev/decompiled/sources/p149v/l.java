package p149v;

import p136t.c;

/* JADX INFO: loaded from: classes.dex */
public final class l extends m {
    @Override // p149v.m
    public final void V(int i7, int i8, int i9, int i10) {
        int iR = this.f17064A0 + this.f17065B0;
        int iL = this.f17071w0 + this.f17072x0;
        if (this.f17062v0 > 0) {
            iR += this.f17061u0[0].r();
            iL += this.f17061u0[0].l();
        }
        int iMax = Math.max(this.f16955d0, iR);
        int iMax2 = Math.max(this.f16957e0, iL);
        if (i7 != 1073741824) {
            if (i7 == Integer.MIN_VALUE) {
                i8 = Math.min(iMax, i8);
            } else {
                i8 = i7 == 0 ? iMax : 0;
            }
        }
        if (i9 != 1073741824) {
            if (i9 == Integer.MIN_VALUE) {
                i10 = Math.min(iMax2, i10);
            } else {
                i10 = i9 == 0 ? iMax2 : 0;
            }
        }
        this.f17067D0 = i8;
        this.f17068E0 = i10;
        P(i8);
        M(i10);
        this.f17066C0 = this.f17062v0 > 0;
    }

    @Override // p149v.e
    public final void b(c cVar, boolean z4) {
        super.b(cVar, z4);
        if (this.f17062v0 > 0) {
            e eVar = this.f17061u0[0];
            eVar.E();
            eVar.f16961g0 = 0.5f;
            eVar.f16959f0 = 0.5f;
            eVar.e(2, this, 2, 0);
            eVar.e(4, this, 4, 0);
            eVar.e(3, this, 3, 0);
            eVar.e(5, this, 5, 0);
        }
    }
}
