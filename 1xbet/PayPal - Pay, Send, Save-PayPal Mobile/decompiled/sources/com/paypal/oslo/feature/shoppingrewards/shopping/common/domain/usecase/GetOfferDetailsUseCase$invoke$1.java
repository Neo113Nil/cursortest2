package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase", f = "GetOfferDetailsUseCase.kt", i = {0}, l = {39}, m = "invoke", n = {"request"}, nl = {40}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class GetOfferDetailsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke2((com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase.Request) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetOfferDetailsUseCase$invoke$1(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase getOfferDetailsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GetOfferDetailsUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = getOfferDetailsUseCase;
    }
}
