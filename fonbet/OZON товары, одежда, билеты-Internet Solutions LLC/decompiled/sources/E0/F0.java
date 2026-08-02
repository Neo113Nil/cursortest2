package E0;

import D1.AbstractC2810k0;
import D1.AbstractC2813m;
import D1.C2805i;
import D1.C2809k;
import D1.InterfaceC2803h;
import D1.InterfaceC2821v;
import F0.C2990k;
import I1.C3222a;
import K1.C3422b;
import Q1.C3848q;
import S0.B1;
import Sc.C4005g;
import android.view.KeyEvent;
import androidx.compose.ui.platform.C5278q1;
import androidx.compose.ui.platform.InterfaceC5275p1;
import androidx.compose.ui.platform.InterfaceC5289u1;
import androidx.compose.ui.platform.P1;
import androidx.compose.ui.platform.c2;
import androidx.compose.ui.platform.i2;
import fd.InterfaceC6511n;
import h1.C6773f;
import h1.C6775h;
import h1.InterfaceC6771d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p0.AbstractC8823a;
import p0.C8824b;
import v1.InterfaceC10180e;
import x1.C10638m;
import x1.EnumC10640o;
import xe.C10727i;
import ze.EnumC11113a;

/* loaded from: classes8.dex */
public final class F0 extends AbstractC2813m implements InterfaceC5275p1, D1.E0, j1.t, j1.e, InterfaceC2821v, D1.C0, InterfaceC10180e, InterfaceC2803h, C1.i, D1.r0, D1.B {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private c1 f6991c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private Z0 f6992d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private C2990k f6993e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6994f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6995g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private t0.q f6996h;

    /* renamed from: i, reason: collision with root package name */
    private Ae.C0 f6997i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final x1.N f6998j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C0.a f6999k;

    /* renamed from: l, reason: collision with root package name */
    private t0.j f7000l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC6771d f7001m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private B0.N0 f7002n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f7003o;

    /* renamed from: p, reason: collision with root package name */
    private i2 f7004p;

    /* renamed from: q, reason: collision with root package name */
    private xe.B0 f7005q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final C2914c f7006r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final N0 f7007s;

    /* renamed from: t, reason: collision with root package name */
    private xe.B0 f7008t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final Function0<AbstractC8823a> f7009u;

    static final class a extends AbstractC7737t implements Function0<Boolean> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            F0.this.e2().W();
            return Boolean.TRUE;
        }
    }

    static final class b extends AbstractC7737t implements Function1<List<K1.K>, Boolean> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(List<K1.K> list) {
            List<K1.K> list2 = list;
            K1.K f7 = F0.this.g2().f();
            return Boolean.valueOf(f7 != null ? list2.add(f7) : false);
        }
    }

    static final class c extends AbstractC7737t implements Function1<C3422b, Boolean> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(C3422b c3422b) {
            C3422b c3422b2 = c3422b;
            F0 f02 = F0.this;
            if (!f02.Z1()) {
                return Boolean.FALSE;
            }
            f02.f2().p(c3422b2);
            return Boolean.TRUE;
        }
    }

    static final class d extends AbstractC7737t implements Function1<C3422b, Boolean> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(C3422b c3422b) {
            C3422b c3422b2 = c3422b;
            F0 f02 = F0.this;
            if (!f02.Z1()) {
                return Boolean.FALSE;
            }
            c1.q(f02.f2(), c3422b2, null, 4);
            return Boolean.TRUE;
        }
    }

    static final class e extends AbstractC7737t implements InterfaceC6511n<Integer, Integer, Boolean, Boolean> {
        e() {
            super(3);
        }

        @Override // fd.InterfaceC6511n
        public final Boolean invoke(Integer num, Integer num2, Boolean bool) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            boolean booleanValue = bool.booleanValue();
            F0 f02 = F0.this;
            D0.a i11 = booleanValue ? f02.f2().i() : f02.f2().j();
            long d11 = i11.d();
            if (!f02.a2() || Math.min(intValue, intValue2) < 0 || Math.max(intValue, intValue2) > i11.length()) {
                return Boolean.FALSE;
            }
            int i12 = K1.Q.f15010c;
            if (intValue == ((int) (d11 >> 32)) && intValue2 == ((int) (d11 & 4294967295L))) {
                return Boolean.TRUE;
            }
            long a11 = K1.S.a(intValue, intValue2);
            if (booleanValue || intValue == intValue2) {
                f02.e2().i0(F0.P.None);
            } else {
                f02.e2().i0(F0.P.Selection);
            }
            if (booleanValue) {
                f02.f2().u(a11);
            } else {
                f02.f2().t(a11);
            }
            return Boolean.TRUE;
        }
    }

    static final class f extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f7016c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i11) {
            super(0);
            this.f7016c = i11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            F0.T1(F0.this, this.f7016c);
            return Boolean.TRUE;
        }
    }

    static final class g extends AbstractC7737t implements Function0<Boolean> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            F0 f02 = F0.this;
            if (f02.h2()) {
                F0.U1(f02).show();
            } else {
                j1.u.b(f02);
            }
            return Boolean.TRUE;
        }
    }

    static final class h extends AbstractC7737t implements Function0<Boolean> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            F0 f02 = F0.this;
            if (!f02.h2()) {
                j1.u.b(f02);
            }
            f02.e2().i0(F0.P.Selection);
            return Boolean.TRUE;
        }
    }

    static final class i extends AbstractC7737t implements Function0<Boolean> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            F0.this.e2().B(true);
            return Boolean.TRUE;
        }
    }

    static final class j extends AbstractC7737t implements Function0<Boolean> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            F0.this.e2().D();
            return Boolean.TRUE;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onFocusChange$1", f = "TextFieldDecoratorModifier.kt", l = {634}, m = "invokeSuspend")
    static final class k extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f7021d;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return F0.this.new k(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f7021d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C2990k e22 = F0.this.e2();
                this.f7021d = 1;
                if (e22.V(this) == aVar) {
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

    static final class l extends AbstractC7737t implements Function0<Unit> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            F0 f02 = F0.this;
            F0.T1(f02, f02.c2().d());
            return Unit.f71690a;
        }
    }

    static final class m extends AbstractC7737t implements Function0<Unit> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            B1 s11 = androidx.compose.ui.platform.K0.s();
            F0 f02 = F0.this;
            f02.f7004p = (i2) C2805i.a(f02, s11);
            f02.i2();
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", f = "TextFieldDecoratorModifier.kt", l = {707}, m = "invokeSuspend")
    static final class n extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f7025d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC8823a f7027f;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", f = "TextFieldDecoratorModifier.kt", l = {708}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC5289u1, kotlin.coroutines.d<?>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f7028d;

            /* renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f7029e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ F0 f7030f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ AbstractC8823a f7031g;

            /* renamed from: E0.F0$n$a$a, reason: collision with other inner class name */
            /* synthetic */ class C0148a extends C7735q implements Function1<C3848q, Unit> {
                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(C3848q c3848q) {
                    F0.T1((F0) this.receiver, c3848q.c());
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(F0 f02, AbstractC8823a abstractC8823a, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f7030f = f02;
                this.f7031g = abstractC8823a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f7030f, this.f7031g, dVar);
                aVar.f7029e = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC5289u1 interfaceC5289u1, kotlin.coroutines.d<?> dVar) {
                return ((a) create(interfaceC5289u1, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f7028d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    InterfaceC5289u1 interfaceC5289u1 = (InterfaceC5289u1) this.f7029e;
                    F0 f02 = this.f7030f;
                    c1 f22 = f02.f2();
                    Z0 g22 = f02.g2();
                    Q1.r h11 = f02.c2().h(f02.d2());
                    C0148a c0148a = new C0148a(1, f02, F0.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0);
                    Ae.w0 Q12 = F0.Q1(f02);
                    c2 c2Var = (c2) C2805i.a(f02, androidx.compose.ui.platform.K0.r());
                    this.f7028d = 1;
                    if (C2926i.b(interfaceC5289u1, f22, g22, h11, this.f7031g, c0148a, Q12, c2Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                throw new C4005g();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(AbstractC8823a abstractC8823a, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f7027f = abstractC8823a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return F0.this.new n(this.f7027f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((n) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f7025d;
            if (i11 == 0) {
                Sc.s.b(obj);
                F0 f02 = F0.this;
                a aVar2 = new a(f02, this.f7027f, null);
                this.f7025d = 1;
                if (C5278q1.b(f02, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            throw new C4005g();
        }
    }

    public F0(@NotNull c1 c1Var, @NotNull Z0 z02, @NotNull C2990k c2990k, boolean z11, @NotNull B0.N0 n02, boolean z12, @NotNull t0.q qVar) {
        this.f6991c = c1Var;
        this.f6992d = z02;
        this.f6993e = c2990k;
        this.f6994f = z11;
        this.f6995g = z12;
        this.f6996h = qVar;
        O0 o02 = new O0(this, null);
        int i11 = x1.L.f104834b;
        x1.S s11 = new x1.S(null, null, null, o02);
        I1(s11);
        this.f6998j = s11;
        C0.a aVar = new C0.a(new Q0(this, n02));
        I1(aVar);
        this.f6999k = aVar;
        G0 g02 = new G0(this);
        H0 h02 = new H0(this);
        C6773f a11 = C6775h.a(new R0(g02), new S0(new I0(this), h02, new J0(this), new K0(this), new L0(this), new M0(this)));
        I1(a11);
        this.f7001m = a11;
        this.f7002n = n02.c(null);
        this.f7006r = new C2914c();
        this.f7007s = new N0(this);
        this.f7009u = new P0(this);
    }

    public static final void N1(F0 f02) {
        t0.j jVar = f02.f7000l;
        if (jVar != null) {
            f02.f6996h.tryEmit(new t0.k(jVar));
            f02.f7000l = null;
        }
    }

    public static final Ae.w0 Q1(F0 f02) {
        Ae.C0 c02 = f02.f6997i;
        if (c02 != null) {
            return c02;
        }
        if (!C0.c.a()) {
            return null;
        }
        Ae.C0 b11 = Ae.E0.b(1, 0, EnumC11113a.DROP_LATEST, 2);
        f02.f6997i = b11;
        return b11;
    }

    public static final void T1(F0 f02, int i11) {
        f02.getClass();
        F0 f03 = f02.f7007s.f7053a;
        if (i11 == 6) {
            ((j1.i) C2805i.a(f03, androidx.compose.ui.platform.K0.f())).d(1);
        } else if (i11 == 5) {
            ((j1.i) C2805i.a(f03, androidx.compose.ui.platform.K0.f())).d(2);
        } else if (i11 == 7) {
            U1(f03).hide();
        }
    }

    public static final P1 U1(F0 f02) {
        f02.getClass();
        P1 p12 = (P1) C2805i.a(f02, androidx.compose.ui.platform.K0.o());
        if (p12 != null) {
            return p12;
        }
        throw new IllegalStateException("No software keyboard controller");
    }

    private final void Y1() {
        xe.B0 b02 = this.f7008t;
        Ae.C0 c02 = null;
        if (b02 != null) {
            ((xe.H0) b02).j(null);
        }
        this.f7008t = null;
        Ae.C0 c03 = this.f6997i;
        if (c03 != null) {
            c02 = c03;
        } else if (C0.c.a()) {
            c02 = Ae.E0.b(1, 0, EnumC11113a.DROP_LATEST, 2);
            this.f6997i = c02;
        }
        if (c02 != null) {
            c02.resetReplayCache();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Z1() {
        return this.f6994f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h2() {
        i2 i2Var = this.f7004p;
        return this.f7003o && (i2Var != null && i2Var.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i2() {
        this.f6993e.a0(h2());
        if (h2() && this.f7005q == null) {
            this.f7005q = C10727i.c(getCoroutineScope(), null, null, new k(null), 3);
        } else {
            if (h2()) {
                return;
            }
            xe.B0 b02 = this.f7005q;
            if (b02 != null) {
                ((xe.H0) b02).j(null);
            }
            this.f7005q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j2(boolean z11) {
        if (z11 || this.f7002n.f()) {
            this.f7008t = C10727i.c(getCoroutineScope(), null, null, new n(C8824b.a(this), null), 3);
        }
    }

    @Override // j1.e
    public final void L(@NotNull j1.w wVar) {
        D0.e eVar;
        if (this.f7003o == wVar.a()) {
            return;
        }
        this.f7003o = wVar.a();
        i2();
        if (!wVar.a()) {
            Y1();
            eVar = this.f6991c.f7171a;
            G0.c cVar = G0.c.MergeIfPossible;
            eVar.d().f().b();
            eVar.d().c();
            D0.e.a(eVar, true, cVar);
            this.f6991c.d();
        } else if (Z1()) {
            j2(false);
        }
        this.f6999k.L(wVar);
    }

    public final boolean a2() {
        return this.f6994f;
    }

    @Override // D1.E0
    public final void applySemantics(@NotNull I1.D d11) {
        D0.a g10 = this.f6991c.g();
        long d12 = g10.d();
        I1.z.k(d11, new C3422b(6, g10.toString(), null));
        I1.z.u(d11, d12);
        if (!this.f6994f) {
            d11.b(I1.u.d(), Unit.f71690a);
        }
        I1.z.j(d11, Z1());
        I1.z.d(d11, new b());
        if (Z1()) {
            d11.b(I1.k.y(), new C3222a(null, new c()));
            d11.b(I1.k.j(), new C3222a(null, new d()));
        }
        d11.b(I1.k.x(), new C3222a(null, new e()));
        int d13 = this.f7002n.d();
        I1.z.f(d11, d13, new f(d13));
        I1.z.e(d11, new g());
        d11.b(I1.k.m(), new C3222a(null, new h()));
        if (!K1.Q.e(d12)) {
            d11.b(I1.k.c(), new C3222a(null, new i()));
            if (this.f6994f) {
                d11.b(I1.k.e(), new C3222a(null, new j()));
            }
        }
        if (Z1()) {
            d11.b(I1.k.r(), new C3222a(null, new a()));
        }
    }

    @NotNull
    public final t0.q b2() {
        return this.f6996h;
    }

    @NotNull
    public final B0.N0 c2() {
        return this.f7002n;
    }

    public final boolean d2() {
        return this.f6995g;
    }

    @NotNull
    public final C2990k e2() {
        return this.f6993e;
    }

    @NotNull
    public final c1 f2() {
        return this.f6991c;
    }

    @Override // v1.InterfaceC10180e
    public final boolean g1(@NotNull KeyEvent keyEvent) {
        return this.f7006r.a(keyEvent, this.f6991c, this.f6992d, this.f6993e, this.f6994f, this.f6995g, new l());
    }

    @NotNull
    public final Z0 g2() {
        return this.f6992d;
    }

    @Override // D1.E0
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // v1.InterfaceC10180e
    public final boolean j0(@NotNull KeyEvent keyEvent) {
        c1 c1Var = this.f6991c;
        C2990k c2990k = this.f6993e;
        j1.i iVar = (j1.i) C2805i.a(this, androidx.compose.ui.platform.K0.f());
        P1 p12 = (P1) C2805i.a(this, androidx.compose.ui.platform.K0.o());
        if (p12 != null) {
            return this.f7006r.b(keyEvent, c1Var, c2990k, iVar, p12);
        }
        throw new IllegalStateException("No software keyboard controller");
    }

    public final void k2(@NotNull c1 c1Var, @NotNull Z0 z02, @NotNull C2990k c2990k, boolean z11, @NotNull B0.N0 n02, boolean z12, @NotNull t0.q qVar) {
        boolean z13 = this.f6994f;
        c1 c1Var2 = this.f6991c;
        B0.N0 n03 = this.f7002n;
        C2990k c2990k2 = this.f6993e;
        t0.q qVar2 = this.f6996h;
        this.f6991c = c1Var;
        this.f6992d = z02;
        this.f6993e = c2990k;
        this.f6994f = z11;
        this.f7002n = n02.c(null);
        this.f6995g = z12;
        this.f6996h = qVar;
        if (z11 != z13 || !Intrinsics.d(c1Var, c1Var2) || !Intrinsics.d(this.f7002n, n03)) {
            if (z11 && h2()) {
                j2(false);
            } else if (!z11) {
                Y1();
            }
        }
        if (z13 != z11) {
            C2809k.f(this).x0();
        }
        boolean d11 = Intrinsics.d(c2990k, c2990k2);
        C0.a aVar = this.f6999k;
        x1.N n11 = this.f6998j;
        if (!d11) {
            n11.v0();
            aVar.v0();
            if (isAttached()) {
                c2990k.c0(this.f7009u);
            }
        }
        if (Intrinsics.d(qVar, qVar2)) {
            return;
        }
        n11.v0();
        aVar.v0();
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        onObservedReadsChanged();
        this.f6993e.c0(this.f7009u);
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        Y1();
        this.f6993e.c0(null);
    }

    @Override // D1.r0
    public final void onObservedReadsChanged() {
        D1.s0.a(this, new m());
    }

    @Override // D1.C0
    public final void p1(@NotNull C10638m c10638m, @NotNull EnumC10640o enumC10640o, long j11) {
        this.f6999k.p1(c10638m, enumC10640o, j11);
        this.f6998j.p1(c10638m, enumC10640o, j11);
    }

    @Override // D1.C0
    public final void r0() {
        this.f6999k.r0();
        this.f6998j.r0();
    }

    @Override // D1.InterfaceC2821v
    public final void s(@NotNull AbstractC2810k0 abstractC2810k0) {
        this.f6992d.m(abstractC2810k0);
    }
}
