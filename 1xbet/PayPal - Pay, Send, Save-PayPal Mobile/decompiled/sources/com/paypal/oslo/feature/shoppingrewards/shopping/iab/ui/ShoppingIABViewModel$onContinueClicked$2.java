package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$onContinueClicked$2", f = "ShoppingIABViewModel.kt", i = {0, 0, 0}, l = {652}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-ShoppingIABViewModel$onContinueClicked$2$1"}, nl = {652}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class ShoppingIABViewModel$onContinueClicked$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m23436constructorimpl;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.MarkMerchantAsSeenUseCase markMerchantAsSeenUseCase;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel shoppingIABViewModel = this.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                markMerchantAsSeenUseCase = shoppingIABViewModel.getHighSpeedVideoFpsRangesFor;
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.Camera2StreamConfigurationMap = 0;
                this.getHighSpeedVideoSizes = 1;
                if (markMerchantAsSeenUseCase.invoke(iabOfferDetails, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23442isSuccessimpl(m23436constructorimpl)) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, "[IAB] markMerchantAsSeen completed", null, null, 6, null);
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, com.paypal.android.logger.categories.Presentation.Error.INSTANCE, "[IAB] markMerchantAsSeen failed", null, null, m23439exceptionOrNullimpl, 12, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$onContinueClicked$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$onContinueClicked$2 shoppingIABViewModel$onContinueClicked$2 = new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$onContinueClicked$2(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        shoppingIABViewModel$onContinueClicked$2.getInputFormats = obj;
        return shoppingIABViewModel$onContinueClicked$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShoppingIABViewModel$onContinueClicked$2(com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel shoppingIABViewModel, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.IabOfferDetails iabOfferDetails, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$onContinueClicked$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = shoppingIABViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = iabOfferDetails;
    }
}
