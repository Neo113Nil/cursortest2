package com.unity3d.ads.core.domain.events;

/* compiled from: EventObservers.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.events.EventObservers", f = "EventObservers.kt", i = {0, 1}, l = {16, 17}, m = "invoke", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
final class EventObservers$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.events.EventObservers this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EventObservers$invoke$1(com.unity3d.ads.core.domain.events.EventObservers eventObservers, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.events.EventObservers$invoke$1> continuation) {
        super(continuation);
        this.this$0 = eventObservers;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
