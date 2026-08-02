package com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository.PasskeyCreateRepositoryImpl", f = "PasskeyCreateRepositoryImpl.kt", i = {0, 0, 0}, l = {90}, m = "createPasskey", n = {"passkeyCreateRequest", "createPasskeyInput", "createPasskeyMutation"}, nl = {100}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyCreateRepositoryImpl$createPasskey$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository.PasskeyCreateRepositoryImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.createPasskey(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyCreateRepositoryImpl$createPasskey$1(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository.PasskeyCreateRepositoryImpl passkeyCreateRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository.PasskeyCreateRepositoryImpl$createPasskey$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = passkeyCreateRepositoryImpl;
    }
}
