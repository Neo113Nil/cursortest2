package com.paypal.oslo.feature.pools.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pools.data.repository.PoolDetailsRepositoryImpl", f = "PoolDetailsRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {30}, m = "getPool", n = {"id", "raise$iv$iv$iv", "$this$getPool_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PoolDetailsRepositoryImpl$getPool$2"}, nl = {33}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class PoolDetailsRepositoryImpl$getPool$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.pools.data.repository.PoolDetailsRepositoryImpl getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputSizeshNQ4ISI.getPool(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PoolDetailsRepositoryImpl$getPool$1(com.paypal.oslo.feature.pools.data.repository.PoolDetailsRepositoryImpl poolDetailsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pools.data.repository.PoolDetailsRepositoryImpl$getPool$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = poolDetailsRepositoryImpl;
    }
}
