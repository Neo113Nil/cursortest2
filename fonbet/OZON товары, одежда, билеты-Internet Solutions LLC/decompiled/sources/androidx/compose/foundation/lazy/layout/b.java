package androidx.compose.foundation.lazy.layout;

import S0.C3991w0;
import S0.D1;
import S0.n1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import l1.InterfaceC7823h0;
import m0.C7980b;
import m0.C8008p;
import m0.C8010q;
import m0.W0;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: p, reason: collision with root package name */
    private static final long f39606p = Z1.n.a(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f39607q = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M f39608a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7823h0 f39609b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f39610c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f39611d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3991w0 f39612e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C3991w0 f39613f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C3991w0 f39614g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C3991w0 f39615h;

    /* renamed from: i, reason: collision with root package name */
    private long f39616i;

    /* renamed from: j, reason: collision with root package name */
    private long f39617j;

    /* renamed from: k, reason: collision with root package name */
    private o1.d f39618k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C7980b<Z1.m, C8010q> f39619l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final C7980b<Float, C8008p> f39620m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final C3991w0 f39621n;

    /* renamed from: o, reason: collision with root package name */
    private long f39622o;

    /* loaded from: classes8.dex */
    public static final class a {
        public static long a() {
            return b.f39606p;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1", f = "LazyLayoutItemAnimation.kt", l = {182}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.layout.b$b, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    static final class C0732b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39623d;

        C0732b(kotlin.coroutines.d<? super C0732b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return b.this.new C0732b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0732b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39623d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C7980b c7980b = b.this.f39620m;
                Float f7 = new Float(1.0f);
                this.f39623d = 1;
                if (c7980b.m(f7, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1", f = "LazyLayoutItemAnimation.kt", l = {115}, m = "invokeSuspend")
    /* loaded from: classes8.dex */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39625d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return b.this.new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39625d;
            b bVar = b.this;
            if (i11 == 0) {
                Sc.s.b(obj);
                C7980b c7980b = bVar.f39619l;
                Z1.m a11 = Z1.m.a(0L);
                this.f39625d = 1;
                if (c7980b.m(a11, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            b.e(bVar, 0L);
            b.d(bVar);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1", f = "LazyLayoutItemAnimation.kt", l = {231}, m = "invokeSuspend")
    /* loaded from: classes8.dex */
    static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39627d;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return b.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39627d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C7980b c7980b = b.this.f39619l;
                this.f39627d = 1;
                if (c7980b.n(this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2", f = "LazyLayoutItemAnimation.kt", l = {237}, m = "invokeSuspend")
    /* loaded from: classes8.dex */
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39629d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return b.this.new e(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39629d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C7980b c7980b = b.this.f39620m;
                this.f39629d = 1;
                if (c7980b.n(this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3", f = "LazyLayoutItemAnimation.kt", l = {243}, m = "invokeSuspend")
    /* loaded from: classes8.dex */
    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39631d;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return b.this.new f(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39631d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C7980b c7980b = b.this.f39620m;
                this.f39631d = 1;
                if (c7980b.n(this) == aVar) {
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

    public b(@NotNull M m11, InterfaceC7823h0 interfaceC7823h0, @NotNull Function0<Unit> function0) {
        C3991w0 f7;
        C3991w0 f11;
        C3991w0 f12;
        C3991w0 f13;
        C3991w0 f14;
        this.f39608a = m11;
        this.f39609b = interfaceC7823h0;
        this.f39610c = function0;
        Boolean bool = Boolean.FALSE;
        f7 = n1.f(bool, D1.f25195a);
        this.f39612e = f7;
        f11 = n1.f(bool, D1.f25195a);
        this.f39613f = f11;
        f12 = n1.f(bool, D1.f25195a);
        this.f39614g = f12;
        f13 = n1.f(bool, D1.f25195a);
        this.f39615h = f13;
        long j11 = f39606p;
        this.f39616i = j11;
        this.f39617j = 0L;
        Object obj = null;
        this.f39618k = interfaceC7823h0 != null ? interfaceC7823h0.a() : null;
        int i11 = 12;
        this.f39619l = new C7980b<>(Z1.m.a(0L), W0.i(), obj, i11);
        this.f39620m = new C7980b<>(Float.valueOf(1.0f), W0.b(), obj, i11);
        f14 = n1.f(Z1.m.a(0L), D1.f25195a);
        this.f39621n = f14;
        this.f39622o = j11;
    }

    public static final void d(b bVar) {
        bVar.f39612e.setValue(Boolean.FALSE);
    }

    public static final void e(b bVar, long j11) {
        bVar.f39621n.setValue(Z1.m.a(j11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        o1.d dVar = this.f39618k;
        ((Boolean) this.f39613f.getValue()).booleanValue();
        if (o()) {
            if (dVar != null) {
                dVar.z(1.0f);
            }
            C10727i.c(this.f39608a, null, null, new C0732b(null), 3);
        }
    }

    public final void g() {
        if (this.f39618k != null) {
            o();
        }
    }

    public final void h() {
        if (p()) {
            C10727i.c(this.f39608a, null, null, new c(null), 3);
        }
    }

    public final long i() {
        return this.f39617j;
    }

    public final o1.d j() {
        return this.f39618k;
    }

    public final long k() {
        return this.f39622o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long l() {
        return ((Z1.m) this.f39621n.getValue()).g();
    }

    public final long m() {
        return this.f39616i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n() {
        return ((Boolean) this.f39615h.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o() {
        return ((Boolean) this.f39614g.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean p() {
        return ((Boolean) this.f39612e.getValue()).booleanValue();
    }

    public final boolean q() {
        return this.f39611d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        InterfaceC7823h0 interfaceC7823h0;
        boolean p11 = p();
        M m11 = this.f39608a;
        if (p11) {
            this.f39612e.setValue(Boolean.FALSE);
            C10727i.c(m11, null, null, new d(null), 3);
        }
        C3991w0 c3991w0 = this.f39613f;
        if (((Boolean) c3991w0.getValue()).booleanValue()) {
            c3991w0.setValue(Boolean.FALSE);
            C10727i.c(m11, null, null, new e(null), 3);
        }
        if (o()) {
            this.f39614g.setValue(Boolean.FALSE);
            C10727i.c(m11, null, null, new f(null), 3);
        }
        this.f39611d = false;
        this.f39621n.setValue(Z1.m.a(0L));
        this.f39616i = f39606p;
        o1.d dVar = this.f39618k;
        if (dVar != null && (interfaceC7823h0 = this.f39609b) != null) {
            interfaceC7823h0.b(dVar);
        }
        this.f39618k = null;
    }

    public final void s(long j11) {
        this.f39617j = j11;
    }

    public final void t(long j11) {
        this.f39622o = j11;
    }

    public final void u(long j11) {
        this.f39616i = j11;
    }
}
