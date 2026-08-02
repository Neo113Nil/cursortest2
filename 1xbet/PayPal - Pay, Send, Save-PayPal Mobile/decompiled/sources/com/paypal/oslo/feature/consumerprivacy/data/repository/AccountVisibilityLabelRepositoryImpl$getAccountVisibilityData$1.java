package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityLabelRepositoryImpl", f = "AccountVisibilityLabelRepositoryImpl.kt", i = {}, l = {25}, m = "getAccountVisibilityData", n = {}, nl = {43}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AccountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityLabelRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getAccountVisibilityData(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1(com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityLabelRepositoryImpl accountVisibilityLabelRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityLabelRepositoryImpl$getAccountVisibilityData$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = accountVisibilityLabelRepositoryImpl;
    }
}
