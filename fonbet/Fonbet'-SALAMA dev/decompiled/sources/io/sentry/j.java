package io.sentry;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SentryOptions f14487b;

    public /* synthetic */ j(SentryOptions sentryOptions, int i7) {
        this.f14486a = i7;
        this.f14487b = sentryOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14486a) {
            case 0:
                Sentry.lambda$handleAppStartProfilingConfig$3(this.f14487b);
                break;
            case 1:
                Sentry.lambda$notifyOptionsObservers$4(this.f14487b);
                break;
            default:
                this.f14487b.loadLazyFields();
                break;
        }
    }
}
