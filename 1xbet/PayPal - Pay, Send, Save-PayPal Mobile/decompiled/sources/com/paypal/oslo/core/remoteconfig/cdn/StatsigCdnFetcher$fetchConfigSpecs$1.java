package com.paypal.oslo.core.remoteconfig.cdn;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher", f = "StatsigCdnFetcher.kt", i = {}, l = {52}, m = "fetchConfigSpecs", n = {}, nl = {53}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class StatsigCdnFetcher$fetchConfigSpecs$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.fetchConfigSpecs(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatsigCdnFetcher$fetchConfigSpecs$1(com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher statsigCdnFetcher, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher$fetchConfigSpecs$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = statsigCdnFetcher;
    }
}
