package Kb0;

import C2.InterfaceC2716k;
import Sc.InterfaceC4008j;
import hc0.C6910a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.biometry.data.api.AuthBiometryApi;
import ru.ozon.id.nativeauth.data.api.ComposerAuthApi;
import ru.ozon.id.nativeauth.fintech.api.FintechRecoveryCameraApi;
import ru.ozon.id.nativeauth.instantAuth.data.api.InstantLoginApi;
import wc0.C10503d;
import xc0.C10702a;

/* loaded from: classes7.dex */
public final class K0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K f15522a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ComposerAuthApi> f15523b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10702a> f15524c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Kc0.l> f15525d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10503d> f15526e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<vc0.c> f15527f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<vc0.e> f15528g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<AuthBiometryApi> f15529h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6910a> f15530i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<InstantLoginApi> f15531j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Kc0.p> f15532k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<FintechRecoveryCameraApi> f15533l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hc0.d> f15534m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Kc0.d> f15535n;

    static final class a extends AbstractC7737t implements Function0<C10503d> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10503d invoke() {
            K0 k02 = K0.this;
            InterfaceC4008j<vc0.c> f7 = k02.f();
            InterfaceC4008j<Fb0.a> q11 = k02.f15522a.q();
            InterfaceC4008j<Jc0.c> D11 = k02.f15522a.D();
            return new C10503d(k02.f15522a.m(), k02.f15522a.M().k(), new I0(k02), new J0(k02), f7, k02.f15522a.a0(), k02.f15522a.r(), q11, D11);
        }
    }

    static final class b extends AbstractC7737t implements Function0<vc0.c> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final vc0.c invoke() {
            return new vc0.c(K0.this.f15522a.x().c());
        }
    }

    static final class c extends AbstractC7737t implements Function0<AuthBiometryApi> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AuthBiometryApi invoke() {
            return (AuthBiometryApi) K0.this.f15522a.M().q().getValue().create(AuthBiometryApi.class);
        }
    }

    static final class d extends AbstractC7737t implements Function0<C6910a> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C6910a invoke() {
            K0 k02 = K0.this;
            InterfaceC4008j<C10503d> e11 = k02.e();
            return new C6910a(k02.f15529h, k02.f(), k02.f15522a.F(), e11);
        }
    }

    static final class e extends AbstractC7737t implements Function0<C10702a> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10702a invoke() {
            K0 k02 = K0.this;
            InterfaceC4008j<C10503d> e11 = k02.e();
            return new C10702a(k02.f15523b, k02.f(), k02.f15522a.z(), e11);
        }
    }

    static final class f extends AbstractC7737t implements Function0<ComposerAuthApi> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComposerAuthApi invoke() {
            return (ComposerAuthApi) K0.this.f15522a.M().q().getValue().create(ComposerAuthApi.class);
        }
    }

    static final class g extends AbstractC7737t implements Function0<Kc0.d> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Kc0.d invoke() {
            K0 k02 = K0.this;
            return new Kc0.d(InterfaceC2716k.a.a(k02.f15522a.m()), k02.f15522a.k());
        }
    }

    static final class h extends AbstractC7737t implements Function0<vc0.e> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final vc0.e invoke() {
            K0 k02 = K0.this;
            return new vc0.e(k02.f15522a.x().c(), k02.f15522a.M().o());
        }
    }

    static final class i extends AbstractC7737t implements Function0<FintechRecoveryCameraApi> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final FintechRecoveryCameraApi invoke() {
            return (FintechRecoveryCameraApi) K0.this.f15522a.M().l().getValue().create(FintechRecoveryCameraApi.class);
        }
    }

    static final class j extends AbstractC7737t implements Function0<Hc0.d> {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Hc0.d invoke() {
            return new Hc0.d(K0.this.k());
        }
    }

    static final class k extends AbstractC7737t implements Function0<Kc0.l> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Kc0.l invoke() {
            return new Kc0.l(K0.this.f15522a.x().c());
        }
    }

    static final class l extends AbstractC7737t implements Function0<InstantLoginApi> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final InstantLoginApi invoke() {
            return (InstantLoginApi) K0.this.f15522a.M().q().getValue().create(InstantLoginApi.class);
        }
    }

    static final class m extends AbstractC7737t implements Function0<Kc0.p> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Kc0.p invoke() {
            K0 k02 = K0.this;
            return new Kc0.p(k02.f15531j, k02.f());
        }
    }

    public K0(@NotNull K di) {
        Intrinsics.checkNotNullParameter(di, "di");
        this.f15522a = di;
        this.f15523b = Sc.k.b(new f());
        this.f15524c = Sc.k.b(new e());
        this.f15525d = Sc.k.b(new k());
        this.f15526e = Sc.k.b(new a());
        this.f15527f = Sc.k.b(new b());
        this.f15528g = Sc.k.b(new h());
        this.f15529h = Sc.k.b(new c());
        this.f15530i = Sc.k.b(new d());
        this.f15531j = Sc.k.b(new l());
        this.f15532k = Sc.k.b(new m());
        this.f15533l = Sc.k.b(new i());
        this.f15534m = Sc.k.b(new j());
        this.f15535n = Sc.k.b(new g());
    }

    @NotNull
    public final InterfaceC4008j<C10503d> e() {
        return this.f15526e;
    }

    @NotNull
    public final InterfaceC4008j<vc0.c> f() {
        return this.f15527f;
    }

    @NotNull
    public final InterfaceC4008j<C6910a> g() {
        return this.f15530i;
    }

    @NotNull
    public final InterfaceC4008j<C10702a> h() {
        return this.f15524c;
    }

    @NotNull
    public final InterfaceC4008j<Kc0.d> i() {
        return this.f15535n;
    }

    @NotNull
    public final InterfaceC4008j<vc0.e> j() {
        return this.f15528g;
    }

    @NotNull
    public final InterfaceC4008j<FintechRecoveryCameraApi> k() {
        return this.f15533l;
    }

    @NotNull
    public final InterfaceC4008j<Hc0.d> l() {
        return this.f15534m;
    }

    @NotNull
    public final InterfaceC4008j<Kc0.l> m() {
        return this.f15525d;
    }

    @NotNull
    public final InterfaceC4008j<Kc0.p> n() {
        return this.f15532k;
    }
}
