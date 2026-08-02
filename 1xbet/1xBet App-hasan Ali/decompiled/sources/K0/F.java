package K0;

import java.util.ArrayList;
import java.util.List;
import k0.AbstractC2024d;
import k0.C2027g;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final v3.g f2761a = new v3.g(13, new A(22), new C0204i(24));

    /* renamed from: b, reason: collision with root package name */
    public static final v3.g f2762b = new v3.g(13, new A(23), new C0204i(25));

    /* renamed from: c, reason: collision with root package name */
    public static final v3.g f2763c = new v3.g(13, new A(24), new C0204i(26));

    public static C0197b a(String str, O o5, long j5, W0.c cVar, O0.d dVar, int i, int i5) {
        X3.v vVar = X3.v.f6090k;
        return new C0197b(new S0.d(str, o5, vVar, vVar, dVar, cVar), i, 1, j5);
    }

    public static final long b(int i, int i5) {
        if (i < 0 || i5 < 0) {
            Q0.a.a("start and end cannot be negative. [start: " + i + ", end: " + i5 + ']');
        }
        long j5 = (i5 & 4294967295L) | (i << 32);
        int i6 = N.f2802c;
        return j5;
    }

    public static final long c(int i, long j5) {
        int i5 = N.f2802c;
        int i6 = (int) (j5 >> 32);
        int i7 = i6 < 0 ? 0 : i6;
        if (i7 > i) {
            i7 = i;
        }
        int i8 = (int) (4294967295L & j5);
        int i9 = i8 >= 0 ? i8 : 0;
        if (i9 <= i) {
            i = i9;
        }
        return (i7 == i6 && i == i8) ? j5 : b(i7, i);
    }

    public static final int d(int i, List list) {
        int i5;
        int i6 = ((t) X3.m.e0(list)).f2864c;
        if (i > ((t) X3.m.e0(list)).f2864c) {
            Q0.a.a("Index " + i + " should be less or equal than last line's end " + i6);
        }
        int size = list.size() - 1;
        int i7 = 0;
        while (true) {
            if (i7 > size) {
                i5 = -(i7 + 1);
                break;
            }
            i5 = (i7 + size) >>> 1;
            t tVar = (t) list.get(i5);
            char c5 = tVar.f2863b > i ? (char) 1 : tVar.f2864c <= i ? (char) 65535 : (char) 0;
            if (c5 >= 0) {
                if (c5 <= 0) {
                    break;
                }
                size = i5 - 1;
            } else {
                i7 = i5 + 1;
            }
        }
        if (i5 >= 0 && i5 < list.size()) {
            return i5;
        }
        StringBuilder v4 = AbstractC2107A.v(i5, "Found paragraph index ", " should be in range [0, ");
        v4.append(list.size());
        v4.append(").\nDebug info: index=");
        v4.append(i);
        v4.append(", paragraphs=[");
        v4.append(Y0.a.a(list, null, new C0204i(1), 31));
        v4.append(']');
        Q0.a.a(v4.toString());
        return i5;
    }

    public static final int e(int i, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) >>> 1;
            t tVar = (t) arrayList.get(i6);
            char c5 = tVar.f2865d > i ? (char) 1 : tVar.f2866e <= i ? (char) 65535 : (char) 0;
            if (c5 < 0) {
                i5 = i6 + 1;
            } else {
                if (c5 <= 0) {
                    return i6;
                }
                size = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    public static final int f(ArrayList arrayList, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((t) X3.m.e0(arrayList)).f2867g) {
            return X3.n.N(arrayList);
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i5 = (i + size) >>> 1;
            t tVar = (t) arrayList.get(i5);
            char c5 = tVar.f > f ? (char) 1 : tVar.f2867g <= f ? (char) 65535 : (char) 0;
            if (c5 < 0) {
                i = i5 + 1;
            } else {
                if (c5 <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void g(ArrayList arrayList, long j5, i4.c cVar) {
        int size = arrayList.size();
        for (int d5 = d(N.e(j5), arrayList); d5 < size; d5++) {
            t tVar = (t) arrayList.get(d5);
            if (tVar.f2863b >= N.d(j5)) {
                return;
            }
            if (tVar.f2863b != tVar.f2864c) {
                cVar.c(tVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final O h(O o5, W0.m mVar) {
        long j5;
        V0.q qVar;
        int i;
        V0.s sVar;
        G g5 = o5.f2805a;
        V0.o oVar = H.f2780d;
        V0.o c5 = g5.f2764a.c(new B1.h(3));
        W0.p[] pVarArr = W0.o.f6020b;
        long j6 = g5.f2765b;
        if ((j6 & 1095216660480L) == 0) {
            j6 = H.f2777a;
        }
        long j7 = j6;
        O0.l lVar = g5.f2766c;
        if (lVar == null) {
            lVar = O0.l.f4027m;
        }
        O0.l lVar2 = lVar;
        O0.j jVar = g5.f2767d;
        O0.j jVar2 = new O0.j(jVar != null ? jVar.f4024a : 0);
        O0.k kVar = g5.f2768e;
        O0.k kVar2 = new O0.k(kVar != null ? kVar.f4025a : 65535);
        O0.o oVar2 = g5.f;
        if (oVar2 == null) {
            oVar2 = O0.o.f4035a;
        }
        O0.o oVar3 = oVar2;
        String str = g5.f2769g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j8 = g5.f2770h;
        if ((j8 & 1095216660480L) == 0) {
            j8 = H.f2778b;
        }
        long j9 = j8;
        V0.a aVar = g5.i;
        V0.a aVar2 = new V0.a(aVar != null ? aVar.f5925a : 0.0f);
        V0.p pVar = g5.f2771j;
        if (pVar == null) {
            pVar = V0.p.f5950c;
        }
        V0.p pVar2 = pVar;
        R0.b bVar = g5.f2772k;
        if (bVar == null) {
            R0.b bVar2 = R0.b.f5121m;
            bVar = R0.d.f5124a.b();
        }
        R0.b bVar3 = bVar;
        long j10 = g5.f2773l;
        if (j10 == 16) {
            j10 = H.f2779c;
        }
        long j11 = j10;
        V0.l lVar3 = g5.f2774m;
        if (lVar3 == null) {
            lVar3 = V0.l.f5944b;
        }
        V0.l lVar4 = lVar3;
        i0.I i5 = g5.f2775n;
        if (i5 == null) {
            i5 = i0.I.f17244d;
        }
        i0.I i6 = i5;
        AbstractC2024d abstractC2024d = g5.f2776o;
        if (abstractC2024d == null) {
            abstractC2024d = C2027g.f17547b;
        }
        G g6 = new G(c5, j7, lVar2, jVar2, kVar2, oVar3, str2, j9, aVar2, pVar2, bVar3, j11, lVar4, i6, null, abstractC2024d);
        int i7 = x.f2879b;
        w wVar = o5.f2806b;
        int i8 = wVar.f2871a;
        int i9 = 5;
        int i10 = i8 == Integer.MIN_VALUE ? 5 : i8;
        int i11 = wVar.f2872b;
        if (i11 != 3) {
            if (i11 == Integer.MIN_VALUE) {
                int ordinal = mVar.ordinal();
                if (ordinal == 0) {
                    i11 = 1;
                } else {
                    if (ordinal != 1) {
                        throw new D2.e();
                    }
                    i9 = 2;
                }
            }
            j5 = wVar.f2873c;
            if ((j5 & 1095216660480L) == 0) {
                j5 = x.f2878a;
            }
            long j12 = j5;
            qVar = wVar.f2874d;
            if (qVar == null) {
                qVar = V0.q.f5953c;
            }
            V0.q qVar2 = qVar;
            i = wVar.f2876g;
            if (i == 0) {
                i = V0.e.f5930b;
            }
            int i12 = i;
            int i13 = wVar.f2877h;
            int i14 = i13 != Integer.MIN_VALUE ? 1 : i13;
            sVar = wVar.i;
            if (sVar == null) {
                sVar = V0.s.f5957c;
            }
            return new O(g6, new w(i10, i11, j12, qVar2, wVar.f2875e, wVar.f, i12, i14, sVar), o5.f2807c);
        }
        int ordinal2 = mVar.ordinal();
        if (ordinal2 == 0) {
            i9 = 4;
        } else if (ordinal2 != 1) {
            throw new D2.e();
        }
        i11 = i9;
        j5 = wVar.f2873c;
        if ((j5 & 1095216660480L) == 0) {
        }
        long j122 = j5;
        qVar = wVar.f2874d;
        if (qVar == null) {
        }
        V0.q qVar22 = qVar;
        i = wVar.f2876g;
        if (i == 0) {
        }
        int i122 = i;
        int i132 = wVar.f2877h;
        if (i132 != Integer.MIN_VALUE) {
        }
        sVar = wVar.i;
        if (sVar == null) {
        }
        return new O(g6, new w(i10, i11, j122, qVar22, wVar.f2875e, wVar.f, i122, i14, sVar), o5.f2807c);
    }
}
