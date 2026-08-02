package com.apollographql.apollo.network.ws;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.apollographql.apollo.network.ws.SubscriptionWsProtocol", f = "SubscriptionWsProtocol.kt", i = {0}, l = {31, 38}, m = "connectionInit", n = {"message"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class SubscriptionWsProtocol$connectionInit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.apollographql.apollo.network.ws.SubscriptionWsProtocol getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.connectionInit(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionWsProtocol$connectionInit$1(com.apollographql.apollo.network.ws.SubscriptionWsProtocol subscriptionWsProtocol, kotlin.coroutines.Continuation<? super com.apollographql.apollo.network.ws.SubscriptionWsProtocol$connectionInit$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = subscriptionWsProtocol;
    }
}
