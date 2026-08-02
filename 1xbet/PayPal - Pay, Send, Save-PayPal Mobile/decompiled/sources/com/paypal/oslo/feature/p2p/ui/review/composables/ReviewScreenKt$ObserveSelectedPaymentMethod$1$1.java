package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveSelectedPaymentMethod$1$1", f = "ReviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ReviewScreenKt$ObserveSelectedPaymentMethod$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.Camera2StreamConfigurationMap != null) {
            com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels = this.getHighSpeedVideoFpsRanges;
            androidx.compose.runtime.State<com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState> state = this.getHighResolutionOutputSizeshNQ4ISI;
            reviewScreenViewModels.getReviewViewModel().processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ReviewEvent.UpdateSelectedFundingOption(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$ObserveSelectedPaymentMethod$lambda$0(state).getSelectedFundingOption()));
            com.paypal.oslo.feature.p2p.domain.model.PlanCurrencyExchange selectedPlanCurrencyExchange = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$ObserveSelectedPaymentMethod$lambda$0(state).getSelectedPlanCurrencyExchange();
            if (selectedPlanCurrencyExchange != null) {
                reviewScreenViewModels.getCurrencyConversionViewModel().processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.CurrencyConversionEvent.CachePlanCurrencyExchange(selectedPlanCurrencyExchange));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveSelectedPaymentMethod$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveSelectedPaymentMethod$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewScreenKt$ObserveSelectedPaymentMethod$1$1(java.lang.String str, com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, androidx.compose.runtime.State<com.paypal.oslo.feature.p2p.ui.review.state.PaymentMethodAccordionUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveSelectedPaymentMethod$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = reviewScreenViewModels;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
    }
}
