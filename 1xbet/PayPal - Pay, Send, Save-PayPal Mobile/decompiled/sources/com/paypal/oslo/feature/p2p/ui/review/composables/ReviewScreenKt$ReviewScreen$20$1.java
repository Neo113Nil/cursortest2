package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/publicprofile/api/navigation/result/ContactRemovedNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ReviewScreen$20$1", f = "ReviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ReviewScreenKt$ReviewScreen$20$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.publicprofile.api.navigation.result.ContactRemovedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.publicprofile.api.navigation.result.ContactRemovedNavResult contactRemovedNavResult = (com.paypal.oslo.feature.publicprofile.api.navigation.result.ContactRemovedNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighResolutionOutputSizeshNQ4ISI.getContactSectionViewModel().processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RemoveRecommendedContact(contactRemovedNavResult.getContactId(), contactRemovedNavResult.getContactName()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.publicprofile.api.navigation.result.ContactRemovedNavResult contactRemovedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ReviewScreen$20$1) create(contactRemovedNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ReviewScreen$20$1 reviewScreenKt$ReviewScreen$20$1 = new com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ReviewScreen$20$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        reviewScreenKt$ReviewScreen$20$1.Camera2StreamConfigurationMap = obj;
        return reviewScreenKt$ReviewScreen$20$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewScreenKt$ReviewScreen$20$1(com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenViewModels reviewScreenViewModels, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.review.composables.ReviewScreenKt$ReviewScreen$20$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = reviewScreenViewModels;
    }
}
