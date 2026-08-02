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
import io.sentry.android.core.ANRWatchDog;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements TransactionFinishedCallback, Scope.IWithTransaction, ANRWatchDog.ANRListener, Sentry.OptionsConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f14366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14368c;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3) {
        this.f14366a = obj;
        this.f14367b = obj2;
        this.f14368c = obj3;
    }

    @Override // io.sentry.Scope.IWithTransaction
    public void accept(ITransaction iTransaction) {
        ((ActivityLifecycleIntegration) this.f14366a).lambda$applyScope$3((IScope) this.f14367b, (ITransaction) this.f14368c, iTransaction);
    }

    @Override // io.sentry.Sentry.OptionsConfiguration
    public void configure(SentryOptions sentryOptions) {
        SentryAndroid.lambda$init$1((ILogger) this.f14366a, (Context) this.f14367b, (Sentry.OptionsConfiguration) this.f14368c, (SentryAndroidOptions) sentryOptions);
    }

    @Override // io.sentry.TransactionFinishedCallback
    public void execute(ITransaction iTransaction) {
        ((ActivityLifecycleIntegration) this.f14366a).lambda$startTracing$0((WeakReference) this.f14367b, (String) this.f14368c, iTransaction);
    }

    @Override // io.sentry.android.core.ANRWatchDog.ANRListener
    public void onAppNotResponding(ApplicationNotResponding applicationNotResponding) {
        ((AnrIntegration) this.f14366a).lambda$startAnrWatchdog$1((IScopes) this.f14367b, (SentryAndroidOptions) this.f14368c, applicationNotResponding);
    }
}
