package com.paypal.oslo.feature.verificationcapture.data.service;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl", f = "VerificationCaptureServiceImpl.kt", i = {}, l = {157}, m = "completeSession", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class VerificationCaptureServiceImpl$completeSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.completeSession(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationCaptureServiceImpl$completeSession$1(com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl verificationCaptureServiceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.data.service.VerificationCaptureServiceImpl$completeSession$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = verificationCaptureServiceImpl;
    }
}
