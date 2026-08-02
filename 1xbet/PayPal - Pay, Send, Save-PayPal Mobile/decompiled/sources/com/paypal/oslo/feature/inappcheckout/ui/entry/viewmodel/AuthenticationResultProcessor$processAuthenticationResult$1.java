package com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor$processAuthenticationResult$1", f = "AuthenticationResultProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AuthenticationResultProcessor$processAuthenticationResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid access$validateUniversalLinkData;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.BuildAuthenticationResultFromAuthResponseUseCase buildAuthenticationResultFromAuthResponseUseCase;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            access$validateUniversalLinkData = com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor.access$validateUniversalLinkData(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
        } catch (java.lang.IllegalStateException e) {
            com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor.access$handleAuthenticationResultError(this.getHighSpeedVideoSizes, e, this.getHighSpeedVideoFpsRangesFor);
        }
        if (access$validateUniversalLinkData == null) {
            return kotlin.Unit.INSTANCE;
        }
        buildAuthenticationResultFromAuthResponseUseCase = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
        arrow.core.Either<com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult> invoke = buildAuthenticationResultFromAuthResponseUseCase.invoke(this.getHighResolutionOutputSizeshNQ4ISI);
        if (invoke instanceof arrow.core.Either.Left) {
            this.getHighSpeedVideoFpsRangesFor.invoke(new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.OneShotAuthenticationError((com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError) ((arrow.core.Either.Left) invoke).getValue(), false));
            return kotlin.Unit.INSTANCE;
        }
        if (!(invoke instanceof arrow.core.Either.Right)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult oneShotAuthenticationResult = (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.OneShotAuthenticationResult) ((arrow.core.Either.Right) invoke).getValue();
        com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor.access$storeCheckoutPreferencesIfAvailable(this.getHighSpeedVideoSizes, oneShotAuthenticationResult);
        this.getHighSpeedVideoFpsRangesFor.invoke(new com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event.OneShotAuthenticationSuccess(oneShotAuthenticationResult, access$validateUniversalLinkData));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor$processAuthenticationResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor$processAuthenticationResult$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AuthenticationResultProcessor$processAuthenticationResult$1(com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor authenticationResultProcessor, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData universalLinkData, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.ui.entry.contract.AppSwitchEntryContract.Event, kotlin.Unit> function1, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData checkoutAuthenticationSuccessData, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.entry.viewmodel.AuthenticationResultProcessor$processAuthenticationResult$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = authenticationResultProcessor;
        this.getHighSpeedVideoFpsRanges = universalLinkData;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = checkoutAuthenticationSuccessData;
    }
}
