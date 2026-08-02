package com.paypal.oslo.feature.identity.unifiedalert.ui;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 <2\u00020\u0001:\u0001<B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010\u001fR\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010'R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010(\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010+R&\u00101\u001a\u0014\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020.0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020-028\u0007¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u00108\u001a\b\u0012\u0004\u0012\u00020.078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/usecase/UnifiedAlertUseCase;", "unifiedAlertUseCase", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/usecase/FetchUnifiedAlertsUseCase;", "fetchUnifiedAlertsUseCase", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationTokenProvider;", "pushTokenProvider", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;", "getRememberedUserUseCase", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/AlertDeduplicationManager;", "deduplicationManager", "<init>", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/usecase/UnifiedAlertUseCase;Lcom/paypal/oslo/feature/identity/unifiedalert/domain/usecase/FetchUnifiedAlertsUseCase;Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationTokenProvider;Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;Lcom/paypal/oslo/feature/identity/unifiedalert/domain/AlertDeduplicationManager;)V", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "alertData", "", "source", "", "processDestination", "(Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;Ljava/lang/String;)V", "docId", "", "expiryTime", "processDeeplink", "(Ljava/lang/String;Ljava/lang/Long;)V", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent;", "event", "processEvent", "(Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertEvent;)V", "onRetry", "()V", "onFlowCompleted", "getOutputFormats", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/usecase/UnifiedAlertUseCase;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/usecase/FetchUnifiedAlertsUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationTokenProvider;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/GetRememberedUserUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/AlertDeduplicationManager;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiState;", "Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertUiEffect;", "getInputFormats", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UnifiedAlertViewModel extends androidx.view.ViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.FetchUnifiedAlertsUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiEffect> getInputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.UnifiedAlertUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState> uiState;
    private static final com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel.Companion Companion = new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel.Companion(null);
    public static final int $stable = 8;
    private static final com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert("", "", "", "", null, "", kotlin.collections.MapsKt.emptyMap(), 0, 0, kotlin.collections.CollectionsKt.emptyList(), false);

    @javax.inject.Inject
    public UnifiedAlertViewModel(com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.UnifiedAlertUseCase unifiedAlertUseCase, com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.FetchUnifiedAlertsUseCase fetchUnifiedAlertsUseCase, com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider pushNotificationTokenProvider, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase, com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager alertDeduplicationManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unifiedAlertUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchUnifiedAlertsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationTokenProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRememberedUserUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertDeduplicationManager, "");
        this.getHighSpeedVideoFpsRangesFor = unifiedAlertUseCase;
        this.getHighSpeedVideoSizes = fetchUnifiedAlertsUseCase;
        this.getHighSpeedVideoFpsRanges = pushNotificationTokenProvider;
        this.getHighResolutionOutputSizeshNQ4ISI = getRememberedUserUseCase;
        this.Camera2StreamConfigurationMap = alertDeduplicationManager;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("UnifiedAlertStore", com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Loading.INSTANCE, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertReducer.INSTANCE, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent>() { // from class: com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$createSideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState first = input.getStates().getFirst();
                com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState second = input.getStates().getSecond();
                if ((first instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.AlertAction) && (second instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing)) {
                    com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent event = input.getEvent();
                    if (event instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnYesClicked) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$createSideEffectsMiddleware$1$invoke$1(second, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel.this, input, null), 3, null);
                    } else if (event instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnNoClicked) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(input.getScope(), null, null, new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$createSideEffectsMiddleware$1$invoke$2(second, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel.this, input, null), 3, null);
                    } else {
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                }
            }
        }, new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent>() { // from class: com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$createLoggingMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "UnifiedAlert", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("event", input.getEvent().getName()), kotlin.TuplesKt.to("old_state", input.getStates().getFirst().getName()), kotlin.TuplesKt.to("new_state", input.getStates().getSecond().getName())), null, 4, null);
            }
        }}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getInputSizeshNQ4ISI = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$executeValidation(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel unifiedAlertViewModel, com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing processing, com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction unifiedAlertAction, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$executeValidation$1 unifiedAlertViewModel$executeValidation$1;
        int i;
        com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnConfirmSuccess onConfirmSuccess;
        com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent unifiedAlertEvent;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$executeValidation$1) {
            unifiedAlertViewModel$executeValidation$1 = (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$executeValidation$1) continuation;
            if ((unifiedAlertViewModel$executeValidation$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                unifiedAlertViewModel$executeValidation$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$executeValidation$1 unifiedAlertViewModel$executeValidation$12 = unifiedAlertViewModel$executeValidation$1;
                java.lang.Object obj = unifiedAlertViewModel$executeValidation$12.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = unifiedAlertViewModel$executeValidation$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    int i2 = com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel.WhenMappings.$EnumSwitchMapping$0[unifiedAlertAction.ordinal()];
                    if (i2 == 1) {
                        onConfirmSuccess = com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnConfirmSuccess.INSTANCE;
                    } else {
                        if (i2 != 2) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        onConfirmSuccess = com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnDenySuccess.INSTANCE;
                    }
                    com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.UnifiedAlertUseCase unifiedAlertUseCase = unifiedAlertViewModel.getHighSpeedVideoFpsRangesFor;
                    java.lang.String documentId = processing.getAlertData().getDocumentId();
                    java.lang.String source = processing.getSource();
                    java.util.List<java.lang.String> acceptableClaims = processing.getAlertData().getAcceptableClaims();
                    unifiedAlertViewModel$executeValidation$12.getHighSpeedVideoFpsRangesFor = processing;
                    unifiedAlertViewModel$executeValidation$12.getHighResolutionOutputSizeshNQ4ISI = unifiedAlertAction;
                    unifiedAlertViewModel$executeValidation$12.getHighSpeedVideoSizes = function1;
                    unifiedAlertViewModel$executeValidation$12.Camera2StreamConfigurationMap = onConfirmSuccess;
                    unifiedAlertViewModel$executeValidation$12.getHighSpeedVideoFpsRanges = 1;
                    java.lang.Object invoke = unifiedAlertUseCase.invoke(documentId, unifiedAlertAction, source, acceptableClaims, unifiedAlertViewModel$executeValidation$12);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent unifiedAlertEvent2 = onConfirmSuccess;
                    obj = invoke;
                    unifiedAlertEvent = unifiedAlertEvent2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    unifiedAlertEvent = (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent) unifiedAlertViewModel$executeValidation$12.Camera2StreamConfigurationMap;
                    function1 = (kotlin.jvm.functions.Function1) unifiedAlertViewModel$executeValidation$12.getHighSpeedVideoSizes;
                    unifiedAlertAction = (com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction) unifiedAlertViewModel$executeValidation$12.getHighResolutionOutputSizeshNQ4ISI;
                    processing = (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Processing) unifiedAlertViewModel$executeValidation$12.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isRight()) {
                    function1.invoke(unifiedAlertEvent);
                }
                if (either.isLeft()) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Failed to validate unified alert", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("alert_type", processing.getAlertData().getAlertType()), kotlin.TuplesKt.to("action", unifiedAlertAction.name()), kotlin.TuplesKt.to("error_reason", ((com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError) ((arrow.core.Either.Left) either).getValue()).toString())), null, 4, null);
                    function1.invoke(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnProcessError.INSTANCE);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        unifiedAlertViewModel$executeValidation$1 = new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$executeValidation$1(unifiedAlertViewModel, continuation);
        com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$executeValidation$1 unifiedAlertViewModel$executeValidation$122 = unifiedAlertViewModel$executeValidation$1;
        java.lang.Object obj2 = unifiedAlertViewModel$executeValidation$122.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = unifiedAlertViewModel$executeValidation$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isRight()) {
        }
        if (either.isLeft()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x019d, code lost:
    
        if (r1 == r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00df, code lost:
    
        if (r1 != r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x008b, code lost:
    
        if (r1 != r3) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$fetchForDeeplink(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel unifiedAlertViewModel, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$fetchForDeeplink$1 unifiedAlertViewModel$fetchForDeeplink$1;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.String str2;
        java.lang.Object invoke;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String publicCredential;
        if (continuation instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$fetchForDeeplink$1) {
            unifiedAlertViewModel$fetchForDeeplink$1 = (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$fetchForDeeplink$1) continuation;
            if ((unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoSizesFor;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.pushnotification.domain.PushNotificationTokenProvider pushNotificationTokenProvider = unifiedAlertViewModel.getHighSpeedVideoFpsRanges;
                    str2 = str;
                    unifiedAlertViewModel$fetchForDeeplink$1.Camera2StreamConfigurationMap = str2;
                    unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = pushNotificationTokenProvider.getToken(unifiedAlertViewModel$fetchForDeeplink$1);
                } else if (i == 1) {
                    str2 = (java.lang.String) unifiedAlertViewModel$fetchForDeeplink$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    java.lang.String str5 = (java.lang.String) unifiedAlertViewModel$fetchForDeeplink$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.String str6 = (java.lang.String) unifiedAlertViewModel$fetchForDeeplink$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str3 = str6;
                    str4 = str5;
                    com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser = (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser) ((arrow.core.Either) obj).getOrNull();
                    publicCredential = rememberedUser == null ? rememberedUser.getPublicCredential() : null;
                    if (str4 == null && publicCredential != null) {
                        com.paypal.oslo.feature.identity.unifiedalert.domain.model.FetchUnifiedAlertsInput fetchUnifiedAlertsInput = new com.paypal.oslo.feature.identity.unifiedalert.domain.model.FetchUnifiedAlertsInput(str4, publicCredential);
                        com.paypal.oslo.feature.identity.unifiedalert.domain.usecase.FetchUnifiedAlertsUseCase fetchUnifiedAlertsUseCase = unifiedAlertViewModel.getHighSpeedVideoSizes;
                        unifiedAlertViewModel$fetchForDeeplink$1.Camera2StreamConfigurationMap = str3;
                        unifiedAlertViewModel$fetchForDeeplink$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                        unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(publicCredential);
                        unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fetchUnifiedAlertsInput);
                        unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoFpsRangesFor = 3;
                        obj = fetchUnifiedAlertsUseCase.invoke(fetchUnifiedAlertsInput, unifiedAlertViewModel$fetchForDeeplink$1);
                    } else {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Deeplink alert fetch skipped — missing token or credential", null, null, 6, null);
                        com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager alertDeduplicationManager = unifiedAlertViewModel.Camera2StreamConfigurationMap;
                        unifiedAlertViewModel$fetchForDeeplink$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                        unifiedAlertViewModel$fetchForDeeplink$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                        unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(publicCredential);
                        unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unifiedAlert);
                        unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoFpsRangesFor = 4;
                        obj = alertDeduplicationManager.onFetchCompleted(unifiedAlert, unifiedAlertViewModel$fetchForDeeplink$1);
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction fetchCompletedAction = (com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction) obj;
                        if (fetchCompletedAction instanceof com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowAlert) {
                            com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowAlert showAlert = (com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowAlert) fetchCompletedAction;
                            com.paypal.oslo.feature.identity.LoggerKt.log.i("Deeplink alert matched and active — presenting", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("alert_type", showAlert.getAlert().getAlertType())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("document_id", showAlert.getAlert().getDocumentId())));
                            com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alert = showAlert.getAlert();
                            java.util.Locale locale = java.util.Locale.ROOT;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                            java.lang.String lowerCase = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants.KEY_SOURCE_DEEP_LINK.toLowerCase(locale);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                            unifiedAlertViewModel.processEvent(new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertReceived(alert, lowerCase));
                        } else if (fetchCompletedAction instanceof com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.ShowNoAlertScreen) {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Deeplink alert expired or already handled — showing expiry screen", null, null, 6, null);
                            unifiedAlertViewModel.processEvent(new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertExpired(getHighResolutionOutputSizeshNQ4ISI));
                        } else if (!(fetchCompletedAction instanceof com.paypal.oslo.feature.identity.unifiedalert.domain.FetchCompletedAction.None)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    publicCredential = (java.lang.String) unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoSizes;
                    str4 = (java.lang.String) unifiedAlertViewModel$fetchForDeeplink$1.getHighResolutionOutputSizeshNQ4ISI;
                    str3 = (java.lang.String) unifiedAlertViewModel$fetchForDeeplink$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Either either = (arrow.core.Either) obj;
                    if (either instanceof arrow.core.Either.Right) {
                        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert2 = (com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert) ((arrow.core.Either.Right) either).getValue();
                        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert3 = (kotlin.jvm.internal.Intrinsics.areEqual(unifiedAlert2.getDocumentId(), str3) && com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert.isActive$default(unifiedAlert2, 0L, 1, null)) ? unifiedAlert2 : null;
                        if (unifiedAlert3 == null) {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Deeplink alert not shown — doc mismatch or expired", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("expected_doc_id", str3), kotlin.TuplesKt.to("fetched_doc_id", unifiedAlert2.getDocumentId()), kotlin.TuplesKt.to("is_active", java.lang.String.valueOf(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert.isActive$default(unifiedAlert2, 0L, 1, null)))), null, 4, null);
                        }
                        unifiedAlert = unifiedAlert3;
                    } else if (either instanceof arrow.core.Either.Left) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Deeplink alert fetch failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_reason", ((com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertsError) ((arrow.core.Either.Left) either).getValue()).toString())), null, 4, null);
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager alertDeduplicationManager2 = unifiedAlertViewModel.Camera2StreamConfigurationMap;
                    unifiedAlertViewModel$fetchForDeeplink$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    unifiedAlertViewModel$fetchForDeeplink$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                    unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(publicCredential);
                    unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unifiedAlert);
                    unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoFpsRangesFor = 4;
                    obj = alertDeduplicationManager2.onFetchCompleted(unifiedAlert, unifiedAlertViewModel$fetchForDeeplink$1);
                }
                java.lang.String str7 = (java.lang.String) ((arrow.core.Either) obj).getOrNull();
                com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase = unifiedAlertViewModel.getHighResolutionOutputSizeshNQ4ISI;
                unifiedAlertViewModel$fetchForDeeplink$1.Camera2StreamConfigurationMap = str2;
                unifiedAlertViewModel$fetchForDeeplink$1.getHighResolutionOutputSizeshNQ4ISI = str7;
                unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoFpsRangesFor = 2;
                invoke = getRememberedUserUseCase.invoke(unifiedAlertViewModel$fetchForDeeplink$1);
                if (invoke != coroutine_suspended) {
                    str3 = str2;
                    str4 = str7;
                    obj = invoke;
                    com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser2 = (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser) ((arrow.core.Either) obj).getOrNull();
                    if (rememberedUser2 == null) {
                    }
                    if (str4 == null) {
                    }
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Deeplink alert fetch skipped — missing token or credential", null, null, 6, null);
                    com.paypal.oslo.feature.identity.unifiedalert.domain.AlertDeduplicationManager alertDeduplicationManager22 = unifiedAlertViewModel.Camera2StreamConfigurationMap;
                    unifiedAlertViewModel$fetchForDeeplink$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    unifiedAlertViewModel$fetchForDeeplink$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str4);
                    unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(publicCredential);
                    unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unifiedAlert);
                    unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoFpsRangesFor = 4;
                    obj = alertDeduplicationManager22.onFetchCompleted(unifiedAlert, unifiedAlertViewModel$fetchForDeeplink$1);
                }
                return coroutine_suspended;
            }
        }
        unifiedAlertViewModel$fetchForDeeplink$1 = new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$fetchForDeeplink$1(unifiedAlertViewModel, continuation);
        java.lang.Object obj2 = unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoSizesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert unifiedAlert4 = null;
        if (i != 0) {
        }
        java.lang.String str72 = (java.lang.String) ((arrow.core.Either) obj2).getOrNull();
        com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase2 = unifiedAlertViewModel.getHighResolutionOutputSizeshNQ4ISI;
        unifiedAlertViewModel$fetchForDeeplink$1.Camera2StreamConfigurationMap = str2;
        unifiedAlertViewModel$fetchForDeeplink$1.getHighResolutionOutputSizeshNQ4ISI = str72;
        unifiedAlertViewModel$fetchForDeeplink$1.getHighSpeedVideoFpsRangesFor = 2;
        invoke = getRememberedUserUseCase2.invoke(unifiedAlertViewModel$fetchForDeeplink$1);
        if (invoke != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processDestination(com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlert alertData, java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        processEvent(new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertReceived(alertData, source));
    }

    public static /* synthetic */ void processDeeplink$default(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel unifiedAlertViewModel, java.lang.String str, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        unifiedAlertViewModel.processDeeplink(str, l);
    }

    public final void processDeeplink(java.lang.String docId, java.lang.Long expiryTime) {
        if (docId == null) {
            processEvent(new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertExpired(getHighResolutionOutputSizeshNQ4ISI));
        } else if (expiryTime == null || java.util.concurrent.TimeUnit.SECONDS.toMillis(expiryTime.longValue()) > java.lang.System.currentTimeMillis()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$processDeeplink$1(this, docId, null), 3, null);
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Deeplink alert already expired based on URL expiry_time — skipping fetch", null, null, 6, null);
            processEvent(new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertExpired(getHighResolutionOutputSizeshNQ4ISI));
        }
    }

    public final void processEvent(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getInputSizeshNQ4ISI.onEvent(event);
    }

    public final void onRetry() {
        com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState currentState = this.getInputSizeshNQ4ISI.getCurrentState();
        if (currentState instanceof com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Error) {
            com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Error error = (com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertUiState.Error) currentState;
            if (error.getAlertData() != null) {
                processEvent(new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertEvent.OnAlertReceived(error.getAlertData(), error.getSource()));
            }
        }
    }

    public final void onFlowCompleted() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$onFlowCompleted$1(this, null), 3, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/ui/UnifiedAlertViewModel$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/unifiedalert/domain/model/UnifiedAlert;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction.APPROVED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.unifiedalert.domain.model.UnifiedAlertAction.DENIED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
