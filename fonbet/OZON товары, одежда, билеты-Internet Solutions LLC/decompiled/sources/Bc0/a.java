package Bc0;

import Kb0.K;
import Sc.InterfaceC4008j;
import Vb0.b;
import android.app.Application;
import androidx.lifecycle.C5418g0;
import com.squareup.moshi.Moshi;
import ed0.C6348a;
import jc0.C7340c;
import jc0.C7344g;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.J;
import xe.M;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K f3472a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f3473b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f3474c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Sc0.a> f3475d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final n f3476e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Nc0.f> f3477f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Pc0.c> f3478g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C6348a> f3479h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C7344g> f3480i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Pc0.a> f3481j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Nc0.l> f3482k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Nc0.j> f3483l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Nc0.e> f3484m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Nc0.n> f3485n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Nc0.h> f3486o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Nc0.b> f3487p;

    /* renamed from: Bc0.a$a, reason: collision with other inner class name */
    static final class C0084a extends AbstractC7737t implements Function0<Nc0.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0084a f3488b = new C0084a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Nc0.b invoke() {
            return new Nc0.b();
        }
    }

    static final class b extends AbstractC7737t implements Function0<Pc0.a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5418g0 f3489b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C5418g0 c5418g0) {
            super(0);
            this.f3489b = c5418g0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Pc0.a invoke() {
            return new Pc0.a(this.f3489b);
        }
    }

    static final class c extends AbstractC7737t implements Function0<Pc0.c> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f3490b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f3491c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f3492d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f3493e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, a aVar, boolean z11, boolean z12) {
            super(0);
            this.f3490b = str;
            this.f3491c = aVar;
            this.f3492d = z11;
            this.f3493e = z12;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Pc0.c invoke() {
            a aVar = this.f3491c;
            Application m11 = aVar.j().m();
            InterfaceC4008j<C7344g> o11 = aVar.o();
            InterfaceC4008j interfaceC4008j = aVar.f3481j;
            InterfaceC4008j<Nc0.f> l11 = aVar.l();
            InterfaceC4008j<Ib0.e> p11 = aVar.j().p();
            return new Pc0.c(this.f3490b, m11, this.f3492d, this.f3493e, o11, interfaceC4008j, l11, p11);
        }
    }

    static final class d extends AbstractC7737t implements Function0<Bc0.b> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bc0.b invoke() {
            a aVar = a.this;
            return new Bc0.b(aVar.j(), aVar);
        }
    }

    static final class e extends AbstractC7737t implements Function0<Nc0.e> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Nc0.e invoke() {
            return new Nc0.e(a.this.f3482k);
        }
    }

    static final class f extends AbstractC7737t implements Function0<Nc0.f> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Nc0.f invoke() {
            a aVar = a.this;
            return new Nc0.f((Nc0.k) aVar.f3482k.getValue(), (Nc0.i) aVar.f3483l.getValue(), (Nc0.d) aVar.f3484m.getValue(), (Nc0.m) aVar.f3485n.getValue(), (Nc0.g) aVar.f3486o.getValue(), (Nc0.a) aVar.f3487p.getValue(), (Nc0.c) aVar.f3481j.getValue());
        }
    }

    static final class g extends AbstractC7737t implements Function0<Bc0.f> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bc0.f invoke() {
            return new Bc0.f(a.this.j());
        }
    }

    static final class h extends AbstractC7737t implements Function0<Nc0.h> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f3498b = new h(0);

        @Override // kotlin.jvm.functions.Function0
        public final Nc0.h invoke() {
            return new Nc0.h();
        }
    }

    static final class i extends AbstractC7737t implements Function0<Sc0.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f3499b = new i(0);

        @Override // kotlin.jvm.functions.Function0
        public final Sc0.a invoke() {
            return new Sc0.a();
        }
    }

    static final class j extends AbstractC7737t implements Function0<C7344g> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f3500b = new j(0);

        @Override // kotlin.jvm.functions.Function0
        public final C7344g invoke() {
            return new C7344g();
        }
    }

    static final class k extends AbstractC7737t implements Function0<Nc0.j> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f3501b = new k(0);

        @Override // kotlin.jvm.functions.Function0
        public final Nc0.j invoke() {
            return new Nc0.j();
        }
    }

    static final class l extends AbstractC7737t implements Function0<C6348a> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C6348a invoke() {
            a aVar = a.this;
            Fb0.f ozonIdConfig = aVar.j().N();
            InterfaceC4008j<Moshi> moshi = aVar.j().M().o();
            Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            return new C6348a(ozonIdConfig, moshi);
        }
    }

    static final class m extends AbstractC7737t implements Function0<Nc0.l> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Nc0.l invoke() {
            a aVar = a.this;
            return new Nc0.l(aVar.j().a0(), aVar.j().U(), aVar.j().z());
        }
    }

    public static final class n extends kotlin.coroutines.a implements J {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f3504a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(J.a aVar, a aVar2) {
            super(aVar);
            this.f3504a = aVar2;
        }

        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            b.a.c(Vb0.b.f28514a, th2);
            this.f3504a.l().getValue().v(th2);
        }
    }

    static final class o extends AbstractC7737t implements Function0<Nc0.n> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f3505b = new o(0);

        @Override // kotlin.jvm.functions.Function0
        public final Nc0.n invoke() {
            return new Nc0.n();
        }
    }

    public a(@NotNull K di, String str, @NotNull C5418g0 savedStateHandle, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(di, "di");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.f3472a = di;
        this.f3473b = Sc.k.b(new g());
        this.f3474c = Sc.k.b(new d());
        this.f3475d = Sc.k.b(i.f3499b);
        this.f3476e = new n(J.f105405n0, this);
        this.f3477f = Sc.k.b(new f());
        this.f3478g = Sc.k.b(new c(str, this, z11, z12));
        this.f3479h = Sc.k.b(new l());
        this.f3480i = Sc.k.b(j.f3500b);
        this.f3481j = Sc.k.b(new b(savedStateHandle));
        this.f3482k = Sc.k.b(new m());
        this.f3483l = Sc.k.b(k.f3501b);
        this.f3484m = Sc.k.b(new e());
        this.f3485n = Sc.k.b(o.f3505b);
        this.f3486o = Sc.k.b(h.f3498b);
        this.f3487p = Sc.k.b(C0084a.f3488b);
    }

    @NotNull
    public final InterfaceC4008j<Pc0.c> h() {
        return this.f3478g;
    }

    @NotNull
    public final Bc0.b i() {
        return (Bc0.b) this.f3474c.getValue();
    }

    @NotNull
    public final K j() {
        return this.f3472a;
    }

    @NotNull
    public final n k() {
        return this.f3476e;
    }

    @NotNull
    public final InterfaceC4008j<Nc0.f> l() {
        return this.f3477f;
    }

    @NotNull
    public final Bc0.f m() {
        return (Bc0.f) this.f3473b.getValue();
    }

    @NotNull
    public final InterfaceC4008j<Sc0.a> n() {
        return this.f3475d;
    }

    @NotNull
    public final InterfaceC4008j<C7344g> o() {
        return this.f3480i;
    }

    @NotNull
    public final InterfaceC4008j<C6348a> p() {
        return this.f3479h;
    }

    @NotNull
    public final C7340c q(@NotNull String biometryDialogRequestKey, @NotNull M scope) {
        Intrinsics.checkNotNullParameter(biometryDialogRequestKey, "biometryDialogRequestKey");
        Intrinsics.checkNotNullParameter(scope, "scope");
        InterfaceC4008j<Nc0.f> interfaceC4008j = this.f3477f;
        K k11 = this.f3472a;
        InterfaceC4008j<Fb0.a> q11 = k11.q();
        InterfaceC4008j<Jc0.c> D11 = k11.D();
        return new C7340c(biometryDialogRequestKey, scope, interfaceC4008j, k11.W().h(), this.f3478g, q11, D11);
    }
}
