package io.sentry;

import io.sentry.Scope;
import io.sentry.hints.Retryable;
import io.sentry.util.HintUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Scope.IWithSession, HintUtils.SentryConsumer, SpanFinishedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f14491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14493c;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3) {
        this.f14491a = obj;
        this.f14492b = obj2;
        this.f14493c = obj3;
    }

    @Override // io.sentry.Scope.IWithSession
    public void accept(Session session) {
        ((SentryClient) this.f14491a).lambda$updateSessionData$1((SentryEvent) this.f14492b, (Hint) this.f14493c, session);
    }

    @Override // io.sentry.SpanFinishedCallback
    public void execute(Span span) {
        ((SentryTracer) this.f14491a).lambda$finish$0((SpanFinishedCallback) this.f14492b, (AtomicReference) this.f14493c, span);
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        Throwable th = (Throwable) this.f14492b;
        ((EnvelopeSender) this.f14491a).lambda$processFile$1(th, (File) this.f14493c, (Retryable) obj);
    }
}
