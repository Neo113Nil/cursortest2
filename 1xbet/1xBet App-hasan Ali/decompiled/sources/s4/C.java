package s4;

import A0.A1;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import n.AbstractC2107A;
import p4.AbstractC2261a;
import p4.AbstractC2282w;
import p4.C2285z;
import p4.EnumC2281v;
import p4.c0;
import t3.AbstractC2425d;
import u2.C2496k;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final H3.g f19222a = new H3.g("NO_VALUE", 5);

    /* renamed from: b, reason: collision with root package name */
    public static final H3.g f19223b = new H3.g("NONE", 5);

    /* renamed from: c, reason: collision with root package name */
    public static final H3.g f19224c = new H3.g("PENDING", 5);

    public static B a(int i, r4.a aVar) {
        int i5 = (i & 1) != 0 ? 0 : 1;
        int i6 = (i & 2) == 0 ? 16 : 0;
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC2107A.q("replay cannot be negative, but was ", i5).toString());
        }
        if (i6 < 0) {
            throw new IllegalArgumentException(AbstractC2107A.q("extraBufferCapacity cannot be negative, but was ", i6).toString());
        }
        if (i5 <= 0 && i6 <= 0 && aVar != r4.a.f19106k) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i7 = i6 + i5;
        if (i7 < 0) {
            i7 = Integer.MAX_VALUE;
        }
        return new B(i5, i7, aVar);
    }

    public static final M b(Object obj) {
        if (obj == null) {
            obj = t4.c.f19596b;
        }
        return new M(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(O o5, d.g gVar, Throwable th, AbstractC0542c abstractC0542c) {
        C2371h c2371h;
        int i;
        try {
            if (abstractC0542c instanceof C2371h) {
                c2371h = (C2371h) abstractC0542c;
                int i5 = c2371h.f19270m;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c2371h.f19270m = i5 - Integer.MIN_VALUE;
                    Object obj = c2371h.f19269l;
                    EnumC0510a enumC0510a = EnumC0510a.f7289k;
                    i = c2371h.f19270m;
                    W3.o oVar = W3.o.f6046a;
                    if (i != 0) {
                        G4.l.N(obj);
                        c2371h.f19268k = th;
                        c2371h.f19270m = 1;
                        gVar.b(o5, th, c2371h);
                        if (oVar == enumC0510a) {
                            return enumC0510a;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = c2371h.f19268k;
                        G4.l.N(obj);
                    }
                    return oVar;
                }
            }
            if (i != 0) {
            }
            return oVar;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                AbstractC2425d.j(th2, th);
            }
            throw th2;
        }
        c2371h = new C2371h(abstractC0542c);
        Object obj2 = c2371h.f19269l;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c2371h.f19270m;
        W3.o oVar2 = W3.o.f6046a;
    }

    public static final void d(Object[] objArr, long j5, Object obj) {
        objArr[((int) j5) & (objArr.length - 1)] = obj;
    }

    public static final InterfaceC2368e e(InterfaceC2368e interfaceC2368e) {
        if (interfaceC2368e instanceof K) {
            return interfaceC2368e;
        }
        if (!(interfaceC2368e instanceof C2367d)) {
            return new C2367d(interfaceC2368e);
        }
        ((C2367d) interfaceC2368e).getClass();
        return interfaceC2368e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r2.d(r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0056, B:20:0x006b, B:22:0x0073, B:32:0x0047, B:35:0x0052), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0085 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(InterfaceC2369f interfaceC2369f, r4.p pVar, boolean z3, a4.c cVar) {
        C2370g c2370g;
        int i;
        r4.b it;
        r4.b bVar;
        InterfaceC2369f interfaceC2369f2;
        Object a5;
        try {
            if (cVar instanceof C2370g) {
                c2370g = (C2370g) cVar;
                int i5 = c2370g.f19267p;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c2370g.f19267p = i5 - Integer.MIN_VALUE;
                    Object obj = c2370g.f19266o;
                    EnumC0510a enumC0510a = EnumC0510a.f7289k;
                    i = c2370g.f19267p;
                    CancellationException cancellationException = null;
                    if (i != 0) {
                        G4.l.N(obj);
                        if (interfaceC2369f instanceof O) {
                            throw ((O) interfaceC2369f).f19250k;
                        }
                        it = pVar.iterator();
                        c2370g.f19262k = interfaceC2369f;
                        c2370g.f19263l = pVar;
                        c2370g.f19264m = it;
                        c2370g.f19265n = z3;
                        c2370g.f19267p = 1;
                        a5 = it.a(c2370g);
                        if (a5 != enumC0510a) {
                        }
                    } else if (i == 1) {
                        z3 = c2370g.f19265n;
                        bVar = c2370g.f19264m;
                        pVar = c2370g.f19263l;
                        interfaceC2369f2 = c2370g.f19262k;
                        G4.l.N(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z3 = c2370g.f19265n;
                        bVar = c2370g.f19264m;
                        pVar = c2370g.f19263l;
                        interfaceC2369f2 = c2370g.f19262k;
                        G4.l.N(obj);
                        it = bVar;
                        interfaceC2369f = interfaceC2369f2;
                        c2370g.f19262k = interfaceC2369f;
                        c2370g.f19263l = pVar;
                        c2370g.f19264m = it;
                        c2370g.f19265n = z3;
                        c2370g.f19267p = 1;
                        a5 = it.a(c2370g);
                        if (a5 != enumC0510a) {
                            return enumC0510a;
                        }
                        interfaceC2369f2 = interfaceC2369f;
                        bVar = it;
                        obj = a5;
                        if (((Boolean) obj).booleanValue()) {
                            if (z3) {
                                pVar.d(null);
                            }
                            return W3.o.f6046a;
                        }
                        Object c5 = bVar.c();
                        c2370g.f19262k = interfaceC2369f2;
                        c2370g.f19263l = pVar;
                        c2370g.f19264m = bVar;
                        c2370g.f19265n = z3;
                        c2370g.f19267p = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
        }
        c2370g = new C2370g(cVar);
        Object obj2 = c2370g.f19266o;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = c2370g.f19267p;
        CancellationException cancellationException2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(InterfaceC2368e interfaceC2368e, AbstractC0542c abstractC0542c) {
        p pVar;
        int i;
        H3.g gVar;
        kotlin.jvm.internal.w wVar;
        t4.a e3;
        A1 a12;
        Object obj;
        if (abstractC0542c instanceof p) {
            pVar = (p) abstractC0542c;
            int i5 = pVar.f19298n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                pVar.f19298n = i5 - Integer.MIN_VALUE;
                Object obj2 = pVar.f19297m;
                Object obj3 = EnumC0510a.f7289k;
                i = pVar.f19298n;
                gVar = t4.c.f19596b;
                if (i != 0) {
                    G4.l.N(obj2);
                    kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
                    wVar2.f17624k = gVar;
                    A1 a13 = new A1(2, wVar2);
                    try {
                        pVar.f19295k = wVar2;
                        pVar.f19296l = a13;
                        pVar.f19298n = 1;
                        if (interfaceC2368e.a(a13, pVar) == obj3) {
                            return obj3;
                        }
                        wVar = wVar2;
                    } catch (t4.a e5) {
                        wVar = wVar2;
                        e3 = e5;
                        a12 = a13;
                        if (e3.f19590k != a12) {
                        }
                        obj = wVar.f17624k;
                        if (obj == gVar) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a12 = pVar.f19296l;
                    wVar = pVar.f19295k;
                    try {
                        G4.l.N(obj2);
                    } catch (t4.a e6) {
                        e3 = e6;
                        if (e3.f19590k != a12) {
                            throw e3;
                        }
                        obj = wVar.f17624k;
                        if (obj == gVar) {
                        }
                    }
                }
                obj = wVar.f17624k;
                if (obj == gVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        pVar = new p(abstractC0542c);
        Object obj22 = pVar.f19297m;
        Object obj32 = EnumC0510a.f7289k;
        i = pVar.f19298n;
        gVar = t4.c.f19596b;
        if (i != 0) {
        }
        obj = wVar.f17624k;
        if (obj == gVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(InterfaceC2368e interfaceC2368e, i4.e eVar, AbstractC0542c abstractC0542c) {
        q qVar;
        int i;
        H3.g gVar;
        i4.e eVar2;
        kotlin.jvm.internal.w wVar;
        t4.a e3;
        I.E e5;
        Object obj;
        if (abstractC0542c instanceof q) {
            qVar = (q) abstractC0542c;
            int i5 = qVar.f19303o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                qVar.f19303o = i5 - Integer.MIN_VALUE;
                Object obj2 = qVar.f19302n;
                Object obj3 = EnumC0510a.f7289k;
                i = qVar.f19303o;
                gVar = t4.c.f19596b;
                if (i != 0) {
                    G4.l.N(obj2);
                    kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
                    wVar2.f17624k = gVar;
                    I.E e6 = new I.E(eVar, wVar2);
                    try {
                        qVar.f19299k = eVar;
                        qVar.f19300l = wVar2;
                        qVar.f19301m = e6;
                        qVar.f19303o = 1;
                        if (interfaceC2368e.a(e6, qVar) == obj3) {
                            return obj3;
                        }
                        eVar2 = eVar;
                        wVar = wVar2;
                    } catch (t4.a e7) {
                        eVar2 = eVar;
                        wVar = wVar2;
                        e3 = e7;
                        e5 = e6;
                        if (e3.f19590k != e5) {
                            throw e3;
                        }
                        obj = wVar.f17624k;
                        if (obj == gVar) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e5 = qVar.f19301m;
                    wVar = qVar.f19300l;
                    eVar2 = qVar.f19299k;
                    try {
                        G4.l.N(obj2);
                    } catch (t4.a e8) {
                        e3 = e8;
                        if (e3.f19590k != e5) {
                        }
                        obj = wVar.f17624k;
                        if (obj == gVar) {
                        }
                    }
                }
                obj = wVar.f17624k;
                if (obj == gVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + eVar2);
            }
        }
        qVar = new q(abstractC0542c);
        Object obj22 = qVar.f19302n;
        Object obj32 = EnumC0510a.f7289k;
        i = qVar.f19303o;
        gVar = t4.c.f19596b;
        if (i != 0) {
        }
        obj = wVar.f17624k;
        if (obj == gVar) {
        }
    }

    public static final InterfaceC2368e i(y yVar, a4.h hVar, int i, r4.a aVar) {
        return ((i == 0 || i == -3) && aVar == r4.a.f19106k) ? yVar : new t4.j(yVar, hVar, i, aVar);
    }

    public static final x j(C2496k c2496k, u4.c cVar, J j5, Float f) {
        boolean z3 = true;
        char c5 = 1;
        r4.g.i.getClass();
        r4.f fVar = r4.f.f19141a;
        v3.g gVar = new v3.g(22, c2496k, a4.i.f6649k);
        M b3 = b(f);
        EnumC2281v enumC2281v = j5.equals(F.f19231a) ? EnumC2281v.f18821k : EnumC2281v.f18824n;
        t tVar = new t(j5, (InterfaceC2368e) gVar.f20439l, b3, f, null);
        a4.h q5 = AbstractC2282w.q(cVar, (a4.h) gVar.f20440m);
        AbstractC2261a c0Var = enumC2281v == EnumC2281v.f18822l ? new c0(q5, tVar) : new C2285z(q5, z3, c5 == true ? 1 : 0);
        c0Var.e0(enumC2281v, c0Var, tVar);
        return new x(b3);
    }
}
