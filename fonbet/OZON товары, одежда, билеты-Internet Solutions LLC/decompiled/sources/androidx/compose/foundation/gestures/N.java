package androidx.compose.foundation.gestures;

import D1.C2809k;
import D1.E0;
import D1.r0;
import D1.s0;
import I1.C3222a;
import android.view.KeyEvent;
import androidx.compose.foundation.gestures.AbstractC5172o;
import androidx.compose.foundation.gestures.G;
import androidx.compose.foundation.gestures.J;
import androidx.compose.ui.focus.FocusTargetNode;
import java.util.List;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.l0;
import n0.C8361B;
import n0.EnumC8372M;
import n0.W;
import org.jetbrains.annotations.NotNull;
import r0.C9107H;
import r0.C9113N;
import r0.C9126f;
import r0.C9129i;
import r0.EnumC9142v;
import r0.InterfaceC9100A;
import r0.InterfaceC9108I;
import r0.InterfaceC9124d;
import r0.InterfaceC9138r;
import r0.InterfaceC9141u;
import v1.C10176a;
import v1.C10178c;
import v1.C10179d;
import v1.InterfaceC10180e;
import w1.C10407b;
import x1.C10638m;
import x1.EnumC10640o;
import xe.C10727i;

/* loaded from: classes.dex */
final class N extends B implements r0, j1.o, InterfaceC10180e, E0 {

    /* renamed from: l, reason: collision with root package name */
    private W f39060l;

    /* renamed from: m, reason: collision with root package name */
    private InterfaceC9138r f39061m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C10407b f39062n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final C9107H f39063o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final C9129i f39064p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final C9113N f39065q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final M f39066r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final C9126f f39067s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC9100A f39068t;

    /* renamed from: u, reason: collision with root package name */
    private Function2<? super Float, ? super Float, Boolean> f39069u;

    /* renamed from: v, reason: collision with root package name */
    private Function2<? super C7459e, ? super kotlin.coroutines.d<? super C7459e>, ? extends Object> f39070v;

    static final class a extends AbstractC7737t implements Function1<B1.B, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(B1.B b11) {
            N.this.f39067s.X1(b11);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", l = {344}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9141u, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39072d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f39073e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Function1<? super AbstractC5172o.b, Unit>, kotlin.coroutines.d<? super Unit>, Object> f39074f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C9113N f39075g;

        static final class a extends AbstractC7737t implements Function1<AbstractC5172o.b, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC9141u f39076b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C9113N f39077c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC9141u interfaceC9141u, C9113N c9113n) {
                super(1);
                this.f39076b = interfaceC9141u;
                this.f39077c = c9113n;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(AbstractC5172o.b bVar) {
                this.f39076b.a(1, this.f39077c.v(bVar.a()));
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.coroutines.d dVar, Function2 function2, C9113N c9113n) {
            super(2, dVar);
            this.f39074f = function2;
            this.f39075g = c9113n;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = new b(dVar, this.f39074f, this.f39075g);
            bVar.f39073e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC9141u interfaceC9141u, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(interfaceC9141u, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39072d;
            if (i11 == 0) {
                Sc.s.b(obj);
                a aVar2 = new a((InterfaceC9141u) this.f39073e, this.f39075g);
                this.f39072d = 1;
                if (((G.a) this.f39074f).invoke(aVar2, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollableNode$onDragStopped$1", f = "Scrollable.kt", l = {358}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39078d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f39080f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j11, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f39080f = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return N.this.new c(this.f39080f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39078d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C9113N c9113n = N.this.f39065q;
                this.f39078d = 1;
                if (c9113n.p(this.f39080f, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", l = {477}, m = "invokeSuspend")
    /* loaded from: classes8.dex */
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39081d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f39083f;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9141u, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f39084d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f39085e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j11, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f39085e = j11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f39085e, dVar);
                aVar.f39084d = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC9141u interfaceC9141u, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(interfaceC9141u, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                ((InterfaceC9141u) this.f39084d).b(this.f39085e);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j11, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f39083f = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return N.this.new d(this.f39083f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39081d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C9113N c9113n = N.this.f39065q;
                EnumC8372M enumC8372M = EnumC8372M.UserInput;
                a aVar2 = new a(this.f39083f, null);
                this.f39081d = 1;
                if (c9113n.t(enumC8372M, aVar2, this) == aVar) {
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

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [r0.r] */
    /* JADX WARN: Type inference failed for: r8v0, types: [D1.m, androidx.compose.foundation.gestures.N] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public N(W w11, InterfaceC9124d interfaceC9124d, InterfaceC9138r interfaceC9138r, @NotNull EnumC9142v enumC9142v, @NotNull InterfaceC9108I interfaceC9108I, t0.q qVar, boolean z11, boolean z12) {
        super(r0, z11, qVar, enumC9142v);
        Function1 function1;
        J.d dVar;
        function1 = J.f39037a;
        this.f39060l = w11;
        this.f39061m = interfaceC9138r;
        C10407b c10407b = new C10407b();
        this.f39062n = c10407b;
        C9107H c9107h = new C9107H(z11);
        I1(c9107h);
        this.f39063o = c9107h;
        dVar = J.f39040d;
        C9129i c9129i = new C9129i(m0.C.b(new l0(dVar)));
        this.f39064p = c9129i;
        W w12 = this.f39060l;
        ?? r11 = this.f39061m;
        C9113N c9113n = new C9113N(w12, r11 == 0 ? c9129i : r11, enumC9142v, interfaceC9108I, c10407b, z12);
        this.f39065q = c9113n;
        M m11 = new M(c9113n, z11);
        this.f39066r = m11;
        C9126f c9126f = new C9126f(enumC9142v, c9113n, z12, interfaceC9124d);
        I1(c9126f);
        this.f39067s = c9126f;
        I1(new w1.e(m11, c10407b));
        I1(new FocusTargetNode());
        I1(new z0.e(c9126f));
        I1(new C8361B(new a()));
    }

    @Override // androidx.compose.foundation.gestures.B
    public final Object W1(@NotNull Function2<? super Function1<? super AbstractC5172o.b, Unit>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        EnumC8372M enumC8372M = EnumC8372M.UserInput;
        C9113N c9113n = this.f39065q;
        Object t2 = c9113n.t(enumC8372M, new b(null, function2, c9113n), (kotlin.coroutines.jvm.internal.c) dVar);
        return t2 == Wc.a.COROUTINE_SUSPENDED ? t2 : Unit.f71690a;
    }

    @Override // androidx.compose.foundation.gestures.B
    public final void Z1(long j11) {
    }

    @Override // androidx.compose.foundation.gestures.B
    public final void a2(long j11) {
        C10727i.c(this.f39062n.e(), null, null, new c(j11, null), 3);
    }

    @Override // D1.E0
    public final void applySemantics(@NotNull I1.D d11) {
        if (Y1() && (this.f39069u == null || this.f39070v == null)) {
            this.f39069u = new Q(this);
            this.f39070v = new S(this, null);
        }
        Function2<? super Float, ? super Float, Boolean> function2 = this.f39069u;
        if (function2 != null) {
            int i11 = I1.z.f11793b;
            d11.b(I1.k.t(), new C3222a(null, function2));
        }
        Function2<? super C7459e, ? super kotlin.coroutines.d<? super C7459e>, ? extends Object> function22 = this.f39070v;
        if (function22 != null) {
            int i12 = I1.z.f11793b;
            d11.b(I1.k.u(), function22);
        }
    }

    @Override // androidx.compose.foundation.gestures.B
    public final boolean b2() {
        return this.f39065q.u();
    }

    @Override // v1.InterfaceC10180e
    public final boolean g1(@NotNull KeyEvent keyEvent) {
        long a11;
        if (!Y1()) {
            return false;
        }
        long a12 = C10179d.a(keyEvent);
        int i11 = C10176a.f101642n;
        if ((!C10176a.n(a12, C10176a.C2215a.j()) && !C10176a.n(C10179d.a(keyEvent), C10176a.C2215a.k())) || !C10178c.a(C10179d.b(keyEvent), 2) || C10179d.e(keyEvent)) {
            return false;
        }
        boolean o11 = this.f39065q.o();
        C9126f c9126f = this.f39067s;
        if (o11) {
            int T12 = (int) (c9126f.T1() & 4294967295L);
            a11 = P9.a.a(0.0f, C10176a.n(C10179d.a(keyEvent), C10176a.C2215a.k()) ? T12 : -T12);
        } else {
            int T13 = (int) (c9126f.T1() >> 32);
            a11 = P9.a.a(C10176a.n(C10179d.a(keyEvent), C10176a.C2215a.k()) ? T13 : -T13, 0.0f);
        }
        C10727i.c(getCoroutineScope(), null, null, new d(a11, null), 3);
        return true;
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    public final void h2(W w11, InterfaceC9124d interfaceC9124d, InterfaceC9138r interfaceC9138r, @NotNull EnumC9142v enumC9142v, @NotNull InterfaceC9108I interfaceC9108I, t0.q qVar, boolean z11, boolean z12) {
        boolean z13;
        Function1<? super x1.x, Boolean> function1;
        if (Y1() != z11) {
            this.f39066r.a(z11);
            this.f39063o.J1(z11);
            z13 = true;
        } else {
            z13 = false;
        }
        boolean z14 = z13;
        boolean y11 = this.f39065q.y(w11, interfaceC9138r == null ? this.f39064p : interfaceC9138r, enumC9142v, interfaceC9108I, this.f39062n, z12);
        this.f39067s.Z1(enumC9142v, z12, interfaceC9124d);
        this.f39060l = w11;
        this.f39061m = interfaceC9138r;
        function1 = J.f39037a;
        c2(function1, z11, qVar, this.f39065q.o() ? EnumC9142v.Vertical : EnumC9142v.Horizontal, y11);
        if (z14) {
            this.f39069u = null;
            this.f39070v = null;
            C2809k.f(this).x0();
        }
    }

    @Override // v1.InterfaceC10180e
    public final boolean j0(@NotNull KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        s0.a(this, new T(this));
        this.f39068t = C5171n.f39210a;
    }

    @Override // D1.r0
    public final void onObservedReadsChanged() {
        s0.a(this, new T(this));
    }

    @Override // androidx.compose.foundation.gestures.B, D1.C0
    public final void p1(@NotNull C10638m c10638m, @NotNull EnumC10640o enumC10640o, long j11) {
        List<x1.x> b11 = c10638m.b();
        int size = b11.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            if (X1().invoke(b11.get(i11)).booleanValue()) {
                super.p1(c10638m, enumC10640o, j11);
                break;
            }
            i11++;
        }
        if (enumC10640o == EnumC10640o.Main && c10638m.e() == 6) {
            List<x1.x> b12 = c10638m.b();
            int size2 = b12.size();
            for (int i12 = 0; i12 < size2; i12++) {
                if (b12.get(i12).n()) {
                    return;
                }
            }
            Intrinsics.f(this.f39068t);
            Z1.d E11 = C2809k.f(this).E();
            List<x1.x> b13 = c10638m.b();
            C7459e a11 = C7459e.a(0L);
            int size3 = b13.size();
            for (int i13 = 0; i13 < size3; i13++) {
                a11 = C7459e.a(C7459e.k(a11.n(), b13.get(i13).k()));
            }
            C10727i.c(getCoroutineScope(), null, null, new O(this, C7459e.l(-E11.v1(64), a11.n()), null), 3);
            List<x1.x> b14 = c10638m.b();
            int size4 = b14.size();
            for (int i14 = 0; i14 < size4; i14++) {
                b14.get(i14).a();
            }
        }
    }

    @Override // j1.o
    public final void y0(@NotNull j1.m mVar) {
        mVar.a(false);
    }
}
