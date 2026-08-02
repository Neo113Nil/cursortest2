package Ra;

import B0.A0;
import Ja.i;
import Ja.j;
import Oa.C3677a;
import Oa.d;
import Qa.AbstractC3855a;
import Sa.C3998a;
import Sc.C4001c;
import Sc.InterfaceC4008j;
import Ua.C4057a;
import android.content.Context;
import com.vk.knet.cornet.b;
import java.io.File;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.D;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Qa.b f24904a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ta.a f24905b;

    /* renamed from: c, reason: collision with root package name */
    private final C3932a f24906c;

    /* renamed from: d, reason: collision with root package name */
    private final Wa.c f24907d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f24908e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Long, g> f24909f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C3677a f24910g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Va.d f24911h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Xa.a f24912i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final e f24913j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f24914k;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Context f24915a;

        /* renamed from: b, reason: collision with root package name */
        private Qa.c f24916b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private AbstractC3855a f24917c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private d.a f24918d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f24919e;

        /* renamed from: f, reason: collision with root package name */
        private long f24920f;

        /* renamed from: g, reason: collision with root package name */
        private long f24921g;

        /* renamed from: h, reason: collision with root package name */
        private long f24922h;

        /* renamed from: i, reason: collision with root package name */
        private int f24923i;

        /* renamed from: j, reason: collision with root package name */
        private int f24924j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f24925k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f24926l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f24927m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f24928n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f24929o;

        /* renamed from: p, reason: collision with root package name */
        private String f24930p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f24931q;

        /* renamed from: r, reason: collision with root package name */
        @NotNull
        private final ArrayList f24932r;

        /* renamed from: s, reason: collision with root package name */
        @NotNull
        private final ArrayList f24933s;

        public a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f24915a = context;
            this.f24917c = AbstractC3855a.b.f23183a;
            this.f24918d = new d.a(new File(context.getFilesDir() + "/cronet_netlog"));
            this.f24919e = true;
            this.f24920f = 30000L;
            this.f24921g = 30000L;
            this.f24922h = 30000L;
            this.f24923i = 64;
            this.f24924j = 16;
            this.f24925k = true;
            this.f24926l = true;
            this.f24927m = true;
            this.f24928n = true;
            this.f24932r = new ArrayList();
            this.f24933s = new ArrayList();
        }

        public static void a(a this$0, Ma.b metric, i request, Ma.d dVar) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(metric, "metric");
            Intrinsics.checkNotNullParameter(request, "request");
            Iterator it = this$0.f24932r.iterator();
            while (it.hasNext()) {
                ((Ma.c) it.next()).onMetricsCollected(metric, request, dVar);
            }
        }

        @NotNull
        public final void b(@NotNull Ma.c metric) {
            Intrinsics.checkNotNullParameter(metric, "metric");
            this.f24932r.add(metric);
        }

        @NotNull
        public final void c() {
            this.f24925k = false;
        }

        @NotNull
        public final b d() {
            InterfaceC4008j interfaceC4008j;
            Na.a aVar;
            Qa.c cVar = this.f24916b;
            boolean z11 = this.f24919e;
            boolean z12 = this.f24929o;
            long j11 = this.f24920f;
            long j12 = this.f24922h;
            Qa.b bVar = new Qa.b(cVar, z11, z12, j11, this.f24921g, j12, this.f24923i, this.f24924j, this.f24925k, this.f24926l, this.f24927m, this.f24928n, this.f24930p, this.f24931q);
            com.vk.knet.cornet.a aVar2 = new com.vk.knet.cornet.a(this.f24915a);
            if (bVar.i()) {
                aVar2.d();
            }
            if (bVar.j()) {
                aVar2.e();
            }
            Qa.c g10 = bVar.g();
            if (g10 != null) {
                aVar2.f(g10);
            }
            if (bVar.l()) {
                aVar2.b();
            }
            String str = this.f24930p;
            if (str != null) {
                aVar2.g(str);
            }
            aVar2.c(this.f24917c);
            org.chromium.net.i engine = aVar2.a();
            interfaceC4008j = C4057a.f27475c;
            C4057a c4057a = (C4057a) interfaceC4008j.getValue();
            aVar = Na.a.f18884c;
            d.a config = this.f24918d;
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(engine, "engine");
            Oa.d dVar = new Oa.d();
            config.getClass();
            Ta.a aVar3 = new Ta.a(c4057a, aVar);
            Wa.c cVar2 = null;
            C3932a c3932a = this.f24932r.isEmpty() ? null : new C3932a(this);
            ArrayList arrayList = this.f24933s;
            if (!arrayList.isEmpty()) {
                Na.b[] bVarArr = (Na.b[]) arrayList.toArray(new Na.b[0]);
                cVar2 = new Wa.c((Na.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
            }
            return new b(engine, bVar, aVar3, dVar, c3932a, cVar2);
        }

        @NotNull
        public final void e() {
            TimeUnit unit = TimeUnit.DAYS;
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f24920f = unit.toMillis(1L);
        }

        @NotNull
        public final void f() {
            this.f24919e = true;
        }

        @NotNull
        public final void g(@NotNull Qa.c options) {
            Intrinsics.checkNotNullParameter(options, "options");
            this.f24916b = options;
        }

        @NotNull
        public final void h(int i11) {
            this.f24923i = i11;
        }

        @NotNull
        public final void i(int i11) {
            this.f24924j = i11;
        }

        public final void j(boolean z11) {
            this.f24931q = z11;
        }

        @NotNull
        public final void k() {
            TimeUnit unit = TimeUnit.DAYS;
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f24921g = unit.toMillis(1L);
        }

        @NotNull
        public final void l(@NotNull AbstractC3855a.C0457a options) {
            Intrinsics.checkNotNullParameter(options, "options");
            this.f24917c = options;
        }

        public final void m() {
            this.f24929o = true;
        }

        public final void n(@NotNull String userAgent) {
            Intrinsics.checkNotNullParameter(userAgent, "userAgent");
            this.f24930p = userAgent;
        }

        @NotNull
        public final void o() {
            TimeUnit unit = TimeUnit.DAYS;
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f24922h = unit.toMillis(1L);
        }
    }

    public b(@NotNull org.chromium.net.i engine, @NotNull Qa.b config, @NotNull Ta.a pools, @NotNull Oa.d netlog, C3932a c3932a, Wa.c cVar) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pools, "pools");
        Intrinsics.checkNotNullParameter(netlog, "netlog");
        this.f24904a = config;
        this.f24905b = pools;
        this.f24906c = c3932a;
        this.f24907d = cVar;
        this.f24908e = new AtomicBoolean(false);
        this.f24909f = new ConcurrentHashMap<>();
        this.f24910g = new C3677a(config.e(), config.f());
        this.f24911h = new Va.d(config.e());
        this.f24912i = new Xa.a(config.c(), config.d(), config.a());
        this.f24913j = new e(engine);
        this.f24914k = !config.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(i iVar, Va.a aVar) {
        boolean z11;
        long f7 = iVar.f();
        synchronized (this) {
            z11 = this.f24909f.remove(Long.valueOf(f7)) != null;
        }
        if (z11) {
            this.f24910g.a(iVar.j());
            this.f24911h.d(aVar);
            Wa.c cVar = this.f24907d;
            if (cVar != null) {
                cVar.k(iVar);
            }
        }
    }

    private static String g(String str, Map map) {
        String V11;
        List list = (List) map.get(str);
        if (list != null && (V11 = C7714v.V(list, null, null, null, null, 63)) != null) {
            return V11;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        List list2 = (List) map.get(lowerCase);
        if (list2 != null) {
            return C7714v.V(list2, null, null, null, null, 63);
        }
        return null;
    }

    private final j h(i iVar) {
        Qa.b bVar;
        boolean z11 = this.f24914k;
        Qa.b bVar2 = this.f24904a;
        Ta.a aVar = this.f24905b;
        C4057a b11 = aVar.b();
        b11.getClass();
        Wa.a aVar2 = new Wa.a(b11);
        Va.d dVar = this.f24911h;
        Va.a c11 = dVar.c();
        try {
            bVar = bVar2;
            try {
                g gVar = new g(new c(this, iVar, c11, aVar2), this.f24912i, this.f24906c, this.f24913j);
                Wa.c cVar = this.f24907d;
                if (cVar != null) {
                    cVar.f(iVar);
                }
                try {
                    gVar.p(iVar, c11);
                    if (cVar != null) {
                        cVar.j(iVar);
                    }
                    try {
                        i(iVar, gVar);
                        if (cVar != null) {
                            cVar.d(iVar);
                        }
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (cVar != null) {
                                cVar.h(iVar);
                            }
                            gVar.q();
                            aVar2.c();
                            gVar.j(iVar, bVar.b());
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            if (cVar != null) {
                                cVar.e(iVar, currentTimeMillis2);
                            }
                            Wa.e.a(b.a.CLIENT_TIMEOUTS, "[cronet] Connection time  " + currentTimeMillis2 + " ms to " + iVar.k());
                            try {
                                D k11 = gVar.k();
                                if (cVar != null) {
                                    cVar.l(iVar);
                                }
                                Wa.b bVar3 = new Wa.b(new d(gVar, aVar2.c(), this));
                                Map<String, List<String>> a11 = k11.a();
                                Intrinsics.f(a11);
                                g("Content-Type", a11);
                                String g10 = g("Content-Length", a11);
                                Long y02 = g10 != null ? kotlin.text.h.y0(g10) : null;
                                String d11 = k11.d();
                                Intrinsics.checkNotNullExpressionValue(d11, "getNegotiatedProtocol(...)");
                                Ja.h b12 = C3998a.b(d11);
                                String g11 = k11.g();
                                Intrinsics.checkNotNullExpressionValue(g11, "getUrl(...)");
                                int b13 = k11.b();
                                String c12 = k11.c();
                                Intrinsics.checkNotNullExpressionValue(c12, "getHttpStatusText(...)");
                                Na.a a12 = aVar.a();
                                a12.getClass();
                                j jVar = new j(b12, g11, b13, c12, a11, new La.a(bVar3, new Na.c(a12), y02));
                                if (bVar.k()) {
                                    e(iVar, c11);
                                }
                                return jVar;
                            } catch (Throwable th2) {
                                if (cVar != null) {
                                    cVar.i(iVar, th2);
                                }
                                Wa.e.b("Cronet", "[cronet] Error while await of " + iVar.k() + " response!");
                                gVar.n();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            Wa.e.b("Cronet", "[cronet] Error while await of " + iVar.k() + " connection!");
                            if (cVar != null) {
                                cVar.g(iVar, th3);
                            }
                            gVar.n();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        Wa.e.b("Cronet", "[cronet] Error while start session " + iVar.k() + "!");
                        if (cVar != null) {
                            cVar.b(iVar, th4);
                        }
                        if (z11) {
                            e(iVar, c11);
                        }
                        throw th4;
                    }
                } catch (Throwable th5) {
                    Wa.e.b("Cronet", "[cronet] Error while create request " + iVar.k() + "!");
                    if (z11) {
                        dVar.d(c11);
                    }
                    if (cVar != null) {
                        cVar.a(iVar, th5);
                    }
                    throw th5;
                }
            } catch (Throwable th6) {
                th = th6;
                if (bVar.k()) {
                    e(iVar, c11);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            bVar = bVar2;
        }
    }

    private final void i(i iVar, g gVar) {
        long f7 = iVar.f();
        synchronized (this) {
            if (this.f24908e.get()) {
                gVar.n();
            } else {
                this.f24909f.put(Long.valueOf(f7), gVar);
            }
        }
        Wa.c cVar = this.f24907d;
        if (cVar != null) {
            cVar.c(iVar);
        }
        try {
            this.f24910g.b(iVar.j());
        } catch (InterruptedException e11) {
            Wa.e.b("Cronet", A0.b("[cronet] Error while acquire async session ", iVar.k(), "!"));
            InterruptedException interruptedException = new InterruptedException(A0.b("Request acquire interrupted for host - ", iVar.j().b(), "!"));
            C4001c.a(interruptedException, e11);
            throw interruptedException;
        }
    }

    public final void d(@NotNull i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        g gVar = this.f24909f.get(Long.valueOf(request.f()));
        if (gVar != null) {
            gVar.o(new SocketTimeoutException());
        }
    }

    @NotNull
    public final j f(@NotNull i request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            return h(request);
        } finally {
        }
    }
}
