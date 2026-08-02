package K0;

import a.AbstractC0444a;
import k0.AbstractC2024d;
import k4.AbstractC2036a;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2777a = AbstractC2036a.H(14);

    /* renamed from: b, reason: collision with root package name */
    public static final long f2778b = AbstractC2036a.H(0);

    /* renamed from: c, reason: collision with root package name */
    public static final long f2779c = i0.p.f;

    /* renamed from: d, reason: collision with root package name */
    public static final V0.o f2780d;

    static {
        long j5 = i0.p.f17289b;
        f2780d = j5 != 16 ? new V0.c(j5) : V0.n.f5949a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00bc, code lost:
    
        if (r15.equals(r24.i) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00cb, code lost:
    
        if (r39.equals(r24.f2771j) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00da, code lost:
    
        if (r40.equals(r24.f2772k) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final G a(G g5, long j5, i0.F f, float f5, long j6, O0.l lVar, O0.j jVar, O0.k kVar, O0.o oVar, String str, long j7, V0.a aVar, V0.p pVar, R0.b bVar, long j8, V0.l lVar2, i0.I i, F f6, AbstractC2024d abstractC2024d) {
        V0.a aVar2;
        long j9;
        i0.I i5;
        AbstractC2024d abstractC2024d2;
        O0.j jVar2 = jVar;
        O0.k kVar2 = kVar;
        O0.o oVar2 = oVar;
        String str2 = str;
        long j10 = j7;
        W0.p[] pVarArr = W0.o.f6020b;
        long j11 = j6 & 1095216660480L;
        if (((j11 == 0) || W0.o.a(j6, g5.f2765b)) && ((f != null || j5 == 16 || i0.p.c(j5, g5.f2764a.b())) && ((jVar2 == null || jVar2.equals(g5.f2767d)) && ((lVar == null || lVar.equals(g5.f2766c)) && ((oVar2 == null || oVar2 == g5.f) && (((j10 & 1095216660480L) == 0 || W0.o.a(j10, g5.f2770h)) && ((lVar2 == null || lVar2.equals(g5.f2774m)) && kotlin.jvm.internal.l.a(f, g5.f2764a.d()) && ((f == null || f5 == g5.f2764a.a()) && ((kVar2 == null || kVar2.equals(g5.f2768e)) && (str2 == null || str2.equals(g5.f2769g))))))))))) {
            if (aVar != null) {
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
            }
            if (pVar == null) {
            }
            if (bVar == null) {
            }
            j9 = j8;
            if (j9 == 16 || i0.p.c(j9, g5.f2773l)) {
                i5 = i;
                if (i5 == null || i5.equals(g5.f2775n)) {
                    abstractC2024d2 = abstractC2024d;
                    if (abstractC2024d2 == null || abstractC2024d2.equals(g5.f2776o)) {
                        return g5;
                    }
                    V0.o oVar3 = V0.n.f5949a;
                    if (f == null) {
                        if (f instanceof i0.M) {
                            long T4 = AbstractC0444a.T(f5, ((i0.M) f).f17262e);
                            if (T4 != 16) {
                                oVar3 = new V0.c(T4);
                            }
                        } else {
                            if (!(f instanceof i0.H)) {
                                throw new D2.e();
                            }
                            oVar3 = new V0.b((i0.H) f, f5);
                        }
                    } else if (j5 != 16) {
                        oVar3 = new V0.c(j5);
                    }
                    V0.o e3 = g5.f2764a.e(oVar3);
                    if (oVar2 == null) {
                        oVar2 = g5.f;
                    }
                    long j12 = j11 != 0 ? g5.f2765b : j6;
                    O0.l lVar3 = lVar != null ? g5.f2766c : lVar;
                    if (jVar2 == null) {
                        jVar2 = g5.f2767d;
                    }
                    if (kVar2 == null) {
                        kVar2 = g5.f2768e;
                    }
                    if (str2 == null) {
                        str2 = g5.f2769g;
                    }
                    if ((j10 & 1095216660480L) == 0) {
                        j10 = g5.f2770h;
                    }
                    if (aVar2 == null) {
                        aVar2 = g5.i;
                    }
                    V0.p pVar2 = pVar != null ? g5.f2771j : pVar;
                    R0.b bVar2 = bVar != null ? g5.f2772k : bVar;
                    if (j9 == 16) {
                        j9 = g5.f2773l;
                    }
                    R0.b bVar3 = bVar2;
                    V0.l lVar4 = lVar2 != null ? g5.f2774m : lVar2;
                    if (i5 == null) {
                        i5 = g5.f2775n;
                    }
                    return new G(e3, j12, lVar3, jVar2, kVar2, oVar2, str2, j10, aVar2, pVar2, bVar3, j9, lVar4, i5, f6, abstractC2024d2 != null ? g5.f2776o : abstractC2024d2);
                }
                abstractC2024d2 = abstractC2024d;
                V0.o oVar32 = V0.n.f5949a;
                if (f == null) {
                }
                V0.o e32 = g5.f2764a.e(oVar32);
                if (oVar2 == null) {
                }
                if (j11 != 0) {
                }
                if (lVar != null) {
                }
                if (jVar2 == null) {
                }
                if (kVar2 == null) {
                }
                if (str2 == null) {
                }
                if ((j10 & 1095216660480L) == 0) {
                }
                if (aVar2 == null) {
                }
                V0.p pVar22 = pVar != null ? g5.f2771j : pVar;
                if (bVar != null) {
                }
                if (j9 == 16) {
                }
                R0.b bVar32 = bVar2;
                if (lVar2 != null) {
                }
                if (i5 == null) {
                }
                return new G(e32, j12, lVar3, jVar2, kVar2, oVar2, str2, j10, aVar2, pVar22, bVar32, j9, lVar4, i5, f6, abstractC2024d2 != null ? g5.f2776o : abstractC2024d2);
            }
            i5 = i;
            abstractC2024d2 = abstractC2024d;
            V0.o oVar322 = V0.n.f5949a;
            if (f == null) {
            }
            V0.o e322 = g5.f2764a.e(oVar322);
            if (oVar2 == null) {
            }
            if (j11 != 0) {
            }
            if (lVar != null) {
            }
            if (jVar2 == null) {
            }
            if (kVar2 == null) {
            }
            if (str2 == null) {
            }
            if ((j10 & 1095216660480L) == 0) {
            }
            if (aVar2 == null) {
            }
            V0.p pVar222 = pVar != null ? g5.f2771j : pVar;
            if (bVar != null) {
            }
            if (j9 == 16) {
            }
            R0.b bVar322 = bVar2;
            if (lVar2 != null) {
            }
            if (i5 == null) {
            }
            return new G(e322, j12, lVar3, jVar2, kVar2, oVar2, str2, j10, aVar2, pVar222, bVar322, j9, lVar4, i5, f6, abstractC2024d2 != null ? g5.f2776o : abstractC2024d2);
        }
        aVar2 = aVar;
        j9 = j8;
        i5 = i;
        abstractC2024d2 = abstractC2024d;
        V0.o oVar3222 = V0.n.f5949a;
        if (f == null) {
        }
        V0.o e3222 = g5.f2764a.e(oVar3222);
        if (oVar2 == null) {
        }
        if (j11 != 0) {
        }
        if (lVar != null) {
        }
        if (jVar2 == null) {
        }
        if (kVar2 == null) {
        }
        if (str2 == null) {
        }
        if ((j10 & 1095216660480L) == 0) {
        }
        if (aVar2 == null) {
        }
        V0.p pVar2222 = pVar != null ? g5.f2771j : pVar;
        if (bVar != null) {
        }
        if (j9 == 16) {
        }
        R0.b bVar3222 = bVar2;
        if (lVar2 != null) {
        }
        if (i5 == null) {
        }
        return new G(e3222, j12, lVar3, jVar2, kVar2, oVar2, str2, j10, aVar2, pVar2222, bVar3222, j9, lVar4, i5, f6, abstractC2024d2 != null ? g5.f2776o : abstractC2024d2);
    }
}
