package W5;

import C0.RunnableC0085d;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p155w1.P2;

/* JADX INFO: renamed from: W5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0508i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f7234e = Logger.getLogger(C0508i.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O0 f7235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U5.p0 f7236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V f7237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public P2 f7238d;

    public C0508i(f2 f2Var, O0 o7, U5.p0 p0Var) {
        this.f7235a = o7;
        this.f7236b = p0Var;
    }

    public final void a(RunnableC0085d runnableC0085d) {
        this.f7236b.f();
        if (this.f7237c == null) {
            this.f7237c = f2.g();
        }
        P2 p5 = this.f7238d;
        if (p5 != null) {
            P2.F f7 = (P2.F) p5.f17514b;
            if (!f7.f5421c && !f7.f5420b) {
                return;
            }
        }
        long jA = this.f7237c.a();
        this.f7238d = this.f7236b.e(runnableC0085d, jA, TimeUnit.NANOSECONDS, this.f7235a);
        f7234e.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
    }
}
