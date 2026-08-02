package com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/feature/inappcheckout/navigation/result/InAppCheckoutNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$OneShotScreen$1$1", f = "OneShotScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class OneShotScreenKt$OneShotScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.inappcheckout.navigation.result.InAppCheckoutNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes.onEvent(new com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event.Initialize(this.getHighResolutionOutputSizeshNQ4ISI));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.navigation.result.InAppCheckoutNavResult inAppCheckoutNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$OneShotScreen$1$1) create(inAppCheckoutNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$OneShotScreen$1$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneShotScreenKt$OneShotScreen$1$1(com.paypal.oslo.feature.inappcheckout.ui.oneshot.viewmodel.OneShotViewModel oneShotViewModel, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse authenticationXOResponse, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.oneshot.screen.OneShotScreenKt$OneShotScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = oneShotViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = authenticationXOResponse;
    }
}
