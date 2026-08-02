package com.paypal.oslo.feature.identity.passwordrecovery.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl", f = "PasswordRecoveryRepositoryImpl.kt", i = {0, 0, 0, 0}, l = {71}, m = "initiatePasswordRecovery", n = {"initiatePasswordRecoveryInput", "authInput", "mutation", "callConfig"}, nl = {78}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes12.dex */
final class PasswordRecoveryRepositoryImpl$initiatePasswordRecovery$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.initiatePasswordRecovery(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasswordRecoveryRepositoryImpl$initiatePasswordRecovery$1(com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl passwordRecoveryRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl$initiatePasswordRecovery$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = passwordRecoveryRepositoryImpl;
    }
}
