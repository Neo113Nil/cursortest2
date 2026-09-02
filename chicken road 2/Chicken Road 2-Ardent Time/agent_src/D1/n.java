package D1;

/* loaded from: classes.dex */
public final class n extends m1.AbstractC0931b implements C1.e {

    /* renamed from: d, reason: collision with root package name */
    public final C1.e f242d;

    /* renamed from: e, reason: collision with root package name */
    public final k1.i f243e;

    /* renamed from: f, reason: collision with root package name */
    public final int f244f;

    /* renamed from: g, reason: collision with root package name */
    public k1.i f245g;

    /* renamed from: h, reason: collision with root package name */
    public k1.d f246h;

    public n(C1.e eVar, k1.i iVar) {
        super(D1.k.f239a, k1.j.f7951a);
        this.f242d = eVar;
        this.f243e = iVar;
        this.f244f = ((java.lang.Number) iVar.k(0, D1.m.f241e)).intValue();
    }

    @Override // C1.e
    public final java.lang.Object a(java.lang.Object obj, k1.d dVar) {
        try {
            java.lang.Object i2 = i(dVar, obj);
            return i2 == l1.EnumC0927a.f8017a ? i2 : h1.C0177i.f3302a;
        } catch (java.lang.Throwable th) {
            this.f245g = new D1.i(th, dVar.getContext());
            throw th;
        }
    }

    @Override // m1.AbstractC0931b
    public final java.lang.StackTraceElement e() {
        return null;
    }

    @Override // m1.AbstractC0931b, m1.InterfaceC0932c
    public final m1.InterfaceC0932c f() {
        k1.d dVar = this.f246h;
        if (dVar instanceof m1.InterfaceC0932c) {
            return (m1.InterfaceC0932c) dVar;
        }
        return null;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        java.lang.Throwable a2 = h1.AbstractC0174f.a(obj);
        if (a2 != null) {
            this.f245g = new D1.i(a2, getContext());
        }
        k1.d dVar = this.f246h;
        if (dVar != null) {
            dVar.l(obj);
        }
        return l1.EnumC0927a.f8017a;
    }

    @Override // m1.AbstractC0931b, k1.d
    public final k1.i getContext() {
        k1.i iVar = this.f245g;
        return iVar == null ? k1.j.f7951a : iVar;
    }

    public final java.lang.Object i(k1.d dVar, java.lang.Object obj) {
        java.util.List list;
        java.lang.Comparable comparable;
        java.lang.String str;
        k1.i context = dVar.getContext();
        z1.P p2 = (z1.P) context.m(z1.C1066t.f8592b);
        if (p2 != null && !p2.b()) {
            throw ((z1.Z) p2).z();
        }
        k1.i iVar = this.f245g;
        if (iVar != context) {
            int i2 = 0;
            if (iVar instanceof D1.i) {
                java.lang.String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((D1.i) iVar).f237a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.i.e(str2, "<this>");
                y1.d dVar2 = new y1.d(str2);
                if (dVar2.hasNext()) {
                    java.lang.Object next = dVar2.next();
                    if (dVar2.hasNext()) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(next);
                        while (dVar2.hasNext()) {
                            arrayList.add(dVar2.next());
                        }
                        list = arrayList;
                    } else {
                        list = u0.AbstractC0995a.q(next);
                    }
                } else {
                    list = i1.C0199r.f3325a;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (!y1.g.T((java.lang.String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(i1.AbstractC0192k.K(arrayList2));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it.next();
                    int length = str3.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i3 = -1;
                            break;
                        }
                        if (!u0.AbstractC0995a.p(str3.charAt(i3))) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 == -1) {
                        i3 = str3.length();
                    }
                    arrayList3.add(java.lang.Integer.valueOf(i3));
                }
                java.util.Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    comparable = (java.lang.Comparable) it2.next();
                    while (it2.hasNext()) {
                        java.lang.Comparable comparable2 = (java.lang.Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                java.lang.Integer num = (java.lang.Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                list.size();
                int size = list.size() - 1;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj3 : list) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        i1.AbstractC0191j.J();
                        throw null;
                    }
                    java.lang.String str4 = (java.lang.String) obj3;
                    if ((i2 == 0 || i2 == size) && y1.g.T(str4)) {
                        str = null;
                    } else {
                        kotlin.jvm.internal.i.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new java.lang.IllegalArgumentException(B1.a.g(intValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        kotlin.jvm.internal.i.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList4.add(str);
                    }
                    i2 = i4;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
                i1.AbstractC0190i.O(arrayList4, sb, "\n", "", "", -1, "...", null);
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            if (((java.lang.Number) context.k(0, new D1.q(this))).intValue() != this.f244f) {
                throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f243e + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f245g = context;
        }
        this.f246h = dVar;
        D1.o oVar = D1.p.f248a;
        C1.e eVar = this.f242d;
        kotlin.jvm.internal.i.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        oVar.getClass();
        java.lang.Object a2 = eVar.a(obj, this);
        if (!kotlin.jvm.internal.i.a(a2, l1.EnumC0927a.f8017a)) {
            this.f246h = null;
        }
        return a2;
    }
}
