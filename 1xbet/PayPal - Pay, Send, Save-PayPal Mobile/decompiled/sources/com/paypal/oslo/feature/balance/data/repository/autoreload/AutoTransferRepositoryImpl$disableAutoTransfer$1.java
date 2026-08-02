package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.repository.autoreload.AutoTransferRepositoryImpl", f = "AutoTransferRepositoryImpl.kt", i = {0, 0, 0, 0}, l = {82}, m = "disableAutoTransfer", n = {"currencyCode", "mutation", "apolloCall", "config"}, nl = {102}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes5.dex */
final class AutoTransferRepositoryImpl$disableAutoTransfer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.repository.autoreload.AutoTransferRepositoryImpl getInputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputFormats.disableAutoTransfer(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoTransferRepositoryImpl$disableAutoTransfer$1(com.paypal.oslo.feature.balance.data.repository.autoreload.AutoTransferRepositoryImpl autoTransferRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.repository.autoreload.AutoTransferRepositoryImpl$disableAutoTransfer$1> continuation) {
        super(continuation);
        this.getInputFormats = autoTransferRepositoryImpl;
    }
}
