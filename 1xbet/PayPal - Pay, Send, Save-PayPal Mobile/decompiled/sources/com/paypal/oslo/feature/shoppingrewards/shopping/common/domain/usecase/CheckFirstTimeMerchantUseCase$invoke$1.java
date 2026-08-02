package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase", f = "CheckFirstTimeMerchantUseCase.kt", i = {0, 0}, l = {33}, m = "invoke", n = {"offerDetails", "merchantId"}, nl = {-1}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class CheckFirstTimeMerchantUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckFirstTimeMerchantUseCase$invoke$1(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase checkFirstTimeMerchantUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.CheckFirstTimeMerchantUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = checkFirstTimeMerchantUseCase;
    }
}
