package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetAdRequest.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetAdRequest", f = "AndroidGetAdRequest.kt", i = {0, 0, 0, 0, 0, 1, 1, 1}, l = {33, 40, 55}, m = "invoke", n = {"this", "placement", "impressionOpportunity", "size", "$this$invoke_u24lambda_u241", "this", "size", "$this$invoke_u24lambda_u241"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$0", "L$1", "L$3"})
/* loaded from: classes5.dex */
final class AndroidGetAdRequest$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidGetAdRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidGetAdRequest$invoke$1(com.unity3d.ads.core.domain.AndroidGetAdRequest androidGetAdRequest, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidGetAdRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, this);
    }
}
