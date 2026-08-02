package Fb0;

import Kb0.K;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.C10727i;
import xe.M;
import xe.U;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.core.OzonIdInitializerKt$initCookies$2$1", f = "OzonIdInitializer.kt", l = {136, 137}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class n extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Boolean>, Object> {

    /* renamed from: d, reason: collision with root package name */
    long f9282d;

    /* renamed from: e, reason: collision with root package name */
    int f9283e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f9284f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ K f9285g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.core.OzonIdInitializerKt$initCookies$2$1$initUserDataDeferred$1", f = "OzonIdInitializer.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Long>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ K f9286d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(K k11, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f9286d = k11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f9286d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Long> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            long currentTimeMillis = System.currentTimeMillis();
            this.f9286d.t().j().getValue().j();
            return new Long(System.currentTimeMillis() - currentTimeMillis);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.core.OzonIdInitializerKt$initCookies$2$1$setRequiredCookiesDeferred$1", f = "OzonIdInitializer.kt", l = {133}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Long>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f9287d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ K f9288e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(K k11, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f9288e = k11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f9288e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Long> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f9287d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            this.f9287d = 1;
            Object f7 = o.f(this.f9288e, this);
            return f7 == aVar ? aVar : f7;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(K k11, kotlin.coroutines.d<? super n> dVar) {
        super(2, dVar);
        this.f9285g = k11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        n nVar = new n(this.f9285g, dVar);
        nVar.f9284f = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Boolean> dVar) {
        return ((n) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        U u11;
        long j11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f9283e;
        if (i11 == 0) {
            Sc.s.b(obj);
            M m11 = (M) this.f9284f;
            K k11 = this.f9285g;
            U a11 = C10727i.a(m11, null, null, new a(k11, null), 3);
            U a12 = C10727i.a(m11, null, null, new b(k11, null), 3);
            this.f9284f = a12;
            this.f9283e = 1;
            Object s11 = a11.s(this);
            if (s11 != aVar) {
                u11 = a12;
                obj = s11;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = this.f9282d;
            Sc.s.b(obj);
            return Boolean.valueOf(o.f9291c.complete(new g(j11, ((Number) obj).longValue())));
        }
        u11 = (U) this.f9284f;
        Sc.s.b(obj);
        long longValue = ((Number) obj).longValue();
        this.f9284f = null;
        this.f9282d = longValue;
        this.f9283e = 2;
        obj = u11.s(this);
        if (obj != aVar) {
            j11 = longValue;
            return Boolean.valueOf(o.f9291c.complete(new g(j11, ((Number) obj).longValue())));
        }
        return aVar;
    }
}
