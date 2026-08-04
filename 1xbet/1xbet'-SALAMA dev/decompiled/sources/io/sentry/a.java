package io.sentry;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14362c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f14360a = i7;
        this.f14361b = obj;
        this.f14362c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14360a) {
            case 0:
                ((DefaultCompositePerformanceCollector) this.f14361b).lambda$start$0((ITransaction) this.f14362c);
                break;
            case 1:
                ((Scopes) this.f14361b).lambda$close$2((ISentryExecutorService) this.f14362c);
                break;
            case 2:
                SentryWrapper.lambda$wrapRunnable$2((IScopes) this.f14361b, (Runnable) this.f14362c);
                break;
            case 3:
                ShutdownHookIntegration.lambda$register$0((IScopes) this.f14361b, (SentryOptions) this.f14362c);
                break;
            case 4:
                ((ShutdownHookIntegration) this.f14361b).lambda$register$1((SentryOptions) this.f14362c);
                break;
            default:
                ((SpotlightIntegration) this.f14361b).lambda$execute$0((SentryEnvelope) this.f14362c);
                break;
        }
    }
}
