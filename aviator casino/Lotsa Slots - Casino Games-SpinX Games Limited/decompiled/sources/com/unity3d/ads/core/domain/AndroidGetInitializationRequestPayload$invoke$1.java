package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetInitializationRequestPayload.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload", f = "AndroidGetInitializationRequestPayload.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8}, l = {24, 25, 33, 34, 45, 50, 55, 60, 78}, m = "invoke", n = {"this", "$this$invoke_u24lambda_u249", "this", "$this$invoke_u24lambda_u249", "this", "$this$invoke_u24lambda_u249", "$this$invoke_u24lambda_u249_u24lambda_u242", "this", "$this$invoke_u24lambda_u249", "$this$invoke_u24lambda_u249_u24lambda_u242", "this", "$this$invoke_u24lambda_u249", "this", "$this$invoke_u24lambda_u249", "this", "$this$invoke_u24lambda_u249", "this", "$this$invoke_u24lambda_u249", "$this$invoke_u24lambda_u249"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$5", "L$0", "L$2", "L$5", "L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$1"})
/* loaded from: classes5.dex */
final class AndroidGetInitializationRequestPayload$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidGetInitializationRequestPayload$invoke$1(com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidGetInitializationRequestPayload;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
