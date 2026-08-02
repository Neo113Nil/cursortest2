package io.sentry;

import io.sentry.JsonObjectDeserializer;
import io.sentry.Scope;
import io.sentry.Sentry;
import io.sentry.hints.Resettable;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.util.CollectionUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.LazyEvaluator;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements JsonObjectDeserializer.NextValue, Scope.IWithSession, HintUtils.SentryConsumer, ScopeCallback, Sentry.OptionsConfiguration, LazyEvaluator.Evaluator, CollectionUtils.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14463a;

    public /* synthetic */ f(int i7) {
        this.f14463a = i7;
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
        SentryDateProvider lambda$new$3;
        switch (this.f14463a) {
            case 6:
                lambda$new$3 = SentryOptions.lambda$new$3();
                return lambda$new$3;
            default:
                return SentryUUID.generateSpanId();
        }
    }

    @Override // io.sentry.JsonObjectDeserializer.NextValue
    public Object nextValue() {
        Object lambda$parse$3;
        lambda$parse$3 = JsonObjectDeserializer.lambda$parse$3();
        return lambda$parse$3;
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f14463a) {
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
        boolean lambda$getInAppCallStack$0;
        boolean lambda$getInAppCallStack$1;
        SentryStackFrame sentryStackFrame = (SentryStackFrame) obj;
        switch (this.f14463a) {
            case 7:
                lambda$getInAppCallStack$0 = SentryStackTraceFactory.lambda$getInAppCallStack$0(sentryStackFrame);
                return lambda$getInAppCallStack$0;
            default:
                lambda$getInAppCallStack$1 = SentryStackTraceFactory.lambda$getInAppCallStack$1(sentryStackFrame);
                return lambda$getInAppCallStack$1;
        }
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        ((Resettable) obj).reset();
    }
}
