package com.paypal.oslo.feature.xoom.ui.accountlinking;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel$initialize$1", f = "AccountLinkingViewModel.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, nl = {64}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class AccountLinkingViewModel$initialize$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase createWebViewHeadersUseCase;
        com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnNetworkError onNetworkError;
        com.paypal.oslo.feature.xoom.domain.usecase.CreateAccountLinkingInitialUrlUseCase createAccountLinkingInitialUrlUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            createWebViewHeadersUseCase = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            obj = createWebViewHeadersUseCase.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.xoom.LoggerKt.log;
        com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel accountLinkingViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            java.util.Map map = (java.util.Map) ((arrow.core.Either.Right) either).getValue();
            createAccountLinkingInitialUrlUseCase = accountLinkingViewModel.getHighSpeedVideoSizes;
            onNetworkError = new com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnInitialized(new com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiModel(createAccountLinkingInitialUrlUseCase.invoke(), map));
        } else {
            if (!(either instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.oslo.core.identity.domain.model.WebSessionTransferError webSessionTransferError = (com.paypal.oslo.core.identity.domain.model.WebSessionTransferError) ((arrow.core.Either.Left) either).getValue();
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(webSessionTransferError.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "Unknown";
            }
            java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("context", "account linking"), kotlin.TuplesKt.to("errorType", simpleName));
            if (webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.UserCancelled) {
                com.paypal.android.logger.Logger.d$default(logger, com.paypal.oslo.feature.xoom.ui.WebViewHeadersExtensionsKt.WebViewHeadersErrorMessage, mapOf, null, 4, null);
            } else {
                if (!(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.NetworkError) && !(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.AuthenticationFailed) && !(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.InvalidRedirectUri) && !(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.Unknown)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.w$default(logger, com.paypal.oslo.feature.xoom.ui.WebViewHeadersExtensionsKt.WebViewHeadersErrorMessage, mapOf, null, 4, null);
            }
            onNetworkError = com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent.OnNetworkError.INSTANCE;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(onNetworkError);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel$initialize$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel$initialize$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AccountLinkingViewModel$initialize$1(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel accountLinkingViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel$initialize$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = accountLinkingViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }
}
