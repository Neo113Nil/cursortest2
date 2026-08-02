package io.sentry;

import io.sentry.Sentry;
import io.sentry.util.LazyEvaluator;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Sentry.OptionsConfiguration, LazyEvaluator.Evaluator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14490a;

    public /* synthetic */ l(String str) {
        this.f14490a = str;
    }

    @Override // io.sentry.Sentry.OptionsConfiguration
    public void configure(SentryOptions sentryOptions) {
        sentryOptions.setDsn(this.f14490a);
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public Object evaluate() {
        String lambda$new$0;
        lambda$new$0 = SpanId.lambda$new$0(this.f14490a);
        return lambda$new$0;
    }
}
