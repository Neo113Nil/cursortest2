package io.sentry.android.core;

import io.sentry.IScope;
import io.sentry.ITransaction;
import io.sentry.Scope;
import io.sentry.ScopeCallback;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements ScopeCallback, Scope.IWithTransaction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14374b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ITransaction f14375c;

    public /* synthetic */ g(ITransaction iTransaction, IScope iScope) {
        this.f14373a = 2;
        this.f14375c = iTransaction;
        this.f14374b = iScope;
    }

    @Override // io.sentry.Scope.IWithTransaction
    public void accept(ITransaction iTransaction) {
        ActivityLifecycleIntegration.lambda$clearScope$4(this.f14375c, (IScope) this.f14374b, iTransaction);
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f14373a) {
            case 0:
                ((ActivityLifecycleIntegration) this.f14374b).lambda$startTracing$2(this.f14375c, iScope);
                break;
            default:
                ((ActivityLifecycleIntegration) this.f14374b).lambda$finishTransaction$5(this.f14375c, iScope);
                break;
        }
    }

    public /* synthetic */ g(ActivityLifecycleIntegration activityLifecycleIntegration, ITransaction iTransaction, int i7) {
        this.f14373a = i7;
        this.f14374b = activityLifecycleIntegration;
        this.f14375c = iTransaction;
    }
}
