package io.sentry;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements ScopeCallback, SpanFinishedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SentryTracer f14534b;

    public /* synthetic */ t(SentryTracer sentryTracer, int i7) {
        this.f14533a = i7;
        this.f14534b = sentryTracer;
    }

    @Override // io.sentry.SpanFinishedCallback
    public void execute(Span span) {
        this.f14534b.lambda$createChild$3(span);
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f14533a) {
            case 0:
                this.f14534b.lambda$finish$2(iScope);
                break;
            default:
                this.f14534b.lambda$makeCurrent$5(iScope);
                break;
        }
    }
}
