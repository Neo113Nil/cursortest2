package io.sentry.android.core;

import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.util.LazyEvaluator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements LazyEvaluator.Evaluator, ScopeCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14380b;

    public /* synthetic */ i(Object obj, int i7) {
        this.f14379a = i7;
        this.f14380b = obj;
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public Object evaluate() {
        Boolean lambda$installDefaultIntegrations$0;
        lambda$installDefaultIntegrations$0 = AndroidOptionsInitializer.lambda$installDefaultIntegrations$0((SentryAndroidOptions) this.f14380b);
        return lambda$installDefaultIntegrations$0;
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f14379a) {
            case 1:
                ((LifecycleWatcher) this.f14380b).lambda$startSession$0(iScope);
                break;
            case 2:
                iScope.setScreen((String) this.f14380b);
                break;
            case 3:
                InternalSentrySdk.lambda$getCurrentScope$0((AtomicReference) this.f14380b, iScope);
                break;
            default:
                SentryAndroid.lambda$init$2((AtomicBoolean) this.f14380b, iScope);
                break;
        }
    }
}
