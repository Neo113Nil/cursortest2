package com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository.PasskeyDeleteRepositoryImpl", f = "PasskeyDeleteRepositoryImpl.kt", i = {0, 0, 0}, l = {89}, m = "deletePasskey", n = {"passkeyDeleteRequest", "deletePasskeyInput", "passkeyDeleteMutation"}, nl = {99}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyDeleteRepositoryImpl$deletePasskey$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository.PasskeyDeleteRepositoryImpl getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getInputFormats.deletePasskey(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyDeleteRepositoryImpl$deletePasskey$1(com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository.PasskeyDeleteRepositoryImpl passkeyDeleteRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository.PasskeyDeleteRepositoryImpl$deletePasskey$1> continuation) {
        super(continuation);
        this.getInputFormats = passkeyDeleteRepositoryImpl;
    }
}
