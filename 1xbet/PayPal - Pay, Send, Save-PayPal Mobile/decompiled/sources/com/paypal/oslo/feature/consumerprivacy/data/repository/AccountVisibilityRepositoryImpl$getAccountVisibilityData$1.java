package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl", f = "AccountVisibilityRepositoryImpl.kt", i = {}, l = {29}, m = "getAccountVisibilityData", n = {}, nl = {161}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AccountVisibilityRepositoryImpl$getAccountVisibilityData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getAccountVisibilityData(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountVisibilityRepositoryImpl$getAccountVisibilityData$1(com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl accountVisibilityRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$getAccountVisibilityData$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = accountVisibilityRepositoryImpl;
    }
}
