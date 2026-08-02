package R2;

import Ae.C2380A;
import Ae.C2399j;
import Ae.C2425z;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import R2.V;
import Sc.C4001c;
import Sc.InterfaceC4008j;
import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.C10754w;
import xe.H0;
import xe.InterfaceC10750u;

/* renamed from: R2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3922p<T> implements InterfaceC3917k<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final h0<T> f24411a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC3910d<T> f24412b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final xe.M f24413c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<T> f24414d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Je.d f24415e;

    /* renamed from: f, reason: collision with root package name */
    private int f24416f;

    /* renamed from: g, reason: collision with root package name */
    private B0 f24417g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final G<T> f24418h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C3922p<T>.a f24419i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<i0<T>> f24420j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f24421k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final b0<V.a<T>> f24422l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R2.p$a */
    final class a extends Z {

        /* renamed from: c, reason: collision with root package name */
        private List<? extends Function2<? super T<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> f24423c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C3922p<T> f24424d;

        public a(@NotNull C3922p c3922p, List<? extends Function2<? super T<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> initTasksList) {
            Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
            this.f24424d = c3922p;
            this.f24423c = C7714v.U0(initTasksList);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // R2.Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected final Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
            C3919m c3919m;
            int i11;
            a aVar;
            C3911e c3911e;
            if (cVar instanceof C3919m) {
                c3919m = (C3919m) cVar;
                int i12 = c3919m.f24386g;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c3919m.f24386g = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c3919m.f24384e;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c3919m.f24386g;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        List<? extends Function2<? super T<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> list = this.f24423c;
                        C3922p<T> c3922p = this.f24424d;
                        if (list == null || list.isEmpty()) {
                            c3919m.f24383d = this;
                            c3919m.f24386g = 1;
                            obj = C3922p.n(c3922p, false, c3919m);
                            if (obj != aVar2) {
                                aVar = this;
                                c3911e = (C3911e) obj;
                            }
                        } else {
                            U p11 = c3922p.p();
                            C3921o c3921o = new C3921o(c3922p, this, null);
                            c3919m.f24383d = this;
                            c3919m.f24386g = 2;
                            obj = p11.b(c3921o, c3919m);
                            if (obj != aVar2) {
                                aVar = this;
                                c3911e = (C3911e) obj;
                            }
                        }
                        return aVar2;
                    }
                    if (i11 == 1) {
                        aVar = (a) c3919m.f24383d;
                        Sc.s.b(obj);
                        c3911e = (C3911e) obj;
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = (a) c3919m.f24383d;
                        Sc.s.b(obj);
                        c3911e = (C3911e) obj;
                    }
                    ((C3922p) aVar.f24424d).f24418h.c(c3911e);
                    return Unit.f71690a;
                }
            }
            c3919m = new C3919m(this, cVar);
            Object obj2 = c3919m.f24384e;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c3919m.f24386g;
            if (i11 != 0) {
            }
            ((C3922p) aVar.f24424d).f24418h.c(c3911e);
            return Unit.f71690a;
        }
    }

    /* renamed from: R2.p$b */
    static final class b extends AbstractC7737t implements Function0<U> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3922p<T> f24425b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3922p<T> c3922p) {
            super(0);
            this.f24425b = c3922p;
        }

        @Override // kotlin.jvm.functions.Function0
        public final U invoke() {
            return this.f24425b.q().d();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, 74, 100}, m = "invokeSuspend")
    /* renamed from: R2.p$c */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        C3911e f24426d;

        /* renamed from: e, reason: collision with root package name */
        int f24427e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f24428f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C3922p<T> f24429g;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {102}, m = "invokeSuspend")
        /* renamed from: R2.p$c$a */
        static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<? super g0<T>>, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f24430d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C3922p<T> f24431e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3922p<T> c3922p, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f24431e = c3922p;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new a(this.f24431e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create((InterfaceC2397i) obj, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f24430d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f24430d = 1;
                    if (C3922p.j(this.f24431e, this) == aVar) {
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

        @kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: R2.p$c$b */
        static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<g0<T>, kotlin.coroutines.d<? super Boolean>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f24432d;

            b() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                b bVar = new b(2, dVar);
                bVar.f24432d = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, kotlin.coroutines.d<? super Boolean> dVar) {
                return ((b) create((g0) obj, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                return Boolean.valueOf(!(((g0) this.f24432d) instanceof S));
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: R2.p$c$c, reason: collision with other inner class name */
        static final class C0482c extends kotlin.coroutines.jvm.internal.j implements Function2<g0<T>, kotlin.coroutines.d<? super Boolean>, Object> {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f24433d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ g0<T> f24434e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0482c(g0<T> g0Var, kotlin.coroutines.d<? super C0482c> dVar) {
                super(2, dVar);
                this.f24434e = g0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                C0482c c0482c = new C0482c(this.f24434e, dVar);
                c0482c.f24433d = obj;
                return c0482c;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, kotlin.coroutines.d<? super Boolean> dVar) {
                return ((C0482c) create((g0) obj, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                g0 g0Var = (g0) this.f24433d;
                return Boolean.valueOf((g0Var instanceof C3911e) && g0Var.a() <= this.f24434e.a());
            }
        }

        @kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {116}, m = "invokeSuspend")
        /* renamed from: R2.p$c$d */
        static final class d extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<? super T>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f24435d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C3922p<T> f24436e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C3922p<T> c3922p, kotlin.coroutines.d<? super d> dVar) {
                super(3, dVar);
                this.f24436e = c3922p;
            }

            @Override // fd.InterfaceC6511n
            public final Object invoke(Object obj, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
                return new d(this.f24436e, dVar).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f24435d;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f24435d = 1;
                    if (C3922p.b(this.f24436e, this) == aVar) {
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

        /* renamed from: R2.p$c$e */
        public static final class e implements InterfaceC2395h<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ae.K f24437a;

            /* renamed from: R2.p$c$e$a */
            public static final class a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC2397i f24438a;

                @kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {223}, m = "emit")
                /* renamed from: R2.p$c$e$a$a, reason: collision with other inner class name */
                /* loaded from: classes8.dex */
                public static final class C0483a extends kotlin.coroutines.jvm.internal.c {

                    /* renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f24439d;

                    /* renamed from: e, reason: collision with root package name */
                    int f24440e;

                    public C0483a(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f24439d = obj;
                        this.f24440e |= LinearLayoutManager.INVALID_OFFSET;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC2397i interfaceC2397i) {
                    this.f24438a = interfaceC2397i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                    C0483a c0483a;
                    int i11;
                    if (dVar instanceof C0483a) {
                        c0483a = (C0483a) dVar;
                        int i12 = c0483a.f24440e;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            c0483a.f24440e = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = c0483a.f24439d;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = c0483a.f24440e;
                            if (i11 != 0) {
                                Sc.s.b(obj2);
                                g0 g0Var = (g0) obj;
                                if (g0Var instanceof W) {
                                    throw ((W) g0Var).b();
                                }
                                if (!(g0Var instanceof C3911e)) {
                                    if (g0Var instanceof S ? true : g0Var instanceof k0) {
                                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                    }
                                    throw new Sc.o();
                                }
                                Object c11 = ((C3911e) g0Var).c();
                                c0483a.f24440e = 1;
                                if (this.f24438a.emit(c11, c0483a) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Sc.s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    c0483a = new C0483a(dVar);
                    Object obj22 = c0483a.f24439d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0483a.f24440e;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            public e(Ae.K k11) {
                this.f24437a = k11;
            }

            @Override // Ae.InterfaceC2395h
            public final Object collect(@NotNull InterfaceC2397i interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
                Object collect = this.f24437a.collect(new a(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3922p<T> c3922p, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f24429g = c3922p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.f24429g, dVar);
            cVar.f24428f = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create((InterfaceC2397i) obj, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x00b3, code lost:
        
            if (Ae.C2399j.r(r3, r4, r9) != r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
        
            if (r10 == r0) goto L31;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            InterfaceC2397i interfaceC2397i;
            g0 g0Var;
            InterfaceC2397i interfaceC2397i2;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f24427e;
            C3922p<T> c3922p = this.f24429g;
            if (i11 == 0) {
                Sc.s.b(obj);
                InterfaceC2397i interfaceC2397i3 = (InterfaceC2397i) this.f24428f;
                this.f24428f = interfaceC2397i3;
                this.f24427e = 1;
                Object o11 = C3922p.o(c3922p, this);
                if (o11 != aVar) {
                    interfaceC2397i = interfaceC2397i3;
                    obj = o11;
                }
                return aVar;
            }
            if (i11 == 1) {
                InterfaceC2397i interfaceC2397i4 = (InterfaceC2397i) this.f24428f;
                Sc.s.b(obj);
                interfaceC2397i = interfaceC2397i4;
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                g0Var = this.f24426d;
                InterfaceC2397i interfaceC2397i5 = (InterfaceC2397i) this.f24428f;
                Sc.s.b(obj);
                interfaceC2397i2 = interfaceC2397i5;
                C2425z c2425z = new C2425z(new e(new Ae.K(new Ae.P(new C2380A(((C3922p) c3922p).f24418h.b(), new a(c3922p, null)), new b(2, null)), new C0482c(g0Var, null))), new d(c3922p, null));
                this.f24428f = null;
                this.f24426d = null;
                this.f24427e = 3;
            }
            g0Var = (g0) obj;
            if (g0Var instanceof C3911e) {
                Object c11 = ((C3911e) g0Var).c();
                this.f24428f = interfaceC2397i;
                this.f24426d = (C3911e) g0Var;
                this.f24427e = 2;
                Object emit = interfaceC2397i.emit(c11, this);
                interfaceC2397i2 = interfaceC2397i;
            } else {
                if (g0Var instanceof k0) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                if (g0Var instanceof W) {
                    throw ((W) g0Var).b();
                }
                interfaceC2397i2 = interfaceC2397i;
                if (g0Var instanceof S) {
                    return Unit.f71690a;
                }
            }
            C2425z c2425z2 = new C2425z(new e(new Ae.K(new Ae.P(new C2380A(((C3922p) c3922p).f24418h.b(), new a(c3922p, null)), new b(2, null)), new C0482c(g0Var, null))), new d(c3922p, null));
            this.f24428f = null;
            this.f24426d = null;
            this.f24427e = 3;
        }
    }

    /* renamed from: R2.p$d */
    static final class d extends AbstractC7737t implements Function0<i0<T>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3922p<T> f24442b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3922p<T> c3922p) {
            super(0);
            this.f24442b = c3922p;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((C3922p) this.f24442b).f24411a.a();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
    /* renamed from: R2.p$e */
    static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super T>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f24443d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f24444e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C3922p<T> f24445f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.j f24446g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(C3922p<T> c3922p, Function2<? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f24445f = c3922p;
            this.f24446g = (kotlin.coroutines.jvm.internal.j) function2;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f24445f, this.f24446g, dVar);
            eVar.f24444e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, Object obj) {
            return ((e) create(m11, (kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f24443d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            xe.M m11 = (xe.M) this.f24444e;
            InterfaceC10750u a11 = C10754w.a();
            C3922p<T> c3922p = this.f24445f;
            ((C3922p) c3922p).f24422l.e(new V.a(this.f24446g, a11, ((C3922p) c3922p).f24418h.a(), m11.getCoroutineContext()));
            this.f24443d = 1;
            Object s11 = a11.s(this);
            return s11 == aVar ? aVar : s11;
        }
    }

    /* renamed from: R2.p$f */
    static final class f extends AbstractC7737t implements Function1<Throwable, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3922p<T> f24447b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3922p<T> c3922p) {
            super(1);
            this.f24447b = c3922p;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Throwable th3 = th2;
            C3922p<T> c3922p = this.f24447b;
            if (th3 != null) {
                ((C3922p) c3922p).f24418h.c(new S(th3));
            }
            if (((C3922p) c3922p).f24420j.isInitialized()) {
                c3922p.q().close();
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: R2.p$g */
    static final class g extends AbstractC7737t implements Function2<V.a<T>, Throwable, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f24448b = new g(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Object obj, Throwable th2) {
            V.a msg = (V.a) obj;
            Throwable th3 = th2;
            Intrinsics.checkNotNullParameter(msg, "msg");
            InterfaceC10750u<T> a11 = msg.a();
            if (th3 == null) {
                th3 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            a11.L(th3);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {207}, m = "invokeSuspend")
    /* renamed from: R2.p$h */
    static final class h extends kotlin.coroutines.jvm.internal.j implements Function2<V.a<T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f24449d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f24450e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C3922p<T> f24451f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C3922p<T> c3922p, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f24451f = c3922p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            h hVar = new h(this.f24451f, dVar);
            hVar.f24450e = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create((V.a) obj, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f24449d;
            if (i11 == 0) {
                Sc.s.b(obj);
                V.a aVar2 = (V.a) this.f24450e;
                this.f24449d = 1;
                if (C3922p.i(this.f24451f, aVar2, this) == aVar) {
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

    public C3922p(@NotNull h0<T> storage, @NotNull List<? extends Function2<? super T<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object>> initTasksList, @NotNull InterfaceC3910d<T> corruptionHandler, @NotNull xe.M scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f24411a = storage;
        this.f24412b = corruptionHandler;
        this.f24413c = scope;
        this.f24414d = C2399j.A(new c(this, null));
        this.f24415e = Je.e.a();
        this.f24418h = new G<>();
        this.f24419i = new a(this, initTasksList);
        this.f24420j = Sc.k.b(new d(this));
        this.f24421k = Sc.k.b(new b(this));
        this.f24422l = new b0<>(scope, new f(this), g.f24448b, new h(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:12:0x004b, B:14:0x0053, B:16:0x0057, B:17:0x005c, B:18:0x0061), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C3922p c3922p, kotlin.coroutines.jvm.internal.c cVar) {
        C3923q c3923q;
        int i11;
        Je.d dVar;
        int i12;
        c3922p.getClass();
        try {
            if (cVar instanceof C3923q) {
                c3923q = (C3923q) cVar;
                int i13 = c3923q.f24456h;
                if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c3923q.f24456h = i13 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c3923q.f24454f;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c3923q.f24456h;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        c3923q.f24452d = c3922p;
                        dVar = c3922p.f24415e;
                        c3923q.f24453e = dVar;
                        c3923q.f24456h = 1;
                        if (dVar.a(c3923q) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Je.d dVar2 = c3923q.f24453e;
                        C3922p c3922p2 = c3923q.f24452d;
                        Sc.s.b(obj);
                        dVar = dVar2;
                        c3922p = c3922p2;
                    }
                    i12 = c3922p.f24416f - 1;
                    c3922p.f24416f = i12;
                    if (i12 == 0) {
                        B0 b02 = c3922p.f24417g;
                        if (b02 != null) {
                            ((H0) b02).j(null);
                        }
                        c3922p.f24417g = null;
                    }
                    Unit unit = Unit.f71690a;
                    dVar.c(null);
                    return Unit.f71690a;
                }
            }
            i12 = c3922p.f24416f - 1;
            c3922p.f24416f = i12;
            if (i12 == 0) {
            }
            Unit unit2 = Unit.f71690a;
            dVar.c(null);
            return Unit.f71690a;
        } catch (Throwable th2) {
            dVar.c(null);
            throw th2;
        }
        c3923q = new C3923q(c3922p, cVar);
        Object obj2 = c3923q.f24454f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c3923q.f24456h;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(7:(1:(1:(1:12)(2:23|24))(3:25|26|27))(1:39)|13|14|15|(1:17)(1:21)|18|19)(5:40|41|42|(3:44|45|46)(3:50|(1:52)(1:67)|(2:54|(2:56|(1:58))(2:59|60))(2:61|(2:63|64)(2:65|66)))|33)|28|29|30))|70|6|7|(0)(0)|28|29|30|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cc, code lost:
    
        if (r9 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d2, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0036, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r9v0, types: [R2.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [xe.u] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(C3922p c3922p, V.a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        C3924s c3924s;
        int i11;
        ?? r92;
        Throwable b11;
        InterfaceC10750u<T> a11;
        Object b12;
        C3922p c3922p2;
        InterfaceC10750u interfaceC10750u;
        c3922p.getClass();
        if (cVar instanceof C3924s) {
            c3924s = (C3924s) cVar;
            int i12 = c3924s.f24464i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c3924s.f24464i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c3924s.f24462g;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c3924s.f24464i;
                boolean z11 = true;
                if (i11 == 0) {
                    if (i11 == 1) {
                        interfaceC10750u = (InterfaceC10750u) c3924s.f24459d;
                    } else if (i11 == 2) {
                        InterfaceC10750u<T> interfaceC10750u2 = c3924s.f24461f;
                        C3922p c3922p3 = c3924s.f24460e;
                        V.a aVar3 = (V.a) c3924s.f24459d;
                        Sc.s.b(obj);
                        a11 = interfaceC10750u2;
                        c3922p2 = c3922p3;
                        aVar = aVar3;
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC10750u = (InterfaceC10750u) c3924s.f24459d;
                    }
                    Sc.s.b(obj);
                    c3922p = interfaceC10750u;
                    r.Companion companion = Sc.r.INSTANCE;
                    r92 = c3922p;
                    b11 = Sc.r.b(obj);
                    if (b11 != null) {
                        r92.complete(obj);
                    } else {
                        r92.L(b11);
                    }
                    return Unit.f71690a;
                }
                Sc.s.b(obj);
                a11 = aVar.a();
                try {
                    r.Companion companion2 = Sc.r.INSTANCE;
                    g0<T> a12 = ((C3922p) c3922p).f24418h.a();
                    if (a12 instanceof C3911e) {
                        Function2<T, kotlin.coroutines.d<? super T>, Object> d11 = aVar.d();
                        CoroutineContext b13 = aVar.b();
                        c3924s.f24459d = a11;
                        c3924s.f24464i = 1;
                        try {
                            b12 = c3922p.p().b(new D(c3922p, b13, d11, null), c3924s);
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            c3922p = a11;
                            r.Companion companion3 = Sc.r.INSTANCE;
                            obj = Sc.s.a(th);
                            r92 = c3922p;
                            b11 = Sc.r.b(obj);
                            if (b11 != null) {
                            }
                            return Unit.f71690a;
                        }
                    } else {
                        if (!(a12 instanceof W)) {
                            z11 = a12 instanceof k0;
                        }
                        if (!z11) {
                            if (a12 instanceof S) {
                                throw ((S) a12).b();
                            }
                            throw new Sc.o();
                        }
                        if (a12 != aVar.c()) {
                            Intrinsics.g(a12, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                            throw ((W) a12).b();
                        }
                        c3924s.f24459d = aVar;
                        c3924s.f24460e = c3922p;
                        c3924s.f24461f = a11;
                        c3924s.f24464i = 2;
                        Object r11 = c3922p.r(c3924s);
                        c3922p2 = c3922p;
                        if (r11 == aVar2) {
                        }
                    }
                    return aVar2;
                } catch (Throwable th3) {
                    th = th3;
                    c3922p = a11;
                    r.Companion companion32 = Sc.r.INSTANCE;
                    obj = Sc.s.a(th);
                    r92 = c3922p;
                    b11 = Sc.r.b(obj);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
                Function2<T, kotlin.coroutines.d<? super T>, Object> d12 = aVar.d();
                CoroutineContext b14 = aVar.b();
                c3924s.f24459d = a11;
                c3924s.f24460e = null;
                c3924s.f24461f = null;
                c3924s.f24464i = 3;
                b12 = c3922p2.p().b(new D(c3922p2, b14, d12, null), c3924s);
            }
        }
        c3924s = new C3924s(c3922p, cVar);
        Object obj2 = c3924s.f24462g;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c3924s.f24464i;
        boolean z112 = true;
        if (i11 == 0) {
        }
        Function2<T, kotlin.coroutines.d<? super T>, Object> d122 = aVar.d();
        CoroutineContext b142 = aVar.b();
        c3924s.f24459d = a11;
        c3924s.f24460e = null;
        c3924s.f24461f = null;
        c3924s.f24464i = 3;
        b12 = c3922p2.p().b(new D(c3922p2, b142, d122, null), c3924s);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:12:0x004b, B:14:0x0052, B:15:0x0063), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(C3922p c3922p, kotlin.coroutines.jvm.internal.c cVar) {
        C3925t c3925t;
        int i11;
        Je.d dVar;
        int i12;
        c3922p.getClass();
        try {
            if (cVar instanceof C3925t) {
                c3925t = (C3925t) cVar;
                int i13 = c3925t.f24469h;
                if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c3925t.f24469h = i13 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c3925t.f24467f;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c3925t.f24469h;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        c3925t.f24465d = c3922p;
                        dVar = c3922p.f24415e;
                        c3925t.f24466e = dVar;
                        c3925t.f24469h = 1;
                        if (dVar.a(c3925t) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Je.d dVar2 = c3925t.f24466e;
                        C3922p c3922p2 = c3925t.f24465d;
                        Sc.s.b(obj);
                        dVar = dVar2;
                        c3922p = c3922p2;
                    }
                    i12 = c3922p.f24416f + 1;
                    c3922p.f24416f = i12;
                    if (i12 == 1) {
                        c3922p.f24417g = C10727i.c(c3922p.f24413c, null, null, new C3926u(c3922p, null), 3);
                    }
                    Unit unit = Unit.f71690a;
                    dVar.c(null);
                    return Unit.f71690a;
                }
            }
            i12 = c3922p.f24416f + 1;
            c3922p.f24416f = i12;
            if (i12 == 1) {
            }
            Unit unit2 = Unit.f71690a;
            dVar.c(null);
            return Unit.f71690a;
        } catch (Throwable th2) {
            dVar.c(null);
            throw th2;
        }
        c3925t = new C3925t(c3922p, cVar);
        Object obj2 = c3925t.f24467f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c3925t.f24469h;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(C3922p c3922p, boolean z11, kotlin.coroutines.d dVar) {
        C3928w c3928w;
        Wc.a aVar;
        int i11;
        C3922p c3922p2;
        g0<T> g0Var;
        boolean z12;
        C3922p c3922p3;
        Pair pair;
        c3922p.getClass();
        if (dVar instanceof C3928w) {
            c3928w = (C3928w) dVar;
            int i12 = c3928w.f24483i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c3928w.f24483i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c3928w.f24481g;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c3928w.f24483i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    g0<T> a11 = c3922p.f24418h.a();
                    if (a11 instanceof k0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    U p11 = c3922p.p();
                    c3928w.f24478d = c3922p;
                    c3928w.f24479e = a11;
                    c3928w.f24480f = z11;
                    c3928w.f24483i = 1;
                    Integer version = p11.getVersion();
                    if (version != aVar) {
                        c3922p2 = c3922p;
                        g0Var = a11;
                        obj = version;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        c3922p3 = c3928w.f24478d;
                        Sc.s.b(obj);
                        pair = (Pair) obj;
                        g0 g0Var2 = (g0) pair.a();
                        if (((Boolean) pair.b()).booleanValue()) {
                        }
                        return g0Var2;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3922p3 = c3928w.f24478d;
                    Sc.s.b(obj);
                    pair = (Pair) obj;
                    g0 g0Var22 = (g0) pair.a();
                    if (((Boolean) pair.b()).booleanValue()) {
                        c3922p3.f24418h.c(g0Var22);
                    }
                    return g0Var22;
                }
                z11 = c3928w.f24480f;
                g0Var = c3928w.f24479e;
                c3922p2 = c3928w.f24478d;
                Sc.s.b(obj);
                int intValue = ((Number) obj).intValue();
                z12 = g0Var instanceof C3911e;
                int a12 = !z12 ? g0Var.a() : -1;
                if (!z12 && intValue == a12) {
                    return g0Var;
                }
                if (z11) {
                    U p12 = c3922p2.p();
                    C3930y c3930y = new C3930y(c3922p2, a12, null);
                    c3928w.f24478d = c3922p2;
                    c3928w.f24479e = null;
                    c3928w.f24483i = 3;
                    obj = p12.c(c3930y, c3928w);
                    if (obj != aVar) {
                        c3922p3 = c3922p2;
                        pair = (Pair) obj;
                        g0 g0Var222 = (g0) pair.a();
                        if (((Boolean) pair.b()).booleanValue()) {
                        }
                        return g0Var222;
                    }
                } else {
                    U p13 = c3922p2.p();
                    C3929x c3929x = new C3929x(c3922p2, null);
                    c3928w.f24478d = c3922p2;
                    c3928w.f24479e = null;
                    c3928w.f24483i = 2;
                    obj = p13.b(c3929x, c3928w);
                    if (obj != aVar) {
                        c3922p3 = c3922p2;
                        pair = (Pair) obj;
                        g0 g0Var2222 = (g0) pair.a();
                        if (((Boolean) pair.b()).booleanValue()) {
                        }
                        return g0Var2222;
                    }
                }
                return aVar;
            }
        }
        c3928w = new C3928w(c3922p, dVar);
        Object obj2 = c3928w.f24481g;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = c3928w.f24483i;
        if (i11 != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z12 = g0Var instanceof C3911e;
        if (!z12) {
        }
        if (!z12) {
        }
        if (z11) {
        }
        return aVar;
    }

    public static final Object m(C3922p c3922p, kotlin.coroutines.jvm.internal.j jVar) {
        return c3922p.q().a(new j0(3, null), jVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|72|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0062, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0147 A[Catch: all -> 0x0173, TryCatch #1 {all -> 0x0173, blocks: (B:27:0x0135, B:29:0x0147, B:32:0x014f), top: B:26:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014f A[Catch: all -> 0x0173, TRY_LEAVE, TryCatch #1 {all -> 0x0173, blocks: (B:27:0x0135, B:29:0x0147, B:32:0x014f), top: B:26:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac A[Catch: c -> 0x0062, TryCatch #2 {c -> 0x0062, blocks: (B:36:0x005d, B:37:0x010a, B:40:0x006b, B:41:0x00ec, B:56:0x0088, B:58:0x00ac, B:59:0x00b2, B:65:0x0092, B:68:0x00da), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(C3922p c3922p, boolean z11, kotlin.coroutines.jvm.internal.c cVar) {
        C3931z c3931z;
        kotlin.jvm.internal.M m11;
        C3909c c3909c;
        C3922p c3922p2;
        boolean z12;
        kotlin.jvm.internal.M m12;
        C3909c c3909c2;
        Object b11;
        kotlin.jvm.internal.K k11;
        kotlin.jvm.internal.M m13;
        Integer version;
        C3922p c3922p3;
        int i11;
        Object obj;
        c3922p.getClass();
        if (cVar instanceof C3931z) {
            c3931z = (C3931z) cVar;
            int i12 = c3931z.f24500l;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c3931z.f24500l = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = (T) c3931z.f24498j;
                Object obj3 = Wc.a.COROUTINE_SUSPENDED;
                switch (c3931z.f24500l) {
                    case 0:
                        Sc.s.b(obj2);
                        if (!z11) {
                            U p11 = c3922p.p();
                            c3931z.f24492d = c3922p;
                            c3931z.f24496h = z11;
                            c3931z.f24500l = 3;
                            obj2 = (T) p11.getVersion();
                            if (obj2 == obj3) {
                            }
                            int intValue = ((Number) obj2).intValue();
                            U p12 = c3922p.p();
                            A a11 = new A(c3922p, intValue, null);
                            c3931z.f24492d = c3922p;
                            c3931z.f24496h = z11;
                            c3931z.f24500l = 4;
                            obj2 = (T) p12.c(a11, c3931z);
                            if (obj2 == obj3) {
                            }
                            return (C3911e) obj2;
                        }
                        c3931z.f24492d = c3922p;
                        c3931z.f24496h = z11;
                        c3931z.f24500l = 1;
                        obj2 = (T) c3922p.q().a(new j0(3, null), c3931z);
                        if (obj2 == obj3) {
                        }
                        int hashCode = obj2 == null ? obj2.hashCode() : 0;
                        U p13 = c3922p.p();
                        c3931z.f24492d = c3922p;
                        c3931z.f24493e = obj2;
                        c3931z.f24496h = z11;
                        c3931z.f24497i = hashCode;
                        c3931z.f24500l = 2;
                        version = p13.getVersion();
                        if (version != obj3) {
                            c3922p3 = c3922p;
                            i11 = hashCode;
                            obj = obj2;
                            obj2 = (T) version;
                            return new C3911e(i11, ((Number) obj2).intValue(), obj);
                        }
                        return obj3;
                    case 1:
                        z11 = c3931z.f24496h;
                        c3922p = (C3922p) c3931z.f24492d;
                        Sc.s.b(obj2);
                        if (obj2 == null) {
                        }
                        U p132 = c3922p.p();
                        c3931z.f24492d = c3922p;
                        c3931z.f24493e = obj2;
                        c3931z.f24496h = z11;
                        c3931z.f24497i = hashCode;
                        c3931z.f24500l = 2;
                        version = p132.getVersion();
                        if (version != obj3) {
                        }
                        return obj3;
                    case 2:
                        i11 = c3931z.f24497i;
                        z11 = c3931z.f24496h;
                        obj = c3931z.f24493e;
                        c3922p3 = (C3922p) c3931z.f24492d;
                        try {
                            Sc.s.b(obj2);
                            return new C3911e(i11, ((Number) obj2).intValue(), obj);
                        } catch (C3909c e11) {
                            e = e11;
                            c3922p = c3922p3;
                            m11 = new kotlin.jvm.internal.M();
                            InterfaceC3910d<T> interfaceC3910d = c3922p.f24412b;
                            c3931z.f24492d = c3922p;
                            c3931z.f24493e = e;
                            c3931z.f24494f = m11;
                            c3931z.f24495g = m11;
                            c3931z.f24496h = z11;
                            c3931z.f24500l = 5;
                            Object a12 = interfaceC3910d.a(e);
                            if (a12 != obj3) {
                                c3909c = e;
                                obj2 = (T) a12;
                                c3922p2 = c3922p;
                                z12 = z11;
                                m12 = m11;
                                m12.f71787a = (T) obj2;
                                kotlin.jvm.internal.K k12 = new kotlin.jvm.internal.K();
                                try {
                                    B b12 = new B(m11, c3922p2, k12, null);
                                    c3931z.f24492d = c3909c;
                                    c3931z.f24493e = m11;
                                    c3931z.f24494f = k12;
                                    c3931z.f24495g = null;
                                    c3931z.f24500l = 6;
                                    if (z12) {
                                    }
                                    if (b11 != obj3) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    c3909c2 = c3909c;
                                    C4001c.a(c3909c2, th);
                                    throw c3909c2;
                                }
                            }
                            return obj3;
                        }
                    case 3:
                        z11 = c3931z.f24496h;
                        c3922p = (C3922p) c3931z.f24492d;
                        Sc.s.b(obj2);
                        int intValue2 = ((Number) obj2).intValue();
                        U p122 = c3922p.p();
                        A a112 = new A(c3922p, intValue2, null);
                        c3931z.f24492d = c3922p;
                        c3931z.f24496h = z11;
                        c3931z.f24500l = 4;
                        obj2 = (T) p122.c(a112, c3931z);
                        if (obj2 == obj3) {
                        }
                        return (C3911e) obj2;
                    case 4:
                        boolean z13 = c3931z.f24496h;
                        Sc.s.b(obj2);
                        return (C3911e) obj2;
                    case 5:
                        z12 = c3931z.f24496h;
                        m12 = c3931z.f24495g;
                        m11 = (kotlin.jvm.internal.M) c3931z.f24494f;
                        c3909c = (C3909c) c3931z.f24493e;
                        c3922p2 = (C3922p) c3931z.f24492d;
                        Sc.s.b(obj2);
                        m12.f71787a = (T) obj2;
                        kotlin.jvm.internal.K k122 = new kotlin.jvm.internal.K();
                        B b122 = new B(m11, c3922p2, k122, null);
                        c3931z.f24492d = c3909c;
                        c3931z.f24493e = m11;
                        c3931z.f24494f = k122;
                        c3931z.f24495g = null;
                        c3931z.f24500l = 6;
                        if (z12) {
                            b11 = c3922p2.p().b(new r(b122, null), c3931z);
                        } else {
                            c3922p2.getClass();
                            b11 = b122.invoke(c3931z);
                        }
                        if (b11 != obj3) {
                            k11 = k122;
                            m13 = m11;
                            T t2 = m13.f71787a;
                            obj3 = new C3911e(t2 != null ? t2.hashCode() : 0, k11.f71785a, t2);
                        }
                        return obj3;
                    case 6:
                        k11 = (kotlin.jvm.internal.K) c3931z.f24494f;
                        m13 = (kotlin.jvm.internal.M) c3931z.f24493e;
                        c3909c2 = (C3909c) c3931z.f24492d;
                        try {
                            Sc.s.b(obj2);
                            T t22 = m13.f71787a;
                            obj3 = new C3911e(t22 != null ? t22.hashCode() : 0, k11.f71785a, t22);
                            return obj3;
                        } catch (Throwable th3) {
                            th = th3;
                            C4001c.a(c3909c2, th);
                            throw c3909c2;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        c3931z = new C3931z(c3922p, cVar);
        Object obj22 = (T) c3931z.f24498j;
        Object obj32 = Wc.a.COROUTINE_SUSPENDED;
        switch (c3931z.f24500l) {
        }
    }

    public static final Object o(C3922p c3922p, kotlin.coroutines.d dVar) {
        return C10727i.f(c3922p.f24413c.getCoroutineContext(), new C(c3922p, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final U p() {
        return (U) this.f24421k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.c(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(kotlin.coroutines.jvm.internal.c cVar) {
        C3927v c3927v;
        int i11;
        C3922p<T> c3922p;
        int intValue;
        int i12;
        Throwable th2;
        C3922p<T> c3922p2;
        try {
            if (cVar instanceof C3927v) {
                c3927v = (C3927v) cVar;
                int i13 = c3927v.f24477h;
                if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c3927v.f24477h = i13 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c3927v.f24475f;
                    Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c3927v.f24477h;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        U p11 = p();
                        c3927v.f24473d = this;
                        c3927v.f24477h = 1;
                        obj = p11.getVersion();
                        if (obj != obj2) {
                            c3922p = this;
                        }
                        return obj2;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i12 = c3927v.f24474e;
                        c3922p2 = c3927v.f24473d;
                        try {
                            Sc.s.b(obj);
                            return Unit.f71690a;
                        } catch (Throwable th3) {
                            th2 = th3;
                            c3922p2.f24418h.c(new W(i12, th2));
                            throw th2;
                        }
                    }
                    c3922p = c3927v.f24473d;
                    Sc.s.b(obj);
                    intValue = ((Number) obj).intValue();
                    C3922p<T>.a aVar = c3922p.f24419i;
                    c3927v.f24473d = c3922p;
                    c3927v.f24474e = intValue;
                    c3927v.f24477h = 2;
                }
            }
            C3922p<T>.a aVar2 = c3922p.f24419i;
            c3927v.f24473d = c3922p;
            c3927v.f24474e = intValue;
            c3927v.f24477h = 2;
        } catch (Throwable th4) {
            i12 = intValue;
            th2 = th4;
            c3922p2 = c3922p;
            c3922p2.f24418h.c(new W(i12, th2));
            throw th2;
        }
        c3927v = new C3927v(this, cVar);
        Object obj3 = c3927v.f24475f;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c3927v.f24477h;
        if (i11 != 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    @Override // R2.InterfaceC3917k
    public final Object a(@NotNull Function2<? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        n0 n0Var = (n0) dVar.getContext().get(m0.f24387a);
        if (n0Var != null) {
            n0Var.a(this);
        }
        return C10727i.f(new n0(n0Var, this), new e(this, function2, null), dVar);
    }

    @Override // R2.InterfaceC3917k
    @NotNull
    public final InterfaceC2395h<T> getData() {
        return this.f24414d;
    }

    @NotNull
    public final i0<T> q() {
        return this.f24420j.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj, boolean z11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        E e11;
        int i11;
        kotlin.jvm.internal.K k11;
        if (cVar instanceof E) {
            e11 = (E) cVar;
            int i12 = e11.f24275g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                e11.f24275g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = e11.f24273e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = e11.f24275g;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    kotlin.jvm.internal.K k12 = new kotlin.jvm.internal.K();
                    i0<T> q11 = q();
                    F f7 = new F(k12, this, obj, z11, null);
                    e11.f24272d = k12;
                    e11.f24275g = 1;
                    if (q11.b(f7, e11) == aVar) {
                        return aVar;
                    }
                    k11 = k12;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k11 = e11.f24272d;
                    Sc.s.b(obj2);
                }
                return new Integer(k11.f71785a);
            }
        }
        e11 = new E(this, cVar);
        Object obj22 = e11.f24273e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = e11.f24275g;
        if (i11 != 0) {
        }
        return new Integer(k11.f71785a);
    }
}
