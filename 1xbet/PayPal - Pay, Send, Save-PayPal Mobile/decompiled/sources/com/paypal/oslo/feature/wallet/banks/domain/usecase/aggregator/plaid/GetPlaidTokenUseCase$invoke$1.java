package com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase", f = "GetPlaidTokenUseCase.kt", i = {0, 0, 0, 0, 0, 0}, l = {76}, m = "invoke", n = {com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "action", "countryCode", "locale", "instrumentId", "params"}, nl = {77}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes15.dex */
final class GetPlaidTokenUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputFormats.invoke(null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetPlaidTokenUseCase$invoke$1(com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase getPlaidTokenUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.domain.usecase.aggregator.plaid.GetPlaidTokenUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputFormats = getPlaidTokenUseCase;
    }
}
