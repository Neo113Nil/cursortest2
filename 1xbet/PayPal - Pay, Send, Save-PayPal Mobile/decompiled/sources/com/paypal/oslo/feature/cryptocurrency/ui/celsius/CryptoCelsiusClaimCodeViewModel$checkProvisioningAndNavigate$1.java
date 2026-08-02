package com.paypal.oslo.feature.cryptocurrency.ui.celsius;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel", f = "CryptoCelsiusClaimCodeViewModel.kt", i = {}, l = {134}, m = "checkProvisioningAndNavigate", n = {}, nl = {137}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1(com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel cryptoCelsiusClaimCodeViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.celsius.CryptoCelsiusClaimCodeViewModel$checkProvisioningAndNavigate$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = cryptoCelsiusClaimCodeViewModel;
    }
}
