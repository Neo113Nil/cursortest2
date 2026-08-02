package Bf0;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.C2417s0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import De.C2862e;
import Sc.InterfaceC4008j;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import qf0.EnumC9053a;
import qf0.d;
import ve.EnumC10311b;
import vf0.C10315a;
import vf0.InterfaceC10316b;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.N;
import xe.X0;
import xe.l1;
import za0.InterfaceC11014a;
import zb0.AbstractC11016a;

/* loaded from: classes7.dex */
public final class o implements InterfaceC10316b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f3758a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final wf0.a f3759b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC11016a f3760c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC11014a f3761d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2862e f3762e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ProcessLifecycleOwner f3763f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f3764g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3765h;

    /* renamed from: i, reason: collision with root package name */
    private B0 f3766i;

    /* renamed from: j, reason: collision with root package name */
    private C10315a f3767j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final x0<EnumC9053a> f3768k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final M0<EnumC9053a> f3769l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final x0<EnumC9053a> f3770m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final M0<EnumC9053a> f3771n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final x0<List<qf0.e>> f3772o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final M0<List<qf0.e>> f3773p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final C2417s0 f3774q;

    public o(a whitelistingConfigurationProvider, wf0.a domainReachability, AbstractC11016a clientCookiesInteractor, InterfaceC11014a hostConfigBaseApi) {
        ProcessLifecycleOwner lifecycleOwner;
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e coroutineScope = N.a(He.b.f10879b.plus(X0.b()));
        lifecycleOwner = ProcessLifecycleOwner.f43230i;
        Intrinsics.checkNotNullParameter(whitelistingConfigurationProvider, "whitelistingConfigurationProvider");
        Intrinsics.checkNotNullParameter(domainReachability, "domainReachability");
        Intrinsics.checkNotNullParameter(clientCookiesInteractor, "clientCookiesInteractor");
        Intrinsics.checkNotNullParameter(hostConfigBaseApi, "hostConfigBaseApi");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f3758a = whitelistingConfigurationProvider;
        this.f3759b = domainReachability;
        this.f3760c = clientCookiesInteractor;
        this.f3761d = hostConfigBaseApi;
        this.f3762e = coroutineScope;
        this.f3763f = lifecycleOwner;
        this.f3764g = Sc.k.b(n.f3757b);
        EnumC9053a enumC9053a = EnumC9053a.Unknown;
        x0<EnumC9053a> a11 = O0.a(enumC9053a);
        this.f3768k = a11;
        M0<EnumC9053a> b11 = C2399j.b(a11);
        this.f3769l = b11;
        x0<EnumC9053a> a12 = O0.a(enumC9053a);
        this.f3770m = a12;
        M0<EnumC9053a> b12 = C2399j.b(a12);
        this.f3771n = b12;
        x0<List<qf0.e>> a13 = O0.a(new ArrayList());
        this.f3772o = a13;
        this.f3773p = C2399j.b(a13);
        this.f3774q = new C2417s0(b11, b12, new i(3, null));
        C10727i.c(coroutineScope, null, null, new k(this, null), 3);
        C10727i.c(coroutineScope, null, null, new l(this, null), 3);
    }

    public static final void a(o oVar, C10315a c10315a) {
        List<String> c11 = c10315a.c();
        if (c11.isEmpty()) {
            return;
        }
        C10727i.c(oVar.f3762e, null, null, new f(oVar, c11, null), 3);
        for (String domain : c11) {
            wf0.a aVar = oVar.f3759b;
            try {
                aVar.getClass();
                Intrinsics.checkNotNullParameter(domain, "domain");
                if (aVar.b().g().j(domain)) {
                    b.Companion companion = kotlin.time.b.INSTANCE;
                    aVar.a(kotlin.time.c.g(3, EnumC10311b.SECONDS), domain);
                } else {
                    aVar.e(domain, new d(c10315a, 0), d.a.f82076c);
                }
            } catch (Exception e11) {
                oVar.s().a("Failed to start ping extra domain " + e11);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00de, code lost:
    
        if (r11.u(r13, r2, r6, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(o oVar, C10315a c10315a, kotlin.coroutines.jvm.internal.c cVar) {
        g gVar;
        Wc.a aVar;
        int i11;
        e eVar;
        String b11;
        d dVar;
        o oVar2;
        C10315a c10315a2;
        C2862e c2862e;
        oVar.getClass();
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i12 = gVar.f3733i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                gVar.f3733i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = gVar.f3731g;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = gVar.f3733i;
                if (i11 != 0) {
                    s.b(obj);
                    C10315a c10315a3 = oVar.f3767j;
                    oVar.f3767j = c10315a;
                    oVar.s().c("Обновлена конфигурация " + c10315a);
                    oVar.f3759b.b().g().l(c10315a.h());
                    B0 b02 = oVar.f3766i;
                    if (b02 != null) {
                        ((H0) b02).j(null);
                    }
                    oVar.f3766i = null;
                    boolean h11 = c10315a.h();
                    x0<EnumC9053a> x0Var = oVar.f3770m;
                    x0<EnumC9053a> x0Var2 = oVar.f3768k;
                    if (!h11) {
                        EnumC9053a enumC9053a = EnumC9053a.Unknown;
                        x0Var2.setValue(enumC9053a);
                        x0Var.setValue(enumC9053a);
                        return Unit.f71690a;
                    }
                    eVar = new e(c10315a);
                    if (!Intrinsics.d(c10315a.f(), c10315a3 != null ? c10315a3.f() : null)) {
                        x0Var2.setValue(EnumC9053a.Unknown);
                    }
                    if (!Intrinsics.d(c10315a.b(), c10315a3 != null ? c10315a3.b() : null)) {
                        x0Var.setValue(EnumC9053a.Unknown);
                    }
                    String f7 = c10315a.f();
                    d dVar2 = new d(c10315a, 2);
                    gVar.f3728d = oVar;
                    gVar.f3729e = c10315a;
                    gVar.f3730f = eVar;
                    gVar.f3733i = 1;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c10315a2 = gVar.f3729e;
                        oVar2 = gVar.f3728d;
                        s.b(obj);
                        oVar2.getClass();
                        C2408n0 c2408n0 = new C2408n0(C5427n.a(oVar2.f3759b.c(c10315a2.f(), c10315a2.b()), oVar2.f3763f.getLifecycle(), AbstractC5434v.b.STARTED), new c(c10315a2, oVar2, null));
                        c2862e = oVar2.f3762e;
                        oVar2.f3766i = C2399j.C(c2408n0, c2862e);
                        oVar2.s().c("Подписались на результаты пинга");
                        if (c10315a2.a() != 0 && !oVar2.f3765h) {
                            C10727i.c(c2862e, null, null, new j(c10315a2, oVar2, null), 3);
                        }
                        return Unit.f71690a;
                    }
                    e eVar2 = gVar.f3730f;
                    c10315a = gVar.f3729e;
                    o oVar3 = gVar.f3728d;
                    s.b(obj);
                    eVar = eVar2;
                    oVar = oVar3;
                }
                b11 = c10315a.b();
                oVar.getClass();
                dVar = new d(c10315a, 2);
                gVar.f3728d = oVar;
                gVar.f3729e = c10315a;
                gVar.f3730f = null;
                gVar.f3733i = 2;
                if (oVar.u(b11, eVar, dVar, gVar) != aVar) {
                    C10315a c10315a4 = c10315a;
                    oVar2 = oVar;
                    c10315a2 = c10315a4;
                    oVar2.getClass();
                    C2408n0 c2408n02 = new C2408n0(C5427n.a(oVar2.f3759b.c(c10315a2.f(), c10315a2.b()), oVar2.f3763f.getLifecycle(), AbstractC5434v.b.STARTED), new c(c10315a2, oVar2, null));
                    c2862e = oVar2.f3762e;
                    oVar2.f3766i = C2399j.C(c2408n02, c2862e);
                    oVar2.s().c("Подписались на результаты пинга");
                    if (c10315a2.a() != 0) {
                        C10727i.c(c2862e, null, null, new j(c10315a2, oVar2, null), 3);
                    }
                    return Unit.f71690a;
                }
                return aVar;
            }
        }
        gVar = new g(oVar, cVar);
        Object obj2 = gVar.f3731g;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = gVar.f3733i;
        if (i11 != 0) {
        }
        b11 = c10315a.b();
        oVar.getClass();
        dVar = new d(c10315a, 2);
        gVar.f3728d = oVar;
        gVar.f3729e = c10315a;
        gVar.f3730f = null;
        gVar.f3733i = 2;
        if (oVar.u(b11, eVar, dVar, gVar) != aVar) {
        }
        return aVar;
    }

    public static final void i(o oVar, boolean z11) {
        C10315a c10315a = oVar.f3767j;
        if (c10315a == null || !c10315a.h()) {
            return;
        }
        String a11 = oVar.f3761d.a();
        List m11 = kotlin.text.h.m(a11, new String[]{"."}, 0, 6);
        if (m11.size() >= 2) {
            a11 = C7714v.V(C7714v.L0(2, m11), ".", null, null, null, 62);
        }
        URI create = URI.create("https://" + a11);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        List<URI> a02 = C7714v.a0(create);
        AbstractC11016a abstractC11016a = oVar.f3760c;
        if (!z11) {
            abstractC11016a.a(a02, e0.h("x-o3-whitelisting-mode-enabled"));
            oVar.s().c("Убрали cookie x-o3-whitelisting-mode-enabled");
            return;
        }
        abstractC11016a.c(C7714v.a0(new h()), a02);
        oVar.s().c("Поставили cookie x-o3-whitelisting-mode-enabled");
        C10315a c10315a2 = oVar.f3767j;
        if (c10315a2 == null) {
            return;
        }
        oVar.s().e(c10315a2);
    }

    public static final void j(o oVar, qf0.e eVar) {
        C10315a c10315a = oVar.f3767j;
        if (c10315a == null) {
            return;
        }
        oVar.s().d(c10315a, eVar);
    }

    public static final void k(o oVar, qf0.e result) {
        C10315a configuration = oVar.f3767j;
        if (configuration == null) {
            return;
        }
        b s11 = oVar.s();
        s11.getClass();
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(result, "result");
        if (configuration.j()) {
            s11.d(configuration, result);
        }
    }

    public static final void l(o oVar, qf0.e result) {
        C10315a configuration = oVar.f3767j;
        if (configuration == null) {
            return;
        }
        b s11 = oVar.s();
        s11.getClass();
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(result, "result");
        if (configuration.l()) {
            s11.d(configuration, result);
        }
    }

    public static final void o(o oVar, qf0.e eVar) {
        List<qf0.e> value;
        ArrayList arrayList;
        x0<List<qf0.e>> x0Var = oVar.f3772o;
        do {
            value = x0Var.getValue();
            arrayList = new ArrayList();
            for (Object obj : value) {
                if (!Intrinsics.d(((qf0.e) obj).a(), eVar.a())) {
                    arrayList.add(obj);
                }
            }
        } while (!x0Var.b(value, C7714v.q0(eVar, arrayList)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b s() {
        return (b) this.f3764g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r7v3, types: [rf0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(String str, d.b bVar, d dVar, kotlin.coroutines.jvm.internal.c cVar) {
        m mVar;
        int i11;
        o oVar;
        d dVar2;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i12 = mVar.f3756j;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                mVar.f3756j = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = mVar.f3754h;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = mVar.f3756j;
                if (i11 != 0) {
                    s.b(obj);
                    try {
                        mVar.f3750d = this;
                        mVar.f3751e = str;
                        mVar.f3752f = bVar;
                        mVar.f3753g = dVar;
                        mVar.f3756j = 1;
                        if (l1.a(mVar) == aVar) {
                            return aVar;
                        }
                        oVar = this;
                        dVar2 = dVar;
                    } catch (Throwable th2) {
                        th = th2;
                        oVar = this;
                        oVar.s().a("Failed to start ping for domain " + str + ": " + th.getMessage());
                        return Unit.f71690a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r72 = mVar.f3753g;
                    bVar = mVar.f3752f;
                    str = mVar.f3751e;
                    oVar = mVar.f3750d;
                    try {
                        s.b(obj);
                        dVar2 = r72;
                    } catch (Throwable th3) {
                        th = th3;
                        oVar.s().a("Failed to start ping for domain " + str + ": " + th.getMessage());
                        return Unit.f71690a;
                    }
                }
                oVar.f3759b.e(str, dVar2, bVar);
                return Unit.f71690a;
            }
        }
        mVar = new m(this, cVar);
        Object obj2 = mVar.f3754h;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = mVar.f3756j;
        if (i11 != 0) {
        }
        oVar.f3759b.e(str, dVar2, bVar);
        return Unit.f71690a;
    }

    @NotNull
    public final M0<List<qf0.e>> p() {
        return this.f3773p;
    }

    @NotNull
    public final M0<EnumC9053a> q() {
        return this.f3771n;
    }

    @NotNull
    public final M0<EnumC9053a> r() {
        return this.f3769l;
    }

    @NotNull
    public final C2417s0 t() {
        return this.f3774q;
    }
}
