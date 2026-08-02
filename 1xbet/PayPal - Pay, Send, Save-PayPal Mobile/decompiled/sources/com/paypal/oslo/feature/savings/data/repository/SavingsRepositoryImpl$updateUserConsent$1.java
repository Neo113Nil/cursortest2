package com.paypal.oslo.feature.savings.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl", f = "SavingsRepositoryImpl.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE}, m = "updateUserConsent", n = {"hasAcceptedSavingsAccountTermsDisclosures"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE}, s = {"Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class SavingsRepositoryImpl$updateUserConsent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.updateUserConsent(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavingsRepositoryImpl$updateUserConsent$1(com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl savingsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.data.repository.SavingsRepositoryImpl$updateUserConsent$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = savingsRepositoryImpl;
    }
}
