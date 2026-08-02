package H0;

import B0.b2;
import B1.B;
import Bl0.C2656q;
import D1.AbstractC2810k0;
import I0.C3176c0;
import I0.C3210u;
import I0.C3220z;
import I0.InterfaceC3216x;
import I0.K0;
import K1.K;
import Kk.C3532b;
import S0.V0;
import k1.C7464j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7786D;
import n1.C8408a;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class h implements V0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f10404a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final K0 f10405b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10406c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private k f10407d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC3216x f10408e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e f10409f;

    static final class a extends AbstractC7737t implements Function0<B> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final B invoke() {
            return h.this.f10407d.c();
        }
    }

    static final class b extends AbstractC7737t implements Function0<K> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final K invoke() {
            return h.this.f10407d.f();
        }
    }

    public h(long j11, K0 k02, long j12) {
        k kVar;
        kVar = k.f10421c;
        this.f10404a = j11;
        this.f10405b = k02;
        this.f10406c = j12;
        this.f10407d = kVar;
        g gVar = new g(this);
        i iVar = new i(gVar, k02, j11);
        this.f10409f = C2656q.d(C3176c0.j(androidx.compose.ui.e.f40358c0, new j(gVar, k02, j11), iVar), b2.a());
    }

    @Override // S0.V0
    public final void b() {
        this.f10408e = this.f10405b.i(new C3210u(this.f10404a, new a(), new b()));
    }

    public final void c(@NotNull InterfaceC8410c interfaceC8410c) {
        C3220z c11 = this.f10405b.f().c(this.f10404a);
        if (c11 == null) {
            return;
        }
        int c12 = !c11.c() ? c11.d().c() : c11.b().c();
        int c13 = !c11.c() ? c11.b().c() : c11.d().c();
        if (c12 == c13) {
            return;
        }
        InterfaceC3216x interfaceC3216x = this.f10408e;
        int e11 = interfaceC3216x != null ? interfaceC3216x.e() : 0;
        if (c12 > e11) {
            c12 = e11;
        }
        if (c13 > e11) {
            c13 = e11;
        }
        C7786D d11 = this.f10407d.d(c12, c13);
        if (d11 == null) {
            return;
        }
        if (!this.f10407d.e()) {
            InterfaceC8412e.X(interfaceC8410c, d11, this.f10406c, null, 60);
            return;
        }
        float f7 = C7464j.f(interfaceC8410c.i());
        float d12 = C7464j.d(interfaceC8410c.i());
        C8408a.b w02 = interfaceC8410c.w0();
        long e12 = w02.e();
        w02.a().save();
        try {
            w02.f().b(0.0f, 0.0f, f7, d12, 1);
            InterfaceC8412e.X(interfaceC8410c, d11, this.f10406c, null, 60);
        } finally {
            C3532b.b(w02, e12);
        }
    }

    @Override // S0.V0
    public final void d() {
        InterfaceC3216x interfaceC3216x = this.f10408e;
        if (interfaceC3216x != null) {
            this.f10405b.c(interfaceC3216x);
            this.f10408e = null;
        }
    }

    @Override // S0.V0
    public final void e() {
        InterfaceC3216x interfaceC3216x = this.f10408e;
        if (interfaceC3216x != null) {
            this.f10405b.c(interfaceC3216x);
            this.f10408e = null;
        }
    }

    @NotNull
    public final androidx.compose.ui.e f() {
        return this.f10409f;
    }

    public final void g(@NotNull AbstractC2810k0 abstractC2810k0) {
        this.f10407d = k.b(this.f10407d, abstractC2810k0, null, 2);
        this.f10405b.a(this.f10404a);
    }

    public final void h(@NotNull K k11) {
        K f7 = this.f10407d.f();
        if (f7 != null && !Intrinsics.d(f7.k().j(), k11.k().j())) {
            this.f10405b.g(this.f10404a);
        }
        this.f10407d = k.b(this.f10407d, null, k11, 1);
    }
}
