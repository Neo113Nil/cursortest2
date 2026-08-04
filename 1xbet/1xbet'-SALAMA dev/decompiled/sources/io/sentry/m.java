package io.sentry;

import io.sentry.hints.Retryable;
import io.sentry.util.HintUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Scope.IWithSession, HintUtils.SentryConsumer, SpanFinishedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f14497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14499c;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3) {
        this.f14497a = obj;
        this.f14498b = obj2;
        this.f14499c = obj3;
    }

    @Override // io.sentry.Scope.IWithSession
    public void accept(Session session) {
        ((SentryClient) this.f14497a).lambda$updateSessionData$1((SentryEvent) this.f14498b, (Hint) this.f14499c, session);
    }

    @Override // io.sentry.SpanFinishedCallback
    public void execute(Span span) {
        ((SentryTracer) this.f14497a).lambda$finish$0((SpanFinishedCallback) this.f14498b, (AtomicReference) this.f14499c, span);
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        Throwable th = (Throwable) this.f14498b;
        ((EnvelopeSender) this.f14497a).lambda$processFile$1(th, (File) this.f14499c, (Retryable) obj);
    }
}
