package com.paypal.oslo.feature.wallet.cards.ui.add;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$4$1", f = "AddCardFlowRouter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddCardFlowRouterKt$AddCardFlowRouter$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes.handleFormResult(addCardFlowNavResult);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$4$1) create(addCardFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$4$1 addCardFlowRouterKt$AddCardFlowRouter$4$1 = new com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$4$1(this.getHighSpeedVideoSizes, continuation);
        addCardFlowRouterKt$AddCardFlowRouter$4$1.Camera2StreamConfigurationMap = obj;
        return addCardFlowRouterKt$AddCardFlowRouter$4$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddCardFlowRouterKt$AddCardFlowRouter$4$1(com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterViewModel addCardFlowRouterViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.add.AddCardFlowRouterKt$AddCardFlowRouter$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = addCardFlowRouterViewModel;
    }
}
