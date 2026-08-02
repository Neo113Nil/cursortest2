package Kd;

import Cd.C2742c;
import Cd.EnumC2741b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import je.AbstractC7360E;
import je.H0;
import je.J0;
import je.L0;
import je.s0;
import ke.InterfaceC7670b;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.C9661c;
import td.InterfaceC9839e;
import td.InterfaceC9842h;

/* renamed from: Kd.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC3507d<TAnnotation> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Kd.d$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ne.g f15884a;

        /* renamed from: b, reason: collision with root package name */
        private final Cd.B f15885b;

        /* renamed from: c, reason: collision with root package name */
        private final ne.l f15886c;

        public a(ne.g gVar, Cd.B b11, ne.l lVar) {
            this.f15884a = gVar;
            this.f15885b = b11;
            this.f15886c = lVar;
        }

        public final Cd.B a() {
            return this.f15885b;
        }

        public final ne.g b() {
            return this.f15884a;
        }

        public final ne.l c() {
            return this.f15886c;
        }
    }

    private static void b(Object obj, ArrayList arrayList, Function1 function1) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) ((C3506c) function1).invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                b(it.next(), arrayList, function1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    private final C3515l d(ne.l receiver) {
        Iterable iterable;
        EnumC3514k enumC3514k;
        Intrinsics.checkNotNullParameter(receiver, "<this>");
        if (!(receiver instanceof Gd.f0)) {
            return null;
        }
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        List<je.N> upperBounds = ((td.i0) receiver).getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        List<je.N> list = upperBounds;
        boolean z11 = list instanceof Collection;
        if (z11 && list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!InterfaceC7670b.a.A((ne.g) it.next())) {
                if (!z11 || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (j((ne.g) it2.next()) != null) {
                            iterable = upperBounds;
                            break;
                        }
                    }
                }
                if (z11 && list.isEmpty()) {
                    return null;
                }
                for (ne.g gVar : list) {
                    Intrinsics.checkNotNullParameter(gVar, "<this>");
                    if (J0.a((je.N) gVar) != null) {
                        iterable = new ArrayList();
                        for (ne.g gVar2 : list) {
                            Intrinsics.checkNotNullParameter(gVar2, "<this>");
                            je.N a11 = J0.a((je.N) gVar2);
                            if (a11 != null) {
                                iterable.add(a11);
                            }
                        }
                        Iterable iterable2 = iterable;
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (!InterfaceC7670b.a.G((ne.g) it3.next())) {
                                    enumC3514k = EnumC3514k.NOT_NULL;
                                    break;
                                }
                            }
                        }
                        enumC3514k = EnumC3514k.NULLABLE;
                        return new C3515l(enumC3514k, iterable != upperBounds);
                    }
                }
                return null;
            }
        }
        return null;
    }

    private static EnumC3514k j(ne.g gVar) {
        je.Y h11;
        je.Y h12;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        AbstractC7360E g10 = InterfaceC7670b.a.g(gVar);
        if (g10 == null || (h11 = InterfaceC7670b.a.M(g10)) == null) {
            h11 = InterfaceC7670b.a.h(gVar);
            Intrinsics.f(h11);
        }
        if (InterfaceC7670b.a.E(h11)) {
            return EnumC3514k.NULLABLE;
        }
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        AbstractC7360E g11 = InterfaceC7670b.a.g(gVar);
        if (g11 == null || (h12 = InterfaceC7670b.a.X(g11)) == null) {
            h12 = InterfaceC7670b.a.h(gVar);
            Intrinsics.f(h12);
        }
        if (InterfaceC7670b.a.E(h12)) {
            return null;
        }
        return EnumC3514k.NOT_NULL;
    }

    private final ArrayList n(ne.g gVar) {
        Cd.B g10 = g();
        C2742c o11 = ((g0) this).o();
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        a aVar = new a(gVar, o11.b(g10, ((je.N) gVar).getAnnotations()), null);
        C3506c c3506c = new C3506c(this);
        ArrayList arrayList = new ArrayList(1);
        b(aVar, arrayList, c3506c);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d9  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Function1 a(@NotNull je.N n11, @NotNull List overrides, j0 j0Var, boolean z11) {
        int size;
        Iterable<? extends TAnnotation> iterable;
        boolean z12;
        C3515l c3515l;
        C3511h c3511h;
        s0 C11;
        Iterator it;
        C3511h c3511h2;
        ne.g b11;
        EnumC3514k enumC3514k;
        EnumC3512i enumC3512i;
        boolean z13;
        ne.q qVar;
        Intrinsics.checkNotNullParameter(n11, "<this>");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        ArrayList n12 = n(n11);
        ArrayList arrayList = new ArrayList(C7714v.z(overrides, 10));
        Iterator it2 = overrides.iterator();
        while (it2.hasNext()) {
            arrayList.add(n((ne.g) it2.next()));
        }
        if (l() && (!(overrides instanceof Collection) || !overrides.isEmpty())) {
            Iterator it3 = overrides.iterator();
            while (it3.hasNext()) {
                if (!m(n11, (ne.g) it3.next())) {
                    size = 1;
                    break;
                }
            }
        }
        size = n12.size();
        C3511h[] c3511hArr = new C3511h[size];
        int i11 = 0;
        while (i11 < size) {
            a aVar = (a) n12.get(i11);
            ne.g b12 = aVar.b();
            ke.u uVar = ke.u.f71512a;
            if (b12 == null) {
                ne.l receiver = aVar.c();
                if (receiver != null) {
                    Intrinsics.checkNotNullParameter(receiver, "$receiver");
                    if (!(receiver instanceof td.i0)) {
                        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + kotlin.jvm.internal.N.b(receiver.getClass())).toString());
                    }
                    L0 x11 = ((td.i0) receiver).x();
                    Intrinsics.checkNotNullExpressionValue(x11, "getVariance(...)");
                    qVar = ne.n.a(x11);
                } else {
                    qVar = null;
                }
                if (qVar == ne.q.IN) {
                    c3511h = C3511h.f15908e;
                    ArrayList arrayList2 = new ArrayList();
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        a aVar2 = (a) C7714v.Q(i11, (List) it.next());
                        if (aVar2 == null || (b11 = aVar2.b()) == null) {
                            c3511h2 = null;
                        } else {
                            EnumC3514k j11 = j(b11);
                            if (j11 == null) {
                                Intrinsics.checkNotNullParameter(b11, "<this>");
                                je.N a11 = J0.a((je.N) b11);
                                enumC3514k = a11 != null ? j(a11) : null;
                            } else {
                                enumC3514k = j11;
                            }
                            int i12 = C9661c.f98575o;
                            je.Y I11 = uVar.I(b11);
                            Intrinsics.checkNotNullParameter(I11, "<this>");
                            le.i iVar = H0.f69834a;
                            InterfaceC9842h p11 = I11.H0().p();
                            InterfaceC9839e interfaceC9839e = p11 instanceof InterfaceC9839e ? (InterfaceC9839e) p11 : null;
                            if (C9661c.i(interfaceC9839e != null ? Vd.i.k(interfaceC9839e) : null)) {
                                enumC3512i = EnumC3512i.READ_ONLY;
                            } else {
                                je.Y m11 = uVar.m(b11);
                                Intrinsics.checkNotNullParameter(m11, "<this>");
                                InterfaceC9842h p12 = m11.H0().p();
                                InterfaceC9839e interfaceC9839e2 = p12 instanceof InterfaceC9839e ? (InterfaceC9839e) p12 : null;
                                enumC3512i = C9661c.h(interfaceC9839e2 != null ? Vd.i.k(interfaceC9839e2) : null) ? EnumC3512i.MUTABLE : null;
                            }
                            if (!uVar.s(b11)) {
                                Intrinsics.checkNotNullParameter(b11, "<this>");
                                if (!(((je.N) b11).K0() instanceof C3513j)) {
                                    z13 = false;
                                    c3511h2 = new C3511h(enumC3514k, enumC3512i, z13, enumC3514k == j11);
                                }
                            }
                            z13 = true;
                            c3511h2 = new C3511h(enumC3514k, enumC3512i, z13, enumC3514k == j11);
                        }
                        if (c3511h2 != null) {
                            arrayList2.add(c3511h2);
                        }
                    }
                    c3511hArr[i11] = l0.a(c3511h, arrayList2, i11 != 0 && l(), i11 != 0 && h(), z11);
                    i11++;
                }
            }
            boolean z14 = aVar.c() == null;
            ne.g b13 = aVar.b();
            if (b13 != null) {
                Intrinsics.checkNotNullParameter(b13, "<this>");
                iterable = ((je.N) b13).getAnnotations();
            } else {
                iterable = kotlin.collections.K.f71697a;
            }
            ne.g b14 = aVar.b();
            td.i0 q11 = (b14 == null || (C11 = uVar.C(b14)) == null) ? null : InterfaceC7670b.a.q(C11);
            boolean z15 = f() == EnumC2741b.TYPE_PARAMETER_BOUNDS;
            if (z14) {
                if (!z15) {
                    i();
                }
                iterable = C7714v.n0(e(), iterable);
            }
            g0 g0Var = (g0) this;
            EnumC3512i c11 = g0Var.o().c(iterable);
            C3515l d11 = g0Var.o().d(iterable, new C3504a(this, aVar));
            if (d11 != null) {
                c3511h = new C3511h(d11.b(), c11, d11.b() == EnumC3514k.NOT_NULL && q11 != null, d11.c());
                ArrayList arrayList22 = new ArrayList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                }
                c3511hArr[i11] = l0.a(c3511h, arrayList22, i11 != 0 && l(), i11 != 0 && h(), z11);
                i11++;
            } else {
                EnumC2741b f7 = (z14 || z15) ? f() : EnumC2741b.TYPE_USE;
                Cd.B a12 = aVar.a();
                Cd.u a13 = a12 != null ? a12.a(f7) : null;
                C3515l d12 = q11 != null ? d(q11) : null;
                C3515l a14 = d12 != null ? C3515l.a(d12, EnumC3514k.NOT_NULL, false, 2) : a13 != null ? a13.c() : null;
                boolean z16 = (d12 != null ? d12.b() : null) == EnumC3514k.NOT_NULL || !(q11 == null || a13 == null || !a13.b());
                ne.l c12 = aVar.c();
                if (c12 == null || (c3515l = d(c12)) == null) {
                    z12 = false;
                    c3515l = null;
                } else if (c3515l.b() == EnumC3514k.NULLABLE) {
                    z12 = false;
                    c3515l = C3515l.a(c3515l, EnumC3514k.FORCE_FLEXIBILITY, false, 2);
                } else {
                    z12 = false;
                }
                if (c3515l != null && (a14 == null || ((!c3515l.c() || a14.c()) && ((!c3515l.c() && a14.c()) || (c3515l.b().compareTo(a14.b()) >= 0 && c3515l.b().compareTo(a14.b()) > 0))))) {
                    a14 = c3515l;
                }
                c3511h = new C3511h(a14 != null ? a14.b() : null, c11, z16, (a14 == null || !a14.c()) ? z12 : true);
                ArrayList arrayList222 = new ArrayList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                }
                c3511hArr[i11] = l0.a(c3511h, arrayList222, i11 != 0 && l(), i11 != 0 && h(), z11);
                i11++;
            }
        }
        return new C3505b(j0Var, c3511hArr);
    }

    public abstract boolean c(@NotNull TAnnotation tannotation, ne.g gVar);

    @NotNull
    public abstract Iterable<TAnnotation> e();

    @NotNull
    public abstract EnumC2741b f();

    public abstract Cd.B g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m(@NotNull je.N n11, @NotNull ne.g gVar);
}
