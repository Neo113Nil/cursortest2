package D0;

/* loaded from: classes.dex */
public final class l implements java.util.concurrent.Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f212b;

    public /* synthetic */ l(android.os.Handler handler, int i2) {
        this.f211a = i2;
        this.f212b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        switch (this.f211a) {
            case 0:
                ((A0.a) this.f212b).post(runnable);
                return;
            case 1:
                ((A0.a) this.f212b).post(runnable);
                return;
            default:
                runnable.getClass();
                android.os.Handler handler = this.f212b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new java.util.concurrent.RejectedExecutionException(handler + " is shutting down");
        }
    }

    public l() {
        this.f211a = 0;
        A0.a aVar = new A0.a(android.os.Looper.getMainLooper());
        android.os.Looper.getMainLooper();
        this.f212b = aVar;
    }
}
