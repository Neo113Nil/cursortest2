package If0;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.C2417s0;
import Ae.E0;
import Ae.I0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import If0.J;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import h3.C6788a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qf0.EnumC9053a;
import qf0.d;
import rf0.AbstractC9267a;
import xe.C10727i;

/* loaded from: classes3.dex */
public final class K extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Jf0.b f12376a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Af0.a f12377b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C0 f12378c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final B0<H> f12379d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final x0<J> f12380e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final M0<J> f12381f;

    /* synthetic */ class a extends C7719a implements InterfaceC6511n<Lf0.b, List<? extends J.a>, kotlin.coroutines.d<? super J>, Object> {
        @Override // fd.InterfaceC6511n
        public final Object invoke(Lf0.b bVar, List<? extends J.a> list, kotlin.coroutines.d<? super J> dVar) {
            return K.d0((K) this.receiver, bVar, list);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.DomainReachabilityViewModel$2", f = "DomainReachabilityViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<J, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f12382d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = K.this.new b(dVar);
            bVar.f12382d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(J j11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(j11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            K.h0(K.this, (J) this.f12382d);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.DomainReachabilityViewModel$configParamsStateFlow$1", f = "DomainReachabilityViewModel.kt", l = {58}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Lf0.b>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f12384d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ M0<Lf0.b> f12385e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(M0<Lf0.b> m02, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f12385e = m02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f12385e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Lf0.b> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f12384d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            this.f12384d = 1;
            Object u11 = C2399j.u(this.f12385e, this);
            return u11 == aVar ? aVar : u11;
        }
    }

    public static final class d implements InterfaceC2395h<List<? extends J.a>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f12386a;

        public static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i f12387a;

            @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.DomainReachabilityViewModel$special$$inlined$map$1$2", f = "DomainReachabilityViewModel.kt", l = {223}, m = "emit")
            /* renamed from: If0.K$d$a$a, reason: collision with other inner class name */
            public static final class C0247a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f12388d;

                /* renamed from: e, reason: collision with root package name */
                int f12389e;

                public C0247a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f12388d = obj;
                    this.f12389e |= LinearLayoutManager.INVALID_OFFSET;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2397i interfaceC2397i) {
                this.f12387a = interfaceC2397i;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0247a c0247a;
                int i11;
                if (dVar instanceof C0247a) {
                    c0247a = (C0247a) dVar;
                    int i12 = c0247a.f12389e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c0247a.f12389e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c0247a.f12388d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c0247a.f12389e;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            Collection<Lf0.c> collection = (Collection) obj;
                            ArrayList arrayList = new ArrayList(C7714v.z(collection, 10));
                            for (Lf0.c cVar : collection) {
                                String b11 = cVar.b();
                                EnumC9053a c11 = cVar.c();
                                xe.B0 e11 = cVar.e();
                                boolean z11 = e11 != null && e11.isActive();
                                Long d11 = cVar.d();
                                AbstractC9267a f7 = cVar.f();
                                J.a.C0246a c0246a = f7 != null ? new J.a.C0246a(f7.c(), f7.a(), Lf0.e.a(f7.b()), f7.b().a()) : null;
                                d.b g10 = cVar.g();
                                arrayList.add(new J.a(b11, g10 != null ? new J.a.b(g10.a(), g10.b()) : null, z11, c11, c0246a, d11));
                            }
                            c0247a.f12389e = 1;
                            if (this.f12387a.emit(arrayList, c0247a) == aVar) {
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
                c0247a = new C0247a(dVar);
                Object obj22 = c0247a.f12388d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c0247a.f12389e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            }
        }

        public d(InterfaceC2395h interfaceC2395h) {
            this.f12386a = interfaceC2395h;
        }

        @Override // Ae.InterfaceC2395h
        public final Object collect(@NotNull InterfaceC2397i<? super List<? extends J.a>> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
            Object collect = this.f12386a.collect(new a(interfaceC2397i), dVar);
            return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
        }
    }

    public K(@NotNull Jf0.b repository, @NotNull Af0.a domainReachabilityLogger) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(domainReachabilityLogger, "domainReachabilityLogger");
        this.f12376a = repository;
        this.f12377b = domainReachabilityLogger;
        C0 b11 = E0.b(0, 0, null, 7);
        this.f12378c = b11;
        this.f12379d = C2399j.a(b11);
        repository.getClass();
        x0<J> a11 = O0.a(new J(wf0.c.b() != null, Jf0.b.o(), Jf0.b.p(), new Lf0.a(10, null, null), new Lf0.a(2, null, null), kotlin.collections.K.f71697a));
        this.f12380e = a11;
        this.f12381f = C2399j.b(a11);
        d dVar = new d(repository.l());
        M0<Lf0.b> k11 = repository.k();
        C6788a a12 = androidx.lifecycle.x0.a(this);
        int i11 = I0.f818a;
        C2399j.C(new C2408n0(new C2417s0(C2399j.M(k11, a12, I0.a.c(), C10727i.d(kotlin.coroutines.g.f71771a, new c(k11, null))), dVar, new a(3, this, K.class, "createState", "createState(Lru/ozon/network/internal/debugMenu/screen/domainReachability/model/DebugMenuDomainReachabilityConfigParams;Ljava/util/List;)Lru/ozon/network/internal/debugMenu/screen/domainReachability/DomainReachabilityUiState;", 4)), new b(null)), androidx.lifecycle.x0.a(this));
    }

    public static final J d0(K k11, Lf0.b bVar, List list) {
        k11.f12376a.getClass();
        return new J(wf0.c.b() != null, Jf0.b.o(), Jf0.b.p(), bVar.a(), bVar.b(), list);
    }

    public static final void h0(K k11, J j11) {
        k11.f12380e.setValue(j11);
    }

    private final xe.B0 j0(Function2<? super xe.M, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return C10727i.c(androidx.lifecycle.x0.a(this), null, null, function2, 3);
    }

    @NotNull
    public final B0<H> getEventsFlow() {
        return this.f12379d;
    }

    @NotNull
    public final M0<J> i0() {
        return this.f12381f;
    }

    public final void k0(@NotNull I intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        boolean z11 = intent instanceof V;
        x0<J> x0Var = this.f12380e;
        Jf0.b bVar = this.f12376a;
        if (z11) {
            V v11 = (V) intent;
            boolean a11 = v11.a();
            bVar.getClass();
            wf0.a b11 = wf0.c.b();
            if (b11 != null) {
                b11.b().g().l(a11);
            }
            x0Var.setValue(J.a(x0Var.getValue(), v11.a(), false, 61));
            Unit unit = Unit.f71690a;
            return;
        }
        if (intent instanceof U) {
            j0(new M(this, (U) intent, null));
            return;
        }
        if (intent instanceof Z) {
            j0(new N(this, (Z) intent, null));
            return;
        }
        if (intent instanceof Y) {
            Y y11 = (Y) intent;
            boolean a12 = y11.a();
            bVar.getClass();
            wf0.a b12 = wf0.c.b();
            if (b12 != null) {
                b12.b().h().b(a12);
            }
            x0Var.setValue(J.a(x0Var.getValue(), false, y11.a(), 59));
            Unit unit2 = Unit.f71690a;
            return;
        }
        if (intent instanceof a0) {
            j0(new O(this, (a0) intent, null));
            return;
        }
        if (intent instanceof e0) {
            j0(new P(this, (e0) intent, null));
            return;
        }
        if (intent instanceof W) {
            j0(new Q(this, (W) intent, null));
            return;
        }
        if (Intrinsics.d(intent, C3235a.f12416a)) {
            j0(new L(this, X.f12413a, null));
            Unit unit3 = Unit.f71690a;
            return;
        }
        if (Intrinsics.d(intent, b0.f12419a)) {
            j0(new T(this, null));
            return;
        }
        if (Intrinsics.d(intent, C3236b.f12418a)) {
            j0(new S(this, null));
            return;
        }
        if (Intrinsics.d(intent, C3238d.f12433a)) {
            bVar.n();
            x0Var.setValue(J.a(x0Var.getValue(), Jf0.b.o(), Jf0.b.p(), 56));
            Unit unit4 = Unit.f71690a;
        } else {
            if (!Intrinsics.d(intent, c0.f12432a)) {
                throw new Sc.o();
            }
            j0(new L(this, d0.f12434a, null));
            Unit unit5 = Unit.f71690a;
        }
    }
}
