package com.unity3d.ads.core.domain.events;

/* compiled from: GetOperativeEventRequest.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.events.GetOperativeEventRequest", f = "GetOperativeEventRequest.kt", i = {0, 0, 0}, l = {37}, m = "invoke", n = {"this", "adFormat", "$this$invoke_u24lambda_u242"}, s = {"L$0", "L$1", "L$3"})
/* loaded from: classes5.dex */
final class GetOperativeEventRequest$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.events.GetOperativeEventRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetOperativeEventRequest$invoke$1(com.unity3d.ads.core.domain.events.GetOperativeEventRequest getOperativeEventRequest, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1> continuation) {
        super(continuation);
        this.this$0 = getOperativeEventRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, null, null, null, this);
    }
}
