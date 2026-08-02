package com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase", f = "UpdatePreferredFundingInstrumentUseCase.kt", i = {0, 0, 0, 0}, l = {46}, m = "invoke", n = {"agreementIds", "fundingInstrumentId", "balancePreference", "agreementType"}, nl = {51}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes15.dex */
final class UpdatePreferredFundingInstrumentUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputFormats.invoke(null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdatePreferredFundingInstrumentUseCase$invoke$1(com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase updatePreferredFundingInstrumentUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputFormats = updatePreferredFundingInstrumentUseCase;
    }
}
