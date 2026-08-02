package Kb0;

import Sc.InterfaceC4008j;
import Vb0.b;
import We.InterfaceC4875q;
import android.webkit.CookieManager;
import dc0.C6144H;
import dc0.C6147K;
import dc0.C6152P;
import dc0.C6160f;
import dc0.C6167m;
import dc0.C6170p;
import dc0.C6178x;
import java.net.CookieHandler;
import java.net.URI;
import jc0.C7338a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceInfoManager;

/* renamed from: Kb0.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3460i {

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<CookieManager> f15647m = Sc.k.b(a.f15661b);

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<jd0.v> f15648n = Sc.k.b(b.f15662b);

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Tc.j f15649a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Cb0.f> f15650b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InterfaceC4875q> f15651c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7338a> f15652d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6147K> f15653e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6144H> f15654f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<jd0.r> f15655g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6170p> f15656h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6160f> f15657i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Cb0.e> f15658j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6152P> f15659k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6178x> f15660l;

    /* renamed from: Kb0.i$a */
    static final class a extends AbstractC7737t implements Function0<CookieManager> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f15661b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final CookieManager invoke() {
            try {
                return CookieManager.getInstance();
            } catch (Throwable th2) {
                b.a.c(Vb0.b.f28514a, th2);
                return null;
            }
        }
    }

    /* renamed from: Kb0.i$b */
    static final class b extends AbstractC7737t implements Function0<jd0.v> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f15662b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final jd0.v invoke() {
            return new jd0.v(C3460i.f15647m);
        }
    }

    /* renamed from: Kb0.i$c */
    static final class c extends AbstractC7737t implements Function0<C6160f> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f15664c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(K k11) {
            super(0);
            this.f15664c = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C6160f invoke() {
            InterfaceC4008j<C6178x> h11 = C3460i.this.h();
            K k11 = this.f15664c;
            return new C6160f(h11, k11.z(), k11.v().e(), k11.n(), k11.X().g(), k11.v().m(), k11.l().o(), k11.t().f());
        }
    }

    /* renamed from: Kb0.i$d */
    static final class d extends AbstractC7737t implements Function0<Cb0.e> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f15666c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(K k11) {
            super(0);
            this.f15666c = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Cb0.e invoke() {
            C3460i c3460i = C3460i.this;
            InterfaceC4008j<C6144H> j11 = c3460i.j();
            K k11 = this.f15666c;
            return new Cb0.e(j11, k11.N().getPrimaryDomain(), k11.L(), c3460i.m());
        }
    }

    /* renamed from: Kb0.i$e */
    static final class e extends AbstractC7737t implements Function0<C6170p> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f15668c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(K k11) {
            super(0);
            this.f15668c = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C6170p invoke() {
            C3460i c3460i = C3460i.this;
            return new C6170p(c3460i.j(), c3460i.e(), this.f15668c.v().i());
        }
    }

    /* renamed from: Kb0.i$f */
    static final class f extends AbstractC7737t implements Function0<InterfaceC4875q> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f15670c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(K k11) {
            super(0);
            this.f15670c = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC4875q invoke() {
            C3460i c3460i = C3460i.this;
            return new Cb0.l(c3460i.f15650b, this.f15670c.O(), c3460i.m());
        }
    }

    /* renamed from: Kb0.i$g */
    static final class g extends AbstractC7737t implements Function0<C6178x> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f15671b = new g(0);

        @Override // kotlin.jvm.functions.Function0
        public final C6178x invoke() {
            return new C6178x();
        }
    }

    /* renamed from: Kb0.i$h */
    static final class h extends AbstractC7737t implements Function0<C7338a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15672b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(K k11) {
            super(0);
            this.f15672b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C7338a invoke() {
            return new C7338a(this.f15672b.N().getPrimaryDomain());
        }
    }

    /* renamed from: Kb0.i$i, reason: collision with other inner class name */
    static final class C0300i extends AbstractC7737t implements Function0<Cb0.f> {
        C0300i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Cb0.f invoke() {
            return new Cb0.f(C3460i.this.k());
        }
    }

    /* renamed from: Kb0.i$j */
    static final class j extends AbstractC7737t implements Function0<C6144H> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15674b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3460i f15675c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C3460i c3460i, K k11) {
            super(0);
            this.f15674b = k11;
            this.f15675c = c3460i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C6144H invoke() {
            K k11 = this.f15674b;
            InterfaceC4008j<URI> V11 = k11.V();
            InterfaceC4008j interfaceC4008j = C3460i.f15647m;
            CookieHandler externalCookieHandler = k11.N().getExternalCookieHandler();
            C3460i c3460i = this.f15675c;
            return new C6144H(interfaceC4008j, externalCookieHandler, c3460i.k(), V11, c3460i.d(), c3460i.i(), C3460i.f15648n, k11.X().f(), k11.N(), k11.L(), td0.f.a(), c3460i.h().getValue(), k11.z());
        }
    }

    /* renamed from: Kb0.i$k */
    static final class k extends AbstractC7737t implements Function0<C6147K> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C6147K invoke() {
            C3460i c3460i = C3460i.this;
            return new C6147K(new C3462j(2, c3460i.j().getValue(), C6144H.class, "getAllCookies", "getAllCookies(Ljava/net/URI;Ljava/util/Map;)Ljava/util/Map;", 0), new C3464k(2, c3460i.j().getValue(), C6144H.class, "saveCookies", "saveCookies(Ljava/net/URI;Ljava/util/Map;Z)V", 0));
        }
    }

    /* renamed from: Kb0.i$l */
    static final class l extends AbstractC7737t implements Function0<C6152P> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15677b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(K k11) {
            super(0);
            this.f15677b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C6152P invoke() {
            K k11 = this.f15677b;
            return new C6152P(k11.C(), DeviceInfoManager.INSTANCE.invoke(k11.m()), k11.I());
        }
    }

    /* renamed from: Kb0.i$m */
    static final class m extends AbstractC7737t implements Function0<jd0.r> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f15679c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(K k11) {
            super(0);
            this.f15679c = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final jd0.r invoke() {
            K k11 = this.f15679c;
            InterfaceC4008j b11 = Sc.k.b(new C3466l(k11));
            InterfaceC4008j interfaceC4008j = C3460i.f15647m;
            C3460i c3460i = C3460i.this;
            return new jd0.r(b11, interfaceC4008j, c3460i.j(), c3460i.d(), C3460i.f15648n, k11.V(), k11.S(), k11.z());
        }
    }

    public C3460i(@NotNull K di) {
        Intrinsics.checkNotNullParameter(di, "di");
        Tc.j builder = new Tc.j();
        builder.addAll(C6167m.a());
        builder.add("abt_data");
        builder.add("x-o3-app-name");
        builder.add("x-o3-app-version");
        builder.add("x-o3-sdk-versions");
        builder.add("x-o3-os-version");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f15649a = builder.b();
        this.f15650b = Sc.k.b(new C0300i());
        this.f15651c = Sc.k.b(new f(di));
        this.f15652d = Sc.k.b(new h(di));
        this.f15653e = Sc.k.b(new k());
        this.f15654f = Sc.k.b(new j(this, di));
        this.f15655g = Sc.k.b(new m(di));
        this.f15656h = Sc.k.b(new e(di));
        this.f15657i = Sc.k.b(new c(di));
        this.f15658j = Sc.k.b(new d(di));
        this.f15659k = Sc.k.b(new l(di));
        this.f15660l = Sc.k.b(g.f15671b);
    }

    @NotNull
    public final InterfaceC4008j<C6160f> d() {
        return this.f15657i;
    }

    @NotNull
    public final InterfaceC4008j<Cb0.e> e() {
        return this.f15658j;
    }

    @NotNull
    public final InterfaceC4008j<C6170p> f() {
        return this.f15656h;
    }

    @NotNull
    public final InterfaceC4008j<InterfaceC4875q> g() {
        return this.f15651c;
    }

    @NotNull
    public final InterfaceC4008j<C6178x> h() {
        return this.f15660l;
    }

    @NotNull
    public final InterfaceC4008j<C7338a> i() {
        return this.f15652d;
    }

    @NotNull
    public final InterfaceC4008j<C6144H> j() {
        return this.f15654f;
    }

    @NotNull
    public final InterfaceC4008j<C6147K> k() {
        return this.f15653e;
    }

    @NotNull
    public final InterfaceC4008j<C6152P> l() {
        return this.f15659k;
    }

    @NotNull
    public final Tc.j m() {
        return this.f15649a;
    }

    @NotNull
    public final InterfaceC4008j<jd0.r> n() {
        return this.f15655g;
    }
}
