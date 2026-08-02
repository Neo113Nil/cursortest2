package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveShippingAddresses$1$1", f = "ReviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ReviewScreenKt$ObserveShippingAddresses$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.p2p.ui.review.state.ReviewUiState> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem selectedContact = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$ObserveShippingAddresses$lambda$1(this.getHighSpeedVideoSizes).getSelectedContact();
        java.lang.String previousSelectedContactId = com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt.access$ObserveShippingAddresses$lambda$1(this.getHighSpeedVideoSizes).getPreviousSelectedContactId();
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> value = this.getHighSpeedVideoFpsRangesFor.getShippingAccordionViewModel().getAddresses().getValue();
        if (selectedContact != null && previousSelectedContactId != null && !kotlin.jvm.internal.Intrinsics.areEqual(selectedContact.getId(), previousSelectedContactId) && value != null) {
            this.getHighSpeedVideoFpsRangesFor.getShippingAccordionViewModel().setLoading();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveShippingAddresses$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveShippingAddresses$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewScreenKt$ObserveShippingAddresses$1$1(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, androidx.compose.runtime.State<com.paypal.oslo.feature.p2p.ui.review.state.ReviewUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ObserveShippingAddresses$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = reviewScreenViewModels;
        this.getHighSpeedVideoSizes = state;
    }
}
