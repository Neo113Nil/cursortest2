package O1;

import A1.C0045t0;
import A1.X;
import C1.C0095a;
import E4.y;
import F1.m;
import F1.s;
import F1.v;
import F1.z;
import java.util.Arrays;
import v2.AbstractC1664a;
import v2.t;
import w1.C1722m0;
import w1.P2;

/* loaded from: classes.dex */
public final class e implements F1.k {

    /* renamed from: a, reason: collision with root package name */
    public m f4939a;

    /* renamed from: b, reason: collision with root package name */
    public j f4940b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4941c;

    @Override // F1.k
    public final boolean a(F1.l lVar) {
        try {
            return b((F1.h) lVar);
        } catch (C0045t0 unused) {
            return false;
        }
    }

    public final boolean b(F1.h hVar) {
        boolean z4;
        g gVar = new g();
        if (gVar.a(hVar, true) && (gVar.f4947a & 2) == 2) {
            int min = Math.min(gVar.f4951e, 8);
            C0095a c0095a = new C0095a(min);
            hVar.c((byte[]) c0095a.f1465c, 0, min, false);
            c0095a.D(0);
            if (c0095a.d() >= 5 && c0095a.t() == 127 && c0095a.u() == 1179402563) {
                this.f4940b = new d();
            } else {
                c0095a.D(0);
                try {
                    z4 = z.d(1, c0095a, true);
                } catch (C0045t0 unused) {
                    z4 = false;
                }
                if (z4) {
                    this.f4940b = new l();
                } else {
                    c0095a.D(0);
                    if (i.e(c0095a, i.f4954o)) {
                        this.f4940b = new i();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // F1.k
    public final void e(m mVar) {
        this.f4939a = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x018a  */
    @Override // F1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(F1.l lVar, y yVar) {
        int i7;
        C0095a c0095a;
        byte[] bArr;
        AbstractC1664a.i(this.f4939a);
        if (this.f4940b == null) {
            F1.h hVar = (F1.h) lVar;
            if (!b(hVar)) {
                throw C0045t0.a(null, "Failed to determine bitstream type");
            }
            hVar.f2536f = 0;
        }
        if (!this.f4941c) {
            v r7 = this.f4939a.r(0, 1);
            this.f4939a.n();
            j jVar = this.f4940b;
            jVar.f4959c = this.f4939a;
            jVar.f4958b = r7;
            jVar.d(true);
            this.f4941c = true;
        }
        j jVar2 = this.f4940b;
        AbstractC1664a.i(jVar2.f4958b);
        int i8 = t.f17153a;
        int i9 = jVar2.f4964h;
        f fVar = jVar2.f4957a;
        if (i9 == 0) {
            while (true) {
                F1.h hVar2 = (F1.h) lVar;
                if (!fVar.c(hVar2)) {
                    jVar2.f4964h = 3;
                    break;
                }
                long j = hVar2.f2534d;
                long j3 = jVar2.f4962f;
                jVar2.f4966k = j - j3;
                P2 p22 = jVar2.j;
                C0095a c0095a2 = (C0095a) fVar.f4946e;
                if (!jVar2.c(c0095a2, j3, p22)) {
                    X x4 = (X) jVar2.j.f17508b;
                    jVar2.f4965i = x4.f297Q;
                    if (!jVar2.f4968m) {
                        jVar2.f4958b.a(x4);
                        jVar2.f4968m = true;
                    }
                    c cVar = (c) jVar2.j.f17509c;
                    if (cVar != null) {
                        jVar2.f4960d = cVar;
                    } else {
                        long j7 = ((F1.h) lVar).f2533c;
                        if (j7 != -1) {
                            g gVar = (g) fVar.f4945d;
                            i7 = 2;
                            c0095a = c0095a2;
                            jVar2.f4960d = new b(jVar2, jVar2.f4962f, j7, gVar.f4950d + gVar.f4951e, gVar.f4948b, (gVar.f4947a & 4) != 0);
                            jVar2.f4964h = i7;
                            C0095a c0095a3 = c0095a;
                            bArr = (byte[]) c0095a3.f1465c;
                            if (bArr.length != 65025) {
                                c0095a3.B(c0095a3.f1464b, Arrays.copyOf(bArr, Math.max(65025, c0095a3.f1464b)));
                            }
                            return 0;
                        }
                        jVar2.f4960d = new C1722m0(7);
                    }
                    i7 = 2;
                    c0095a = c0095a2;
                    jVar2.f4964h = i7;
                    C0095a c0095a32 = c0095a;
                    bArr = (byte[]) c0095a32.f1465c;
                    if (bArr.length != 65025) {
                    }
                    return 0;
                }
                jVar2.f4962f = ((F1.h) lVar).f2534d;
            }
        } else {
            if (i9 == 1) {
                ((F1.h) lVar).q((int) jVar2.f4962f);
                jVar2.f4964h = 2;
                return 0;
            }
            if (i9 == 2) {
                F1.h hVar3 = (F1.h) lVar;
                long b7 = jVar2.f4960d.b(hVar3);
                if (b7 >= 0) {
                    yVar.f2247a = b7;
                    return 1;
                }
                if (b7 < -1) {
                    jVar2.a(-(b7 + 2));
                }
                if (!jVar2.f4967l) {
                    s e7 = jVar2.f4960d.e();
                    AbstractC1664a.i(e7);
                    jVar2.f4959c.m(e7);
                    jVar2.f4967l = true;
                }
                if (jVar2.f4966k > 0 || fVar.c(hVar3)) {
                    jVar2.f4966k = 0L;
                    C0095a c0095a4 = (C0095a) fVar.f4946e;
                    long b8 = jVar2.b(c0095a4);
                    if (b8 >= 0) {
                        long j8 = jVar2.f4963g;
                        if (j8 + b8 >= jVar2.f4961e) {
                            jVar2.f4958b.c(c0095a4.f1464b, c0095a4);
                            jVar2.f4958b.e((j8 * 1000000) / jVar2.f4965i, 1, c0095a4.f1464b, 0, null);
                            jVar2.f4961e = -1L;
                        }
                    }
                    jVar2.f4963g += b8;
                    return 0;
                }
                jVar2.f4964h = 3;
            } else if (i9 != 3) {
                throw new IllegalStateException();
            }
        }
        return -1;
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        j jVar = this.f4940b;
        if (jVar != null) {
            f fVar = jVar.f4957a;
            g gVar = (g) fVar.f4945d;
            gVar.f4947a = 0;
            gVar.f4948b = 0L;
            gVar.f4949c = 0;
            gVar.f4950d = 0;
            gVar.f4951e = 0;
            ((C0095a) fVar.f4946e).A(0);
            fVar.f4942a = -1;
            fVar.f4944c = false;
            if (j == 0) {
                jVar.d(!jVar.f4967l);
                return;
            }
            if (jVar.f4964h != 0) {
                long j7 = (jVar.f4965i * j3) / 1000000;
                jVar.f4961e = j7;
                h hVar = jVar.f4960d;
                int i7 = t.f17153a;
                hVar.f(j7);
                jVar.f4964h = 2;
            }
        }
    }

    @Override // F1.k
    public final void release() {
    }
}
