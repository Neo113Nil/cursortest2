package Kb0;

import Sc.InterfaceC4008j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.sso2.C9549c;
import ru.ozon.id.nativeauth.sso2.C9551e;
import ru.ozon.id.nativeauth.sso2.Sso2Api;

/* loaded from: classes7.dex */
public final class U0 {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<C9549c> f15558h = Sc.k.b(a.f15567b);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f15559i = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<hd0.i> f15560a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Sso2Api> f15561b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<hd0.e> f15562c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9551e> f15563d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ru.ozon.id.nativeauth.sso2.r> f15564e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ru.ozon.id.nativeauth.sso2.v> f15565f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ru.ozon.id.nativeauth.sso2.F> f15566g;

    static final class a extends AbstractC7737t implements Function0<C9549c> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f15567b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final C9549c invoke() {
            return new C9549c(Sc.k.b(new L0(0)), Sc.k.b(new M0(0)), Sc.k.b(new N0(0)), Sc.k.b(new O0(0)), Sc.k.b(new P0(0)), Sc.k.b(new Q0(0)), Sc.k.b(new R0(0)), Sc.k.b(new S0(0)), Sc.k.b(new T0(0)));
        }
    }

    static final class b extends AbstractC7737t implements Function0<Sso2Api> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15568b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(K k11) {
            super(0);
            this.f15568b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Sso2Api invoke() {
            return (Sso2Api) this.f15568b.M().q().getValue().create(Sso2Api.class);
        }
    }

    static final class c extends AbstractC7737t implements Function0<C9551e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15569b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ U0 f15570c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(K k11, U0 u02) {
            super(0);
            this.f15569b = k11;
            this.f15570c = u02;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C9551e invoke() {
            return new C9551e(this.f15569b.t().j(), this.f15570c.f());
        }
    }

    static final class d extends AbstractC7737t implements Function0<ru.ozon.id.nativeauth.sso2.r> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15571b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ U0 f15572c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(K k11, U0 u02) {
            super(0);
            this.f15571b = k11;
            this.f15572c = u02;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.id.nativeauth.sso2.r invoke() {
            K k11 = this.f15571b;
            Fb0.f N11 = k11.N();
            U0 u02 = this.f15572c;
            return new ru.ozon.id.nativeauth.sso2.r(N11, u02.f15561b, k11.t().l(), k11.t().e(), k11.a0(), u02.f(), u02.e(), k11.T());
        }
    }

    static final class e extends AbstractC7737t implements Function0<hd0.e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ U0 f15573b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f15574c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(K k11, U0 u02) {
            super(0);
            this.f15573b = u02;
            this.f15574c = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final hd0.e invoke() {
            U0 u02 = this.f15573b;
            InterfaceC4008j interfaceC4008j = u02.f15561b;
            InterfaceC4008j<hd0.i> f7 = u02.f();
            K k11 = this.f15574c;
            return new hd0.e(k11.N(), interfaceC4008j, f7, k11.t().j(), k11.t().l(), k11.t().e(), k11.a0(), k11.T());
        }
    }

    static final class f extends AbstractC7737t implements Function0<hd0.i> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15575b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(K k11) {
            super(0);
            this.f15575b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final hd0.i invoke() {
            K k11 = this.f15575b;
            return new hd0.i(k11.x().c(), k11.M().o());
        }
    }

    static final class g extends AbstractC7737t implements Function0<ru.ozon.id.nativeauth.sso2.v> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ U0 f15576b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f15577c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(K k11, U0 u02) {
            super(0);
            this.f15576b = u02;
            this.f15577c = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.id.nativeauth.sso2.v invoke() {
            U0 u02 = this.f15576b;
            InterfaceC4008j<C9551e> c11 = u02.c();
            InterfaceC4008j<ru.ozon.id.nativeauth.sso2.r> d11 = u02.d();
            K k11 = this.f15577c;
            return new ru.ozon.id.nativeauth.sso2.v(c11, d11, k11.a0(), k11.T(), k11.z());
        }
    }

    static final class h extends AbstractC7737t implements Function0<ru.ozon.id.nativeauth.sso2.F> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15578b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ U0 f15579c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(K k11, U0 u02) {
            super(0);
            this.f15578b = k11;
            this.f15579c = u02;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.id.nativeauth.sso2.F invoke() {
            K k11 = this.f15578b;
            Fb0.f N11 = k11.N();
            U0 u02 = this.f15579c;
            return new ru.ozon.id.nativeauth.sso2.F(N11, u02.g(), u02.f(), k11.a0(), k11.T(), k11.z());
        }
    }

    public U0(@NotNull K di) {
        Intrinsics.checkNotNullParameter(di, "di");
        this.f15560a = Sc.k.b(new f(di));
        this.f15561b = Sc.k.b(new b(di));
        this.f15562c = Sc.k.b(new e(di, this));
        this.f15563d = Sc.k.b(new c(di, this));
        this.f15564e = Sc.k.b(new d(di, this));
        this.f15565f = Sc.k.b(new g(di, this));
        this.f15566g = Sc.k.b(new h(di, this));
    }

    @NotNull
    public final InterfaceC4008j<C9551e> c() {
        return this.f15563d;
    }

    @NotNull
    public final InterfaceC4008j<ru.ozon.id.nativeauth.sso2.r> d() {
        return this.f15564e;
    }

    @NotNull
    public final InterfaceC4008j<hd0.e> e() {
        return this.f15562c;
    }

    @NotNull
    public final InterfaceC4008j<hd0.i> f() {
        return this.f15560a;
    }

    @NotNull
    public final InterfaceC4008j<ru.ozon.id.nativeauth.sso2.v> g() {
        return this.f15565f;
    }

    @NotNull
    public final InterfaceC4008j<ru.ozon.id.nativeauth.sso2.F> h() {
        return this.f15566g;
    }
}
