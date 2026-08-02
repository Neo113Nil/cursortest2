package com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl", f = "MastercardConnectRepositoryImpl.kt", i = {}, l = {72}, m = "handleSdkCompletion", n = {}, nl = {74}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class MastercardConnectRepositoryImpl$handleSdkCompletion$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MastercardConnectRepositoryImpl$handleSdkCompletion$1(com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl mastercardConnectRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.banks.connectsdk.data.repository.MastercardConnectRepositoryImpl$handleSdkCompletion$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = mastercardConnectRepositoryImpl;
    }
}
