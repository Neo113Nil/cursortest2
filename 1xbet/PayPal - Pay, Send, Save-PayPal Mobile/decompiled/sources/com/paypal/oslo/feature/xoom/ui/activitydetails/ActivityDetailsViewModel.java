package com.paypal.oslo.feature.xoom.ui.activitydetails;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\"0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020!0$8\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010*\u001a\b\u0012\u0004\u0012\u00020\"0)8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsReducer;", "reducer", "Lcom/paypal/oslo/feature/xoom/domain/usecase/ValidateUserUseCase;", "validateUserUseCase", "Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateActivityDetailsInitialUrlUseCase;", "createActivityDetailsInitialUrlUseCase", "Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateWebViewHeadersUseCase;", "createWebViewHeadersUseCase", "Lcom/paypal/oslo/feature/xoom/domain/usecase/SetUserAgreementAcceptedUseCase;", "setUserAgreementAcceptedUseCase", "<init>", "(Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsReducer;Lcom/paypal/oslo/feature/xoom/domain/usecase/ValidateUserUseCase;Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateActivityDetailsInitialUrlUseCase;Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateWebViewHeadersUseCase;Lcom/paypal/oslo/feature/xoom/domain/usecase/SetUserAgreementAcceptedUseCase;)V", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsEvent;)V", "", "invoiceId", "onLoad", "(Ljava/lang/String;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/xoom/domain/usecase/ValidateUserUseCase;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateActivityDetailsInitialUrlUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateWebViewHeadersUseCase;", "Lcom/paypal/oslo/feature/xoom/domain/usecase/SetUserAgreementAcceptedUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiState;", "Lcom/paypal/oslo/feature/xoom/ui/activitydetails/ActivityDetailsUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ActivityDetailsViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState, com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent, com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.xoom.domain.usecase.CreateActivityDetailsInitialUrlUseCase getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState> uiState;

    @javax.inject.Inject
    public ActivityDetailsViewModel(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsReducer activityDetailsReducer, com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase validateUserUseCase, com.paypal.oslo.feature.xoom.domain.usecase.CreateActivityDetailsInitialUrlUseCase createActivityDetailsInitialUrlUseCase, com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase createWebViewHeadersUseCase, com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase setUserAgreementAcceptedUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailsReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateUserUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createActivityDetailsInitialUrlUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createWebViewHeadersUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setUserAgreementAcceptedUseCase, "");
        this.getHighSpeedVideoFpsRanges = validateUserUseCase;
        this.getHighSpeedVideoSizes = createActivityDetailsInitialUrlUseCase;
        this.getHighSpeedVideoFpsRangesFor = createWebViewHeadersUseCase;
        this.Camera2StreamConfigurationMap = setUserAgreementAcceptedUseCase;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState, com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent, com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("ActivityDetailsViewModel.store", com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initial.INSTANCE, activityDetailsReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState, com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent>() { // from class: com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState, com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.Initialize) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r1), null, null, new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel$initialize$1(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel.this, ((com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.Initialize) event).getInvoiceId(), input.getEventDispatcher(), null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighResolutionOutputSizeshNQ4ISI = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$createOnInitializedEvent(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel activityDetailsViewModel, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel$createOnInitializedEvent$1 activityDetailsViewModel$createOnInitializedEvent$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel$createOnInitializedEvent$1) {
            activityDetailsViewModel$createOnInitializedEvent$1 = (com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel$createOnInitializedEvent$1) continuation;
            if ((activityDetailsViewModel$createOnInitializedEvent$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                activityDetailsViewModel$createOnInitializedEvent$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = activityDetailsViewModel$createOnInitializedEvent$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityDetailsViewModel$createOnInitializedEvent$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase createWebViewHeadersUseCase = activityDetailsViewModel.getHighSpeedVideoFpsRangesFor;
                    activityDetailsViewModel$createOnInitializedEvent$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    activityDetailsViewModel$createOnInitializedEvent$1.getHighSpeedVideoFpsRanges = 1;
                    obj = createWebViewHeadersUseCase.invoke(activityDetailsViewModel$createOnInitializedEvent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) activityDetailsViewModel$createOnInitializedEvent$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.xoom.LoggerKt.log;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInitialized(new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiModel(activityDetailsViewModel.getHighSpeedVideoSizes.invoke(str), (java.util.Map) ((arrow.core.Either.Right) either).getValue()));
                }
                if (!(either instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.core.identity.domain.model.WebSessionTransferError webSessionTransferError = (com.paypal.oslo.core.identity.domain.model.WebSessionTransferError) ((arrow.core.Either.Left) either).getValue();
                java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(webSessionTransferError.getClass()).getSimpleName();
                if (simpleName == null) {
                    simpleName = "Unknown";
                }
                java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("context", "activity details"), kotlin.TuplesKt.to("errorType", simpleName));
                if (webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.UserCancelled) {
                    com.paypal.android.logger.Logger.d$default(logger, com.paypal.oslo.feature.xoom.ui.WebViewHeadersExtensionsKt.WebViewHeadersErrorMessage, mapOf, null, 4, null);
                } else {
                    if (!(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.NetworkError) && !(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.AuthenticationFailed) && !(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.InvalidRedirectUri) && !(webSessionTransferError instanceof com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.Unknown)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.w$default(logger, com.paypal.oslo.feature.xoom.ui.WebViewHeadersExtensionsKt.WebViewHeadersErrorMessage, mapOf, null, 4, null);
                }
                return com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnNetworkError.INSTANCE;
            }
        }
        activityDetailsViewModel$createOnInitializedEvent$1 = new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel$createOnInitializedEvent$1(activityDetailsViewModel, continuation);
        java.lang.Object obj2 = activityDetailsViewModel$createOnInitializedEvent$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityDetailsViewModel$createOnInitializedEvent$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.xoom.LoggerKt.log;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighResolutionOutputSizeshNQ4ISI.onEvent(event);
    }

    public final void onLoad(java.lang.String invoiceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceId, "");
        if (this.uiState.getValue() instanceof com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsUiState.Initial) {
            processEvent(new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.Initialize(invoiceId));
        }
    }
}
