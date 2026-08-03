package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Rk {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.X4 f4910a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Qk f4911b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.W4 f4912c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.AbstractC0368g f4913d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.AbstractC0368g f4914e;

    /* renamed from: f, reason: collision with root package name */
    public io.appmetrica.analytics.impl.Dk f4915f;

    /* renamed from: g, reason: collision with root package name */
    public int f4916g = 0;

    public Rk(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.impl.Qk qk, io.appmetrica.analytics.impl.W4 w4, io.appmetrica.analytics.impl.C0405ha c0405ha, io.appmetrica.analytics.impl.C0863z2 c0863z2) {
        this.f4910a = x4;
        this.f4912c = w4;
        this.f4913d = c0405ha;
        this.f4914e = c0863z2;
        this.f4911b = qk;
    }

    public final synchronized long a() {
        io.appmetrica.analytics.impl.Dk dk;
        dk = this.f4915f;
        return dk == null ? 10000000000L : dk.f4222d - 1;
    }

    public final void b(io.appmetrica.analytics.impl.Dk dk, io.appmetrica.analytics.impl.P5 p5) {
        if (dk.f4225g && dk.f4222d > 0) {
            io.appmetrica.analytics.impl.W4 w4 = this.f4912c;
            io.appmetrica.analytics.impl.P5 a2 = io.appmetrica.analytics.impl.P5.a(p5, io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_ALIVE);
            io.appmetrica.analytics.impl.Tk tk = new io.appmetrica.analytics.impl.Tk();
            tk.f5032a = dk.f4222d;
            tk.f5035d = dk.f4221c.f4343a;
            long andIncrement = dk.f4224f.getAndIncrement();
            io.appmetrica.analytics.impl.Uk uk = dk.f4220b;
            uk.a(io.appmetrica.analytics.impl.Uk.f5087g, java.lang.Long.valueOf(dk.f4224f.get()));
            uk.b();
            tk.f5033b = andIncrement;
            tk.f5034c = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(java.lang.Math.max(dk.f4227i - dk.f4223e, dk.f4228j));
            w4.f5188a.f5268n.a(a2, tk);
            if (dk.f4225g) {
                dk.f4225g = false;
                io.appmetrica.analytics.impl.Uk uk2 = dk.f4220b;
                uk2.a(io.appmetrica.analytics.impl.Uk.f5089i, java.lang.Boolean.FALSE);
                uk2.b();
            }
        }
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4910a.f5267m;
        int ordinal = dk.f4221c.f4343a.ordinal();
        if (ordinal == 0) {
            publicLogger.info("Finish foreground session", new java.lang.Object[0]);
        } else if (ordinal == 1) {
            publicLogger.info("Finish background session", new java.lang.Object[0]);
        }
        synchronized (dk) {
            io.appmetrica.analytics.impl.Uk uk3 = dk.f4220b;
            uk3.getClass();
            uk3.f5092c = new io.appmetrica.analytics.impl.C0354fb();
            uk3.b();
            dk.f4226h = null;
        }
    }

    public final synchronized void c(io.appmetrica.analytics.impl.P5 p5) {
        try {
            if (this.f4916g == 0) {
                io.appmetrica.analytics.impl.Dk b2 = this.f4913d.b();
                if (a(b2, p5)) {
                    this.f4915f = b2;
                    this.f4916g = 3;
                } else {
                    io.appmetrica.analytics.impl.Dk b3 = this.f4914e.b();
                    if (a(b3, p5)) {
                        this.f4915f = b3;
                        this.f4916g = 2;
                    } else {
                        this.f4915f = null;
                        this.f4916g = 1;
                    }
                }
            }
            int a2 = io.appmetrica.analytics.impl.K7.a(this.f4916g);
            if (a2 == 0) {
                this.f4915f = a(p5);
            } else if (a2 == 1) {
                b(this.f4915f, p5);
                this.f4915f = a(p5);
            } else if (a2 == 2) {
                if (a(this.f4915f, p5)) {
                    io.appmetrica.analytics.impl.Dk dk = this.f4915f;
                    long j2 = p5.f4821i;
                    dk.f4227i = j2;
                    io.appmetrica.analytics.impl.Uk uk = dk.f4220b;
                    uk.a(io.appmetrica.analytics.impl.Uk.f5084d, java.lang.Long.valueOf(j2));
                    uk.b();
                } else {
                    this.f4915f = a(p5);
                }
            }
        } finally {
        }
    }

    public final io.appmetrica.analytics.impl.Dk a(io.appmetrica.analytics.impl.P5 p5) {
        this.f4910a.f5267m.info("Start foreground session", new java.lang.Object[0]);
        long j2 = p5.f4821i;
        io.appmetrica.analytics.impl.AbstractC0368g abstractC0368g = this.f4913d;
        io.appmetrica.analytics.impl.Ek ek = new io.appmetrica.analytics.impl.Ek(j2, p5.f4822j);
        abstractC0368g.getClass();
        io.appmetrica.analytics.impl.Dk a2 = abstractC0368g.a(ek);
        this.f4916g = 3;
        ((io.appmetrica.analytics.impl.C0477k5) this.f4910a.f5270p).e();
        io.appmetrica.analytics.impl.W4 w4 = this.f4912c;
        w4.f5188a.f5268n.a(io.appmetrica.analytics.impl.P5.a(p5, io.appmetrica.analytics.impl.C0560na.f6484I.i()), a(a2, j2));
        return a2;
    }

    public static io.appmetrica.analytics.impl.Tk a(io.appmetrica.analytics.impl.Dk dk, long j2) {
        io.appmetrica.analytics.impl.Tk tk = new io.appmetrica.analytics.impl.Tk();
        tk.f5032a = dk.f4222d;
        long andIncrement = dk.f4224f.getAndIncrement();
        io.appmetrica.analytics.impl.Uk uk = dk.f4220b;
        uk.a(io.appmetrica.analytics.impl.Uk.f5087g, java.lang.Long.valueOf(dk.f4224f.get()));
        uk.b();
        tk.f5033b = andIncrement;
        io.appmetrica.analytics.impl.Uk uk2 = dk.f4220b;
        long j3 = j2 - dk.f4223e;
        dk.f4228j = j3;
        uk2.a(io.appmetrica.analytics.impl.Uk.f5085e, java.lang.Long.valueOf(j3));
        tk.f5034c = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(dk.f4228j);
        tk.f5035d = dk.f4221c.f4343a;
        return tk;
    }

    public final synchronized io.appmetrica.analytics.impl.Dk b(io.appmetrica.analytics.impl.P5 p5) {
        try {
            if (this.f4916g == 0) {
                io.appmetrica.analytics.impl.Dk b2 = this.f4913d.b();
                if (a(b2, p5)) {
                    this.f4915f = b2;
                    this.f4916g = 3;
                } else {
                    io.appmetrica.analytics.impl.Dk b3 = this.f4914e.b();
                    if (a(b3, p5)) {
                        this.f4915f = b3;
                        this.f4916g = 2;
                    } else {
                        this.f4915f = null;
                        this.f4916g = 1;
                    }
                }
            }
            if (this.f4916g != 1 && !a(this.f4915f, p5)) {
                this.f4916g = 1;
                this.f4915f = null;
            }
            int a2 = io.appmetrica.analytics.impl.K7.a(this.f4916g);
            if (a2 == 1) {
                io.appmetrica.analytics.impl.Dk dk = this.f4915f;
                long j2 = p5.f4821i;
                dk.f4227i = j2;
                io.appmetrica.analytics.impl.Uk uk = dk.f4220b;
                uk.a(io.appmetrica.analytics.impl.Uk.f5084d, java.lang.Long.valueOf(j2));
                uk.b();
                return this.f4915f;
            }
            if (a2 != 2) {
                this.f4910a.f5267m.info("Start background session", new java.lang.Object[0]);
                this.f4916g = 2;
                long j3 = p5.f4821i;
                io.appmetrica.analytics.impl.AbstractC0368g abstractC0368g = this.f4914e;
                io.appmetrica.analytics.impl.Ek ek = new io.appmetrica.analytics.impl.Ek(j3, p5.f4822j);
                abstractC0368g.getClass();
                io.appmetrica.analytics.impl.Dk a3 = abstractC0368g.a(ek);
                if (this.f4910a.t.c()) {
                    io.appmetrica.analytics.impl.W4 w4 = this.f4912c;
                    w4.f5188a.f5268n.a(io.appmetrica.analytics.impl.P5.a(p5, io.appmetrica.analytics.impl.C0560na.f6484I.i()), a(a3, p5.f4821i));
                } else {
                    int i2 = p5.f4816d;
                    io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
                    if (i2 == 6145) {
                        io.appmetrica.analytics.impl.W4 w42 = this.f4912c;
                        w42.f5188a.f5268n.a(p5, a(a3, j3));
                        io.appmetrica.analytics.impl.W4 w43 = this.f4912c;
                        w43.f5188a.f5268n.a(io.appmetrica.analytics.impl.P5.a(p5, io.appmetrica.analytics.impl.C0560na.f6484I.i()), a(a3, j3));
                    }
                }
                this.f4915f = a3;
                return a3;
            }
            return this.f4915f;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(io.appmetrica.analytics.impl.Dk dk, io.appmetrica.analytics.impl.P5 p5) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (dk == null) {
            return false;
        }
        long j2 = p5.f4821i;
        boolean z5 = dk.f4222d >= 0;
        if (dk.f4226h == null) {
            synchronized (dk) {
                if (dk.f4226h == null) {
                    try {
                        java.lang.String asString = dk.f4219a.f5259e.a(dk.f4222d, dk.f4221c.f4343a).getAsString("report_request_parameters");
                        if (!android.text.TextUtils.isEmpty(asString)) {
                            dk.f4226h = new io.appmetrica.analytics.impl.Sk(new org.json.JSONObject(asString));
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                }
            }
        }
        io.appmetrica.analytics.impl.Sk sk = dk.f4226h;
        if (sk != null) {
            io.appmetrica.analytics.impl.C0489kh c0489kh = (io.appmetrica.analytics.impl.C0489kh) dk.f4219a.f5265k.a();
            java.util.List H2 = i1.AbstractC0191j.H(java.lang.Boolean.valueOf(android.text.TextUtils.equals(c0489kh.getAnalyticsSdkVersionName(), sk.f4974a)), java.lang.Boolean.valueOf(android.text.TextUtils.equals(c0489kh.getAnalyticsSdkBuildNumber(), sk.f4975b)), java.lang.Boolean.valueOf(android.text.TextUtils.equals(c0489kh.getAppVersion(), sk.f4976c)), java.lang.Boolean.valueOf(android.text.TextUtils.equals(c0489kh.getAppBuildNumber(), sk.f4977d)), java.lang.Boolean.valueOf(android.text.TextUtils.equals(c0489kh.getOsVersion(), sk.f4978e)), java.lang.Boolean.valueOf(sk.f4979f == c0489kh.getOsApiLevel()), java.lang.Boolean.valueOf(sk.f4980g == c0489kh.f6298r));
            if (!H2.isEmpty()) {
                java.util.Iterator it = H2.iterator();
                while (it.hasNext()) {
                    if (!((java.lang.Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            z2 = true;
            long elapsedRealtime = dk.f4229k.elapsedRealtime();
            long j3 = dk.f4227i;
            z3 = elapsedRealtime >= j3;
            long j4 = j2 - j3;
            long j5 = j2 - dk.f4223e;
            if (!z3) {
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                io.appmetrica.analytics.impl.Gk gk = dk.f4221c;
                int i2 = ((io.appmetrica.analytics.impl.C0489kh) dk.f4219a.f5265k.a()).f6286f;
                java.lang.Integer num = gk.f4346d;
                if (num != null) {
                    i2 = num.intValue();
                }
                if (j4 < timeUnit.toMillis(i2) && j5 < timeUnit.toMillis(io.appmetrica.analytics.impl.Hk.f4393a)) {
                    z4 = false;
                    if (!z5 && z2 && !z4) {
                        return true;
                    }
                    b(dk, p5);
                    return false;
                }
            }
            z4 = true;
            if (!z5) {
            }
            b(dk, p5);
            return false;
        }
        z2 = false;
        long elapsedRealtime2 = dk.f4229k.elapsedRealtime();
        long j32 = dk.f4227i;
        if (elapsedRealtime2 >= j32) {
        }
        long j42 = j2 - j32;
        long j52 = j2 - dk.f4223e;
        if (!z3) {
        }
        z4 = true;
        if (!z5) {
        }
        b(dk, p5);
        return false;
    }
}
