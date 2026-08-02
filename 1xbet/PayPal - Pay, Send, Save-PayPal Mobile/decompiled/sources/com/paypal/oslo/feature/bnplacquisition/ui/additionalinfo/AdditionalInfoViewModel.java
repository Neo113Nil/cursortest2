package com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR&\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010!R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0#8\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010)\u001a\b\u0012\u0004\u0012\u00020 0(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoReducer;", "reducer", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiMapper;", "uiMapper", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldValidators;", "formFieldValidators", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetReviewTermsUseCase;", "getReviewTermsUseCase", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "sessionStorage", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoReducer;Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiMapper;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldValidators;Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetReviewTermsUseCase;Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;)V", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoEvent;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoReducer;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiMapper;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/FormFieldValidators;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/bnplacquisition/domain/usecase/GetReviewTermsUseCase;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/SessionStorage;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiState;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/additionalinfo/AdditionalInfoUiEffect;", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getOutputFormats", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdditionalInfoViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect> getOutputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoReducer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiMapper getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState> uiState;

    @javax.inject.Inject
    public AdditionalInfoViewModel(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoReducer additionalInfoReducer, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiMapper additionalInfoUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase getReviewTermsUseCase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalInfoReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalInfoUiMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formFieldValidators, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getReviewTermsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionStorage, "");
        this.getHighSpeedVideoFpsRanges = additionalInfoReducer;
        this.getHighSpeedVideoSizes = additionalInfoUiMapper;
        this.getHighSpeedVideoFpsRangesFor = formFieldValidators;
        this.getHighResolutionOutputSizeshNQ4ISI = getReviewTermsUseCase;
        this.Camera2StreamConfigurationMap = sessionStorage;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("AdditionalInfoViewModel.store", com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Loading.INSTANCE, additionalInfoReducer, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent>() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Initialize) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel.this), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$sideEffectsMiddleware$1$invoke$1(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel.this, event, null), 3, null);
                    return;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Pressed.INSTANCE)) {
                    com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel.access$validateAndContinue(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel.this, input.getStates().getSecond());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Valid) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r8), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$submitForm$1(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel.this, ((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.Continue.Valid) event).getUiModel(), null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ValidateField) {
                    com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState first = input.getStates().getFirst();
                    if (first instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Success) {
                        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ValidateField validateField = (com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent.ValidateField) event;
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r1), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$handleFieldValidation$1(((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Success) first).getData(), validateField.getFieldId(), validateField.getValue(), com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel.this, null), 3, null);
                    }
                }
            }
        }), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getOutputFormats = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getOutputFormats.onEvent(event);
    }

    public static final /* synthetic */ void access$validateAndContinue(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel additionalInfoViewModel, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState additionalInfoUiState) {
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiModel data;
        com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Success success = additionalInfoUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Success ? (com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiState.Success) additionalInfoUiState : null;
        if (success == null || (data = success.getData()) == null) {
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(additionalInfoViewModel), null, null, new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel$validateAndContinue$1(data, additionalInfoViewModel, null), 3, null);
    }
}
