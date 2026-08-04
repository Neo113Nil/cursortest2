package L4;

import io.sentry.ILogger;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4338b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f4337a = i7;
        this.f4338b = obj;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        switch (this.f4337a) {
            case 0:
                ((d) this.f4338b).f4347d.c(th);
                break;
            default:
                SentryFrameMetricsCollector.lambda$new$0((ILogger) this.f4338b, thread, th);
                break;
        }
    }
}
