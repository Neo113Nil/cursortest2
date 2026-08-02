package io.sentry.clientreport;

import io.sentry.util.LazyEvaluator;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements LazyEvaluator.Evaluator {
    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public final Object evaluate() {
        Map lambda$new$0;
        lambda$new$0 = AtomicClientReportStorage.lambda$new$0();
        return lambda$new$0;
    }
}
