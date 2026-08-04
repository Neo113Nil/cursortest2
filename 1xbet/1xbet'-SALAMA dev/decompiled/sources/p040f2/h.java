package p040f2;

import g2.b;
import g2.m;
import p018c2.C0756b;
import p032e2.d;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f12863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f12864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f12865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f12866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12868f;

    public h(long j, m mVar, b bVar, d dVar, long j3, g gVar) {
        this.f12867e = j;
        this.f12864b = mVar;
        this.f12865c = bVar;
        this.f12868f = j3;
        this.f12863a = dVar;
        this.f12866d = gVar;
    }

    public final h a(long j, m mVar) throws C0756b {
        long jL;
        g gVarC = this.f12864b.c();
        g gVarC2 = mVar.c();
        if (gVarC == null) {
            return new h(j, mVar, this.f12865c, this.f12863a, this.f12868f, gVarC);
        }
        if (!gVarC.s()) {
            return new h(j, mVar, this.f12865c, this.f12863a, this.f12868f, gVarC2);
        }
        long jV = gVarC.v(j);
        if (jV == 0) {
            return new h(j, mVar, this.f12865c, this.f12863a, this.f12868f, gVarC2);
        }
        long jU = gVarC.u();
        long jB = gVarC.b(jU);
        long jL2 = jV + jU;
        long j3 = jL2 - 1;
        long jE = gVarC.e(j3, j) + gVarC.b(j3);
        long jU2 = gVarC2.u();
        long jB2 = gVarC2.b(jU2);
        long j7 = this.f12868f;
        if (jE == jB2) {
            jL = (jL2 - jU2) + j7;
        } else {
            if (jE < jB2) {
                throw new C0756b();
            }
            if (jB2 < jB) {
                jL = j7 - (gVarC2.l(jB, j) - jU);
            } else {
                jL2 = gVarC.l(jB2, j);
                jL = (jL2 - jU2) + j7;
            }
        }
        return new h(j, mVar, this.f12865c, this.f12863a, jL, gVarC2);
    }

    public final long b(long j) {
        g gVar = this.f12866d;
        long j3 = this.f12867e;
        return (gVar.w(j3, j) + (gVar.f(j3, j) + this.f12868f)) - 1;
    }

    public final long c(long j) {
        return this.f12866d.e(j - this.f12868f, this.f12867e) + d(j);
    }

    public final long d(long j) {
        return this.f12866d.b(j - this.f12868f);
    }
}
