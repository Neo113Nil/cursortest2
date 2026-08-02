package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase", f = "GetPushProvisioningStatusUseCase.kt", i = {0, 0}, l = {107}, m = "checkTokenEligibility", n = {"tokens", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME}, nl = {109}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class GetPushProvisioningStatusUseCase$checkTokenEligibility$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getInputFormats.getHighSpeedVideoFpsRanges(null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetPushProvisioningStatusUseCase$checkTokenEligibility$1(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase getPushProvisioningStatusUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase$checkTokenEligibility$1> continuation) {
        super(continuation);
        this.getInputFormats = getPushProvisioningStatusUseCase;
    }
}
