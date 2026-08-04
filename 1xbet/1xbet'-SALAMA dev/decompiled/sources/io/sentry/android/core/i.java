package io.sentry.android.core;

import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.util.LazyEvaluator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements LazyEvaluator.Evaluator, ScopeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14386b;

    public /* synthetic */ i(Object obj, int i7) {
        this.f14385a = i7;
        this.f14386b = obj;
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public Object evaluate() {
        return AndroidOptionsInitializer.lambda$installDefaultIntegrations$0((SentryAndroidOptions) this.f14386b);
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f14385a) {
            case 1:
                ((LifecycleWatcher) this.f14386b).lambda$startSession$0(iScope);
                break;
            case 2:
                iScope.setScreen((String) this.f14386b);
                break;
            case 3:
                InternalSentrySdk.lambda$getCurrentScope$0((AtomicReference) this.f14386b, iScope);
                break;
            default:
                SentryAndroid.lambda$init$2((AtomicBoolean) this.f14386b, iScope);
                break;
        }
    }
}
