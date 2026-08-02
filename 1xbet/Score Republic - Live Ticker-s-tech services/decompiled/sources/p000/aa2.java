package p000;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class aa2 implements Runnable, Closeable {

    /* JADX INFO: renamed from: j */
    public ha2 f116j;

    /* JADX INFO: renamed from: k */
    public final boolean f117k = n80.m3502k(Thread.currentThread());

    /* JADX INFO: renamed from: l */
    public boolean f118l;

    /* JADX INFO: renamed from: m */
    public boolean f119m;

    /* JADX INFO: renamed from: n */
    public final boolean f120n;

    public aa2(ha2 ha2Var, boolean z) {
        this.f120n = false;
        this.f116j = ha2Var;
        this.f120n = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m168a(AbstractC0269h0 abstractC0269h0) {
        if (this.f118l) {
            C0270h1.m2191g("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        } else if (this.f119m) {
            C0270h1.m2191g("Signal is already attached to future");
        } else {
            this.f119m = true;
            abstractC0269h0.mo995c(this, EnumC0113ct.f1449j);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ha2 ha2Var = this.f116j;
        try {
            this.f116j = null;
            boolean z = this.f119m;
            if (!z) {
                if (this.f118l) {
                    throw new IllegalStateException("Span was already closed!");
                }
                this.f118l = true;
                if (this.f117k && !z) {
                    n80.m3502k(Thread.currentThread());
                }
            }
            if (ha2Var != null) {
                ((n92) ha2Var).close();
            }
            if (this.f120n) {
                s92.m4510b(s92.m4511c(), z92.f9710p);
            }
        } catch (Throwable th) {
            if (ha2Var != null) {
                try {
                    ((n92) ha2Var).close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.f118l || !(z = this.f119m)) {
            n80.m3503l().post(RunnableC0393ke.f4356m);
            return;
        }
        this.f118l = true;
        if (!this.f117k || z) {
            return;
        }
        n80.m3502k(Thread.currentThread());
    }
}
