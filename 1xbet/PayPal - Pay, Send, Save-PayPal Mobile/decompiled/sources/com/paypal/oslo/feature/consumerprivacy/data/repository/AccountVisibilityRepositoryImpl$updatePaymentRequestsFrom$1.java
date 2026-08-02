package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl", f = "AccountVisibilityRepositoryImpl.kt", i = {0, 0, 0}, l = {92}, m = "updatePaymentRequestsFrom", n = {"paymentRequestsFrom", "allowFindByIdentifiers", "allowPaymentRequests"}, nl = {96}, s = {"L$0", "Z$0", "Z$1"}, v = 2)
/* loaded from: classes11.dex */
final class AccountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.updatePaymentRequestsFrom(false, false, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1(com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl accountVisibilityRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updatePaymentRequestsFrom$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = accountVisibilityRepositoryImpl;
    }
}
