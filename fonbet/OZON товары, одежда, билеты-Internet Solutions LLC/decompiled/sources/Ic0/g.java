package Ic0;

import Hb0.f;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import Sc.s;
import We.B;
import We.G;
import We.L;
import android.os.ConditionVariable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import dc0.C6144H;
import dc0.C6154S;
import dc0.C6171q;
import dc0.C6178x;
import hd0.C6918a;
import hd0.n;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.sso2.t;
import ru.ozon.id.nativeauth.sso2.u;
import ru.ozon.id.nativeauth.sso2.v;
import xe.C10727i;
import xe.M;

/* loaded from: classes7.dex */
public final class g extends Db0.h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Ic0.d> f12212a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<v> f12213b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6144H> f12214c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6178x> f12215d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f12216e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f12217f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f12218g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f12219h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.initAuth.InitSessionInterceptor$initSession$1", f = "InitSessionInterceptor.kt", l = {117}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f12220d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f12222f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f12223g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z11, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f12222f = str;
            this.f12223g = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new a(this.f12222f, this.f12223g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f12220d;
            if (i11 == 0) {
                s.b(obj);
                Ic0.d dVar = (Ic0.d) g.this.f12212a.getValue();
                this.f12220d = 1;
                if (dVar.e(this.f12222f, this.f12223g, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function0<AtomicBoolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f12224b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final AtomicBoolean invoke() {
            return new AtomicBoolean(false);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.initAuth.InitSessionInterceptor$onLogoutResponse$result$1", f = "InitSessionInterceptor.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super u>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f12225d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f12227f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f12227f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return g.this.new c(this.f12227f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super u> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f12225d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            v vVar = (v) g.this.f12213b.getValue();
            t.c.b bVar = new t.c.b(this.f12227f);
            this.f12225d = 1;
            Object l11 = vVar.l(bVar, this);
            return l11 == aVar ? aVar : l11;
        }
    }

    static final class d extends AbstractC7737t implements Function0<ConditionVariable> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f12228b = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final ConditionVariable invoke() {
            return new ConditionVariable(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull InterfaceC4008j<Ic0.d> initAuthUseCase, @NotNull InterfaceC4008j<v> sso2ReauthorizeHandler, @NotNull InterfaceC4008j<C6144H> localCookieDataSource, @NotNull InterfaceC4008j<C6178x> currentUserRepository, @NotNull InterfaceC4008j<? extends Hb0.c> featureFlagsStore) {
        Intrinsics.checkNotNullParameter(initAuthUseCase, "initAuthUseCase");
        Intrinsics.checkNotNullParameter(sso2ReauthorizeHandler, "sso2ReauthorizeHandler");
        Intrinsics.checkNotNullParameter(localCookieDataSource, "localCookieDataSource");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        this.f12212a = initAuthUseCase;
        this.f12213b = sso2ReauthorizeHandler;
        this.f12214c = localCookieDataSource;
        this.f12215d = currentUserRepository;
        this.f12216e = featureFlagsStore;
        this.f12218g = k.b(b.f12224b);
        this.f12219h = k.b(d.f12228b);
    }

    private final void d(B.a aVar, String str, boolean z11) {
        td0.k.a(aVar);
        ((ConditionVariable) this.f12219h.getValue()).close();
        if (!((AtomicBoolean) this.f12218g.getValue()).compareAndSet(false, true)) {
            ((ConditionVariable) this.f12219h.getValue()).block();
            return;
        }
        if (z11) {
            try {
                Long n11 = C6171q.n(this.f12214c.getValue().i());
                if (n11 != null && n11.longValue() == 0) {
                    return;
                }
            } finally {
                this.f12217f = true;
                ((AtomicBoolean) this.f12218g.getValue()).set(false);
                ((ConditionVariable) this.f12219h.getValue()).open();
            }
        }
        C10727i.d(kotlin.coroutines.g.f71771a, new a(str, z11, null));
    }

    @Override // Db0.h
    @NotNull
    public final L a(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!this.f12217f) {
            G request = chain.request();
            Intrinsics.checkNotNullParameter(request, "<this>");
            if (request.i(j.class) == null) {
                C6154S b11 = this.f12215d.getValue().b();
                boolean booleanValue = ((Boolean) this.f12216e.getValue().b(f.o.f10813a)).booleanValue();
                if ((booleanValue || b11.f() != null) && !(booleanValue && b11.g() == null)) {
                    this.f12217f = true;
                } else {
                    d(chain, null, false);
                }
            }
        }
        L proceed = chain.proceed(chain.request());
        Intrinsics.checkNotNullParameter(proceed, "<this>");
        return (proceed.m() != 401 || proceed.s("x-o3-gdecision").isEmpty()) ? proceed : e(proceed, chain);
    }

    @NotNull
    public final L e(@NotNull L response, @NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (((Boolean) this.f12216e.getValue().b(f.o.f10813a)).booleanValue()) {
            G L11 = response.L();
            Intrinsics.checkNotNullParameter(L11, "<this>");
            if (!n.b(L11.j().toString())) {
                td0.k.a(chain);
                Ye.b.e(response);
                u uVar = (u) C10727i.d(kotlin.coroutines.g.f71771a, new c(response.L().j().h(), null));
                if ((uVar instanceof u.b) || (uVar instanceof u.d)) {
                    return chain.proceed(chain.request());
                }
                if (uVar instanceof u.c) {
                    throw new C6918a();
                }
                if (uVar instanceof u.a) {
                    throw ((u.a) uVar).b();
                }
                throw new o();
            }
        }
        d(chain, response.r().c("x-o3-trace-id"), true);
        return response;
    }
}
