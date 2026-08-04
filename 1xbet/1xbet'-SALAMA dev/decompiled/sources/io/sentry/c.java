package io.sentry;

import io.sentry.hints.Flushable;
import io.sentry.util.HintUtils;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements HintUtils.SentryConsumer, ScopeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14454b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f14453a = i7;
        this.f14454b = obj;
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        ((EnvelopeSender) this.f14454b).lambda$processFile$0((Flushable) obj);
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f14453a) {
            case 1:
                Scopes.lambda$continueTrace$7((PropagationContext) this.f14454b, iScope);
                break;
            default:
                SentryTracer.lambda$updateBaggageValues$4((AtomicReference) this.f14454b, iScope);
                break;
        }
    }
}
