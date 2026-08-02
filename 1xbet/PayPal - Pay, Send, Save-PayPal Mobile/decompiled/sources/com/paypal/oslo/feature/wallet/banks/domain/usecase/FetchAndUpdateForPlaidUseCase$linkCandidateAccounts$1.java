package com.paypal.oslo.feature.wallet.banks.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase", f = "FetchAndUpdateForPlaidUseCase.kt", i = {0, 0, 0, 0, 0, 0}, l = {115}, m = "linkCandidateAccounts", n = {"credentialToken", "externalBankId", "bankName", "countryCode", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "linkParams"}, nl = {116}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes15.dex */
final class FetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getOutputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges(null, null, null, null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1(com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase fetchAndUpdateForPlaidUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.domain.usecase.FetchAndUpdateForPlaidUseCase$linkCandidateAccounts$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = fetchAndUpdateForPlaidUseCase;
    }
}
