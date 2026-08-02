package p000;

/* JADX INFO: renamed from: zt */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0963zt implements g10 {

    /* JADX INFO: renamed from: a */
    public final yc0 f9942a;

    /* JADX INFO: renamed from: b */
    public final kc1 f9943b;

    /* JADX INFO: renamed from: c */
    public final p51 f9944c;

    /* JADX INFO: renamed from: d */
    public final xz0 f9945d;

    /* JADX INFO: renamed from: e */
    public final C0463ma f9946e;

    /* JADX INFO: renamed from: f */
    public final aq0 f9947f;

    /* JADX INFO: renamed from: g */
    public final C0312i6 f9948g;

    /* JADX INFO: renamed from: h */
    public final zc0 f9949h;

    /* JADX INFO: renamed from: i */
    public final String f9950i;

    /* JADX INFO: renamed from: j */
    public boolean f9951j = false;

    public C0963zt(yc0 yc0Var, kc1 kc1Var, p51 p51Var, xz0 xz0Var, C0463ma c0463ma, aq0 aq0Var, C0312i6 c0312i6, zc0 zc0Var, String str) {
        this.f9942a = yc0Var;
        this.f9943b = kc1Var;
        this.f9944c = p51Var;
        this.f9945d = xz0Var;
        this.f9946e = c0463ma;
        this.f9947f = aq0Var;
        this.f9948g = c0312i6;
        this.f9949h = zc0Var;
        this.f9950i = str;
    }

    /* JADX INFO: renamed from: e */
    public static v92 m6031e(hm0 hm0Var, g51 g51Var) {
        qc1 qc1Var = new qc1();
        qm0 qm0Var = new qm0(new ym0(hm0Var, new C0889xt(qc1Var), t22.f7260e).m2295d(new rm0(new CallableC0541oe(1, qc1Var))), new C0889xt(qc1Var), 2);
        zg1.m5905p(g51Var, "scheduler is null");
        im0 im0Var = new im0();
        try {
            C0251gj c0251gj = new C0251gj(im0Var);
            EnumC0262gu.m2149e(im0Var, c0251gj);
            C0264gw c0264gw = (C0264gw) c0251gj.f2761k;
            InterfaceC0187eu interfaceC0187euM1987b = g51Var.m1987b(new RunnableC0529o2(c0251gj, qm0Var, 26, false));
            c0264gw.getClass();
            EnumC0262gu.m2148d(c0264gw, interfaceC0187euM1987b);
            return qc1Var.f6465a;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            wo1.m5394u(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: a */
    public final v92 m6032a(f10 f10Var) {
        if (!this.f9948g.m2543n()) {
            m6034c("render error to metrics logger");
            return new v92();
        }
        n80.m3496e("Attempting to record: render error to metrics logger");
        int i = 2;
        int i2 = 0;
        return m6031e(new C0288hj(i2, new C0288hj(i2, m6035d(), new C0398kj(i2, new C0615qe(i, this, f10Var))), new C0398kj(i2, new C0926yt(this, i))).m1876e(), this.f9944c.f5991a);
    }

    /* JADX INFO: renamed from: b */
    public final v92 m6033b() {
        if (!this.f9948g.m2543n() || this.f9951j) {
            m6034c("message impression to metrics logger");
            return new v92();
        }
        n80.m3496e("Attempting to record: message impression to metrics logger");
        int i = 0;
        return m6031e(new C0288hj(i, new C0288hj(i, m6035d(), new C0398kj(i, new C0926yt(this, i))), new C0398kj(i, new C0926yt(this, 2))).m1876e(), this.f9944c.f5991a);
    }

    /* JADX INFO: renamed from: c */
    public final void m6034c(String str) {
        if (this.f9949h.f9733b.f5009k) {
            n80.m3496e("Not recording: " + str + ". Reason: Message is test message");
            return;
        }
        if (this.f9948g.m2543n()) {
            n80.m3496e("Not recording: ".concat(str));
            return;
        }
        n80.m3496e("Not recording: " + str + ". Reason: Data collection is disabled");
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC0213fj m6035d() {
        String str = (String) this.f9949h.f9733b.f5010l;
        n80.m3496e("Attempting to record message impression in impression store for id: ".concat(str));
        C0689se c0689seM4787q = C0726te.m4787q();
        this.f9943b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c0689seM4787q.m3637c();
        C0726te.m4786o((C0726te) c0689seM4787q.f5645k, jCurrentTimeMillis);
        c0689seM4787q.m3637c();
        C0726te.m4785n((C0726te) c0689seM4787q.f5645k, str);
        C0726te c0726te = (C0726te) c0689seM4787q.m3635a();
        yc0 yc0Var = this.f9942a;
        hm0 hm0VarM5754a = yc0Var.m5754a();
        C0800ve c0800ve = yc0.f9271c;
        zg1.m5905p(c0800ve, "defaultItem is null");
        hm0 hm0VarM2295d = hm0VarM5754a.m2295d(hm0.m2292a(c0800ve));
        C0615qe c0615qe = new C0615qe(6, yc0Var, c0726te);
        int i = 2;
        C0288hj c0288hj = new C0288hj(i, hm0VarM2295d, c0615qe);
        C0270h1 c0270h1 = new C0270h1(21);
        o31 o31Var = t22.f7259d;
        C0509nj c0509njM1872a = new C0509nj(c0288hj, c0270h1, o31Var).m1872a(new C0270h1(22));
        if (!this.f9950i.equals("ON_FOREGROUND")) {
            return c0509njM1872a;
        }
        xz0 xz0Var = this.f9945d;
        hm0 hm0VarM5718a = xz0Var.m5718a();
        uz0 uz0Var = xz0.f9111d;
        zg1.m5905p(uz0Var, "defaultItem is null");
        hm0 hm0VarM2295d2 = hm0VarM5718a.m2295d(hm0.m2292a(uz0Var));
        int i2 = 0;
        return new C0288hj(i2, new C0398kj(i, new C0509nj(new C0288hj(i, hm0VarM2295d2, new vz0(xz0Var, this.f9946e, i2)), new C0270h1(23), o31Var).m1872a(new C0270h1(24))), c0509njM1872a);
    }

    /* JADX INFO: renamed from: f */
    public final v92 m6036f(e10 e10Var) {
        if (!this.f9948g.m2543n()) {
            m6034c("message dismissal to metrics logger");
            return new v92();
        }
        n80.m3496e("Attempting to record: message dismissal to metrics logger");
        C0398kj c0398kj = new C0398kj(0, new C0615qe(3, this, e10Var));
        if (!this.f9951j) {
            m6033b();
        }
        return m6031e(c0398kj.m1876e(), this.f9944c.f5991a);
    }
}
