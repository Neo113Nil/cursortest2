package F4;

import F4.AbstractC3028h;
import F4.F;
import F4.M;
import F4.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.C10749t0;
import xe.H0;

/* renamed from: F4.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3040u<Key, Value> extends androidx.lifecycle.P<F<Value>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10749t0 f8955a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final F.c f8956b;

    /* renamed from: c, reason: collision with root package name */
    private final F.a<Value> f8957c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final U f8958d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final xe.I f8959e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final xe.I f8960f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private F<Value> f8961g;

    /* renamed from: h, reason: collision with root package name */
    private B0 f8962h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f8963i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Runnable f8964j;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.paging.LivePagedList$invalidate$1", f = "LivePagedList.kt", l = {82, 90}, m = "invokeSuspend")
    /* renamed from: F4.u$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        M f8965d;

        /* renamed from: e, reason: collision with root package name */
        Object f8966e;

        /* renamed from: f, reason: collision with root package name */
        int f8967f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C3040u<Key, Value> f8968g;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.paging.LivePagedList$invalidate$1$1", f = "LivePagedList.kt", l = {}, m = "invokeSuspend")
        /* renamed from: F4.u$a$a, reason: collision with other inner class name */
        static final class C0189a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3040u<Key, Value> f8969d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0189a(C3040u<Key, Value> c3040u, kotlin.coroutines.d<? super C0189a> dVar) {
                super(2, dVar);
                this.f8969d = c3040u;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new C0189a(this.f8969d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0189a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                ((C3040u) this.f8969d).f8961g.B(y.REFRESH, x.b.f8976b);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3040u<Key, Value> c3040u, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f8968g = c3040u;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f8968g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        
            if (xe.C10727i.f(r7, r8, r16) == r1) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00a5  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            M m11;
            Object d11;
            Object obj2;
            M.b bVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f8967f;
            C3040u<Key, Value> c3040u = this.f8968g;
            if (i11 == 0) {
                Sc.s.b(obj);
                ((C3040u) c3040u).f8961g.m().f(((C3040u) c3040u).f8963i);
                m11 = (M) ((U) ((C3040u) c3040u).f8958d).invoke();
                m11.e(((C3040u) c3040u).f8963i);
                if (m11 instanceof C3037q) {
                    ((C3037q) m11).h(((C3040u) c3040u).f8956b.f8788a);
                }
                xe.I i12 = ((C3040u) c3040u).f8959e;
                C0189a c0189a = new C0189a(c3040u, null);
                this.f8965d = m11;
                this.f8967f = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = this.f8966e;
                    m11 = this.f8965d;
                    Sc.s.b(obj);
                    d11 = obj;
                    obj2 = obj3;
                    M pagingSource = m11;
                    bVar = (M.b) d11;
                    if (!(bVar instanceof M.b.a)) {
                        F unused = ((C3040u) c3040u).f8961g;
                        ((M.b.a) bVar).getClass();
                        new x.a();
                        throw null;
                    }
                    if (bVar instanceof M.b.C0187b) {
                        int i13 = F.f8778j;
                        M.b.C0187b c0187b = (M.b.C0187b) bVar;
                        xe.M coroutineScope = ((C3040u) c3040u).f8955a;
                        xe.I notifyDispatcher = ((C3040u) c3040u).f8959e;
                        xe.I fetchDispatcher = ((C3040u) c3040u).f8960f;
                        F.a aVar2 = ((C3040u) c3040u).f8957c;
                        F.c config = ((C3040u) c3040u).f8956b;
                        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
                        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
                        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
                        Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
                        Intrinsics.checkNotNullParameter(config, "config");
                        if (c0187b == null) {
                            c0187b = (M.b.C0187b) C10727i.d(kotlin.coroutines.g.f71771a, new G(pagingSource, new M.a.c(config.f8790c, config.f8791d, obj2), null));
                        }
                        C3027g c3027g = new C3027g(pagingSource, coroutineScope, notifyDispatcher, fetchDispatcher, aVar2, config, c0187b, obj2);
                        C3040u.j(c3040u, ((C3040u) c3040u).f8961g, c3027g);
                        ((C3040u) c3040u).f8961g = c3027g;
                        c3040u.postValue(c3027g);
                    }
                    return Unit.f71690a;
                }
                m11 = this.f8965d;
                Sc.s.b(obj);
            }
            Object i14 = ((C3040u) c3040u).f8961g.i();
            F.c cVar = ((C3040u) c3040u).f8956b;
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            M.a.c cVar2 = new M.a.c(cVar.f8790c, cVar.f8791d, i14);
            this.f8965d = m11;
            this.f8966e = i14;
            this.f8967f = 2;
            d11 = m11.d(cVar2, this);
            if (d11 != aVar) {
                obj2 = i14;
                M pagingSource2 = m11;
                bVar = (M.b) d11;
                if (!(bVar instanceof M.b.a)) {
                }
            }
            return aVar;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3040u(@NotNull F.c config, F.a aVar, @NotNull U pagingSourceFactory, @NotNull xe.I notifyDispatcher, @NotNull xe.I backgroundDispatcher) {
        super(new C3032l(r1, coroutineScope, notifyDispatcher, backgroundDispatcher, null, config, r7, null));
        M.b.C0187b c0187b;
        C10749t0 coroutineScope = C10749t0.f105499a;
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "fetchDispatcher");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(config, "config");
        C3037q c3037q = new C3037q(notifyDispatcher, new C3031k(AbstractC3028h.d.PAGE_KEYED));
        c0187b = M.b.C0187b.f8827f;
        this.f8955a = coroutineScope;
        this.f8956b = config;
        this.f8957c = aVar;
        this.f8958d = pagingSourceFactory;
        this.f8959e = notifyDispatcher;
        this.f8960f = backgroundDispatcher;
        this.f8963i = new C3039t(this);
        v vVar = new v(this);
        this.f8964j = vVar;
        F<Value> value = getValue();
        Intrinsics.f(value);
        Intrinsics.checkNotNullExpressionValue(value, "value!!");
        F<Value> f7 = value;
        this.f8961g = f7;
        f7.C(vVar);
    }

    public static final void j(C3040u c3040u, F f7, C3027g c3027g) {
        c3040u.getClass();
        f7.C(null);
        c3027g.C(c3040u.f8964j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(boolean z11) {
        B0 b02 = this.f8962h;
        if (b02 == null || z11) {
            if (b02 != null) {
                ((H0) b02).j(null);
            }
            this.f8962h = C10727i.c(this.f8955a, this.f8960f, null, new a(this, null), 2);
        }
    }

    @Override // androidx.lifecycle.P
    protected final void onActive() {
        super.onActive();
        m(false);
    }
}
