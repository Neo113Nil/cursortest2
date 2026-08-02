package Jf0;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.x0;
import Gf0.F;
import Gf0.G;
import Jf0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qf0.EnumC9053a;
import wf0.a;
import xe.B0;
import xe.C10727i;
import xe.M;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final a f14715g = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Jf0.a f14716a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ProcessLifecycleOwner f14717b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Ld0.c f14718c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f14719d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f14720e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f14721f;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        public static final Lf0.b a(a aVar, Lf0.f fVar, wf0.b bVar) {
            return new Lf0.b(new Lf0.a(10, fVar.a(), bVar != null ? Integer.valueOf(bVar.getInternalDomainsLimit$ozon_network_release()) : null), new Lf0.a(2, fVar.b(), bVar != null ? Integer.valueOf(bVar.getInternalParallelPingLimit$ozon_network_release()) : null));
        }

        public static final Map b(a aVar, Map map, Lf0.c cVar) {
            Intrinsics.checkNotNullParameter(map, "<this>");
            return U.n(map, new Pair(cVar.b(), cVar));
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.domainReachability.data.DomainReachabilityRepository$createDebugMenuConfigParams$savedParams$1", f = "DomainReachabilityRepository.kt", l = {159}, m = "invokeSuspend")
    /* renamed from: Jf0.b$b, reason: collision with other inner class name */
    static final class C0276b extends j implements Function2<M, kotlin.coroutines.d<? super Lf0.f>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f14722d;

        C0276b(kotlin.coroutines.d<? super C0276b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return b.this.new C0276b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Lf0.f> dVar) {
            return ((C0276b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f14722d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            a.d d11 = b.this.f14716a.d();
            this.f14722d = 1;
            Object u11 = C2399j.u(d11, this);
            return u11 == aVar ? aVar : u11;
        }
    }

    /* loaded from: classes3.dex */
    /* synthetic */ class c extends C7719a implements Function2<qf0.e, kotlin.coroutines.d<? super Unit>, Object> {
        c(b bVar) {
            super(2, bVar, b.class, "onDomainPingResultChanged", "onDomainPingResultChanged(Lru/ozon/network/api/domainReachability/PingResult;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qf0.e eVar, kotlin.coroutines.d<? super Unit> dVar) {
            return b.g((b) this.receiver, eVar);
        }
    }

    public b(@NotNull Jf0.a configDataSource, @NotNull ProcessLifecycleOwner lifecycleOwner, @NotNull Ld0.c store) {
        Intrinsics.checkNotNullParameter(configDataSource, "configDataSource");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(store, "store");
        this.f14716a = configDataSource;
        this.f14717b = lifecycleOwner;
        this.f14718c = store;
        this.f14719d = k.b(new Jf0.c(this));
        this.f14720e = k.b(new h(this));
        this.f14721f = k.b(new f(this));
    }

    public static final Lf0.c a(b bVar, wf0.a aVar, String str, EnumC9053a enumC9053a) {
        bVar.getClass();
        return new Lf0.c(str, null, null, Long.valueOf(System.currentTimeMillis()), enumC9053a, bVar.q(aVar, str));
    }

    public static final x0 f(b bVar) {
        return (x0) bVar.f14719d.getValue();
    }

    public static final Unit g(b bVar, qf0.e eVar) {
        Lf0.c cVar = bVar.m().get(eVar.a());
        if (cVar != null) {
            ((x0) bVar.f14719d.getValue()).setValue(a.b(f14715g, bVar.m(), Lf0.c.a(cVar, Long.valueOf(System.currentTimeMillis()), eVar.c(), null, 39)));
        }
        return Unit.f71690a;
    }

    private final Map<String, Lf0.c> m() {
        return (Map) ((x0) this.f14719d.getValue()).getValue();
    }

    public static boolean o() {
        a.C2259a c2259a = wf0.a.f104498b;
        wf0.a b11 = wf0.c.b();
        if (b11 != null) {
            return b11.b().g().g();
        }
        Intrinsics.checkNotNullParameter(c2259a, "<this>");
        return false;
    }

    public static boolean p() {
        wf0.a b11 = wf0.c.b();
        if (b11 != null) {
            return b11.b().h().a();
        }
        return true;
    }

    private final B0 q(wf0.a aVar, String str) {
        InterfaceC2395h<qf0.e> c11 = aVar.c(str);
        ProcessLifecycleOwner processLifecycleOwner = this.f14717b;
        return C2399j.C(new C2408n0(C5427n.a(c11, processLifecycleOwner.getLifecycle(), AbstractC5434v.b.STARTED), new c(this)), K.a(processLifecycleOwner));
    }

    public final void h(@NotNull String domain, @NotNull F pingConfig, @NotNull G pingMode) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(pingConfig, "pingConfig");
        Intrinsics.checkNotNullParameter(pingMode, "pingMode");
        wf0.a b11 = wf0.c.b();
        if (b11 == null) {
            return;
        }
        b11.e(domain, pingConfig, pingMode);
        ((x0) this.f14719d.getValue()).setValue(a.b(f14715g, m(), new Lf0.c(domain, pingConfig, pingMode, null, EnumC9053a.Unknown, q(b11, domain))));
    }

    public final Object i(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object c11 = this.f14716a.c(dVar);
        return c11 == Wc.a.COROUTINE_SUSPENDED ? c11 : Unit.f71690a;
    }

    @NotNull
    public final Lf0.b j(@NotNull wf0.b hostConfig) {
        Intrinsics.checkNotNullParameter(hostConfig, "hostConfig");
        return a.a(f14715g, (Lf0.f) C10727i.d(kotlin.coroutines.g.f71771a, new C0276b(null)), hostConfig);
    }

    @NotNull
    public final M0<Lf0.b> k() {
        return (M0) this.f14721f.getValue();
    }

    @NotNull
    public final InterfaceC2395h<Collection<Lf0.c>> l() {
        return (InterfaceC2395h) this.f14720e.getValue();
    }

    public final void n() {
        wf0.c.c(new i(this, k().getValue()));
    }

    public final void r(@NotNull String domain) {
        B0 e11;
        Intrinsics.checkNotNullParameter(domain, "domain");
        Lf0.c cVar = m().get(domain);
        if (cVar == null || (e11 = cVar.e()) == null) {
            return;
        }
        e11.j(null);
        ((x0) this.f14719d.getValue()).setValue(a.b(f14715g, m(), Lf0.c.a(cVar, null, null, null, 31)));
    }

    public final void s(@NotNull String domain) {
        Lf0.c cVar;
        Intrinsics.checkNotNullParameter(domain, "domain");
        wf0.a b11 = wf0.c.b();
        if (b11 == null || (cVar = m().get(domain)) == null) {
            return;
        }
        B0 e11 = cVar.e();
        if (e11 == null || !e11.isActive()) {
            ((x0) this.f14719d.getValue()).setValue(a.b(f14715g, m(), Lf0.c.a(cVar, null, null, q(b11, domain), 31)));
        }
    }

    public final Object t(int i11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object e11 = this.f14716a.e(i11, dVar);
        return e11 == Wc.a.COROUTINE_SUSPENDED ? e11 : Unit.f71690a;
    }

    public final Object u(int i11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object f7 = this.f14716a.f(i11, dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
