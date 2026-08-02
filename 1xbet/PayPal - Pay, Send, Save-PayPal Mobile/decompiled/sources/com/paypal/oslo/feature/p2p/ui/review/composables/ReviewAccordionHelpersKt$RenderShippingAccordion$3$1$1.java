package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$RenderShippingAccordion$3$1$1", f = "ReviewAccordionHelpers.kt", i = {}, l = {440}, m = "invokeSuspend", n = {}, nl = {439}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ReviewAccordionHelpersKt$RenderShippingAccordion$3$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor.getPaymentMethodAccordionViewModel().setLoading();
            this.Camera2StreamConfigurationMap = 1;
            obj = this.getHighSpeedVideoFpsRangesFor.getPaymentTypeAccordionViewModel().selectPaymentTypeAndUpdateBackend(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult paymentTypeUpdateResult = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult) obj;
        if (paymentTypeUpdateResult instanceof com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentTypeUpdateResult.Failed) {
            this.getHighSpeedVideoFpsRangesFor.getShippingAccordionViewModel().revertSelection();
        }
        com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, paymentTypeUpdateResult, null, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$RenderShippingAccordion$3$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$RenderShippingAccordion$3$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewAccordionHelpersKt$RenderShippingAccordion$3$1$1(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.composables.ReviewAccordionHelpersKt$RenderShippingAccordion$3$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = reviewScreenViewModels;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
    }
}
