package io.sentry;

import io.sentry.hints.Resettable;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.util.CollectionUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.LazyEvaluator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements JsonObjectDeserializer.NextValue, Scope.IWithSession, HintUtils.SentryConsumer, ScopeCallback, Sentry.OptionsConfiguration, LazyEvaluator.Evaluator, CollectionUtils.Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14469a;

    public /* synthetic */ f(int i7) {
        this.f14469a = i7;
    }

    @Override // io.sentry.Scope.IWithSession
    public void accept(Session session) {
        SentryClient.lambda$captureEvent$0(session);
    }

    @Override // io.sentry.Sentry.OptionsConfiguration
    public void configure(SentryOptions sentryOptions) {
        sentryOptions.setEnableExternalConfiguration(true);
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public Object evaluate() {
        switch (this.f14469a) {
            case 6:
                return SentryOptions.lambda$new$3();
            default:
                return SentryUUID.generateSpanId();
        }
    }

    @Override // io.sentry.JsonObjectDeserializer.NextValue
    public Object nextValue() {
        return JsonObjectDeserializer.lambda$parse$3();
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f14469a) {
            case 3:
                iScope.clear();
                break;
            default:
                iScope.clear();
                break;
        }
    }

    @Override // io.sentry.util.CollectionUtils.Predicate
    public boolean test(Object obj) {
        SentryStackFrame sentryStackFrame = (SentryStackFrame) obj;
        switch (this.f14469a) {
            case 7:
                return SentryStackTraceFactory.lambda$getInAppCallStack$0(sentryStackFrame);
            default:
                return SentryStackTraceFactory.lambda$getInAppCallStack$1(sentryStackFrame);
        }
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        ((Resettable) obj).reset();
    }
}
