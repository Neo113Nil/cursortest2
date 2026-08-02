package T0;

import S0.AbstractC3984t;
import S0.C3945c;
import S0.C3947c1;
import S0.C3953e1;
import S0.C3966j0;
import S0.C3968k0;
import S0.C3981r0;
import S0.InterfaceC3951e;
import S0.InterfaceC3963i;
import S0.InterfaceC3982s;
import S0.J0;
import S0.K0;
import S0.U0;
import S0.V0;
import S0.W0;
import T0.f;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f26374a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26375b;

    /* loaded from: classes8.dex */
    public static final class A extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final A f26376c = new A(1, 0, 2);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            int K11;
            int a11 = aVar.a(0);
            int Y11 = c3953e1.Y();
            int W11 = c3953e1.W();
            int M02 = c3953e1.M0(W11);
            int L02 = c3953e1.L0(W11);
            for (int max = Math.max(M02, L02 - a11); max < L02; max++) {
                Object[] objArr = c3953e1.f25380c;
                K11 = c3953e1.K(max);
                Object obj = objArr[K11];
                if (obj instanceof W0) {
                    u02.c(((W0) obj).b(), Y11 - max, -1, -1);
                } else if (obj instanceof J0) {
                    ((J0) obj).v();
                }
            }
            c3953e1.S0(a11);
        }

        @Override // T0.d
        @NotNull
        public final String d(int i11) {
            return i11 == 0 ? "count" : super.d(i11);
        }
    }

    public static final class B extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final B f26377c = new B(1, 2);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            int i11;
            int i12;
            Object b11 = aVar.b(0);
            C3945c c3945c = (C3945c) aVar.b(1);
            int a11 = aVar.a(0);
            if (b11 instanceof W0) {
                u02.b(((W0) b11).b());
            }
            int F11 = c3953e1.F(c3945c);
            Object D02 = c3953e1.D0(F11, a11, b11);
            if (!(D02 instanceof W0)) {
                if (D02 instanceof J0) {
                    ((J0) D02).v();
                    return;
                }
                return;
            }
            int Y11 = c3953e1.Y() - c3953e1.J0(F11, a11);
            W0 w02 = (W0) D02;
            C3945c a12 = w02.a();
            if (a12 == null || !a12.b()) {
                i11 = -1;
                i12 = -1;
            } else {
                i11 = c3953e1.F(a12);
                i12 = c3953e1.Y() - c3953e1.K0(i11);
            }
            u02.c(w02.b(), Y11, i11, i12);
        }

        @Override // T0.d
        @NotNull
        public final String d(int i11) {
            return i11 == 0 ? "groupSlotIndex" : super.d(i11);
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? AppMeasurementSdk.ConditionalUserProperty.VALUE : i11 == 1 ? "anchor" : super.e(i11);
        }
    }

    public static final class C extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C f26378c;

        static {
            int i11 = 1;
            f26378c = new C(0, i11, i11);
        }

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            c3953e1.V0(aVar.b(0));
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? "data" : super.e(i11);
        }
    }

    public static final class D extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final D f26379c = new D(0, 2, 1);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            ((Function2) aVar.b(1)).invoke(interfaceC3951e.d(), aVar.b(0));
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? AppMeasurementSdk.ConditionalUserProperty.VALUE : i11 == 1 ? "block" : super.e(i11);
        }
    }

    public static final class E extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final E f26380c = new E(1, 1);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            Object b11 = aVar.b(0);
            int a11 = aVar.a(0);
            if (b11 instanceof W0) {
                u02.b(((W0) b11).b());
            }
            Object E02 = c3953e1.E0(a11, b11);
            if (E02 instanceof W0) {
                u02.c(((W0) E02).b(), c3953e1.Y() - c3953e1.J0(c3953e1.U(), a11), -1, -1);
            } else if (E02 instanceof J0) {
                ((J0) E02).v();
            }
        }

        @Override // T0.d
        @NotNull
        public final String d(int i11) {
            return i11 == 0 ? "groupSlotIndex" : super.d(i11);
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? AppMeasurementSdk.ConditionalUserProperty.VALUE : super.e(i11);
        }
    }

    public static final class F extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final F f26381c = new F(1, 0, 2);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            int a11 = aVar.a(0);
            for (int i11 = 0; i11 < a11; i11++) {
                interfaceC3951e.g();
            }
        }

        @Override // T0.d
        @NotNull
        public final String d(int i11) {
            return i11 == 0 ? "count" : super.d(i11);
        }
    }

    public static final class G extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final G f26382c;

        static {
            int i11 = 0;
            f26382c = new G(i11, i11, 3);
        }

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            Object d11 = interfaceC3951e.d();
            Intrinsics.g(d11, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((InterfaceC3963i) d11).g();
        }
    }

    /* renamed from: T0.d$a, reason: case insensitive filesystem */
    public static final class C4013a extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C4013a f26383c = new C4013a(1, 0, 2);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            c3953e1.D(aVar.a(0));
        }

        @Override // T0.d
        @NotNull
        public final String d(int i11) {
            return i11 == 0 ? "distance" : super.d(i11);
        }
    }

    /* renamed from: T0.d$b, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    public static final class C4014b extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C4014b f26384c = new C4014b(0, 2, 1);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            C3945c c3945c = (C3945c) aVar.b(0);
            Object b11 = aVar.b(1);
            if (b11 instanceof W0) {
                u02.b(((W0) b11).b());
            }
            c3953e1.G(c3945c, b11);
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? "anchor" : i11 == 1 ? AppMeasurementSdk.ConditionalUserProperty.VALUE : super.e(i11);
        }
    }

    /* renamed from: T0.d$c, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    public static final class C4015c extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C4015c f26385c = new C4015c(0, 2, 1);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            a1.d dVar = (a1.d) aVar.b(1);
            int a11 = dVar != null ? dVar.a() : 0;
            a aVar2 = (a) aVar.b(0);
            if (a11 > 0) {
                interfaceC3951e = new C3981r0(interfaceC3951e, a11);
            }
            aVar2.b(interfaceC3951e, c3953e1, u02);
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? "changes" : i11 == 1 ? "effectiveNodeIndex" : super.e(i11);
        }
    }

    /* renamed from: T0.d$d, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static final class C0530d extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C0530d f26386c = new C0530d(0, 2, 1);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            int a11 = ((a1.d) aVar.b(0)).a();
            List list = (List) aVar.b(1);
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = list.get(i11);
                Intrinsics.g(interfaceC3951e, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i12 = a11 + i11;
                interfaceC3951e.e(i12, obj);
                interfaceC3951e.c(i12, obj);
            }
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? "effectiveNodeIndex" : i11 == 1 ? "nodes" : super.e(i11);
        }
    }

    /* renamed from: T0.d$e, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    public static final class C4016e extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C4016e f26387c = new C4016e(0, 4, 1);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            C3968k0 c3968k0 = (C3968k0) aVar.b(2);
            C3968k0 c3968k02 = (C3968k0) aVar.b(3);
            AbstractC3984t abstractC3984t = (AbstractC3984t) aVar.b(1);
            C3966j0 c3966j0 = (C3966j0) aVar.b(0);
            if (c3966j0 == null && (c3966j0 = abstractC3984t.l(c3968k0)) == null) {
                S0.r.k("Could not resolve state for movable content");
                throw null;
            }
            List q02 = c3953e1.q0(c3966j0.a());
            K0 k02 = (K0) c3968k02.b();
            if (q02.isEmpty()) {
                return;
            }
            int size = q02.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object H02 = c3953e1.H0((C3945c) q02.get(i11));
                J0 j02 = H02 instanceof J0 ? (J0) H02 : null;
                if (j02 != null) {
                    j02.d(k02);
                }
            }
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? "resolvedState" : i11 == 1 ? "resolvedCompositionContext" : i11 == 2 ? "from" : i11 == 3 ? "to" : super.e(i11);
        }
    }

    /* renamed from: T0.d$f, reason: case insensitive filesystem */
    public static final class C4017f extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C4017f f26388c;

        static {
            int i11 = 0;
            f26388c = new C4017f(i11, i11, 3);
        }

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            S0.r.l(c3953e1, u02);
        }
    }

    /* renamed from: T0.d$g, reason: case insensitive filesystem */
    /* loaded from: classes8.dex */
    public static final class C4018g extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final C4018g f26389c = new C4018g(0, 2, 1);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            a1.d dVar = (a1.d) aVar.b(0);
            C3945c c3945c = (C3945c) aVar.b(1);
            Intrinsics.g(interfaceC3951e, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            int F11 = c3953e1.F(c3945c);
            S0.r.u(c3953e1.U() < F11);
            while (!c3953e1.h0(F11)) {
                c3953e1.G0();
                if (c3953e1.l0(c3953e1.W())) {
                    interfaceC3951e.g();
                }
                c3953e1.M();
            }
            int U10 = c3953e1.U();
            int W11 = c3953e1.W();
            while (W11 >= 0 && !c3953e1.l0(W11)) {
                W11 = c3953e1.v0(W11);
            }
            int i11 = W11 + 1;
            int i12 = 0;
            while (i11 < U10) {
                if (c3953e1.g0(U10, i11)) {
                    if (c3953e1.l0(i11)) {
                        i12 = 0;
                    }
                    i11++;
                } else {
                    i12 += c3953e1.l0(i11) ? 1 : c3953e1.u0(i11);
                    i11 += c3953e1.e0(i11);
                }
            }
            while (c3953e1.U() < F11) {
                if (c3953e1.f0(F11)) {
                    if (c3953e1.k0()) {
                        interfaceC3951e.f(c3953e1.t0(c3953e1.U()));
                        i12 = 0;
                    }
                    c3953e1.O0();
                } else {
                    i12 += c3953e1.F0();
                }
            }
            S0.r.u(c3953e1.U() == F11);
            dVar.b(i12);
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? "effectiveNodeIndexOut" : i11 == 1 ? "anchor" : super.e(i11);
        }
    }

    public static final class h extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final h f26390c;

        static {
            int i11 = 1;
            f26390c = new h(0, i11, i11);
        }

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            Intrinsics.g(interfaceC3951e, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) aVar.b(0)) {
                interfaceC3951e.f(obj);
            }
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? "nodes" : super.e(i11);
        }
    }

    public static final class i extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final i f26391c = new i(0, 2, 1);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            ((Function1) aVar.b(0)).invoke((InterfaceC3982s) aVar.b(1));
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? "anchor" : i11 == 1 ? "composition" : super.e(i11);
        }
    }

    public static final class j extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final j f26392c;

        static {
            int i11 = 0;
            f26392c = new j(i11, i11, 3);
        }

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            c3953e1.M();
        }
    }

    /* loaded from: classes8.dex */
    public static final class k extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final k f26393c;

        static {
            int i11 = 0;
            f26393c = new k(i11, i11, 3);
        }

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            Intrinsics.g(interfaceC3951e, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            while (!c3953e1.h0(0)) {
                c3953e1.G0();
                if (c3953e1.l0(c3953e1.W())) {
                    interfaceC3951e.g();
                }
                c3953e1.M();
            }
            c3953e1.M();
        }
    }

    public static final class l extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final l f26394c;

        static {
            int i11 = 1;
            f26394c = new l(0, i11, i11);
        }

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            C3945c c3945c = (C3945c) aVar.b(0);
            c3945c.getClass();
            c3953e1.O(c3953e1.F(c3945c));
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? "anchor" : super.e(i11);
        }
    }

    public static final class m extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final m f26395c;

        static {
            int i11 = 0;
            f26395c = new m(i11, i11, 3);
        }

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            c3953e1.O(0);
        }
    }

    public static final class n extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final n f26396c = new n(1, 2);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            Object invoke = ((Function0) aVar.b(0)).invoke();
            C3945c c3945c = (C3945c) aVar.b(1);
            int a11 = aVar.a(0);
            Intrinsics.g(interfaceC3951e, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            c3953e1.X0(c3945c, invoke);
            interfaceC3951e.c(a11, invoke);
            interfaceC3951e.f(invoke);
        }

        @Override // T0.d
        @NotNull
        public final String d(int i11) {
            return i11 == 0 ? "insertIndex" : super.d(i11);
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? "factory" : i11 == 1 ? "groupAnchor" : super.e(i11);
        }
    }

    public static final class o extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final o f26397c = new o(0, 2, 1);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            C3947c1 c3947c1 = (C3947c1) aVar.b(1);
            C3945c c3945c = (C3945c) aVar.b(0);
            c3953e1.H();
            c3945c.getClass();
            c3953e1.n0(c3947c1, c3947c1.c(c3945c));
            c3953e1.N();
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? "anchor" : i11 == 1 ? "from" : super.e(i11);
        }
    }

    public static final class p extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final p f26398c = new p(0, 3, 1);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            C3947c1 c3947c1 = (C3947c1) aVar.b(1);
            C3945c c3945c = (C3945c) aVar.b(0);
            c cVar = (c) aVar.b(2);
            C3953e1 z11 = c3947c1.z();
            try {
                cVar.d(interfaceC3951e, z11, u02);
                Unit unit = Unit.f71690a;
                z11.I(true);
                c3953e1.H();
                c3945c.getClass();
                c3953e1.n0(c3947c1, c3947c1.c(c3945c));
                c3953e1.N();
            } catch (Throwable th2) {
                z11.I(false);
                throw th2;
            }
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? "anchor" : i11 == 1 ? "from" : i11 == 2 ? "fixups" : super.e(i11);
        }
    }

    /* loaded from: classes8.dex */
    public static final class q extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final q f26399c = new q(1, 0, 2);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            c3953e1.o0(aVar.a(0));
        }

        @Override // T0.d
        @NotNull
        public final String d(int i11) {
            return i11 == 0 ? "offset" : super.d(i11);
        }
    }

    /* loaded from: classes8.dex */
    public static final class r extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final r f26400c = new r(3, 0, 2);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            interfaceC3951e.b(aVar.a(0), aVar.a(1), aVar.a(2));
        }

        @Override // T0.d
        @NotNull
        public final String d(int i11) {
            return i11 == 0 ? "from" : i11 == 1 ? "to" : i11 == 2 ? "count" : super.d(i11);
        }
    }

    public static final class s extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final s f26401c = new s(1, 1);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            C3945c c3945c = (C3945c) aVar.b(0);
            int a11 = aVar.a(0);
            interfaceC3951e.g();
            c3945c.getClass();
            interfaceC3951e.e(a11, c3953e1.t0(c3953e1.F(c3945c)));
        }

        @Override // T0.d
        @NotNull
        public final String d(int i11) {
            return i11 == 0 ? "insertIndex" : super.d(i11);
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? "groupAnchor" : super.e(i11);
        }
    }

    /* loaded from: classes8.dex */
    public static final class t extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final t f26402c = new t(0, 3, 1);

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            S0.G g10 = (S0.G) aVar.b(0);
            AbstractC3984t abstractC3984t = (AbstractC3984t) aVar.b(1);
            C3968k0 c3968k0 = (C3968k0) aVar.b(2);
            C3947c1 c3947c1 = new C3947c1();
            if (c3953e1.T()) {
                c3947c1.k();
            }
            if (c3953e1.S()) {
                c3947c1.i();
            }
            C3953e1 z11 = c3947c1.z();
            try {
                z11.H();
                z11.P0(126665345, c3968k0.c());
                C3953e1.m0(z11);
                z11.U0(c3968k0.f());
                List s02 = c3953e1.s0(c3968k0.a(), z11);
                z11.F0();
                z11.M();
                z11.N();
                z11.I(true);
                C3966j0 c3966j0 = new C3966j0(c3947c1);
                if (!s02.isEmpty()) {
                    int size = s02.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        C3945c c3945c = (C3945c) s02.get(i11);
                        if (c3947c1.A(c3945c) && (c3947c1.C(c3947c1.c(c3945c)) instanceof J0)) {
                            e eVar = new e(g10, c3968k0);
                            z11 = c3947c1.z();
                            try {
                                if (!s02.isEmpty()) {
                                    int size2 = s02.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        Object H02 = z11.H0((C3945c) s02.get(i12));
                                        J0 j02 = H02 instanceof J0 ? (J0) H02 : null;
                                        if (j02 != null) {
                                            j02.d(eVar);
                                        }
                                    }
                                }
                                Unit unit = Unit.f71690a;
                                z11.I(true);
                            } finally {
                            }
                        } else {
                            i11++;
                        }
                    }
                }
                abstractC3984t.k(c3968k0, c3966j0);
            } finally {
            }
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? "composition" : i11 == 1 ? "parentCompositionContext" : i11 == 2 ? "reference" : super.e(i11);
        }
    }

    public static final class u extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final u f26403c;

        static {
            int i11 = 1;
            f26403c = new u(0, i11, i11);
        }

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            u02.b((V0) aVar.b(0));
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? AppMeasurementSdk.ConditionalUserProperty.VALUE : super.e(i11);
        }
    }

    public static final class v extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final v f26404c;

        static {
            int i11 = 0;
            f26404c = new v(i11, i11, 3);
        }

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            S0.r.t(c3953e1, u02);
        }
    }

    public static final class w extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final w f26405c;

        static {
            int i11 = 2;
            f26405c = new w(i11, 0, i11);
        }

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            interfaceC3951e.a(aVar.a(0), aVar.a(1));
        }

        @Override // T0.d
        @NotNull
        public final String d(int i11) {
            return i11 == 0 ? "removeIndex" : i11 == 1 ? "count" : super.d(i11);
        }
    }

    /* loaded from: classes8.dex */
    public static final class x extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final x f26406c;

        static {
            int i11 = 0;
            f26406c = new x(i11, i11, 3);
        }

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            c3953e1.C0();
        }
    }

    public static final class y extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final y f26407c;

        static {
            int i11 = 1;
            f26407c = new y(0, i11, i11);
        }

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            u02.a((Function0) aVar.b(0));
        }

        @Override // T0.d
        @NotNull
        public final String e(int i11) {
            return i11 == 0 ? "effect" : super.e(i11);
        }
    }

    /* loaded from: classes8.dex */
    public static final class z extends d {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final z f26408c;

        static {
            int i11 = 0;
            f26408c = new z(i11, i11, 3);
        }

        @Override // T0.d
        public final void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02) {
            c3953e1.G0();
        }
    }

    public d(int i11, int i12) {
        this.f26374a = i11;
        this.f26375b = i12;
    }

    public abstract void a(@NotNull f.a aVar, @NotNull InterfaceC3951e interfaceC3951e, @NotNull C3953e1 c3953e1, @NotNull U0 u02);

    public final int b() {
        return this.f26374a;
    }

    public final int c() {
        return this.f26375b;
    }

    @NotNull
    public String d(int i11) {
        return P4.f.c("IntParameter(", i11, ')');
    }

    @NotNull
    public String e(int i11) {
        return P4.f.c("ObjectParameter(", i11, ')');
    }

    @NotNull
    public final String toString() {
        String B11 = N.b(getClass()).B();
        return B11 == null ? "" : B11;
    }

    public /* synthetic */ d(int i11, int i12, int i13) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12);
    }
}
