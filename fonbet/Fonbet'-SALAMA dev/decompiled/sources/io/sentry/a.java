package io.sentry;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14355b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14356c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f14354a = i7;
        this.f14355b = obj;
        this.f14356c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14354a) {
            case 0:
                ((DefaultCompositePerformanceCollector) this.f14355b).lambda$start$0((ITransaction) this.f14356c);
                break;
            case 1:
                ((Scopes) this.f14355b).lambda$close$2((ISentryExecutorService) this.f14356c);
                break;
            case 2:
                SentryWrapper.lambda$wrapRunnable$2((IScopes) this.f14355b, (Runnable) this.f14356c);
                break;
            case 3:
                ShutdownHookIntegration.lambda$register$0((IScopes) this.f14355b, (SentryOptions) this.f14356c);
                break;
            case 4:
                ((ShutdownHookIntegration) this.f14355b).lambda$register$1((SentryOptions) this.f14356c);
                break;
            default:
                ((SpotlightIntegration) this.f14355b).lambda$execute$0((SentryEnvelope) this.f14356c);
                break;
        }
    }
}
