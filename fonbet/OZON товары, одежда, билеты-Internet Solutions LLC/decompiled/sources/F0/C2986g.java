package F0;

import Ae.AbstractC2381a;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import D1.AbstractC2810k0;
import D1.C2805i;
import D1.InterfaceC2803h;
import E0.Z0;
import E0.c1;
import F0.C2990k;
import I0.C3205r0;
import S0.B1;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import android.os.Build;
import androidx.compose.ui.platform.K0;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C7980b;
import m0.C8010q;
import n0.C8370K;
import n0.C8371L;
import n0.Z;
import n0.a0;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.H0;

/* renamed from: F0.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2986g extends AbstractC2985f implements InterfaceC2803h {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private c1 f8223c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private C2990k f8224d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private Z0 f8225e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8226f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C3991w0 f8227g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C7980b<C7459e, C8010q> f8228h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C8370K f8229i;

    /* renamed from: j, reason: collision with root package name */
    private B0 f8230j;

    /* renamed from: F0.g$a */
    static final class a extends AbstractC7737t implements Function1<Z1.d, C7459e> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final C7459e invoke(Z1.d dVar) {
            return C7459e.a(((C7459e) C2986g.this.f8228h.k()).n());
        }
    }

    /* renamed from: F0.g$b */
    static final class b extends AbstractC7737t implements Function1<Z1.j, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Z1.j jVar) {
            long d11 = jVar.d();
            B1 e11 = K0.e();
            C2986g c2986g = C2986g.this;
            Z1.d dVar = (Z1.d) C2805i.a(c2986g, e11);
            C2986g.U1(c2986g, Z1.r.a(dVar.Y0(Z1.j.c(d11)), dVar.Y0(Z1.j.b(d11))));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1", f = "AndroidTextFieldMagnifier.android.kt", l = {134}, m = "invokeSuspend")
    /* renamed from: F0.g$c */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f8233d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f8234e;

        /* renamed from: F0.g$c$a */
        static final class a extends AbstractC7737t implements Function0<C7459e> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2986g f8236b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C2986g c2986g) {
                super(0);
                this.f8236b = c2986g;
            }

            @Override // kotlin.jvm.functions.Function0
            public final C7459e invoke() {
                C2986g c2986g = this.f8236b;
                return C7459e.a((c2986g.f8226f || c2986g.f8224d.M() == C2990k.a.Touch) ? C2984e.a(c2986g.f8223c, c2986g.f8224d, c2986g.f8225e, C2986g.P1(c2986g)) : 9205357640488583168L);
            }
        }

        /* renamed from: F0.g$c$b */
        static final class b<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2986g f8237a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ xe.M f8238b;

            b(C2986g c2986g, xe.M m11) {
                this.f8237a = c2986g;
                this.f8238b = m11;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                long n11 = ((C7459e) obj).n();
                C2986g c2986g = this.f8237a;
                if (P9.a.d(((C7459e) c2986g.f8228h.k()).n()) && P9.a.d(n11) && C7459e.h(((C7459e) c2986g.f8228h.k()).n()) != C7459e.h(n11)) {
                    C10727i.c(this.f8238b, null, null, new C2987h(c2986g, n11, null), 3);
                    return Unit.f71690a;
                }
                Object m11 = c2986g.f8228h.m(C7459e.a(n11), dVar);
                return m11 == Wc.a.COROUTINE_SUSPENDED ? m11 : Unit.f71690a;
            }
        }

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            c cVar = C2986g.this.new c(dVar);
            cVar.f8234e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f8233d;
            if (i11 == 0) {
                Sc.s.b(obj);
                xe.M m11 = (xe.M) this.f8234e;
                C2986g c2986g = C2986g.this;
                InterfaceC2395h m12 = n1.m(new a(c2986g));
                b bVar = new b(c2986g, m11);
                this.f8233d = 1;
                if (((AbstractC2381a) m12).collect(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2986g(@NotNull c1 c1Var, @NotNull C2990k c2990k, @NotNull Z0 z02, boolean z11) {
        C3991w0 f7;
        this.f8223c = c1Var;
        this.f8224d = c2990k;
        this.f8225e = z02;
        this.f8226f = z11;
        f7 = n1.f(Z1.q.a(0L), D1.f25195a);
        this.f8227g = f7;
        this.f8228h = new C7980b<>(C7459e.a(C2984e.a(this.f8223c, this.f8224d, this.f8225e, ((Z1.q) f7.getValue()).e())), C3205r0.e(), C7459e.a(C3205r0.d()), 8);
        a aVar = new a();
        b bVar = new b();
        if (!C8371L.b()) {
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
        C8370K c8370k = new C8370K(Float.NaN, Float.NaN, Float.NaN, 9205357640488583168L, aVar, bVar, Build.VERSION.SDK_INT == 28 ? Z.f76125a : a0.f76146a, true, true);
        I1(c8370k);
        this.f8229i = c8370k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long P1(C2986g c2986g) {
        return ((Z1.q) c2986g.f8227g.getValue()).e();
    }

    public static final void U1(C2986g c2986g, long j11) {
        c2986g.f8227g.setValue(Z1.q.a(j11));
    }

    private final void V1() {
        B0 b02 = this.f8230j;
        if (b02 != null) {
            ((H0) b02).j(null);
        }
        this.f8230j = null;
        if (C8371L.b()) {
            this.f8230j = C10727i.c(getCoroutineScope(), null, null, new c(null), 3);
        }
    }

    @Override // F0.AbstractC2985f
    public final void N1(@NotNull c1 c1Var, @NotNull C2990k c2990k, @NotNull Z0 z02, boolean z11) {
        c1 c1Var2 = this.f8223c;
        C2990k c2990k2 = this.f8224d;
        Z0 z03 = this.f8225e;
        boolean z12 = this.f8226f;
        this.f8223c = c1Var;
        this.f8224d = c2990k;
        this.f8225e = z02;
        this.f8226f = z11;
        if (Intrinsics.d(c1Var, c1Var2) && Intrinsics.d(c2990k, c2990k2) && Intrinsics.d(z02, z03) && z11 == z12) {
            return;
        }
        V1();
    }

    @Override // F0.AbstractC2985f, D1.E0
    public final void applySemantics(@NotNull I1.D d11) {
        this.f8229i.applySemantics(d11);
    }

    @Override // F0.AbstractC2985f, D1.InterfaceC2819t
    public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        ((D1.J) interfaceC8410c).F0();
        this.f8229i.draw(interfaceC8410c);
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        V1();
    }

    @Override // F0.AbstractC2985f, B1.f0
    public final void s(@NotNull AbstractC2810k0 abstractC2810k0) {
        this.f8229i.s(abstractC2810k0);
    }
}
