package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\nJ\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\nR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/PersonalizedAdsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetPersonalizedAdsPreferenceUseCase;", "getPreferenceUseCase", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdatePersonalizedAdsPreferenceUseCase;", "updatePreferenceUseCase", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetPersonalizedAdsPreferenceUseCase;Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdatePersonalizedAdsPreferenceUseCase;)V", "", "onLoad", "()V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "onToggleChange", "(Z)V", "p0", "getHighSpeedVideoFpsRanges", "clearBanner", "onRetry", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/GetPersonalizedAdsPreferenceUseCase;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdatePersonalizedAdsPreferenceUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedAdsUiState;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PersonalizedAdsViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedAdsPreferenceUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedAdsPreferenceUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState> uiState;

    @javax.inject.Inject
    public PersonalizedAdsViewModel(com.paypal.oslo.feature.consumerprivacy.domain.usecase.GetPersonalizedAdsPreferenceUseCase getPersonalizedAdsPreferenceUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePersonalizedAdsPreferenceUseCase updatePersonalizedAdsPreferenceUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPersonalizedAdsPreferenceUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePersonalizedAdsPreferenceUseCase, "");
        this.Camera2StreamConfigurationMap = getPersonalizedAdsPreferenceUseCase;
        this.getHighSpeedVideoFpsRanges = updatePersonalizedAdsPreferenceUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Loading.INSTANCE);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState> getUiState() {
        return this.uiState;
    }

    public final void onLoad() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel$onLoad$1(this, null), 3, null);
    }

    public final void onToggleChange(boolean newValue) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel$onToggleChange$1(this, newValue, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getHighSpeedVideoFpsRanges(boolean p0) {
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content(p0, new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_banner_error_message, null, 2, 0 == true ? 1 : 0), false));
    }

    public final void clearBanner() {
        com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState value = this.getHighResolutionOutputSizeshNQ4ISI.getValue();
        if (value instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content) {
            this.getHighResolutionOutputSizeshNQ4ISI.setValue(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content.copy$default((com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content) value, false, null, false, 5, null));
        }
    }

    public final void onRetry() {
        onLoad();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void access$handleUpdateResult(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.PersonalizedAdsViewModel personalizedAdsViewModel, boolean z, boolean z2, boolean z3) {
        int i;
        if (z) {
            if (z2) {
                i = com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_ads_on_success_message;
            } else {
                i = com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_ads_off_success_message;
            }
            personalizedAdsViewModel.getHighResolutionOutputSizeshNQ4ISI.setValue(new com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedAdsUiState.Content(z2, new com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Success(i, null, 2, 0 == true ? 1 : 0), false));
            return;
        }
        personalizedAdsViewModel.getHighSpeedVideoFpsRanges(z3);
    }
}
