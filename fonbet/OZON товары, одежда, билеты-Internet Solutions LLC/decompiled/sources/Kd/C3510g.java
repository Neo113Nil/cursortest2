package Kd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.AbstractC7360E;
import je.C7363H;
import je.H0;
import je.J0;
import je.K0;
import je.L0;
import je.o0;
import je.p0;
import je.s0;
import je.y0;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import ud.InterfaceC10030h;

/* renamed from: Kd.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3510g {

    /* renamed from: Kd.g$a */
    /* loaded from: classes10.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final K0 f15898a;

        /* renamed from: b, reason: collision with root package name */
        private final int f15899b;

        public a(K0 k02, int i11) {
            this.f15898a = k02;
            this.f15899b = i11;
        }

        public final int a() {
            return this.f15899b;
        }

        public final je.N b() {
            return this.f15898a;
        }
    }

    /* renamed from: Kd.g$b */
    /* loaded from: classes10.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final je.Y f15900a;

        /* renamed from: b, reason: collision with root package name */
        private final int f15901b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f15902c;

        public b(int i11, je.Y y11, boolean z11) {
            this.f15900a = y11;
            this.f15901b = i11;
            this.f15902c = z11;
        }

        public final boolean a() {
            return this.f15902c;
        }

        public final int b() {
            return this.f15901b;
        }

        public final je.Y c() {
            return this.f15900a;
        }
    }

    public static je.N a(@NotNull je.N n11, @NotNull Function1 qualifiers, boolean z11) {
        Intrinsics.checkNotNullParameter(n11, "<this>");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        return c(n11.K0(), qualifiers, 0, z11).b();
    }

    private static b b(je.Y y11, Function1 function1, int i11, h0 h0Var, boolean z11, boolean z12) {
        InterfaceC9842h p11;
        s0 H02;
        C3509f c3509f;
        Boolean bool;
        a aVar;
        ne.j n11;
        Function1 function12 = function1;
        boolean a11 = i0.a(h0Var);
        boolean z13 = (z12 && z11) ? false : true;
        K0 k02 = null;
        if ((a11 || !y11.F0().isEmpty()) && (p11 = y11.H0().p()) != null) {
            C3505b c3505b = (C3505b) function12;
            C3511h c3511h = (C3511h) c3505b.invoke(Integer.valueOf(i11));
            InterfaceC9839e b11 = k0.b(p11, c3511h, h0Var);
            Boolean d11 = k0.d(c3511h, h0Var);
            if (b11 == null || (H02 = b11.k()) == null) {
                H02 = y11.H0();
            }
            int i12 = i11 + 1;
            List<y0> F02 = y11.F0();
            List<td.i0> parameters = H02.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            List<td.i0> list = parameters;
            Iterator<T> it = F02.iterator();
            Iterator<T> it2 = list.iterator();
            ArrayList arrayList = new ArrayList(Math.min(C7714v.z(F02, 10), C7714v.z(list, 10)));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                td.i0 i0Var = (td.i0) it2.next();
                y0 y0Var = (y0) next;
                if (z13) {
                    bool = d11;
                    if (!y0Var.a()) {
                        aVar = c(y0Var.getType().K0(), function12, i12, z12);
                    } else if (((C3511h) c3505b.invoke(Integer.valueOf(i12))).e() == EnumC3514k.FORCE_FLEXIBILITY) {
                        K0 K02 = y0Var.getType().K0();
                        aVar = new a(je.Q.c(C7363H.b(K02).L0(false), C7363H.c(K02).L0(true)), 1);
                    } else {
                        aVar = new a(null, 1);
                    }
                } else {
                    bool = d11;
                    aVar = new a(k02, 0);
                }
                i12 += aVar.a();
                if (aVar.b() != null) {
                    je.N b12 = aVar.b();
                    L0 b13 = y0Var.b();
                    Intrinsics.checkNotNullExpressionValue(b13, "getProjectionKind(...)");
                    n11 = C8701c.e(b12, b13, i0Var);
                } else if (b11 == null || y0Var.a()) {
                    n11 = b11 != null ? H0.n(i0Var) : null;
                } else {
                    je.N type = y0Var.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    L0 b14 = y0Var.b();
                    Intrinsics.checkNotNullExpressionValue(b14, "getProjectionKind(...)");
                    n11 = C8701c.e(type, b14, i0Var);
                }
                arrayList.add(n11);
                function12 = function1;
                d11 = bool;
                k02 = null;
            }
            Boolean bool2 = d11;
            int i13 = i12 - i11;
            if (b11 == null && bool2 == null) {
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((y0) it3.next()) == null) {
                        }
                    }
                }
                return new b(i13, null, false);
            }
            InterfaceC10030h annotations = y11.getAnnotations();
            c3509f = k0.f15916b;
            if (b11 == null) {
                c3509f = null;
            }
            InterfaceC10030h e11 = k0.e();
            if (bool2 == null) {
                e11 = null;
            }
            InterfaceC10030h[] elements = {annotations, c3509f, e11};
            Intrinsics.checkNotNullParameter(elements, "elements");
            o0 b15 = p0.b(k0.a(C7705l.B(elements)));
            List<y0> F03 = y11.F0();
            Iterator it4 = arrayList.iterator();
            Iterator<T> it5 = F03.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(C7714v.z(arrayList, 10), C7714v.z(F03, 10)));
            while (it4.hasNext() && it5.hasNext()) {
                Object next2 = it4.next();
                y0 y0Var2 = (y0) it5.next();
                y0 y0Var3 = (y0) next2;
                if (y0Var3 != null) {
                    y0Var2 = y0Var3;
                }
                arrayList2.add(y0Var2);
            }
            je.Y f7 = je.Q.f(arrayList2, b15, H02, null, bool2 != null ? bool2.booleanValue() : y11.I0());
            if (c3511h.c()) {
                f7 = new C3513j(f7);
            }
            return new b(i13, f7, bool2 != null && c3511h.f());
        }
        return new b(1, null, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        if (r1 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static a c(K0 k02, Function1 function1, int i11, boolean z11) {
        je.N c11;
        K0 k03 = null;
        if (je.S.a(k02)) {
            return new a(null, 1);
        }
        if (!(k02 instanceof AbstractC7360E)) {
            if (!(k02 instanceof je.Y)) {
                throw new Sc.o();
            }
            b b11 = b((je.Y) k02, function1, i11, h0.INFLEXIBLE, false, z11);
            return new a(b11.a() ? J0.c(k02, b11.c()) : b11.c(), b11.b());
        }
        boolean z12 = k02 instanceof Hd.k;
        AbstractC7360E abstractC7360E = (AbstractC7360E) k02;
        b b12 = b(abstractC7360E.P0(), function1, i11, h0.FLEXIBLE_LOWER, z12, z11);
        b b13 = b(abstractC7360E.Q0(), function1, i11, h0.FLEXIBLE_UPPER, z12, z11);
        if (b12.c() != null || b13.c() != null) {
            if (b12.a() || b13.a()) {
                je.Y c12 = b13.c();
                if (c12 != null) {
                    je.Y c13 = b12.c();
                    if (c13 == null) {
                        c13 = c12;
                    }
                    c11 = je.Q.c(c13, c12);
                }
                c11 = b12.c();
                Intrinsics.f(c11);
                k03 = J0.c(k02, c11);
            } else if (z12) {
                je.Y c14 = b12.c();
                if (c14 == null) {
                    c14 = abstractC7360E.P0();
                }
                je.Y c15 = b13.c();
                if (c15 == null) {
                    c15 = abstractC7360E.Q0();
                }
                k03 = new Hd.k(c14, c15);
            } else {
                je.Y c16 = b12.c();
                if (c16 == null) {
                    c16 = abstractC7360E.P0();
                }
                je.Y c17 = b13.c();
                if (c17 == null) {
                    c17 = abstractC7360E.Q0();
                }
                k03 = je.Q.c(c16, c17);
            }
        }
        return new a(k03, b12.b());
    }
}
