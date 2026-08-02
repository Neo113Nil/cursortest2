package com.paypal.oslo.feature.pools.data.repository.source;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource", f = "PoolsPagingSource.kt", i = {0, 0, 0}, l = {93}, m = "load", n = {"params", "currentOffset", "limit"}, nl = {126}, s = {"L$0", "I$0", "I$1"}, v = 2)
/* loaded from: classes13.dex */
final class PoolsPagingSource$load$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.load(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PoolsPagingSource$load$1(com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource poolsPagingSource, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource$load$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = poolsPagingSource;
    }
}
