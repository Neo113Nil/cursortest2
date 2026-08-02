package com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase", f = "GetFundingInstrumentsUseCase.kt", i = {0, 0}, l = {47}, m = "invoke", n = {"agreementIds", "agreementType"}, nl = {50}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class GetFundingInstrumentsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetFundingInstrumentsUseCase$invoke$1(com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase getFundingInstrumentsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = getFundingInstrumentsUseCase;
    }
}
