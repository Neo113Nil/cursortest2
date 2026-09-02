package f1;

/* loaded from: classes.dex */
public final class J implements W0.b, f1.InterfaceC0120g {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f2815a;

    /* renamed from: b, reason: collision with root package name */
    public I0.b f2816b;

    /* renamed from: c, reason: collision with root package name */
    public final m0.j f2817c = new m0.j(29, false);

    public static final java.lang.Object i(f1.J j2, java.lang.String str, java.lang.String str2, m1.AbstractC0935f abstractC0935f) {
        j2.getClass();
        I.d dVar = new I.d(str);
        android.content.Context context = j2.f2815a;
        if (context != null) {
            java.lang.Object e2 = f1.K.a(context).e(new I.h(new f1.C0124k(dVar, str2, null), null), abstractC0935f);
            return e2 == l1.EnumC0927a.f8017a ? e2 : h1.C0177i.f3302a;
        }
        kotlin.jvm.internal.i.i("context");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00cd -> B:11:0x00d0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object n(f1.J j2, java.util.List list, m1.AbstractC0931b abstractC0931b) {
        f1.v vVar;
        int i2;
        java.util.Set b02;
        f1.J j3;
        java.util.Map map;
        java.util.Set set;
        java.util.Set set2;
        java.util.Iterator it;
        f1.J j4;
        java.util.Map map2;
        java.lang.Object c2;
        j2.getClass();
        if (abstractC0931b instanceof f1.v) {
            vVar = (f1.v) abstractC0931b;
            int i3 = vVar.f2892k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vVar.f2892k = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = vVar.f2890i;
                l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                i2 = vVar.f2892k;
                if (i2 != 0) {
                    a.AbstractC0059a.A(obj);
                    b02 = list != null ? i1.AbstractC0190i.b0(list) : null;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    vVar.f2885d = j2;
                    vVar.f2886e = b02;
                    vVar.f2887f = linkedHashMap;
                    vVar.f2892k = 1;
                    android.content.Context context = j2.f2815a;
                    if (context == null) {
                        kotlin.jvm.internal.i.i("context");
                        throw null;
                    }
                    java.lang.Object c3 = C1.s.c(new Z0.h(17, ((F.InterfaceC0009i) f1.K.a(context).f88b).getData()), vVar);
                    if (c3 == enumC0927a) {
                        return enumC0927a;
                    }
                    j3 = j2;
                    map = linkedHashMap;
                    obj = c3;
                } else if (i2 == 1) {
                    map = vVar.f2887f;
                    b02 = vVar.f2886e;
                    j3 = vVar.f2885d;
                    a.AbstractC0059a.A(obj);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    I.d dVar = vVar.f2889h;
                    it = vVar.f2888g;
                    map2 = vVar.f2887f;
                    set2 = vVar.f2886e;
                    j4 = vVar.f2885d;
                    a.AbstractC0059a.A(obj);
                    if (f1.K.b(dVar.f648a, obj, set2) && (c2 = f1.K.c(obj, j4.f2817c)) != null) {
                        map2.put(dVar.f648a, c2);
                    }
                    if (it.hasNext()) {
                        dVar = (I.d) it.next();
                        vVar.f2885d = j4;
                        vVar.f2886e = set2;
                        vVar.f2887f = map2;
                        vVar.f2888g = it;
                        vVar.f2889h = dVar;
                        vVar.f2892k = 2;
                        android.content.Context context2 = j4.f2815a;
                        if (context2 == null) {
                            kotlin.jvm.internal.i.i("context");
                            throw null;
                        }
                        obj = C1.s.c(new f1.C0128o(((F.InterfaceC0009i) f1.K.a(context2).f88b).getData(), dVar, 3), vVar);
                        if (obj == enumC0927a) {
                            return enumC0927a;
                        }
                        if (f1.K.b(dVar.f648a, obj, set2)) {
                            map2.put(dVar.f648a, c2);
                        }
                        if (it.hasNext()) {
                            return map2;
                        }
                    }
                }
                set = (java.util.Set) obj;
                if (set != null) {
                    return map;
                }
                set2 = b02;
                it = set.iterator();
                j4 = j3;
                map2 = map;
                if (it.hasNext()) {
                }
            }
        }
        vVar = new f1.v(j2, abstractC0931b);
        java.lang.Object obj2 = vVar.f2890i;
        l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
        i2 = vVar.f2892k;
        if (i2 != 0) {
        }
        set = (java.util.Set) obj2;
        if (set != null) {
        }
    }

    @Override // f1.InterfaceC0120g
    public final void a(java.lang.String str, boolean z2, f1.C0121h c0121h) {
        z1.AbstractC1068v.j(new f1.B(str, this, z2, null));
    }

    @Override // f1.InterfaceC0120g
    public final java.lang.Double b(java.lang.String str, f1.C0121h c0121h) {
        kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
        z1.AbstractC1068v.j(new f1.r(str, this, pVar, null));
        return (java.lang.Double) pVar.f7960a;
    }

    @Override // f1.InterfaceC0120g
    public final java.lang.Long c(java.lang.String str, f1.C0121h c0121h) {
        kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
        z1.AbstractC1068v.j(new f1.t(str, this, pVar, null));
        return (java.lang.Long) pVar.f7960a;
    }

    @Override // f1.InterfaceC0120g
    public final java.util.ArrayList d(java.lang.String str, f1.C0121h c0121h) {
        java.util.List list;
        java.lang.String p2 = p(str, c0121h);
        java.util.ArrayList arrayList = null;
        if (p2 != null && !y1.o.K(p2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false) && y1.o.K(p2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) && (list = (java.util.List) f1.K.c(p2, this.f2817c)) != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (obj instanceof java.lang.String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // f1.InterfaceC0120g
    public final void e(java.lang.String str, java.lang.String str2, f1.C0121h c0121h) {
        z1.AbstractC1068v.j(new f1.F(this, str, str2, null));
    }

    @Override // f1.InterfaceC0120g
    public final void f(java.lang.String str, java.util.List list, f1.C0121h c0121h) {
        z1.AbstractC1068v.j(new f1.C(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f2817c.h(list)), null));
    }

    @Override // f1.InterfaceC0120g
    public final void g(java.lang.String str, double d2, f1.C0121h c0121h) {
        z1.AbstractC1068v.j(new f1.E(str, this, d2, null));
    }

    @Override // f1.InterfaceC0120g
    public final f1.O h(java.lang.String str, f1.C0121h c0121h) {
        java.lang.String p2 = p(str, c0121h);
        if (p2 == null) {
            return null;
        }
        if (y1.o.K(p2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false)) {
            return new f1.O(p2, f1.M.JSON_ENCODED);
        }
        return y1.o.K(p2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false) ? new f1.O(null, f1.M.PLATFORM_ENCODED) : new f1.O(null, f1.M.UNEXPECTED_STRING);
    }

    @Override // f1.InterfaceC0120g
    public final void j(java.lang.String str, java.lang.String str2, f1.C0121h c0121h) {
        z1.AbstractC1068v.j(new f1.I(this, str, str2, null));
    }

    @Override // f1.InterfaceC0120g
    public final void k(java.util.List list, f1.C0121h c0121h) {
        z1.AbstractC1068v.j(new f1.C0123j(this, list, null));
    }

    @Override // f1.InterfaceC0120g
    public final java.util.List l(java.util.List list, f1.C0121h c0121h) {
        return i1.AbstractC0190i.X(((java.util.Map) z1.AbstractC1068v.j(new f1.u(this, list, null))).keySet());
    }

    @Override // f1.InterfaceC0120g
    public final java.util.Map m(java.util.List list, f1.C0121h c0121h) {
        return (java.util.Map) z1.AbstractC1068v.j(new f1.C0125l(this, list, null));
    }

    @Override // W0.b
    public final void onAttachedToEngine(W0.a binding) {
        kotlin.jvm.internal.i.e(binding, "binding");
        a1.f fVar = binding.f1828b;
        kotlin.jvm.internal.i.d(fVar, "getBinaryMessenger(...)");
        android.content.Context context = binding.f1827a;
        kotlin.jvm.internal.i.d(context, "getApplicationContext(...)");
        this.f2815a = context;
        try {
            f1.InterfaceC0120g.f2838P.getClass();
            f1.C0119f.b(fVar, this, "data_store");
            this.f2816b = new I0.b(fVar, context, this.f2817c);
        } catch (java.lang.Exception e2) {
            android.util.Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e2);
        }
        new f1.C0114a().onAttachedToEngine(binding);
    }

    @Override // W0.b
    public final void onDetachedFromEngine(W0.a binding) {
        kotlin.jvm.internal.i.e(binding, "binding");
        a1.f fVar = binding.f1828b;
        kotlin.jvm.internal.i.d(fVar, "getBinaryMessenger(...)");
        f1.InterfaceC0120g.f2838P.getClass();
        f1.C0119f.b(fVar, null, "data_store");
        I0.b bVar = this.f2816b;
        if (bVar != null) {
            f1.C0119f.b((a1.f) bVar.f657b, null, "shared_preferences");
        }
        this.f2816b = null;
    }

    @Override // f1.InterfaceC0120g
    public final java.lang.String p(java.lang.String str, f1.C0121h c0121h) {
        kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
        z1.AbstractC1068v.j(new f1.x(str, this, pVar, null));
        return (java.lang.String) pVar.f7960a;
    }

    @Override // f1.InterfaceC0120g
    public final java.lang.Boolean q(java.lang.String str, f1.C0121h c0121h) {
        kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p();
        z1.AbstractC1068v.j(new f1.p(str, this, pVar, null));
        return (java.lang.Boolean) pVar.f7960a;
    }

    @Override // f1.InterfaceC0120g
    public final void r(java.lang.String str, long j2, f1.C0121h c0121h) {
        z1.AbstractC1068v.j(new f1.H(str, this, j2, null));
    }
}
