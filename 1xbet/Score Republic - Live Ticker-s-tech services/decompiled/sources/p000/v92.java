package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class v92 {

    /* JADX INFO: renamed from: a */
    public final Object f8140a = new Object();

    /* JADX INFO: renamed from: b */
    public final m81 f8141b = new m81(10);

    /* JADX INFO: renamed from: c */
    public boolean f8142c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f8143d;

    /* JADX INFO: renamed from: e */
    public Object f8144e;

    /* JADX INFO: renamed from: f */
    public Exception f8145f;

    /* JADX INFO: renamed from: a */
    public final void m5125a(Executor executor, iu0 iu0Var) {
        this.f8141b.m3364n(new vy1(executor, iu0Var));
        m5139o();
    }

    /* JADX INFO: renamed from: b */
    public final void m5126b(Executor executor, lu0 lu0Var) {
        this.f8141b.m3364n(new vy1(executor, lu0Var));
        m5139o();
    }

    /* JADX INFO: renamed from: c */
    public final void m5127c(Executor executor, ou0 ou0Var) {
        this.f8141b.m3364n(new vy1(executor, ou0Var));
        m5139o();
    }

    /* JADX INFO: renamed from: d */
    public final v92 m5128d(Executor executor, InterfaceC0845wm interfaceC0845wm) {
        v92 v92Var = new v92();
        this.f8141b.m3364n(new rv1(executor, interfaceC0845wm, v92Var, 0));
        m5139o();
        return v92Var;
    }

    /* JADX INFO: renamed from: e */
    public final v92 m5129e(Executor executor, InterfaceC0845wm interfaceC0845wm) {
        v92 v92Var = new v92();
        this.f8141b.m3364n(new rv1(executor, interfaceC0845wm, v92Var, 1));
        m5139o();
        return v92Var;
    }

    /* JADX INFO: renamed from: f */
    public final Exception m5130f() {
        Exception exc;
        synchronized (this.f8140a) {
            exc = this.f8145f;
        }
        return exc;
    }

    /* JADX INFO: renamed from: g */
    public final Object m5131g() {
        Object obj;
        synchronized (this.f8140a) {
            try {
                p80.m3865j("Task is not yet complete", this.f8142c);
                if (this.f8143d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f8145f;
                if (exc != null) {
                    throw new a41(exc);
                }
                obj = this.f8144e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5132h() {
        boolean z;
        synchronized (this.f8140a) {
            z = this.f8142c;
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m5133i() {
        boolean z;
        synchronized (this.f8140a) {
            try {
                z = false;
                if (this.f8142c && !this.f8143d && this.f8145f == null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final v92 m5134j(Executor executor, kb1 kb1Var) {
        v92 v92Var = new v92();
        this.f8141b.m3364n(new vy1(executor, kb1Var, v92Var));
        m5139o();
        return v92Var;
    }

    /* JADX INFO: renamed from: k */
    public final void m5135k(Object obj) {
        synchronized (this.f8140a) {
            m5138n();
            this.f8142c = true;
            this.f8144e = obj;
        }
        this.f8141b.m3365o(this);
    }

    /* JADX INFO: renamed from: l */
    public final void m5136l(Exception exc) {
        p80.m3864i(exc, "Exception must not be null");
        synchronized (this.f8140a) {
            m5138n();
            this.f8142c = true;
            this.f8145f = exc;
        }
        this.f8141b.m3365o(this);
    }

    /* JADX INFO: renamed from: m */
    public final void m5137m() {
        synchronized (this.f8140a) {
            try {
                if (this.f8142c) {
                    return;
                }
                this.f8142c = true;
                this.f8143d = true;
                this.f8141b.m3365o(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m5138n() {
        String strConcat;
        if (this.f8142c) {
            if (!m5132h()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excM5130f = m5130f();
            if (excM5130f != null) {
                strConcat = "failure";
            } else if (m5133i()) {
                strConcat = "result ".concat(String.valueOf(m5131g()));
            } else {
                strConcat = this.f8143d ? "cancellation" : "unknown issue";
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m5139o() {
        synchronized (this.f8140a) {
            try {
                if (this.f8142c) {
                    this.f8141b.m3365o(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
