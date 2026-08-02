package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$attemptEnrollment$1", f = "ShoppingIABViewModel.kt", i = {}, l = {699}, m = "invokeSuspend", n = {}, nl = {700}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ShoppingIABViewModel$attemptEnrollment$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase enrollInOfferUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "[IAB] enrollInOfferUseCase starting", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("offerId", this.getHighSpeedVideoFpsRanges)), null, 4, null);
            enrollInOfferUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            obj = enrollInOfferUseCase.invoke2(this.getHighSpeedVideoFpsRanges, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult<kotlin.Unit>>) this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult useCaseResult = (com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) obj;
        if (useCaseResult instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "[IAB] enrollInOfferUseCase SUCCESS", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("offerId", this.getHighSpeedVideoFpsRanges)), null, 4, null);
        } else {
            if (!(useCaseResult instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, com.paypal.android.logger.categories.Presentation.Error.INSTANCE, "[IAB] enrollInOfferUseCase FAILED", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("offerId", this.getHighSpeedVideoFpsRanges), kotlin.TuplesKt.to("errorType", ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error) useCaseResult).getTag())), null, null, 24, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$attemptEnrollment$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$attemptEnrollment$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShoppingIABViewModel$attemptEnrollment$1(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel shoppingIABViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$attemptEnrollment$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = shoppingIABViewModel;
    }
}
