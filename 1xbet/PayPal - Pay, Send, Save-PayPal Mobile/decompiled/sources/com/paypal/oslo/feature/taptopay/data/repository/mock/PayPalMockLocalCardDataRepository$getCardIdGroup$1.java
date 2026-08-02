package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository", f = "PayPalMockLocalCardDataRepository.kt", i = {0, 1, 2}, l = {118, 119, 120}, m = "getCardIdGroup", n = {"id", "id", "id"}, nl = {119, 120, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, s = {"L$0", "L$0", "L$0"}, v = 2)
/* loaded from: classes5.dex */
final class PayPalMockLocalCardDataRepository$getCardIdGroup$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getCardIdGroup(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalMockLocalCardDataRepository$getCardIdGroup$1(com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository payPalMockLocalCardDataRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository$getCardIdGroup$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = payPalMockLocalCardDataRepository;
    }
}
