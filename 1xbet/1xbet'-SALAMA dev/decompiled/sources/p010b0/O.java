package p010b0;

import A1.W;
import A1.x0;
import D6.B;
import D6.C;
import D6.C0136t;
import D6.E;
import D6.InterfaceC0118e0;
import D6.InterfaceC0135s;
import D6.z0;
import F6.i;
import F6.n;
import M6.d;
import M6.e;
import Y4.D;
import com.google.android.gms.common.api.f;
import j6.a;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.jvm.functions.Function2;
import p072k1.g;
import p077k6.c;
import p155w1.C1010l1;
import p155w1.C1013m0;
import p155w1.C1052y0;
import p155w1.F0;
import t6.h;
import t6.o;
import t6.p;

/* JADX INFO: loaded from: classes.dex */
public final class O implements InterfaceC0738i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f9964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1013m0 f9965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f9966c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z0 f9970g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F0 f9972i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f9974l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1052y0 f9967d = new C1052y0(new C0748t(this, null));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f9968e = e.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0 f9971h = new x0(13);
    public final p044f6.g j = D.C(new C0743n(this, 1));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p044f6.g f9973k = D.C(new C0743n(this, 0));

    public O(T t7, List list, C1013m0 c1013m0, C c3) {
        this.f9964a = t7;
        this.f9965b = c1013m0;
        this.f9966c = c3;
        this.f9972i = new F0(this, list);
        n nVar = new n(this, 2);
        L l7 = new L(this, null);
        g gVar = new g();
        gVar.f14680a = c3;
        gVar.f14681b = l7;
        gVar.f14682c = i.a(f.API_PRIORITY_OTHER, 0, 6);
        gVar.f14683d = new C1010l1(12);
        InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) c3.c().get(B.f1775b);
        if (interfaceC0118e0 != null) {
            interfaceC0118e0.invokeOnCompletion(new E6.d(1, nVar, gVar));
        }
        this.f9974l = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(O o7, c cVar) {
        C0749u c0749u;
        d dVar;
        o7.getClass();
        if (cVar instanceof C0749u) {
            c0749u = (C0749u) cVar;
            int i7 = c0749u.f10104e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0749u.f10104e = i7 - Integer.MIN_VALUE;
            } else {
                c0749u = new C0749u(o7, cVar);
            }
        } else {
            c0749u = new C0749u(o7, cVar);
        }
        Object obj = c0749u.f10102c;
        a aVar = a.f14648a;
        int i8 = c0749u.f10104e;
        if (i8 == 0) {
            p003a.a.p0(obj);
            c0749u.f10100a = o7;
            dVar = o7.f9968e;
            c0749u.f10101b = dVar;
            c0749u.f10104e = 1;
            if (dVar.a(c0749u) == aVar) {
                return aVar;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d dVar2 = c0749u.f10101b;
            O o8 = c0749u.f10100a;
            p003a.a.p0(obj);
            dVar = dVar2;
            o7 = o8;
        }
        try {
            int i9 = o7.f9969f - 1;
            o7.f9969f = i9;
            if (i9 == 0) {
                z0 z0Var = o7.f9970g;
                if (z0Var != null) {
                    z0Var.cancel(null);
                }
                o7.f9970g = null;
            }
            return p044f6.i.f13014a;
        } finally {
            dVar.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [k6.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v9, types: [k6.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v0, types: [b0.O, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9, types: [b0.O] */
    public static final Object c(O o7, a0 a0Var, c cVar) throws IllegalAccessException, InvocationTargetException {
        C0751w c0751w;
        InterfaceC0135s interfaceC0135s;
        C0136t c0136t;
        ?? r9;
        ?? r7;
        p065i6.i iVar;
        Object objB;
        ?? r10;
        Throwable thA;
        C0136t c0136t2;
        o7.getClass();
        if (cVar instanceof C0751w) {
            c0751w = (C0751w) cVar;
            int i7 = c0751w.f10112f;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0751w.f10112f = i7 - Integer.MIN_VALUE;
            } else {
                c0751w = new C0751w(o7, cVar);
            }
        } else {
            c0751w = new C0751w(o7, cVar);
        }
        Object objH = c0751w.f10110d;
        a aVar = a.f14648a;
        int i8 = c0751w.f10112f;
        boolean z4 = true;
        try {
            if (i8 != 0) {
                try {
                    if (i8 == 1) {
                        interfaceC0135s = (InterfaceC0135s) c0751w.f10107a;
                    } else if (i8 == 2) {
                        C0136t c0136t3 = c0751w.f10109c;
                        O o8 = c0751w.f10108b;
                        a0 a0Var2 = (a0) c0751w.f10107a;
                        p003a.a.p0(objH);
                        c0136t = c0136t3;
                        r9 = o8;
                        a0Var = a0Var2;
                    } else {
                        if (i8 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC0135s = (InterfaceC0135s) c0751w.f10107a;
                    }
                    p003a.a.p0(objH);
                    r10 = interfaceC0135s;
                } catch (Throwable th) {
                    th = th;
                    objH = p003a.a.h(th);
                    r10 = o7;
                }
                thA = p044f6.f.a(objH);
                c0136t2 = (C0136t) r10;
                if (thA == null) {
                    c0136t2.C(objH);
                } else {
                    c0136t2.O(thA);
                }
                return p044f6.i.f13014a;
            }
            p003a.a.p0(objH);
            c0136t = a0Var.f10012b;
            try {
                i0 i0VarP = o7.f9971h.p();
                if (i0VarP instanceof C0733d) {
                    ?? r8 = a0Var.f10011a;
                    p065i6.i iVar2 = a0Var.f10014d;
                    c0751w.f10107a = c0136t;
                    c0751w.f10112f = 1;
                    try {
                        objB = o7.g().b(new I(o7, iVar2, r8, null), c0751w);
                        if (objB == aVar) {
                            return aVar;
                        }
                        C0136t c0136t4 = c0136t;
                        objH = objB;
                        r10 = c0136t4;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        o7 = c0136t;
                        objH = p003a.a.h(th);
                        r10 = o7;
                    }
                    thA = p044f6.f.a(objH);
                    c0136t2 = (C0136t) r10;
                    if (thA == null) {
                        c0136t2.C(objH);
                    } else {
                        c0136t2.O(thA);
                    }
                    return p044f6.i.f13014a;
                }
                if (!(i0VarP instanceof b0)) {
                    z4 = i0VarP instanceof j0;
                }
                if (!z4) {
                    if (i0VarP instanceof Z) {
                        throw ((Z) i0VarP).f10010b;
                    }
                    throw new W();
                }
                if (i0VarP != a0Var.f10013c) {
                    h.c(i0VarP, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((b0) i0VarP).f10015b;
                }
                c0751w.f10107a = a0Var;
                c0751w.f10108b = o7;
                c0751w.f10109c = c0136t;
                c0751w.f10112f = 2;
                if (o7.h(c0751w) == aVar) {
                    r9 = o7;
                    return aVar;
                }
            } catch (Throwable th3) {
                th = th3;
                o7 = c0136t;
                objH = p003a.a.h(th);
                r10 = o7;
            }
            objB = r9.g().b(new I(r9, iVar, r7, null), c0751w);
            if (objB == aVar) {
                return aVar;
            }
            C0136t c0136t5 = c0136t;
            objH = objB;
            r10 = c0136t5;
        } catch (Throwable th4) {
            th = th4;
            th = th;
            o7 = c0136t;
            objH = p003a.a.h(th);
            r10 = o7;
        }
        r9 = o7;
        r7 = a0Var.f10011a;
        iVar = a0Var.f10014d;
        c0751w.f10107a = c0136t;
        c0751w.f10108b = null;
        c0751w.f10109c = null;
        c0751w.f10112f = 3;
        thA = p044f6.f.a(objH);
        c0136t2 = (C0136t) r10;
        if (thA == null) {
            c0136t2.C(objH);
        } else {
            c0136t2.O(thA);
        }
        return p044f6.i.f13014a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(O o7, c cVar) {
        C0752x c0752x;
        d dVar;
        o7.getClass();
        if (cVar instanceof C0752x) {
            c0752x = (C0752x) cVar;
            int i7 = c0752x.f10117e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0752x.f10117e = i7 - Integer.MIN_VALUE;
            } else {
                c0752x = new C0752x(o7, cVar);
            }
        } else {
            c0752x = new C0752x(o7, cVar);
        }
        Object obj = c0752x.f10115c;
        a aVar = a.f14648a;
        int i8 = c0752x.f10117e;
        if (i8 == 0) {
            p003a.a.p0(obj);
            c0752x.f10113a = o7;
            dVar = o7.f9968e;
            c0752x.f10114b = dVar;
            c0752x.f10117e = 1;
            if (dVar.a(c0752x) == aVar) {
                return aVar;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d dVar2 = c0752x.f10114b;
            O o8 = c0752x.f10113a;
            p003a.a.p0(obj);
            dVar = dVar2;
            o7 = o8;
        }
        try {
            int i9 = o7.f9969f + 1;
            o7.f9969f = i9;
            if (i9 == 1) {
                o7.f9970g = E.p(o7.f9966c, new C0753y(o7, null));
            }
            return p044f6.i.f13014a;
        } finally {
            dVar.b(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object e(O o7, boolean z4, p065i6.d dVar) throws Throwable {
        A a2;
        O o8;
        i0 i0Var;
        O o9;
        p044f6.d dVar2;
        i0 i0Var2;
        o7.getClass();
        if (dVar instanceof A) {
            a2 = (A) dVar;
            int i7 = a2.f9907f;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                a2.f9907f = i7 - Integer.MIN_VALUE;
            } else {
                a2 = new A(o7, dVar);
            }
        } else {
            a2 = new A(o7, dVar);
        }
        Object objC = a2.f9905d;
        a aVar = a.f14648a;
        int i8 = a2.f9907f;
        if (i8 == 0) {
            p003a.a.p0(objC);
            i0 i0VarP = o7.f9971h.p();
            if (i0VarP instanceof j0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            h0 h0VarG = o7.g();
            a2.f9902a = o7;
            a2.f9903b = i0VarP;
            a2.f9904c = z4;
            a2.f9907f = 1;
            Integer numA = h0VarG.a();
            if (numA == aVar) {
                return aVar;
            }
            o8 = o7;
            i0Var = i0VarP;
            objC = numA;
        } else {
            if (i8 != 1) {
                if (i8 == 2) {
                    o9 = a2.f9902a;
                    p003a.a.p0(objC);
                    dVar2 = (p044f6.d) objC;
                    i0Var2 = (i0) dVar2.f13006a;
                    if (((Boolean) dVar2.f13007b).booleanValue()) {
                        return i0Var2;
                    }
                    o9.f9971h.s(i0Var2);
                    return i0Var2;
                }
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o9 = a2.f9902a;
                p003a.a.p0(objC);
                dVar2 = (p044f6.d) objC;
                i0Var2 = (i0) dVar2.f13006a;
                if (((Boolean) dVar2.f13007b).booleanValue()) {
                    return i0Var2;
                }
                o9.f9971h.s(i0Var2);
                return i0Var2;
            }
            z4 = a2.f9904c;
            i0Var = a2.f9903b;
            o8 = a2.f9902a;
            p003a.a.p0(objC);
        }
        int iIntValue = ((Number) objC).intValue();
        boolean z7 = i0Var instanceof C0733d;
        int i9 = z7 ? i0Var.f10053a : -1;
        if (z7 && iIntValue == i9) {
            return i0Var;
        }
        if (z4) {
            h0 h0VarG2 = o8.g();
            B b7 = new B(o8, null);
            a2.f9902a = o8;
            a2.f9903b = null;
            a2.f9907f = 2;
            objC = h0VarG2.b(b7, a2);
            if (objC == aVar) {
                return aVar;
            }
            o9 = o8;
            dVar2 = (p044f6.d) objC;
            i0Var2 = (i0) dVar2.f13006a;
            if (((Boolean) dVar2.f13007b).booleanValue()) {
                return i0Var2;
            }
            o9.f9971h.s(i0Var2);
            return i0Var2;
        }
        h0 h0VarG3 = o8.g();
        C c3 = new C(o8, i9, null);
        a2.f9902a = o8;
        a2.f9903b = null;
        a2.f9907f = 3;
        objC = h0VarG3.c(c3, a2);
        if (objC == aVar) {
            return aVar;
        }
        o9 = o8;
        dVar2 = (p044f6.d) objC;
        i0Var2 = (i0) dVar2.f13006a;
        if (((Boolean) dVar2.f13007b).booleanValue()) {
            return i0Var2;
        }
        o9.f9971h.s(i0Var2);
        return i0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea A[Catch: c -> 0x00ab, TryCatch #0 {c -> 0x00ab, blocks: (B:35:0x00a6, B:69:0x0144, B:40:0x00b4, B:66:0x0127, B:48:0x00d1, B:56:0x00ea, B:57:0x00ee, B:52:0x00da, B:63:0x0115), top: B:74:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0104  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final Object f(O o7, boolean z4, c cVar) {
        D d7;
        int iHashCode;
        Integer numA;
        Object obj;
        O o8;
        int i7;
        C0732c c0732c;
        Object objB;
        o oVar;
        p pVar;
        o7.getClass();
        if (cVar instanceof D) {
            d7 = (D) cVar;
            int i8 = d7.f9924z;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                d7.f9924z = i8 - Integer.MIN_VALUE;
            } else {
                d7 = new D(o7, cVar);
            }
        } else {
            d7 = new D(o7, cVar);
        }
        Object objA = d7.f9922x;
        a aVar = a.f14648a;
        try {
            switch (d7.f9924z) {
                case 0:
                    p003a.a.p0(objA);
                    if (!z4) {
                        h0 h0VarG = o7.g();
                        d7.f9916a = o7;
                        d7.f9920e = z4;
                        d7.f9924z = 3;
                        objA = h0VarG.a();
                        if (objA == aVar) {
                            return aVar;
                        }
                        int iIntValue = ((Number) objA).intValue();
                        h0 h0VarG2 = o7.g();
                        E e7 = new E(o7, iIntValue, null);
                        d7.f9916a = o7;
                        d7.f9920e = z4;
                        d7.f9924z = 4;
                        objA = h0VarG2.c(e7, d7);
                        if (objA == aVar) {
                            return aVar;
                        }
                        return (C0733d) objA;
                    }
                    d7.f9916a = o7;
                    d7.f9920e = z4;
                    d7.f9924z = 1;
                    objA = o7.i(d7);
                    if (objA == aVar) {
                        return aVar;
                    }
                    iHashCode = objA != null ? objA.hashCode() : 0;
                    h0 h0VarG3 = o7.g();
                    d7.f9916a = o7;
                    d7.f9917b = objA;
                    d7.f9920e = z4;
                    d7.f9921f = iHashCode;
                    d7.f9924z = 2;
                    numA = h0VarG3.a();
                    if (numA == aVar) {
                        return aVar;
                    }
                    obj = objA;
                    objA = numA;
                    o8 = o7;
                    i7 = iHashCode;
                    return new C0733d(obj, i7, ((Number) objA).intValue());
                case 1:
                    z4 = d7.f9920e;
                    o7 = (O) d7.f9916a;
                    p003a.a.p0(objA);
                    if (objA != null) {
                    }
                    h0 h0VarG4 = o7.g();
                    d7.f9916a = o7;
                    d7.f9917b = objA;
                    d7.f9920e = z4;
                    d7.f9921f = iHashCode;
                    d7.f9924z = 2;
                    numA = h0VarG4.a();
                    if (numA == aVar) {
                        return aVar;
                    }
                    obj = objA;
                    objA = numA;
                    o8 = o7;
                    i7 = iHashCode;
                    return new C0733d(obj, i7, ((Number) objA).intValue());
                case 2:
                    i7 = d7.f9921f;
                    z4 = d7.f9920e;
                    obj = d7.f9917b;
                    o8 = (O) d7.f9916a;
                    try {
                        p003a.a.p0(objA);
                        return new C0733d(obj, i7, ((Number) objA).intValue());
                    } catch (C0732c e8) {
                        e = e8;
                        o7 = o8;
                        p pVar2 = new p();
                        C1013m0 c1013m0 = o7.f9965b;
                        d7.f9916a = o7;
                        d7.f9917b = e;
                        d7.f9918c = pVar2;
                        d7.f9919d = pVar2;
                        d7.f9920e = z4;
                        d7.f9924z = 5;
                        throw e;
                    }
                case 3:
                    z4 = d7.f9920e;
                    o7 = (O) d7.f9916a;
                    p003a.a.p0(objA);
                    int iIntValue2 = ((Number) objA).intValue();
                    h0 h0VarG5 = o7.g();
                    E e9 = new E(o7, iIntValue2, null);
                    d7.f9916a = o7;
                    d7.f9920e = z4;
                    d7.f9924z = 4;
                    objA = h0VarG5.c(e9, d7);
                    if (objA == aVar) {
                        return aVar;
                    }
                    return (C0733d) objA;
                case 4:
                    boolean z7 = d7.f9920e;
                    p003a.a.p0(objA);
                    return (C0733d) objA;
                case 5:
                    boolean z8 = d7.f9920e;
                    p pVar3 = d7.f9919d;
                    p pVar4 = (p) d7.f9918c;
                    C0732c c0732c2 = (C0732c) d7.f9917b;
                    O o9 = (O) d7.f9916a;
                    p003a.a.p0(objA);
                    pVar3.f16478a = objA;
                    o oVar2 = new o();
                    try {
                        F f7 = new F(pVar4, o9, oVar2, null);
                        d7.f9916a = c0732c2;
                        d7.f9917b = pVar4;
                        d7.f9918c = oVar2;
                        d7.f9919d = null;
                        d7.f9924z = 6;
                        if (z8) {
                            o9.getClass();
                            objB = f7.invoke(d7);
                        } else {
                            objB = o9.g().b(new C0750v(f7, null), d7);
                        }
                        if (objB == aVar) {
                            return aVar;
                        }
                        oVar = oVar2;
                        pVar = pVar4;
                        Object obj2 = pVar.f16478a;
                        return new C0733d(obj2, obj2 != null ? obj2.hashCode() : 0, oVar.f16477a);
                    } catch (Throwable th) {
                        th = th;
                        c0732c = c0732c2;
                        Q0.a.c(c0732c, th);
                        throw c0732c;
                    }
                case 6:
                    oVar = (o) d7.f9918c;
                    pVar = (p) d7.f9917b;
                    c0732c = (C0732c) d7.f9916a;
                    try {
                        p003a.a.p0(objA);
                        Object obj3 = pVar.f16478a;
                        return new C0733d(obj3, obj3 != null ? obj3.hashCode() : 0, oVar.f16477a);
                    } catch (Throwable th2) {
                        th = th2;
                        Q0.a.c(c0732c, th);
                        throw c0732c;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (C0732c e10) {
            e = e10;
        }
    }

    @Override // p010b0.InterfaceC0738i
    public final Object a(Function2 function2, p077k6.i iVar) {
        l0 l0Var = (l0) iVar.getContext().get(k0.f10067a);
        if (l0Var != null) {
            l0Var.a(this);
        }
        return E.x(new l0(l0Var, this), new J(this, function2, null), iVar);
    }

    public final h0 g() {
        return (h0) this.f9973k.getValue();
    }

    @Override // p010b0.InterfaceC0738i
    public final G6.g getData() {
        return this.f9967d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(c cVar) throws Throwable {
        C0754z c0754z;
        O o7;
        int iIntValue;
        int i7;
        Throwable th;
        O o8;
        if (cVar instanceof C0754z) {
            c0754z = (C0754z) cVar;
            int i8 = c0754z.f10124e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0754z.f10124e = i8 - Integer.MIN_VALUE;
            } else {
                c0754z = new C0754z(this, cVar);
            }
        } else {
            c0754z = new C0754z(this, cVar);
        }
        Object objA = c0754z.f10122c;
        Object obj = a.f14648a;
        int i9 = c0754z.f10124e;
        try {
            if (i9 == 0) {
                p003a.a.p0(objA);
                h0 h0VarG = g();
                c0754z.f10120a = this;
                c0754z.f10124e = 1;
                objA = h0VarG.a();
                if (objA == obj) {
                    return obj;
                }
                o7 = this;
            } else {
                if (i9 != 1) {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i7 = c0754z.f10121b;
                    o8 = c0754z.f10120a;
                    try {
                        p003a.a.p0(objA);
                        return p044f6.i.f13014a;
                    } catch (Throwable th2) {
                        th = th2;
                        o8.f9971h.s(new b0(th, i7));
                        throw th;
                    }
                }
                o7 = c0754z.f10120a;
                p003a.a.p0(objA);
            }
            F0 f7 = o7.f9972i;
            c0754z.f10120a = o7;
            c0754z.f10121b = iIntValue;
            c0754z.f10124e = 2;
            if (f7.K(c0754z) == obj) {
                return obj;
            }
            return p044f6.i.f13014a;
        } catch (Throwable th3) {
            i7 = iIntValue;
            th = th3;
            o8 = o7;
            o8.f9971h.s(new b0(th, i7));
            throw th;
        }
        iIntValue = ((Number) objA).intValue();
    }

    public final Object i(c cVar) {
        return ((W) this.j.getValue()).a(new r(3, (p065i6.d) null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(Object obj, boolean z4, c cVar) {
        M m7;
        o oVar;
        if (cVar instanceof M) {
            m7 = (M) cVar;
            int i7 = m7.f9956d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                m7.f9956d = i7 - Integer.MIN_VALUE;
            } else {
                m7 = new M(this, cVar);
            }
        } else {
            m7 = new M(this, cVar);
        }
        Object obj2 = m7.f9954b;
        a aVar = a.f14648a;
        int i8 = m7.f9956d;
        if (i8 == 0) {
            p003a.a.p0(obj2);
            o oVar2 = new o();
            W w7 = (W) this.j.getValue();
            N n2 = new N(oVar2, this, obj, z4, null);
            m7.f9953a = oVar2;
            m7.f9956d = 1;
            if (w7.b(n2, m7) == aVar) {
                return aVar;
            }
            oVar = oVar2;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = m7.f9953a;
            p003a.a.p0(obj2);
        }
        return new Integer(oVar.f16477a);
    }
}
