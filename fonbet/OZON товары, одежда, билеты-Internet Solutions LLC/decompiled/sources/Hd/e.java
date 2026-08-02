package Hd;

import Cd.S;
import Fd.o;
import Gd.f0;
import Jd.B;
import Jd.u;
import Jd.w;
import Jd.x;
import Jd.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.A0;
import je.G0;
import je.H0;
import je.K0;
import je.L0;
import je.N;
import je.Q;
import je.U;
import je.Y;
import je.o0;
import je.p0;
import je.s0;
import je.x0;
import kotlin.collections.C7714v;
import kotlin.collections.IndexedValue;
import kotlin.collections.O;
import kotlin.collections.P;
import kotlin.jvm.internal.Intrinsics;
import le.l;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import qd.p;
import sd.C9661c;
import sd.C9662d;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.i0;
import ud.C10037o;
import ud.InterfaceC10025c;
import ud.InterfaceC10030h;
import wd.L;
import zd.H;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Fd.k f10845a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final o f10846b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final g f10847c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x0 f10848d;

    public e(@NotNull Fd.k c11, @NotNull o typeParameterResolver) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        this.f10845a = c11;
        this.f10846b = typeParameterResolver;
        g gVar = new g();
        this.f10847c = gVar;
        this.f10848d = new x0(gVar);
    }

    static N a(e eVar, i0 i0Var, a aVar, s0 s0Var, Jd.j jVar) {
        x0 x0Var = eVar.f10848d;
        InterfaceC9842h p11 = s0Var.p();
        return x0Var.c(i0Var, aVar.i(p11 != null ? p11.q() : null).h(jVar.z()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x00d2, code lost:
    
        if (r11 != je.L0.OUT_VARIANCE) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x018a, code lost:
    
        if (r0.isEmpty() == false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f4  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Y b(Jd.j jVar, a aVar, Y y11) {
        Jd.j jVar2;
        o0 b11;
        s0 k11;
        ke.h hVar;
        boolean z11;
        ne.j a02;
        ?? U02;
        List list;
        InterfaceC9839e readOnly;
        Sd.c cVar;
        Fd.k kVar = this.f10845a;
        boolean z12 = false;
        if (y11 == null || (b11 = y11.G0()) == null) {
            jVar2 = jVar;
            b11 = p0.b(new Fd.g(kVar, jVar2, false));
        } else {
            jVar2 = jVar;
        }
        o0 o0Var = b11;
        Jd.i d11 = jVar2.d();
        f0 f0Var = null;
        if (d11 == null) {
            c(jVar);
            throw null;
        }
        if (d11 instanceof Jd.g) {
            Jd.g gVar = (Jd.g) d11;
            Sd.c c11 = gVar.c();
            if (c11 == null) {
                throw new AssertionError("Class type should have a FQ name: " + d11);
            }
            if (aVar.f()) {
                cVar = f.f10849a;
                if (c11.equals(cVar)) {
                    readOnly = kVar.a().p().a();
                    if (readOnly == null) {
                        readOnly = kVar.a().n().a(gVar);
                    }
                    if (readOnly != null || (k11 = readOnly.k()) == null) {
                        c(jVar);
                        throw null;
                    }
                }
            }
            readOnly = C9662d.b(c11, ((L) kVar.d()).n());
            if (readOnly == null) {
                readOnly = null;
            } else {
                Intrinsics.checkNotNullParameter(readOnly, "readOnly");
                int i11 = C9661c.f98575o;
                if (C9661c.i(Vd.i.k(readOnly))) {
                    if (aVar.c() != c.FLEXIBLE_LOWER_BOUND && aVar.d() != G0.SUPERTYPE) {
                        if (z.a((w) C7714v.Z(jVar2.k()))) {
                            Intrinsics.checkNotNullParameter(readOnly, "readOnly");
                            Sd.d k12 = Vd.i.k(readOnly);
                            int i12 = C9661c.f98575o;
                            Sd.c m11 = C9661c.m(k12);
                            if (m11 == null) {
                                throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
                            }
                            InterfaceC9839e o11 = Zd.e.e(readOnly).o(m11);
                            Intrinsics.checkNotNullExpressionValue(o11, "getBuiltInClassByFqName(...)");
                            List<i0> parameters = o11.k().getParameters();
                            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                            i0 i0Var = (i0) C7714v.Z(parameters);
                            if (i0Var != null) {
                                L0 x11 = i0Var.x();
                                if (x11 != null) {
                                }
                            }
                        }
                    }
                    readOnly = C9662d.a(readOnly);
                }
            }
            if (readOnly == null) {
            }
            if (readOnly != null) {
            }
            c(jVar);
            throw null;
        }
        if (!(d11 instanceof x)) {
            throw new IllegalStateException("Unknown classifier kind: " + d11);
        }
        i0 a11 = this.f10846b.a((x) d11);
        k11 = a11 != null ? a11.k() : null;
        if (k11 == null) {
            return null;
        }
        boolean z13 = true;
        boolean z14 = (aVar.c() == c.FLEXIBLE_LOWER_BOUND || aVar.f() || aVar.d() == G0.SUPERTYPE) ? false : true;
        if (Intrinsics.d(y11 != null ? y11.H0() : null, k11) && !jVar2.z() && z14) {
            return y11.L0(true);
        }
        if (!jVar2.z()) {
            if (jVar2.k().isEmpty()) {
                List<i0> parameters2 = k11.getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
            }
            z13 = false;
        }
        List<i0> parameters3 = k11.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters3, "getParameters(...)");
        if (z13) {
            List<i0> list2 = parameters3;
            U02 = new ArrayList(C7714v.z(list2, 10));
            for (i0 i0Var2 : list2) {
                U02.add(C8701c.j(i0Var2, null, aVar.e()) ? H0.o(i0Var2, aVar) : this.f10847c.a(i0Var2, aVar.h(jVar.z()), this.f10848d, new U(kVar.e(), new d(this, i0Var2, aVar, k11, jVar2))));
                jVar2 = jVar;
            }
        } else {
            if (parameters3.size() == jVar.k().size()) {
                O a12 = C7714v.a1(jVar.k());
                ArrayList arrayList = new ArrayList(C7714v.z(a12, 10));
                Iterator it = a12.iterator();
                while (true) {
                    P p11 = (P) it;
                    if (!p11.hasNext()) {
                        break;
                    }
                    IndexedValue indexedValue = (IndexedValue) p11.next();
                    int f71694a = indexedValue.getF71694a();
                    w wVar = (w) indexedValue.b();
                    parameters3.size();
                    i0 i0Var3 = parameters3.get(f71694a);
                    G0 g02 = G0.COMMON;
                    a d12 = b.d(g02, z12, f0Var, 7);
                    Intrinsics.f(i0Var3);
                    if (wVar instanceof B) {
                        B b12 = (B) wVar;
                        H y12 = b12.y();
                        L0 l02 = b12.G() ? L0.OUT_VARIANCE : L0.IN_VARIANCE;
                        if (y12 == null || !(i0Var3.x() == L0.INVARIANT || l02 == i0Var3.x())) {
                            z11 = false;
                            a02 = H0.o(i0Var3, d12);
                            Intrinsics.checkNotNullExpressionValue(a02, "makeStarProjection(...)");
                        } else {
                            InterfaceC10025c a13 = S.a(kVar, b12);
                            z11 = false;
                            N e11 = e(y12, b.d(g02, false, null, 7));
                            if (a13 != null) {
                                e11 = C8701c.q(e11, InterfaceC10030h.a.a(C7714v.o0(e11.getAnnotations(), a13)));
                            }
                            a02 = C8701c.e(e11, l02, i0Var3);
                        }
                    } else {
                        z11 = z12;
                        a02 = new A0(e(wVar, d12), L0.INVARIANT);
                    }
                    arrayList.add(a02);
                    z12 = z11;
                    f0Var = null;
                }
                hVar = null;
                list = C7714v.U0(arrayList);
                return Q.f(list, o0Var, k11, hVar, z14);
            }
            List<i0> list3 = parameters3;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new A0(l.c(le.k.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, ((i0) it2.next()).getName().b())));
            }
            U02 = C7714v.U0(arrayList2);
        }
        hVar = null;
        list = U02;
        return Q.f(list, o0Var, k11, hVar, z14);
    }

    private final s0 c(Jd.j jVar) {
        jVar.t();
        throw null;
    }

    @NotNull
    public final K0 d(@NotNull Jd.f arrayType, @NotNull a attr, boolean z11) {
        Intrinsics.checkNotNullParameter(arrayType, "arrayType");
        Intrinsics.checkNotNullParameter(attr, "attr");
        w B11 = arrayType.B();
        u uVar = B11 instanceof u ? (u) B11 : null;
        p type = uVar != null ? uVar.getType() : null;
        Fd.k kVar = this.f10845a;
        Fd.g gVar = new Fd.g(kVar, arrayType, true);
        if (type != null) {
            Y H11 = ((L) kVar.d()).n().H(type);
            N q11 = C8701c.q(H11, new C10037o(H11.getAnnotations(), gVar));
            Intrinsics.g(q11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            Y y11 = (Y) q11;
            return attr.f() ? y11 : Q.c(y11, y11.L0(true));
        }
        N e11 = e(B11, b.d(G0.COMMON, attr.f(), null, 6));
        if (attr.f()) {
            Y l11 = ((L) kVar.d()).n().l(z11 ? L0.OUT_VARIANCE : L0.INVARIANT, e11, gVar);
            Intrinsics.checkNotNullExpressionValue(l11, "getArrayType(...)");
            return l11;
        }
        Y l12 = ((L) kVar.d()).n().l(L0.INVARIANT, e11, gVar);
        Intrinsics.checkNotNullExpressionValue(l12, "getArrayType(...)");
        return Q.c(l12, ((L) kVar.d()).n().l(L0.OUT_VARIANCE, e11, gVar).L0(true));
    }

    @NotNull
    public final N e(w wVar, @NotNull a attr) {
        N e11;
        Y b11;
        Intrinsics.checkNotNullParameter(attr, "attr");
        boolean z11 = wVar instanceof u;
        Fd.k kVar = this.f10845a;
        if (z11) {
            p type = ((u) wVar).getType();
            Y J11 = type != null ? ((L) kVar.d()).n().J(type) : ((L) kVar.d()).n().P();
            Intrinsics.f(J11);
            return J11;
        }
        boolean z12 = false;
        if (wVar instanceof Jd.j) {
            Jd.j jVar = (Jd.j) wVar;
            if (!attr.f() && attr.d() != G0.SUPERTYPE) {
                z12 = true;
            }
            boolean z13 = jVar.z();
            if (!z13 && !z12) {
                Y b12 = b(jVar, attr, null);
                return b12 != null ? b12 : l.c(le.k.UNRESOLVED_JAVA_CLASS, jVar.m());
            }
            Y b13 = b(jVar, attr.j(c.FLEXIBLE_LOWER_BOUND), null);
            if (b13 != null && (b11 = b(jVar, attr.j(c.FLEXIBLE_UPPER_BOUND), b13)) != null) {
                return z13 ? new k(b13, b11) : Q.c(b13, b11);
            }
            return l.c(le.k.UNRESOLVED_JAVA_CLASS, jVar.m());
        }
        if (wVar instanceof Jd.f) {
            return d((Jd.f) wVar, attr, false);
        }
        if (wVar instanceof B) {
            H y11 = ((B) wVar).y();
            if (y11 != null && (e11 = e(y11, attr)) != null) {
                return e11;
            }
            Y C11 = ((L) kVar.d()).n().C();
            Intrinsics.checkNotNullExpressionValue(C11, "getDefaultBound(...)");
            return C11;
        }
        if (wVar == null) {
            Y C12 = ((L) kVar.d()).n().C();
            Intrinsics.checkNotNullExpressionValue(C12, "getDefaultBound(...)");
            return C12;
        }
        throw new UnsupportedOperationException("Unsupported type: " + wVar);
    }
}
