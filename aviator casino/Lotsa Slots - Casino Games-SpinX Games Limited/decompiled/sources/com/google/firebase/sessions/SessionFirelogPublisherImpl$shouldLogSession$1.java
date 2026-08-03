package com.google.firebase.sessions;

/* compiled from: SessionFirelogPublisher.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", i = {0}, l = {100}, m = "shouldLogSession", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class SessionFirelogPublisherImpl$shouldLogSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.google.firebase.sessions.SessionFirelogPublisherImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionFirelogPublisherImpl$shouldLogSession$1(com.google.firebase.sessions.SessionFirelogPublisherImpl sessionFirelogPublisherImpl, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1> continuation) {
        super(continuation);
        this.this$0 = sessionFirelogPublisherImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object shouldLogSession;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        shouldLogSession = this.this$0.shouldLogSession(this);
        return shouldLogSession;
    }
}
