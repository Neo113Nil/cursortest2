package androidx.compose.material3;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import B1.U;
import B1.W;
import B1.Y;
import B1.m0;
import D1.C2809k;
import D1.E;
import R0.p;
import Sc.s;
import Z1.l;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import m0.C7980b;
import m0.C7984d;
import m0.C8008p;
import m0.InterfaceC8002m;
import org.jetbrains.annotations.NotNull;
import t0.n;
import t0.o;
import t0.q;
import t0.s;
import xe.C10727i;
import xe.M;

/* loaded from: classes8.dex */
final class i extends e.c implements E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private q f40197a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f40198b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f40199c;

    /* renamed from: d, reason: collision with root package name */
    private C7980b<Float, C8008p> f40200d;

    /* renamed from: e, reason: collision with root package name */
    private C7980b<Float, C8008p> f40201e;

    /* renamed from: f, reason: collision with root package name */
    private float f40202f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    private float f40203g = Float.NaN;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.ThumbNode$measure$1", f = "Switch.kt", l = {265}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f40204d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f40206f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f7, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f40206f = f7;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return i.this.new a(this.f40206f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f40204d;
            if (i11 == 0) {
                s.b(obj);
                i iVar = i.this;
                C7980b c7980b = iVar.f40201e;
                if (c7980b != null) {
                    Float f7 = new Float(this.f40206f);
                    InterfaceC8002m interfaceC8002m = iVar.f40199c ? h.f40195f : h.f40196g;
                    this.f40204d = 1;
                    obj = C7980b.f(c7980b, f7, interfaceC8002m, null, this, 12);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.ThumbNode$measure$2", f = "Switch.kt", l = {271}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f40207d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f40209f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f7, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f40209f = f7;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return i.this.new b(this.f40209f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f40207d;
            if (i11 == 0) {
                s.b(obj);
                i iVar = i.this;
                C7980b c7980b = iVar.f40200d;
                if (c7980b != null) {
                    Float f7 = new Float(this.f40209f);
                    InterfaceC8002m interfaceC8002m = iVar.f40199c ? h.f40195f : h.f40196g;
                    this.f40207d = 1;
                    obj = C7980b.f(c7980b, f7, interfaceC8002m, null, this, 12);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f40210b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f40211c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f40212d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m0 m0Var, i iVar, float f7) {
            super(1);
            this.f40210b = m0Var;
            this.f40211c = iVar;
            this.f40212d = f7;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            C7980b c7980b = this.f40211c.f40200d;
            aVar2.h(this.f40210b, (int) (c7980b != null ? ((Number) c7980b.k()).floatValue() : this.f40212d), 0, 0.0f);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.material3.ThumbNode$onAttach$1", f = "Switch.kt", l = {220}, m = "invokeSuspend")
    static final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f40213d;

        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ K f40215a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f40216b;

            a(K k11, i iVar) {
                this.f40215a = k11;
                this.f40216b = iVar;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                n nVar = (n) obj;
                boolean z11 = nVar instanceof s.b;
                K k11 = this.f40215a;
                if (z11) {
                    k11.f71785a++;
                } else if (nVar instanceof s.c) {
                    k11.f71785a--;
                } else if (nVar instanceof s.a) {
                    k11.f71785a--;
                }
                boolean z12 = k11.f71785a > 0;
                i iVar = this.f40216b;
                if (iVar.f40199c != z12) {
                    iVar.f40199c = z12;
                    C2809k.f(iVar).u0();
                }
                return Unit.f71690a;
            }
        }

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return i.this.new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f40213d;
            if (i11 == 0) {
                Sc.s.b(obj);
                K k11 = new K();
                i iVar = i.this;
                InterfaceC2395h<n> interactions = iVar.N1().getInteractions();
                a aVar2 = new a(k11, iVar);
                this.f40213d = 1;
                if (interactions.collect(aVar2, this) == aVar) {
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

    public i(@NotNull q qVar, boolean z11) {
        this.f40197a = qVar;
        this.f40198b = z11;
    }

    @Override // D1.E
    @NotNull
    public final W D(@NotNull Y y11, @NotNull U u11, long j11) {
        float f7;
        float f11;
        float f12;
        W z02;
        boolean z11 = false;
        float v12 = y11.v1(this.f40199c ? p.i() : ((u11.D(Z1.b.k(j11)) != 0 && u11.Y(Z1.b.j(j11)) != 0) || this.f40198b) ? h.i() : h.j());
        C7980b<Float, C8008p> c7980b = this.f40201e;
        int floatValue = (int) (c7980b != null ? c7980b.k().floatValue() : v12);
        if (floatValue >= 0 && floatValue >= 0) {
            z11 = true;
        }
        if (!z11) {
            l.a("width(" + floatValue + ") and height(" + floatValue + ") must be >= 0");
            throw null;
        }
        m0 a02 = u11.a0(Z1.c.i(floatValue, floatValue, floatValue, floatValue));
        f7 = h.f40193d;
        float v13 = y11.v1((f7 - y11.C(v12)) / 2.0f);
        f11 = h.f40192c;
        float i11 = f11 - h.i();
        f12 = h.f40194e;
        float v14 = y11.v1(i11 - f12);
        boolean z12 = this.f40199c;
        if (z12 && this.f40198b) {
            v13 = v14 - y11.v1(p.p());
        } else if (z12 && !this.f40198b) {
            v13 = y11.v1(p.p());
        } else if (this.f40198b) {
            v13 = v14;
        }
        C7980b<Float, C8008p> c7980b2 = this.f40201e;
        if (!Intrinsics.b(c7980b2 != null ? c7980b2.i() : null, v12)) {
            C10727i.c(getCoroutineScope(), null, null, new a(v12, null), 3);
        }
        C7980b<Float, C8008p> c7980b3 = this.f40200d;
        if (!Intrinsics.b(c7980b3 != null ? c7980b3.i() : null, v13)) {
            C10727i.c(getCoroutineScope(), null, null, new b(v13, null), 3);
        }
        if (Float.isNaN(this.f40203g) && Float.isNaN(this.f40202f)) {
            this.f40203g = v12;
            this.f40202f = v13;
        }
        z02 = y11.z0(floatValue, floatValue, kotlin.collections.U.c(), new c(a02, this, v13));
        return z02;
    }

    public final boolean M1() {
        return this.f40198b;
    }

    @NotNull
    public final o N1() {
        return this.f40197a;
    }

    public final void O1(boolean z11) {
        this.f40198b = z11;
    }

    public final void P1(@NotNull q qVar) {
        this.f40197a = qVar;
    }

    public final void Q1() {
        if (this.f40201e == null && !Float.isNaN(this.f40203g)) {
            this.f40201e = C7984d.a(this.f40203g);
        }
        if (this.f40200d != null || Float.isNaN(this.f40202f)) {
            return;
        }
        this.f40200d = C7984d.a(this.f40202f);
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        C10727i.c(getCoroutineScope(), null, null, new d(null), 3);
    }
}
