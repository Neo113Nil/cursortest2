package com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase", f = "CheckCryptoProvisioningUseCase.kt", i = {0}, l = {49}, m = "invoke", n = {"flowCapabilities"}, nl = {50}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class CheckCryptoProvisioningUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckCryptoProvisioningUseCase$invoke$1(com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioningUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = checkCryptoProvisioningUseCase;
    }
}
