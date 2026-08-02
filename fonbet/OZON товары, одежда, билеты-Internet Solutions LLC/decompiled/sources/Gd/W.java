package Gd;

import Bd.InterfaceC2627a;
import Dd.j;
import Jd.InterfaceC3390A;
import Kk.C3532b;
import ae.C4999a;
import ie.C7056e;
import ie.InterfaceC7059h;
import ie.InterfaceC7060i;
import ie.InterfaceC7061j;
import ie.InterfaceC7062k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import je.G0;
import je.K0;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.EnumC9812C;
import td.InterfaceC9831W;
import td.InterfaceC9834Z;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import td.i0;
import td.p0;
import td.q0;
import te.C9865a;
import ud.InterfaceC10030h;
import wd.AbstractC10539z;

/* loaded from: classes.dex */
public abstract class W extends ce.m {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f9980m = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(W.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(W.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(W.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Fd.k f9981b;

    /* renamed from: c, reason: collision with root package name */
    private final C3070B f9982c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j<Collection<InterfaceC9845k>> f9983d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j<InterfaceC3073c> f9984e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC7059h<Sd.f, Collection<td.c0>> f9985f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC7060i<Sd.f, InterfaceC9831W> f9986g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC7059h<Sd.f, Collection<td.c0>> f9987h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f9988i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f9989j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f9990k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC7059h<Sd.f, List<InterfaceC9831W>> f9991l;

    /* loaded from: classes10.dex */
    protected static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final je.N f9992a;

        /* renamed from: b, reason: collision with root package name */
        private final je.N f9993b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<p0> f9994c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final List<i0> f9995d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f9996e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final List<String> f9997f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull je.N returnType, je.N n11, @NotNull List<? extends p0> valueParameters, @NotNull List<? extends i0> typeParameters, boolean z11, @NotNull List<String> errors) {
            Intrinsics.checkNotNullParameter(returnType, "returnType");
            Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
            Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.f9992a = returnType;
            this.f9993b = n11;
            this.f9994c = valueParameters;
            this.f9995d = typeParameters;
            this.f9996e = z11;
            this.f9997f = errors;
        }

        @NotNull
        public final List<String> a() {
            return this.f9997f;
        }

        public final boolean b() {
            return this.f9996e;
        }

        public final je.N c() {
            return this.f9993b;
        }

        @NotNull
        public final je.N d() {
            return this.f9992a;
        }

        @NotNull
        public final List<i0> e() {
            return this.f9995d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f9992a, aVar.f9992a) && Intrinsics.d(this.f9993b, aVar.f9993b) && Intrinsics.d(this.f9994c, aVar.f9994c) && Intrinsics.d(this.f9995d, aVar.f9995d) && this.f9996e == aVar.f9996e && Intrinsics.d(this.f9997f, aVar.f9997f);
        }

        @NotNull
        public final List<p0> f() {
            return this.f9994c;
        }

        public final int hashCode() {
            int hashCode = this.f9992a.hashCode() * 31;
            je.N n11 = this.f9993b;
            return this.f9997f.hashCode() + C3532b.a(G.g.b(G.g.b((hashCode + (n11 == null ? 0 : n11.hashCode())) * 31, 31, this.f9994c), 31, this.f9995d), 31, this.f9996e);
        }

        @NotNull
        public final String toString() {
            return "MethodSignatureData(returnType=" + this.f9992a + ", receiverType=" + this.f9993b + ", valueParameters=" + this.f9994c + ", typeParameters=" + this.f9995d + ", hasStableParameterNames=" + this.f9996e + ", errors=" + this.f9997f + ')';
        }
    }

    /* loaded from: classes10.dex */
    protected static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<p0> f9998a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f9999b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull List<? extends p0> descriptors, boolean z11) {
            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
            this.f9998a = descriptors;
            this.f9999b = z11;
        }

        @NotNull
        public final List<p0> a() {
            return this.f9998a;
        }

        public final boolean b() {
            return this.f9999b;
        }
    }

    public W(@NotNull Fd.k c11, C3070B c3070b) {
        Intrinsics.checkNotNullParameter(c11, "c");
        this.f9981b = c11;
        this.f9982c = c3070b;
        this.f9983d = ((C7056e) c11.e()).k(new J(this), kotlin.collections.K.f71697a);
        this.f9984e = ((C7056e) c11.e()).a(new M(this));
        this.f9985f = ((C7056e) c11.e()).d(new N(this));
        this.f9986g = ((C7056e) c11.e()).j(new O(this));
        this.f9987h = ((C7056e) c11.e()).d(new P(this));
        this.f9988i = ((C7056e) c11.e()).a(new Q(this));
        this.f9989j = ((C7056e) c11.e()).a(new S(this));
        this.f9990k = ((C7056e) c11.e()).a(new T(this));
        this.f9991l = ((C7056e) c11.e()).d(new U(this));
    }

    @NotNull
    protected static b E(@NotNull Fd.k c11, @NotNull AbstractC10539z abstractC10539z, @NotNull List jValueParameters) {
        Pair pair;
        Sd.f name;
        Intrinsics.checkNotNullParameter(c11, "c");
        AbstractC10539z function = abstractC10539z;
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(jValueParameters, "jValueParameters");
        kotlin.collections.O a12 = C7714v.a1(jValueParameters);
        ArrayList arrayList = new ArrayList(C7714v.z(a12, 10));
        Iterator it = a12.iterator();
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            kotlin.collections.P p11 = (kotlin.collections.P) it;
            if (!p11.hasNext()) {
                return new b(C7714v.U0(arrayList), z12);
            }
            IndexedValue indexedValue = (IndexedValue) p11.next();
            int f71694a = indexedValue.getF71694a();
            InterfaceC3390A interfaceC3390A = (InterfaceC3390A) indexedValue.b();
            Fd.g a11 = Fd.h.a(c11, interfaceC3390A);
            Hd.a d11 = Hd.b.d(G0.COMMON, z11, null, 7);
            if (interfaceC3390A.a()) {
                Jd.w type = interfaceC3390A.getType();
                Jd.f fVar = type instanceof Jd.f ? (Jd.f) type : null;
                if (fVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + interfaceC3390A);
                }
                K0 d12 = c11.g().d(fVar, d11, true);
                pair = new Pair(d12, ((wd.L) c11.d()).n().k(d12));
            } else {
                pair = new Pair(c11.g().e(interfaceC3390A.getType(), d11), null);
            }
            je.N n11 = (je.N) pair.a();
            je.N n12 = (je.N) pair.b();
            if (Intrinsics.d(function.getName().b(), "equals") && jValueParameters.size() == 1 && ((wd.L) c11.d()).n().C().equals(n11)) {
                name = Sd.f.f("other");
            } else {
                name = interfaceC3390A.getName();
                if (name == null) {
                    z12 = true;
                }
                if (name == null) {
                    name = Sd.f.f("p" + f71694a);
                    Intrinsics.checkNotNullExpressionValue(name, "identifier(...)");
                }
            }
            boolean z13 = z12;
            boolean z14 = z11;
            arrayList.add(new wd.c0(function, null, f71694a, a11, name, n11, false, false, false, n12, ((yd.k) c11.a().t()).a(interfaceC3390A)));
            function = abstractC10539z;
            z12 = z13;
            z11 = z14;
        }
    }

    static InterfaceC7062k h(W w11, Jd.n nVar, kotlin.jvm.internal.M m11) {
        return ((C7056e) w11.f9981b.e()).b(new L(w11, nVar, m11));
    }

    static Xd.g i(W w11, Jd.n field, kotlin.jvm.internal.M m11) {
        Dd.j g10 = w11.f9981b.a().g();
        InterfaceC9831W descriptor = (InterfaceC9831W) m11.f71787a;
        ((j.a) g10).getClass();
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    static Collection j(W w11, Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        C3070B c3070b = w11.f9982c;
        if (c3070b != null) {
            return ((W) c3070b).f9985f.invoke(name);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Jd.q> it = w11.f9984e.invoke().f(name).iterator();
        while (it.hasNext()) {
            Ed.e D11 = w11.D(it.next());
            if (w11.B(D11)) {
                w11.f9981b.a().h().getClass();
                arrayList.add(D11);
            }
        }
        w11.p(name, arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [Ed.f, T, java.lang.Object, wd.Q] */
    /* JADX WARN: Type inference failed for: r3v15, types: [T, wd.Q] */
    static InterfaceC9831W k(W w11, Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        C3070B c3070b = w11.f9982c;
        if (c3070b != null) {
            return ((W) c3070b).f9986g.invoke(name);
        }
        Jd.n c11 = w11.f9984e.invoke().c(name);
        if (c11 == null || c11.E()) {
            return null;
        }
        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        boolean z11 = !c11.isFinal();
        Fd.k kVar = w11.f9981b;
        ?? R02 = Ed.f.R0(w11.A(), Fd.h.a(kVar, c11), EnumC9812C.FINAL, Cd.S.d(c11.getVisibility()), z11, c11.getName(), ((yd.k) kVar.a().t()).a(c11), c11.isFinal() && c11.g());
        Intrinsics.checkNotNullExpressionValue(R02, "create(...)");
        m11.f71787a = R02;
        R02.L0(null, null, null, null);
        je.N e11 = kVar.g().e(c11.getType(), Hd.b.d(G0.COMMON, false, null, 7));
        if ((qd.m.g0(e11) || qd.m.i0(e11)) && c11.isFinal()) {
            c11.g();
        }
        wd.Q q11 = (wd.Q) m11.f71787a;
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        q11.P0(e11, k11, w11.y(), null, k11);
        InterfaceC9845k A11 = w11.A();
        InterfaceC9839e interfaceC9839e = A11 instanceof InterfaceC9839e ? (InterfaceC9839e) A11 : null;
        if (interfaceC9839e != null) {
            m11.f71787a = ((C4999a) kVar.a().w()).a(interfaceC9839e, (wd.Q) m11.f71787a, kVar);
        }
        T t2 = m11.f71787a;
        if (Vd.i.E((q0) t2, ((wd.Q) t2).getType())) {
            ((wd.Q) m11.f71787a).C0(null, new K(w11, c11, m11));
        }
        kVar.a().h().a(c11, (InterfaceC9831W) m11.f71787a);
        return (InterfaceC9831W) m11.f71787a;
    }

    static Collection l(W w11, Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet(w11.f9985f.invoke(name));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : linkedHashSet) {
            String a11 = Ld.D.a((td.c0) obj, 2);
            Object obj2 = linkedHashMap.get(a11);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(a11, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                List list2 = list;
                Collection a12 = Vd.w.a(list2, V.f9979a);
                linkedHashSet.removeAll(list2);
                linkedHashSet.addAll(a12);
            }
        }
        w11.s(linkedHashSet, name);
        Fd.k kVar = w11.f9981b;
        return C7714v.U0(kVar.a().r().b(kVar, linkedHashSet));
    }

    static List m(W w11, Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ArrayList arrayList = new ArrayList();
        C9865a.a(arrayList, w11.f9986g.invoke(name));
        w11.t(name, arrayList);
        if (Vd.i.p(w11.A())) {
            return C7714v.U0(arrayList);
        }
        Fd.k kVar = w11.f9981b;
        return C7714v.U0(kVar.a().r().b(kVar, arrayList));
    }

    @NotNull
    protected static je.N r(@NotNull Jd.q method, @NotNull Fd.k c11) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(c11, "c");
        return c11.g().e(method.C(), Hd.b.d(G0.COMMON, method.v().p(), null, 6));
    }

    @NotNull
    protected abstract InterfaceC9845k A();

    protected boolean B(@NotNull Ed.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return true;
    }

    @NotNull
    protected abstract a C(@NotNull Jd.q qVar, @NotNull ArrayList arrayList, @NotNull je.N n11, @NotNull List list);

    @NotNull
    protected final Ed.e D(@NotNull Jd.q method) {
        Intrinsics.checkNotNullParameter(method, "method");
        Fd.k kVar = this.f9981b;
        Ed.e f12 = Ed.e.f1(A(), Fd.h.a(kVar, method), method.getName(), ((yd.k) kVar.a().t()).a(method), this.f9984e.invoke().d(method.getName()) != null && ((ArrayList) method.f()).isEmpty());
        Intrinsics.checkNotNullExpressionValue(f12, "createJavaMethod(...)");
        Fd.k b11 = Fd.c.b(kVar, f12, method, 0);
        ArrayList typeParameters = method.getTypeParameters();
        ArrayList arrayList = new ArrayList(C7714v.z(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            i0 a11 = b11.f().a((Jd.x) it.next());
            Intrinsics.f(a11);
            arrayList.add(a11);
        }
        b E11 = E(b11, f12, method.f());
        a C11 = C(method, arrayList, r(method, b11), E11.a());
        je.N c11 = C11.c();
        wd.U h11 = c11 != null ? Vd.h.h(f12, c11, InterfaceC10030h.a.b()) : null;
        InterfaceC9834Z y11 = y();
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        List<i0> e11 = C11.e();
        List<p0> f7 = C11.f();
        je.N d11 = C11.d();
        EnumC9812C.a aVar = EnumC9812C.Companion;
        boolean isAbstract = method.isAbstract();
        boolean isFinal = method.isFinal();
        aVar.getClass();
        f12.e1(h11, y11, k11, e11, f7, d11, isAbstract ? EnumC9812C.ABSTRACT : !isFinal ? EnumC9812C.OPEN : EnumC9812C.FINAL, Cd.S.d(method.getVisibility()), C11.c() != null ? kotlin.collections.U.i(new Pair(Ed.e.f7838G, C7714v.K(E11.a()))) : kotlin.collections.U.c());
        f12.g1(C11.b(), E11.b());
        if (C11.a().isEmpty()) {
            return f12;
        }
        b11.a().s().a(f12, C11.a());
        throw null;
    }

    @Override // ce.m, ce.l
    @NotNull
    public final Set<Sd.f> a() {
        return (Set) ie.n.a(this.f9988i, f9980m[0]);
    }

    @Override // ce.m, ce.l
    @NotNull
    public Collection b(@NotNull Sd.f name, @NotNull Bd.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !c().contains(name) ? kotlin.collections.K.f71697a : this.f9991l.invoke(name);
    }

    @Override // ce.m, ce.l
    @NotNull
    public final Set<Sd.f> c() {
        return (Set) ie.n.a(this.f9989j, f9980m[1]);
    }

    @Override // ce.m, ce.o
    @NotNull
    public Collection<InterfaceC9845k> e(@NotNull ce.d kindFilter, @NotNull Function1<? super Sd.f, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return this.f9983d.invoke();
    }

    @Override // ce.m, ce.l
    @NotNull
    public final Set<Sd.f> f() {
        return (Set) ie.n.a(this.f9990k, f9980m[2]);
    }

    @Override // ce.m, ce.l
    @NotNull
    public Collection<td.c0> g(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !a().contains(name) ? kotlin.collections.K.f71697a : this.f9987h.invoke(name);
    }

    @NotNull
    protected abstract Set<Sd.f> n(@NotNull ce.d dVar, Function1<? super Sd.f, Boolean> function1);

    @NotNull
    protected abstract Set<Sd.f> o(@NotNull ce.d dVar, Function1<? super Sd.f, Boolean> function1);

    protected void p(@NotNull Sd.f name, @NotNull ArrayList result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @NotNull
    protected abstract InterfaceC3073c q();

    protected abstract void s(@NotNull LinkedHashSet linkedHashSet, @NotNull Sd.f fVar);

    protected abstract void t(@NotNull Sd.f fVar, @NotNull ArrayList arrayList);

    @NotNull
    public String toString() {
        return "Lazy scope for " + A();
    }

    @NotNull
    protected abstract Set u(@NotNull ce.d dVar);

    @NotNull
    protected final InterfaceC7061j<Collection<InterfaceC9845k>> v() {
        return this.f9983d;
    }

    @NotNull
    protected final Fd.k w() {
        return this.f9981b;
    }

    @NotNull
    protected final InterfaceC7061j<InterfaceC3073c> x() {
        return this.f9984e;
    }

    protected abstract InterfaceC9834Z y();

    protected final W z() {
        return this.f9982c;
    }
}
