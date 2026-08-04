package io.sentry;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SentryOptions f14493b;

    public /* synthetic */ j(SentryOptions sentryOptions, int i7) {
        this.f14492a = i7;
        this.f14493b = sentryOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14492a) {
            case 0:
                Sentry.lambda$handleAppStartProfilingConfig$3(this.f14493b);
                break;
            case 1:
                Sentry.lambda$notifyOptionsObservers$4(this.f14493b);
                break;
            default:
                this.f14493b.loadLazyFields();
                break;
        }
    }
}
