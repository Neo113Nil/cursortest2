package B1;

import D1.InterfaceC2796d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l1.InterfaceC7825i0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class m0 implements Z {

    /* renamed from: a, reason: collision with root package name */
    private int f2125a;

    /* renamed from: b, reason: collision with root package name */
    private int f2126b;

    /* renamed from: c, reason: collision with root package name */
    private long f2127c = Z1.r.a(0, 0);

    /* renamed from: d, reason: collision with root package name */
    private long f2128d;

    /* renamed from: e, reason: collision with root package name */
    private long f2129e;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f2130a;

        /* JADX WARN: Multi-variable type inference failed */
        public static final void a(m0 m0Var, a aVar) {
            aVar.getClass();
            if (m0Var instanceof InterfaceC2796d0) {
                ((InterfaceC2796d0) m0Var).c0(aVar.f2130a);
            }
        }

        public static void j(m0 m0Var, a aVar) {
            if (aVar.b() == Z1.s.Ltr || aVar.c() == 0) {
                a(m0Var, aVar);
                m0Var.x0(Z1.m.e(0L, m0Var.f2129e), 0.0f, null);
            } else {
                long a11 = Z1.n.a((aVar.c() - m0Var.u0()) - ((int) 0), (int) 0);
                a(m0Var, aVar);
                m0Var.x0(Z1.m.e(a11, m0Var.f2129e), 0.0f, null);
            }
        }

        public static void k(a aVar, m0 m0Var, int i11, int i12) {
            Function1<? super InterfaceC7825i0, Unit> function1;
            function1 = n0.f2133a;
            long a11 = Z1.n.a(i11, i12);
            if (aVar.b() == Z1.s.Ltr || aVar.c() == 0) {
                a(m0Var, aVar);
                m0Var.x0(Z1.m.e(a11, m0Var.f2129e), 0.0f, function1);
            } else {
                long a12 = Z1.n.a((aVar.c() - m0Var.u0()) - ((int) (a11 >> 32)), (int) (a11 & 4294967295L));
                a(m0Var, aVar);
                m0Var.x0(Z1.m.e(a12, m0Var.f2129e), 0.0f, function1);
            }
        }

        public static void l(a aVar, m0 m0Var, long j11) {
            Function1<? super InterfaceC7825i0, Unit> function1;
            function1 = n0.f2133a;
            if (aVar.b() == Z1.s.Ltr || aVar.c() == 0) {
                a(m0Var, aVar);
                m0Var.x0(Z1.m.e(j11, m0Var.f2129e), 0.0f, function1);
            } else {
                long a11 = Z1.n.a((aVar.c() - m0Var.u0()) - ((int) (j11 >> 32)), (int) (j11 & 4294967295L));
                a(m0Var, aVar);
                m0Var.x0(Z1.m.e(a11, m0Var.f2129e), 0.0f, function1);
            }
        }

        public static void m(a aVar, m0 m0Var, long j11, o1.d dVar) {
            if (aVar.b() == Z1.s.Ltr || aVar.c() == 0) {
                a(m0Var, aVar);
                m0Var.y0(Z1.m.e(j11, m0Var.f2129e), 0.0f, dVar);
            } else {
                long a11 = Z1.n.a((aVar.c() - m0Var.u0()) - ((int) (j11 >> 32)), (int) (j11 & 4294967295L));
                a(m0Var, aVar);
                m0Var.y0(Z1.m.e(a11, m0Var.f2129e), 0.0f, dVar);
            }
        }

        public static /* synthetic */ void o(a aVar, m0 m0Var, int i11, int i12, Function1 function1, int i13) {
            if ((i13 & 8) != 0) {
                function1 = n0.f2133a;
            }
            aVar.n(m0Var, i11, i12, 0.0f, function1);
        }

        public static /* synthetic */ void r(a aVar, m0 m0Var, long j11) {
            Function1<? super InterfaceC7825i0, Unit> function1;
            function1 = n0.f2133a;
            aVar.p(m0Var, j11, 0.0f, function1);
        }

        @NotNull
        protected abstract Z1.s b();

        protected abstract int c();

        public final void d(@NotNull m0 m0Var, int i11, int i12, float f7) {
            long a11 = Z1.n.a(i11, i12);
            a(m0Var, this);
            m0Var.x0(Z1.m.e(a11, m0Var.f2129e), f7, null);
        }

        public final void f(@NotNull m0 m0Var, long j11, float f7) {
            a(m0Var, this);
            m0Var.x0(Z1.m.e(j11, m0Var.f2129e), f7, null);
        }

        public final void h(@NotNull m0 m0Var, int i11, int i12, float f7) {
            long a11 = Z1.n.a(i11, i12);
            if (b() == Z1.s.Ltr || c() == 0) {
                a(m0Var, this);
                m0Var.x0(Z1.m.e(a11, m0Var.f2129e), f7, null);
            } else {
                long a12 = Z1.n.a((c() - m0Var.u0()) - ((int) (a11 >> 32)), (int) (a11 & 4294967295L));
                a(m0Var, this);
                m0Var.x0(Z1.m.e(a12, m0Var.f2129e), f7, null);
            }
        }

        public final void n(@NotNull m0 m0Var, int i11, int i12, float f7, @NotNull Function1<? super InterfaceC7825i0, Unit> function1) {
            long a11 = Z1.n.a(i11, i12);
            a(m0Var, this);
            m0Var.x0(Z1.m.e(a11, m0Var.f2129e), f7, function1);
        }

        public final void p(@NotNull m0 m0Var, long j11, float f7, @NotNull Function1<? super InterfaceC7825i0, Unit> function1) {
            a(m0Var, this);
            m0Var.x0(Z1.m.e(j11, m0Var.f2129e), f7, function1);
        }

        public final void q(@NotNull m0 m0Var, long j11, @NotNull o1.d dVar, float f7) {
            a(m0Var, this);
            m0Var.y0(Z1.m.e(j11, m0Var.f2129e), f7, dVar);
        }

        public final void s(@NotNull Function1<? super a, Unit> function1) {
            this.f2130a = true;
            function1.invoke(this);
            this.f2130a = false;
        }
    }

    public m0() {
        long j11;
        j11 = n0.f2134b;
        this.f2128d = j11;
        this.f2129e = 0L;
    }

    private final void v0() {
        this.f2125a = kotlin.ranges.h.e((int) (this.f2127c >> 32), Z1.b.m(this.f2128d), Z1.b.k(this.f2128d));
        int e11 = kotlin.ranges.h.e((int) (this.f2127c & 4294967295L), Z1.b.l(this.f2128d), Z1.b.j(this.f2128d));
        this.f2126b = e11;
        int i11 = this.f2125a;
        long j11 = this.f2127c;
        this.f2129e = Z1.n.a((i11 - ((int) (j11 >> 32))) / 2, (e11 - ((int) (j11 & 4294967295L))) / 2);
    }

    protected final void E0(long j11) {
        if (Z1.q.c(this.f2127c, j11)) {
            return;
        }
        this.f2127c = j11;
        v0();
    }

    protected final void G0(long j11) {
        if (Z1.b.e(this.f2128d, j11)) {
            return;
        }
        this.f2128d = j11;
        v0();
    }

    public long a() {
        return q0();
    }

    protected final long f0() {
        return this.f2129e;
    }

    public long j0() {
        return s0();
    }

    public final int l0() {
        return this.f2126b;
    }

    public long n0() {
        return s0();
    }

    public int o0() {
        return (int) (this.f2127c & 4294967295L);
    }

    protected final long q0() {
        return this.f2127c;
    }

    public int r0() {
        return (int) (this.f2127c >> 32);
    }

    protected final long s0() {
        return this.f2128d;
    }

    public final int u0() {
        return this.f2125a;
    }

    protected abstract void x0(long j11, float f7, Function1<? super InterfaceC7825i0, Unit> function1);

    protected void y0(long j11, float f7, @NotNull o1.d dVar) {
        x0(j11, f7, null);
    }
}
