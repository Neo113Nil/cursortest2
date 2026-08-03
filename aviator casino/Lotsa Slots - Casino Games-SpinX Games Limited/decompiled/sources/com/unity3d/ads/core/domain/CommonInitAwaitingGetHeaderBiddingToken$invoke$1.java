package com.unity3d.ads.core.domain;

/* compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", i = {0, 0, 0}, l = {56, 68}, m = "invoke", n = {"this", "tokenConfiguration", "tokenNumber"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes5.dex */
final class CommonInitAwaitingGetHeaderBiddingToken$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonInitAwaitingGetHeaderBiddingToken$invoke$1(com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1> continuation) {
        super(continuation);
        this.this$0 = commonInitAwaitingGetHeaderBiddingToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(0, null, null, this);
    }
}
