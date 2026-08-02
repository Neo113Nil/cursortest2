package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.AbstractC5172o;
import androidx.compose.foundation.gestures.G;
import fd.InterfaceC6511n;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import r0.C9135o;
import r0.EnumC9142v;
import r0.InterfaceC9132l;
import r0.InterfaceC9137q;
import xe.C10727i;

/* loaded from: classes8.dex */
public final class H extends B {

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private InterfaceC9137q f39016l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private EnumC9142v f39017m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f39018n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private InterfaceC6511n<? super xe.M, ? super C7459e, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> f39019o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private InterfaceC6511n<? super xe.M, ? super Float, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> f39020p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f39021q;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {305}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9132l, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39022d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f39023e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Function1<? super AbstractC5172o.b, Unit>, kotlin.coroutines.d<? super Unit>, Object> f39024f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ H f39025g;

        /* renamed from: androidx.compose.foundation.gestures.H$a$a, reason: collision with other inner class name */
        static final class C0723a extends AbstractC7737t implements Function1<AbstractC5172o.b, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC9132l f39026b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ H f39027c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0723a(InterfaceC9132l interfaceC9132l, H h11) {
                super(1);
                this.f39026b = interfaceC9132l;
                this.f39027c = h11;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(AbstractC5172o.b bVar) {
                long a11 = bVar.a();
                H h11 = this.f39027c;
                long i22 = H.i2(h11, a11);
                EnumC9142v enumC9142v = h11.f39017m;
                int i11 = C9135o.f82634c;
                this.f39026b.a(enumC9142v == EnumC9142v.Vertical ? C7459e.h(i22) : C7459e.g(i22));
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super Function1<? super AbstractC5172o.b, Unit>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, H h11, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f39024f = function2;
            this.f39025g = h11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f39024f, this.f39025g, dVar);
            aVar.f39023e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC9132l interfaceC9132l, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(interfaceC9132l, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39022d;
            if (i11 == 0) {
                Sc.s.b(obj);
                C0723a c0723a = new C0723a((InterfaceC9132l) this.f39023e, this.f39025g);
                this.f39022d = 1;
                if (((G.a) this.f39024f).invoke(c0723a, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", l = {314}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39028d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f39029e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f39031g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j11, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f39031g = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            b bVar = H.this.new b(this.f39031g, dVar);
            bVar.f39029e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39028d;
            if (i11 == 0) {
                Sc.s.b(obj);
                xe.M m11 = (xe.M) this.f39029e;
                InterfaceC6511n interfaceC6511n = H.this.f39019o;
                C7459e a11 = C7459e.a(this.f39031g);
                this.f39028d = 1;
                if (interfaceC6511n.invoke(m11, a11, this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", l = {321}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f39032d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f39033e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f39035g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j11, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f39035g = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            c cVar = H.this.new c(this.f39035g, dVar);
            cVar.f39033e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f39032d;
            if (i11 == 0) {
                Sc.s.b(obj);
                xe.M m11 = (xe.M) this.f39033e;
                H h11 = H.this;
                InterfaceC6511n interfaceC6511n = h11.f39020p;
                long h22 = H.h2(h11, this.f39035g);
                EnumC9142v enumC9142v = h11.f39017m;
                int i12 = C9135o.f82634c;
                Float f7 = new Float(enumC9142v == EnumC9142v.Vertical ? Z1.w.d(h22) : Z1.w.c(h22));
                this.f39032d = 1;
                if (interfaceC6511n.invoke(m11, f7, this) == aVar) {
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

    public H(@NotNull InterfaceC9137q interfaceC9137q, @NotNull Function1<? super x1.x, Boolean> function1, @NotNull EnumC9142v enumC9142v, boolean z11, t0.q qVar, boolean z12, @NotNull InterfaceC6511n<? super xe.M, ? super C7459e, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n, @NotNull InterfaceC6511n<? super xe.M, ? super Float, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n2, boolean z13) {
        super(function1, z11, qVar, enumC9142v);
        this.f39016l = interfaceC9137q;
        this.f39017m = enumC9142v;
        this.f39018n = z12;
        this.f39019o = interfaceC6511n;
        this.f39020p = interfaceC6511n2;
        this.f39021q = z13;
    }

    public static final long h2(H h11, long j11) {
        return Z1.w.g(h11.f39021q ? -1.0f : 1.0f, j11);
    }

    public static final long i2(H h11, long j11) {
        return C7459e.l(h11.f39021q ? -1.0f : 1.0f, j11);
    }

    @Override // androidx.compose.foundation.gestures.B
    public final Object W1(@NotNull Function2<? super Function1<? super AbstractC5172o.b, Unit>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object a11 = this.f39016l.a(EnumC8372M.UserInput, new a(function2, this, null), dVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    @Override // androidx.compose.foundation.gestures.B
    public final void Z1(long j11) {
        InterfaceC6511n interfaceC6511n;
        if (isAttached()) {
            InterfaceC6511n<? super xe.M, ? super C7459e, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n2 = this.f39019o;
            interfaceC6511n = C9135o.f82632a;
            if (Intrinsics.d(interfaceC6511n2, interfaceC6511n)) {
                return;
            }
            C10727i.c(getCoroutineScope(), null, null, new b(j11, null), 3);
        }
    }

    @Override // androidx.compose.foundation.gestures.B
    public final void a2(long j11) {
        InterfaceC6511n interfaceC6511n;
        if (isAttached()) {
            InterfaceC6511n<? super xe.M, ? super Float, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n2 = this.f39020p;
            interfaceC6511n = C9135o.f82633b;
            if (Intrinsics.d(interfaceC6511n2, interfaceC6511n)) {
                return;
            }
            C10727i.c(getCoroutineScope(), null, null, new c(j11, null), 3);
        }
    }

    @Override // androidx.compose.foundation.gestures.B
    public final boolean b2() {
        return this.f39018n;
    }

    public final void j2(@NotNull InterfaceC9137q interfaceC9137q, @NotNull Function1<? super x1.x, Boolean> function1, @NotNull EnumC9142v enumC9142v, boolean z11, t0.q qVar, boolean z12, @NotNull InterfaceC6511n<? super xe.M, ? super C7459e, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n, @NotNull InterfaceC6511n<? super xe.M, ? super Float, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n2, boolean z13) {
        boolean z14;
        boolean z15 = true;
        if (Intrinsics.d(this.f39016l, interfaceC9137q)) {
            z14 = false;
        } else {
            this.f39016l = interfaceC9137q;
            z14 = true;
        }
        if (this.f39017m != enumC9142v) {
            this.f39017m = enumC9142v;
            z14 = true;
        }
        if (this.f39021q != z13) {
            this.f39021q = z13;
        } else {
            z15 = z14;
        }
        this.f39019o = interfaceC6511n;
        this.f39020p = interfaceC6511n2;
        this.f39018n = z12;
        c2(function1, z11, qVar, enumC9142v, z15);
    }
}
