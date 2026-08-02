package com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel$onReturnToMerchantClick$1", f = "AppSwitchEntryViewModel.kt", i = {0, 1}, l = {310, 317}, m = "invokeSuspend", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.CHECKOUT_URLS_KEY, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.CHECKOUT_URLS_KEY}, nl = {312, 319}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes13.dex */
final class AppSwitchEntryViewModel$onReturnToMerchantClick$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        if (r1.emit(new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.ReturnToMerchant(r12.getCancelUrl()), r11) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
    
        if (r1.emit(com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Effect.NavigateToHome.INSTANCE, r11) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession;
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger2;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            appSwitchSession = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs getHighSpeedVideoFpsRanges = appSwitchSession.getGetHighSpeedVideoFpsRanges();
            if (getHighSpeedVideoFpsRanges == null || !getHighSpeedVideoFpsRanges.getHasCancelUrl()) {
                checkoutLogger = this.getHighSpeedVideoFpsRangesFor.getOutputStallDurationlomOqCM;
                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(checkoutLogger, com.paypal.android.logger.categories.UI.Error.INSTANCE, "Return to merchant clicked but no cancelUrl available", kotlin.collections.MapsKt.emptyMap(), null, null, 24, null);
                mutableSharedFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getHighSpeedVideoFpsRanges);
                this.getHighSpeedVideoSizes = 2;
            } else {
                checkoutLogger2 = this.getHighSpeedVideoFpsRangesFor.getOutputStallDurationlomOqCM;
                com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(checkoutLogger2, "Returning to merchant from error screen", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cancelUrl", getHighSpeedVideoFpsRanges.getCancelUrl())), null, 4, null);
                mutableSharedFlow2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getHighSpeedVideoFpsRanges);
                this.getHighSpeedVideoSizes = 1;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel$onReturnToMerchantClick$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel$onReturnToMerchantClick$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSwitchEntryViewModel$onReturnToMerchantClick$1(com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel appSwitchEntryViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AppSwitchEntryViewModel$onReturnToMerchantClick$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = appSwitchEntryViewModel;
    }
}
