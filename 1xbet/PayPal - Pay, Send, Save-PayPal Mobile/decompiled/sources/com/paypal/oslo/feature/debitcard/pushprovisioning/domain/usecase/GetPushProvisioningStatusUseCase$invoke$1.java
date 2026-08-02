package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase", f = "GetPushProvisioningStatusUseCase.kt", i = {0, 0, 1, 1, 2, 2}, l = {136, 69, 82}, m = "invoke", n = {"request", "$i$f$suspendCancellableCoroutine", "request", "provisionTokensResult", "request", "provisionTokensResult"}, nl = {146, 87, 87}, s = {"L$0", "I$0", "L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class GetPushProvisioningStatusUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.invoke2((com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetPushProvisioningStatusRequest) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitInstrumentTokenEligibilityResponse>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetPushProvisioningStatusUseCase$invoke$1(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase getPushProvisioningStatusUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = getPushProvisioningStatusUseCase;
    }
}
