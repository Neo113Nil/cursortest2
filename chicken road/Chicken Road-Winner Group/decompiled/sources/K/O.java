package K;

import d2.AbstractC0276f;
import d2.C0274d;
import d2.C0277g;
import d2.C0279i;
import e2.AbstractC0292g;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import i2.AbstractC0343b;
import java.util.List;
import w2.AbstractC1242v;
import w2.C1233l;
import w2.C1235n;
import w2.C1240t;
import w2.InterfaceC1232k;
import w2.InterfaceC1241u;

/* loaded from: classes.dex */
public final class O implements InterfaceC0041i {

    /* renamed from: a, reason: collision with root package name */
    public final U f780a;

    /* renamed from: b, reason: collision with root package name */
    public final P0.j f781b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1241u f782c;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public w2.e0 f785g;

    /* renamed from: i, reason: collision with root package name */
    public final D0.a f787i;

    /* renamed from: j, reason: collision with root package name */
    public final C0277g f788j;

    /* renamed from: k, reason: collision with root package name */
    public final C0277g f789k;

    /* renamed from: l, reason: collision with root package name */
    public final D0.a f790l;

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.plugin.editing.k f783d = new io.flutter.plugin.editing.k((o2.p) new C0052u(this, null));

    /* renamed from: e, reason: collision with root package name */
    public final E2.d f784e = new E2.d();

    /* renamed from: h, reason: collision with root package name */
    public final J1.i f786h = new J1.i(7);

    public O(U u3, List list, P0.j jVar, InterfaceC1241u interfaceC1241u) {
        this.f780a = u3;
        this.f781b = jVar;
        this.f782c = interfaceC1241u;
        D0.a aVar = new D0.a();
        aVar.f264d = this;
        aVar.f261a = new E2.d();
        C1233l c1233l = new C1233l(true);
        c1233l.F(null);
        aVar.f262b = c1233l;
        aVar.f263c = AbstractC0292g.f0(list);
        this.f787i = aVar;
        this.f788j = new C0277g(new C0046n(this, 1));
        this.f789k = new C0277g(new C0046n(this, 0));
        E2.g gVar = new E2.g(1, this);
        L l3 = new L(this, null);
        D0.a aVar2 = new D0.a();
        aVar2.f261a = interfaceC1241u;
        aVar2.f262b = l3;
        aVar2.f263c = y2.i.a(Integer.MAX_VALUE, 0, 6);
        aVar2.f264d = new J1.i(6);
        w2.P p3 = (w2.P) interfaceC1241u.d().k(C1240t.f10525b);
        if (p3 != null) {
            ((w2.Z) p3).G(false, true, new E2.b(gVar, 2, aVar2));
        }
        this.f790l = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x004b, B:14:0x0053, B:16:0x0057, B:17:0x005a), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(O o3, AbstractC0343b abstractC0343b) {
        C0053v c0053v;
        int i3;
        E2.d dVar;
        int i4;
        o3.getClass();
        try {
            if (abstractC0343b instanceof C0053v) {
                c0053v = (C0053v) abstractC0343b;
                int i5 = c0053v.f903h;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c0053v.f903h = i5 - Integer.MIN_VALUE;
                    Object obj = c0053v.f;
                    EnumC0326a enumC0326a = EnumC0326a.f4994a;
                    i3 = c0053v.f903h;
                    if (i3 != 0) {
                        X0.a.L(obj);
                        c0053v.f900d = o3;
                        dVar = o3.f784e;
                        c0053v.f901e = dVar;
                        c0053v.f903h = 1;
                        if (dVar.c(c0053v) == enumC0326a) {
                            return enumC0326a;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        E2.d dVar2 = c0053v.f901e;
                        O o4 = c0053v.f900d;
                        X0.a.L(obj);
                        dVar = dVar2;
                        o3 = o4;
                    }
                    i4 = o3.f - 1;
                    o3.f = i4;
                    if (i4 == 0) {
                        w2.e0 e0Var = o3.f785g;
                        if (e0Var != null) {
                            e0Var.b(null);
                        }
                        o3.f785g = null;
                    }
                    dVar.e(null);
                    return C0279i.f4852a;
                }
            }
            i4 = o3.f - 1;
            o3.f = i4;
            if (i4 == 0) {
            }
            dVar.e(null);
            return C0279i.f4852a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0053v = new C0053v(o3, abstractC0343b);
        Object obj2 = c0053v.f;
        EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
        i3 = c0053v.f903h;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|(7:55|(1:(1:(1:59)(2:61|62))(3:63|64|65))(1:66)|60|17|(1:19)(1:23)|20|21)(5:8|9|10|(3:12|13|14)(3:30|(1:32)(1:53)|(2:34|(2:36|(1:38))(2:45|46))(2:47|(2:49|50)(2:51|52)))|24)|39|40|41))|68|6|(0)(0)|39|40|41|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bd, code lost:
    
        if (r9 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c0, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /* JADX WARN: Type inference failed for: r2v3, types: [i2.g, o2.p] */
    /* JADX WARN: Type inference failed for: r2v9, types: [i2.g, o2.p] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(O o3, b0 b0Var, AbstractC0343b abstractC0343b) {
        C0055x c0055x;
        int i3;
        InterfaceC1232k interfaceC1232k;
        C1233l c1233l;
        O o4;
        Object b3;
        InterfaceC1232k interfaceC1232k2;
        Throwable a3;
        o3.getClass();
        if (abstractC0343b instanceof C0055x) {
            c0055x = (C0055x) abstractC0343b;
            int i4 = c0055x.f909i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0055x.f909i = i4 - Integer.MIN_VALUE;
                Object obj = c0055x.f907g;
                EnumC0326a enumC0326a = EnumC0326a.f4994a;
                i3 = c0055x.f909i;
                boolean z3 = true;
                if (i3 == 0) {
                    try {
                        if (i3 == 1) {
                            interfaceC1232k = (InterfaceC1232k) c0055x.f905d;
                        } else if (i3 == 2) {
                            C1233l c1233l2 = c0055x.f;
                            O o5 = c0055x.f906e;
                            b0 b0Var2 = (b0) c0055x.f905d;
                            X0.a.L(obj);
                            c1233l = c1233l2;
                            o4 = o5;
                            b0Var = b0Var2;
                        } else {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC1232k = (InterfaceC1232k) c0055x.f905d;
                        }
                        X0.a.L(obj);
                        interfaceC1232k2 = interfaceC1232k;
                    } catch (Throwable th) {
                        th = th;
                        obj = X0.a.n(th);
                        interfaceC1232k2 = o3;
                        a3 = AbstractC0276f.a(obj);
                        C1233l c1233l3 = (C1233l) interfaceC1232k2;
                        if (a3 == null) {
                        }
                        return C0279i.f4852a;
                    }
                    a3 = AbstractC0276f.a(obj);
                    C1233l c1233l32 = (C1233l) interfaceC1232k2;
                    if (a3 == null) {
                        c1233l32.I(obj);
                    } else {
                        c1233l32.getClass();
                        c1233l32.I(new C1235n(a3, false));
                    }
                    return C0279i.f4852a;
                }
                X0.a.L(obj);
                c1233l = b0Var.f825b;
                try {
                    j0 u3 = o3.f786h.u();
                    if (u3 instanceof C0036d) {
                        ?? r22 = b0Var.f824a;
                        g2.h hVar = b0Var.f827d;
                        c0055x.f905d = c1233l;
                        c0055x.f909i = 1;
                        try {
                            b3 = o3.g().b(new H(o3, hVar, (o2.p) r22, (InterfaceC0319c) null), c0055x);
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            o3 = c1233l;
                            obj = X0.a.n(th);
                            interfaceC1232k2 = o3;
                            a3 = AbstractC0276f.a(obj);
                            C1233l c1233l322 = (C1233l) interfaceC1232k2;
                            if (a3 == null) {
                            }
                            return C0279i.f4852a;
                        }
                    } else {
                        if (!(u3 instanceof c0)) {
                            z3 = u3 instanceof k0;
                        }
                        if (!z3) {
                            if (u3 instanceof a0) {
                                throw ((a0) u3).f823b;
                            }
                            throw new T0.b();
                        }
                        if (u3 != b0Var.f826c) {
                            kotlin.jvm.internal.j.c(u3, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                            throw ((c0) u3).f828b;
                        }
                        c0055x.f905d = b0Var;
                        c0055x.f906e = o3;
                        c0055x.f = c1233l;
                        c0055x.f909i = 2;
                        Object h3 = o3.h(c0055x);
                        o4 = o3;
                        if (h3 == enumC0326a) {
                        }
                    }
                    return enumC0326a;
                } catch (Throwable th3) {
                    th = th3;
                    o3 = c1233l;
                    obj = X0.a.n(th);
                    interfaceC1232k2 = o3;
                    a3 = AbstractC0276f.a(obj);
                    C1233l c1233l3222 = (C1233l) interfaceC1232k2;
                    if (a3 == null) {
                    }
                    return C0279i.f4852a;
                }
                ?? r23 = b0Var.f824a;
                g2.h hVar2 = b0Var.f827d;
                c0055x.f905d = c1233l;
                c0055x.f906e = null;
                c0055x.f = null;
                c0055x.f909i = 3;
                b3 = o4.g().b(new H(o4, hVar2, (o2.p) r23, (InterfaceC0319c) null), c0055x);
            }
        }
        c0055x = new C0055x(o3, abstractC0343b);
        Object obj2 = c0055x.f907g;
        EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
        i3 = c0055x.f909i;
        boolean z32 = true;
        if (i3 == 0) {
        }
        ?? r232 = b0Var.f824a;
        g2.h hVar22 = b0Var.f827d;
        c0055x.f905d = c1233l;
        c0055x.f906e = null;
        c0055x.f = null;
        c0055x.f909i = 3;
        b3 = o4.g().b(new H(o4, hVar22, (o2.p) r232, (InterfaceC0319c) null), c0055x);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:12:0x004b, B:14:0x0052), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(O o3, AbstractC0343b abstractC0343b) {
        C0056y c0056y;
        int i3;
        E2.d dVar;
        int i4;
        o3.getClass();
        try {
            if (abstractC0343b instanceof C0056y) {
                c0056y = (C0056y) abstractC0343b;
                int i5 = c0056y.f913h;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c0056y.f913h = i5 - Integer.MIN_VALUE;
                    Object obj = c0056y.f;
                    EnumC0326a enumC0326a = EnumC0326a.f4994a;
                    i3 = c0056y.f913h;
                    if (i3 != 0) {
                        X0.a.L(obj);
                        c0056y.f910d = o3;
                        dVar = o3.f784e;
                        c0056y.f911e = dVar;
                        c0056y.f913h = 1;
                        if (dVar.c(c0056y) == enumC0326a) {
                            return enumC0326a;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        E2.d dVar2 = c0056y.f911e;
                        O o4 = c0056y.f910d;
                        X0.a.L(obj);
                        dVar = dVar2;
                        o3 = o4;
                    }
                    i4 = o3.f + 1;
                    o3.f = i4;
                    if (i4 == 1) {
                        o3.f785g = AbstractC1242v.g(o3.f782c, null, new A(o3, null), 3);
                    }
                    dVar.e(null);
                    return C0279i.f4852a;
                }
            }
            i4 = o3.f + 1;
            o3.f = i4;
            if (i4 == 1) {
            }
            dVar.e(null);
            return C0279i.f4852a;
        } catch (Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0056y = new C0056y(o3, abstractC0343b);
        Object obj2 = c0056y.f;
        EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
        i3 = c0056y.f913h;
        if (i3 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(O o3, boolean z3, InterfaceC0319c interfaceC0319c) {
        C c3;
        EnumC0326a enumC0326a;
        int i3;
        O o4;
        j0 j0Var;
        boolean z4;
        O o5;
        C0274d c0274d;
        o3.getClass();
        if (interfaceC0319c instanceof C) {
            c3 = (C) interfaceC0319c;
            int i4 = c3.f739i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c3.f739i = i4 - Integer.MIN_VALUE;
                Object obj = c3.f737g;
                enumC0326a = EnumC0326a.f4994a;
                i3 = c3.f739i;
                if (i3 != 0) {
                    X0.a.L(obj);
                    j0 u3 = o3.f786h.u();
                    if (u3 instanceof k0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    i0 g3 = o3.g();
                    c3.f735d = o3;
                    c3.f736e = u3;
                    c3.f = z3;
                    c3.f739i = 1;
                    Integer a3 = g3.a();
                    if (a3 != enumC0326a) {
                        o4 = o3;
                        j0Var = u3;
                        obj = a3;
                    }
                    return enumC0326a;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        o5 = c3.f735d;
                        X0.a.L(obj);
                        c0274d = (C0274d) obj;
                        j0 j0Var2 = (j0) c0274d.f4845a;
                        if (((Boolean) c0274d.f4846b).booleanValue()) {
                        }
                        return j0Var2;
                    }
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o5 = c3.f735d;
                    X0.a.L(obj);
                    c0274d = (C0274d) obj;
                    j0 j0Var22 = (j0) c0274d.f4845a;
                    if (((Boolean) c0274d.f4846b).booleanValue()) {
                        o5.f786h.x(j0Var22);
                    }
                    return j0Var22;
                }
                z3 = c3.f;
                j0Var = c3.f736e;
                o4 = c3.f735d;
                X0.a.L(obj);
                int intValue = ((Number) obj).intValue();
                z4 = j0Var instanceof C0036d;
                int i5 = !z4 ? j0Var.f862a : -1;
                if (!z4 && intValue == i5) {
                    return j0Var;
                }
                if (z3) {
                    i0 g4 = o4.g();
                    E e3 = new E(o4, i5, null);
                    c3.f735d = o4;
                    c3.f736e = null;
                    c3.f739i = 3;
                    obj = g4.c(e3, c3);
                    if (obj != enumC0326a) {
                        o5 = o4;
                        c0274d = (C0274d) obj;
                        j0 j0Var222 = (j0) c0274d.f4845a;
                        if (((Boolean) c0274d.f4846b).booleanValue()) {
                        }
                        return j0Var222;
                    }
                } else {
                    i0 g5 = o4.g();
                    D d3 = new D(o4, null);
                    c3.f735d = o4;
                    c3.f736e = null;
                    c3.f739i = 2;
                    obj = g5.b(d3, c3);
                    if (obj != enumC0326a) {
                        o5 = o4;
                        c0274d = (C0274d) obj;
                        j0 j0Var2222 = (j0) c0274d.f4845a;
                        if (((Boolean) c0274d.f4846b).booleanValue()) {
                        }
                        return j0Var2222;
                    }
                }
                return enumC0326a;
            }
        }
        c3 = new C(o3, interfaceC0319c);
        Object obj2 = c3.f737g;
        enumC0326a = EnumC0326a.f4994a;
        i3 = c3.f739i;
        if (i3 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z4 = j0Var instanceof C0036d;
        if (!z4) {
        }
        if (!z4) {
        }
        if (z3) {
        }
        return enumC0326a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x013f, code lost:
    
        if (r10 != r1) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e9 A[Catch: c -> 0x00aa, TryCatch #2 {c -> 0x00aa, blocks: (B:36:0x00a5, B:37:0x0142, B:40:0x00b3, B:41:0x0125, B:54:0x00d0, B:56:0x00e9, B:57:0x00ed, B:62:0x00d9, B:65:0x0113), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(O o3, boolean z3, AbstractC0343b abstractC0343b) {
        F f;
        Integer a3;
        Object obj;
        O o4;
        int i3;
        C0035c c0035c;
        Object b3;
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.q qVar;
        o3.getClass();
        try {
            if (abstractC0343b instanceof F) {
                f = (F) abstractC0343b;
                int i4 = f.f753l;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    f.f753l = i4 - Integer.MIN_VALUE;
                    Object obj2 = f.f751j;
                    EnumC0326a enumC0326a = EnumC0326a.f4994a;
                    switch (f.f753l) {
                        case 0:
                            X0.a.L(obj2);
                            if (!z3) {
                                i0 g3 = o3.g();
                                f.f746d = o3;
                                f.f749h = z3;
                                f.f753l = 3;
                                obj2 = g3.a();
                                if (obj2 == enumC0326a) {
                                }
                                int intValue = ((Number) obj2).intValue();
                                i0 g4 = o3.g();
                                G g5 = new G(o3, intValue, null);
                                f.f746d = o3;
                                f.f749h = z3;
                                f.f753l = 4;
                                obj2 = g4.c(g5, f);
                                break;
                            } else {
                                f.f746d = o3;
                                f.f749h = z3;
                                f.f753l = 1;
                                obj2 = o3.i(f);
                                if (obj2 == enumC0326a) {
                                }
                                int hashCode = obj2 != null ? obj2.hashCode() : 0;
                                i0 g6 = o3.g();
                                f.f746d = o3;
                                f.f747e = obj2;
                                f.f749h = z3;
                                f.f750i = hashCode;
                                f.f753l = 2;
                                a3 = g6.a();
                                if (a3 != enumC0326a) {
                                    obj = obj2;
                                    obj2 = a3;
                                    o4 = o3;
                                    i3 = hashCode;
                                    return new C0036d(i3, ((Number) obj2).intValue(), obj);
                                }
                            }
                            return enumC0326a;
                        case 1:
                            z3 = f.f749h;
                            o3 = (O) f.f746d;
                            X0.a.L(obj2);
                            if (obj2 != null) {
                            }
                            i0 g62 = o3.g();
                            f.f746d = o3;
                            f.f747e = obj2;
                            f.f749h = z3;
                            f.f750i = hashCode;
                            f.f753l = 2;
                            a3 = g62.a();
                            if (a3 != enumC0326a) {
                            }
                            return enumC0326a;
                        case 2:
                            i3 = f.f750i;
                            z3 = f.f749h;
                            obj = f.f747e;
                            o4 = (O) f.f746d;
                            try {
                                X0.a.L(obj2);
                                return new C0036d(i3, ((Number) obj2).intValue(), obj);
                            } catch (C0035c e3) {
                                e = e3;
                                o3 = o4;
                                kotlin.jvm.internal.q qVar2 = new kotlin.jvm.internal.q();
                                P0.j jVar = o3.f781b;
                                f.f746d = o3;
                                f.f747e = e;
                                f.f = qVar2;
                                f.f748g = qVar2;
                                f.f749h = z3;
                                f.f753l = 5;
                                throw e;
                            }
                        case 3:
                            z3 = f.f749h;
                            o3 = (O) f.f746d;
                            X0.a.L(obj2);
                            int intValue2 = ((Number) obj2).intValue();
                            i0 g42 = o3.g();
                            G g52 = new G(o3, intValue2, null);
                            f.f746d = o3;
                            f.f749h = z3;
                            f.f753l = 4;
                            obj2 = g42.c(g52, f);
                            break;
                        case 4:
                            boolean z4 = f.f749h;
                            X0.a.L(obj2);
                            return (C0036d) obj2;
                        case 5:
                            boolean z5 = f.f749h;
                            kotlin.jvm.internal.q qVar3 = f.f748g;
                            kotlin.jvm.internal.q qVar4 = (kotlin.jvm.internal.q) f.f;
                            C0035c c0035c2 = (C0035c) f.f747e;
                            O o5 = (O) f.f746d;
                            X0.a.L(obj2);
                            qVar3.f9672a = obj2;
                            kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                            try {
                                H h3 = new H(qVar4, o5, pVar2, (InterfaceC0319c) null);
                                f.f746d = c0035c2;
                                f.f747e = qVar4;
                                f.f = pVar2;
                                f.f748g = null;
                                f.f753l = 6;
                                if (z5) {
                                    o5.getClass();
                                    b3 = h3.invoke(f);
                                } else {
                                    b3 = o5.g().b(new C0054w(h3, null), f);
                                }
                                if (b3 != enumC0326a) {
                                    pVar = pVar2;
                                    qVar = qVar4;
                                    Object obj3 = qVar.f9672a;
                                    return new C0036d(obj3 != null ? obj3.hashCode() : 0, pVar.f9671a, obj3);
                                }
                                return enumC0326a;
                            } catch (Throwable th) {
                                th = th;
                                c0035c = c0035c2;
                                F2.b.d(c0035c, th);
                                throw c0035c;
                            }
                        case 6:
                            pVar = (kotlin.jvm.internal.p) f.f;
                            qVar = (kotlin.jvm.internal.q) f.f747e;
                            c0035c = (C0035c) f.f746d;
                            try {
                                X0.a.L(obj2);
                                Object obj32 = qVar.f9672a;
                                return new C0036d(obj32 != null ? obj32.hashCode() : 0, pVar.f9671a, obj32);
                            } catch (Throwable th2) {
                                th = th2;
                                F2.b.d(c0035c, th);
                                throw c0035c;
                            }
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (f.f753l) {
            }
        } catch (C0035c e4) {
            e = e4;
        }
        f = new F(o3, abstractC0343b);
        Object obj22 = f.f751j;
        EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
    }

    @Override // K.InterfaceC0041i
    public final Object b(o2.p pVar, i2.g gVar) {
        g2.h hVar = gVar.f5029b;
        kotlin.jvm.internal.j.b(hVar);
        n0 n0Var = (n0) hVar.k(m0.f884a);
        if (n0Var != null) {
            n0Var.c(this);
        }
        return AbstractC1242v.n(new n0(n0Var, this), new K(this, pVar, null), gVar);
    }

    public final i0 g() {
        return (i0) this.f789k.a();
    }

    @Override // K.InterfaceC0041i
    public final z2.d getData() {
        return this.f783d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.e(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(AbstractC0343b abstractC0343b) {
        B b3;
        int i3;
        O o3;
        int intValue;
        int i4;
        Throwable th;
        O o4;
        try {
            if (abstractC0343b instanceof B) {
                b3 = (B) abstractC0343b;
                int i5 = b3.f734h;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    b3.f734h = i5 - Integer.MIN_VALUE;
                    Object obj = b3.f;
                    Object obj2 = EnumC0326a.f4994a;
                    i3 = b3.f734h;
                    if (i3 != 0) {
                        X0.a.L(obj);
                        i0 g3 = g();
                        b3.f731d = this;
                        b3.f734h = 1;
                        obj = g3.a();
                        if (obj != obj2) {
                            o3 = this;
                        }
                        return obj2;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i4 = b3.f732e;
                        o4 = b3.f731d;
                        try {
                            X0.a.L(obj);
                            return C0279i.f4852a;
                        } catch (Throwable th2) {
                            th = th2;
                            o4.f786h.x(new c0(th, i4));
                            throw th;
                        }
                    }
                    o3 = b3.f731d;
                    X0.a.L(obj);
                    intValue = ((Number) obj).intValue();
                    D0.a aVar = o3.f787i;
                    b3.f731d = o3;
                    b3.f732e = intValue;
                    b3.f734h = 2;
                }
            }
            D0.a aVar2 = o3.f787i;
            b3.f731d = o3;
            b3.f732e = intValue;
            b3.f734h = 2;
        } catch (Throwable th3) {
            i4 = intValue;
            th = th3;
            o4 = o3;
            o4.f786h.x(new c0(th, i4));
            throw th;
        }
        b3 = new B(this, abstractC0343b);
        Object obj3 = b3.f;
        Object obj22 = EnumC0326a.f4994a;
        i3 = b3.f734h;
        if (i3 != 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    public final Object i(AbstractC0343b abstractC0343b) {
        return ((X) this.f788j.a()).a(new r(3, (InterfaceC0319c) null), abstractC0343b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj, boolean z3, AbstractC0343b abstractC0343b) {
        M m3;
        int i3;
        kotlin.jvm.internal.p pVar;
        if (abstractC0343b instanceof M) {
            m3 = (M) abstractC0343b;
            int i4 = m3.f773g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                m3.f773g = i4 - Integer.MIN_VALUE;
                Object obj2 = m3.f772e;
                EnumC0326a enumC0326a = EnumC0326a.f4994a;
                i3 = m3.f773g;
                if (i3 != 0) {
                    X0.a.L(obj2);
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    X x3 = (X) this.f788j.a();
                    N n3 = new N(pVar2, this, obj, z3, null);
                    m3.f771d = pVar2;
                    m3.f773g = 1;
                    if (x3.b(n3, m3) == enumC0326a) {
                        return enumC0326a;
                    }
                    pVar = pVar2;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = m3.f771d;
                    X0.a.L(obj2);
                }
                return new Integer(pVar.f9671a);
            }
        }
        m3 = new M(this, abstractC0343b);
        Object obj22 = m3.f772e;
        EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
        i3 = m3.f773g;
        if (i3 != 0) {
        }
        return new Integer(pVar.f9671a);
    }
}
