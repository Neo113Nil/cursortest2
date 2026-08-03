package com.unity3d.ads.core.domain;

/* compiled from: AndroidBuildHeaderBiddingToken.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken", f = "AndroidBuildHeaderBiddingToken.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {40, 52, 57, 60, 62}, m = "invoke", n = {"this", "tokenConfiguration", "currentTokenCounters", "sToken", "$this$invoke_u24lambda_u244", "scarSignalsCollected", "this", "currentTokenCounters", "sToken", "$this$invoke_u24lambda_u244", "this", "currentTokenCounters", "$this$invoke_u24lambda_u244", "this", "currentTokenCounters", "$this$invoke_u24lambda_u244", "this", "currentTokenCounters", "$this$invoke_u24lambda_u244"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "Z$0", "L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
/* loaded from: classes5.dex */
final class AndroidBuildHeaderBiddingToken$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    boolean Z$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidBuildHeaderBiddingToken$invoke$1(com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidBuildHeaderBiddingToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(0, null, false, this);
    }
}
