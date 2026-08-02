package H0;

import A0.J0;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import h0.C1989c;
import java.util.List;
import r.AbstractC2334l;
import r.C2321G;
import r.C2343v;
import x0.f0;
import z0.AbstractC2749f;
import z0.AbstractC2756m;
import z0.C2731G;
import z0.e0;
import z0.v0;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C1989c f2123a = new C1989c(0.0f, 0.0f, 10.0f, 10.0f);

    public static final n a(C2731G c2731g, boolean z3) {
        b0.o oVar = c2731g.f21612O.f;
        Object obj = null;
        if ((oVar.f7165n & 8) != 0) {
            loop0: while (true) {
                if (oVar == null) {
                    break;
                }
                if ((oVar.f7164m & 8) != 0) {
                    b0.o oVar2 = oVar;
                    R.e eVar = null;
                    while (oVar2 != null) {
                        if (oVar2 instanceof v0) {
                            obj = oVar2;
                            break loop0;
                        }
                        if ((oVar2.f7164m & 8) != 0 && (oVar2 instanceof AbstractC2756m)) {
                            int i = 0;
                            for (b0.o oVar3 = ((AbstractC2756m) oVar2).f21839z; oVar3 != null; oVar3 = oVar3.f7167p) {
                                if ((oVar3.f7164m & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        oVar2 = oVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new R.e(new b0.o[16]);
                                        }
                                        if (oVar2 != null) {
                                            eVar.c(oVar2);
                                            oVar2 = null;
                                        }
                                        eVar.c(oVar3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        oVar2 = AbstractC2749f.f(eVar);
                    }
                }
                if ((oVar.f7165n & 8) == 0) {
                    break;
                }
                oVar = oVar.f7167p;
            }
        }
        kotlin.jvm.internal.l.c(obj);
        b0.o oVar4 = ((b0.o) ((v0) obj)).f7162k;
        j w5 = c2731g.w();
        if (w5 == null) {
            w5 = new j();
        }
        return new n(oVar4, z3, c2731g, w5);
    }

    public static final C2343v b(p pVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            n a5 = pVar.a();
            C2731G c2731g = a5.f2113c;
            if (c2731g.J() && c2731g.I()) {
                C2343v c2343v = new C2343v(48);
                J0 j02 = new J0(7);
                W0.k N5 = N4.b.N(a5.g());
                ((Region) j02.f304k).set(N5.f6011a, N5.f6012b, N5.f6013c, N5.f6014d);
                c(j02, a5, c2343v, a5, new J0(7));
                return c2343v;
            }
            C2343v c2343v2 = AbstractC2334l.f19016a;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>", c2343v2);
            return c2343v2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(J0 j02, n nVar, C2343v c2343v, n nVar2, J0 j03) {
        C1989c e1;
        C2731G c2731g;
        boolean J = nVar2.f2113c.J();
        C2731G c2731g2 = nVar2.f2113c;
        boolean z3 = (J && c2731g2.I()) ? false : true;
        Region region = (Region) j02.f304k;
        boolean isEmpty = region.isEmpty();
        int i = nVar.f2116g;
        int i5 = nVar2.f2116g;
        if (!isEmpty || i5 == i) {
            if (!z3 || nVar2.f2115e) {
                Object f = nVar2.f();
                if (f == null) {
                    e1 = c2731g2.f21612O.f21768c.e1();
                } else {
                    b0.o oVar = ((b0.o) f).f7162k;
                    Object g5 = nVar2.f2114d.f2103k.g(i.f2080b);
                    if (g5 == null) {
                        g5 = null;
                    }
                    boolean z5 = g5 != null;
                    if (!oVar.f7162k.f7175x) {
                        e1 = C1989c.f17192e;
                    } else if (z5) {
                        e1 = AbstractC2749f.t(oVar, 8).e1();
                    } else {
                        e0 t5 = AbstractC2749f.t(oVar, 8);
                        e1 = f0.h(t5).s(t5, true);
                    }
                }
                W0.k N5 = N4.b.N(e1);
                Region region2 = (Region) j03.f304k;
                region2.set(N5.f6011a, N5.f6012b, N5.f6013c, N5.f6014d);
                if (i5 == i) {
                    i5 = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (nVar2.f2115e) {
                        n l5 = nVar2.l();
                        c2343v.g(i5, new o(nVar2, N4.b.N((l5 == null || (c2731g = l5.f2113c) == null || !c2731g.J()) ? f2123a : l5.g())));
                        return;
                    } else {
                        if (i5 == -1) {
                            Rect bounds = region2.getBounds();
                            c2343v.g(i5, new o(nVar2, new W0.k(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region2.getBounds();
                c2343v.g(i5, new o(nVar2, new W0.k(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List j5 = n.j(4, nVar2);
                for (int size = j5.size() - 1; -1 < size; size--) {
                    if (!((n) j5.get(size)).k().f2103k.c(s.f2180z)) {
                        c(j02, nVar, c2343v, (n) j5.get(size), j03);
                    }
                }
                if (f(nVar2)) {
                    region.op(N5.f6011a, N5.f6012b, N5.f6013c, N5.f6014d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Object d(j jVar, v vVar) {
        Object g5 = jVar.f2103k.g(vVar);
        if (g5 == null) {
            return null;
        }
        return g5;
    }

    public static final boolean e(n nVar) {
        e0 d5 = nVar.d();
        if (d5 != null ? d5.Q0() : false) {
            return true;
        }
        v vVar = s.f2157a;
        v vVar2 = s.f2170p;
        j jVar = nVar.f2114d;
        if (jVar.f2103k.c(vVar2)) {
            return true;
        }
        return jVar.f2103k.c(s.f2169o);
    }

    public static final boolean f(n nVar) {
        if (!e(nVar)) {
            j jVar = nVar.f2114d;
            if (jVar.f2105m) {
                return true;
            }
            C2321G c2321g = jVar.f2103k;
            Object[] objArr = c2321g.f18929b;
            Object[] objArr2 = c2321g.f18930c;
            long[] jArr = c2321g.f18928a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j5 = jArr[i];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i - length)) >>> 31);
                        for (int i6 = 0; i6 < i5; i6++) {
                            if ((255 & j5) < 128) {
                                int i7 = (i << 3) + i6;
                                Object obj = objArr[i7];
                                Object obj2 = objArr2[i7];
                                if (((v) obj).f2186c) {
                                    return true;
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i5 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }
}
