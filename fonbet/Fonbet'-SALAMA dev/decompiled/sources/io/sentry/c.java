package io.sentry;

import io.sentry.hints.Flushable;
import io.sentry.util.HintUtils;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements HintUtils.SentryConsumer, ScopeCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14448b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f14447a = i7;
        this.f14448b = obj;
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        ((EnvelopeSender) this.f14448b).lambda$processFile$0((Flushable) obj);
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f14447a) {
            case 1:
                Scopes.lambda$continueTrace$7((PropagationContext) this.f14448b, iScope);
                break;
            default:
                SentryTracer.lambda$updateBaggageValues$4((AtomicReference) this.f14448b, iScope);
                break;
        }
    }
}
