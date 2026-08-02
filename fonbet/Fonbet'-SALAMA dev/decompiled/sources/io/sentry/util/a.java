package io.sentry.util;

import io.sentry.IScope;
import io.sentry.PropagationContext;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import io.sentry.SentryOptions;
import io.sentry.util.TracingUtils;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ScopeCallback, Scope.IWithPropagationContext {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14541b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14542c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f14540a = i7;
        this.f14541b = obj;
        this.f14542c = obj2;
    }

    @Override // io.sentry.Scope.IWithPropagationContext
    public void accept(PropagationContext propagationContext) {
        switch (this.f14540a) {
            case 1:
                ((IScope) this.f14541b).setPropagationContext((PropagationContext) this.f14542c);
                break;
            default:
                TracingUtils.lambda$maybeUpdateBaggage$5((IScope) this.f14541b, (SentryOptions) this.f14542c, propagationContext);
                break;
        }
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        TracingUtils.lambda$trace$4((TracingUtils.PropagationContextHolder) this.f14541b, (SentryOptions) this.f14542c, iScope);
    }
}
