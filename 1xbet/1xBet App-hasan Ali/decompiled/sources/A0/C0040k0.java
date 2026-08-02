package A0;

import L.C0213a;
import L.C0214b;
import P.C0299j0;
import android.content.Context;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.internal.ads.C1639u7;
import g0.AbstractC1961f;
import h0.C1988b;
import i4.InterfaceC2015a;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import o0.C2195B;
import o4.AbstractC2227e;
import o4.AbstractC2234l;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import r0.AbstractC2346c;
import s0.C2355d;
import s0.C2358g;
import t3.AbstractC2425d;
import u.AbstractC2453d;
import u.C2452c0;
import u.C2467n;
import v.C2503A;
import w0.AbstractC2540a;
import x0.InterfaceC2637x;
import z0.AbstractC2749f;
import z0.AbstractC2756m;
import z0.C2768z;

/* renamed from: A0.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040k0 extends kotlin.jvm.internal.m implements InterfaceC2015a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f524l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f525m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0040k0(int i, Object obj) {
        super(0);
        this.f524l = i;
        this.f525m = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0092, code lost:
    
        continue;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x043e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0424 A[Catch: all -> 0x03be, TRY_LEAVE, TryCatch #13 {all -> 0x03be, blocks: (B:174:0x0276, B:176:0x0284, B:177:0x028d, B:196:0x02ec, B:198:0x02f7, B:249:0x03bd, B:259:0x03b4, B:261:0x03c2, B:288:0x0424, B:295:0x044b, B:298:0x041e, B:182:0x0458, B:186:0x046e, B:187:0x0475, B:316:0x0476, B:317:0x0479, B:319:0x047a, B:320:0x048f, B:179:0x0295, B:189:0x02a0, B:195:0x02ca, B:310:0x044e, B:311:0x0453, B:255:0x03af, B:285:0x0419, B:200:0x02ff, B:202:0x0308, B:205:0x031a, B:221:0x039e, B:239:0x0397, B:241:0x03a2, B:242:0x03a7), top: B:173:0x0276, inners: #1, #5, #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x044b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0492 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:331:? A[SYNTHETIC] */
    @Override // i4.InterfaceC2015a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        ArrayList arrayList;
        long b3;
        long j5;
        ArrayList arrayList2;
        L4.C c5;
        Throwable th;
        W3.h hVar;
        Throwable th2;
        Throwable th3;
        int k5;
        W3.h hVar2;
        InterfaceC2637x parentLayoutCoordinates;
        boolean z3 = false;
        W3.o oVar = W3.o.f6046a;
        int i = 1;
        Object obj = this.f525m;
        switch (this.f524l) {
            case 0:
                AbstractC2282w.d(((C0046m0) obj).f535m, null);
                return oVar;
            case 1:
                ((C0048n0) obj).f539b = null;
                return oVar;
            case 2:
                return new B.J((Y.f) obj, X3.w.f6091k);
            case 3:
                ((w.m) obj).f20478a.setValue(w.j.f20476a);
                return oVar;
            case 4:
                return ((E.Z) obj).d();
            case 5:
                return new E.B0((x.P) obj, 0.0f);
            case 6:
                Object systemService = ((View) ((G.v) obj).f1749l).getContext().getSystemService("input_method");
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager", systemService);
                return (InputMethodManager) systemService;
            case 7:
                return new BaseInputConnection(((G.B) obj).f1688a, false);
            case 8:
                G1.E e3 = (G1.E) obj;
                e3.getClass();
                kotlin.jvm.internal.l.f("context", e3.f1827a);
                kotlin.jvm.internal.l.f("navigatorProvider", e3.f1846v);
                return new G1.F();
            case 9:
                return new G1.v((String) obj);
            case 10:
                H.g gVar = (H.g) obj;
                gVar.f2059I = null;
                AbstractC2749f.o(gVar);
                AbstractC2749f.n(gVar);
                AbstractC2749f.m(gVar);
                return Boolean.TRUE;
            case 11:
                return AbstractC2346c.d((Context) obj);
            case 12:
                C2467n c2467n = I.G.f2401a;
                return new C1988b(((C1988b) ((P.d1) obj).getValue()).f17191a);
            case 13:
                I0.a aVar = (I0.a) obj;
                aVar.f2557g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    aVar.b();
                    return oVar;
                } finally {
                    Trace.endSection();
                }
            case 14:
                return new I2.a(0, (I2.b) obj);
            case 15:
                ((C0213a) obj).f2918t.setValue(Boolean.valueOf(!((Boolean) r9.f2918t.getValue()).booleanValue()));
                return oVar;
            case 16:
                AbstractC2749f.m((C0214b) obj);
                return oVar;
            case 17:
                M4.f fVar = (M4.f) obj;
                ClassLoader classLoader = fVar.f3632b;
                Enumeration<URL> resources = classLoader.getResources("");
                kotlin.jvm.internal.l.e("getResources(...)", resources);
                ArrayList list = Collections.list(resources);
                kotlin.jvm.internal.l.e("list(...)", list);
                ArrayList arrayList3 = new ArrayList();
                int size = list.size();
                int i5 = 0;
                while (true) {
                    L4.o oVar2 = fVar.f3633c;
                    if (i5 >= size) {
                        int i6 = i;
                        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                        kotlin.jvm.internal.l.e("getResources(...)", resources2);
                        ArrayList list2 = Collections.list(resources2);
                        kotlin.jvm.internal.l.e("list(...)", list2);
                        ArrayList arrayList4 = new ArrayList();
                        int size2 = list2.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            int i8 = i7 + 1;
                            URL url = (URL) list2.get(i7);
                            kotlin.jvm.internal.l.c(url);
                            String url2 = url.toString();
                            kotlin.jvm.internal.l.e("toString(...)", url2);
                            if (AbstractC2234l.x0(url2, "jar:file:", z3)) {
                                int D02 = AbstractC2227e.D0(url2);
                                kotlin.jvm.internal.l.f("<this>", url2);
                                int lastIndexOf = url2.lastIndexOf("!", D02);
                                if (lastIndexOf != -1) {
                                    String str = L4.z.f3126l;
                                    String substring = url2.substring(4, lastIndexOf);
                                    kotlin.jvm.internal.l.e("substring(...)", substring);
                                    L4.z t5 = j3.i.t(new File(URI.create(substring)));
                                    L4.u g5 = oVar2.g(t5);
                                    try {
                                        arrayList = arrayList4;
                                        b3 = g5.b() - 22;
                                    } catch (Throwable th4) {
                                        if (g5 != null) {
                                        }
                                    }
                                    if (b3 < r3) {
                                        throw new IOException("not a zip: size=" + g5.b());
                                    }
                                    long max = Math.max(b3 - 65536, r3);
                                    while (true) {
                                        L4.C k6 = N4.b.k(g5.d(b3));
                                        try {
                                            j5 = r3;
                                            if (k6.k() == 101010256) {
                                                int n5 = k6.n() & 65535;
                                                int n6 = k6.n() & 65535;
                                                long n7 = k6.n() & 65535;
                                                if (n7 != (k6.n() & 65535) || n5 != 0 || n6 != 0) {
                                                    throw new IOException("unsupported zip: spanned");
                                                }
                                                k6.t(4L);
                                                int n8 = k6.n() & 65535;
                                                M4.d dVar = new M4.d(n8, n7, k6.k() & 4294967295L);
                                                k6.p(n8);
                                                k6.close();
                                                long j6 = b3 - 20;
                                                if (j6 > j5) {
                                                    k6 = N4.b.k(g5.d(j6));
                                                    try {
                                                        if (k6.k() == 117853008) {
                                                            int k7 = k6.k();
                                                            long l5 = k6.l();
                                                            if (k6.k() != i6 || k7 != 0) {
                                                                throw new IOException("unsupported zip: spanned");
                                                            }
                                                            k6 = N4.b.k(g5.d(l5));
                                                            try {
                                                                k5 = k6.k();
                                                            } catch (Throwable th5) {
                                                                try {
                                                                } catch (Throwable th6) {
                                                                    AbstractC2425d.j(th5, th6);
                                                                }
                                                                th3 = th5;
                                                            }
                                                            if (k5 != 101075792) {
                                                                throw new IOException("bad zip: expected " + M4.b.c(101075792) + " but was " + M4.b.c(k5));
                                                            }
                                                            k6.t(12L);
                                                            int k8 = k6.k();
                                                            int k9 = k6.k();
                                                            long l6 = k6.l();
                                                            if (l6 != k6.l() || k8 != 0 || k9 != 0) {
                                                                throw new IOException("unsupported zip: spanned");
                                                            }
                                                            k6.t(8L);
                                                            try {
                                                                th3 = null;
                                                            } catch (Throwable th7) {
                                                                th3 = th7;
                                                            }
                                                            dVar = new M4.d(n8, l6, k6.l());
                                                            if (th3 != null) {
                                                                throw th3;
                                                            }
                                                        }
                                                        try {
                                                            th2 = null;
                                                        } catch (Throwable th8) {
                                                            th2 = th8;
                                                        }
                                                    } catch (Throwable th9) {
                                                        try {
                                                        } catch (Throwable th10) {
                                                            AbstractC2425d.j(th9, th10);
                                                        }
                                                        th2 = th9;
                                                    }
                                                    if (th2 != null) {
                                                        throw th2;
                                                    }
                                                }
                                                M4.d dVar2 = dVar;
                                                ArrayList arrayList5 = new ArrayList();
                                                L4.C k10 = N4.b.k(g5.d(dVar2.f3627b));
                                                try {
                                                    long j7 = dVar2.f3626a;
                                                    long j8 = j5;
                                                    while (j8 < j7) {
                                                        M4.g d5 = M4.b.d(k10);
                                                        arrayList2 = list2;
                                                        c5 = k10;
                                                        try {
                                                            if (d5.f3641h >= dVar2.f3627b) {
                                                                throw new IOException("bad zip: local file header offset >= central directory offset");
                                                                break;
                                                            } else {
                                                                L4.z zVar = M4.f.f3631e;
                                                                if (j3.i.d(d5.f3635a)) {
                                                                    arrayList5.add(d5);
                                                                }
                                                                j8++;
                                                                k10 = c5;
                                                                list2 = arrayList2;
                                                            }
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                            Throwable th12 = th;
                                                            try {
                                                                c5.close();
                                                            } catch (Throwable th13) {
                                                                AbstractC2425d.j(th12, th13);
                                                            }
                                                            th = th12;
                                                            if (th == null) {
                                                            }
                                                        }
                                                    }
                                                    arrayList2 = list2;
                                                    try {
                                                        k10.close();
                                                        th = null;
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                    }
                                                } catch (Throwable th15) {
                                                    th = th15;
                                                    arrayList2 = list2;
                                                    c5 = k10;
                                                }
                                                if (th == null) {
                                                    throw th;
                                                }
                                                L4.L l7 = new L4.L(t5, oVar2, M4.b.b(arrayList5));
                                                try {
                                                    g5.close();
                                                } catch (Throwable unused) {
                                                }
                                                hVar = new W3.h(l7, M4.f.f3631e);
                                                if (g5 != null) {
                                                    throw th4;
                                                }
                                                try {
                                                    g5.close();
                                                    throw th4;
                                                } catch (Throwable th16) {
                                                    AbstractC2425d.j(th4, th16);
                                                    throw th4;
                                                }
                                            }
                                            ArrayList arrayList6 = list2;
                                            ArrayList arrayList7 = arrayList;
                                            k6.close();
                                            b3--;
                                            if (b3 < max) {
                                                throw new IOException("not a zip: end of central directory signature not found");
                                            }
                                            arrayList = arrayList7;
                                            r3 = j5;
                                            list2 = arrayList6;
                                            i6 = 1;
                                        } finally {
                                            k6.close();
                                        }
                                    }
                                    ArrayList arrayList8 = arrayList;
                                    if (hVar == null) {
                                        arrayList8.add(hVar);
                                    }
                                    arrayList4 = arrayList8;
                                    i7 = i8;
                                    r3 = j5;
                                    list2 = arrayList2;
                                    z3 = false;
                                    i6 = 1;
                                }
                            }
                            arrayList2 = list2;
                            j5 = r3;
                            arrayList = arrayList4;
                            hVar = null;
                            ArrayList arrayList82 = arrayList;
                            if (hVar == null) {
                            }
                            arrayList4 = arrayList82;
                            i7 = i8;
                            r3 = j5;
                            list2 = arrayList2;
                            z3 = false;
                            i6 = 1;
                        }
                        return X3.m.i0(arrayList3, arrayList4);
                    }
                    Object obj2 = list.get(i5);
                    i5 += i;
                    URL url3 = (URL) obj2;
                    kotlin.jvm.internal.l.c(url3);
                    int i9 = i;
                    if (kotlin.jvm.internal.l.a(url3.getProtocol(), "file")) {
                        String str2 = L4.z.f3126l;
                        hVar2 = new W3.h(oVar2, j3.i.t(new File(url3.toURI())));
                    } else {
                        hVar2 = null;
                    }
                    if (hVar2 != null) {
                        arrayList3.add(hVar2);
                    }
                    i = i9;
                }
                break;
            case 18:
                Object systemService2 = ((View) ((v3.e) obj).f20432l).getContext().getSystemService("input_method");
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager", systemService2);
                return (InputMethodManager) systemService2;
            case 19:
                return new BaseInputConnection(((P0.z) obj).f4689a, false);
            case 20:
                a1.w wVar = (a1.w) obj;
                parentLayoutCoordinates = wVar.getParentLayoutCoordinates();
                if (((parentLayoutCoordinates == null || !parentLayoutCoordinates.F()) ? null : parentLayoutCoordinates) != null && wVar.m8getPopupContentSizebOM6tXw() != null) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case C1639u7.zzm /* 21 */:
                ((g0.s) obj).z0();
                return oVar;
            case 22:
                C2195B c2195b = (C2195B) obj;
                int i10 = c2195b.f18508u;
                C0299j0 c0299j0 = c2195b.f18505r;
                if (i10 == c0299j0.h()) {
                    c0299j0.i(c0299j0.h() + 1);
                }
                return oVar;
            case 23:
                return ((C2355d) obj).f19161d;
            case 24:
                return ((C2358g) obj).y0();
            case 25:
                return Float.valueOf(AbstractC2453d.i(((InterfaceC2280u) obj).i()));
            case 26:
                C2452c0 c2452c0 = (C2452c0) obj;
                u.t0 t0Var = c2452c0.f19773e;
                c2452c0.f = t0Var != null ? ((Number) t0Var.f19946l.getValue()).longValue() : 0L;
                return oVar;
            case 27:
                return ((C2768z) obj).invoke();
            case 28:
                ((C2503A) obj).f20126F.invoke();
                return Boolean.TRUE;
            default:
                v.N n9 = (v.N) obj;
                b0.o oVar3 = n9.f7162k;
                R.e eVar = null;
                while (true) {
                    g0.l lVar = g0.l.f17038o;
                    if (oVar3 == null) {
                        if (!n9.f7162k.f7175x) {
                            AbstractC2540a.b("visitChildren called on an unattached node");
                        }
                        R.e eVar2 = new R.e(new b0.o[16]);
                        b0.o oVar4 = n9.f7162k;
                        b0.o oVar5 = oVar4.f7167p;
                        if (oVar5 == null) {
                            AbstractC2749f.b(eVar2, oVar4);
                        } else {
                            eVar2.c(oVar5);
                        }
                        while (true) {
                            int i11 = eVar2.f5108m;
                            if (i11 != 0) {
                                b0.o oVar6 = (b0.o) eVar2.l(i11 - 1);
                                if ((oVar6.f7165n & 1024) == 0) {
                                    AbstractC2749f.b(eVar2, oVar6);
                                } else {
                                    while (true) {
                                        if (oVar6 == null) {
                                            break;
                                        }
                                        if ((oVar6.f7164m & 1024) != 0) {
                                            R.e eVar3 = null;
                                            while (oVar6 != null) {
                                                if (oVar6 instanceof g0.s) {
                                                    g0.s sVar = (g0.s) oVar6;
                                                    z3 = sVar.z0().f17040a ? sVar.C0(7) : AbstractC1961f.i(sVar, 7, lVar);
                                                } else {
                                                    if ((oVar6.f7164m & 1024) != 0 && (oVar6 instanceof AbstractC2756m)) {
                                                        int i12 = 0;
                                                        for (b0.o oVar7 = ((AbstractC2756m) oVar6).f21839z; oVar7 != null; oVar7 = oVar7.f7167p) {
                                                            if ((oVar7.f7164m & 1024) != 0) {
                                                                i12++;
                                                                if (i12 == 1) {
                                                                    oVar6 = oVar7;
                                                                } else {
                                                                    if (eVar3 == null) {
                                                                        eVar3 = new R.e(new b0.o[16]);
                                                                    }
                                                                    if (oVar6 != null) {
                                                                        eVar3.c(oVar6);
                                                                        oVar6 = null;
                                                                    }
                                                                    eVar3.c(oVar7);
                                                                }
                                                            }
                                                        }
                                                        if (i12 == 1) {
                                                        }
                                                    }
                                                    oVar6 = AbstractC2749f.f(eVar3);
                                                }
                                            }
                                        } else {
                                            oVar6 = oVar6.f7167p;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (oVar3 instanceof g0.s) {
                        g0.s sVar2 = (g0.s) oVar3;
                        z3 = sVar2.z0().f17040a ? sVar2.C0(7) : AbstractC1961f.i(sVar2, 7, lVar);
                    } else {
                        if ((oVar3.f7164m & 1024) != 0 && (oVar3 instanceof AbstractC2756m)) {
                            int i13 = 0;
                            for (b0.o oVar8 = ((AbstractC2756m) oVar3).f21839z; oVar8 != null; oVar8 = oVar8.f7167p) {
                                if ((oVar8.f7164m & 1024) != 0) {
                                    i13++;
                                    if (i13 == 1) {
                                        oVar3 = oVar8;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new R.e(new b0.o[16]);
                                        }
                                        if (oVar3 != null) {
                                            eVar.c(oVar3);
                                            oVar3 = null;
                                        }
                                        eVar.c(oVar8);
                                    }
                                }
                            }
                            if (i13 == 1) {
                            }
                        }
                        oVar3 = AbstractC2749f.f(eVar);
                    }
                }
                return Boolean.valueOf(z3);
        }
    }
}
