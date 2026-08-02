package b0;

import A1.x0;
import D6.C0136t;
import D6.InterfaceC0118e0;
import D6.InterfaceC0135s;
import D6.z0;
import a.AbstractC0603a;
import f6.C1111d;
import f6.C1113f;
import f6.C1114g;
import f6.C1116i;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import java.util.List;
import k6.AbstractC1356c;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;
import w1.C1719l1;
import w1.C1722m0;
import w1.C1761y0;
import w1.F0;

/* loaded from: classes.dex */
public final class O implements InterfaceC0761i {

    /* renamed from: a, reason: collision with root package name */
    public final T f9964a;

    /* renamed from: b, reason: collision with root package name */
    public final C1722m0 f9965b;

    /* renamed from: c, reason: collision with root package name */
    public final D6.C f9966c;

    /* renamed from: f, reason: collision with root package name */
    public int f9969f;

    /* renamed from: g, reason: collision with root package name */
    public z0 f9970g;

    /* renamed from: i, reason: collision with root package name */
    public final F0 f9972i;

    /* renamed from: l, reason: collision with root package name */
    public final k1.g f9974l;

    /* renamed from: d, reason: collision with root package name */
    public final C1761y0 f9967d = new C1761y0(new C0771t(this, null));

    /* renamed from: e, reason: collision with root package name */
    public final M6.d f9968e = M6.e.a();

    /* renamed from: h, reason: collision with root package name */
    public final x0 f9971h = new x0(13);
    public final C1114g j = Y4.D.C(new C0766n(this, 1));

    /* renamed from: k, reason: collision with root package name */
    public final C1114g f9973k = Y4.D.C(new C0766n(this, 0));

    public O(T t7, List list, C1722m0 c1722m0, D6.C c3) {
        this.f9964a = t7;
        this.f9965b = c1722m0;
        this.f9966c = c3;
        this.f9972i = new F0(this, list);
        F6.n nVar = new F6.n(this, 2);
        L l7 = new L(this, null);
        k1.g gVar = new k1.g();
        gVar.f14674a = c3;
        gVar.f14675b = l7;
        gVar.f14676c = F6.i.a(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0, 6);
        gVar.f14677d = new C1719l1(12);
        InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) c3.c().get(D6.B.f1775b);
        if (interfaceC0118e0 != null) {
            interfaceC0118e0.invokeOnCompletion(new E6.d(1, nVar, gVar));
        }
        this.f9974l = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x004b, B:14:0x0053, B:16:0x0057, B:17:0x005a), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(O o7, AbstractC1356c abstractC1356c) {
        C0772u c0772u;
        int i7;
        M6.d dVar;
        int i8;
        o7.getClass();
        try {
            if (abstractC1356c instanceof C0772u) {
                c0772u = (C0772u) abstractC1356c;
                int i9 = c0772u.f10104e;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    c0772u.f10104e = i9 - Integer.MIN_VALUE;
                    Object obj = c0772u.f10102c;
                    j6.a aVar = j6.a.f14642a;
                    i7 = c0772u.f10104e;
                    if (i7 != 0) {
                        AbstractC0603a.p0(obj);
                        c0772u.f10100a = o7;
                        dVar = o7.f9968e;
                        c0772u.f10101b = dVar;
                        c0772u.f10104e = 1;
                        if (dVar.a(c0772u) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        M6.d dVar2 = c0772u.f10101b;
                        O o8 = c0772u.f10100a;
                        AbstractC0603a.p0(obj);
                        dVar = dVar2;
                        o7 = o8;
                    }
                    i8 = o7.f9969f - 1;
                    o7.f9969f = i8;
                    if (i8 == 0) {
                        z0 z0Var = o7.f9970g;
                        if (z0Var != null) {
                            z0Var.cancel(null);
                        }
                        o7.f9970g = null;
                    }
                    dVar.b(null);
                    return C1116i.f13008a;
                }
            }
            i8 = o7.f9969f - 1;
            o7.f9969f = i8;
            if (i8 == 0) {
            }
            dVar.b(null);
            return C1116i.f13008a;
        } catch (Throwable th) {
            dVar.b(null);
            throw th;
        }
        c0772u = new C0772u(o7, abstractC1356c);
        Object obj2 = c0772u.f10102c;
        j6.a aVar2 = j6.a.f14642a;
        i7 = c0772u.f10104e;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|(7:57|(1:(1:(1:61)(2:63|64))(3:65|66|67))(1:68)|62|17|(1:19)(1:23)|20|21)(4:8|9|10|(9:12|13|14|(1:24)|16|17|(0)(0)|20|21)(3:30|(1:32)(1:55)|(2:34|(2:36|(2:38|39))(2:47|48))(2:49|(2:51|52)(2:53|54))))|40|41|42|(1:44)|16|17|(0)(0)|20|21))|70|6|(0)(0)|40|41|42|(0)|16|17|(0)(0)|20|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /* JADX WARN: Type inference failed for: r2v3, types: [k6.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v9, types: [k6.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(O o7, a0 a0Var, AbstractC1356c abstractC1356c) {
        C0774w c0774w;
        j6.a aVar;
        int i7;
        InterfaceC0135s interfaceC0135s;
        C0136t c0136t;
        O o8;
        Object b7;
        InterfaceC0135s interfaceC0135s2;
        Throwable a2;
        i0 p5;
        o7.getClass();
        if (abstractC1356c instanceof C0774w) {
            c0774w = (C0774w) abstractC1356c;
            int i8 = c0774w.f10112f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0774w.f10112f = i8 - Integer.MIN_VALUE;
                Object obj = c0774w.f10110d;
                aVar = j6.a.f14642a;
                i7 = c0774w.f10112f;
                boolean z4 = true;
                if (i7 == 0) {
                    try {
                        if (i7 == 1) {
                            interfaceC0135s = (InterfaceC0135s) c0774w.f10107a;
                        } else if (i7 == 2) {
                            C0136t c0136t2 = c0774w.f10109c;
                            O o9 = c0774w.f10108b;
                            a0 a0Var2 = (a0) c0774w.f10107a;
                            AbstractC0603a.p0(obj);
                            c0136t = c0136t2;
                            o8 = o9;
                            a0Var = a0Var2;
                        } else {
                            if (i7 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0135s = (InterfaceC0135s) c0774w.f10107a;
                        }
                        AbstractC0603a.p0(obj);
                        interfaceC0135s2 = interfaceC0135s;
                    } catch (Throwable th) {
                        th = th;
                        obj = AbstractC0603a.h(th);
                        interfaceC0135s2 = o7;
                        a2 = C1113f.a(obj);
                        C0136t c0136t3 = (C0136t) interfaceC0135s2;
                        if (a2 != null) {
                        }
                        return C1116i.f13008a;
                    }
                    a2 = C1113f.a(obj);
                    C0136t c0136t32 = (C0136t) interfaceC0135s2;
                    if (a2 != null) {
                        c0136t32.C(obj);
                    } else {
                        c0136t32.O(a2);
                    }
                    return C1116i.f13008a;
                }
                AbstractC0603a.p0(obj);
                c0136t = a0Var.f10012b;
                try {
                    p5 = o7.f9971h.p();
                } catch (Throwable th2) {
                    th = th2;
                    o7 = c0136t;
                    obj = AbstractC0603a.h(th);
                    interfaceC0135s2 = o7;
                    a2 = C1113f.a(obj);
                    C0136t c0136t322 = (C0136t) interfaceC0135s2;
                    if (a2 != null) {
                    }
                    return C1116i.f13008a;
                }
                if (p5 instanceof C0756d) {
                    ?? r22 = a0Var.f10011a;
                    InterfaceC1292i interfaceC1292i = a0Var.f10014d;
                    c0774w.f10107a = c0136t;
                    c0774w.f10112f = 1;
                    try {
                        b7 = o7.g().b(new I(o7, interfaceC1292i, r22, null), c0774w);
                        if (b7 == aVar) {
                            return aVar;
                        }
                        C0136t c0136t4 = c0136t;
                        obj = b7;
                        interfaceC0135s2 = c0136t4;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        o7 = c0136t;
                        obj = AbstractC0603a.h(th);
                        interfaceC0135s2 = o7;
                        a2 = C1113f.a(obj);
                        C0136t c0136t3222 = (C0136t) interfaceC0135s2;
                        if (a2 != null) {
                        }
                        return C1116i.f13008a;
                    }
                    a2 = C1113f.a(obj);
                    C0136t c0136t32222 = (C0136t) interfaceC0135s2;
                    if (a2 != null) {
                    }
                    return C1116i.f13008a;
                }
                if (!(p5 instanceof b0)) {
                    z4 = p5 instanceof j0;
                }
                if (!z4) {
                    if (p5 instanceof Z) {
                        throw ((Z) p5).f10010b;
                    }
                    throw new A1.W();
                }
                if (p5 != a0Var.f10013c) {
                    t6.h.c(p5, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((b0) p5).f10015b;
                }
                c0774w.f10107a = a0Var;
                c0774w.f10108b = o7;
                c0774w.f10109c = c0136t;
                c0774w.f10112f = 2;
                Object h6 = o7.h(c0774w);
                o8 = o7;
                if (h6 == aVar) {
                    return aVar;
                }
                ?? r23 = a0Var.f10011a;
                InterfaceC1292i interfaceC1292i2 = a0Var.f10014d;
                c0774w.f10107a = c0136t;
                c0774w.f10108b = null;
                c0774w.f10109c = null;
                c0774w.f10112f = 3;
                b7 = o8.g().b(new I(o8, interfaceC1292i2, r23, null), c0774w);
                if (b7 == aVar) {
                    return aVar;
                }
                C0136t c0136t42 = c0136t;
                obj = b7;
                interfaceC0135s2 = c0136t42;
                a2 = C1113f.a(obj);
                C0136t c0136t322222 = (C0136t) interfaceC0135s2;
                if (a2 != null) {
                }
                return C1116i.f13008a;
            }
        }
        c0774w = new C0774w(o7, abstractC1356c);
        Object obj2 = c0774w.f10110d;
        aVar = j6.a.f14642a;
        i7 = c0774w.f10112f;
        boolean z42 = true;
        if (i7 == 0) {
        }
        ?? r232 = a0Var.f10011a;
        InterfaceC1292i interfaceC1292i22 = a0Var.f10014d;
        c0774w.f10107a = c0136t;
        c0774w.f10108b = null;
        c0774w.f10109c = null;
        c0774w.f10112f = 3;
        b7 = o8.g().b(new I(o8, interfaceC1292i22, r232, null), c0774w);
        if (b7 == aVar) {
        }
        C0136t c0136t422 = c0136t;
        obj2 = b7;
        interfaceC0135s2 = c0136t422;
        a2 = C1113f.a(obj2);
        C0136t c0136t3222222 = (C0136t) interfaceC0135s2;
        if (a2 != null) {
        }
        return C1116i.f13008a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:12:0x004b, B:14:0x0052), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(O o7, AbstractC1356c abstractC1356c) {
        C0775x c0775x;
        int i7;
        M6.d dVar;
        int i8;
        o7.getClass();
        try {
            if (abstractC1356c instanceof C0775x) {
                c0775x = (C0775x) abstractC1356c;
                int i9 = c0775x.f10117e;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    c0775x.f10117e = i9 - Integer.MIN_VALUE;
                    Object obj = c0775x.f10115c;
                    j6.a aVar = j6.a.f14642a;
                    i7 = c0775x.f10117e;
                    if (i7 != 0) {
                        AbstractC0603a.p0(obj);
                        c0775x.f10113a = o7;
                        dVar = o7.f9968e;
                        c0775x.f10114b = dVar;
                        c0775x.f10117e = 1;
                        if (dVar.a(c0775x) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        M6.d dVar2 = c0775x.f10114b;
                        O o8 = c0775x.f10113a;
                        AbstractC0603a.p0(obj);
                        dVar = dVar2;
                        o7 = o8;
                    }
                    i8 = o7.f9969f + 1;
                    o7.f9969f = i8;
                    if (i8 == 1) {
                        o7.f9970g = D6.E.p(o7.f9966c, new C0776y(o7, null));
                    }
                    dVar.b(null);
                    return C1116i.f13008a;
                }
            }
            i8 = o7.f9969f + 1;
            o7.f9969f = i8;
            if (i8 == 1) {
            }
            dVar.b(null);
            return C1116i.f13008a;
        } catch (Throwable th) {
            dVar.b(null);
            throw th;
        }
        c0775x = new C0775x(o7, abstractC1356c);
        Object obj2 = c0775x.f10115c;
        j6.a aVar2 = j6.a.f14642a;
        i7 = c0775x.f10117e;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(O o7, boolean z4, InterfaceC1287d interfaceC1287d) {
        C0752A c0752a;
        int i7;
        O o8;
        i0 i0Var;
        boolean z7;
        O o9;
        C1111d c1111d;
        o7.getClass();
        if (interfaceC1287d instanceof C0752A) {
            c0752a = (C0752A) interfaceC1287d;
            int i8 = c0752a.f9907f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0752a.f9907f = i8 - Integer.MIN_VALUE;
                Object obj = c0752a.f9905d;
                j6.a aVar = j6.a.f14642a;
                i7 = c0752a.f9907f;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    i0 p5 = o7.f9971h.p();
                    if (p5 instanceof j0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    h0 g3 = o7.g();
                    c0752a.f9902a = o7;
                    c0752a.f9903b = p5;
                    c0752a.f9904c = z4;
                    c0752a.f9907f = 1;
                    Integer a2 = g3.a();
                    if (a2 == aVar) {
                        return aVar;
                    }
                    o8 = o7;
                    i0Var = p5;
                    obj = a2;
                } else if (i7 == 1) {
                    z4 = c0752a.f9904c;
                    i0Var = c0752a.f9903b;
                    o8 = c0752a.f9902a;
                    AbstractC0603a.p0(obj);
                } else {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o9 = c0752a.f9902a;
                        AbstractC0603a.p0(obj);
                        c1111d = (C1111d) obj;
                        i0 i0Var2 = (i0) c1111d.f13000a;
                        if (((Boolean) c1111d.f13001b).booleanValue()) {
                            return i0Var2;
                        }
                        o9.f9971h.s(i0Var2);
                        return i0Var2;
                    }
                    o9 = c0752a.f9902a;
                    AbstractC0603a.p0(obj);
                    c1111d = (C1111d) obj;
                    i0 i0Var22 = (i0) c1111d.f13000a;
                    if (((Boolean) c1111d.f13001b).booleanValue()) {
                    }
                }
                int intValue = ((Number) obj).intValue();
                z7 = i0Var instanceof C0756d;
                int i9 = !z7 ? i0Var.f10053a : -1;
                if (!z7 && intValue == i9) {
                    return i0Var;
                }
                if (z4) {
                    h0 g7 = o8.g();
                    C c3 = new C(o8, i9, null);
                    c0752a.f9902a = o8;
                    c0752a.f9903b = null;
                    c0752a.f9907f = 3;
                    obj = g7.c(c3, c0752a);
                    if (obj == aVar) {
                        return aVar;
                    }
                    o9 = o8;
                    c1111d = (C1111d) obj;
                    i0 i0Var222 = (i0) c1111d.f13000a;
                    if (((Boolean) c1111d.f13001b).booleanValue()) {
                    }
                } else {
                    h0 g8 = o8.g();
                    B b7 = new B(o8, null);
                    c0752a.f9902a = o8;
                    c0752a.f9903b = null;
                    c0752a.f9907f = 2;
                    obj = g8.b(b7, c0752a);
                    if (obj == aVar) {
                        return aVar;
                    }
                    o9 = o8;
                    c1111d = (C1111d) obj;
                    i0 i0Var2222 = (i0) c1111d.f13000a;
                    if (((Boolean) c1111d.f13001b).booleanValue()) {
                    }
                }
            }
        }
        c0752a = new C0752A(o7, interfaceC1287d);
        Object obj2 = c0752a.f9905d;
        j6.a aVar2 = j6.a.f14642a;
        i7 = c0752a.f9907f;
        if (i7 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z7 = i0Var instanceof C0756d;
        if (!z7) {
        }
        if (!z7) {
        }
        if (z4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea A[Catch: c -> 0x00ab, TryCatch #0 {c -> 0x00ab, blocks: (B:36:0x00a6, B:37:0x0144, B:41:0x00b4, B:42:0x0127, B:58:0x00d1, B:60:0x00ea, B:61:0x00ee, B:67:0x00da, B:71:0x0115), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(O o7, boolean z4, AbstractC1356c abstractC1356c) {
        D d7;
        Integer a2;
        Object obj;
        O o8;
        int i7;
        C0755c c0755c;
        Object b7;
        t6.o oVar;
        t6.p pVar;
        o7.getClass();
        try {
            if (abstractC1356c instanceof D) {
                d7 = (D) abstractC1356c;
                int i8 = d7.f9924z;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    d7.f9924z = i8 - Integer.MIN_VALUE;
                    Object obj2 = d7.f9922x;
                    j6.a aVar = j6.a.f14642a;
                    switch (d7.f9924z) {
                        case 0:
                            AbstractC0603a.p0(obj2);
                            if (!z4) {
                                h0 g3 = o7.g();
                                d7.f9916a = o7;
                                d7.f9920e = z4;
                                d7.f9924z = 3;
                                obj2 = g3.a();
                                if (obj2 == aVar) {
                                    return aVar;
                                }
                                int intValue = ((Number) obj2).intValue();
                                h0 g7 = o7.g();
                                E e7 = new E(o7, intValue, null);
                                d7.f9916a = o7;
                                d7.f9920e = z4;
                                d7.f9924z = 4;
                                obj2 = g7.c(e7, d7);
                                if (obj2 == aVar) {
                                    return aVar;
                                }
                                return (C0756d) obj2;
                            }
                            d7.f9916a = o7;
                            d7.f9920e = z4;
                            d7.f9924z = 1;
                            obj2 = o7.i(d7);
                            if (obj2 == aVar) {
                                return aVar;
                            }
                            int hashCode = obj2 != null ? obj2.hashCode() : 0;
                            h0 g8 = o7.g();
                            d7.f9916a = o7;
                            d7.f9917b = obj2;
                            d7.f9920e = z4;
                            d7.f9921f = hashCode;
                            d7.f9924z = 2;
                            a2 = g8.a();
                            if (a2 != aVar) {
                                return aVar;
                            }
                            obj = obj2;
                            obj2 = a2;
                            o8 = o7;
                            i7 = hashCode;
                            return new C0756d(obj, i7, ((Number) obj2).intValue());
                        case 1:
                            z4 = d7.f9920e;
                            o7 = (O) d7.f9916a;
                            AbstractC0603a.p0(obj2);
                            if (obj2 != null) {
                            }
                            h0 g82 = o7.g();
                            d7.f9916a = o7;
                            d7.f9917b = obj2;
                            d7.f9920e = z4;
                            d7.f9921f = hashCode;
                            d7.f9924z = 2;
                            a2 = g82.a();
                            if (a2 != aVar) {
                            }
                            break;
                        case 2:
                            i7 = d7.f9921f;
                            z4 = d7.f9920e;
                            obj = d7.f9917b;
                            o8 = (O) d7.f9916a;
                            try {
                                AbstractC0603a.p0(obj2);
                                return new C0756d(obj, i7, ((Number) obj2).intValue());
                            } catch (C0755c e8) {
                                e = e8;
                                o7 = o8;
                                t6.p pVar2 = new t6.p();
                                C1722m0 c1722m0 = o7.f9965b;
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
                            AbstractC0603a.p0(obj2);
                            int intValue2 = ((Number) obj2).intValue();
                            h0 g72 = o7.g();
                            E e72 = new E(o7, intValue2, null);
                            d7.f9916a = o7;
                            d7.f9920e = z4;
                            d7.f9924z = 4;
                            obj2 = g72.c(e72, d7);
                            if (obj2 == aVar) {
                            }
                            return (C0756d) obj2;
                        case 4:
                            boolean z7 = d7.f9920e;
                            AbstractC0603a.p0(obj2);
                            return (C0756d) obj2;
                        case 5:
                            boolean z8 = d7.f9920e;
                            t6.p pVar3 = d7.f9919d;
                            t6.p pVar4 = (t6.p) d7.f9918c;
                            C0755c c0755c2 = (C0755c) d7.f9917b;
                            O o9 = (O) d7.f9916a;
                            AbstractC0603a.p0(obj2);
                            pVar3.f16472a = obj2;
                            t6.o oVar2 = new t6.o();
                            try {
                                F f7 = new F(pVar4, o9, oVar2, null);
                                d7.f9916a = c0755c2;
                                d7.f9917b = pVar4;
                                d7.f9918c = oVar2;
                                d7.f9919d = null;
                                d7.f9924z = 6;
                                if (z8) {
                                    o9.getClass();
                                    b7 = f7.invoke(d7);
                                } else {
                                    b7 = o9.g().b(new C0773v(f7, null), d7);
                                }
                                if (b7 == aVar) {
                                    return aVar;
                                }
                                oVar = oVar2;
                                pVar = pVar4;
                                Object obj3 = pVar.f16472a;
                                return new C0756d(obj3, obj3 != null ? obj3.hashCode() : 0, oVar.f16471a);
                            } catch (Throwable th) {
                                th = th;
                                c0755c = c0755c2;
                                Q0.a.c(c0755c, th);
                                throw c0755c;
                            }
                        case 6:
                            oVar = (t6.o) d7.f9918c;
                            pVar = (t6.p) d7.f9917b;
                            c0755c = (C0755c) d7.f9916a;
                            try {
                                AbstractC0603a.p0(obj2);
                                Object obj32 = pVar.f16472a;
                                return new C0756d(obj32, obj32 != null ? obj32.hashCode() : 0, oVar.f16471a);
                            } catch (Throwable th2) {
                                th = th2;
                                Q0.a.c(c0755c, th);
                                throw c0755c;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (d7.f9924z) {
            }
        } catch (C0755c e9) {
            e = e9;
        }
        d7 = new D(o7, abstractC1356c);
        Object obj22 = d7.f9922x;
        j6.a aVar2 = j6.a.f14642a;
    }

    @Override // b0.InterfaceC0761i
    public final Object a(Function2 function2, AbstractC1362i abstractC1362i) {
        l0 l0Var = (l0) abstractC1362i.getContext().get(k0.f10067a);
        if (l0Var != null) {
            l0Var.a(this);
        }
        return D6.E.x(new l0(l0Var, this), new J(this, function2, null), abstractC1362i);
    }

    public final h0 g() {
        return (h0) this.f9973k.getValue();
    }

    @Override // b0.InterfaceC0761i
    public final G6.g getData() {
        return this.f9967d;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(AbstractC1356c abstractC1356c) {
        C0777z c0777z;
        Object obj;
        int i7;
        O o7;
        int intValue;
        int i8;
        Throwable th;
        O o8;
        F0 f02;
        try {
            if (abstractC1356c instanceof C0777z) {
                c0777z = (C0777z) abstractC1356c;
                int i9 = c0777z.f10124e;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    c0777z.f10124e = i9 - Integer.MIN_VALUE;
                    Object obj2 = c0777z.f10122c;
                    obj = j6.a.f14642a;
                    i7 = c0777z.f10124e;
                    if (i7 != 0) {
                        AbstractC0603a.p0(obj2);
                        h0 g3 = g();
                        c0777z.f10120a = this;
                        c0777z.f10124e = 1;
                        obj2 = g3.a();
                        if (obj2 == obj) {
                            return obj;
                        }
                        o7 = this;
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i8 = c0777z.f10121b;
                            o8 = c0777z.f10120a;
                            try {
                                AbstractC0603a.p0(obj2);
                                return C1116i.f13008a;
                            } catch (Throwable th2) {
                                th = th2;
                                o8.f9971h.s(new b0(th, i8));
                                throw th;
                            }
                        }
                        o7 = c0777z.f10120a;
                        AbstractC0603a.p0(obj2);
                    }
                    intValue = ((Number) obj2).intValue();
                    f02 = o7.f9972i;
                    c0777z.f10120a = o7;
                    c0777z.f10121b = intValue;
                    c0777z.f10124e = 2;
                    if (f02.K(c0777z) == obj) {
                        return obj;
                    }
                    return C1116i.f13008a;
                }
            }
            f02 = o7.f9972i;
            c0777z.f10120a = o7;
            c0777z.f10121b = intValue;
            c0777z.f10124e = 2;
            if (f02.K(c0777z) == obj) {
            }
            return C1116i.f13008a;
        } catch (Throwable th3) {
            i8 = intValue;
            th = th3;
            o8 = o7;
            o8.f9971h.s(new b0(th, i8));
            throw th;
        }
        c0777z = new C0777z(this, abstractC1356c);
        Object obj22 = c0777z.f10122c;
        obj = j6.a.f14642a;
        i7 = c0777z.f10124e;
        if (i7 != 0) {
        }
        intValue = ((Number) obj22).intValue();
    }

    public final Object i(AbstractC1356c abstractC1356c) {
        return ((W) this.j.getValue()).a(new r(3, (InterfaceC1287d) null), abstractC1356c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, boolean z4, AbstractC1356c abstractC1356c) {
        M m7;
        int i7;
        t6.o oVar;
        if (abstractC1356c instanceof M) {
            m7 = (M) abstractC1356c;
            int i8 = m7.f9956d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                m7.f9956d = i8 - Integer.MIN_VALUE;
                Object obj2 = m7.f9954b;
                j6.a aVar = j6.a.f14642a;
                i7 = m7.f9956d;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj2);
                    t6.o oVar2 = new t6.o();
                    W w7 = (W) this.j.getValue();
                    N n2 = new N(oVar2, this, obj, z4, null);
                    m7.f9953a = oVar2;
                    m7.f9956d = 1;
                    if (w7.b(n2, m7) == aVar) {
                        return aVar;
                    }
                    oVar = oVar2;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = m7.f9953a;
                    AbstractC0603a.p0(obj2);
                }
                return new Integer(oVar.f16471a);
            }
        }
        m7 = new M(this, abstractC1356c);
        Object obj22 = m7.f9954b;
        j6.a aVar2 = j6.a.f14642a;
        i7 = m7.f9956d;
        if (i7 != 0) {
        }
        return new Integer(oVar.f16471a);
    }
}
