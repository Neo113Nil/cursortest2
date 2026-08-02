package Bc0;

import Ae.E0;
import Bc0.a;
import Dc0.C;
import Kb0.K;
import Sc.InterfaceC4008j;
import Zc0.q;
import android.app.Application;
import androidx.lifecycle.C5418g0;
import id0.C7050a;
import jc0.C7340c;
import jd0.C7350c;
import jd0.C7351d;
import kc0.C7629C;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wc0.C10503d;
import xc0.C10702a;
import xe.M;
import zc0.C11086a;
import zc0.C11089d;
import zc0.C11090e;
import zc0.C11091f;
import zc0.C11092g;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K f3506a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Bc0.a f3507b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f3508c;

    static final class a extends AbstractC7737t implements Function0<Bc0.d> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bc0.d invoke() {
            b bVar = b.this;
            return new Bc0.d(bVar.f3506a, bVar.f3507b);
        }
    }

    /* renamed from: Bc0.b$b, reason: collision with other inner class name */
    static final class C0085b extends AbstractC7737t implements Function1<M, C7340c> {
        C0085b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final C7340c invoke(M m11) {
            M scope = m11;
            Intrinsics.checkNotNullParameter(scope, "scope");
            return b.this.f3507b.q("OTP", scope);
        }
    }

    static final class c extends AbstractC7737t implements Function1<M, C7340c> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final C7340c invoke(M m11) {
            M scope = m11;
            Intrinsics.checkNotNullParameter(scope, "scope");
            return b.this.f3507b.q("OTP", scope);
        }
    }

    static final class d extends AbstractC7737t implements Function1<M, C7340c> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final C7340c invoke(M m11) {
            M scope = m11;
            Intrinsics.checkNotNullParameter(scope, "scope");
            return b.this.f3507b.q("OTP", scope);
        }
    }

    static final class e extends AbstractC7737t implements Function1<M, C7340c> {
        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final C7340c invoke(M m11) {
            M scope = m11;
            Intrinsics.checkNotNullParameter(scope, "scope");
            return b.this.f3507b.q("OTP", scope);
        }
    }

    public b(@NotNull K di, @NotNull Bc0.a authDiModule) {
        Intrinsics.checkNotNullParameter(di, "di");
        Intrinsics.checkNotNullParameter(authDiModule, "authDiModule");
        this.f3506a = di;
        this.f3507b = authDiModule;
        this.f3508c = Sc.k.b(new a());
    }

    @NotNull
    public final gd0.h c(@NotNull C5418g0 savedStateHandle, @NotNull String screenId) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        K k11 = this.f3506a;
        InterfaceC4008j<C10702a> h11 = k11.W().h();
        Bc0.a aVar = this.f3507b;
        return new gd0.h(screenId, h11, aVar.h(), new C11092g(), aVar.l(), k11.a0(), aVar.k(), savedStateHandle);
    }

    @NotNull
    public final C7629C d(@NotNull C5418g0 savedStateHandle, @NotNull String screenId) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        return ((Bc0.d) this.f3508c.getValue()).d(savedStateHandle, screenId);
    }

    @NotNull
    public final C e() {
        Bc0.a aVar = this.f3507b;
        InterfaceC4008j<Nc0.f> l11 = aVar.l();
        K k11 = this.f3506a;
        return new C(k11.m(), l11, k11.W().l(), aVar.h());
    }

    @NotNull
    public final C7350c f(@NotNull String screenId) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        K k11 = this.f3506a;
        Application m11 = k11.m();
        Bc0.a aVar = this.f3507b;
        return new C7350c(screenId, m11, aVar.l(), aVar.h(), k11.C().getValue());
    }

    @NotNull
    public final Xc0.d g(@NotNull C5418g0 savedStateHandle, @NotNull String screenId) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        K k11 = this.f3506a;
        InterfaceC4008j<C7050a> a02 = k11.a0();
        Bc0.a aVar = this.f3507b;
        InterfaceC4008j<Nc0.f> l11 = aVar.l();
        InterfaceC4008j<C10702a> h11 = k11.W().h();
        InterfaceC4008j<Pc0.c> h12 = aVar.h();
        a.n k12 = aVar.k();
        return new Xc0.d(screenId, h11, h12, l11, savedStateHandle, a02, new C0085b(), new C11089d(), aVar.n(), k12);
    }

    @NotNull
    public final ec0.j h(@NotNull C5418g0 savedStateHandle, @NotNull String screenId) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        C11086a c11086a = new C11086a();
        K k11 = this.f3506a;
        InterfaceC4008j<C10702a> h11 = k11.W().h();
        InterfaceC4008j<C10503d> e11 = k11.W().e();
        Bc0.a aVar = this.f3507b;
        InterfaceC4008j<Pc0.c> h12 = aVar.h();
        InterfaceC4008j<Nc0.f> l11 = aVar.l();
        InterfaceC4008j<C7050a> a02 = k11.a0();
        return new ec0.j(screenId, c11086a, h11, e11, h12, l11, k11.N(), savedStateHandle, a02, new c(), E0.b(0, 0, null, 7), aVar.k(), k11.v().j().getValue(), k11.v().k().getValue(), k11.v().i().getValue());
    }

    @NotNull
    public final q i(@NotNull C5418g0 savedStateHandle, @NotNull String screenId) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Bc0.a aVar = this.f3507b;
        InterfaceC4008j<Pc0.c> h11 = aVar.h();
        return new q(screenId, this.f3506a.W().h(), aVar.l(), h11, savedStateHandle, aVar.n(), new d(), aVar.k());
    }

    @NotNull
    public final ad0.f j(@NotNull C5418g0 savedStateHandle, @NotNull String screenId) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Bc0.a aVar = this.f3507b;
        InterfaceC4008j<Pc0.c> h11 = aVar.h();
        C11090e c11090e = new C11090e();
        K k11 = this.f3506a;
        return new ad0.f(screenId, h11, c11090e, k11.W().h(), aVar.l(), k11.a0(), aVar.k(), savedStateHandle);
    }

    @NotNull
    public final cd0.n k(@NotNull C5418g0 savedStateHandle, @NotNull String screenId) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Bc0.a aVar = this.f3507b;
        InterfaceC4008j<Pc0.c> h11 = aVar.h();
        C11091f c11091f = new C11091f();
        K k11 = this.f3506a;
        return new cd0.n(screenId, h11, c11091f, k11.W().h(), aVar.l(), k11.a0(), k11.W().e(), E0.b(0, 0, null, 7), new e(), aVar.k(), savedStateHandle, k11.N(), k11.v().j().getValue(), k11.v().k().getValue(), k11.v().i().getValue());
    }

    @NotNull
    public final fd0.n l(@NotNull C5418g0 savedStateHandle, @NotNull String screenId) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Bc0.a aVar = this.f3507b;
        InterfaceC4008j<Nc0.f> l11 = aVar.l();
        K k11 = this.f3506a;
        return new fd0.n(screenId, k11.m(), l11, savedStateHandle, k11.W().h(), aVar.h(), aVar.k(), aVar.p(), k11.a0());
    }

    @NotNull
    public final C7351d m(@NotNull String screenId) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Bc0.a aVar = this.f3507b;
        return new C7351d(screenId, aVar.l(), aVar.h(), this.f3506a.C().getValue());
    }
}
