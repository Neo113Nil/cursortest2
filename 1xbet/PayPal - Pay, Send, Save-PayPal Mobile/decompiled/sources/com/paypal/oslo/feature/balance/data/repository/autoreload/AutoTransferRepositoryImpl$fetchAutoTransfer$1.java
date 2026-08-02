package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.repository.autoreload.AutoTransferRepositoryImpl", f = "AutoTransferRepositoryImpl.kt", i = {0, 0}, l = {42}, m = "fetchAutoTransfer", n = {"query", "apolloCall"}, nl = {102}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class AutoTransferRepositoryImpl$fetchAutoTransfer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.repository.autoreload.AutoTransferRepositoryImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.fetchAutoTransfer(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoTransferRepositoryImpl$fetchAutoTransfer$1(com.paypal.oslo.feature.balance.data.repository.autoreload.AutoTransferRepositoryImpl autoTransferRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.repository.autoreload.AutoTransferRepositoryImpl$fetchAutoTransfer$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = autoTransferRepositoryImpl;
    }
}
