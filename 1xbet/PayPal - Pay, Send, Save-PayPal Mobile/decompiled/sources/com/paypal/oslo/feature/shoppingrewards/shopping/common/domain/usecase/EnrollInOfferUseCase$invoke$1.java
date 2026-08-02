package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase", f = "EnrollInOfferUseCase.kt", i = {0}, l = {31}, m = "invoke", n = {"request"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class EnrollInOfferUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke2((java.lang.String) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<kotlin.Unit>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnrollInOfferUseCase$invoke$1(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase enrollInOfferUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = enrollInOfferUseCase;
    }
}
