package I0;

import I0.C3220z;
import K1.C3422b;
import k1.C7459e;
import k1.C7460f;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* renamed from: I0.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3210u implements InterfaceC3216x {

    /* renamed from: a, reason: collision with root package name */
    private final long f11606a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<B1.B> f11607b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<K1.K> f11608c;

    /* renamed from: d, reason: collision with root package name */
    private K1.K f11609d;

    /* renamed from: e, reason: collision with root package name */
    private int f11610e = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public C3210u(long j11, @NotNull Function0<? extends B1.B> function0, @NotNull Function0<K1.K> function02) {
        this.f11606a = j11;
        this.f11607b = function0;
        this.f11608c = function02;
    }

    private final synchronized int k(K1.K k11) {
        int m11;
        try {
            if (this.f11609d != k11) {
                if (k11.f() && !k11.v().e()) {
                    m11 = k11.q((int) (k11.A() & 4294967295L));
                    int m12 = k11.m() - 1;
                    if (m11 > m12) {
                        m11 = m12;
                    }
                    while (m11 >= 0 && k11.u(m11) >= ((int) (k11.A() & 4294967295L))) {
                        m11--;
                    }
                    if (m11 < 0) {
                        m11 = 0;
                    }
                    this.f11610e = k11.n(m11);
                    this.f11609d = k11;
                }
                m11 = k11.m() - 1;
                this.f11610e = k11.n(m11);
                this.f11609d = k11;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f11610e;
    }

    @Override // I0.InterfaceC3216x
    public final void a(@NotNull C3200o0 c3200o0) {
        K1.K invoke;
        B1.B v11 = v();
        if (v11 == null || (invoke = this.f11608c.invoke()) == null) {
            return;
        }
        long W11 = c3200o0.c().W(v11, 0L);
        C3212v.a(c3200o0, invoke, C7459e.j(c3200o0.d(), W11), P9.a.e(c3200o0.e()) ? 9205357640488583168L : C7459e.j(c3200o0.e(), W11), this.f11606a);
    }

    @Override // I0.InterfaceC3216x
    public final float b(int i11) {
        int p11;
        K1.K invoke = this.f11608c.invoke();
        if (invoke != null && (p11 = invoke.p(i11)) < invoke.m()) {
            return invoke.r(p11);
        }
        return -1.0f;
    }

    @Override // I0.InterfaceC3216x
    public final long c(@NotNull C3220z c3220z, boolean z11) {
        K1.K invoke;
        long j11 = this.f11606a;
        if (z11 && c3220z.d().d() != j11) {
            return 9205357640488583168L;
        }
        if ((!z11 && c3220z.b().d() != j11) || v() == null || (invoke = this.f11608c.invoke()) == null) {
            return 9205357640488583168L;
        }
        return l1.a(invoke, kotlin.ranges.h.e((z11 ? c3220z.d() : c3220z.b()).c(), 0, k(invoke)), z11, c3220z.c());
    }

    @Override // I0.InterfaceC3216x
    public final float d(int i11) {
        int p11;
        K1.K invoke = this.f11608c.invoke();
        if (invoke != null && (p11 = invoke.p(i11)) < invoke.m()) {
            return invoke.s(p11);
        }
        return -1.0f;
    }

    @Override // I0.InterfaceC3216x
    public final int e() {
        K1.K invoke = this.f11608c.invoke();
        if (invoke == null) {
            return 0;
        }
        return k(invoke);
    }

    @Override // I0.InterfaceC3216x
    public final float f(int i11) {
        int p11;
        K1.K invoke = this.f11608c.invoke();
        if (invoke == null || (p11 = invoke.p(i11)) >= invoke.m()) {
            return -1.0f;
        }
        float u11 = invoke.u(p11);
        return ((invoke.l(p11) - u11) / 2) + u11;
    }

    @Override // I0.InterfaceC3216x
    @NotNull
    public final C7460f g(int i11) {
        C7460f c7460f;
        C7460f c7460f2;
        K1.K invoke = this.f11608c.invoke();
        if (invoke == null) {
            c7460f2 = C7460f.f70279e;
            return c7460f2;
        }
        int length = invoke.k().j().length();
        if (length >= 1) {
            return invoke.d(kotlin.ranges.h.e(i11, 0, length - 1));
        }
        c7460f = C7460f.f70279e;
        return c7460f;
    }

    @Override // I0.InterfaceC3216x
    @NotNull
    public final C3422b getText() {
        K1.K invoke = this.f11608c.invoke();
        return invoke == null ? new C3422b(6, "", null) : invoke.k().j();
    }

    @Override // I0.InterfaceC3216x
    public final long h() {
        return this.f11606a;
    }

    @Override // I0.InterfaceC3216x
    public final C3220z i() {
        K1.K invoke = this.f11608c.invoke();
        if (invoke == null) {
            return null;
        }
        int length = invoke.k().j().length();
        V1.g c11 = invoke.c(0);
        long j11 = this.f11606a;
        return new C3220z(new C3220z.a(c11, 0, j11), new C3220z.a(invoke.c(Math.max(length - 1, 0)), length, j11), false);
    }

    @Override // I0.InterfaceC3216x
    public final long j(int i11) {
        long j11;
        long j12;
        K1.K invoke = this.f11608c.invoke();
        if (invoke == null) {
            j12 = K1.Q.f15009b;
            return j12;
        }
        int k11 = k(invoke);
        if (k11 < 1) {
            j11 = K1.Q.f15009b;
            return j11;
        }
        int p11 = invoke.p(kotlin.ranges.h.e(i11, 0, k11 - 1));
        return K1.S.a(invoke.t(p11), invoke.n(p11));
    }

    @Override // I0.InterfaceC3216x
    public final B1.B v() {
        B1.B invoke = this.f11607b.invoke();
        if (invoke == null || !invoke.I()) {
            return null;
        }
        return invoke;
    }
}
