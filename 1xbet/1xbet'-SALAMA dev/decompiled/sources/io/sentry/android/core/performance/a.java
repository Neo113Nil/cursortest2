package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppStartMetrics f14414b;

    public /* synthetic */ a(AppStartMetrics appStartMetrics, int i7) {
        this.f14413a = i7;
        this.f14414b = appStartMetrics;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14413a) {
            case 0:
                this.f14414b.lambda$checkCreateTimeOnMain$1();
                break;
            case 1:
                this.f14414b.lambda$registerLifecycleCallbacks$0();
                break;
            case 2:
                this.f14414b.lambda$onActivityStarted$2();
                break;
            default:
                this.f14414b.lambda$onActivityStarted$3();
                break;
        }
    }
}
