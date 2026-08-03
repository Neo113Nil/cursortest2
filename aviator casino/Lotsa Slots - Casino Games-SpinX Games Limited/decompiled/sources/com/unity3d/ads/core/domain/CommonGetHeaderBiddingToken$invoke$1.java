package com.unity3d.ads.core.domain;

/* compiled from: CommonGetHeaderBiddingToken.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken", f = "CommonGetHeaderBiddingToken.kt", i = {0, 0, 0, 0, 1}, l = {15, 18}, m = "invoke", n = {"this", "tokenConfiguration", "scarEligibleEffectiveList", "tokenNumber", "rawToken"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0"})
/* loaded from: classes5.dex */
final class CommonGetHeaderBiddingToken$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonGetHeaderBiddingToken$invoke$1(com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken commonGetHeaderBiddingToken, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1> continuation) {
        super(continuation);
        this.this$0 = commonGetHeaderBiddingToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(0, null, this);
    }
}
