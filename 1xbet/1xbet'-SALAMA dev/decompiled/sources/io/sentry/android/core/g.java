package io.sentry.android.core;

import io.sentry.IScope;
import io.sentry.ITransaction;
import io.sentry.Scope;
import io.sentry.ScopeCallback;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements ScopeCallback, Scope.IWithTransaction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ITransaction f14381c;

    public /* synthetic */ g(ITransaction iTransaction, IScope iScope) {
        this.f14379a = 2;
        this.f14381c = iTransaction;
        this.f14380b = iScope;
    }

    @Override // io.sentry.Scope.IWithTransaction
    public void accept(ITransaction iTransaction) {
        ActivityLifecycleIntegration.lambda$clearScope$4(this.f14381c, (IScope) this.f14380b, iTransaction);
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f14379a) {
            case 0:
                ((ActivityLifecycleIntegration) this.f14380b).lambda$startTracing$2(this.f14381c, iScope);
                break;
            default:
                ((ActivityLifecycleIntegration) this.f14380b).lambda$finishTransaction$5(this.f14381c, iScope);
                break;
        }
    }

    public /* synthetic */ g(ActivityLifecycleIntegration activityLifecycleIntegration, ITransaction iTransaction, int i7) {
        this.f14379a = i7;
        this.f14380b = activityLifecycleIntegration;
        this.f14381c = iTransaction;
    }
}
