package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: bx */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0078bx implements InterfaceC0079bz {

    /* JADX INFO: renamed from: E */
    public static final nc1 f1017E = new nc1(22);

    /* JADX INFO: renamed from: A */
    public boolean f1018A;

    /* JADX INFO: renamed from: B */
    public C0153dx f1019B;

    /* JADX INFO: renamed from: C */
    public RunnableC0146dq f1020C;

    /* JADX INFO: renamed from: D */
    public volatile boolean f1021D;

    /* JADX INFO: renamed from: l */
    public final C0892xw f1024l;

    /* JADX INFO: renamed from: m */
    public final kw0 f1025m;

    /* JADX INFO: renamed from: o */
    public final C0892xw f1027o;

    /* JADX INFO: renamed from: p */
    public final w80 f1028p;

    /* JADX INFO: renamed from: q */
    public final w80 f1029q;

    /* JADX INFO: renamed from: r */
    public final w80 f1030r;

    /* JADX INFO: renamed from: t */
    public C0117cx f1032t;

    /* JADX INFO: renamed from: u */
    public boolean f1033u;

    /* JADX INFO: renamed from: v */
    public boolean f1034v;

    /* JADX INFO: renamed from: w */
    public v11 f1035w;

    /* JADX INFO: renamed from: x */
    public int f1036x;

    /* JADX INFO: renamed from: y */
    public boolean f1037y;

    /* JADX INFO: renamed from: z */
    public t80 f1038z;

    /* JADX INFO: renamed from: j */
    public final C0041ax f1022j = new C0041ax(new ArrayList(2));

    /* JADX INFO: renamed from: k */
    public final ga1 f1023k = new ga1();

    /* JADX INFO: renamed from: s */
    public final AtomicInteger f1031s = new AtomicInteger();

    /* JADX INFO: renamed from: n */
    public final nc1 f1026n = f1017E;

    public C0078bx(w80 w80Var, w80 w80Var2, w80 w80Var3, w80 w80Var4, C0892xw c0892xw, C0892xw c0892xw2, qd0 qd0Var) {
        this.f1028p = w80Var;
        this.f1029q = w80Var2;
        this.f1030r = w80Var4;
        this.f1027o = c0892xw;
        this.f1024l = c0892xw2;
        this.f1025m = qd0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m790a(h81 h81Var, Executor executor) {
        try {
            this.f1023k.m2011a();
            this.f1022j.f653j.add(new C0966zw(h81Var, executor));
            int i = 1;
            if (this.f1037y) {
                m792d(1);
                executor.execute(new RunnableC0929yw(this, h81Var, i));
            } else if (this.f1018A) {
                m792d(1);
                executor.execute(new RunnableC0929yw(this, h81Var, 0));
            } else {
                o80.m3645f("Cannot add callbacks to a cancelled EngineJob", !this.f1021D);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.InterfaceC0079bz
    /* JADX INFO: renamed from: b */
    public final ga1 mo266b() {
        return this.f1023k;
    }

    /* JADX INFO: renamed from: c */
    public final void m791c() {
        C0153dx c0153dx;
        synchronized (this) {
            try {
                this.f1023k.m2011a();
                o80.m3645f("Not yet complete!", m793e());
                int iDecrementAndGet = this.f1031s.decrementAndGet();
                o80.m3645f("Can't decrement below 0", iDecrementAndGet >= 0);
                if (iDecrementAndGet == 0) {
                    c0153dx = this.f1019B;
                    m794f();
                } else {
                    c0153dx = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0153dx != null) {
            c0153dx.m1324b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m792d(int i) {
        C0153dx c0153dx;
        o80.m3645f("Not yet complete!", m793e());
        if (this.f1031s.getAndAdd(i) == 0 && (c0153dx = this.f1019B) != null) {
            c0153dx.m1323a();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m793e() {
        return this.f1018A || this.f1037y || this.f1021D;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m794f() {
        boolean zM1031a;
        if (this.f1032t == null) {
            throw new IllegalArgumentException();
        }
        this.f1022j.f653j.clear();
        this.f1032t = null;
        this.f1019B = null;
        this.f1035w = null;
        this.f1018A = false;
        this.f1021D = false;
        this.f1037y = false;
        RunnableC0146dq runnableC0146dq = this.f1020C;
        C0110cq c0110cq = runnableC0146dq.f1782p;
        synchronized (c0110cq) {
            c0110cq.f1418a = true;
            zM1031a = c0110cq.m1031a();
        }
        if (zM1031a) {
            runnableC0146dq.m1295k();
        }
        this.f1020C = null;
        this.f1038z = null;
        this.f1036x = 0;
        this.f1025m.mo1366a(this);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m795g(h81 h81Var) {
        try {
            this.f1023k.m2011a();
            this.f1022j.f653j.remove(new C0966zw(h81Var, wm1.f8587b));
            if (this.f1022j.f653j.isEmpty()) {
                if (!m793e()) {
                    this.f1021D = true;
                    RunnableC0146dq runnableC0146dq = this.f1020C;
                    runnableC0146dq.f1771L = true;
                    InterfaceC0625qo interfaceC0625qo = runnableC0146dq.f1769J;
                    if (interfaceC0625qo != null) {
                        interfaceC0625qo.cancel();
                    }
                    C0892xw c0892xw = this.f1027o;
                    C0117cx c0117cx = this.f1032t;
                    synchronized (c0892xw) {
                        jg0 jg0Var = c0892xw.f9094a;
                        jg0Var.getClass();
                        HashMap map = (HashMap) jg0Var.f3922k;
                        if (this == map.get(c0117cx)) {
                            map.remove(c0117cx);
                        }
                    }
                }
                if (this.f1037y || this.f1018A) {
                    if (this.f1031s.get() == 0) {
                        m794f();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
