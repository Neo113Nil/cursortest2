package com.unity3d.ads.core.domain.events;

/* compiled from: UniversalRequestEventSender.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.events.UniversalRequestEventSender", f = "UniversalRequestEventSender.kt", i = {0}, l = {21, 35}, m = "invoke", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class UniversalRequestEventSender$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.events.UniversalRequestEventSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniversalRequestEventSender$invoke$1(com.unity3d.ads.core.domain.events.UniversalRequestEventSender universalRequestEventSender, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1> continuation) {
        super(continuation);
        this.this$0 = universalRequestEventSender;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, this);
    }
}
