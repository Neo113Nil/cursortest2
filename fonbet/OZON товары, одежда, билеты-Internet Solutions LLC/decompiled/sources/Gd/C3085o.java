package Gd;

import Cd.C2756q;
import Jd.InterfaceC3391a;
import Sc.InterfaceC4008j;
import ce.AbstractC5814a;
import fe.InterfaceC6543w;
import ie.C7056e;
import ie.InterfaceC7061j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import je.A0;
import je.AbstractC7370b;
import je.G0;
import je.L0;
import je.o0;
import kd.C7665d;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import sd.C9658A;
import td.AbstractC9853s;
import td.C9819J;
import td.C9852r;
import td.EnumC9812C;
import td.EnumC9840f;
import td.InterfaceC9815F;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.b0;
import td.g0;
import td.i0;
import td.n0;
import td.s0;
import te.C9865a;
import ud.InterfaceC10025c;
import ud.InterfaceC10030h;
import wd.AbstractC10529o;

/* renamed from: Gd.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3085o extends AbstractC10529o implements Ed.c {

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private static final Set<String> f10043w;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Fd.k f10044g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Jd.g f10045h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC9839e f10046i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Fd.k f10047j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f10048k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final EnumC9840f f10049l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final EnumC9812C f10050m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final s0 f10051n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f10052o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final a f10053p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final C3070B f10054q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final td.b0<C3070B> f10055r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final ce.h f10056s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final d0 f10057t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final Fd.g f10058u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j<List<i0>> f10059v;

    /* renamed from: Gd.o$a */
    private final class a extends AbstractC7370b {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final InterfaceC7061j<List<i0>> f10060c;

        public a() {
            super(C3085o.this.f10047j.e());
            this.f10060c = ((C7056e) C3085o.this.f10047j.e()).a(new C3084n(C3085o.this));
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
        
            if (r8 == null) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0081  */
        @Override // je.AbstractC7394n
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected final Collection<je.N> d() {
            String b11;
            Sd.c cVar;
            Sd.c topLevelClassFqName;
            InterfaceC9839e interfaceC9839e;
            ArrayList arrayList;
            je.Y e11;
            C3085o c3085o = C3085o.this;
            Collection<Jd.j> o11 = c3085o.M0().o();
            ArrayList arrayList2 = new ArrayList(o11.size());
            ArrayList arrayList3 = new ArrayList(0);
            InterfaceC10030h annotations = c3085o.getAnnotations();
            Sd.c PURELY_IMPLEMENTS_ANNOTATION = Cd.F.f4703n;
            Intrinsics.checkNotNullExpressionValue(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
            InterfaceC10025c j11 = ((Fd.g) annotations).j(PURELY_IMPLEMENTS_ANNOTATION);
            if (j11 != null) {
                Object C02 = C7714v.C0(j11.b().values());
                Xd.x xVar = C02 instanceof Xd.x ? (Xd.x) C02 : null;
                if (xVar != null && (b11 = xVar.b()) != null && Sd.e.a(b11)) {
                    cVar = new Sd.c(b11);
                    if (cVar != null || cVar.d() || !cVar.i(qd.s.f81864k)) {
                        cVar = null;
                    }
                    if (cVar != null) {
                        int i11 = C2756q.f4769c;
                        topLevelClassFqName = C2756q.b(Zd.e.g(c3085o));
                    } else {
                        topLevelClassFqName = cVar;
                    }
                    InterfaceC9815F d11 = c3085o.f10047j.d();
                    Bd.c location = Bd.c.FROM_JAVA_LOADER;
                    int i12 = Zd.e.f35896a;
                    Intrinsics.checkNotNullParameter(d11, "<this>");
                    Intrinsics.checkNotNullParameter(topLevelClassFqName, "topLevelClassFqName");
                    Intrinsics.checkNotNullParameter(location, "location");
                    topLevelClassFqName.d();
                    Sd.c e12 = topLevelClassFqName.e();
                    Intrinsics.checkNotNullExpressionValue(e12, "parent(...)");
                    ce.l p11 = ((wd.L) d11).v(e12).p();
                    Sd.f g10 = topLevelClassFqName.g();
                    Intrinsics.checkNotNullExpressionValue(g10, "shortName(...)");
                    InterfaceC9842h d12 = ((AbstractC5814a) p11).d(g10, location);
                    interfaceC9839e = !(d12 instanceof InterfaceC9839e) ? (InterfaceC9839e) d12 : null;
                    if (interfaceC9839e != null) {
                        int size = interfaceC9839e.k().getParameters().size();
                        List<i0> parameters = ((a) c3085o.k()).getParameters();
                        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                        int size2 = parameters.size();
                        if (size2 == size) {
                            List<i0> list = parameters;
                            arrayList = new ArrayList(C7714v.z(list, 10));
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new A0(((i0) it.next()).q(), L0.INVARIANT));
                            }
                        } else if (size2 == 1 && size > 1 && cVar == null) {
                            A0 a02 = new A0(((i0) C7714v.B0(parameters)).q(), L0.INVARIANT);
                            IntRange intRange = new IntRange(1, size, 1);
                            ArrayList arrayList4 = new ArrayList(C7714v.z(intRange, 10));
                            C7665d it2 = intRange.iterator();
                            while (it2.hasNext()) {
                                it2.b();
                                arrayList4.add(a02);
                            }
                            arrayList = arrayList4;
                        }
                        o0.f69907b.getClass();
                        e11 = je.Q.e(o0.f69908c, interfaceC9839e, arrayList);
                        for (Jd.j jVar : o11) {
                            je.N c11 = c3085o.f10047j.a().r().c(c3085o.f10047j.g().e(jVar, Hd.b.d(G0.SUPERTYPE, false, null, 7)), c3085o.f10047j);
                            if (c11.H0().p() instanceof C9819J.b) {
                                arrayList3.add(jVar);
                            }
                            if (!Intrinsics.d(c11.H0(), e11 != null ? e11.H0() : null) && !qd.m.R(c11)) {
                                arrayList2.add(c11);
                            }
                        }
                        InterfaceC9839e interfaceC9839e2 = c3085o.f10046i;
                        C9865a.a(arrayList2, interfaceC9839e2 != null ? C9658A.a(interfaceC9839e2, c3085o).c().l(interfaceC9839e2.q(), L0.INVARIANT) : null);
                        C9865a.a(arrayList2, e11);
                        if (arrayList3.isEmpty()) {
                            return !arrayList2.isEmpty() ? C7714v.U0(arrayList2) : C7714v.a0(((wd.L) c3085o.f10047j.d()).n().i());
                        }
                        InterfaceC6543w c12 = c3085o.f10047j.a().c();
                        ArrayList arrayList5 = new ArrayList(C7714v.z(arrayList3, 10));
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            Jd.w wVar = (Jd.w) it3.next();
                            Intrinsics.g(wVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                            arrayList5.add(((Jd.j) wVar).m());
                        }
                        ((yd.i) c12).a(c3085o, arrayList5);
                        throw null;
                    }
                    e11 = null;
                    while (r1.hasNext()) {
                    }
                    InterfaceC9839e interfaceC9839e22 = c3085o.f10046i;
                    C9865a.a(arrayList2, interfaceC9839e22 != null ? C9658A.a(interfaceC9839e22, c3085o).c().l(interfaceC9839e22.q(), L0.INVARIANT) : null);
                    C9865a.a(arrayList2, e11);
                    if (arrayList3.isEmpty()) {
                    }
                }
            }
            cVar = null;
            if (cVar != null) {
            }
            cVar = null;
            if (cVar != null) {
            }
            InterfaceC9815F d112 = c3085o.f10047j.d();
            Bd.c location2 = Bd.c.FROM_JAVA_LOADER;
            int i122 = Zd.e.f35896a;
            Intrinsics.checkNotNullParameter(d112, "<this>");
            Intrinsics.checkNotNullParameter(topLevelClassFqName, "topLevelClassFqName");
            Intrinsics.checkNotNullParameter(location2, "location");
            topLevelClassFqName.d();
            Sd.c e122 = topLevelClassFqName.e();
            Intrinsics.checkNotNullExpressionValue(e122, "parent(...)");
            ce.l p112 = ((wd.L) d112).v(e122).p();
            Sd.f g102 = topLevelClassFqName.g();
            Intrinsics.checkNotNullExpressionValue(g102, "shortName(...)");
            InterfaceC9842h d122 = ((AbstractC5814a) p112).d(g102, location2);
            if (!(d122 instanceof InterfaceC9839e)) {
            }
            if (interfaceC9839e != null) {
            }
            e11 = null;
            while (r1.hasNext()) {
            }
            InterfaceC9839e interfaceC9839e222 = c3085o.f10046i;
            C9865a.a(arrayList2, interfaceC9839e222 != null ? C9658A.a(interfaceC9839e222, c3085o).c().l(interfaceC9839e222.q(), L0.INVARIANT) : null);
            C9865a.a(arrayList2, e11);
            if (arrayList3.isEmpty()) {
            }
        }

        @Override // je.AbstractC7394n
        @NotNull
        protected final g0 g() {
            return C3085o.this.f10047j.a().v();
        }

        @Override // je.s0
        @NotNull
        public final List<i0> getParameters() {
            return this.f10060c.invoke();
        }

        @Override // je.AbstractC7370b
        @NotNull
        /* renamed from: l */
        public final InterfaceC9839e p() {
            return C3085o.this;
        }

        @Override // je.AbstractC7370b, je.s0
        public final InterfaceC9842h p() {
            return C3085o.this;
        }

        @Override // je.s0
        public final boolean q() {
            return true;
        }

        @NotNull
        public final String toString() {
            String b11 = C3085o.this.getName().b();
            Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
            return b11;
        }
    }

    /* renamed from: Gd.o$b */
    /* loaded from: classes10.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t2, T t11) {
            return Vc.a.b(Zd.e.g((InterfaceC9839e) t2).b(), Zd.e.g((InterfaceC9839e) t11).b());
        }
    }

    static {
        String[] elements = {"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f10043w = C7705l.j0(elements);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3085o(@NotNull Fd.k outerContext, @NotNull InterfaceC9845k containingDeclaration, @NotNull Jd.g jClass, InterfaceC9839e interfaceC9839e) {
        super(outerContext.e(), containingDeclaration, jClass.getName(), ((yd.k) outerContext.a().t()).a(jClass));
        EnumC9812C enumC9812C;
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f10044g = outerContext;
        this.f10045h = jClass;
        this.f10046i = interfaceC9839e;
        Fd.k a11 = Fd.c.a(outerContext, this, jClass, 4);
        this.f10047j = a11;
        a11.a().h().getClass();
        this.f10048k = Sc.k.b(new C3081k(this));
        this.f10049l = jClass.p() ? EnumC9840f.ANNOTATION_CLASS : jClass.F() ? EnumC9840f.INTERFACE : jClass.A() ? EnumC9840f.ENUM_CLASS : EnumC9840f.CLASS;
        if (jClass.p() || jClass.A()) {
            enumC9812C = EnumC9812C.FINAL;
        } else {
            EnumC9812C.a aVar = EnumC9812C.Companion;
            boolean n11 = jClass.n();
            boolean z11 = jClass.n() || jClass.isAbstract() || jClass.F();
            boolean isFinal = jClass.isFinal();
            aVar.getClass();
            enumC9812C = n11 ? EnumC9812C.SEALED : z11 ? EnumC9812C.ABSTRACT : !isFinal ? EnumC9812C.OPEN : EnumC9812C.FINAL;
        }
        this.f10050m = enumC9812C;
        this.f10051n = jClass.getVisibility();
        this.f10052o = (jClass.w() == null || jClass.g()) ? false : true;
        this.f10053p = new a();
        C3070B c3070b = new C3070B(a11, this, jClass, interfaceC9839e != null, null);
        this.f10054q = c3070b;
        b0.a aVar2 = td.b0.f99383e;
        ie.o storageManager = a11.e();
        ke.h kotlinTypeRefinerForOwnerModule = ((ke.r) a11.a().k()).b();
        C3082l scopeFactory = new C3082l(this);
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(this, "classDescriptor");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
        Intrinsics.checkNotNullParameter(scopeFactory, "scopeFactory");
        this.f10055r = new td.b0<>(this, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule);
        this.f10056s = new ce.h(c3070b);
        this.f10057t = new d0(a11, jClass, this);
        this.f10058u = Fd.h.a(a11, jClass);
        this.f10059v = ((C7056e) a11.e()).a(new C3083m(this));
    }

    static List H0(C3085o c3085o) {
        Sd.b classId = Zd.e.f(c3085o);
        if (classId != null) {
            c3085o.f10044g.a().f().getClass();
            Intrinsics.checkNotNullParameter(classId, "classId");
        }
        return null;
    }

    static C3070B I0(C3085o c3085o, ke.h it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new C3070B(c3085o.f10047j, c3085o, c3085o.f10045h, c3085o.f10046i != null, c3085o.f10054q);
    }

    static ArrayList J0(C3085o c3085o) {
        ArrayList<Jd.x> typeParameters = c3085o.f10045h.getTypeParameters();
        ArrayList arrayList = new ArrayList(C7714v.z(typeParameters, 10));
        for (Jd.x xVar : typeParameters) {
            i0 a11 = c3085o.f10047j.f().a(xVar);
            if (a11 == null) {
                throw new AssertionError("Parameter " + xVar + " surely belongs to class " + c3085o.f10045h + ", so it must be resolved");
            }
            arrayList.add(a11);
        }
        return arrayList;
    }

    @Override // td.InterfaceC9839e
    public final boolean E0() {
        return false;
    }

    @Override // wd.AbstractC10516b, td.InterfaceC9839e
    @NotNull
    public final ce.l H() {
        return this.f10056s;
    }

    @Override // wd.AbstractC10516b, td.InterfaceC9839e
    public final ce.l I() {
        return (C3070B) super.I();
    }

    @NotNull
    public final C3085o K0(InterfaceC9839e interfaceC9839e) {
        Dd.k javaResolverCache = Dd.k.f6583a;
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        Fd.k kVar = this.f10047j;
        Fd.d components = kVar.a().x();
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(components, "components");
        Fd.k kVar2 = new Fd.k(components, kVar.f(), kVar.c());
        InterfaceC9845k d11 = d();
        Intrinsics.checkNotNullExpressionValue(d11, "getContainingDeclaration(...)");
        return new C3085o(kVar2, d11, this.f10045h, interfaceC9839e);
    }

    @Override // td.InterfaceC9839e
    @NotNull
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public final List<InterfaceC9838d> l() {
        return this.f10054q.b0().invoke();
    }

    @NotNull
    public final Jd.g M0() {
        return this.f10045h;
    }

    public final List<InterfaceC3391a> N0() {
        return (List) this.f10048k.getValue();
    }

    @NotNull
    public final C3070B O0() {
        return (C3070B) super.I();
    }

    @Override // wd.G
    public final ce.l V(ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f10055r.b(kotlinTypeRefiner);
    }

    @Override // td.InterfaceC9839e
    public final n0<je.Y> e0() {
        return null;
    }

    @Override // td.InterfaceC9843i
    public final boolean g() {
        return this.f10052o;
    }

    @Override // td.InterfaceC9811B
    public final boolean g0() {
        return false;
    }

    @Override // ud.InterfaceC10023a
    @NotNull
    public final InterfaceC10030h getAnnotations() {
        return this.f10058u;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final EnumC9840f getKind() {
        return this.f10049l;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9811B, td.InterfaceC9849o
    @NotNull
    public final AbstractC9853s getVisibility() {
        AbstractC9853s abstractC9853s = C9852r.f99399a;
        s0 s0Var = this.f10051n;
        if (!Intrinsics.d(s0Var, abstractC9853s) || this.f10045h.w() != null) {
            return Cd.S.d(s0Var);
        }
        AbstractC9853s abstractC9853s2 = Cd.w.f4782a;
        Intrinsics.f(abstractC9853s2);
        return abstractC9853s2;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9811B
    @NotNull
    public final EnumC9812C h() {
        return this.f10050m;
    }

    @Override // td.InterfaceC9839e
    public final boolean isInline() {
        return false;
    }

    @Override // td.InterfaceC9839e
    public final boolean j0() {
        return false;
    }

    @Override // td.InterfaceC9842h
    @NotNull
    public final je.s0 k() {
        return this.f10053p;
    }

    @Override // td.InterfaceC9839e
    public final boolean l0() {
        return false;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final Collection<InterfaceC9839e> m() {
        if (this.f10050m != EnumC9812C.SEALED) {
            return kotlin.collections.K.f71697a;
        }
        Hd.a d11 = Hd.b.d(G0.COMMON, false, null, 7);
        Sequence<Jd.j> s11 = this.f10045h.s();
        ArrayList arrayList = new ArrayList();
        Iterator<Jd.j> it = s11.iterator();
        while (it.hasNext()) {
            InterfaceC9842h p11 = this.f10047j.g().e(it.next(), d11).H0().p();
            InterfaceC9839e interfaceC9839e = p11 instanceof InterfaceC9839e ? (InterfaceC9839e) p11 : null;
            if (interfaceC9839e != null) {
                arrayList.add(interfaceC9839e);
            }
        }
        return C7714v.I0(new b(), arrayList);
    }

    @Override // td.InterfaceC9811B
    public final boolean p0() {
        return false;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final ce.l q0() {
        return this.f10057t;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9843i
    @NotNull
    public final List<i0> r() {
        return this.f10059v.invoke();
    }

    @Override // td.InterfaceC9839e
    public final InterfaceC9839e r0() {
        return null;
    }

    @Override // td.InterfaceC9839e
    public final boolean s() {
        return false;
    }

    @NotNull
    public final String toString() {
        return "Lazy Java class " + Zd.e.h(this);
    }

    @Override // td.InterfaceC9839e
    public final InterfaceC9838d z() {
        return null;
    }
}
