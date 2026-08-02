package Ud;

import B0.A0;
import E0.C2942q;
import I0.C3173b;
import Ij.C3261b;
import Sc.InterfaceC4008j;
import Ud.n;
import Ud.w;
import Xd.C4884a;
import Xd.C4885b;
import Xd.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import he.C6927I;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je.AbstractC7360E;
import je.C7368a;
import je.C7385i0;
import je.C7401v;
import je.H0;
import je.K0;
import je.M;
import je.M0;
import je.Y;
import je.s0;
import je.y0;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import qd.s;
import re.C9257a;
import td.AbstractC9853s;
import td.C9819J;
import td.C9829U;
import td.C9852r;
import td.EnumC9812C;
import td.EnumC9840f;
import td.InterfaceC9811B;
import td.InterfaceC9815F;
import td.InterfaceC9820K;
import td.InterfaceC9827S;
import td.InterfaceC9830V;
import td.InterfaceC9831W;
import td.InterfaceC9833Y;
import td.InterfaceC9834Z;
import td.InterfaceC9835a;
import td.InterfaceC9836b;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9843i;
import td.InterfaceC9845k;
import td.InterfaceC9847m;
import td.InterfaceC9848n;
import td.InterfaceC9857w;
import td.h0;
import td.i0;
import td.m0;
import td.p0;
import td.q0;
import ud.EnumC10027e;
import ud.InterfaceC10023a;
import ud.InterfaceC10025c;
import wd.AbstractC10518d;
import wd.AbstractC10523i;
import wd.AbstractC10527m;
import wd.C10513E;
import wd.C10528n;
import wd.C10536w;
import wd.L;
import wd.N;
import wd.Q;
import wd.S;
import wd.T;
import wd.c0;

/* loaded from: classes.dex */
public final class u extends n implements w {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f27613f = 0;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final A f27614d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f27615e;

    private final class a implements InterfaceC9847m<Unit, StringBuilder> {

        /* renamed from: Ud.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes10.dex */
        public /* synthetic */ class C0558a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f27617a;

            static {
                int[] iArr = new int[F.values().length];
                try {
                    iArr[F.PRETTY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[F.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[F.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f27617a = iArr;
            }
        }

        public a() {
        }

        private final void n(InterfaceC9830V descriptor, StringBuilder builder, String str) {
            u uVar = u.this;
            int i11 = C0558a.f27617a[uVar.C().ordinal()];
            if (i11 == 1) {
                u.n(uVar, descriptor, builder);
                builder.append(str.concat(" for "));
                InterfaceC9831W f02 = descriptor.f0();
                Intrinsics.checkNotNullExpressionValue(f02, "getCorrespondingProperty(...)");
                u.u(uVar, f02, builder);
                return;
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new Sc.o();
                }
            } else {
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(builder, "builder");
                u.q(uVar, descriptor, builder);
            }
        }

        @Override // td.InterfaceC9847m
        public final Object a(AbstractC10523i descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            u.v(u.this, descriptor, builder);
            return Unit.f71690a;
        }

        @Override // td.InterfaceC9847m
        public final Object b(C10528n constructorDescriptor, Object obj) {
            StringBuilder builder = (StringBuilder) obj;
            Intrinsics.checkNotNullParameter(constructorDescriptor, "constructorDescriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            u.p(u.this, constructorDescriptor, builder);
            return Unit.f71690a;
        }

        @Override // td.InterfaceC9847m
        public final Object c(Q descriptor, Object obj) {
            StringBuilder builder = (StringBuilder) obj;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            u.u(u.this, descriptor, builder);
            return Unit.f71690a;
        }

        @Override // td.InterfaceC9847m
        public final Object d(AbstractC10527m descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            u.this.k0(descriptor, builder, true);
            return Unit.f71690a;
        }

        @Override // td.InterfaceC9847m
        public final Object e(wd.G descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            u.o(u.this, descriptor, builder);
            return Unit.f71690a;
        }

        @Override // td.InterfaceC9847m
        public final Object f(AbstractC10518d descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.append(descriptor.getName());
            return Unit.f71690a;
        }

        @Override // td.InterfaceC9847m
        public final Object g(N descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            u.s(u.this, descriptor, builder);
            return Unit.f71690a;
        }

        @Override // td.InterfaceC9847m
        public final Object h(C10513E descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            u.t(u.this, descriptor, builder);
            return Unit.f71690a;
        }

        @Override // td.InterfaceC9847m
        public final Unit i(InterfaceC9857w descriptor, StringBuilder sb2) {
            StringBuilder builder = sb2;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            u.q(u.this, descriptor, builder);
            return Unit.f71690a;
        }

        @Override // td.InterfaceC9847m
        public final Object j(S descriptor, Object obj) {
            StringBuilder builder = (StringBuilder) obj;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            n(descriptor, builder, "getter");
            return Unit.f71690a;
        }

        @Override // td.InterfaceC9847m
        public final Object k(T descriptor, Object obj) {
            StringBuilder builder = (StringBuilder) obj;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            n(descriptor, builder, "setter");
            return Unit.f71690a;
        }

        @Override // td.InterfaceC9847m
        public final Object l(L descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            u.this.Y(descriptor, builder, true);
            return Unit.f71690a;
        }

        @Override // td.InterfaceC9847m
        public final Object m(c0 descriptor, StringBuilder builder) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(builder, "builder");
            u.this.p0(descriptor, true, builder, true);
            return Unit.f71690a;
        }
    }

    /* loaded from: classes10.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27618a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f27619b;

        static {
            int[] iArr = new int[G.values().length];
            try {
                iArr[G.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[G.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27618a = iArr;
            int[] iArr2 = new int[E.values().length];
            try {
                iArr2[E.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[E.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[E.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f27619b = iArr2;
        }
    }

    public u(@NotNull A options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f27614d = options;
        this.f27615e = Sc.k.b(new o(this));
    }

    private static EnumC9812C D(InterfaceC9811B interfaceC9811B) {
        if (interfaceC9811B instanceof InterfaceC9839e) {
            return ((InterfaceC9839e) interfaceC9811B).getKind() == EnumC9840f.INTERFACE ? EnumC9812C.ABSTRACT : EnumC9812C.FINAL;
        }
        InterfaceC9845k d11 = interfaceC9811B.d();
        InterfaceC9839e interfaceC9839e = d11 instanceof InterfaceC9839e ? (InterfaceC9839e) d11 : null;
        if (interfaceC9839e != null && (interfaceC9811B instanceof InterfaceC9836b)) {
            InterfaceC9836b interfaceC9836b = (InterfaceC9836b) interfaceC9811B;
            Collection<? extends InterfaceC9836b> o11 = interfaceC9836b.o();
            Intrinsics.checkNotNullExpressionValue(o11, "getOverriddenDescriptors(...)");
            if (!o11.isEmpty() && interfaceC9839e.h() != EnumC9812C.FINAL) {
                return EnumC9812C.OPEN;
            }
            if (interfaceC9839e.getKind() != EnumC9840f.INTERFACE || Intrinsics.d(interfaceC9836b.getVisibility(), C9852r.f99399a)) {
                return EnumC9812C.FINAL;
            }
            EnumC9812C h11 = interfaceC9836b.h();
            EnumC9812C enumC9812C = EnumC9812C.ABSTRACT;
            return h11 == enumC9812C ? enumC9812C : EnumC9812C.OPEN;
        }
        return EnumC9812C.FINAL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(StringBuilder sb2, InterfaceC10023a interfaceC10023a, EnumC10027e enumC10027e) {
        A a11 = this.f27614d;
        if (a11.C().contains(v.ANNOTATIONS)) {
            Set<Sd.c> a12 = interfaceC10023a instanceof je.N ? a11.a() : a11.y();
            Function1<InterfaceC10025c, Boolean> q11 = a11.q();
            for (InterfaceC10025c interfaceC10025c : interfaceC10023a.getAnnotations()) {
                if (!C7714v.A(a12, interfaceC10025c.c()) && !Intrinsics.d(interfaceC10025c.c(), s.a.f81918r) && (q11 == null || q11.invoke(interfaceC10025c).booleanValue())) {
                    sb2.append(F(interfaceC10025c, enumC10027e));
                    if (a11.w()) {
                        sb2.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    private final void I(InterfaceC9843i interfaceC9843i, StringBuilder sb2) {
        List<i0> r11 = interfaceC9843i.r();
        Intrinsics.checkNotNullExpressionValue(r11, "getDeclaredTypeParameters(...)");
        List<i0> parameters = interfaceC9843i.k().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        if (this.f27614d.d0() && interfaceC9843i.g() && parameters.size() > r11.size()) {
            sb2.append(" /*captured type parameters: ");
            l0(sb2, parameters.subList(r11.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    private final String J(Xd.g<?> gVar) {
        Function1<Xd.g<?>, String> J11 = this.f27614d.J();
        if (J11 != null) {
            return J11.invoke(gVar);
        }
        if (gVar instanceof C4885b) {
            List<? extends Xd.g<?>> b11 = ((C4885b) gVar).b();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = b11.iterator();
            while (it.hasNext()) {
                String J12 = J((Xd.g) it.next());
                if (J12 != null) {
                    arrayList.add(J12);
                }
            }
            return C7714v.V(arrayList, ", ", "{", "}", null, 56);
        }
        if (gVar instanceof C4884a) {
            return kotlin.text.h.S(F(((C4884a) gVar).b(), null), "@");
        }
        if (!(gVar instanceof Xd.t)) {
            return gVar.toString();
        }
        t.a b12 = ((Xd.t) gVar).b();
        if (b12 instanceof t.a.C0620a) {
            return ((t.a.C0620a) b12).a() + "::class";
        }
        if (!(b12 instanceof t.a.b)) {
            throw new Sc.o();
        }
        t.a.b bVar = (t.a.b) b12;
        String b13 = bVar.b().a().b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        int a11 = bVar.a();
        for (int i11 = 0; i11 < a11; i11++) {
            b13 = C3173b.a('>', "kotlin.Array<", b13);
        }
        return U7.d.e(b13, "::class");
    }

    private final void K(StringBuilder sb2, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb2.append("context(");
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            int i12 = i11 + 1;
            InterfaceC9834Z interfaceC9834Z = (InterfaceC9834Z) it.next();
            G(sb2, interfaceC9834Z, EnumC10027e.RECEIVER);
            je.N type = interfaceC9834Z.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(O(type));
            if (i11 == C7714v.P(list)) {
                sb2.append(") ");
            } else {
                sb2.append(", ");
            }
            i11 = i12;
        }
    }

    private final void L(StringBuilder sb2, Y type) {
        G(sb2, type, null);
        C7401v c7401v = type instanceof C7401v ? (C7401v) type : null;
        Y T02 = c7401v != null ? c7401v.T0() : null;
        if (je.S.a(type)) {
            boolean o11 = C8701c.o(type);
            A a11 = this.f27614d;
            if (o11 && a11.H()) {
                int i11 = le.l.f73271f;
                Intrinsics.checkNotNullParameter(type, "type");
                C8701c.o(type);
                s0 H02 = type.H0();
                Intrinsics.g(H02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
                sb2.append(M(((le.j) H02).c()));
            } else {
                if (!(type instanceof le.i) || a11.B()) {
                    sb2.append(type.H0().toString());
                } else {
                    sb2.append(((le.i) type).Q0());
                }
                sb2.append(i0(type.F0()));
            }
        } else if (type instanceof C7385i0) {
            sb2.append(((C7385i0) type).Q0().toString());
        } else if (T02 instanceof C7385i0) {
            sb2.append(((C7385i0) T02).Q0().toString());
        } else {
            s0 H03 = type.H0();
            C9829U a12 = m0.a(type);
            if (a12 == null) {
                sb2.append(j0(H03));
                sb2.append(i0(type.F0()));
            } else {
                d0(sb2, a12);
            }
            Unit unit = Unit.f71690a;
        }
        if (type.I0()) {
            sb2.append("?");
        }
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (type instanceof C7401v) {
            sb2.append(" & Any");
        }
    }

    private final String M(String str) {
        int i11 = b.f27618a[this.f27614d.Y().ordinal()];
        if (i11 == 1) {
            return str;
        }
        if (i11 == 2) {
            return A0.b("<font color=red><b>", str, "</b></font>");
        }
        throw new Sc.o();
    }

    private final String O(je.N n11) {
        String h02 = h0(n11);
        return ((!t0(n11) || H0.g(n11)) && !(n11 instanceof C7401v)) ? h02 : C3173b.a(')', "(", h02);
    }

    private final void Q(q0 q0Var, StringBuilder sb2) {
        Xd.g<?> s02;
        String J11;
        if (!this.f27614d.A() || (s02 = q0Var.s0()) == null || (J11 = J(s02)) == null) {
            return;
        }
        sb2.append(" = ");
        sb2.append(y(J11));
    }

    private final String R(String str) {
        A a11 = this.f27614d;
        int i11 = b.f27618a[a11.Y().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                throw new Sc.o();
            }
            if (!a11.r()) {
                return A0.b("<b>", str, "</b>");
            }
        }
        return str;
    }

    private final void S(StringBuilder sb2, InterfaceC9836b interfaceC9836b) {
        A a11 = this.f27614d;
        if (a11.C().contains(v.MEMBER_KIND) && a11.d0() && interfaceC9836b.getKind() != InterfaceC9836b.a.DECLARATION) {
            sb2.append("/*");
            sb2.append(C9257a.d(interfaceC9836b.getKind().name()));
            sb2.append("*/ ");
        }
    }

    private final void T(InterfaceC9811B interfaceC9811B, StringBuilder sb2) {
        W("external", sb2, interfaceC9811B.isExternal());
        A a11 = this.f27614d;
        boolean z11 = false;
        W("expect", sb2, a11.C().contains(v.EXPECT) && interfaceC9811B.p0());
        if (a11.C().contains(v.ACTUAL) && interfaceC9811B.g0()) {
            z11 = true;
        }
        W("actual", sb2, z11);
    }

    private final void U(EnumC9812C enumC9812C, StringBuilder sb2, EnumC9812C enumC9812C2) {
        A a11 = this.f27614d;
        if (a11.Q() || enumC9812C != enumC9812C2) {
            W(C9257a.d(enumC9812C.name()), sb2, a11.C().contains(v.MODALITY));
        }
    }

    private final void V(StringBuilder sb2, InterfaceC9836b interfaceC9836b) {
        if (Vd.i.D(interfaceC9836b) && interfaceC9836b.h() == EnumC9812C.FINAL) {
            return;
        }
        if (this.f27614d.E() == D.RENDER_OVERRIDE && interfaceC9836b.h() == EnumC9812C.OPEN && !interfaceC9836b.o().isEmpty()) {
            return;
        }
        EnumC9812C h11 = interfaceC9836b.h();
        Intrinsics.checkNotNullExpressionValue(h11, "getModality(...)");
        U(h11, sb2, D(interfaceC9836b));
    }

    private final void W(String str, StringBuilder sb2, boolean z11) {
        if (z11) {
            sb2.append(R(str));
            sb2.append(" ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(InterfaceC9845k interfaceC9845k, StringBuilder sb2, boolean z11) {
        Sd.f name = interfaceC9845k.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(X(name, z11));
    }

    private final void Z(StringBuilder sb2, je.N n11) {
        K0 K02 = n11.K0();
        C7368a c7368a = K02 instanceof C7368a ? (C7368a) K02 : null;
        if (c7368a == null) {
            a0(sb2, n11);
            return;
        }
        A a11 = this.f27614d;
        if (a11.T()) {
            a0(sb2, c7368a.Z());
            if (a11.L()) {
                G Y11 = a11.Y();
                G g10 = G.HTML;
                if (Y11 == g10) {
                    sb2.append("<font color=\"808080\"><i>");
                }
                sb2.append(" /* ");
                sb2.append("from: ");
                a0(sb2, c7368a.T0());
                sb2.append(" */");
                if (a11.Y() == g10) {
                    sb2.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        a0(sb2, c7368a.T0());
        if (a11.U()) {
            G Y12 = a11.Y();
            G g11 = G.HTML;
            if (Y12 == g11) {
                sb2.append("<font color=\"808080\"><i>");
            }
            sb2.append(" /* ");
            sb2.append("= ");
            a0(sb2, c7368a.Z());
            sb2.append(" */");
            if (a11.Y() == g11) {
                sb2.append("</i></font>");
            }
        }
    }

    private final void a0(StringBuilder sb2, je.N n11) {
        Sd.f fVar;
        String y11;
        boolean z11 = n11 instanceof M0;
        A a11 = this.f27614d;
        if (z11 && a11.u() && !((M0) n11).M0()) {
            sb2.append("<Not computed yet>");
            return;
        }
        K0 K02 = n11.K0();
        if (K02 instanceof AbstractC7360E) {
            sb2.append(((AbstractC7360E) K02).R0(this, this));
            return;
        }
        if (!(K02 instanceof Y)) {
            throw new Sc.o();
        }
        Y y12 = (Y) K02;
        if (y12.equals(H0.f69835b) || y12.H0() == H0.f69834a.H0()) {
            sb2.append("???");
            return;
        }
        s0 H02 = y12.H0();
        if ((H02 instanceof le.j) && ((le.j) H02).b() == le.k.UNINFERRED_TYPE_VARIABLE) {
            if (!a11.a0()) {
                sb2.append("???");
                return;
            }
            s0 H03 = y12.H0();
            Intrinsics.g(H03, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb2.append(M(((le.j) H03).c()));
            return;
        }
        if (je.S.a(y12)) {
            L(sb2, y12);
            return;
        }
        if (!t0(y12)) {
            L(sb2, y12);
            return;
        }
        int length = sb2.length();
        ((u) this.f27615e.getValue()).G(sb2, y12, null);
        boolean z12 = sb2.length() != length;
        je.N f7 = qd.i.f(y12);
        List<je.N> d11 = qd.i.d(y12);
        boolean l11 = qd.i.l(y12);
        boolean I02 = y12.I0();
        boolean z13 = I02 || (z12 && f7 != null);
        if (z13) {
            if (l11) {
                sb2.insert(length, '(');
            } else {
                if (z12) {
                    CharsKt.c(kotlin.text.h.M(sb2));
                    if (sb2.charAt(kotlin.text.h.G(sb2) - 1) != ')') {
                        sb2.insert(kotlin.text.h.G(sb2), "()");
                    }
                }
                sb2.append("(");
            }
        }
        if (!d11.isEmpty()) {
            sb2.append("context(");
            Iterator<je.N> it = d11.subList(0, C7714v.P(d11)).iterator();
            while (it.hasNext()) {
                Z(sb2, it.next());
                sb2.append(", ");
            }
            Z(sb2, (je.N) C7714v.X(d11));
            sb2.append(") ");
        }
        W("suspend", sb2, l11);
        if (f7 != null) {
            boolean z14 = (t0(f7) && !f7.I0()) || qd.i.l(f7) || !f7.getAnnotations().isEmpty() || (f7 instanceof C7401v);
            if (z14) {
                sb2.append("(");
            }
            Z(sb2, f7);
            if (z14) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (!qd.i.i(y12) || y12.F0().size() > 1) {
            int i11 = 0;
            for (y0 y0Var : qd.i.h(y12)) {
                int i12 = i11 + 1;
                if (i11 > 0) {
                    sb2.append(", ");
                }
                if (a11.G()) {
                    je.N type = y0Var.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    fVar = qd.i.c(type);
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    sb2.append(X(fVar, false));
                    sb2.append(": ");
                }
                sb2.append(n0(y0Var));
                i11 = i12;
            }
        } else {
            sb2.append("???");
        }
        sb2.append(") ");
        int i13 = b.f27618a[a11.Y().ordinal()];
        if (i13 == 1) {
            y11 = y("->");
        } else {
            if (i13 != 2) {
                throw new Sc.o();
            }
            y11 = "&rarr;";
        }
        sb2.append(y11);
        sb2.append(" ");
        Z(sb2, qd.i.g(y12));
        if (z13) {
            sb2.append(")");
        }
        if (I02) {
            sb2.append("?");
        }
    }

    private final void b0(StringBuilder sb2, InterfaceC9836b interfaceC9836b) {
        A a11 = this.f27614d;
        if (!a11.C().contains(v.OVERRIDE) || interfaceC9836b.o().isEmpty() || a11.E() == D.RENDER_OPEN) {
            return;
        }
        W("override", sb2, true);
        if (a11.d0()) {
            sb2.append("/*");
            sb2.append(interfaceC9836b.o().size());
            sb2.append("*/ ");
        }
    }

    private final void c0(Sd.c cVar, String str, StringBuilder sb2) {
        sb2.append(R(str));
        Sd.d j11 = cVar.j();
        Intrinsics.checkNotNullExpressionValue(j11, "toUnsafe(...)");
        String P11 = P(j11);
        if (P11.length() > 0) {
            sb2.append(" ");
            sb2.append(P11);
        }
    }

    private final void d0(StringBuilder sb2, C9829U c9829u) {
        C9829U c11 = c9829u.c();
        if (c11 != null) {
            d0(sb2, c11);
            sb2.append('.');
            Sd.f name = c9829u.b().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            sb2.append(X(name, false));
        } else {
            s0 k11 = c9829u.b().k();
            Intrinsics.checkNotNullExpressionValue(k11, "getTypeConstructor(...)");
            sb2.append(j0(k11));
        }
        sb2.append(i0(c9829u.a()));
    }

    private final void e0(StringBuilder sb2, InterfaceC9836b interfaceC9836b) {
        InterfaceC9834Z d02 = interfaceC9836b.d0();
        if (d02 != null) {
            G(sb2, d02, EnumC10027e.RECEIVER);
            je.N type = d02.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(O(type));
            sb2.append(".");
        }
    }

    private final void f0(StringBuilder sb2, InterfaceC9836b interfaceC9836b) {
        InterfaceC9834Z d02;
        if (this.f27614d.K() && (d02 = interfaceC9836b.d0()) != null) {
            sb2.append(" on ");
            je.N type = d02.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(h0(type));
        }
    }

    private static void g0(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0 || sb2.charAt(length - 1) != ' ') {
            sb2.append(' ');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(i0 i0Var, StringBuilder sb2, boolean z11) {
        if (z11) {
            sb2.append(y("<"));
        }
        if (this.f27614d.d0()) {
            sb2.append("/*");
            sb2.append(i0Var.getIndex());
            sb2.append("*/ ");
        }
        W("reified", sb2, i0Var.w());
        String b11 = i0Var.x().b();
        boolean z12 = true;
        W(b11, sb2, b11.length() > 0);
        G(sb2, i0Var, null);
        Y(i0Var, sb2, z11);
        int size = i0Var.getUpperBounds().size();
        if ((size > 1 && !z11) || size == 1) {
            je.N next = i0Var.getUpperBounds().iterator().next();
            if (!qd.m.Y(next)) {
                sb2.append(" : ");
                sb2.append(h0(next));
            }
        } else if (z11) {
            for (je.N n11 : i0Var.getUpperBounds()) {
                if (!qd.m.Y(n11)) {
                    if (z12) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    sb2.append(h0(n11));
                    z12 = false;
                }
            }
        }
        if (z11) {
            sb2.append(y(">"));
        }
    }

    private final void l0(StringBuilder sb2, List<? extends i0> list) {
        Iterator<? extends i0> it = list.iterator();
        while (it.hasNext()) {
            k0(it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    private final void m0(List<? extends i0> list, StringBuilder sb2, boolean z11) {
        if (this.f27614d.i0() || list.isEmpty()) {
            return;
        }
        sb2.append(y("<"));
        l0(sb2, list);
        sb2.append(y(">"));
        if (z11) {
            sb2.append(" ");
        }
    }

    public static final void n(u uVar, InterfaceC9830V interfaceC9830V, StringBuilder sb2) {
        uVar.T(interfaceC9830V, sb2);
    }

    public static final void o(u uVar, wd.G classifier, StringBuilder sb2) {
        StringBuilder sb3;
        InterfaceC9838d z11;
        String str;
        uVar.getClass();
        boolean z12 = classifier.getKind() == EnumC9840f.ENUM_ENTRY;
        A a11 = uVar.f27614d;
        if (!a11.X()) {
            List<InterfaceC9834Z> h02 = classifier.h0();
            Intrinsics.checkNotNullExpressionValue(h02, "getContextReceivers(...)");
            uVar.K(sb2, h02);
            uVar.G(sb2, classifier, null);
            if (!z12) {
                AbstractC9853s visibility = classifier.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                uVar.r0(visibility, sb2);
            }
            if ((classifier.getKind() != EnumC9840f.INTERFACE || classifier.h() != EnumC9812C.ABSTRACT) && (!classifier.getKind().a() || classifier.h() != EnumC9812C.FINAL)) {
                EnumC9812C h11 = classifier.h();
                Intrinsics.checkNotNullExpressionValue(h11, "getModality(...)");
                uVar.U(h11, sb2, D(classifier));
            }
            uVar.T(classifier, sb2);
            uVar.W("inner", sb2, a11.C().contains(v.INNER) && classifier.g());
            uVar.W("data", sb2, a11.C().contains(v.DATA) && classifier.E0());
            uVar.W("inline", sb2, a11.C().contains(v.INLINE) && classifier.isInline());
            uVar.W(AppMeasurementSdk.ConditionalUserProperty.VALUE, sb2, a11.C().contains(v.VALUE) && classifier.s());
            uVar.W("fun", sb2, a11.C().contains(v.FUN) && classifier.l0());
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            if (classifier instanceof h0) {
                str = "typealias";
            } else if (classifier.j0()) {
                str = "companion object";
            } else {
                switch (n.a.C0557a.f27605a[classifier.getKind().ordinal()]) {
                    case 1:
                        str = "class";
                        break;
                    case 2:
                        str = "interface";
                        break;
                    case 3:
                        str = "enum class";
                        break;
                    case 4:
                        str = "object";
                        break;
                    case 5:
                        str = "annotation class";
                        break;
                    case 6:
                        str = "enum entry";
                        break;
                    default:
                        throw new Sc.o();
                }
            }
            sb2.append(uVar.R(str));
        }
        if (Vd.i.s(classifier)) {
            if (a11.M()) {
                if (a11.X()) {
                    sb2.append("companion object");
                }
                g0(sb2);
                InterfaceC9845k d11 = classifier.d();
                if (d11 != null) {
                    sb2.append("of ");
                    Sd.f name = d11.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    sb2.append(uVar.X(name, false));
                }
            }
            if (a11.d0() || !Intrinsics.d(classifier.getName(), Sd.h.f26145b)) {
                if (!a11.X()) {
                    g0(sb2);
                }
                Sd.f name2 = classifier.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                sb2.append(uVar.X(name2, true));
            }
        } else {
            if (!a11.X()) {
                g0(sb2);
            }
            uVar.Y(classifier, sb2, true);
        }
        if (z12) {
            return;
        }
        List<i0> r11 = classifier.r();
        Intrinsics.checkNotNullExpressionValue(r11, "getDeclaredTypeParameters(...)");
        uVar.m0(r11, sb2, false);
        uVar.I(classifier, sb2);
        if (!classifier.getKind().a() && a11.s() && (z11 = classifier.z()) != null) {
            sb2.append(" ");
            uVar.G(sb2, z11, null);
            AbstractC9853s visibility2 = z11.getVisibility();
            Intrinsics.checkNotNullExpressionValue(visibility2, "getVisibility(...)");
            uVar.r0(visibility2, sb2);
            sb2.append(uVar.R("constructor"));
            List<p0> f7 = z11.f();
            Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
            uVar.q0(f7, z11.m0(), sb2);
        }
        if (!a11.h0() && !qd.m.c0(classifier.q())) {
            Collection<je.N> o11 = classifier.k().o();
            Intrinsics.checkNotNullExpressionValue(o11, "getSupertypes(...)");
            if (!o11.isEmpty() && (o11.size() != 1 || !qd.m.R(o11.iterator().next()))) {
                g0(sb2);
                sb2.append(": ");
                sb3 = sb2;
                C7714v.U(o11, sb3, ", ", null, null, new s(uVar), 60);
                uVar.s0(sb3, r11);
            }
        }
        sb3 = sb2;
        uVar.s0(sb3, r11);
    }

    private final void o0(q0 q0Var, StringBuilder sb2, boolean z11) {
        if (z11 || !(q0Var instanceof p0)) {
            sb2.append(R(q0Var.B() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(u uVar, C10528n c10528n, StringBuilder sb2) {
        boolean z11;
        boolean z12;
        InterfaceC9838d z13;
        ArrayList arrayList;
        uVar.getClass();
        uVar.G(sb2, c10528n, null);
        A a11 = uVar.f27614d;
        if (a11.R() || c10528n.K().h() != EnumC9812C.SEALED) {
            AbstractC9853s visibility = c10528n.getVisibility();
            Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
            if (uVar.r0(visibility, sb2)) {
                z11 = true;
                uVar.S(sb2, c10528n);
                z12 = (a11.O() && c10528n.k0() && !z11) ? false : true;
                if (z12) {
                    sb2.append(uVar.R("constructor"));
                }
                InterfaceC9839e d11 = c10528n.d();
                Intrinsics.checkNotNullExpressionValue(d11, "getContainingDeclaration(...)");
                if (a11.V()) {
                    if (z12) {
                        sb2.append(" ");
                    }
                    uVar.Y(d11, sb2, true);
                    List<i0> typeParameters = c10528n.getTypeParameters();
                    Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
                    uVar.m0(typeParameters, sb2, false);
                }
                List<p0> f7 = c10528n.f();
                Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
                uVar.q0(f7, c10528n.m0(), sb2);
                if (a11.N() && !c10528n.k0() && d11 != null && (z13 = d11.z()) != null) {
                    List<p0> f11 = z13.f();
                    Intrinsics.checkNotNullExpressionValue(f11, "getValueParameters(...)");
                    arrayList = new ArrayList();
                    for (Object obj : f11) {
                        p0 p0Var = (p0) obj;
                        if (!p0Var.R() && p0Var.x0() == null) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        sb2.append(" : ");
                        sb2.append(uVar.R("this"));
                        sb2.append(C7714v.V(arrayList, ", ", "(", ")", r.f27610a, 24));
                    }
                }
                if (a11.V()) {
                    return;
                }
                List<i0> typeParameters2 = c10528n.getTypeParameters();
                Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
                uVar.s0(sb2, typeParameters2);
                return;
            }
        }
        z11 = false;
        uVar.S(sb2, c10528n);
        if (a11.O()) {
        }
        if (z12) {
        }
        InterfaceC9839e d112 = c10528n.d();
        Intrinsics.checkNotNullExpressionValue(d112, "getContainingDeclaration(...)");
        if (a11.V()) {
        }
        List<p0> f72 = c10528n.f();
        Intrinsics.checkNotNullExpressionValue(f72, "getValueParameters(...)");
        uVar.q0(f72, c10528n.m0(), sb2);
        if (a11.N()) {
            List<p0> f112 = z13.f();
            Intrinsics.checkNotNullExpressionValue(f112, "getValueParameters(...)");
            arrayList = new ArrayList();
            while (r1.hasNext()) {
            }
            if (!arrayList.isEmpty()) {
            }
        }
        if (a11.V()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p0(p0 p0Var, boolean z11, StringBuilder sb2, boolean z12) {
        boolean z13;
        je.N type;
        if (z12) {
            sb2.append(R("value-parameter"));
            sb2.append(" ");
        }
        A a11 = this.f27614d;
        if (a11.d0()) {
            sb2.append("/*");
            sb2.append(p0Var.getIndex());
            sb2.append("*/ ");
        }
        G(sb2, p0Var, null);
        W("crossinline", sb2, p0Var.u0());
        W("noinline", sb2, p0Var.t0());
        boolean z14 = false;
        if (a11.S()) {
            InterfaceC9835a d11 = p0Var.d();
            InterfaceC9838d interfaceC9838d = d11 instanceof InterfaceC9838d ? (InterfaceC9838d) d11 : null;
            if (interfaceC9838d != null && interfaceC9838d.k0()) {
                z13 = true;
                if (z13) {
                    W("actual", sb2, a11.n());
                }
                type = p0Var.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                je.N x02 = p0Var.x0();
                je.N n11 = x02 != null ? type : x02;
                W("vararg", sb2, x02 == null);
                if (!z13 || (z12 && !a11.X())) {
                    o0(p0Var, sb2, z13);
                }
                if (z11) {
                    Y(p0Var, sb2, z12);
                    sb2.append(": ");
                }
                sb2.append(h0(n11));
                Q(p0Var, sb2);
                if (a11.d0() && x02 != null) {
                    sb2.append(" /*");
                    sb2.append(h0(type));
                    sb2.append("*/");
                }
                if (a11.v() != null) {
                    if (a11.u() ? p0Var.R() : Zd.e.a(p0Var)) {
                        z14 = true;
                    }
                }
                if (z14) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(" = ");
                Function1<p0, String> v11 = a11.v();
                Intrinsics.f(v11);
                sb3.append(v11.invoke(p0Var));
                sb2.append(sb3.toString());
                return;
            }
        }
        z13 = false;
        if (z13) {
        }
        type = p0Var.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        je.N x022 = p0Var.x0();
        if (x022 != null) {
        }
        W("vararg", sb2, x022 == null);
        if (!z13) {
        }
        o0(p0Var, sb2, z13);
        if (z11) {
        }
        sb2.append(h0(n11));
        Q(p0Var, sb2);
        if (a11.d0()) {
            sb2.append(" /*");
            sb2.append(h0(type));
            sb2.append("*/");
        }
        if (a11.v() != null) {
        }
        if (z14) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r0.o() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        if (r0.o() != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(u uVar, InterfaceC9857w interfaceC9857w, StringBuilder sb2) {
        boolean z11;
        A a11 = uVar.f27614d;
        if (!a11.X()) {
            if (!a11.W()) {
                List<InterfaceC9834Z> y02 = interfaceC9857w.y0();
                Intrinsics.checkNotNullExpressionValue(y02, "getContextReceiverParameters(...)");
                uVar.K(sb2, y02);
                uVar.G(sb2, interfaceC9857w, null);
                AbstractC9853s visibility = interfaceC9857w.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                uVar.r0(visibility, sb2);
                uVar.V(sb2, interfaceC9857w);
                if (a11.z()) {
                    uVar.T(interfaceC9857w, sb2);
                }
                uVar.b0(sb2, interfaceC9857w);
                if (a11.z()) {
                    boolean z12 = false;
                    if (interfaceC9857w.isOperator()) {
                        Collection<? extends InterfaceC9836b> o11 = interfaceC9857w.o();
                        Intrinsics.checkNotNullExpressionValue(o11, "getOverriddenDescriptors(...)");
                        Collection<? extends InterfaceC9836b> collection = o11;
                        if (!collection.isEmpty()) {
                            Iterator<T> it = collection.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (((InterfaceC9857w) it.next()).isOperator()) {
                                }
                            }
                        }
                        z11 = true;
                        if (interfaceC9857w.isInfix()) {
                            Collection<? extends InterfaceC9836b> o12 = interfaceC9857w.o();
                            Intrinsics.checkNotNullExpressionValue(o12, "getOverriddenDescriptors(...)");
                            Collection<? extends InterfaceC9836b> collection2 = o12;
                            if (!collection2.isEmpty()) {
                                Iterator<T> it2 = collection2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if (((InterfaceC9857w) it2.next()).isInfix()) {
                                    }
                                }
                            }
                            z12 = true;
                        }
                        uVar.W("tailrec", sb2, interfaceC9857w.y());
                        uVar.W("suspend", sb2, interfaceC9857w.isSuspend());
                        uVar.W("inline", sb2, interfaceC9857w.isInline());
                        uVar.W("infix", sb2, z12);
                        uVar.W("operator", sb2, z11);
                    }
                    z11 = false;
                    if (interfaceC9857w.isInfix()) {
                    }
                    uVar.W("tailrec", sb2, interfaceC9857w.y());
                    uVar.W("suspend", sb2, interfaceC9857w.isSuspend());
                    uVar.W("inline", sb2, interfaceC9857w.isInline());
                    uVar.W("infix", sb2, z12);
                    uVar.W("operator", sb2, z11);
                } else {
                    uVar.W("suspend", sb2, interfaceC9857w.isSuspend());
                }
                uVar.S(sb2, interfaceC9857w);
                if (a11.d0()) {
                    if (interfaceC9857w.B0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC9857w.T()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(uVar.R("fun"));
            sb2.append(" ");
            List<i0> typeParameters = interfaceC9857w.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            uVar.m0(typeParameters, sb2, true);
            uVar.e0(sb2, interfaceC9857w);
        }
        uVar.Y(interfaceC9857w, sb2, true);
        List<p0> f7 = interfaceC9857w.f();
        Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
        uVar.q0(f7, interfaceC9857w.m0(), sb2);
        uVar.f0(sb2, interfaceC9857w);
        je.N returnType = interfaceC9857w.getReturnType();
        if (!a11.g0() && (a11.b0() || returnType == null || !qd.m.l0(returnType))) {
            sb2.append(": ");
            sb2.append(returnType == null ? "[NULL]" : uVar.h0(returnType));
        }
        List<i0> typeParameters2 = interfaceC9857w.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
        uVar.s0(sb2, typeParameters2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r9 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void q0(Collection<? extends p0> collection, boolean z11, StringBuilder sb2) {
        A a11 = this.f27614d;
        int i11 = b.f27619b[a11.F().ordinal()];
        boolean z12 = true;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new Sc.o();
                }
            }
            z12 = false;
        }
        int size = collection.size();
        a11.c0().a(sb2);
        int i12 = 0;
        for (p0 p0Var : collection) {
            a11.c0().b(p0Var, sb2);
            p0(p0Var, z12, sb2, false);
            a11.c0().d(p0Var, i12, size, sb2);
            i12++;
        }
        a11.c0().c(sb2);
    }

    private final boolean r0(AbstractC9853s abstractC9853s, StringBuilder sb2) {
        A a11 = this.f27614d;
        if (!a11.C().contains(v.VISIBILITY)) {
            return false;
        }
        if (a11.D()) {
            abstractC9853s = abstractC9853s.d();
        }
        if (!a11.R() && Intrinsics.d(abstractC9853s, C9852r.f99410l)) {
            return false;
        }
        sb2.append(R(abstractC9853s.b()));
        sb2.append(" ");
        return true;
    }

    public static final void s(u uVar, N n11, StringBuilder sb2) {
        uVar.getClass();
        uVar.c0(n11.c(), "package-fragment", sb2);
        if (uVar.f27614d.u()) {
            sb2.append(" in ");
            uVar.Y(n11.d(), sb2, false);
        }
    }

    private final void s0(StringBuilder sb2, List list) {
        if (this.f27614d.i0()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            List<je.N> upperBounds = i0Var.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            for (je.N n11 : C7714v.D(upperBounds, 1)) {
                StringBuilder sb3 = new StringBuilder();
                Sd.f name = i0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                sb3.append(X(name, false));
                sb3.append(" : ");
                Intrinsics.f(n11);
                sb3.append(h0(n11));
                arrayList.add(sb3.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb2.append(" ");
        sb2.append(R("where"));
        sb2.append(" ");
        C7714v.U(arrayList, sb2, ", ", null, null, null, 124);
    }

    public static final void t(u uVar, C10513E c10513e, StringBuilder sb2) {
        uVar.getClass();
        uVar.c0(c10513e.c(), "package", sb2);
        if (uVar.f27614d.u()) {
            sb2.append(" in context of ");
            uVar.Y(c10513e.A0(), sb2, false);
        }
    }

    private static boolean t0(je.N n11) {
        if (!qd.i.j(n11)) {
            return false;
        }
        List<y0> F02 = n11.F0();
        if ((F02 instanceof Collection) && F02.isEmpty()) {
            return true;
        }
        Iterator<T> it = F02.iterator();
        while (it.hasNext()) {
            if (((y0) it.next()).a()) {
                return false;
            }
        }
        return true;
    }

    public static final void u(u uVar, InterfaceC9831W interfaceC9831W, StringBuilder sb2) {
        A a11 = uVar.f27614d;
        if (!a11.X()) {
            if (!a11.W()) {
                List<InterfaceC9834Z> y02 = interfaceC9831W.y0();
                Intrinsics.checkNotNullExpressionValue(y02, "getContextReceiverParameters(...)");
                uVar.K(sb2, y02);
                if (a11.C().contains(v.ANNOTATIONS)) {
                    uVar.G(sb2, interfaceC9831W, null);
                    C10536w O11 = interfaceC9831W.O();
                    if (O11 != null) {
                        uVar.G(sb2, O11, EnumC10027e.FIELD);
                    }
                    C10536w C11 = interfaceC9831W.C();
                    if (C11 != null) {
                        uVar.G(sb2, C11, EnumC10027e.PROPERTY_DELEGATE_FIELD);
                    }
                    if (a11.I() == F.NONE) {
                        S getter = interfaceC9831W.getGetter();
                        if (getter != null) {
                            uVar.G(sb2, getter, EnumC10027e.PROPERTY_GETTER);
                        }
                        InterfaceC9833Y setter = interfaceC9831W.getSetter();
                        if (setter != null) {
                            uVar.G(sb2, setter, EnumC10027e.PROPERTY_SETTER);
                            List<p0> f7 = setter.f();
                            Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
                            p0 p0Var = (p0) C7714v.B0(f7);
                            Intrinsics.f(p0Var);
                            uVar.G(sb2, p0Var, EnumC10027e.SETTER_PARAMETER);
                        }
                    }
                }
                AbstractC9853s visibility = interfaceC9831W.getVisibility();
                Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
                uVar.r0(visibility, sb2);
                uVar.W("const", sb2, a11.C().contains(v.CONST) && interfaceC9831W.J());
                uVar.T(interfaceC9831W, sb2);
                uVar.V(sb2, interfaceC9831W);
                uVar.b0(sb2, interfaceC9831W);
                uVar.W("lateinit", sb2, a11.C().contains(v.LATEINIT) && interfaceC9831W.z0());
                uVar.S(sb2, interfaceC9831W);
            }
            uVar.o0(interfaceC9831W, sb2, false);
            List<i0> typeParameters = interfaceC9831W.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            uVar.m0(typeParameters, sb2, true);
            uVar.e0(sb2, interfaceC9831W);
        }
        uVar.Y(interfaceC9831W, sb2, true);
        sb2.append(": ");
        je.N type = interfaceC9831W.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb2.append(uVar.h0(type));
        uVar.f0(sb2, interfaceC9831W);
        uVar.Q(interfaceC9831W, sb2);
        List<i0> typeParameters2 = interfaceC9831W.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
        uVar.s0(sb2, typeParameters2);
    }

    public static final void v(u uVar, AbstractC10523i abstractC10523i, StringBuilder sb2) {
        uVar.getClass();
        uVar.G(sb2, abstractC10523i, null);
        AbstractC9853s visibility = abstractC10523i.getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        uVar.r0(visibility, sb2);
        uVar.T(abstractC10523i, sb2);
        sb2.append(uVar.R("typealias"));
        sb2.append(" ");
        uVar.Y(abstractC10523i, sb2, true);
        List<i0> r11 = abstractC10523i.r();
        Intrinsics.checkNotNullExpressionValue(r11, "getDeclaredTypeParameters(...)");
        uVar.m0(r11, sb2, false);
        uVar.I(abstractC10523i, sb2);
        sb2.append(" = ");
        sb2.append(uVar.h0(((C6927I) abstractC10523i).w0()));
    }

    private final String y(String str) {
        return this.f27614d.Y().a(str);
    }

    public final boolean A() {
        return this.f27614d.x();
    }

    @NotNull
    public final A B() {
        return this.f27614d;
    }

    @NotNull
    public final F C() {
        return this.f27614d.I();
    }

    @NotNull
    public final String E(@NotNull InterfaceC9845k declarationDescriptor) {
        InterfaceC9845k d11;
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.X(new a(), sb2);
        A a11 = this.f27614d;
        if (a11.e0() && !(declarationDescriptor instanceof InterfaceC9820K) && !(declarationDescriptor instanceof InterfaceC9827S) && (d11 = declarationDescriptor.d()) != null && !(d11 instanceof InterfaceC9815F)) {
            sb2.append(" ");
            String str = "defined in";
            Intrinsics.checkNotNullParameter("defined in", "message");
            int i11 = b.f27618a[a11.Y().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new Sc.o();
                }
                str = "<i>defined in</i>";
            }
            sb2.append(str);
            sb2.append(" ");
            Sd.d k11 = Vd.i.k(d11);
            Intrinsics.checkNotNullExpressionValue(k11, "getFqName(...)");
            sb2.append(k11.e() ? "root package" : P(k11));
            if (a11.f0() && (d11 instanceof InterfaceC9820K) && (declarationDescriptor instanceof InterfaceC9848n)) {
                ((InterfaceC9848n) declarationDescriptor).e().b();
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String F(@NotNull InterfaceC10025c annotation, EnumC10027e enumC10027e) {
        InterfaceC9838d z11;
        List<p0> f7;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (enumC10027e != null) {
            sb2.append(enumC10027e.a() + ':');
        }
        je.N type = annotation.getType();
        sb2.append(h0(type));
        A a11 = this.f27614d;
        a11.getClass();
        if (w.a.a(a11)) {
            Map<Sd.f, Xd.g<?>> b11 = annotation.b();
            K k11 = null;
            InterfaceC9839e d11 = a11.P() ? Zd.e.d(annotation) : null;
            if (d11 != null && (z11 = d11.z()) != null && (f7 = z11.f()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : f7) {
                    if (((p0) obj).R()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((p0) it.next()).getName());
                }
                k11 = arrayList2;
            }
            if (k11 == null) {
                k11 = K.f71697a;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : k11) {
                if (!b11.containsKey((Sd.f) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(C7714v.z(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((Sd.f) it2.next()).b() + " = ...");
            }
            Set<Map.Entry<Sd.f, Xd.g<?>>> entrySet = b11.entrySet();
            ArrayList arrayList5 = new ArrayList(C7714v.z(entrySet, 10));
            Iterator<T> it3 = entrySet.iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                Sd.f fVar = (Sd.f) entry.getKey();
                Xd.g<?> gVar = (Xd.g) entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(fVar.b());
                sb3.append(" = ");
                sb3.append(!k11.contains(fVar) ? J(gVar) : "...");
                arrayList5.add(sb3.toString());
            }
            List H02 = C7714v.H0(C7714v.p0(arrayList5, arrayList4));
            if (w.a.b(a11) || !H02.isEmpty()) {
                C7714v.U(H02, sb2, ", ", "(", ")", null, 112);
            }
        }
        if (a11.d0() && (je.S.a(type) || (type.H0().p() instanceof C9819J.b))) {
            sb2.append(" /* annotation class not found */");
        }
        String sb4 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    @NotNull
    public final String N(@NotNull String lowerRendered, @NotNull String upperRendered, @NotNull qd.m builtIns) {
        Intrinsics.checkNotNullParameter(lowerRendered, "lowerRendered");
        Intrinsics.checkNotNullParameter(upperRendered, "upperRendered");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        if (H.d(lowerRendered, upperRendered)) {
            return kotlin.text.h.e0(upperRendered, "(", false) ? A0.b("(", lowerRendered, ")!") : lowerRendered.concat("!");
        }
        A a11 = this.f27614d;
        InterfaceC4059b t2 = a11.t();
        builtIns.getClass();
        InterfaceC9839e o11 = builtIns.o(s.a.f81873C);
        Intrinsics.checkNotNullExpressionValue(o11, "getCollection(...)");
        String m02 = kotlin.text.h.m0(t2.a(o11, this), "Collection");
        String c11 = H.c(lowerRendered, U7.d.e(m02, "Mutable"), upperRendered, m02, U7.d.e(m02, "(Mutable)"));
        if (c11 != null) {
            return c11;
        }
        String c12 = H.c(lowerRendered, U7.d.e(m02, "MutableMap.MutableEntry"), upperRendered, U7.d.e(m02, "Map.Entry"), U7.d.e(m02, "(Mutable)Map.(Mutable)Entry"));
        if (c12 != null) {
            return c12;
        }
        InterfaceC4059b t11 = a11.t();
        InterfaceC9839e j11 = builtIns.j();
        Intrinsics.checkNotNullExpressionValue(j11, "getArray(...)");
        String m03 = kotlin.text.h.m0(t11.a(j11, this), "Array");
        StringBuilder e11 = C3261b.e(m03);
        e11.append(y("Array<"));
        String sb2 = e11.toString();
        StringBuilder e12 = C3261b.e(m03);
        e12.append(y("Array<out "));
        String sb3 = e12.toString();
        StringBuilder e13 = C3261b.e(m03);
        e13.append(y("Array<(out) "));
        String c13 = H.c(lowerRendered, sb2, upperRendered, sb3, e13.toString());
        if (c13 != null) {
            return c13;
        }
        return "(" + lowerRendered + ".." + upperRendered + ')';
    }

    @NotNull
    public final String P(@NotNull Sd.d fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        List<Sd.f> h11 = fqName.h();
        Intrinsics.checkNotNullExpressionValue(h11, "pathSegments(...)");
        return y(H.b(h11));
    }

    @NotNull
    public final String X(@NotNull Sd.f name, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        String y11 = y(H.a(name));
        A a11 = this.f27614d;
        return (a11.r() && a11.Y() == G.HTML && z11) ? A0.b("<b>", y11, "</b>") : y11;
    }

    @Override // Ud.w
    @NotNull
    public final Set<Sd.c> a() {
        return this.f27614d.a();
    }

    @Override // Ud.w
    public final void b() {
        this.f27614d.b();
    }

    @Override // Ud.w
    public final void c(@NotNull Set<? extends v> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f27614d.c(set);
    }

    @Override // Ud.w
    public final void d(@NotNull E e11) {
        Intrinsics.checkNotNullParameter(e11, "<set-?>");
        this.f27614d.d(e11);
    }

    @Override // Ud.w
    public final void e(@NotNull LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<set-?>");
        this.f27614d.e(linkedHashSet);
    }

    @Override // Ud.w
    public final void f(@NotNull G g10) {
        Intrinsics.checkNotNullParameter(g10, "<set-?>");
        this.f27614d.f(g10);
    }

    @Override // Ud.w
    public final void g(@NotNull InterfaceC4059b interfaceC4059b) {
        Intrinsics.checkNotNullParameter(interfaceC4059b, "<set-?>");
        this.f27614d.g(interfaceC4059b);
    }

    @Override // Ud.w
    public final void h() {
        this.f27614d.h();
    }

    @NotNull
    public final String h0(@NotNull je.N type) {
        Intrinsics.checkNotNullParameter(type, "type");
        StringBuilder sb2 = new StringBuilder();
        Z(sb2, this.f27614d.Z().invoke(type));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @Override // Ud.w
    public final void i() {
        this.f27614d.i();
    }

    @NotNull
    public final String i0(@NotNull List<? extends y0> typeArguments) {
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y("<"));
        C7714v.U(typeArguments, sb2, ", ", null, null, new q(this), 60);
        return C2942q.c(sb2, y(">"), "toString(...)");
    }

    @Override // Ud.w
    public final void j() {
        this.f27614d.j();
    }

    @NotNull
    public final String j0(@NotNull s0 typeConstructor) {
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        InterfaceC9842h klass = typeConstructor.p();
        if ((klass instanceof i0) || (klass instanceof InterfaceC9839e) || (klass instanceof h0)) {
            Intrinsics.checkNotNullParameter(klass, "klass");
            return le.l.k(klass) ? klass.k().toString() : this.f27614d.t().a(klass, this);
        }
        if (klass == null) {
            return typeConstructor instanceof M ? ((M) typeConstructor).e(p.f27608a) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + klass.getClass()).toString());
    }

    @Override // Ud.w
    public final void k() {
        this.f27614d.k();
    }

    @Override // Ud.w
    public final void l() {
        this.f27614d.l();
    }

    @Override // Ud.w
    public final void m() {
        this.f27614d.m();
    }

    @NotNull
    public final String n0(@NotNull y0 typeProjection) {
        Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        C7714v.U(C7714v.a0(typeProjection), sb2, ", ", null, null, new q(this), 60);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public final boolean z() {
        return this.f27614d.u();
    }
}
