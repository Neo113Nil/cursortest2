package u;

import A0.Y0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import i4.InterfaceC2015a;
import java.util.concurrent.CancellationException;

/* renamed from: u.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2453d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2466m f19784a = new C2466m(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    public static final C2467n f19785b = new C2467n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    public static final C2468o f19786c = new C2468o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final C2469p f19787d = new C2469p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    public static final C2466m f19788e = new C2466m(Float.NEGATIVE_INFINITY);
    public static final C2467n f = new C2467n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    public static final C2468o f19789g = new C2468o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    public static final C2469p f19790h = new C2469p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static C2451c a() {
        return new C2451c(Float.valueOf(0.0f), B0.f19645a, Float.valueOf(0.01f), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x011f A[Catch: CancellationException -> 0x003b, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x003b, blocks: (B:13:0x0036, B:15:0x010a, B:17:0x011f, B:22:0x0142, B:24:0x0152, B:26:0x015c, B:34:0x0169, B:35:0x016e, B:37:0x016f), top: B:12:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C2465l c2465l, InterfaceC2461h interfaceC2461h, long j5, i4.c cVar, a4.c cVar2) {
        i0 i0Var;
        EnumC0510a enumC0510a;
        int i;
        kotlin.jvm.internal.w wVar;
        C2465l c2465l2;
        C2465l c2465l3;
        kotlin.jvm.internal.w wVar2;
        Object n5;
        i4.c cVar3;
        C2463j c2463j;
        C2463j c2463j2;
        Object obj;
        Object n6;
        InterfaceC2461h interfaceC2461h2 = interfaceC2461h;
        if (cVar2 instanceof i0) {
            i0Var = (i0) cVar2;
            int i5 = i0Var.f19825p;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                i0Var.f19825p = i5 - Integer.MIN_VALUE;
                i0 i0Var2 = i0Var;
                Object obj2 = i0Var2.f19824o;
                enumC0510a = EnumC0510a.f7289k;
                i = i0Var2.f19825p;
                Y0 y02 = Y0.f424k;
                if (i == 0) {
                    if (i == 1) {
                        wVar = i0Var2.f19823n;
                        cVar3 = i0Var2.f19822m;
                        interfaceC2461h2 = i0Var2.f19821l;
                        c2465l3 = i0Var2.f19820k;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wVar = i0Var2.f19823n;
                        cVar3 = i0Var2.f19822m;
                        interfaceC2461h2 = i0Var2.f19821l;
                        c2465l3 = i0Var2.f19820k;
                    }
                    try {
                        G4.l.N(obj2);
                    } catch (CancellationException e3) {
                        e = e3;
                        c2463j = (C2463j) wVar.f17624k;
                        if (c2463j != null) {
                            c2463j.i.setValue(Boolean.FALSE);
                        }
                        c2463j2 = (C2463j) wVar.f17624k;
                        if (c2463j2 != null && c2463j2.f19831g == c2465l3.f19848n) {
                            c2465l3.f19850p = false;
                        }
                        throw e;
                    }
                } else {
                    G4.l.N(obj2);
                    Object c5 = interfaceC2461h2.c(0L);
                    AbstractC2470q g5 = interfaceC2461h2.g(0L);
                    wVar = new kotlin.jvm.internal.w();
                    if (j5 == Long.MIN_VALUE) {
                        try {
                            c2465l2 = c2465l;
                        } catch (CancellationException e5) {
                            e = e5;
                            c2465l2 = c2465l;
                        }
                        try {
                            j0 j0Var = new j0(wVar, c5, interfaceC2461h2, g5, c2465l2, i(i0Var2.getContext()), cVar);
                            wVar2 = wVar;
                            try {
                                i0Var2.f19820k = c2465l2;
                                i0Var2.f19821l = interfaceC2461h2;
                                i0Var2.f19822m = cVar;
                                i0Var2.f19823n = wVar2;
                                i0Var2.f19825p = 1;
                                if (!interfaceC2461h2.b()) {
                                    n5 = AbstractC0329z.q(i0Var2.getContext()).n(new h0(j0Var), i0Var2);
                                } else {
                                    if (i0Var2.getContext().l(y02) != null) {
                                        throw new ClassCastException();
                                    }
                                    n5 = AbstractC0329z.q(i0Var2.getContext()).n(j0Var, i0Var2);
                                }
                                if (n5 != enumC0510a) {
                                    c2465l3 = c2465l2;
                                    cVar3 = cVar;
                                }
                                return enumC0510a;
                            } catch (CancellationException e6) {
                                e = e6;
                                c2465l3 = c2465l2;
                                wVar = wVar2;
                                c2463j = (C2463j) wVar.f17624k;
                                if (c2463j != null) {
                                }
                                c2463j2 = (C2463j) wVar.f17624k;
                                if (c2463j2 != null) {
                                }
                                throw e;
                            }
                        } catch (CancellationException e7) {
                            e = e7;
                            c2465l3 = c2465l2;
                            c2463j = (C2463j) wVar.f17624k;
                            if (c2463j != null) {
                            }
                            c2463j2 = (C2463j) wVar.f17624k;
                            if (c2463j2 != null) {
                            }
                            throw e;
                        }
                    }
                    wVar2 = wVar;
                    try {
                        C2463j c2463j3 = new C2463j(c5, interfaceC2461h2.e(), g5, j5, interfaceC2461h2.f(), j5, new I.C(c2465l, 2));
                        h(c2463j3, j5, i(i0Var2.getContext()), interfaceC2461h2, c2465l, cVar);
                        wVar2.f17624k = c2463j3;
                        c2465l3 = c2465l;
                        interfaceC2461h2 = interfaceC2461h;
                        cVar3 = cVar;
                    } catch (CancellationException e8) {
                        e = e8;
                        c2465l3 = c2465l;
                        wVar = wVar2;
                        c2463j = (C2463j) wVar.f17624k;
                        if (c2463j != null) {
                        }
                        c2463j2 = (C2463j) wVar.f17624k;
                        if (c2463j2 != null) {
                            c2465l3.f19850p = false;
                        }
                        throw e;
                    }
                    wVar = wVar2;
                }
                do {
                    obj = wVar.f17624k;
                    kotlin.jvm.internal.l.c(obj);
                    if (((Boolean) ((C2463j) obj).i.getValue()).booleanValue()) {
                        return W3.o.f6046a;
                    }
                    kotlin.jvm.internal.w wVar3 = wVar;
                    i4.c cVar4 = cVar3;
                    InterfaceC2461h interfaceC2461h3 = interfaceC2461h2;
                    C2465l c2465l4 = c2465l3;
                    try {
                        k0 k0Var = new k0(wVar3, i(i0Var2.getContext()), interfaceC2461h3, c2465l4, cVar4);
                        wVar = wVar3;
                        interfaceC2461h2 = interfaceC2461h3;
                        c2465l3 = c2465l4;
                        cVar3 = cVar4;
                        i0Var2.f19820k = c2465l3;
                        i0Var2.f19821l = interfaceC2461h2;
                        i0Var2.f19822m = cVar3;
                        i0Var2.f19823n = wVar;
                        i0Var2.f19825p = 2;
                        if (!interfaceC2461h2.b()) {
                            n6 = AbstractC0329z.q(i0Var2.getContext()).n(new h0(k0Var), i0Var2);
                        } else {
                            if (i0Var2.getContext().l(y02) != null) {
                                throw new ClassCastException();
                            }
                            n6 = AbstractC0329z.q(i0Var2.getContext()).n(k0Var, i0Var2);
                        }
                    } catch (CancellationException e9) {
                        e = e9;
                        wVar = wVar3;
                        c2465l3 = c2465l4;
                        c2463j = (C2463j) wVar.f17624k;
                        if (c2463j != null) {
                        }
                        c2463j2 = (C2463j) wVar.f17624k;
                        if (c2463j2 != null) {
                        }
                        throw e;
                    }
                } while (n6 != enumC0510a);
                return enumC0510a;
            }
        }
        i0Var = new i0(cVar2);
        i0 i0Var22 = i0Var;
        Object obj22 = i0Var22.f19824o;
        enumC0510a = EnumC0510a.f7289k;
        i = i0Var22.f19825p;
        Y0 y022 = Y0.f424k;
        if (i == 0) {
        }
        do {
            obj = wVar.f17624k;
            kotlin.jvm.internal.l.c(obj);
            if (((Boolean) ((C2463j) obj).i.getValue()).booleanValue()) {
            }
        } while (n6 != enumC0510a);
        return enumC0510a;
    }

    public static Object c(float f5, float f6, z0 z0Var, i4.e eVar, AbstractC0548i abstractC0548i, int i) {
        InterfaceC2464k interfaceC2464k = z0Var;
        if ((i & 8) != 0) {
            interfaceC2464k = l(7, null);
        }
        A0 a02 = B0.f19645a;
        Float f7 = new Float(f5);
        Float f8 = new Float(f6);
        C2466m c2466m = new C2466m(new Float(0.0f).floatValue());
        Object b3 = b(new C2465l(a02, f7, c2466m, 56), new m0(interfaceC2464k, a02, f7, f8, c2466m), Long.MIN_VALUE, new h0(eVar), abstractC0548i);
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        W3.o oVar = W3.o.f6046a;
        if (b3 != enumC0510a) {
            b3 = oVar;
        }
        return b3 == enumC0510a ? b3 : oVar;
    }

    public static final C2435F d(C2438I c2438i, float f5, C2434E c2434e, C0315s c0315s) {
        return f(c2438i, Float.valueOf(0.0f), Float.valueOf(f5), B0.f19645a, c2434e, c0315s, 33208, 0);
    }

    public static Object e(C2465l c2465l, Float f5, C2456e0 c2456e0, AbstractC0548i abstractC0548i) {
        Object b3 = b(c2465l, new m0(c2456e0, c2465l.f19845k, c2465l.f19846l.getValue(), f5, c2465l.f19847m), c2465l.f19848n, l0.f19858m, abstractC0548i);
        return b3 == EnumC0510a.f7289k ? b3 : W3.o.f6046a;
    }

    public static final C2435F f(C2438I c2438i, Number number, Number number2, A0 a02, C2434E c2434e, C0315s c0315s, int i, int i5) {
        Object M5 = c0315s.M();
        P.Z z3 = C0302l.f4480a;
        if (M5 == z3) {
            C2435F c2435f = new C2435F(c2438i, number, number2, a02, c2434e);
            c0315s.i0(c2435f);
            M5 = c2435f;
        }
        C2435F c2435f2 = (C2435F) M5;
        boolean z5 = (((57344 & i) ^ 24576) > 16384 && c0315s.h(c2434e)) || (i & 24576) == 16384;
        Object M6 = c0315s.M();
        if (z5 || M6 == z3) {
            E.E e3 = new E.E(number, c2435f2, number2, c2434e, 2);
            c0315s.i0(e3);
            M6 = e3;
        }
        AbstractC0329z.g((InterfaceC2015a) M6, c0315s);
        boolean h3 = c0315s.h(c2438i);
        Object M7 = c0315s.M();
        if (h3 || M7 == z3) {
            M7 = new i0.K(4, c2438i, c2435f2);
            c0315s.i0(M7);
        }
        AbstractC0329z.c(c2435f2, (i4.c) M7, c0315s);
        return c2435f2;
    }

    public static final AbstractC2470q g(AbstractC2470q abstractC2470q) {
        AbstractC2470q c5 = abstractC2470q.c();
        int b3 = c5.b();
        for (int i = 0; i < b3; i++) {
            c5.e(i, abstractC2470q.a(i));
        }
        return c5;
    }

    public static final void h(C2463j c2463j, long j5, float f5, InterfaceC2461h interfaceC2461h, C2465l c2465l, i4.c cVar) {
        long d5 = f5 == 0.0f ? interfaceC2461h.d() : (long) ((j5 - c2463j.f19828c) / f5);
        c2463j.f19831g = j5;
        c2463j.f19830e.setValue(interfaceC2461h.c(d5));
        c2463j.f = interfaceC2461h.g(d5);
        if (interfaceC2461h.h(d5)) {
            c2463j.f19832h = c2463j.f19831g;
            c2463j.i.setValue(Boolean.FALSE);
        }
        n(c2463j, c2465l);
        cVar.c(c2463j);
    }

    public static final float i(a4.h hVar) {
        b0.r rVar = (b0.r) hVar.l(b0.c.f7150x);
        float v4 = rVar != null ? rVar.v() : 1.0f;
        if (v4 >= 0.0f) {
            return v4;
        }
        AbstractC2445P.b("negative scale factor");
        return v4;
    }

    public static C2434E j(InterfaceC2476x interfaceC2476x) {
        return new C2434E(interfaceC2476x, 0);
    }

    public static final C2438I k(C0315s c0315s) {
        Object M5 = c0315s.M();
        if (M5 == C0302l.f4480a) {
            M5 = new C2438I();
            c0315s.i0(M5);
        }
        C2438I c2438i = (C2438I) M5;
        c2438i.a(0, c0315s);
        return c2438i;
    }

    public static C2456e0 l(int i, Object obj) {
        float f5 = (i & 2) != 0 ? 1500.0f : 400.0f;
        if ((i & 4) != 0) {
            obj = null;
        }
        return new C2456e0(1.0f, f5, obj);
    }

    public static z0 m(int i, int i5, InterfaceC2477y interfaceC2477y) {
        int i6 = (i5 & 2) != 0 ? 0 : 90;
        if ((i5 & 4) != 0) {
            interfaceC2477y = AbstractC2478z.f19970a;
        }
        return new z0(i, i6, interfaceC2477y);
    }

    public static final void n(C2463j c2463j, C2465l c2465l) {
        c2465l.f19846l.setValue(c2463j.f19830e.getValue());
        AbstractC2470q abstractC2470q = c2465l.f19847m;
        AbstractC2470q abstractC2470q2 = c2463j.f;
        int b3 = abstractC2470q.b();
        for (int i = 0; i < b3; i++) {
            abstractC2470q.e(i, abstractC2470q2.a(i));
        }
        c2465l.f19849o = c2463j.f19832h;
        c2465l.f19848n = c2463j.f19831g;
        c2465l.f19850p = ((Boolean) c2463j.i.getValue()).booleanValue();
    }
}
