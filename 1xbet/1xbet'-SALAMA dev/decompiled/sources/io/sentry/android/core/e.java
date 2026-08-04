package io.sentry.android.core;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ITransaction;
import io.sentry.Scope;
import io.sentry.Sentry;
import io.sentry.SentryOptions;
import io.sentry.TransactionFinishedCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements TransactionFinishedCallback, Scope.IWithTransaction, ANRWatchDog.ANRListener, Sentry.OptionsConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f14372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14374c;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3) {
        this.f14372a = obj;
        this.f14373b = obj2;
        this.f14374c = obj3;
    }

    @Override // io.sentry.Scope.IWithTransaction
    public void accept(ITransaction iTransaction) {
        ((ActivityLifecycleIntegration) this.f14372a).lambda$applyScope$3((IScope) this.f14373b, (ITransaction) this.f14374c, iTransaction);
    }

    @Override // io.sentry.Sentry.OptionsConfiguration
    public void configure(SentryOptions sentryOptions) {
        SentryAndroid.lambda$init$1((ILogger) this.f14372a, (Context) this.f14373b, (Sentry.OptionsConfiguration) this.f14374c, (SentryAndroidOptions) sentryOptions);
    }

    @Override // io.sentry.TransactionFinishedCallback
    public void execute(ITransaction iTransaction) {
        ((ActivityLifecycleIntegration) this.f14372a).lambda$startTracing$0((WeakReference) this.f14373b, (String) this.f14374c, iTransaction);
    }

    @Override // io.sentry.android.core.ANRWatchDog.ANRListener
    public void onAppNotResponding(ApplicationNotResponding applicationNotResponding) {
        ((AnrIntegration) this.f14372a).lambda$startAnrWatchdog$1((IScopes) this.f14373b, (SentryAndroidOptions) this.f14374c, applicationNotResponding);
    }
}
