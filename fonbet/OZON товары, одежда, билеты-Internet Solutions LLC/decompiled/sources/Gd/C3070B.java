package Gd;

import Ad.C2379a;
import Bd.InterfaceC2627a;
import Cd.C2744e;
import Cd.C2747h;
import Cd.C2751l;
import Cd.InterfaceC2757s;
import Cd.t;
import Cd.x;
import Dd.p;
import Gd.W;
import Vd.n;
import ae.C4999a;
import fe.InterfaceC6543w;
import ie.C7056e;
import ie.InterfaceC7060i;
import ie.InterfaceC7061j;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je.AbstractC7394n;
import je.G0;
import je.H0;
import je.K0;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9853s;
import td.C9852r;
import td.EnumC9812C;
import td.InterfaceC9831W;
import td.InterfaceC9832X;
import td.InterfaceC9834Z;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import td.i0;
import td.p0;
import te.C9865a;
import ud.InterfaceC10030h;
import wd.C10534u;

/* renamed from: Gd.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3070B extends W {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f9930v = 0;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C3085o f9931n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final Jd.g f9932o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f9933p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j<List<InterfaceC9838d>> f9934q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j<Set<Sd.f>> f9935r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j<Set<Sd.f>> f9936s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j<Map<Sd.f, Jd.n>> f9937t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final InterfaceC7060i<Sd.f, InterfaceC9839e> f9938u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3070B(@NotNull Fd.k c11, @NotNull C3085o ownerDescriptor, @NotNull Jd.g jClass, boolean z11, C3070B c3070b) {
        super(c11, c3070b);
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f9931n = ownerDescriptor;
        this.f9932o = jClass;
        this.f9933p = z11;
        this.f9934q = ((C7056e) c11.e()).a(new C3086p(c11, this));
        this.f9935r = ((C7056e) c11.e()).a(new C3087q(this));
        this.f9936s = ((C7056e) c11.e()).a(new r(c11, this));
        this.f9937t = ((C7056e) c11.e()).a(new C3088s(this));
        this.f9938u = ((C7056e) c11.e()).j(new C3089t(c11, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0, types: [Gd.B, Gd.W] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [Ed.b] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [Ed.b, wd.n, wd.z] */
    static List H(Fd.k kVar, C3070B c3070b) {
        C3085o c3085o;
        Object obj;
        ?? r32;
        ?? r22;
        Object obj2;
        Pair pair;
        Collection<Jd.k> l11 = ((C3070B) c3070b).f9932o.l();
        ArrayList arrayList = new ArrayList(l11.size());
        Iterator<Jd.k> it = l11.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c3085o = ((C3070B) c3070b).f9931n;
            if (!hasNext) {
                break;
            }
            Jd.k next = it.next();
            Ed.b f12 = Ed.b.f1(c3085o, Fd.h.a(c3070b.w(), next), false, ((yd.k) c3070b.w().a().t()).a(next));
            Intrinsics.checkNotNullExpressionValue(f12, "createJavaConstructor(...)");
            Fd.k b11 = Fd.c.b(c3070b.w(), f12, next, c3085o.r().size());
            W.b E11 = W.E(b11, f12, next.f());
            List<i0> r11 = c3085o.r();
            Intrinsics.checkNotNullExpressionValue(r11, "getDeclaredTypeParameters(...)");
            List<i0> list = r11;
            ArrayList typeParameters = next.getTypeParameters();
            ArrayList arrayList2 = new ArrayList(C7714v.z(typeParameters, 10));
            Iterator it2 = typeParameters.iterator();
            while (it2.hasNext()) {
                i0 a11 = b11.f().a((Jd.x) it2.next());
                Intrinsics.f(a11);
                arrayList2.add(a11);
            }
            f12.e1(E11.a(), Cd.S.d(next.getVisibility()), C7714v.p0(arrayList2, list));
            f12.R0(false);
            f12.S0(E11.b());
            f12.W0(c3085o.q());
            b11.a().h().getClass();
            arrayList.add(f12);
        }
        Jd.g gVar = ((C3070B) c3070b).f9932o;
        if (gVar.x()) {
            Ed.b f13 = Ed.b.f1(c3085o, InterfaceC10030h.a.b(), true, ((yd.k) c3070b.w().a().t()).a(gVar));
            Intrinsics.checkNotNullExpressionValue(f13, "createJavaConstructor(...)");
            ArrayList<Jd.v> u11 = gVar.u();
            ArrayList arrayList3 = new ArrayList(u11.size());
            Hd.a d11 = Hd.b.d(G0.COMMON, false, null, 6);
            int i11 = 0;
            for (Jd.v vVar : u11) {
                ArrayList arrayList4 = arrayList3;
                arrayList4.add(new wd.c0(f13, null, i11, InterfaceC10030h.a.b(), vVar.getName(), c3070b.w().g().e(vVar.getType(), d11), false, false, false, null, ((yd.k) c3070b.w().a().t()).a(vVar)));
                d11 = d11;
                arrayList3 = arrayList4;
                i11++;
            }
            ArrayList arrayList5 = arrayList3;
            obj = null;
            f13.S0(false);
            AbstractC9853s PROTECTED_AND_PACKAGE = c3085o.getVisibility();
            Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE, "getVisibility(...)");
            if (PROTECTED_AND_PACKAGE.equals(Cd.w.f4783b)) {
                PROTECTED_AND_PACKAGE = Cd.w.f4784c;
                Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
            }
            f13.d1(arrayList5, PROTECTED_AND_PACKAGE);
            f13.R0(false);
            f13.W0(c3085o.q());
            String a12 = Ld.D.a(f13, 2);
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.d(Ld.D.a((InterfaceC9838d) it3.next(), 2), a12)) {
                        break;
                    }
                }
            }
            arrayList.add(f13);
            kVar.a().h().getClass();
        } else {
            obj = null;
        }
        ((C4999a) kVar.a().w()).f(c3085o, arrayList, kVar);
        Kd.e0 r12 = kVar.a().r();
        boolean isEmpty = arrayList.isEmpty();
        List list2 = arrayList;
        if (isEmpty) {
            boolean p11 = gVar.p();
            gVar.F();
            if (p11) {
                Ed.b f14 = Ed.b.f1(c3085o, InterfaceC10030h.a.b(), true, ((yd.k) c3070b.w().a().t()).a(gVar));
                Intrinsics.checkNotNullExpressionValue(f14, "createJavaConstructor(...)");
                if (p11) {
                    Collection<Jd.q> r13 = gVar.r();
                    r22 = new ArrayList(r13.size());
                    Hd.a d12 = Hd.b.d(G0.COMMON, true, null, 6);
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj3 : r13) {
                        if (Intrinsics.d(((Jd.q) obj3).getName(), Cd.F.f4691b)) {
                            arrayList6.add(obj3);
                        } else {
                            arrayList7.add(obj3);
                        }
                    }
                    Pair pair2 = new Pair(arrayList6, arrayList7);
                    List list3 = (List) pair2.a();
                    List<Jd.q> list4 = (List) pair2.b();
                    list3.size();
                    Jd.q qVar = (Jd.q) C7714v.M(list3);
                    if (qVar != null) {
                        Jd.w C11 = qVar.C();
                        if (C11 instanceof Jd.f) {
                            Jd.f fVar = (Jd.f) C11;
                            pair = new Pair(c3070b.w().g().d(fVar, d12, true), c3070b.w().g().e(fVar.B(), d12));
                        } else {
                            pair = new Pair(c3070b.w().g().e(C11, d12), obj);
                        }
                        Ed.b bVar = f14;
                        c3070b.P(r22, bVar, 0, qVar, (je.N) pair.a(), (je.N) pair.b());
                        r32 = bVar;
                    } else {
                        r32 = f14;
                    }
                    int i12 = qVar != null ? 1 : 0;
                    int i13 = 0;
                    for (Jd.q qVar2 : list4) {
                        c3070b.P(r22, r32, i13 + i12, qVar2, c3070b.w().g().e(qVar2.C(), d12), null);
                        i13++;
                    }
                } else {
                    r32 = f14;
                    r22 = Collections.EMPTY_LIST;
                }
                r32.S0(false);
                AbstractC9853s PROTECTED_AND_PACKAGE2 = c3085o.getVisibility();
                Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE2, "getVisibility(...)");
                if (PROTECTED_AND_PACKAGE2.equals(Cd.w.f4783b)) {
                    PROTECTED_AND_PACKAGE2 = Cd.w.f4784c;
                    Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE2, "PROTECTED_AND_PACKAGE");
                }
                r32.d1(r22, PROTECTED_AND_PACKAGE2);
                r32.R0(true);
                r32.W0(c3085o.q());
                c3070b.w().a().h().getClass();
                obj2 = r32;
            } else {
                obj2 = obj;
            }
            list2 = C7714v.c0(obj2);
        }
        return C7714v.U0(r12.b(kVar, list2));
    }

    static Set I(C3070B c3070b) {
        return C7714v.Y0(c3070b.f9932o.q());
    }

    static Set J(Fd.k kVar, C3070B c3070b) {
        return C7714v.Y0(((C4999a) kVar.a().w()).h(c3070b.f9931n, kVar));
    }

    static LinkedHashMap K(C3070B c3070b) {
        Collection<Jd.n> fields = c3070b.f9932o.getFields();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fields) {
            if (((Jd.n) obj).E()) {
                arrayList.add(obj);
            }
        }
        int h11 = kotlin.collections.U.h(C7714v.z(arrayList, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((Jd.n) next).getName(), next);
        }
        return linkedHashMap;
    }

    static InterfaceC9839e L(C3070B c3070b, Fd.k kVar, Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        boolean contains = c3070b.f9935r.invoke().contains(name);
        C3085o c3085o = c3070b.f9931n;
        if (contains) {
            InterfaceC2757s d11 = kVar.a().d();
            Sd.b f7 = Zd.e.f(c3085o);
            Intrinsics.f(f7);
            zd.u a11 = ((yd.d) d11).a(new InterfaceC2757s.a(f7.d(name), c3070b.f9932o, 2));
            if (a11 != null) {
                C3085o c3085o2 = new C3085o(kVar, c3085o, a11, null);
                ((t.a) kVar.a().e()).a(c3085o2);
                return c3085o2;
            }
        } else if (c3070b.f9936s.invoke().contains(name)) {
            Tc.b builder = C7714v.B();
            ((C4999a) kVar.a().w()).b(c3085o, name, builder, kVar);
            Intrinsics.checkNotNullParameter(builder, "builder");
            Tc.b B11 = builder.B();
            int f26995b = B11.getF26995b();
            if (f26995b != 0) {
                if (f26995b == 1) {
                    return (InterfaceC9839e) C7714v.B0(B11);
                }
                throw new IllegalStateException(("Multiple classes with same name are generated: " + B11).toString());
            }
        } else {
            Jd.n nVar = c3070b.f9937t.invoke().get(name);
            if (nVar != null) {
                return C10534u.G0(kVar.e(), c3070b.f9931n, name, ((C7056e) kVar.e()).a(new C3094y(c3070b)), Fd.h.a(kVar, nVar), ((yd.k) kVar.a().t()).a(nVar));
            }
        }
        return null;
    }

    static Collection M(td.c0 c0Var, C3070B c3070b, Sd.f accessorName) {
        Intrinsics.checkNotNullParameter(accessorName, "accessorName");
        if (Intrinsics.d(c0Var.getName(), accessorName)) {
            return C7714v.a0(c0Var);
        }
        return C7714v.p0(c3070b.i0(accessorName), c3070b.h0(accessorName));
    }

    static ArrayList N(C3070B c3070b, Sd.f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return c3070b.h0(it);
    }

    static ArrayList O(C3070B c3070b, Sd.f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return c3070b.i0(it);
    }

    private final void P(ArrayList arrayList, Ed.b bVar, int i11, Jd.q qVar, je.N n11, je.N n12) {
        InterfaceC10030h.a.C2208a b11 = InterfaceC10030h.a.b();
        Sd.f name = qVar.getName();
        K0 i12 = H0.i(n11);
        Intrinsics.checkNotNullExpressionValue(i12, "makeNotNullable(...)");
        arrayList.add(new wd.c0(bVar, null, i11, b11, name, i12, qVar.H(), false, false, n12 != null ? H0.i(n12) : null, ((yd.k) w().a().t()).a(qVar)));
    }

    private final void Q(LinkedHashSet linkedHashSet, Sd.f fVar, ArrayList arrayList, boolean z11) {
        InterfaceC6543w c11 = w().a().c();
        LinkedHashSet<td.c0> d11 = Dd.b.d(this.f9931n, fVar, ((ke.r) w().a().k()).a(), c11, arrayList, linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(d11, "resolveOverridesForNonStaticMembers(...)");
        if (!z11) {
            linkedHashSet.addAll(d11);
            return;
        }
        ArrayList p02 = C7714v.p0(d11, linkedHashSet);
        ArrayList arrayList2 = new ArrayList(C7714v.z(d11, 10));
        for (td.c0 c0Var : d11) {
            td.c0 c0Var2 = (td.c0) Cd.P.d(c0Var);
            if (c0Var2 != null) {
                c0Var = U(c0Var, c0Var2, p02);
            }
            arrayList2.add(c0Var);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0143 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void R(Sd.f fVar, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, Function1 function1) {
        td.c0 U10;
        Object obj;
        td.c0 c0Var;
        td.c0 U11;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            td.c0 c0Var2 = (td.c0) it.next();
            td.c0 c0Var3 = (td.c0) Cd.P.c(c0Var2);
            td.c0 c0Var4 = null;
            if (c0Var3 != null) {
                String b11 = Cd.P.b(c0Var3);
                Intrinsics.f(b11);
                Sd.f f7 = Sd.f.f(b11);
                Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
                Iterator it2 = ((Collection) function1.invoke(f7)).iterator();
                while (it2.hasNext()) {
                    InterfaceC9857w.a<? extends InterfaceC9857w> U12 = ((td.c0) it2.next()).U();
                    U12.o(fVar);
                    U12.r();
                    U12.d();
                    InterfaceC9857w build = U12.build();
                    Intrinsics.f(build);
                    td.c0 c0Var5 = (td.c0) build;
                    InterfaceC9857w n02 = C2744e.i(c0Var3) ? c0Var5.n0() : c0Var5;
                    Intrinsics.f(n02);
                    if (X(n02, c0Var3)) {
                        U10 = U(c0Var5, c0Var3, linkedHashSet);
                        break;
                    }
                }
            }
            U10 = null;
            C9865a.a(abstractSet, U10);
            InterfaceC9857w i11 = C2747h.i(c0Var2);
            if (i11 != null) {
                Sd.f name = i11.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                Iterator it3 = ((Iterable) function1.invoke(name)).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it3.next();
                        if (e0((td.c0) obj, i11)) {
                            break;
                        }
                    }
                }
                td.c0 c0Var6 = (td.c0) obj;
                if (c0Var6 != null) {
                    InterfaceC9857w.a<? extends InterfaceC9857w> U13 = c0Var6.U();
                    List<p0> f11 = i11.f();
                    Intrinsics.checkNotNullExpressionValue(f11, "getValueParameters(...)");
                    List<p0> list = f11;
                    ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                    Iterator<T> it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((p0) it4.next()).getType());
                    }
                    List<p0> f12 = c0Var6.f();
                    Intrinsics.checkNotNullExpressionValue(f12, "getValueParameters(...)");
                    U13.i(Ed.h.a(arrayList, f12, i11));
                    U13.r();
                    U13.d();
                    U13.f();
                    c0Var = (td.c0) U13.build();
                } else {
                    c0Var = null;
                }
                if (c0Var != null) {
                    if (!f0(c0Var)) {
                        c0Var = null;
                    }
                    if (c0Var != null) {
                        U11 = U(c0Var, i11, linkedHashSet);
                        C9865a.a(abstractSet, U11);
                        if (!c0Var2.isSuspend()) {
                            Sd.f name2 = c0Var2.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            Iterator it5 = ((Iterable) function1.invoke(name2)).iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    break;
                                }
                                td.c0 V11 = V((td.c0) it5.next());
                                if (V11 == null || !X(V11, c0Var2)) {
                                    V11 = null;
                                }
                                if (V11 != null) {
                                    c0Var4 = V11;
                                    break;
                                }
                            }
                        }
                        C9865a.a(abstractSet, c0Var4);
                    }
                }
            }
            U11 = null;
            C9865a.a(abstractSet, U11);
            if (!c0Var2.isSuspend()) {
            }
            C9865a.a(abstractSet, c0Var4);
        }
    }

    private final void S(Set set, AbstractCollection abstractCollection, te.i iVar, Function1 function1) {
        td.c0 c0Var;
        wd.T t2;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC9831W interfaceC9831W = (InterfaceC9831W) it.next();
            Ed.d dVar = null;
            if (W(interfaceC9831W, function1)) {
                td.c0 Z11 = Z(interfaceC9831W, function1);
                Intrinsics.f(Z11);
                if (interfaceC9831W.B()) {
                    c0Var = a0(interfaceC9831W, function1);
                    Intrinsics.f(c0Var);
                } else {
                    c0Var = null;
                }
                if (c0Var != null) {
                    c0Var.h();
                    Z11.h();
                }
                C3085o c3085o = this.f9931n;
                Ed.d dVar2 = new Ed.d(c3085o, Z11, c0Var, interfaceC9831W);
                je.N returnType = Z11.getReturnType();
                Intrinsics.f(returnType);
                kotlin.collections.K k11 = kotlin.collections.K.f71697a;
                dVar2.P0(returnType, k11, Vd.i.j(c3085o), null, k11);
                wd.S i11 = Vd.h.i(dVar2, Z11.getAnnotations(), false, Z11.e());
                i11.I0(Z11);
                i11.L0(dVar2.getType());
                Intrinsics.checkNotNullExpressionValue(i11, "apply(...)");
                if (c0Var != null) {
                    List<p0> f7 = c0Var.f();
                    Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
                    p0 p0Var = (p0) C7714v.M(f7);
                    if (p0Var == null) {
                        throw new AssertionError("No parameter found for " + c0Var);
                    }
                    t2 = Vd.h.k(dVar2, c0Var.getAnnotations(), p0Var.getAnnotations(), false, c0Var.getVisibility(), c0Var.e());
                    t2.I0(c0Var);
                } else {
                    t2 = null;
                }
                dVar2.L0(i11, t2, null, null);
                dVar = dVar2;
            }
            if (dVar != null) {
                abstractCollection.add(dVar);
                if (iVar != null) {
                    iVar.add(interfaceC9831W);
                    return;
                }
                return;
            }
        }
    }

    private final Collection<je.N> T() {
        boolean z11 = this.f9933p;
        C3085o c3085o = this.f9931n;
        if (!z11) {
            return ((ke.r) w().a().k()).b().e(c3085o);
        }
        List<je.N> o11 = ((AbstractC7394n) c3085o.k()).o();
        Intrinsics.checkNotNullExpressionValue(o11, "getSupertypes(...)");
        return o11;
    }

    private static td.c0 U(td.c0 c0Var, InterfaceC9857w interfaceC9857w, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return c0Var;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            td.c0 c0Var2 = (td.c0) it.next();
            if (!c0Var.equals(c0Var2) && c0Var2.v0() == null && X(c0Var2, interfaceC9857w)) {
                InterfaceC9857w build = c0Var.U().c().build();
                Intrinsics.f(build);
                return (td.c0) build;
            }
        }
        return c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static td.c0 V(td.c0 c0Var) {
        Sd.c cVar;
        Sd.d h11;
        List<p0> f7 = c0Var.f();
        Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
        p0 p0Var = (p0) C7714v.Z(f7);
        if (p0Var != null) {
            InterfaceC9842h p11 = p0Var.getType().H0().p();
            if (p11 != null && (h11 = Zd.e.h(p11)) != null) {
                if (!h11.f()) {
                    h11 = null;
                }
                if (h11 != null) {
                    cVar = h11.l();
                    if (!Intrinsics.d(cVar, qd.s.f81860g)) {
                        p0Var = null;
                    }
                    if (p0Var != null) {
                        InterfaceC9857w.a<? extends InterfaceC9857w> U10 = c0Var.U();
                        List<p0> f11 = c0Var.f();
                        Intrinsics.checkNotNullExpressionValue(f11, "getValueParameters(...)");
                        td.c0 c0Var2 = (td.c0) U10.i(C7714v.E(f11)).e(p0Var.getType().F0().get(0).getType()).build();
                        wd.V v11 = (wd.V) c0Var2;
                        if (v11 != null) {
                            v11.X0(true);
                        }
                        return c0Var2;
                    }
                }
            }
            cVar = null;
            if (!Intrinsics.d(cVar, qd.s.f81860g)) {
            }
            if (p0Var != null) {
            }
        }
        return null;
    }

    private final boolean W(InterfaceC9831W interfaceC9831W, Function1<? super Sd.f, ? extends Collection<? extends td.c0>> function1) {
        if (C3074d.a(interfaceC9831W)) {
            return false;
        }
        td.c0 Z11 = Z(interfaceC9831W, function1);
        td.c0 a02 = a0(interfaceC9831W, function1);
        if (Z11 == null) {
            return false;
        }
        if (interfaceC9831W.B()) {
            return a02 != null && a02.h() == Z11.h();
        }
        return true;
    }

    private static boolean X(InterfaceC9857w interfaceC9857w, InterfaceC9857w interfaceC9857w2) {
        n.c.a c11 = Vd.n.f28546e.p(interfaceC9857w2, interfaceC9857w, true).c();
        Intrinsics.checkNotNullExpressionValue(c11, "getResult(...)");
        return c11 == n.c.a.OVERRIDABLE && !x.a.a(interfaceC9857w2, interfaceC9857w);
    }

    private static td.c0 Y(InterfaceC9831W interfaceC9831W, String str, Function1 function1) {
        td.c0 c0Var;
        Sd.f f7 = Sd.f.f(str);
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        Iterator it = ((Iterable) function1.invoke(f7)).iterator();
        do {
            c0Var = null;
            if (!it.hasNext()) {
                break;
            }
            td.c0 c0Var2 = (td.c0) it.next();
            if (c0Var2.f().size() == 0) {
                ke.r rVar = ke.e.f71486a;
                je.N returnType = c0Var2.getReturnType();
                if (returnType == null ? false : rVar.d(returnType, interfaceC9831W.getType())) {
                    c0Var = c0Var2;
                }
            }
        } while (c0Var == null);
        return c0Var;
    }

    private final td.c0 Z(InterfaceC9831W interfaceC9831W, Function1<? super Sd.f, ? extends Collection<? extends td.c0>> function1) {
        wd.S getter = interfaceC9831W.getGetter();
        InterfaceC9832X interfaceC9832X = getter != null ? (InterfaceC9832X) Cd.P.c(getter) : null;
        String a11 = interfaceC9832X != null ? C2751l.a(interfaceC9832X) : null;
        if (a11 != null && !Cd.P.e(this.f9931n, interfaceC9832X)) {
            return Y(interfaceC9831W, a11, function1);
        }
        String b11 = interfaceC9831W.getName().b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        return Y(interfaceC9831W, Cd.E.b(b11), function1);
    }

    private static td.c0 a0(InterfaceC9831W interfaceC9831W, Function1 function1) {
        td.c0 c0Var;
        je.N returnType;
        String b11 = interfaceC9831W.getName().b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        Sd.f f7 = Sd.f.f(Cd.E.c(b11));
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        Iterator it = ((Iterable) function1.invoke(f7)).iterator();
        do {
            c0Var = null;
            if (!it.hasNext()) {
                break;
            }
            td.c0 c0Var2 = (td.c0) it.next();
            if (c0Var2.f().size() == 1 && (returnType = c0Var2.getReturnType()) != null && qd.m.l0(returnType)) {
                ke.r rVar = ke.e.f71486a;
                List<p0> f11 = c0Var2.f();
                Intrinsics.checkNotNullExpressionValue(f11, "getValueParameters(...)");
                if (rVar.c(((p0) C7714v.B0(f11)).getType(), interfaceC9831W.getType())) {
                    c0Var = c0Var2;
                }
            }
        } while (c0Var == null);
        return c0Var;
    }

    private final LinkedHashSet c0(Sd.f fVar) {
        Collection<je.N> T11 = T();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = T11.iterator();
        while (it.hasNext()) {
            C7714v.p(((je.N) it.next()).p().g(fVar, Bd.c.WHEN_GET_SUPER_MEMBERS), linkedHashSet);
        }
        return linkedHashSet;
    }

    private final Set<InterfaceC9831W> d0(Sd.f fVar) {
        Collection<je.N> T11 = T();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = T11.iterator();
        while (it.hasNext()) {
            Collection b11 = ((je.N) it.next()).p().b(fVar, Bd.c.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(C7714v.z(b11, 10));
            Iterator it2 = b11.iterator();
            while (it2.hasNext()) {
                arrayList2.add((InterfaceC9831W) it2.next());
            }
            C7714v.p(arrayList2, arrayList);
        }
        return C7714v.Y0(arrayList);
    }

    private static boolean e0(td.c0 c0Var, InterfaceC9857w interfaceC9857w) {
        String a11 = Ld.D.a(c0Var, 2);
        InterfaceC9857w n02 = interfaceC9857w.n0();
        Intrinsics.checkNotNullExpressionValue(n02, "getOriginal(...)");
        return Intrinsics.d(a11, Ld.D.a(n02, 2)) && !X(c0Var, interfaceC9857w);
    }

    private final boolean f0(td.c0 c0Var) {
        LinkedHashMap linkedHashMap;
        Sd.f name = c0Var.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        List<Sd.f> a11 = Cd.K.a(name);
        if (!(a11 instanceof Collection) || !a11.isEmpty()) {
            Iterator<T> it = a11.iterator();
            loop5: while (it.hasNext()) {
                Set<InterfaceC9831W> d02 = d0((Sd.f) it.next());
                if (!(d02 instanceof Collection) || !d02.isEmpty()) {
                    for (InterfaceC9831W interfaceC9831W : d02) {
                        if (W(interfaceC9831W, new C3091v(c0Var, this))) {
                            if (interfaceC9831W.B()) {
                                break loop5;
                            }
                            String name2 = c0Var.getName().b();
                            Intrinsics.checkNotNullExpressionValue(name2, "asString(...)");
                            Sd.c cVar = Cd.E.f4688a;
                            Intrinsics.checkNotNullParameter(name2, "name");
                            if (!kotlin.text.h.e0(name2, "set", false)) {
                                break loop5;
                            }
                        }
                    }
                }
            }
        }
        int i11 = Cd.Q.f4744l;
        Sd.f name3 = c0Var.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
        Intrinsics.checkNotNullParameter(name3, "name");
        linkedHashMap = Cd.Q.f4743k;
        Sd.f fVar = (Sd.f) linkedHashMap.get(name3);
        if (fVar != null) {
            LinkedHashSet c02 = c0(fVar);
            ArrayList arrayList = new ArrayList();
            for (Object obj : c02) {
                if (Cd.P.a((td.c0) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                InterfaceC9857w.a<? extends InterfaceC9857w> U10 = c0Var.U();
                U10.o(fVar);
                U10.r();
                U10.d();
                InterfaceC9857w build = U10.build();
                Intrinsics.f(build);
                td.c0 c0Var2 = (td.c0) build;
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        td.c0 c0Var3 = (td.c0) it2.next();
                        InterfaceC9857w n02 = C2744e.i(c0Var3) ? c0Var2.n0() : c0Var2;
                        Intrinsics.f(n02);
                        if (X(n02, c0Var3)) {
                            break;
                        }
                    }
                }
            }
        }
        int i12 = C2747h.f4757m;
        Sd.f name4 = c0Var.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
        if (C2747h.j(name4)) {
            Sd.f name5 = c0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name5, "getName(...)");
            LinkedHashSet c03 = c0(name5);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = c03.iterator();
            while (it3.hasNext()) {
                InterfaceC9857w i13 = C2747h.i((td.c0) it3.next());
                if (i13 != null) {
                    arrayList2.add(i13);
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    if (e0(c0Var, (InterfaceC9857w) it4.next())) {
                        break;
                    }
                }
            }
        }
        td.c0 V11 = V(c0Var);
        if (V11 == null) {
            return true;
        }
        Sd.f name6 = c0Var.getName();
        Intrinsics.checkNotNullExpressionValue(name6, "getName(...)");
        LinkedHashSet<td.c0> c04 = c0(name6);
        if (c04.isEmpty()) {
            return true;
        }
        for (td.c0 c0Var4 : c04) {
            if (c0Var4.isSuspend() && X(V11, c0Var4)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList h0(Sd.f fVar) {
        Collection<Jd.q> f7 = x().invoke().f(fVar);
        ArrayList arrayList = new ArrayList(C7714v.z(f7, 10));
        Iterator<T> it = f7.iterator();
        while (it.hasNext()) {
            arrayList.add(D((Jd.q) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList i0(Sd.f fVar) {
        LinkedHashSet c02 = c0(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : c02) {
            td.c0 c0Var = (td.c0) obj;
            if (!Cd.P.a(c0Var) && C2747h.i(c0Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // Gd.W
    public final InterfaceC9845k A() {
        return this.f9931n;
    }

    @Override // Gd.W
    protected final boolean B(@NotNull Ed.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (this.f9932o.p()) {
            return false;
        }
        return f0(eVar);
    }

    @Override // Gd.W
    @NotNull
    protected final W.a C(@NotNull Jd.q method, @NotNull ArrayList methodTypeParameters, @NotNull je.N returnType, @NotNull List valueParameters) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(methodTypeParameters, "methodTypeParameters");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
        p.b b11 = w().a().s().b(method, this.f9931n, returnType, valueParameters, methodTypeParameters);
        Intrinsics.checkNotNullExpressionValue(b11, "resolvePropagatedSignature(...)");
        je.N c11 = b11.c();
        Intrinsics.checkNotNullExpressionValue(c11, "getReturnType(...)");
        List<p0> e11 = b11.e();
        Intrinsics.checkNotNullExpressionValue(e11, "getValueParameters(...)");
        List<i0> d11 = b11.d();
        Intrinsics.checkNotNullExpressionValue(d11, "getTypeParameters(...)");
        List<String> b12 = b11.b();
        Intrinsics.checkNotNullExpressionValue(b12, "getErrors(...)");
        return new W.a(c11, null, e11, d11, false, b12);
    }

    @Override // Gd.W, ce.m, ce.l
    @NotNull
    public final Collection b(@NotNull Sd.f name, @NotNull Bd.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        g0(name, location);
        return super.b(name, location);
    }

    @NotNull
    public final InterfaceC7061j<List<InterfaceC9838d>> b0() {
        return this.f9934q;
    }

    @Override // ce.m, ce.o
    public final InterfaceC9842h d(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        InterfaceC7060i<Sd.f, InterfaceC9839e> interfaceC7060i;
        InterfaceC9839e invoke;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        g0(name, location);
        C3070B c3070b = (C3070B) z();
        return (c3070b == null || (interfaceC7060i = c3070b.f9938u) == null || (invoke = interfaceC7060i.invoke(name)) == null) ? this.f9938u.invoke(name) : invoke;
    }

    @Override // Gd.W, ce.m, ce.l
    @NotNull
    public final Collection<td.c0> g(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        g0(name, location);
        return super.g(name, location);
    }

    public final void g0(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        C2379a.a(w().a().l(), location, this.f9931n, name);
    }

    @Override // Gd.W
    @NotNull
    protected final Set<Sd.f> n(@NotNull ce.d kindFilter, Function1<? super Sd.f, Boolean> function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return kotlin.collections.e0.f(this.f9935r.invoke(), this.f9937t.invoke().keySet());
    }

    @Override // Gd.W
    public final Set o(ce.d kindFilter, Function1 function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        C3085o c3085o = this.f9931n;
        List<je.N> o11 = ((AbstractC7394n) c3085o.k()).o();
        Intrinsics.checkNotNullExpressionValue(o11, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = o11.iterator();
        while (it.hasNext()) {
            C7714v.p(((je.N) it.next()).p().a(), linkedHashSet);
        }
        linkedHashSet.addAll(x().invoke().a());
        linkedHashSet.addAll(x().invoke().b());
        linkedHashSet.addAll(n(kindFilter, function1));
        linkedHashSet.addAll(((C4999a) w().a().w()).e(c3085o, w()));
        return linkedHashSet;
    }

    @Override // Gd.W
    protected final void p(@NotNull Sd.f name, @NotNull ArrayList result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        boolean x11 = this.f9932o.x();
        C3085o c3085o = this.f9931n;
        if (x11 && x().invoke().d(name) != null) {
            if (!result.isEmpty()) {
                Iterator it = result.iterator();
                while (it.hasNext()) {
                    if (((td.c0) it.next()).f().isEmpty()) {
                        break;
                    }
                }
            }
            Jd.v d11 = x().invoke().d(name);
            Intrinsics.f(d11);
            Ed.e f12 = Ed.e.f1(c3085o, Fd.h.a(w(), d11), d11.getName(), ((yd.k) w().a().t()).a(d11), true);
            Intrinsics.checkNotNullExpressionValue(f12, "createJavaMethod(...)");
            je.N e11 = w().g().e(d11.getType(), Hd.b.d(G0.COMMON, false, null, 6));
            InterfaceC9834Z j11 = Vd.i.j(c3085o);
            kotlin.collections.K k11 = kotlin.collections.K.f71697a;
            EnumC9812C.Companion.getClass();
            f12.e1(null, j11, k11, k11, k11, e11, EnumC9812C.OPEN, C9852r.f99403e, null);
            f12.g1(false, false);
            w().a().h().getClass();
            result.add(f12);
        }
        ((C4999a) w().a().w()).g(c3085o, name, result, w());
    }

    @Override // Gd.W
    public final InterfaceC3073c q() {
        return new C3072b(this.f9932o, C3090u.f10070a);
    }

    @Override // Gd.W
    protected final void s(@NotNull LinkedHashSet result, @NotNull Sd.f name) {
        HashSet hashSet;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        LinkedHashSet c02 = c0(name);
        int i11 = Cd.Q.f4744l;
        Intrinsics.checkNotNullParameter(name, "<this>");
        hashSet = Cd.Q.f4742j;
        if (!hashSet.contains(name) && !C2747h.j(name)) {
            if (!c02.isEmpty()) {
                Iterator it = c02.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC9857w) it.next()).isSuspend()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : c02) {
                if (f0((td.c0) obj)) {
                    arrayList.add(obj);
                }
            }
            Q(result, name, arrayList, false);
            return;
        }
        te.i iVar = new te.i();
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        InterfaceC6543w interfaceC6543w = InterfaceC6543w.f63262a;
        LinkedHashSet d11 = Dd.b.d(this.f9931n, name, ((ke.r) w().a().k()).a(), interfaceC6543w, c02, k11);
        Intrinsics.checkNotNullExpressionValue(d11, "resolveOverridesForNonStaticMembers(...)");
        R(name, result, d11, result, new C3095z(this));
        R(name, result, d11, iVar, new C3069A(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : c02) {
            if (f0((td.c0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        Q(result, name, C7714v.p0(iVar, arrayList2), true);
    }

    @Override // Gd.W
    protected final void t(@NotNull Sd.f name, @NotNull ArrayList result) {
        Jd.q qVar;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        if (this.f9932o.p() && (qVar = (Jd.q) C7714v.C0(x().invoke().f(name))) != null) {
            Ed.f R02 = Ed.f.R0(this.f9931n, Fd.h.a(w(), qVar), EnumC9812C.FINAL, Cd.S.d(qVar.getVisibility()), false, qVar.getName(), ((yd.k) w().a().t()).a(qVar), false);
            Intrinsics.checkNotNullExpressionValue(R02, "create(...)");
            wd.S c11 = Vd.h.c(R02, InterfaceC10030h.a.b());
            Intrinsics.checkNotNullExpressionValue(c11, "createDefaultGetter(...)");
            R02.L0(c11, null, null, null);
            je.N r11 = W.r(qVar, Fd.c.b(w(), R02, qVar, 0));
            kotlin.collections.K k11 = kotlin.collections.K.f71697a;
            R02.P0(r11, k11, Vd.i.j(this.f9931n), null, k11);
            c11.L0(r11);
            result.add(R02);
        }
        Set<InterfaceC9831W> d02 = d0(name);
        if (d02.isEmpty()) {
            return;
        }
        te.i iVar = new te.i();
        te.i iVar2 = new te.i();
        S(d02, result, iVar, new C3092w(this));
        S(kotlin.collections.e0.d(d02, iVar), iVar2, null, new C3093x(this));
        LinkedHashSet f7 = kotlin.collections.e0.f(d02, iVar2);
        LinkedHashSet d11 = Dd.b.d(this.f9931n, name, ((ke.r) w().a().k()).a(), w().a().c(), f7, result);
        Intrinsics.checkNotNullExpressionValue(d11, "resolveOverridesForNonStaticMembers(...)");
        result.addAll(d11);
    }

    @Override // Gd.W
    @NotNull
    public final String toString() {
        return "Lazy Java member scope for " + this.f9932o.c();
    }

    @Override // Gd.W
    @NotNull
    protected final Set u(@NotNull ce.d kindFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        if (this.f9932o.p()) {
            return a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(x().invoke().e());
        List<je.N> o11 = ((AbstractC7394n) this.f9931n.k()).o();
        Intrinsics.checkNotNullExpressionValue(o11, "getSupertypes(...)");
        Iterator<T> it = o11.iterator();
        while (it.hasNext()) {
            C7714v.p(((je.N) it.next()).p().c(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // Gd.W
    protected final InterfaceC9834Z y() {
        return Vd.i.j(this.f9931n);
    }
}
