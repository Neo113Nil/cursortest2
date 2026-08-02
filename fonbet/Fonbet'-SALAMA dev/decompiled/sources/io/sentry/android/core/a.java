package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import io.sentry.Sentry;
import io.sentry.SentryOptions;
import io.sentry.android.core.util.AndroidLazyEvaluator;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.LazyEvaluator;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ICurrentDateProvider, LazyEvaluator.Evaluator, AndroidLazyEvaluator.AndroidEvaluator, Sentry.OptionsConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14357a;

    public /* synthetic */ a(int i7) {
        this.f14357a = i7;
    }

    @Override // io.sentry.Sentry.OptionsConfiguration
    public void configure(SentryOptions sentryOptions) {
        SentryAndroid.lambda$init$0((SentryAndroidOptions) sentryOptions);
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public Object evaluate() {
        String lambda$new$0;
        Boolean lambda$static$0;
        switch (this.f14357a) {
            case 1:
                lambda$new$0 = DefaultAndroidEventProcessor.lambda$new$0();
                return lambda$new$0;
            default:
                lambda$static$0 = ContextUtils.lambda$static$0();
                return lambda$static$0;
        }
    }

    @Override // io.sentry.transport.ICurrentDateProvider
    public long getCurrentTimeMillis() {
        long uptimeMillis;
        uptimeMillis = SystemClock.uptimeMillis();
        return uptimeMillis;
    }

    @Override // io.sentry.android.core.util.AndroidLazyEvaluator.AndroidEvaluator
    public Object evaluate(Context context) {
        PackageInfo lambda$static$1;
        PackageInfo lambda$static$2;
        String lambda$static$3;
        ApplicationInfo lambda$static$4;
        ApplicationInfo lambda$static$5;
        switch (this.f14357a) {
            case 3:
                lambda$static$1 = ContextUtils.lambda$static$1(context);
                return lambda$static$1;
            case 4:
                lambda$static$2 = ContextUtils.lambda$static$2(context);
                return lambda$static$2;
            case 5:
                lambda$static$3 = ContextUtils.lambda$static$3(context);
                return lambda$static$3;
            case 6:
                lambda$static$4 = ContextUtils.lambda$static$4(context);
                return lambda$static$4;
            default:
                lambda$static$5 = ContextUtils.lambda$static$5(context);
                return lambda$static$5;
        }
    }
}
