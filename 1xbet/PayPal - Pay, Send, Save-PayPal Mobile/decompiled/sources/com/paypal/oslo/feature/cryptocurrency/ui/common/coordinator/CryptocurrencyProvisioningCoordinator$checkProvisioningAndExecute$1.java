package com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator", f = "CryptocurrencyProvisioningCoordinator.kt", i = {0, 0, 0, 0, 0}, l = {68}, m = "checkProvisioningAndExecute", n = {"flowCapabilities", "onLoading", "onProceed", "onProvisioning", "onError"}, nl = {69}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes12.dex */
final class CryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.checkProvisioningAndExecute(null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1(com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator cryptocurrencyProvisioningCoordinator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator$checkProvisioningAndExecute$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = cryptocurrencyProvisioningCoordinator;
    }
}
