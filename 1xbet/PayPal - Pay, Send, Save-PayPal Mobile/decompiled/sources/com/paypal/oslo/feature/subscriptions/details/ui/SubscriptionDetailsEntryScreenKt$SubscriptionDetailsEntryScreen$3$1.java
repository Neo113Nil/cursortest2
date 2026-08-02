package com.paypal.oslo.feature.subscriptions.details.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/feature/subscriptions/updatefi/navigation/result/UpdateFiSuccessNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$SubscriptionDetailsEntryScreen$3$1", f = "SubscriptionDetailsEntryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class SubscriptionDetailsEntryScreenKt$SubscriptionDetailsEntryScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.subscriptions.updatefi.navigation.result.UpdateFiSuccessNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges.showToast(this.getHighSpeedVideoSizes);
        this.getHighSpeedVideoFpsRangesFor.onUpdateFiSuccess(this.Camera2StreamConfigurationMap);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.updatefi.navigation.result.UpdateFiSuccessNavResult updateFiSuccessNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$SubscriptionDetailsEntryScreen$3$1) create(updateFiSuccessNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$SubscriptionDetailsEntryScreen$3$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionDetailsEntryScreenKt$SubscriptionDetailsEntryScreen$3$1(com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState uiToastState, java.lang.String str, com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel subscriptionDetailViewModel, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.details.ui.SubscriptionDetailsEntryScreenKt$SubscriptionDetailsEntryScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = uiToastState;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = subscriptionDetailViewModel;
        this.Camera2StreamConfigurationMap = str2;
    }
}
