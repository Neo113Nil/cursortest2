package Kb0;

import R2.InterfaceC3917k;
import Sc.InterfaceC4008j;
import android.app.Application;
import dc0.C6149M;
import dc0.C6151O;
import dc0.C6157c;
import dc0.C6176v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nc0.C8492c;
import nc0.C8495f;
import oc0.C8692a;
import org.jetbrains.annotations.NotNull;
import qc0.C9022a;
import ru.ozon.id.nativeauth.crossApp.data.api.CrossAppChallengeApi;
import uc0.C10020a;

/* renamed from: Kb0.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3468m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<CrossAppChallengeApi> f15685a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<qc0.d> f15686b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6151O> f15687c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8495f> f15688d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8492c> f15689e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<nc0.q> f15690f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6157c> f15691g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C9022a> f15692h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<qc0.b> f15693i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<qc0.c> f15694j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<sc0.c> f15695k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<sc0.b> f15696l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10020a> f15697m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C8692a> f15698n;

    /* renamed from: Kb0.m$a */
    static final class a extends AbstractC7737t implements Function0<C6157c> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15699b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(K k11) {
            super(0);
            this.f15699b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C6157c invoke() {
            K k11 = this.f15699b;
            return new C6157c(k11.N(), k11.M().o(), k11.i(), k11.j().getValue());
        }
    }

    /* renamed from: Kb0.m$b */
    static final class b extends AbstractC7737t implements Function0<C9022a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15700b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(K k11) {
            super(0);
            this.f15700b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C9022a invoke() {
            K k11 = this.f15700b;
            return new C9022a(k11.N(), k11.i(), k11.M().o(), k11.j().getValue());
        }
    }

    /* renamed from: Kb0.m$c */
    static final class c extends AbstractC7737t implements Function0<C8692a> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f15701b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final C8692a invoke() {
            return new C8692a();
        }
    }

    /* renamed from: Kb0.m$d */
    static final class d extends AbstractC7737t implements Function0<C8492c> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f15703c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(K k11) {
            super(0);
            this.f15703c = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C8492c invoke() {
            C3468m c3468m = C3468m.this;
            qc0.b value = c3468m.i().getValue();
            sc0.b bVar = (sc0.b) c3468m.f15696l.getValue();
            qc0.c value2 = c3468m.j().getValue();
            K k11 = this.f15703c;
            return new C8492c(value, bVar, value2, k11.N(), k11.w());
        }
    }

    /* renamed from: Kb0.m$e */
    static final class e extends AbstractC7737t implements Function0<C8495f> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15704b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3468m f15705c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3468m c3468m, K k11) {
            super(0);
            this.f15704b = k11;
            this.f15705c = c3468m;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C8495f invoke() {
            K k11 = this.f15704b;
            Application m11 = k11.m();
            InterfaceC4008j<C6176v> w11 = k11.w();
            InterfaceC4008j b11 = Sc.k.b(new C3470n(k11));
            InterfaceC4008j<C6149M> R11 = k11.R();
            C3468m c3468m = this.f15705c;
            return new C8495f(m11, w11, b11, R11, c3468m.i().getValue(), c3468m.j().getValue(), c3468m.k().getValue());
        }
    }

    /* renamed from: Kb0.m$f */
    static final class f extends AbstractC7737t implements Function0<nc0.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15706b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3468m f15707c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3468m c3468m, K k11) {
            super(0);
            this.f15706b = k11;
            this.f15707c = c3468m;
        }

        @Override // kotlin.jvm.functions.Function0
        public final nc0.q invoke() {
            K k11 = this.f15706b;
            InterfaceC4008j b11 = Sc.k.b(new C3472o(k11));
            InterfaceC4008j<C6149M> R11 = k11.R();
            InterfaceC4008j<InterfaceC3917k<W2.f>> c11 = k11.x().c();
            C3468m c3468m = this.f15707c;
            return new nc0.q(b11, R11, c11, c3468m.i().getValue(), c3468m.k().getValue(), c3468m.j().getValue(), k11.J().d().getValue(), k11.p().getValue(), k11.K().getValue(), k11.v().d(), k11.t().h(), k11.W().m());
        }
    }

    /* renamed from: Kb0.m$g */
    static final class g extends AbstractC7737t implements Function0<CrossAppChallengeApi> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15708b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(K k11) {
            super(0);
            this.f15708b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CrossAppChallengeApi invoke() {
            return (CrossAppChallengeApi) this.f15708b.M().q().getValue().create(CrossAppChallengeApi.class);
        }
    }

    /* renamed from: Kb0.m$h */
    static final class h extends AbstractC7737t implements Function0<qc0.b> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final qc0.b invoke() {
            return new qc0.b(C3468m.this.f15692h);
        }
    }

    /* renamed from: Kb0.m$i */
    static final class i extends AbstractC7737t implements Function0<qc0.c> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final qc0.c invoke() {
            return new qc0.c(C3468m.this.f15692h);
        }
    }

    /* renamed from: Kb0.m$j */
    static final class j extends AbstractC7737t implements Function0<qc0.d> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final qc0.d invoke() {
            return new qc0.d(C3468m.this.h());
        }
    }

    /* renamed from: Kb0.m$k */
    static final class k extends AbstractC7737t implements Function0<sc0.b> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15712b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(K k11) {
            super(0);
            this.f15712b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final sc0.b invoke() {
            return new sc0.b(Sc.k.b(new C3474p(this.f15712b)));
        }
    }

    /* renamed from: Kb0.m$l */
    static final class l extends AbstractC7737t implements Function0<C10020a> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f15714c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(K k11) {
            super(0);
            this.f15714c = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10020a invoke() {
            C3468m c3468m = C3468m.this;
            C6151O value = c3468m.m().getValue();
            K k11 = this.f15714c;
            return new C10020a(value, k11.N(), k11.w().getValue(), c3468m.i().getValue(), c3468m.j().getValue(), c3468m.n().getValue(), (sc0.b) c3468m.f15696l.getValue());
        }
    }

    /* renamed from: Kb0.m$m, reason: collision with other inner class name */
    static final class C0301m extends AbstractC7737t implements Function0<C6151O> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f15716c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0301m(K k11) {
            super(0);
            this.f15716c = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C6151O invoke() {
            InterfaceC4008j interfaceC4008j = C3468m.this.f15691g;
            K k11 = this.f15716c;
            Fb0.f N11 = k11.N();
            String packageName = k11.m().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            return new C6151O(N11, packageName, interfaceC4008j);
        }
    }

    /* renamed from: Kb0.m$n */
    static final class n extends AbstractC7737t implements Function0<sc0.c> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K f15717b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(K k11) {
            super(0);
            this.f15717b = k11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final sc0.c invoke() {
            K k11 = this.f15717b;
            return new sc0.c(k11.i(), k11.j().getValue());
        }
    }

    public C3468m(@NotNull K di) {
        Intrinsics.checkNotNullParameter(di, "di");
        this.f15685a = Sc.k.b(new g(di));
        this.f15686b = Sc.k.b(new j());
        this.f15687c = Sc.k.b(new C0301m(di));
        this.f15688d = Sc.k.b(new e(this, di));
        this.f15689e = Sc.k.b(new d(di));
        this.f15690f = Sc.k.b(new f(this, di));
        this.f15691g = Sc.k.b(new a(di));
        this.f15692h = Sc.k.b(new b(di));
        this.f15693i = Sc.k.b(new h());
        this.f15694j = Sc.k.b(new i());
        this.f15695k = Sc.k.b(new n(di));
        this.f15696l = Sc.k.b(new k(di));
        this.f15697m = Sc.k.b(new l(di));
        this.f15698n = Sc.k.b(c.f15701b);
    }

    @NotNull
    public final InterfaceC4008j<C8692a> d() {
        return this.f15698n;
    }

    @NotNull
    public final InterfaceC4008j<C8492c> e() {
        return this.f15689e;
    }

    @NotNull
    public final InterfaceC4008j<C8495f> f() {
        return this.f15688d;
    }

    @NotNull
    public final InterfaceC4008j<nc0.q> g() {
        return this.f15690f;
    }

    @NotNull
    public final InterfaceC4008j<CrossAppChallengeApi> h() {
        return this.f15685a;
    }

    @NotNull
    public final InterfaceC4008j<qc0.b> i() {
        return this.f15693i;
    }

    @NotNull
    public final InterfaceC4008j<qc0.c> j() {
        return this.f15694j;
    }

    @NotNull
    public final InterfaceC4008j<qc0.d> k() {
        return this.f15686b;
    }

    @NotNull
    public final InterfaceC4008j<C10020a> l() {
        return this.f15697m;
    }

    @NotNull
    public final InterfaceC4008j<C6151O> m() {
        return this.f15687c;
    }

    @NotNull
    public final InterfaceC4008j<sc0.c> n() {
        return this.f15695k;
    }
}
