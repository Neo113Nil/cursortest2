package com.paypal.oslo.feature.identity.llslogin.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.llslogin.data.repository.LLSEligibilityRepositoryImpl", f = "LLSEligibilityRepositoryImpl.kt", i = {}, l = {53}, m = "isEligibleForLogin", n = {}, nl = {54}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class LLSEligibilityRepositoryImpl$isEligibleForLogin$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.llslogin.data.repository.LLSEligibilityRepositoryImpl getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.isEligibleForLogin(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LLSEligibilityRepositoryImpl$isEligibleForLogin$1(com.paypal.oslo.feature.identity.llslogin.data.repository.LLSEligibilityRepositoryImpl lLSEligibilityRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.llslogin.data.repository.LLSEligibilityRepositoryImpl$isEligibleForLogin$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = lLSEligibilityRepositoryImpl;
    }
}
