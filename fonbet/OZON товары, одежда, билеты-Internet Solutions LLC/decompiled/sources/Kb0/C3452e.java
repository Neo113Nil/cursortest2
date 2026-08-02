package Kb0;

import Sc.InterfaceC4008j;
import android.app.Application;
import com.squareup.moshi.Moshi;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nb0.C8485c;
import ob0.C8685A;
import org.jetbrains.annotations.NotNull;
import pb0.C8893a;
import qj.C9067a;
import ru.ozon.id.ad.AdManager;
import ru.ozon.id.amf.Amf;
import ru.ozon.id.antibot.challenge.mf.FingerprintApi;
import sb0.C9649b;
import tb0.C9793a;
import tb0.C9796d;
import ub0.C10013a;
import ub0.C10014b;

/* renamed from: Kb0.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3452e {

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<ob0.u> f15602p = Sc.k.b(b.f15621b);

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<ob0.t> f15603q = Sc.k.b(a.f15620b);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f15604r = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8685A> f15605a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10014b> f15606b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ob0.l> f15607c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8893a> f15608d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9796d> f15609e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<AdManager> f15610f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8485c> f15611g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9649b> f15612h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9067a> f15613i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Amf> f15614j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10013a> f15615k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<FingerprintApi> f15616l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9793a> f15617m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ob0.E> f15618n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ob0.v> f15619o;

    /* renamed from: Kb0.e$a */
    static final class a extends AbstractC7737t implements Function0<ob0.t> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f15620b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ob0.t invoke() {
            return new ob0.t(Sc.k.b(new C3444a(0)), Sc.k.b(new C3446b(0)), Sc.k.b(new C3448c(0)), Sc.k.b(new C3450d(0)));
        }
    }

    /* renamed from: Kb0.e$b */
    static final class b extends AbstractC7737t implements Function0<ob0.u> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f15621b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final ob0.u invoke() {
            return new ob0.u(Sc.k.b(new C3454f(0)), Sc.k.b(new C3456g(0)));
        }
    }

    /* renamed from: Kb0.e$c */
    static final class c extends AbstractC7737t implements Function0<AdManager> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15622b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(K k11) {
            super(0);
            this.f15622b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final AdManager invoke() {
            return new AdManager(this.f15622b.W().f());
        }
    }

    /* renamed from: Kb0.e$d */
    static final class d extends AbstractC7737t implements Function0<C8485c> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15623b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(K k11) {
            super(0);
            this.f15623b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C8485c invoke() {
            K k11 = this.f15623b;
            return new C8485c(k11.z(), k11.m());
        }
    }

    /* renamed from: Kb0.e$e, reason: collision with other inner class name */
    static final class C0299e extends AbstractC7737t implements Function0<Amf> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0299e f15624b = new C0299e(0);

        @Override // kotlin.jvm.functions.Function0
        public final Amf invoke() {
            return new Amf();
        }
    }

    /* renamed from: Kb0.e$f */
    static final class f extends AbstractC7737t implements Function0<ob0.l> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f15626c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(K k11) {
            super(0);
            this.f15626c = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ob0.l invoke() {
            C3452e c3452e = C3452e.this;
            InterfaceC4008j<C8685A> n11 = c3452e.n();
            InterfaceC4008j interfaceC4008j = c3452e.f15612h;
            K k11 = this.f15626c;
            return new ob0.l(n11, c3452e.f15609e, interfaceC4008j, k11.T(), c3452e.o(), k11.a0(), c3452e.f15617m, k11.N(), k11.z());
        }
    }

    /* renamed from: Kb0.e$g */
    static final class g extends AbstractC7737t implements Function0<C9649b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15627b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3452e f15628c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C3452e c3452e, K k11) {
            super(0);
            this.f15627b = k11;
            this.f15628c = c3452e;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C9649b invoke() {
            return new C9649b(this.f15627b.C(), this.f15628c.n());
        }
    }

    /* renamed from: Kb0.e$h */
    static final class h extends AbstractC7737t implements Function0<C9793a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15629b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(K k11) {
            super(0);
            this.f15629b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C9793a invoke() {
            return new C9793a(this.f15629b.z());
        }
    }

    /* renamed from: Kb0.e$i */
    static final class i extends AbstractC7737t implements Function0<C9796d> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15630b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(K k11) {
            super(0);
            this.f15630b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C9796d invoke() {
            K k11 = this.f15630b;
            return new C9796d(k11.C(), k11.m());
        }
    }

    /* renamed from: Kb0.e$j */
    static final class j extends AbstractC7737t implements Function0<ob0.v> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15631b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(K k11) {
            super(0);
            this.f15631b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ob0.v invoke() {
            return new ob0.v(this.f15631b.M().o());
        }
    }

    /* renamed from: Kb0.e$k */
    static final class k extends AbstractC7737t implements Function0<C8685A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f15633c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(K k11) {
            super(0);
            this.f15633c = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C8685A invoke() {
            C3452e c3452e = C3452e.this;
            return new C8685A(c3452e.p(), c3452e.f15612h, this.f15633c.z());
        }
    }

    /* renamed from: Kb0.e$l */
    static final class l extends AbstractC7737t implements Function0<FingerprintApi> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15634b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(K k11) {
            super(0);
            this.f15634b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final FingerprintApi invoke() {
            return (FingerprintApi) this.f15634b.M().q().getValue().create(FingerprintApi.class);
        }
    }

    /* renamed from: Kb0.e$m */
    static final class m extends AbstractC7737t implements Function0<C10013a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15635b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3452e f15636c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(C3452e c3452e, K k11) {
            super(0);
            this.f15635b = k11;
            this.f15636c = c3452e;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10013a invoke() {
            K k11 = this.f15635b;
            Fb0.f N11 = k11.N();
            InterfaceC4008j<Moshi> o11 = k11.M().o();
            Application m11 = k11.m();
            C3452e c3452e = this.f15636c;
            return new C10013a(N11, o11, m11, c3452e.f15613i, c3452e.f15614j);
        }
    }

    /* renamed from: Kb0.e$n */
    static final class n extends AbstractC7737t implements Function0<C10014b> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f15638c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(K k11) {
            super(0);
            this.f15638c = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10014b invoke() {
            C3452e c3452e = C3452e.this;
            InterfaceC4008j interfaceC4008j = c3452e.f15615k;
            InterfaceC4008j interfaceC4008j2 = c3452e.f15616l;
            K k11 = this.f15638c;
            return new C10014b(interfaceC4008j, interfaceC4008j2, k11.T(), k11.a0(), Sc.k.b(new C3458h(k11)), k11.z());
        }
    }

    /* renamed from: Kb0.e$o */
    static final class o extends AbstractC7737t implements Function0<C8893a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15639b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(K k11) {
            super(0);
            this.f15639b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C8893a invoke() {
            return new C8893a(this.f15639b.k());
        }
    }

    /* renamed from: Kb0.e$p */
    static final class p extends AbstractC7737t implements Function0<C9067a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15640b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(K k11) {
            super(0);
            this.f15640b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C9067a invoke() {
            C9067a c9067a;
            Object obj;
            C9067a c9067a2;
            Application context = this.f15640b.m();
            Intrinsics.checkNotNullParameter(context, "context");
            c9067a = C9067a.f82186h;
            if (c9067a != null) {
                return c9067a;
            }
            obj = C9067a.f82185g;
            synchronized (obj) {
                c9067a2 = C9067a.f82186h;
                if (c9067a2 == null) {
                    c9067a2 = new C9067a(context);
                    C9067a.f82186h = c9067a2;
                }
            }
            return c9067a2;
        }
    }

    /* renamed from: Kb0.e$q */
    static final class q extends AbstractC7737t implements Function0<ob0.E> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15641b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(K k11) {
            super(0);
            this.f15641b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ob0.E invoke() {
            K k11 = this.f15641b;
            return new ob0.E(k11.t().j(), k11.T(), k11.a0(), k11.z());
        }
    }

    public C3452e(@NotNull K di) {
        Intrinsics.checkNotNullParameter(di, "di");
        this.f15605a = Sc.k.b(new k(di));
        this.f15606b = Sc.k.b(new n(di));
        this.f15607c = Sc.k.b(new f(di));
        this.f15608d = Sc.k.b(new o(di));
        this.f15609e = Sc.k.b(new i(di));
        this.f15610f = Sc.k.b(new c(di));
        this.f15611g = Sc.k.b(new d(di));
        this.f15612h = Sc.k.b(new g(this, di));
        this.f15613i = Sc.k.b(new p(di));
        this.f15614j = Sc.k.b(C0299e.f15624b);
        this.f15615k = Sc.k.b(new m(this, di));
        this.f15616l = Sc.k.b(new l(di));
        this.f15617m = Sc.k.b(new h(di));
        this.f15618n = Sc.k.b(new q(di));
        this.f15619o = Sc.k.b(new j(di));
    }

    @NotNull
    public final InterfaceC4008j<AdManager> j() {
        return this.f15610f;
    }

    @NotNull
    public final InterfaceC4008j<C8485c> k() {
        return this.f15611g;
    }

    @NotNull
    public final InterfaceC4008j<ob0.l> l() {
        return this.f15607c;
    }

    @NotNull
    public final InterfaceC4008j<ob0.v> m() {
        return this.f15619o;
    }

    @NotNull
    public final InterfaceC4008j<C8685A> n() {
        return this.f15605a;
    }

    @NotNull
    public final InterfaceC4008j<C10014b> o() {
        return this.f15606b;
    }

    @NotNull
    public final InterfaceC4008j<C8893a> p() {
        return this.f15608d;
    }

    @NotNull
    public final InterfaceC4008j<ob0.E> q() {
        return this.f15618n;
    }
}
