package com.paypal.oslo.feature.identity.passwordrecovery.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl", f = "PasswordRecoveryRepositoryImpl.kt", i = {0, 0, 0, 0, 0}, l = {110}, m = "createPassword", n = {"createPasswordInput", "authInput", "mutation", "mutationCall", "callConfig"}, nl = {118}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes12.dex */
final class PasswordRecoveryRepositoryImpl$createPassword$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.createPassword(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasswordRecoveryRepositoryImpl$createPassword$1(com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl passwordRecoveryRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passwordrecovery.data.repository.PasswordRecoveryRepositoryImpl$createPassword$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = passwordRecoveryRepositoryImpl;
    }
}
