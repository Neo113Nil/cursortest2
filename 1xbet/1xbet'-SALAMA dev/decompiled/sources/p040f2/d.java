package p040f2;

import A1.C0014d0;
import A1.C0022h0;
import A1.P0;
import A1.Q0;
import A1.R0;
import g2.c;
import g2.h;
import g2.m;
import java.util.List;
import p024d2.b;
import p151v2.a;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class d extends R0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0022h0 f12819A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0014d0 f12820B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12825f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f12826x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f12827y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c f12828z;

    public d(long j, long j3, long j7, int i7, long j8, long j9, long j10, c cVar, C0022h0 c0022h0, C0014d0 c0014d0) {
        a.h(cVar.f13118d == (c0014d0 != null));
        this.f12821b = j;
        this.f12822c = j3;
        this.f12823d = j7;
        this.f12824e = i7;
        this.f12825f = j8;
        this.f12826x = j9;
        this.f12827y = j10;
        this.f12828z = cVar;
        this.f12819A = c0022h0;
        this.f12820B = c0014d0;
    }

    @Override // A1.R0
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f12824e) >= 0 && iIntValue < h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // A1.R0
    public final P0 f(int i7, P0 p5, boolean z4) {
        a.g(i7, h());
        c cVar = this.f12828z;
        String str = z4 ? cVar.b(i7).f13148a : null;
        Integer numValueOf = z4 ? Integer.valueOf(this.f12824e + i7) : null;
        long jD = cVar.d(i7);
        long jE = t.E(cVar.b(i7).f13149b - cVar.b(0).f13149b) - this.f12825f;
        p5.getClass();
        p5.h(str, numValueOf, 0, jD, jE, b.f12387f, false);
        return p5;
    }

    @Override // A1.R0
    public final int h() {
        return this.f12828z.f13126m.size();
    }

    @Override // A1.R0
    public final Object l(int i7) {
        a.g(i7, h());
        return Integer.valueOf(this.f12824e + i7);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027 A[PHI: r7
      0x0027: PHI (r7v4 long) = (r7v0 long), (r7v1 long), (r7v1 long), (r7v1 long) binds: [B:11:0x0025, B:32:0x007c, B:35:0x0093, B:37:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x003d A[PHI: r7
      0x003d: PHI (r7v1 long) = (r7v0 long), (r7v2 long) binds: [B:14:0x002f, B:16:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[LOOP:1: B:25:0x0065->B:30:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x007c A[EDGE_INSN: B:53:0x007c->B:32:0x007c BREAK  A[LOOP:1: B:25:0x0065->B:30:0x0076], SYNTHETIC] */
    @Override // A1.R0
    public final Q0 m(int i7, Q0 q1, long j) {
        long j3;
        long jD;
        int i8;
        List list;
        int size;
        int i9;
        g gVarC;
        long jB;
        a.g(i7, 1);
        c cVar = this.f12828z;
        boolean z4 = cVar.f13118d && cVar.f13119e != -9223372036854775807L && cVar.f13116b == -9223372036854775807L;
        long j7 = this.f12827y;
        if (!z4) {
            jB = j7;
        } else if (j > 0) {
            j7 += j;
            if (j7 > this.f12826x) {
                jB = -9223372036854775807L;
            } else {
                j3 = this.f12825f + j7;
                jD = cVar.d(0);
                i8 = 0;
                while (i8 < cVar.f13126m.size() - 1 && j3 >= jD) {
                    j3 -= jD;
                    i8++;
                    jD = cVar.d(i8);
                }
                h hVarB = cVar.b(i8);
                list = hVarB.f13150c;
                size = list.size();
                i9 = 0;
                while (true) {
                    if (i9 < size) {
                        i9 = -1;
                        break;
                    }
                    if (((g2.a) list.get(i9)).f13106b == 2) {
                        break;
                    }
                    i9++;
                }
                if (i9 != -1 || (gVarC = ((m) ((g2.a) hVarB.f13150c.get(i9)).f13107c.get(0)).c()) == null || gVarC.v(jD) == 0) {
                    jB = j7;
                } else {
                    jB = (gVarC.b(gVarC.l(j3, jD)) + j7) - j3;
                }
            }
        } else {
            j3 = this.f12825f + j7;
            jD = cVar.d(0);
            i8 = 0;
            while (i8 < cVar.f13126m.size() - 1) {
                j3 -= jD;
                i8++;
                jD = cVar.d(i8);
            }
            h hVarB2 = cVar.b(i8);
            list = hVarB2.f13150c;
            size = list.size();
            i9 = 0;
            while (true) {
                if (i9 < size) {
                    i9 = -1;
                    break;
                }
                if (((g2.a) list.get(i9)).f13106b == 2) {
                    break;
                    break;
                }
                i9++;
            }
            if (i9 != -1) {
                jB = j7;
            } else {
                jB = (gVarC.b(gVarC.l(j3, jD)) + j7) - j3;
            }
        }
        q1.b(Q0.f200I, this.f12819A, cVar, this.f12821b, this.f12822c, this.f12823d, true, cVar.f13118d && cVar.f13119e != -9223372036854775807L && cVar.f13116b == -9223372036854775807L, this.f12820B, jB, this.f12826x, 0, h() - 1, this.f12825f);
        return q1;
    }

    @Override // A1.R0
    public final int o() {
        return 1;
    }
}
