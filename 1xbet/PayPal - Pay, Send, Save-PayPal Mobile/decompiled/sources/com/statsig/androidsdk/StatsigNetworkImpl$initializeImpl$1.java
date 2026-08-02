package com.statsig.androidsdk;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigNetworkImpl", f = "StatsigNetwork.kt", i = {0, 0, 0, 0, 0}, l = {773}, m = "initializeImpl$android_sdk_release", n = {"this", "contextType", "diagnostics", "timeoutMs", "statusCode"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes16.dex */
final class StatsigNetworkImpl$initializeImpl$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.statsig.androidsdk.StatsigNetworkImpl this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.initializeImpl$android_sdk_release(null, null, null, null, null, null, 0, null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigNetworkImpl$initializeImpl$1(com.statsig.androidsdk.StatsigNetworkImpl statsigNetworkImpl, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigNetworkImpl$initializeImpl$1> continuation) {
        super(continuation);
        this.this$0 = statsigNetworkImpl;
    }
}
