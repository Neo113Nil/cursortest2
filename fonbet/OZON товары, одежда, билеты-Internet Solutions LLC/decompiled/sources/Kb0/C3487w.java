package Kb0;

import Hb0.f;
import Sc.InterfaceC4008j;
import com.squareup.moshi.Moshi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nc0.C8490a;
import nf.C8588a;
import org.jetbrains.annotations.NotNull;
import pf0.AbstractC8922e;
import rc0.C9245b;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import ru.ozon.id.nativeauth.data.api.ActionApi;
import ru.ozon.uni.atoms.parsing.adapter.AtomDTOAdapterFactory;
import yc0.C10882a;

/* renamed from: Kb0.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3487w {

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<Ic0.g> f15742o = Sc.k.b(b.f15763b);

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<Ic0.h> f15743p = Sc.k.b(d.f15765b);

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<C8490a> f15744q = Sc.k.b(a.f15762b);

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<Ub0.a> f15745r = Sc.k.b(c.f15764b);

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<C9245b> f15746s = Sc.k.b(e.f15766b);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f15747t = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K f15748a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ActionApi> f15749b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f15750c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Retrofit> f15751d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Retrofit> f15752e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Retrofit> f15753f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Moshi> f15754g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Ic0.i> f15755h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8588a> f15756i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10882a> f15757j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<AbstractC8922e> f15758k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<AbstractC8922e> f15759l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Ic0.a> f15760m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Ic0.d> f15761n;

    /* renamed from: Kb0.w$a */
    static final class a extends AbstractC7737t implements Function0<C8490a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f15762b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final C8490a invoke() {
            return new C8490a(Sc.k.b(new C3485v(0)));
        }
    }

    /* renamed from: Kb0.w$b */
    static final class b extends AbstractC7737t implements Function0<Ic0.g> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f15763b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Ic0.g invoke() {
            return new Ic0.g(Sc.k.b(new C3489x(0)), Sc.k.b(new C3491y(0)), Sc.k.b(new C3492z(0)), Sc.k.b(new A(0)), Sc.k.b(new B(0)));
        }
    }

    /* renamed from: Kb0.w$c */
    static final class c extends AbstractC7737t implements Function0<Ub0.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f15764b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final Ub0.a invoke() {
            return new Ub0.a(Sc.k.b(new C(0)));
        }
    }

    /* renamed from: Kb0.w$d */
    static final class d extends AbstractC7737t implements Function0<Ic0.h> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f15765b = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final Ic0.h invoke() {
            return new Ic0.h(C3487w.f15742o);
        }
    }

    /* renamed from: Kb0.w$e */
    static final class e extends AbstractC7737t implements Function0<C9245b> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f15766b = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final C9245b invoke() {
            return new C9245b(Sc.k.b(new D(0)));
        }
    }

    /* renamed from: Kb0.w$f */
    static final class f extends AbstractC7737t implements Function0<ActionApi> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ActionApi invoke() {
            return (ActionApi) C3487w.this.q().getValue().create(ActionApi.class);
        }
    }

    /* renamed from: Kb0.w$g */
    static final class g extends AbstractC7737t implements Function0<String> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            C3487w c3487w = C3487w.this;
            Fb0.e primaryDomain = c3487w.f15748a.N().getPrimaryDomain();
            return ((Boolean) c3487w.f15748a.z().getValue().b(f.o.f10813a)).booleanValue() ? primaryDomain.h() : primaryDomain.e();
        }
    }

    /* renamed from: Kb0.w$h */
    static final class h extends AbstractC7737t implements Function0<Retrofit> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Retrofit invoke() {
            C3487w c3487w = C3487w.this;
            return C3487w.j(c3487w, "https://api.finance." + c3487w.f15748a.N().getPrimaryDomain().j(), false);
        }
    }

    /* renamed from: Kb0.w$i */
    static final class i extends AbstractC7737t implements Function0<C10882a> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10882a invoke() {
            return new C10882a(C3487w.this.f15748a.C());
        }
    }

    /* renamed from: Kb0.w$j */
    static final class j extends AbstractC7737t implements Function0<Ic0.a> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Ic0.a invoke() {
            C3487w c3487w = C3487w.this;
            return new Ic0.a(Sc.k.b(new E(c3487w)), c3487w.p(), c3487w.f15748a.X().e(), c3487w.f15748a.N().getAppName(), c3487w.f15748a.z());
        }
    }

    /* renamed from: Kb0.w$k */
    static final class k extends AbstractC7737t implements Function0<Ic0.d> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Ic0.d invoke() {
            C3487w c3487w = C3487w.this;
            return new Ic0.d(c3487w.f15760m, c3487w.f15748a.K(), c3487w.f15748a.p());
        }
    }

    /* renamed from: Kb0.w$l */
    static final class l extends AbstractC7737t implements Function0<C8588a> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f15773b = new l(0);

        @Override // kotlin.jvm.functions.Function0
        public final C8588a invoke() {
            C8588a c8588a = new C8588a(new F(Vb0.b.f28514a));
            c8588a.c(C8588a.EnumC1299a.NONE);
            return c8588a;
        }
    }

    /* renamed from: Kb0.w$m */
    static final class m extends AbstractC7737t implements Function0<Moshi> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Moshi invoke() {
            C3487w.this.getClass();
            Moshi.a aVar = new Moshi.a();
            aVar.a(new AtomDTOAdapterFactory());
            Moshi moshi = new Moshi(aVar);
            Intrinsics.checkNotNullExpressionValue(moshi, "build(...)");
            return moshi;
        }
    }

    /* renamed from: Kb0.w$n */
    static final class n extends AbstractC7737t implements Function0<G> {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final G invoke() {
            return new G(C3487w.this);
        }
    }

    /* renamed from: Kb0.w$o */
    static final class o extends AbstractC7737t implements Function0<H> {
        o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final H invoke() {
            return new H(C3487w.this);
        }
    }

    /* renamed from: Kb0.w$p */
    static final class p extends AbstractC7737t implements Function0<Ic0.i> {
        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Ic0.i invoke() {
            return new Ic0.i(C3487w.this.f15748a.t().f());
        }
    }

    /* renamed from: Kb0.w$q */
    static final class q extends AbstractC7737t implements Function0<Retrofit> {
        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Retrofit invoke() {
            C3487w c3487w = C3487w.this;
            return C3487w.j(c3487w, C3487w.b(c3487w), false);
        }
    }

    /* renamed from: Kb0.w$r */
    static final class r extends AbstractC7737t implements Function0<Retrofit> {
        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Retrofit invoke() {
            C3487w c3487w = C3487w.this;
            return C3487w.j(c3487w, C3487w.b(c3487w), true);
        }
    }

    public C3487w(@NotNull K di) {
        Intrinsics.checkNotNullParameter(di, "di");
        this.f15748a = di;
        this.f15749b = Sc.k.b(new f());
        this.f15750c = Sc.k.b(new g());
        this.f15751d = Sc.k.b(new q());
        this.f15752e = Sc.k.b(new h());
        this.f15753f = Sc.k.b(new r());
        this.f15754g = Sc.k.b(new m());
        this.f15755h = Sc.k.b(new p());
        this.f15756i = Sc.k.b(l.f15773b);
        this.f15757j = Sc.k.b(new i());
        this.f15758k = Sc.k.b(new n());
        this.f15759l = Sc.k.b(new o());
        this.f15760m = Sc.k.b(new j());
        this.f15761n = Sc.k.b(new k());
    }

    public static final String b(C3487w c3487w) {
        return (String) c3487w.f15750c.getValue();
    }

    public static final Retrofit j(C3487w c3487w, String str, boolean z11) {
        c3487w.getClass();
        Retrofit build = new Retrofit.Builder().baseUrl(str).addConverterFactory(MoshiConverterFactory.create(c3487w.f15754g.getValue())).client(((pf0.l) c3487w.f15748a.G().e(pf0.h.class)).y(new I(c3487w, z11 ? c3487w.f15759l.getValue() : null))).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final InterfaceC4008j<ActionApi> k() {
        return this.f15749b;
    }

    @NotNull
    public final InterfaceC4008j<Retrofit> l() {
        return this.f15752e;
    }

    @NotNull
    public final InterfaceC4008j<Ic0.d> m() {
        return this.f15761n;
    }

    @NotNull
    public final InterfaceC4008j<C8588a> n() {
        return this.f15756i;
    }

    @NotNull
    public final InterfaceC4008j<Moshi> o() {
        return this.f15754g;
    }

    @NotNull
    public final InterfaceC4008j<Ic0.i> p() {
        return this.f15755h;
    }

    @NotNull
    public final InterfaceC4008j<Retrofit> q() {
        return this.f15751d;
    }

    @NotNull
    public final InterfaceC4008j<Retrofit> r() {
        return this.f15753f;
    }
}
