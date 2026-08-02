package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl", f = "AccountVisibilityRepositoryImpl.kt", i = {0, 0}, l = {68}, m = "updateAllowPaymentRequests", n = {"allowFindByIdentifiers", "allowPaymentRequests"}, nl = {161}, s = {"Z$0", "Z$1"}, v = 2)
/* loaded from: classes11.dex */
final class AccountVisibilityRepositoryImpl$updateAllowPaymentRequests$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.updateAllowPaymentRequests(false, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountVisibilityRepositoryImpl$updateAllowPaymentRequests$1(com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl accountVisibilityRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowPaymentRequests$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = accountVisibilityRepositoryImpl;
    }
}
