package com.paypal.oslo.feature.identity.passwordrecovery.controller;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator", f = "PasswordRecoveryFlowCoordinator.kt", i = {0, 0, 0}, l = {340}, m = "navigateToCreatePassword", n = {"createPasswordChallenge", "nonce", "partialToken"}, nl = {341}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes12.dex */
final class PasswordRecoveryFlowCoordinator$navigateToCreatePassword$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(null, null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasswordRecoveryFlowCoordinator$navigateToCreatePassword$1(com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator passwordRecoveryFlowCoordinator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$navigateToCreatePassword$1> continuation) {
        super(continuation);
        this.getInputFormats = passwordRecoveryFlowCoordinator;
    }
}
