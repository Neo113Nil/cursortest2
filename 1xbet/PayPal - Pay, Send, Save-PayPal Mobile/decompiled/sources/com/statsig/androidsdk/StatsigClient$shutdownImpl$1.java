package com.statsig.androidsdk;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigClient", f = "StatsigClient.kt", i = {0}, l = {1538}, m = "shutdownImpl", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class StatsigClient$shutdownImpl$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.statsig.androidsdk.StatsigClient this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object shutdownImpl;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        shutdownImpl = this.this$0.shutdownImpl(this);
        return shutdownImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigClient$shutdownImpl$1(com.statsig.androidsdk.StatsigClient statsigClient, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigClient$shutdownImpl$1> continuation) {
        super(continuation);
        this.this$0 = statsigClient;
    }
}
