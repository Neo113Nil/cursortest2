package io.sentry.android.core.performance;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppStartMetrics f14408b;

    public /* synthetic */ a(AppStartMetrics appStartMetrics, int i7) {
        this.f14407a = i7;
        this.f14408b = appStartMetrics;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14407a) {
            case 0:
                this.f14408b.lambda$checkCreateTimeOnMain$1();
                break;
            case 1:
                this.f14408b.lambda$registerLifecycleCallbacks$0();
                break;
            case 2:
                this.f14408b.lambda$onActivityStarted$2();
                break;
            default:
                this.f14408b.lambda$onActivityStarted$3();
                break;
        }
    }
}
