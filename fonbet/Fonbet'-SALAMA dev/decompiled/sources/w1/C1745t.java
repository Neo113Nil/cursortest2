package w1;

import java.lang.Thread;

/* renamed from: w1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1745t extends G2 implements Thread.UncaughtExceptionHandler {

    /* renamed from: A, reason: collision with root package name */
    public O2 f17859A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f17860B;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        String message;
        th.printStackTrace();
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f17860B) {
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
            h(new C1742s("uncaught", currentTimeMillis, message, th.getClass().getName(), th, AbstractC1707i1.b(), null, this.f17859A.a()));
        }
    }
}
