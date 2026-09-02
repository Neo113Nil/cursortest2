package F;

/* loaded from: classes.dex */
public final class P implements F.InterfaceC0009i {

    /* renamed from: a, reason: collision with root package name */
    public final F.V f378a;

    /* renamed from: b, reason: collision with root package name */
    public final m0.j f379b;

    /* renamed from: c, reason: collision with root package name */
    public final z1.InterfaceC1067u f380c;

    /* renamed from: f, reason: collision with root package name */
    public int f383f;

    /* renamed from: g, reason: collision with root package name */
    public z1.e0 f384g;

    /* renamed from: i, reason: collision with root package name */
    public final F.C0014n f386i;

    /* renamed from: j, reason: collision with root package name */
    public final h1.C0175g f387j;

    /* renamed from: k, reason: collision with root package name */
    public final h1.C0175g f388k;

    /* renamed from: l, reason: collision with root package name */
    public final F.C0014n f389l;

    /* renamed from: d, reason: collision with root package name */
    public final C.j f381d = new C.j(new F.C0021v(this, null));

    /* renamed from: e, reason: collision with root package name */
    public final H1.d f382e = H1.e.a();

    /* renamed from: h, reason: collision with root package name */
    public final C.j f385h = new C.j(6);

    public P(F.V v2, java.util.List list, m0.j jVar, z1.InterfaceC1067u interfaceC1067u) {
        this.f378a = v2;
        this.f379b = jVar;
        this.f380c = interfaceC1067u;
        F.C0014n c0014n = new F.C0014n();
        c0014n.f501d = this;
        c0014n.f498a = H1.e.a();
        z1.C1059l c1059l = new z1.C1059l(true);
        c1059l.G(null);
        c0014n.f499b = c1059l;
        c0014n.f500c = i1.AbstractC0190i.X(list);
        this.f386i = c0014n;
        this.f387j = Q1.l.q(new F.C0015o(this, 1));
        this.f388k = Q1.l.q(new F.C0015o(this, 0));
        B1.p pVar = new B1.p(1, this);
        F.M m2 = new F.M(this, null);
        F.C0014n c0014n2 = new F.C0014n();
        c0014n2.f498a = interfaceC1067u;
        c0014n2.f499b = m2;
        c0014n2.f500c = B1.j.a(Integer.MAX_VALUE, 0, 6);
        c0014n2.f501d = new C.j(4);
        z1.P p2 = (z1.P) interfaceC1067u.i().m(z1.C1066t.f8592b);
        if (p2 != null) {
            ((z1.Z) p2).H(false, true, new H1.b(2, pVar, c0014n2));
        }
        this.f389l = c0014n2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x004b, B:14:0x0053, B:16:0x0057, B:17:0x005a), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(F.P p2, m1.AbstractC0931b abstractC0931b) {
        F.C0022w c0022w;
        int i2;
        H1.d dVar;
        int i3;
        p2.getClass();
        try {
            if (abstractC0931b instanceof F.C0022w) {
                c0022w = (F.C0022w) abstractC0931b;
                int i4 = c0022w.f528h;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0022w.f528h = i4 - Integer.MIN_VALUE;
                    java.lang.Object obj = c0022w.f526f;
                    l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                    i2 = c0022w.f528h;
                    if (i2 != 0) {
                        a.AbstractC0059a.A(obj);
                        c0022w.f524d = p2;
                        dVar = p2.f382e;
                        c0022w.f525e = dVar;
                        c0022w.f528h = 1;
                        if (dVar.c(c0022w) == enumC0927a) {
                            return enumC0927a;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        H1.d dVar2 = c0022w.f525e;
                        F.P p3 = c0022w.f524d;
                        a.AbstractC0059a.A(obj);
                        dVar = dVar2;
                        p2 = p3;
                    }
                    i3 = p2.f383f - 1;
                    p2.f383f = i3;
                    if (i3 == 0) {
                        z1.e0 e0Var = p2.f384g;
                        if (e0Var != null) {
                            e0Var.a(null);
                        }
                        p2.f384g = null;
                    }
                    dVar.e(null);
                    return h1.C0177i.f3302a;
                }
            }
            i3 = p2.f383f - 1;
            p2.f383f = i3;
            if (i3 == 0) {
            }
            dVar.e(null);
            return h1.C0177i.f3302a;
        } catch (java.lang.Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0022w = new F.C0022w(p2, abstractC0931b);
        java.lang.Object obj2 = c0022w.f526f;
        l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
        i2 = c0022w.f528h;
        if (i2 != 0) {
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
    /* JADX WARN: Type inference failed for: r2v3, types: [m1.f, s1.p] */
    /* JADX WARN: Type inference failed for: r2v9, types: [m1.f, s1.p] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(F.P p2, F.c0 c0Var, m1.AbstractC0931b abstractC0931b) {
        F.C0024y c0024y;
        l1.EnumC0927a enumC0927a;
        int i2;
        z1.InterfaceC1058k interfaceC1058k;
        z1.C1059l c1059l;
        F.P p3;
        java.lang.Object b2;
        z1.InterfaceC1058k interfaceC1058k2;
        java.lang.Throwable a2;
        F.k0 l2;
        p2.getClass();
        if (abstractC0931b instanceof F.C0024y) {
            c0024y = (F.C0024y) abstractC0931b;
            int i3 = c0024y.f536i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0024y.f536i = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c0024y.f534g;
                enumC0927a = l1.EnumC0927a.f8017a;
                i2 = c0024y.f536i;
                boolean z2 = true;
                if (i2 == 0) {
                    try {
                        if (i2 == 1) {
                            interfaceC1058k = (z1.InterfaceC1058k) c0024y.f531d;
                        } else if (i2 == 2) {
                            z1.C1059l c1059l2 = c0024y.f533f;
                            F.P p4 = c0024y.f532e;
                            F.c0 c0Var2 = (F.c0) c0024y.f531d;
                            a.AbstractC0059a.A(obj);
                            c1059l = c1059l2;
                            p3 = p4;
                            c0Var = c0Var2;
                        } else {
                            if (i2 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC1058k = (z1.InterfaceC1058k) c0024y.f531d;
                        }
                        a.AbstractC0059a.A(obj);
                        interfaceC1058k2 = interfaceC1058k;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        obj = a.AbstractC0059a.i(th);
                        interfaceC1058k2 = p2;
                        a2 = h1.AbstractC0174f.a(obj);
                        z1.C1059l c1059l3 = (z1.C1059l) interfaceC1058k2;
                        if (a2 != null) {
                        }
                        return h1.C0177i.f3302a;
                    }
                    a2 = h1.AbstractC0174f.a(obj);
                    z1.C1059l c1059l32 = (z1.C1059l) interfaceC1058k2;
                    if (a2 != null) {
                        c1059l32.J(obj);
                    } else {
                        c1059l32.getClass();
                        c1059l32.J(new z1.C1061n(a2, false));
                    }
                    return h1.C0177i.f3302a;
                }
                a.AbstractC0059a.A(obj);
                c1059l = c0Var.f429b;
                try {
                    l2 = p2.f385h.l();
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    p2 = c1059l;
                    obj = a.AbstractC0059a.i(th);
                    interfaceC1058k2 = p2;
                    a2 = h1.AbstractC0174f.a(obj);
                    z1.C1059l c1059l322 = (z1.C1059l) interfaceC1058k2;
                    if (a2 != null) {
                    }
                    return h1.C0177i.f3302a;
                }
                if (l2 instanceof F.C0004d) {
                    ?? r2 = c0Var.f428a;
                    k1.i iVar = c0Var.f431d;
                    c0024y.f531d = c1059l;
                    c0024y.f536i = 1;
                    try {
                        b2 = p2.g().b(new F.H(p2, iVar, (s1.p) r2, (k1.d) null), c0024y);
                        if (b2 == enumC0927a) {
                            return enumC0927a;
                        }
                        z1.C1059l c1059l4 = c1059l;
                        obj = b2;
                        interfaceC1058k2 = c1059l4;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        th = th;
                        p2 = c1059l;
                        obj = a.AbstractC0059a.i(th);
                        interfaceC1058k2 = p2;
                        a2 = h1.AbstractC0174f.a(obj);
                        z1.C1059l c1059l3222 = (z1.C1059l) interfaceC1058k2;
                        if (a2 != null) {
                        }
                        return h1.C0177i.f3302a;
                    }
                    a2 = h1.AbstractC0174f.a(obj);
                    z1.C1059l c1059l32222 = (z1.C1059l) interfaceC1058k2;
                    if (a2 != null) {
                    }
                    return h1.C0177i.f3302a;
                }
                if (!(l2 instanceof F.d0)) {
                    z2 = l2 instanceof F.l0;
                }
                if (!z2) {
                    if (l2 instanceof F.b0) {
                        throw ((F.b0) l2).f427b;
                    }
                    throw new E1.A();
                }
                if (l2 != c0Var.f430c) {
                    kotlin.jvm.internal.i.c(l2, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((F.d0) l2).f434b;
                }
                c0024y.f531d = c0Var;
                c0024y.f532e = p2;
                c0024y.f533f = c1059l;
                c0024y.f536i = 2;
                java.lang.Object h2 = p2.h(c0024y);
                p3 = p2;
                if (h2 == enumC0927a) {
                    return enumC0927a;
                }
                ?? r22 = c0Var.f428a;
                k1.i iVar2 = c0Var.f431d;
                c0024y.f531d = c1059l;
                c0024y.f532e = null;
                c0024y.f533f = null;
                c0024y.f536i = 3;
                b2 = p3.g().b(new F.H(p3, iVar2, (s1.p) r22, (k1.d) null), c0024y);
                if (b2 == enumC0927a) {
                    return enumC0927a;
                }
                z1.C1059l c1059l42 = c1059l;
                obj = b2;
                interfaceC1058k2 = c1059l42;
                a2 = h1.AbstractC0174f.a(obj);
                z1.C1059l c1059l322222 = (z1.C1059l) interfaceC1058k2;
                if (a2 != null) {
                }
                return h1.C0177i.f3302a;
            }
        }
        c0024y = new F.C0024y(p2, abstractC0931b);
        java.lang.Object obj2 = c0024y.f534g;
        enumC0927a = l1.EnumC0927a.f8017a;
        i2 = c0024y.f536i;
        boolean z22 = true;
        if (i2 == 0) {
        }
        ?? r222 = c0Var.f428a;
        k1.i iVar22 = c0Var.f431d;
        c0024y.f531d = c1059l;
        c0024y.f532e = null;
        c0024y.f533f = null;
        c0024y.f536i = 3;
        b2 = p3.g().b(new F.H(p3, iVar22, (s1.p) r222, (k1.d) null), c0024y);
        if (b2 == enumC0927a) {
        }
        z1.C1059l c1059l422 = c1059l;
        obj2 = b2;
        interfaceC1058k2 = c1059l422;
        a2 = h1.AbstractC0174f.a(obj2);
        z1.C1059l c1059l3222222 = (z1.C1059l) interfaceC1058k2;
        if (a2 != null) {
        }
        return h1.C0177i.f3302a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:12:0x004b, B:14:0x0052), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object c(F.P p2, m1.AbstractC0931b abstractC0931b) {
        F.C0025z c0025z;
        int i2;
        H1.d dVar;
        int i3;
        p2.getClass();
        try {
            if (abstractC0931b instanceof F.C0025z) {
                c0025z = (F.C0025z) abstractC0931b;
                int i4 = c0025z.f541h;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0025z.f541h = i4 - Integer.MIN_VALUE;
                    java.lang.Object obj = c0025z.f539f;
                    l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                    i2 = c0025z.f541h;
                    if (i2 != 0) {
                        a.AbstractC0059a.A(obj);
                        c0025z.f537d = p2;
                        dVar = p2.f382e;
                        c0025z.f538e = dVar;
                        c0025z.f541h = 1;
                        if (dVar.c(c0025z) == enumC0927a) {
                            return enumC0927a;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        H1.d dVar2 = c0025z.f538e;
                        F.P p3 = c0025z.f537d;
                        a.AbstractC0059a.A(obj);
                        dVar = dVar2;
                        p2 = p3;
                    }
                    i3 = p2.f383f + 1;
                    p2.f383f = i3;
                    if (i3 == 1) {
                        p2.f384g = z1.AbstractC1068v.g(p2.f380c, new F.A(p2, null));
                    }
                    dVar.e(null);
                    return h1.C0177i.f3302a;
                }
            }
            i3 = p2.f383f + 1;
            p2.f383f = i3;
            if (i3 == 1) {
            }
            dVar.e(null);
            return h1.C0177i.f3302a;
        } catch (java.lang.Throwable th) {
            dVar.e(null);
            throw th;
        }
        c0025z = new F.C0025z(p2, abstractC0931b);
        java.lang.Object obj2 = c0025z.f539f;
        l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
        i2 = c0025z.f541h;
        if (i2 != 0) {
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
    public static final java.lang.Object d(F.P p2, boolean z2, k1.d dVar) {
        F.C c2;
        int i2;
        F.P p3;
        F.k0 k0Var;
        boolean z3;
        F.P p4;
        h1.C0172d c0172d;
        p2.getClass();
        if (dVar instanceof F.C) {
            c2 = (F.C) dVar;
            int i3 = c2.f325i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2.f325i = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c2.f323g;
                l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                i2 = c2.f325i;
                if (i2 != 0) {
                    a.AbstractC0059a.A(obj);
                    F.k0 l2 = p2.f385h.l();
                    if (l2 instanceof F.l0) {
                        throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    F.j0 g2 = p2.g();
                    c2.f320d = p2;
                    c2.f321e = l2;
                    c2.f322f = z2;
                    c2.f325i = 1;
                    java.lang.Integer a2 = g2.a();
                    if (a2 == enumC0927a) {
                        return enumC0927a;
                    }
                    p3 = p2;
                    k0Var = l2;
                    obj = a2;
                } else if (i2 == 1) {
                    z2 = c2.f322f;
                    k0Var = c2.f321e;
                    p3 = c2.f320d;
                    a.AbstractC0059a.A(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p4 = c2.f320d;
                        a.AbstractC0059a.A(obj);
                        c0172d = (h1.C0172d) obj;
                        F.k0 k0Var2 = (F.k0) c0172d.f3295a;
                        if (((java.lang.Boolean) c0172d.f3296b).booleanValue()) {
                            return k0Var2;
                        }
                        p4.f385h.p(k0Var2);
                        return k0Var2;
                    }
                    p4 = c2.f320d;
                    a.AbstractC0059a.A(obj);
                    c0172d = (h1.C0172d) obj;
                    F.k0 k0Var22 = (F.k0) c0172d.f3295a;
                    if (((java.lang.Boolean) c0172d.f3296b).booleanValue()) {
                    }
                }
                int intValue = ((java.lang.Number) obj).intValue();
                z3 = k0Var instanceof F.C0004d;
                int i4 = !z3 ? k0Var.f482a : -1;
                if (!z3 && intValue == i4) {
                    return k0Var;
                }
                if (z2) {
                    F.j0 g3 = p3.g();
                    F.E e2 = new F.E(p3, i4, null);
                    c2.f320d = p3;
                    c2.f321e = null;
                    c2.f325i = 3;
                    obj = g3.c(e2, c2);
                    if (obj == enumC0927a) {
                        return enumC0927a;
                    }
                    p4 = p3;
                    c0172d = (h1.C0172d) obj;
                    F.k0 k0Var222 = (F.k0) c0172d.f3295a;
                    if (((java.lang.Boolean) c0172d.f3296b).booleanValue()) {
                    }
                } else {
                    F.j0 g4 = p3.g();
                    F.D d2 = new F.D(p3, null);
                    c2.f320d = p3;
                    c2.f321e = null;
                    c2.f325i = 2;
                    obj = g4.b(d2, c2);
                    if (obj == enumC0927a) {
                        return enumC0927a;
                    }
                    p4 = p3;
                    c0172d = (h1.C0172d) obj;
                    F.k0 k0Var2222 = (F.k0) c0172d.f3295a;
                    if (((java.lang.Boolean) c0172d.f3296b).booleanValue()) {
                    }
                }
            }
        }
        c2 = new F.C(p2, dVar);
        java.lang.Object obj2 = c2.f323g;
        l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
        i2 = c2.f325i;
        if (i2 != 0) {
        }
        int intValue2 = ((java.lang.Number) obj2).intValue();
        z3 = k0Var instanceof F.C0004d;
        if (!z3) {
        }
        if (!z3) {
        }
        if (z2) {
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
    public static final java.lang.Object f(F.P p2, boolean z2, m1.AbstractC0931b abstractC0931b) {
        F.F f2;
        java.lang.Integer a2;
        java.lang.Object obj;
        F.P p3;
        int i2;
        F.C0003c c0003c;
        java.lang.Object b2;
        kotlin.jvm.internal.o oVar;
        kotlin.jvm.internal.p pVar;
        p2.getClass();
        try {
            if (abstractC0931b instanceof F.F) {
                f2 = (F.F) abstractC0931b;
                int i3 = f2.f342l;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    f2.f342l = i3 - Integer.MIN_VALUE;
                    java.lang.Object obj2 = f2.f340j;
                    l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                    switch (f2.f342l) {
                        case 0:
                            a.AbstractC0059a.A(obj2);
                            if (!z2) {
                                F.j0 g2 = p2.g();
                                f2.f334d = p2;
                                f2.f338h = z2;
                                f2.f342l = 3;
                                obj2 = g2.a();
                                if (obj2 == enumC0927a) {
                                    return enumC0927a;
                                }
                                int intValue = ((java.lang.Number) obj2).intValue();
                                F.j0 g3 = p2.g();
                                F.G g4 = new F.G(p2, intValue, null);
                                f2.f334d = p2;
                                f2.f338h = z2;
                                f2.f342l = 4;
                                obj2 = g3.c(g4, f2);
                                if (obj2 == enumC0927a) {
                                    return enumC0927a;
                                }
                                return (F.C0004d) obj2;
                            }
                            f2.f334d = p2;
                            f2.f338h = z2;
                            f2.f342l = 1;
                            obj2 = p2.i(f2);
                            if (obj2 == enumC0927a) {
                                return enumC0927a;
                            }
                            int hashCode = obj2 != null ? obj2.hashCode() : 0;
                            F.j0 g5 = p2.g();
                            f2.f334d = p2;
                            f2.f335e = obj2;
                            f2.f338h = z2;
                            f2.f339i = hashCode;
                            f2.f342l = 2;
                            a2 = g5.a();
                            if (a2 != enumC0927a) {
                                return enumC0927a;
                            }
                            obj = obj2;
                            obj2 = a2;
                            p3 = p2;
                            i2 = hashCode;
                            return new F.C0004d(i2, ((java.lang.Number) obj2).intValue(), obj);
                        case 1:
                            z2 = f2.f338h;
                            p2 = (F.P) f2.f334d;
                            a.AbstractC0059a.A(obj2);
                            if (obj2 != null) {
                            }
                            F.j0 g52 = p2.g();
                            f2.f334d = p2;
                            f2.f335e = obj2;
                            f2.f338h = z2;
                            f2.f339i = hashCode;
                            f2.f342l = 2;
                            a2 = g52.a();
                            if (a2 != enumC0927a) {
                            }
                            break;
                        case 2:
                            i2 = f2.f339i;
                            z2 = f2.f338h;
                            obj = f2.f335e;
                            p3 = (F.P) f2.f334d;
                            try {
                                a.AbstractC0059a.A(obj2);
                                return new F.C0004d(i2, ((java.lang.Number) obj2).intValue(), obj);
                            } catch (F.C0003c e2) {
                                e = e2;
                                p2 = p3;
                                kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                                m0.j jVar = p2.f379b;
                                f2.f334d = p2;
                                f2.f335e = e;
                                f2.f336f = pVar2;
                                f2.f337g = pVar2;
                                f2.f338h = z2;
                                f2.f342l = 5;
                                throw e;
                            }
                        case 3:
                            z2 = f2.f338h;
                            p2 = (F.P) f2.f334d;
                            a.AbstractC0059a.A(obj2);
                            int intValue2 = ((java.lang.Number) obj2).intValue();
                            F.j0 g32 = p2.g();
                            F.G g42 = new F.G(p2, intValue2, null);
                            f2.f334d = p2;
                            f2.f338h = z2;
                            f2.f342l = 4;
                            obj2 = g32.c(g42, f2);
                            if (obj2 == enumC0927a) {
                            }
                            return (F.C0004d) obj2;
                        case 4:
                            boolean z3 = f2.f338h;
                            a.AbstractC0059a.A(obj2);
                            return (F.C0004d) obj2;
                        case 5:
                            boolean z4 = f2.f338h;
                            kotlin.jvm.internal.p pVar3 = f2.f337g;
                            kotlin.jvm.internal.p pVar4 = (kotlin.jvm.internal.p) f2.f336f;
                            F.C0003c c0003c2 = (F.C0003c) f2.f335e;
                            F.P p4 = (F.P) f2.f334d;
                            a.AbstractC0059a.A(obj2);
                            pVar3.f7960a = obj2;
                            kotlin.jvm.internal.o oVar2 = new kotlin.jvm.internal.o();
                            try {
                                F.H h2 = new F.H(pVar4, p4, oVar2, (k1.d) null);
                                f2.f334d = c0003c2;
                                f2.f335e = pVar4;
                                f2.f336f = oVar2;
                                f2.f337g = null;
                                f2.f342l = 6;
                                if (z4) {
                                    p4.getClass();
                                    b2 = h2.invoke(f2);
                                } else {
                                    b2 = p4.g().b(new F.C0023x(h2, null), f2);
                                }
                                if (b2 == enumC0927a) {
                                    return enumC0927a;
                                }
                                oVar = oVar2;
                                pVar = pVar4;
                                java.lang.Object obj3 = pVar.f7960a;
                                return new F.C0004d(obj3 != null ? obj3.hashCode() : 0, oVar.f7959a, obj3);
                            } catch (java.lang.Throwable th) {
                                th = th;
                                c0003c = c0003c2;
                                Q1.d.b(c0003c, th);
                                throw c0003c;
                            }
                        case 6:
                            oVar = (kotlin.jvm.internal.o) f2.f336f;
                            pVar = (kotlin.jvm.internal.p) f2.f335e;
                            c0003c = (F.C0003c) f2.f334d;
                            try {
                                a.AbstractC0059a.A(obj2);
                                java.lang.Object obj32 = pVar.f7960a;
                                return new F.C0004d(obj32 != null ? obj32.hashCode() : 0, oVar.f7959a, obj32);
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                Q1.d.b(c0003c, th);
                                throw c0003c;
                            }
                        default:
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (f2.f342l) {
            }
        } catch (F.C0003c e3) {
            e = e3;
        }
        f2 = new F.F(p2, abstractC0931b);
        java.lang.Object obj22 = f2.f340j;
        l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
    }

    @Override // F.InterfaceC0009i
    public final java.lang.Object e(s1.p pVar, m1.AbstractC0935f abstractC0935f) {
        k1.i iVar = abstractC0935f.f8076b;
        kotlin.jvm.internal.i.b(iVar);
        F.o0 o0Var = (F.o0) iVar.m(F.n0.f502a);
        if (o0Var != null) {
            o0Var.c(this);
        }
        return z1.AbstractC1068v.n(new F.o0(o0Var, this), new F.K(this, pVar, null), abstractC0935f);
    }

    public final F.j0 g() {
        return (F.j0) this.f388k.a();
    }

    @Override // F.InterfaceC0009i
    public final C1.d getData() {
        return this.f381d;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object h(m1.AbstractC0931b abstractC0931b) {
        F.B b2;
        java.lang.Object obj;
        int i2;
        F.P p2;
        int intValue;
        int i3;
        java.lang.Throwable th;
        F.P p3;
        F.C0014n c0014n;
        try {
            if (abstractC0931b instanceof F.B) {
                b2 = (F.B) abstractC0931b;
                int i4 = b2.f319h;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    b2.f319h = i4 - Integer.MIN_VALUE;
                    java.lang.Object obj2 = b2.f317f;
                    obj = l1.EnumC0927a.f8017a;
                    i2 = b2.f319h;
                    if (i2 != 0) {
                        a.AbstractC0059a.A(obj2);
                        F.j0 g2 = g();
                        b2.f315d = this;
                        b2.f319h = 1;
                        obj2 = g2.a();
                        if (obj2 == obj) {
                            return obj;
                        }
                        p2 = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i3 = b2.f316e;
                            p3 = b2.f315d;
                            try {
                                a.AbstractC0059a.A(obj2);
                                return h1.C0177i.f3302a;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                p3.f385h.p(new F.d0(th, i3));
                                throw th;
                            }
                        }
                        p2 = b2.f315d;
                        a.AbstractC0059a.A(obj2);
                    }
                    intValue = ((java.lang.Number) obj2).intValue();
                    c0014n = p2.f386i;
                    b2.f315d = p2;
                    b2.f316e = intValue;
                    b2.f319h = 2;
                    if (c0014n.f(b2) == obj) {
                        return obj;
                    }
                    return h1.C0177i.f3302a;
                }
            }
            c0014n = p2.f386i;
            b2.f315d = p2;
            b2.f316e = intValue;
            b2.f319h = 2;
            if (c0014n.f(b2) == obj) {
            }
            return h1.C0177i.f3302a;
        } catch (java.lang.Throwable th3) {
            i3 = intValue;
            th = th3;
            p3 = p2;
            p3.f385h.p(new F.d0(th, i3));
            throw th;
        }
        b2 = new F.B(this, abstractC0931b);
        java.lang.Object obj22 = b2.f317f;
        obj = l1.EnumC0927a.f8017a;
        i2 = b2.f319h;
        if (i2 != 0) {
        }
        intValue = ((java.lang.Number) obj22).intValue();
    }

    public final java.lang.Object i(m1.AbstractC0931b abstractC0931b) {
        return ((F.Y) this.f387j.a()).a(new F.C0018s(3, (k1.d) null), abstractC0931b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object j(java.lang.Object obj, boolean z2, m1.AbstractC0931b abstractC0931b) {
        F.N n2;
        int i2;
        kotlin.jvm.internal.o oVar;
        if (abstractC0931b instanceof F.N) {
            n2 = (F.N) abstractC0931b;
            int i3 = n2.f370g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n2.f370g = i3 - Integer.MIN_VALUE;
                java.lang.Object obj2 = n2.f368e;
                l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                i2 = n2.f370g;
                if (i2 != 0) {
                    a.AbstractC0059a.A(obj2);
                    kotlin.jvm.internal.o oVar2 = new kotlin.jvm.internal.o();
                    F.Y y2 = (F.Y) this.f387j.a();
                    F.O o2 = new F.O(oVar2, this, obj, z2, null);
                    n2.f367d = oVar2;
                    n2.f370g = 1;
                    if (y2.b(o2, n2) == enumC0927a) {
                        return enumC0927a;
                    }
                    oVar = oVar2;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = n2.f367d;
                    a.AbstractC0059a.A(obj2);
                }
                return new java.lang.Integer(oVar.f7959a);
            }
        }
        n2 = new F.N(this, abstractC0931b);
        java.lang.Object obj22 = n2.f368e;
        l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
        i2 = n2.f370g;
        if (i2 != 0) {
        }
        return new java.lang.Integer(oVar.f7959a);
    }
}
