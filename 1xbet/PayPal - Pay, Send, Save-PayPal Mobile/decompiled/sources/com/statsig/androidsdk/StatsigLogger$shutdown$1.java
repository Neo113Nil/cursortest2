package com.statsig.androidsdk;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.statsig.androidsdk.StatsigLogger", f = "StatsigLogger.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE}, m = "shutdown", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class StatsigLogger$shutdown$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.statsig.androidsdk.StatsigLogger this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.shutdown(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigLogger$shutdown$1(com.statsig.androidsdk.StatsigLogger statsigLogger, kotlin.coroutines.Continuation<? super com.statsig.androidsdk.StatsigLogger$shutdown$1> continuation) {
        super(continuation);
        this.this$0 = statsigLogger;
    }
}
