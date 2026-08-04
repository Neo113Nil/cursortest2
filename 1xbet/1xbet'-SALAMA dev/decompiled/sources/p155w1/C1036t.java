package p155w1;

/* JADX INFO: renamed from: w1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1036t extends G2 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public O2 f17865A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f17866B;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        String message;
        th.printStackTrace();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f17866B) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace == null || stackTrace.length <= 0) {
                message = th.getMessage() != null ? th.getMessage() : "";
            } else {
                StringBuilder sb = new StringBuilder();
                if (th.getMessage() != null) {
                    sb.append(" (");
                    sb.append(th.getMessage());
                    sb.append(")\n");
                }
                message = sb.toString();
            }
            h(new C1033s("uncaught", jCurrentTimeMillis, message, th.getClass().getName(), th, AbstractC0998i1.b(), null, this.f17865A.a()));
        }
    }
}
