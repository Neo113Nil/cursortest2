package io.sentry.util;

import io.sentry.IScope;
import io.sentry.PropagationContext;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import io.sentry.SentryOptions;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ScopeCallback, Scope.IWithPropagationContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14548c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f14546a = i7;
        this.f14547b = obj;
        this.f14548c = obj2;
    }

    @Override // io.sentry.Scope.IWithPropagationContext
    public void accept(PropagationContext propagationContext) {
        switch (this.f14546a) {
            case 1:
                ((IScope) this.f14547b).setPropagationContext((PropagationContext) this.f14548c);
                break;
            default:
                TracingUtils.lambda$maybeUpdateBaggage$5((IScope) this.f14547b, (SentryOptions) this.f14548c, propagationContext);
                break;
        }
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        TracingUtils.lambda$trace$4((TracingUtils.PropagationContextHolder) this.f14547b, (SentryOptions) this.f14548c, iScope);
    }
}
