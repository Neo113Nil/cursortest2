package com.statsig.androidsdk;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigNetworkImpl", f = "StatsigNetwork.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {773, 436, 440, 450}, m = "retryApiPostLogs", n = {"this", com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, "request", "eventsCount", "fallbackUrls", "statsigMetadata", "statusCode", "currRetry", "backoff", "this", com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, "request", "eventsCount", "fallbackUrls", "statsigMetadata", "statusCode", "currRetry", "backoff", "this", "request", "statsigMetadata", "statusCode"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "J$0", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes16.dex */
final class StatsigNetworkImpl$retryApiPostLogs$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    long J$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.statsig.androidsdk.StatsigNetworkImpl this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object retryApiPostLogs;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        retryApiPostLogs = this.this$0.retryApiPostLogs(null, null, null, null, null, this);
        return retryApiPostLogs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigNetworkImpl$retryApiPostLogs$1(com.statsig.androidsdk.StatsigNetworkImpl statsigNetworkImpl, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigNetworkImpl$retryApiPostLogs$1> continuation) {
        super(continuation);
        this.this$0 = statsigNetworkImpl;
    }
}
