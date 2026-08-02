package com.statsig.androidsdk;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigNetworkImpl", f = "StatsigNetwork.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {157, 159, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m = "initialize", n = {"this", com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, "user", "sinceTime", "metadata", "coroutineScope", "contextType", "diagnostics", "hashUsed", "previousDerivedFields", "fullChecksum", "retry"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0"})
/* loaded from: classes16.dex */
final class StatsigNetworkImpl$initialize$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$10;
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
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.initialize(null, null, null, null, null, null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigNetworkImpl$initialize$1(com.statsig.androidsdk.StatsigNetworkImpl statsigNetworkImpl, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigNetworkImpl$initialize$1> continuation) {
        super(continuation);
        this.this$0 = statsigNetworkImpl;
    }
}
