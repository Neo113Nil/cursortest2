package com.statsig.androidsdk;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigNetworkImpl", f = "StatsigNetwork.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, m = "initializeImplWithRetry", n = {"this", com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, "user", "sinceTime", "metadata", "contextType", "diagnostics", "timeoutMs", "hashUsed", "previousDerivedFields", "fullChecksum", "fallbackUrls", "retryLimit", "attempt", "backoff", "this", com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, "user", "sinceTime", "metadata", "contextType", "diagnostics", "timeoutMs", "hashUsed", "previousDerivedFields", "fullChecksum", "fallbackUrls", "response", "retryLimit", "attempt", "backoff"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "I$1", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "I$0", "I$1", "J$0"})
/* loaded from: classes16.dex */
final class StatsigNetworkImpl$initializeImplWithRetry$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    int I$1;
    long J$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$10;
    java.lang.Object L$11;
    java.lang.Object L$12;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    java.lang.Object L$7;
    java.lang.Object L$8;
    java.lang.Object L$9;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.statsig.androidsdk.StatsigNetworkImpl this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object initializeImplWithRetry;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        initializeImplWithRetry = this.this$0.initializeImplWithRetry(null, null, null, null, null, null, null, 0, null, null, null, null, this);
        return initializeImplWithRetry;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigNetworkImpl$initializeImplWithRetry$1(com.statsig.androidsdk.StatsigNetworkImpl statsigNetworkImpl, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigNetworkImpl$initializeImplWithRetry$1> continuation) {
        super(continuation);
        this.this$0 = statsigNetworkImpl;
    }
}
