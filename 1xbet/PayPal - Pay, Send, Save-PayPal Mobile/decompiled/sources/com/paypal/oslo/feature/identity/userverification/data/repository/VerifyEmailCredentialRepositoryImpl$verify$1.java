package com.paypal.oslo.feature.identity.userverification.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImpl", f = "VerifyEmailCredentialRepositoryImpl.kt", i = {0}, l = {31}, m = "verify", n = {"verifyCredentialRequest"}, nl = {32}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class VerifyEmailCredentialRepositoryImpl$verify$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImpl getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.verify(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerifyEmailCredentialRepositoryImpl$verify$1(com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImpl verifyEmailCredentialRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.userverification.data.repository.VerifyEmailCredentialRepositoryImpl$verify$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = verifyEmailCredentialRepositoryImpl;
    }
}
