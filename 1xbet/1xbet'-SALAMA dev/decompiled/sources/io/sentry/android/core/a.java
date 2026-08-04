package io.sentry.android.core;

import android.content.Context;
import android.os.SystemClock;
import io.sentry.Sentry;
import io.sentry.SentryOptions;
import io.sentry.android.core.util.AndroidLazyEvaluator;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.LazyEvaluator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ICurrentDateProvider, LazyEvaluator.Evaluator, AndroidLazyEvaluator.AndroidEvaluator, Sentry.OptionsConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14363a;

    public /* synthetic */ a(int i7) {
        this.f14363a = i7;
    }

    @Override // io.sentry.Sentry.OptionsConfiguration
    public void configure(SentryOptions sentryOptions) {
        SentryAndroid.lambda$init$0((SentryAndroidOptions) sentryOptions);
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public Object evaluate() {
        switch (this.f14363a) {
            case 1:
                return DefaultAndroidEventProcessor.lambda$new$0();
            default:
                return ContextUtils.lambda$static$0();
        }
    }

    @Override // io.sentry.transport.ICurrentDateProvider
    public long getCurrentTimeMillis() {
        return SystemClock.uptimeMillis();
    }

    @Override // io.sentry.android.core.util.AndroidLazyEvaluator.AndroidEvaluator
    public Object evaluate(Context context) {
        switch (this.f14363a) {
            case 3:
                return ContextUtils.lambda$static$1(context);
            case 4:
                return ContextUtils.lambda$static$2(context);
            case 5:
                return ContextUtils.lambda$static$3(context);
            case 6:
                return ContextUtils.lambda$static$4(context);
            default:
                return ContextUtils.lambda$static$5(context);
        }
    }
}
