package com.paypal.oslo.feature.identity.passwordrecovery.controller;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator", f = "PasswordRecoveryFlowCoordinator.kt", i = {0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE}, m = "initiatePasswordRecovery", n = {"publicCredential", "requestId", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "onError", "onPasswordCreated", "input"}, nl = {481}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes12.dex */
final class PasswordRecoveryFlowCoordinator$initiatePasswordRecovery$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.initiatePasswordRecovery(null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasswordRecoveryFlowCoordinator$initiatePasswordRecovery$1(com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator passwordRecoveryFlowCoordinator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passwordrecovery.controller.PasswordRecoveryFlowCoordinator$initiatePasswordRecovery$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = passwordRecoveryFlowCoordinator;
    }
}
