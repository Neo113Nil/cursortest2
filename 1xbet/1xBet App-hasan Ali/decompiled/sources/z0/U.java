package z0;

import A0.C0060u;
import w0.AbstractC2540a;

/* loaded from: classes.dex */
public final class U extends x0.Z implements x0.N, InterfaceC2742a, InterfaceC2743a0 {

    /* renamed from: D, reason: collision with root package name */
    public boolean f21705D;

    /* renamed from: F, reason: collision with root package name */
    public Object f21707F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f21708G;

    /* renamed from: p, reason: collision with root package name */
    public final C2735K f21709p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21710q;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21714u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f21715v;

    /* renamed from: w, reason: collision with root package name */
    public W0.a f21716w;

    /* renamed from: y, reason: collision with root package name */
    public i4.c f21718y;

    /* renamed from: r, reason: collision with root package name */
    public int f21711r = Integer.MAX_VALUE;

    /* renamed from: s, reason: collision with root package name */
    public int f21712s = Integer.MAX_VALUE;

    /* renamed from: t, reason: collision with root package name */
    public EnumC2729E f21713t = EnumC2729E.f21594m;

    /* renamed from: x, reason: collision with root package name */
    public long f21717x = 0;

    /* renamed from: z, reason: collision with root package name */
    public EnumC2741Q f21719z = EnumC2741Q.f21695m;

    /* renamed from: A, reason: collision with root package name */
    public final C2732H f21702A = new C2732H(this, 1);

    /* renamed from: B, reason: collision with root package name */
    public final R.e f21703B = new R.e(new U[16]);

    /* renamed from: C, reason: collision with root package name */
    public boolean f21704C = true;

    /* renamed from: E, reason: collision with root package name */
    public boolean f21706E = true;

    public U(C2735K c2735k) {
        this.f21709p = c2735k;
        this.f21707F = c2735k.f21663p.f21732A;
    }

    @Override // z0.InterfaceC2742a
    public final boolean A() {
        return this.f21719z != EnumC2741Q.f21695m;
    }

    @Override // x0.N
    public final int L(int i) {
        k0();
        AbstractC2740P G02 = this.f21709p.a().G0();
        kotlin.jvm.internal.l.c(G02);
        return G02.L(i);
    }

    @Override // z0.InterfaceC2742a
    public final void O() {
        C2731G.U(this.f21709p.f21650a, false, 7);
    }

    @Override // x0.N
    public final int T(int i) {
        k0();
        AbstractC2740P G02 = this.f21709p.a().G0();
        kotlin.jvm.internal.l.c(G02);
        return G02.T(i);
    }

    @Override // x0.N
    public final int U(int i) {
        k0();
        AbstractC2740P G02 = this.f21709p.a().G0();
        kotlin.jvm.internal.l.c(G02);
        return G02.U(i);
    }

    @Override // x0.Z
    public final void Z(long j5, float f, i4.c cVar) {
        m0(j5, cVar);
    }

    @Override // z0.InterfaceC2742a
    public final C2732H a() {
        return this.f21702A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 != null ? r1.f21613P.f21653d : null) == z0.EnumC2727C.f21588n) goto L13;
     */
    @Override // x0.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x0.Z e(long j5) {
        EnumC2729E enumC2729E;
        C2735K c2735k = this.f21709p;
        C2731G u5 = c2735k.f21650a.u();
        if ((u5 != null ? u5.f21613P.f21653d : null) != EnumC2727C.f21586l) {
            C2731G u6 = c2735k.f21650a.u();
        }
        c2735k.f21651b = false;
        C2731G c2731g = c2735k.f21650a;
        C2731G u7 = c2731g.u();
        if (u7 != null) {
            if (this.f21713t != EnumC2729E.f21594m && !c2731g.f21611N) {
                AbstractC2540a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            C2735K c2735k2 = u7.f21613P;
            int ordinal = c2735k2.f21653d.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                enumC2729E = EnumC2729E.f21592k;
            } else {
                if (ordinal != 2 && ordinal != 3) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + c2735k2.f21653d);
                }
                enumC2729E = EnumC2729E.f21593l;
            }
            this.f21713t = enumC2729E;
        } else {
            this.f21713t = EnumC2729E.f21594m;
        }
        C2731G c2731g2 = c2735k.f21650a;
        if (c2731g2.f21609L == EnumC2729E.f21594m) {
            c2731g2.c();
        }
        n0(j5);
        return this;
    }

    @Override // x0.N
    public final int f(int i) {
        k0();
        AbstractC2740P G02 = this.f21709p.a().G0();
        kotlin.jvm.internal.l.c(G02);
        return G02.f(i);
    }

    public final void f0(boolean z3) {
        C2735K c2735k = this.f21709p;
        if (z3 && c2735k.f21652c) {
            return;
        }
        if (z3 || c2735k.f21652c) {
            this.f21719z = EnumC2741Q.f21695m;
            R.e y5 = c2735k.f21650a.y();
            Object[] objArr = y5.f5106k;
            int i = y5.f5108m;
            for (int i5 = 0; i5 < i; i5++) {
                U u5 = ((C2731G) objArr[i5]).f21613P.f21664q;
                kotlin.jvm.internal.l.c(u5);
                u5.f0(true);
            }
        }
    }

    public final void g0() {
        EnumC2741Q enumC2741Q = this.f21719z;
        C2735K c2735k = this.f21709p;
        boolean z3 = c2735k.f21652c;
        EnumC2741Q enumC2741Q2 = EnumC2741Q.f21693k;
        if (z3) {
            this.f21719z = EnumC2741Q.f21694l;
        } else {
            this.f21719z = enumC2741Q2;
        }
        C2731G c2731g = c2735k.f21650a;
        if (enumC2741Q != enumC2741Q2 && c2735k.f21654e) {
            C2731G.U(c2731g, true, 6);
        }
        R.e y5 = c2731g.y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            C2731G c2731g2 = (C2731G) objArr[i5];
            U u5 = c2731g2.f21613P.f21664q;
            if (u5 == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (u5.f21712s != Integer.MAX_VALUE) {
                u5.g0();
                C2731G.X(c2731g2);
            }
        }
    }

    @Override // z0.InterfaceC2742a
    public final void j(t0.F f) {
        R.e y5 = this.f21709p.f21650a.y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            U u5 = ((C2731G) objArr[i5]).f21613P.f21664q;
            kotlin.jvm.internal.l.c(u5);
            f.c(u5);
        }
    }

    public final void j0() {
        C2735K c2735k = this.f21709p;
        if (c2735k.f21662o > 0) {
            R.e y5 = c2735k.f21650a.y();
            Object[] objArr = y5.f5106k;
            int i = y5.f5108m;
            for (int i5 = 0; i5 < i; i5++) {
                C2731G c2731g = (C2731G) objArr[i5];
                C2735K c2735k2 = c2731g.f21613P;
                if ((c2735k2.f21660m || c2735k2.f21661n) && !c2735k2.f) {
                    c2731g.T(false);
                }
                U u5 = c2735k2.f21664q;
                if (u5 != null) {
                    u5.j0();
                }
            }
        }
    }

    @Override // x0.Z, x0.N
    public final Object k() {
        return this.f21707F;
    }

    public final void k0() {
        C2735K c2735k = this.f21709p;
        C2731G.U(c2735k.f21650a, false, 7);
        C2731G c2731g = c2735k.f21650a;
        C2731G u5 = c2731g.u();
        if (u5 == null || c2731g.f21609L != EnumC2729E.f21594m) {
            return;
        }
        int ordinal = u5.f21613P.f21653d.ordinal();
        c2731g.f21609L = ordinal != 0 ? ordinal != 2 ? u5.f21609L : EnumC2729E.f21593l : EnumC2729E.f21592k;
    }

    public final void l0() {
        C2735K c2735k;
        EnumC2727C enumC2727C;
        this.f21708G = true;
        C2735K c2735k2 = this.f21709p;
        C2731G u5 = c2735k2.f21650a.u();
        EnumC2741Q enumC2741Q = this.f21719z;
        if ((enumC2741Q != EnumC2741Q.f21693k && !c2735k2.f21652c) || (enumC2741Q != EnumC2741Q.f21694l && c2735k2.f21652c)) {
            g0();
            if (this.f21710q && u5 != null) {
                u5.T(false);
            }
        }
        if (u5 == null) {
            this.f21712s = 0;
        } else if (!this.f21710q && ((enumC2727C = (c2735k = u5.f21613P).f21653d) == EnumC2727C.f21587m || enumC2727C == EnumC2727C.f21588n)) {
            if (this.f21712s != Integer.MAX_VALUE) {
                AbstractC2540a.b("Place was called on a node which was placed already");
            }
            int i = c2735k.f21656h;
            this.f21712s = i;
            c2735k.f21656h = i + 1;
        }
        v();
    }

    @Override // z0.InterfaceC2743a0
    public final void m(boolean z3) {
        AbstractC2740P G02;
        C2735K c2735k = this.f21709p;
        AbstractC2740P G03 = c2735k.a().G0();
        if (Boolean.valueOf(z3).equals(G03 != null ? Boolean.valueOf(G03.f21681s) : null) || (G02 = c2735k.a().G0()) == null) {
            return;
        }
        G02.f21681s = z3;
    }

    public final void m0(long j5, i4.c cVar) {
        C2735K c2735k = this.f21709p;
        C2731G c2731g = c2735k.f21650a;
        C2731G c2731g2 = c2735k.f21650a;
        try {
            C2731G u5 = c2731g.u();
            EnumC2727C enumC2727C = u5 != null ? u5.f21613P.f21653d : null;
            EnumC2727C enumC2727C2 = EnumC2727C.f21588n;
            if (enumC2727C == enumC2727C2) {
                c2735k.f21652c = false;
            }
            if (c2731g2.f21623Z) {
                AbstractC2540a.a("place is called on a deactivated node");
            }
            c2735k.f21653d = enumC2727C2;
            this.f21714u = true;
            this.f21708G = false;
            if (!W0.j.a(j5, this.f21717x)) {
                if (c2735k.f21661n || c2735k.f21660m) {
                    c2735k.f = true;
                }
                j0();
            }
            n0 a5 = AbstractC2734J.a(c2731g2);
            if (c2735k.f || !A()) {
                c2735k.h(false);
                this.f21702A.f21644e = false;
                p0 snapshotObserver = ((A0.F) a5).getSnapshotObserver();
                T t5 = new T(this, a5, j5);
                snapshotObserver.getClass();
                if (c2731g2.f21630q != null) {
                    snapshotObserver.a(c2731g2, snapshotObserver.f21848g, t5);
                } else {
                    snapshotObserver.a(c2731g2, snapshotObserver.f, t5);
                }
            } else {
                AbstractC2740P G02 = c2735k.a().G0();
                kotlin.jvm.internal.l.c(G02);
                G02.z0(W0.j.c(j5, G02.f20977o));
                l0();
            }
            this.f21717x = j5;
            this.f21718y = cVar;
            c2735k.f21653d = EnumC2727C.f21589o;
        } catch (Throwable th) {
            c2731g.Z(th);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0075, B:33:0x0080, B:34:0x008a, B:38:0x009b, B:39:0x00a0, B:41:0x00b6, B:46:0x0083), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0060->B:29:0x0062, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0075, B:33:0x0080, B:34:0x008a, B:38:0x009b, B:39:0x00a0, B:41:0x00b6, B:46:0x0083), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0075, B:33:0x0080, B:34:0x008a, B:38:0x009b, B:39:0x00a0, B:41:0x00b6, B:46:0x0083), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0075, B:33:0x0080, B:34:0x008a, B:38:0x009b, B:39:0x00a0, B:41:0x00b6, B:46:0x0083), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0062, B:31:0x0075, B:33:0x0080, B:34:0x008a, B:38:0x009b, B:39:0x00a0, B:41:0x00b6, B:46:0x0083), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n0(long j5) {
        boolean z3;
        int i;
        int i5;
        long j6;
        AbstractC2740P G02;
        C2735K c2735k = this.f21709p;
        C2731G c2731g = c2735k.f21650a;
        C2731G c2731g2 = c2735k.f21650a;
        try {
            if (c2731g.f21623Z) {
                AbstractC2540a.a("measure is called on a deactivated node");
            }
            C2731G u5 = c2731g2.u();
            if (!c2731g2.f21611N && (u5 == null || !u5.f21611N)) {
                z3 = false;
                c2731g2.f21611N = z3;
                if (!c2731g2.f21613P.f21654e) {
                    W0.a aVar = this.f21716w;
                    if (aVar == null ? false : W0.a.b(aVar.f6000a, j5)) {
                        A0.F f = c2731g2.f21636w;
                        if (f != null) {
                            f.o(c2731g2, true);
                        }
                        c2731g2.Y();
                        return false;
                    }
                }
                this.f21716w = new W0.a(j5);
                e0(j5);
                this.f21702A.f21643d = false;
                R.e y5 = c2731g2.y();
                Object[] objArr = y5.f5106k;
                i = y5.f5108m;
                for (i5 = 0; i5 < i; i5++) {
                    U u6 = ((C2731G) objArr[i5]).f21613P.f21664q;
                    kotlin.jvm.internal.l.c(u6);
                    u6.f21702A.getClass();
                }
                if (this.f21715v) {
                    long j7 = Integer.MIN_VALUE;
                    j6 = (j7 & 4294967295L) | (j7 << 32);
                } else {
                    j6 = this.f20975m;
                }
                this.f21715v = true;
                G02 = c2735k.a().G0();
                if (!(G02 == null)) {
                    AbstractC2540a.b("Lookahead result from lookaheadRemeasure cannot be null");
                }
                c2735k.c(j5);
                c0((G02.f20974l & 4294967295L) | (G02.f20973k << 32));
                return ((int) (j6 >> 32)) == G02.f20973k || ((int) (j6 & 4294967295L)) != G02.f20974l;
            }
            z3 = true;
            c2731g2.f21611N = z3;
            if (!c2731g2.f21613P.f21654e) {
            }
            this.f21716w = new W0.a(j5);
            e0(j5);
            this.f21702A.f21643d = false;
            R.e y52 = c2731g2.y();
            Object[] objArr2 = y52.f5106k;
            i = y52.f5108m;
            while (i5 < i) {
            }
            if (this.f21715v) {
            }
            this.f21715v = true;
            G02 = c2735k.a().G0();
            if (!(G02 == null)) {
            }
            c2735k.c(j5);
            c0((G02.f20974l & 4294967295L) | (G02.f20973k << 32));
            if (((int) (j6 >> 32)) == G02.f20973k) {
            }
        } catch (Throwable th) {
            c2731g.Z(th);
            throw null;
        }
    }

    @Override // z0.InterfaceC2742a
    public final C2761s r() {
        return this.f21709p.f21650a.f21612O.f21768c;
    }

    @Override // z0.InterfaceC2742a
    public final void requestLayout() {
        this.f21709p.f21650a.T(false);
    }

    @Override // z0.InterfaceC2742a
    public final InterfaceC2742a u() {
        C2735K c2735k;
        C2731G u5 = this.f21709p.f21650a.u();
        if (u5 == null || (c2735k = u5.f21613P) == null) {
            return null;
        }
        return c2735k.f21664q;
    }

    @Override // z0.InterfaceC2742a
    public final void v() {
        this.f21705D = true;
        C2732H c2732h = this.f21702A;
        c2732h.h();
        C2735K c2735k = this.f21709p;
        boolean z3 = c2735k.f;
        C2731G c2731g = c2735k.f21650a;
        if (z3) {
            R.e y5 = c2731g.y();
            Object[] objArr = y5.f5106k;
            int i = y5.f5108m;
            for (int i5 = 0; i5 < i; i5++) {
                C2731G c2731g2 = (C2731G) objArr[i5];
                if (c2731g2.f21613P.f21654e && c2731g2.s() == EnumC2729E.f21592k) {
                    C2735K c2735k2 = c2731g2.f21613P;
                    U u5 = c2735k2.f21664q;
                    kotlin.jvm.internal.l.c(u5);
                    U u6 = c2735k2.f21664q;
                    W0.a aVar = u6 != null ? u6.f21716w : null;
                    kotlin.jvm.internal.l.c(aVar);
                    if (u5.n0(aVar.f6000a)) {
                        C2731G.U(c2731g, false, 7);
                    }
                }
            }
        }
        r rVar = r().f21857Z;
        kotlin.jvm.internal.l.c(rVar);
        if (c2735k.f21655g || (!rVar.f21683u && c2735k.f)) {
            c2735k.f = false;
            EnumC2727C enumC2727C = c2735k.f21653d;
            c2735k.f21653d = EnumC2727C.f21588n;
            n0 a5 = AbstractC2734J.a(c2731g);
            c2735k.i(false);
            p0 snapshotObserver = ((A0.F) a5).getSnapshotObserver();
            C0060u c0060u = new C0060u(14, this, rVar);
            snapshotObserver.getClass();
            if (c2731g.f21630q != null) {
                snapshotObserver.a(c2731g, snapshotObserver.f21849h, c0060u);
            } else {
                snapshotObserver.a(c2731g, snapshotObserver.f21847e, c0060u);
            }
            c2735k.f21653d = enumC2727C;
            if (c2735k.f21660m && rVar.f21683u) {
                requestLayout();
            }
            c2735k.f21655g = false;
        }
        if (c2732h.f21641b && c2732h.e()) {
            c2732h.g();
        }
        this.f21705D = false;
    }
}
