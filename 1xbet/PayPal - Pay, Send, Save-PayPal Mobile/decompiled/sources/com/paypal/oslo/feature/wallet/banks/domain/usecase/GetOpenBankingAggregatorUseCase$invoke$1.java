package com.paypal.oslo.feature.wallet.banks.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase", f = "GetOpenBankingAggregatorUseCase.kt", i = {0, 0, 0}, l = {63}, m = "invoke", n = {com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "excludeAggregators", "params"}, nl = {64}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class GetOpenBankingAggregatorUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getOutputFormats.invoke(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetOpenBankingAggregatorUseCase$invoke$1(com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase getOpenBankingAggregatorUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.domain.usecase.GetOpenBankingAggregatorUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputFormats = getOpenBankingAggregatorUseCase;
    }
}
