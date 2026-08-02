package com.paypal.oslo.app.emw.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel$initialize$1", f = "EmwViewModel.kt", i = {0}, l = {65}, m = "invokeSuspend", n = {"emwUrl"}, nl = {70}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class EmwViewModel$initialize$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider;
        com.paypal.oslo.app.emw.domain.usecase.WebAuthSessionAuthorizationUseCase webAuthSessionAuthorizationUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        arrow.core.Either either;
        com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel emwViewModel;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                mutableStateFlow2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                mutableStateFlow2.setValue(com.paypal.oslo.app.emw.domain.model.EmwUiState.Loading.INSTANCE);
                webEnvironmentProvider = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                java.lang.String resolveWebUrl = com.paypal.oslo.core.webview.config.WebEnvironmentProviderKt.resolveWebUrl(webEnvironmentProvider, "myaccount/summary");
                if (resolveWebUrl == null) {
                    mutableStateFlow3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                    mutableStateFlow3.setValue(new com.paypal.oslo.app.emw.domain.model.EmwUiState.UrlValidationFailed("Failed to resolve EMW URL"));
                    return kotlin.Unit.INSTANCE;
                }
                webAuthSessionAuthorizationUseCase = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(resolveWebUrl);
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                obj = webAuthSessionAuthorizationUseCase.invoke(new com.paypal.oslo.app.emw.domain.models.WebAuthContext(null, 1, null), resolveWebUrl, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            either = (arrow.core.Either) obj;
            emwViewModel = this.Camera2StreamConfigurationMap;
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.oslo.app.LoggerKt.log.e("EMW initialization failed", e2);
            mutableStateFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            mutableStateFlow.setValue(new com.paypal.oslo.app.emw.domain.model.EmwUiState.AuthenticationFailed("Authentication failed"));
        }
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.app.emw.domain.models.WebAuthSession webAuthSession = (com.paypal.oslo.app.emw.domain.models.WebAuthSession) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow5 = emwViewModel.getHighSpeedVideoFpsRanges;
            mutableStateFlow5.setValue(new com.paypal.oslo.app.emw.domain.model.EmwUiState.Ready(webAuthSession.getRedirectUrl()));
            return kotlin.Unit.INSTANCE;
        }
        if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.app.emw.domain.models.WebAuthSessionAuthorizationError webAuthSessionAuthorizationError = (com.paypal.oslo.app.emw.domain.models.WebAuthSessionAuthorizationError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.app.LoggerKt.log;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EMW authorization failed: ");
            sb.append(webAuthSessionAuthorizationError);
            com.paypal.android.logger.Logger.e$default(logger, sb.toString(), null, null, null, 14, null);
            mutableStateFlow4 = emwViewModel.getHighSpeedVideoFpsRanges;
            mutableStateFlow4.setValue(com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModelKt.access$toUiState(webAuthSessionAuthorizationError));
            return kotlin.Unit.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel$initialize$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel$initialize$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmwViewModel$initialize$1(com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel emwViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.emw.ui.viewmodel.EmwViewModel$initialize$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = emwViewModel;
    }
}
