package com.paypal.oslo.feature.subscriptions.cancel.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase", f = "DisableAgreementUseCase.kt", i = {0, 0}, l = {39}, m = "invoke", n = {"agreementId", "agreementType"}, nl = {40}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class DisableAgreementUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.invoke(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DisableAgreementUseCase$invoke$1(com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase disableAgreementUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = disableAgreementUseCase;
    }
}
