package z1;

/* loaded from: classes.dex */
public final class J extends z1.I implements z1.InterfaceC1071y {

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.Executor f8532c;

    public J(java.util.concurrent.Executor executor) {
        java.lang.reflect.Method method;
        this.f8532c = executor;
        java.lang.reflect.Method method2 = E1.c.f268a;
        try {
            java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof java.util.concurrent.ScheduledThreadPoolExecutor ? (java.util.concurrent.ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = E1.c.f268a) != null) {
                method.invoke(scheduledThreadPoolExecutor, java.lang.Boolean.TRUE);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.util.concurrent.Executor executor = this.f8532c;
        java.util.concurrent.ExecutorService executorService = executor instanceof java.util.concurrent.ExecutorService ? (java.util.concurrent.ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof z1.J) && ((z1.J) obj).f8532c == this.f8532c;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this.f8532c);
    }

    @Override // z1.AbstractC1065s
    public final void l(k1.i iVar, java.lang.Runnable runnable) {
        try {
            this.f8532c.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e2) {
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            z1.P p2 = (z1.P) iVar.m(z1.C1066t.f8592b);
            if (p2 != null) {
                p2.a(cancellationException);
            }
            z1.B.f8522b.l(iVar, runnable);
        }
    }

    @Override // z1.AbstractC1065s
    public final java.lang.String toString() {
        return this.f8532c.toString();
    }
}
