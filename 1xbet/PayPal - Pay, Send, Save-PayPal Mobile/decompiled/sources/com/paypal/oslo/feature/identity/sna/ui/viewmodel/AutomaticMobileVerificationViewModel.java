package com.paypal.oslo.feature.identity.sna.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0011H\u0080@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0011H\u0080@¢\u0006\u0004\b\u0015\u0010\u0014J,\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u0011H\u0080@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020#0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0&8\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010,\u001a\b\u0012\u0004\u0012\u00020#0+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/ui/viewmodel/AutomaticMobileVerificationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/sna/domain/usecase/GetSNAConsentStatusUseCase;", "getSNAConsentStatusUseCase", "Lcom/paypal/oslo/feature/identity/sna/domain/usecase/GetMobileNumbersUseCase;", "getMobileNumbersUseCase", "Lcom/paypal/oslo/feature/identity/sna/domain/usecase/ToggleSNAConsentUseCase;", "toggleSNAConsentUseCase", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/identity/sna/domain/usecase/GetSNAConsentStatusUseCase;Lcom/paypal/oslo/feature/identity/sna/domain/usecase/GetMobileNumbersUseCase;Lcom/paypal/oslo/feature/identity/sna/domain/usecase/ToggleSNAConsentUseCase;Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationReducer;)V", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationEvent;)V", "Lkotlin/Function1;", "eventDispatcher", "loadConsentStatus$identity_prodRelease", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadMobileNumbers$identity_prodRelease", "", "enabled", "updateConsent$identity_prodRelease", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/sna/domain/usecase/GetSNAConsentStatusUseCase;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/sna/domain/usecase/GetMobileNumbersUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/sna/domain/usecase/ToggleSNAConsentUseCase;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiState;", "Lcom/paypal/oslo/feature/identity/sna/ui/mvi/AutomaticMobileVerificationUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AutomaticMobileVerificationViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.sna.domain.usecase.GetMobileNumbersUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.sna.domain.usecase.GetSNAConsentStatusUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.sna.domain.usecase.ToggleSNAConsentUseCase getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState> uiState;

    @javax.inject.Inject
    public AutomaticMobileVerificationViewModel(com.paypal.oslo.feature.identity.sna.domain.usecase.GetSNAConsentStatusUseCase getSNAConsentStatusUseCase, com.paypal.oslo.feature.identity.sna.domain.usecase.GetMobileNumbersUseCase getMobileNumbersUseCase, com.paypal.oslo.feature.identity.sna.domain.usecase.ToggleSNAConsentUseCase toggleSNAConsentUseCase, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationReducer automaticMobileVerificationReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getSNAConsentStatusUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getMobileNumbersUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toggleSNAConsentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(automaticMobileVerificationReducer, "");
        this.Camera2StreamConfigurationMap = getSNAConsentStatusUseCase;
        this.getHighSpeedVideoFpsRangesFor = getMobileNumbersUseCase;
        this.getHighSpeedVideoFpsRanges = toggleSNAConsentUseCase;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("AutomaticMobileVerificationViewModel.store", com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Initial.INSTANCE, automaticMobileVerificationReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent>() { // from class: com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent event = input.getEvent();
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ScreenInitialized.INSTANCE)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel.this), null, null, new com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$sideEffectsMiddleware$1$invoke$1(com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel.this, input, null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoaded) {
                    com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState second = input.getStates().getSecond();
                    if ((second instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success) && ((com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success) second).isEnabled()) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel.this), null, null, new com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$sideEffectsMiddleware$1$invoke$2(com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel.this, input, null), 3, null);
                        return;
                    }
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ToggleConsent) {
                    com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState first = input.getStates().getFirst();
                    com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState second2 = input.getStates().getSecond();
                    if ((first instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Success) && (second2 instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Loading)) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel.this), null, null, new com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$sideEffectsMiddleware$1$invoke$3(com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel.this, input, null), 3, null);
                        return;
                    }
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConfirmDisable.INSTANCE) && (input.getStates().getSecond() instanceof com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState.Loading)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel.this), null, null, new com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$sideEffectsMiddleware$1$invoke$4(com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel.this, input, null), 3, null);
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoSizes = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoSizes.onEvent(event);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object loadConsentStatus$identity_prodRelease(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$loadConsentStatus$1 automaticMobileVerificationViewModel$loadConsentStatus$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$loadConsentStatus$1) {
            automaticMobileVerificationViewModel$loadConsentStatus$1 = (com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$loadConsentStatus$1) continuation;
            if ((automaticMobileVerificationViewModel$loadConsentStatus$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                automaticMobileVerificationViewModel$loadConsentStatus$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = automaticMobileVerificationViewModel$loadConsentStatus$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = automaticMobileVerificationViewModel$loadConsentStatus$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.sna.domain.usecase.GetSNAConsentStatusUseCase getSNAConsentStatusUseCase = this.Camera2StreamConfigurationMap;
                    automaticMobileVerificationViewModel$loadConsentStatus$1.getHighSpeedVideoSizes = function1;
                    automaticMobileVerificationViewModel$loadConsentStatus$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = getSNAConsentStatusUseCase.invoke(automaticMobileVerificationViewModel$loadConsentStatus$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) automaticMobileVerificationViewModel$loadConsentStatus$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    function1.invoke(new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoaded((com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentStatus) ((arrow.core.Either.Right) either).getValue()));
                } else if (either instanceof arrow.core.Either.Left) {
                    function1.invoke(new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentStatusLoadFailed(((com.paypal.oslo.feature.identity.sna.domain.model.SNAError) ((arrow.core.Either.Left) either).getValue()).toString()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        automaticMobileVerificationViewModel$loadConsentStatus$1 = new com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$loadConsentStatus$1(this, continuation);
        java.lang.Object obj2 = automaticMobileVerificationViewModel$loadConsentStatus$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = automaticMobileVerificationViewModel$loadConsentStatus$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object loadMobileNumbers$identity_prodRelease(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$loadMobileNumbers$1 automaticMobileVerificationViewModel$loadMobileNumbers$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$loadMobileNumbers$1) {
            automaticMobileVerificationViewModel$loadMobileNumbers$1 = (com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$loadMobileNumbers$1) continuation;
            if ((automaticMobileVerificationViewModel$loadMobileNumbers$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                automaticMobileVerificationViewModel$loadMobileNumbers$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = automaticMobileVerificationViewModel$loadMobileNumbers$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = automaticMobileVerificationViewModel$loadMobileNumbers$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.sna.domain.usecase.GetMobileNumbersUseCase getMobileNumbersUseCase = this.getHighSpeedVideoFpsRangesFor;
                    automaticMobileVerificationViewModel$loadMobileNumbers$1.Camera2StreamConfigurationMap = function1;
                    automaticMobileVerificationViewModel$loadMobileNumbers$1.getHighSpeedVideoFpsRanges = 1;
                    obj = getMobileNumbersUseCase.invoke(automaticMobileVerificationViewModel$loadMobileNumbers$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) automaticMobileVerificationViewModel$loadMobileNumbers$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    function1.invoke(new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.MobileNumbersLoaded((java.util.List) ((arrow.core.Either.Right) either).getValue()));
                } else if (either instanceof arrow.core.Either.Left) {
                    function1.invoke(new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.MobileNumbersLoaded(kotlin.collections.CollectionsKt.emptyList()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        automaticMobileVerificationViewModel$loadMobileNumbers$1 = new com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$loadMobileNumbers$1(this, continuation);
        java.lang.Object obj2 = automaticMobileVerificationViewModel$loadMobileNumbers$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = automaticMobileVerificationViewModel$loadMobileNumbers$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateConsent$identity_prodRelease(boolean z, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$updateConsent$1 automaticMobileVerificationViewModel$updateConsent$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$updateConsent$1) {
            automaticMobileVerificationViewModel$updateConsent$1 = (com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$updateConsent$1) continuation;
            if ((automaticMobileVerificationViewModel$updateConsent$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                automaticMobileVerificationViewModel$updateConsent$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = automaticMobileVerificationViewModel$updateConsent$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = automaticMobileVerificationViewModel$updateConsent$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.sna.domain.usecase.ToggleSNAConsentUseCase toggleSNAConsentUseCase = this.getHighSpeedVideoFpsRanges;
                    automaticMobileVerificationViewModel$updateConsent$1.getHighSpeedVideoSizes = function1;
                    automaticMobileVerificationViewModel$updateConsent$1.getHighSpeedVideoFpsRanges = z;
                    automaticMobileVerificationViewModel$updateConsent$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = toggleSNAConsentUseCase.invoke(z, automaticMobileVerificationViewModel$updateConsent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = automaticMobileVerificationViewModel$updateConsent$1.getHighSpeedVideoFpsRanges;
                    function1 = (kotlin.jvm.functions.Function1) automaticMobileVerificationViewModel$updateConsent$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    function1.invoke(new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleSucceeded(z));
                } else if (either instanceof arrow.core.Either.Left) {
                    function1.invoke(new com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationEvent.ConsentToggleFailed(((com.paypal.oslo.feature.identity.sna.domain.model.SNAError) ((arrow.core.Either.Left) either).getValue()).toString(), z));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        automaticMobileVerificationViewModel$updateConsent$1 = new com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$updateConsent$1(this, continuation);
        java.lang.Object obj2 = automaticMobileVerificationViewModel$updateConsent$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = automaticMobileVerificationViewModel$updateConsent$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
