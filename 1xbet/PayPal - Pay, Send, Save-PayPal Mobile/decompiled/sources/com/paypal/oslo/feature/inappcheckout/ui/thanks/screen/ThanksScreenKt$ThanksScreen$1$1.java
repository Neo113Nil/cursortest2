package com.paypal.oslo.feature.inappcheckout.ui.thanks.screen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$ThanksScreen$1$1", f = "ThanksScreen.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ThanksScreenKt$ThanksScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ android.content.Context getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Effect> effect = this.getHighSpeedVideoFpsRanges.getEffect();
            final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator = this.getHighResolutionOutputSizeshNQ4ISI;
            final android.content.Context context = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (effect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$ThanksScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Effect effect2 = (com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Effect) obj2;
                    if (!(effect2 instanceof com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Effect.NavigateToReturnUrl)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this.navigateToPayPalHomeScreen();
                    com.paypal.oslo.feature.inappcheckout.ui.util.URLUtils.INSTANCE.openUrl(context, ((com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Effect.NavigateToReturnUrl) effect2).getReturnUrl());
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$ThanksScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$ThanksScreen$1$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThanksScreenKt$ThanksScreen$1$1(com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel thanksViewModel, com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt$ThanksScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = thanksViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = inAppCheckoutCoordinator;
        this.getHighSpeedVideoSizes = context;
    }
}
