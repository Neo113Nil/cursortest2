package io.sentry;

import io.sentry.util.LazyEvaluator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Sentry.OptionsConfiguration, LazyEvaluator.Evaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14496a;

    public /* synthetic */ l(String str) {
        this.f14496a = str;
    }

    @Override // io.sentry.Sentry.OptionsConfiguration
    public void configure(SentryOptions sentryOptions) {
        sentryOptions.setDsn(this.f14496a);
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public Object evaluate() {
        return SpanId.lambda$new$0(this.f14496a);
    }
}
