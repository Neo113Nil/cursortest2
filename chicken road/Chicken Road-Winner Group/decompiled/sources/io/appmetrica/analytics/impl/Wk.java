package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import e2.AbstractC0293h;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Wk {

    /* renamed from: a, reason: collision with root package name */
    public final C0459e5 f6799a;

    /* renamed from: b, reason: collision with root package name */
    public final Vk f6800b;

    /* renamed from: c, reason: collision with root package name */
    public final C0434d5 f6801c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0505g f6802d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0505g f6803e;
    public Ik f;

    /* renamed from: g, reason: collision with root package name */
    public int f6804g = 0;

    public Wk(C0459e5 c0459e5, Vk vk, C0434d5 c0434d5, C0723oa c0723oa, H2 h22) {
        this.f6799a = c0459e5;
        this.f6801c = c0434d5;
        this.f6802d = c0723oa;
        this.f6803e = h22;
        this.f6800b = vk;
    }

    public final synchronized long a() {
        Ik ik;
        ik = this.f;
        return ik == null ? 10000000000L : ik.f6118d - 1;
    }

    public final void b(Ik ik, W5 w5) {
        if (ik.f6120g && ik.f6118d > 0) {
            C0434d5 c0434d5 = this.f6801c;
            W5 a3 = W5.a(w5, EnumC0569ib.EVENT_TYPE_ALIVE);
            Yk yk = new Yk();
            yk.f6876a = ik.f6118d;
            yk.f6879d = ik.f6117c.f6242a;
            long andIncrement = ik.f.getAndIncrement();
            Zk zk = ik.f6116b;
            zk.a(Zk.f6920g, Long.valueOf(ik.f.get()));
            zk.b();
            yk.f6877b = andIncrement;
            yk.f6878c = TimeUnit.MILLISECONDS.toSeconds(Math.max(ik.f6122i - ik.f6119e, ik.f6123j));
            c0434d5.f7140a.f7205n.a(a3, yk);
            if (ik.f6120g) {
                ik.f6120g = false;
                Zk zk2 = ik.f6116b;
                zk2.a(Zk.f6922i, Boolean.FALSE);
                zk2.b();
            }
        }
        PublicLogger publicLogger = this.f6799a.f7204m;
        int ordinal = ik.f6117c.f6242a.ordinal();
        if (ordinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (ordinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (ik) {
            Zk zk3 = ik.f6116b;
            zk3.getClass();
            zk3.f6925c = new C0672mb();
            zk3.b();
            ik.f6121h = null;
        }
    }

    public final synchronized void c(W5 w5) {
        try {
            if (this.f6804g == 0) {
                Ik b3 = this.f6802d.b();
                if (a(b3, w5)) {
                    this.f = b3;
                    this.f6804g = 3;
                } else {
                    Ik b4 = this.f6803e.b();
                    if (a(b4, w5)) {
                        this.f = b4;
                        this.f6804g = 2;
                    } else {
                        this.f = null;
                        this.f6804g = 1;
                    }
                }
            }
            int a3 = Q7.a(this.f6804g);
            if (a3 == 0) {
                this.f = a(w5);
            } else if (a3 == 1) {
                b(this.f, w5);
                this.f = a(w5);
            } else if (a3 == 2) {
                if (a(this.f, w5)) {
                    Ik ik = this.f;
                    long j3 = w5.f6782i;
                    ik.f6122i = j3;
                    Zk zk = ik.f6116b;
                    zk.a(Zk.f6918d, Long.valueOf(j3));
                    zk.b();
                } else {
                    this.f = a(w5);
                }
            }
        } finally {
        }
    }

    public final Ik a(W5 w5) {
        this.f6799a.f7204m.info("Start foreground session", new Object[0]);
        long j3 = w5.f6782i;
        AbstractC0505g abstractC0505g = this.f6802d;
        Jk jk = new Jk(j3, w5.f6783j);
        abstractC0505g.getClass();
        Ik a3 = abstractC0505g.a(jk);
        this.f6804g = 3;
        ((C0795r5) this.f6799a.f7207p).e();
        C0434d5 c0434d5 = this.f6801c;
        c0434d5.f7140a.f7205n.a(W5.a(w5, C0878ua.f8414H.i()), a(a3, j3));
        return a3;
    }

    public static Yk a(Ik ik, long j3) {
        Yk yk = new Yk();
        yk.f6876a = ik.f6118d;
        long andIncrement = ik.f.getAndIncrement();
        Zk zk = ik.f6116b;
        zk.a(Zk.f6920g, Long.valueOf(ik.f.get()));
        zk.b();
        yk.f6877b = andIncrement;
        Zk zk2 = ik.f6116b;
        long j4 = j3 - ik.f6119e;
        ik.f6123j = j4;
        zk2.a(Zk.f6919e, Long.valueOf(j4));
        yk.f6878c = TimeUnit.MILLISECONDS.toSeconds(ik.f6123j);
        yk.f6879d = ik.f6117c.f6242a;
        return yk;
    }

    public final synchronized Ik b(W5 w5) {
        try {
            if (this.f6804g == 0) {
                Ik b3 = this.f6802d.b();
                if (a(b3, w5)) {
                    this.f = b3;
                    this.f6804g = 3;
                } else {
                    Ik b4 = this.f6803e.b();
                    if (a(b4, w5)) {
                        this.f = b4;
                        this.f6804g = 2;
                    } else {
                        this.f = null;
                        this.f6804g = 1;
                    }
                }
            }
            if (this.f6804g != 1 && !a(this.f, w5)) {
                this.f6804g = 1;
                this.f = null;
            }
            int a3 = Q7.a(this.f6804g);
            if (a3 == 1) {
                Ik ik = this.f;
                long j3 = w5.f6782i;
                ik.f6122i = j3;
                Zk zk = ik.f6116b;
                zk.a(Zk.f6918d, Long.valueOf(j3));
                zk.b();
                return this.f;
            }
            if (a3 != 2) {
                this.f6799a.f7204m.info("Start background session", new Object[0]);
                this.f6804g = 2;
                long j4 = w5.f6782i;
                AbstractC0505g abstractC0505g = this.f6803e;
                Jk jk = new Jk(j4, w5.f6783j);
                abstractC0505g.getClass();
                Ik a4 = abstractC0505g.a(jk);
                if (this.f6799a.f7211t.c()) {
                    C0434d5 c0434d5 = this.f6801c;
                    c0434d5.f7140a.f7205n.a(W5.a(w5, C0878ua.f8414H.i()), a(a4, w5.f6782i));
                } else {
                    int i3 = w5.f6778d;
                    EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
                    if (i3 == 6145) {
                        C0434d5 c0434d52 = this.f6801c;
                        c0434d52.f7140a.f7205n.a(w5, a(a4, j4));
                        C0434d5 c0434d53 = this.f6801c;
                        c0434d53.f7140a.f7205n.a(W5.a(w5, C0878ua.f8414H.i()), a(a4, j4));
                    }
                }
                this.f = a4;
                return a4;
            }
            return this.f;
        } catch (Throwable th) {
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
    public final boolean a(Ik ik, W5 w5) {
        boolean z3;
        boolean z4;
        boolean z5;
        if (ik == null) {
            return false;
        }
        long j3 = w5.f6782i;
        boolean z6 = ik.f6118d >= 0;
        if (ik.f6121h == null) {
            synchronized (ik) {
                if (ik.f6121h == null) {
                    try {
                        String asString = ik.f6115a.f7197e.a(ik.f6118d, ik.f6117c.f6242a).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            ik.f6121h = new Xk(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        Xk xk = ik.f6121h;
        if (xk != null) {
            C0756ph c0756ph = (C0756ph) ik.f6115a.f7202k.a();
            List S2 = AbstractC0293h.S(Boolean.valueOf(TextUtils.equals(c0756ph.getAnalyticsSdkVersionName(), xk.f6834a)), Boolean.valueOf(TextUtils.equals(c0756ph.getAnalyticsSdkBuildNumber(), xk.f6835b)), Boolean.valueOf(TextUtils.equals(c0756ph.getAppVersion(), xk.f6836c)), Boolean.valueOf(TextUtils.equals(c0756ph.getAppBuildNumber(), xk.f6837d)), Boolean.valueOf(TextUtils.equals(c0756ph.getOsVersion(), xk.f6838e)), Boolean.valueOf(xk.f == c0756ph.getOsApiLevel()), Boolean.valueOf(xk.f6839g == c0756ph.f8084r));
            if (!S2.isEmpty()) {
                Iterator it = S2.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            z3 = true;
            long elapsedRealtime = ik.f6124k.elapsedRealtime();
            long j4 = ik.f6122i;
            z4 = elapsedRealtime >= j4;
            long j5 = j3 - j4;
            long j6 = j3 - ik.f6119e;
            if (!z4) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Lk lk = ik.f6117c;
                int i3 = ((C0756ph) ik.f6115a.f7202k.a()).f;
                Integer num = lk.f6245d;
                if (num != null) {
                    i3 = num.intValue();
                }
                if (j5 < timeUnit.toMillis(i3) && j6 < timeUnit.toMillis(Mk.f6301a)) {
                    z5 = false;
                    if (!z6 && z3 && !z5) {
                        return true;
                    }
                    b(ik, w5);
                    return false;
                }
            }
            z5 = true;
            if (!z6) {
            }
            b(ik, w5);
            return false;
        }
        z3 = false;
        long elapsedRealtime2 = ik.f6124k.elapsedRealtime();
        long j42 = ik.f6122i;
        if (elapsedRealtime2 >= j42) {
        }
        long j52 = j3 - j42;
        long j62 = j3 - ik.f6119e;
        if (!z4) {
        }
        z5 = true;
        if (!z6) {
        }
        b(ik, w5);
        return false;
    }
}
