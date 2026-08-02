package com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler$fetchCheckoutPreferences$1", f = "OneShotAuthenticationHandler.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class OneShotAuthenticationHandler$fetchCheckoutPreferences$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event, kotlin.Unit> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.GetCheckoutPreferencesUseCase getCheckoutPreferencesUseCase;
        java.lang.Object invoke;
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger;
        com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger checkoutLogger2;
        com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getCheckoutPreferencesUseCase = this.getInputFormats.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            invoke = getCheckoutPreferencesUseCase.invoke(this.getHighSpeedVideoFpsRanges.getCheckoutToken(), this.getHighSpeedVideoSizes, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler oneShotAuthenticationHandler = this.getInputFormats;
        kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult oneShotAuthenticationResult = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences) ((arrow.core.Either.Right) either).getValue();
            checkoutLogger2 = oneShotAuthenticationHandler.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.d$default(checkoutLogger2, "Checkout preferences retrieved successfully", null, null, 6, null);
            appSwitchSession = oneShotAuthenticationHandler.getHighSpeedVideoFpsRanges;
            appSwitchSession.setCheckoutPreferences(checkoutPreferences);
            function1.invoke(new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.OneShotAuthenticationSuccess(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult.copy$default(oneShotAuthenticationResult, null, checkoutPreferences, null, 5, null), valid));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError checkoutURLError = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError) ((arrow.core.Either.Left) either).getValue();
            checkoutLogger = oneShotAuthenticationHandler.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.inappcheckout.features.logger.CheckoutLogger.e$default(checkoutLogger, com.paypal.android.logger.categories.UI.Error.INSTANCE, "Failed to get checkout preferences", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", checkoutURLError.toString())), null, null, 24, null);
            function1.invoke(new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.OneShotAuthenticationError(checkoutURLError, false));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler$fetchCheckoutPreferences$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler$fetchCheckoutPreferences$1(this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OneShotAuthenticationHandler$fetchCheckoutPreferences$1(com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler oneShotAuthenticationHandler, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid, java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event, kotlin.Unit> function1, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult oneShotAuthenticationResult, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.OneShotAuthenticationHandler$fetchCheckoutPreferences$1> continuation) {
        super(2, continuation);
        this.getInputFormats = oneShotAuthenticationHandler;
        this.getHighSpeedVideoFpsRanges = valid;
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoFpsRangesFor = oneShotAuthenticationResult;
    }
}
