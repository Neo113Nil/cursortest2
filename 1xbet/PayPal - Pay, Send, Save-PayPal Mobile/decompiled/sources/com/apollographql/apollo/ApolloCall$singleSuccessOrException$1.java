package com.apollographql.apollo;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.ApolloCall", f = "ApolloCall.kt", i = {}, l = {206}, m = "singleSuccessOrException", n = {}, s = {})
/* loaded from: classes.dex */
final class ApolloCall$singleSuccessOrException$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.apollographql.apollo.ApolloCall<D> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ApolloCall$singleSuccessOrException$1(com.apollographql.apollo.ApolloCall<D> apolloCall, kotlin.coroutines.Continuation<? super com.apollographql.apollo.ApolloCall$singleSuccessOrException$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = apolloCall;
    }
}
