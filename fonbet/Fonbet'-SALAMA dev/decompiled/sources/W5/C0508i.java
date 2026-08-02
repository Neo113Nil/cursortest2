package W5;

import C0.RunnableC0085d;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import w1.P2;

/* renamed from: W5.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0508i {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f7234e = Logger.getLogger(C0508i.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final O0 f7235a;

    /* renamed from: b, reason: collision with root package name */
    public final U5.p0 f7236b;

    /* renamed from: c, reason: collision with root package name */
    public V f7237c;

    /* renamed from: d, reason: collision with root package name */
    public P2 f7238d;

    public C0508i(f2 f2Var, O0 o02, U5.p0 p0Var) {
        this.f7235a = o02;
        this.f7236b = p0Var;
    }

    public final void a(RunnableC0085d runnableC0085d) {
        this.f7236b.f();
        if (this.f7237c == null) {
            this.f7237c = f2.g();
        }
        P2 p22 = this.f7238d;
        if (p22 != null) {
            P2.F f7 = (P2.F) p22.f17508b;
            if (!f7.f5421c && !f7.f5420b) {
                return;
            }
        }
        long a2 = this.f7237c.a();
        this.f7238d = this.f7236b.e(runnableC0085d, a2, TimeUnit.NANOSECONDS, this.f7235a);
        f7234e.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(a2));
    }
}
