package io.sentry;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements ScopeCallback, SpanFinishedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SentryTracer f14528b;

    public /* synthetic */ t(SentryTracer sentryTracer, int i7) {
        this.f14527a = i7;
        this.f14528b = sentryTracer;
    }

    @Override // io.sentry.SpanFinishedCallback
    public void execute(Span span) {
        this.f14528b.lambda$createChild$3(span);
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f14527a) {
            case 0:
                this.f14528b.lambda$finish$2(iScope);
                break;
            default:
                this.f14528b.lambda$makeCurrent$5(iScope);
                break;
        }
    }
}
