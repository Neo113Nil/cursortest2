package com.paypal.oslo.feature.identity.phoneconfirmation.ui;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R&\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0 8\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0%8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)"}, d2 = {"Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/PhoneConfirmationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/usecase/InitiatePhoneConfirmationUseCase;", "initiatePhoneConfirmationUseCase", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/usecase/InitiatePhoneConfirmationUseCase;Landroidx/lifecycle/SavedStateHandle;Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationReducer;)V", "", "onSendCodeTapped", "()V", "onCancelTapped", "onDismissError", "", "getPhoneNumber", "()Ljava/lang/String;", "getMaskedPhoneNumber", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/domain/usecase/InitiatePhoneConfirmationUseCase;", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/SavedStateHandle;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiState;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationEvent;", "Lcom/paypal/oslo/feature/identity/phoneconfirmation/ui/mvi/PhoneConfirmationUiEffect;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneConfirmationViewModel extends androidx.view.ViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.view.SavedStateHandle getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect> getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState> uiState;
    public static final int $stable = 8;

    @javax.inject.Inject
    public PhoneConfirmationViewModel(com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase initiatePhoneConfirmationUseCase, androidx.view.SavedStateHandle savedStateHandle, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationReducer phoneConfirmationReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initiatePhoneConfirmationUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneConfirmationReducer, "");
        this.Camera2StreamConfigurationMap = initiatePhoneConfirmationUseCase;
        this.getHighSpeedVideoFpsRanges = savedStateHandle;
        java.lang.String str = (java.lang.String) savedStateHandle.get("phoneNumber");
        if (str == null) {
            throw new java.lang.IllegalStateException("phoneNumber is required".toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        this.getHighSpeedVideoSizes = obj;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("PhoneConfirmationViewModel.store", com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState.Initial.INSTANCE, phoneConfirmationReducer, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.mvi.MviStateStore.Middleware[]{new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent>() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel$analyticsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationInitiated) {
                    com.paypal.oslo.feature.identity.phoneconfirmation.ui.analytics.PhoneConfirmationAnalytics.INSTANCE.createConfirmationInitiatedEvent().track(com.paypal.oslo.feature.identity.AnalyticsTrackerKt.analyticsTracker);
                } else if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationFailed) {
                    com.paypal.oslo.feature.identity.phoneconfirmation.ui.analytics.PhoneConfirmationAnalytics.INSTANCE.createConfirmationFailedEvent(((com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.ConfirmationFailed) event).getError()).track(com.paypal.oslo.feature.identity.AnalyticsTrackerKt.analyticsTracker);
                }
            }
        }, new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent>() { // from class: com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState, com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnSendCode) {
                    com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnSendCode onSendCode = (com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnSendCode) event;
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r1), null, null, new com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel$initiatePhoneConfirmation$1(onSendCode.getPhoneNumber(), onSendCode.getCountryCode(), com.paypal.oslo.feature.identity.phoneconfirmation.ui.PhoneConfirmationViewModel.this, input.getEventDispatcher(), null), 3, null);
                }
            }
        }}), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRangesFor = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "PhoneConfirmationViewModel initialized", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("phoneNumber", str)), 2, null);
        mviStateStore.onEvent(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnInit(str));
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void onSendCodeTapped() {
        this.getHighSpeedVideoFpsRangesFor.onEvent(new com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnSendCode(this.getHighResolutionOutputSizeshNQ4ISI, "1"));
    }

    public final void onCancelTapped() {
        this.getHighSpeedVideoFpsRangesFor.onEvent(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnCancel.INSTANCE);
    }

    public final void onDismissError() {
        this.getHighSpeedVideoFpsRangesFor.onEvent(com.paypal.oslo.feature.identity.phoneconfirmation.ui.mvi.PhoneConfirmationEvent.OnDismissError.INSTANCE);
    }

    /* renamed from: getPhoneNumber, reason: from getter */
    public final java.lang.String getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String getMaskedPhoneNumber() {
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        java.lang.String obj = sb.toString();
        if (obj.length() >= 10) {
            java.lang.String take = kotlin.text.StringsKt.take(obj, 3);
            java.lang.String takeLast = kotlin.text.StringsKt.takeLast(obj, 4);
            char first = kotlin.text.StringsKt.first(take);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("(");
            sb2.append(first);
            sb2.append("**) ***-");
            sb2.append(takeLast);
            return sb2.toString();
        }
        if (obj.length() >= 4) {
            return com.paypal.oslo.feature.identity.phoneconfirmation.PhoneConfirmationConstants.MockData.PHONE_MASK_FORMAT_TEMPLATE.concat(java.lang.String.valueOf(kotlin.text.StringsKt.takeLast(obj, 4)));
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
