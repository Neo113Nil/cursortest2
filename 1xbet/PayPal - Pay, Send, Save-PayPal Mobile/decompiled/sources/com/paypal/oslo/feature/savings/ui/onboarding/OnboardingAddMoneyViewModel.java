package com.paypal.oslo.feature.savings.ui.onboarding;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\fJ\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\bJ\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\bR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0%8\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010#\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010-"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/savings/domain/usecase/FetchGoalsUseCase;", "fetchGoalsUseCase", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/usecase/FetchGoalsUseCase;)V", "", "fetchGoals", "()V", "", "amount", "onAmountSelected", "(Ljava/lang/String;)V", "onOtherClick", "", "validateAmountSelection", "()Z", "onAmountDisplayClick", "onCustomAmountSave", "onCustomAmountCancel", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "frequencyState", "onFrequencySelected", "(Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;)V", "getAmountForReview", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getCurrentGoal", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/savings/domain/usecase/FetchGoalsUseCase;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyScreenState;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "screenState", "Lkotlinx/coroutines/flow/StateFlow;", "getScreenState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyFormState;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/savings/ui/onboarding/OnboardingAddMoneyFormState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OnboardingAddMoneyViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase getHighSpeedVideoFpsRanges;
    private com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState> screenState;

    @javax.inject.Inject
    public OnboardingAddMoneyViewModel(com.paypal.oslo.feature.savings.domain.usecase.FetchGoalsUseCase fetchGoalsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fetchGoalsUseCase, "");
        this.getHighSpeedVideoFpsRanges = fetchGoalsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.Loading.INSTANCE);
        this.getHighResolutionOutputSizeshNQ4ISI = MutableStateFlow;
        this.screenState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.getHighSpeedVideoSizes = com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState.INSTANCE.initial();
        fetchGoals();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState> getScreenState() {
        return this.screenState;
    }

    public final void fetchGoals() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyViewModel$fetchGoals$1(this, null), 3, null);
    }

    public final void onAmountSelected(java.lang.String amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        this.getHighSpeedVideoSizes = com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState.copy$default(this.getHighSpeedVideoSizes, null, amount, "", false, false, false, 1, null);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public final void onOtherClick() {
        this.getHighSpeedVideoSizes = com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState.copy$default(this.getHighSpeedVideoSizes, null, "", null, true, true, false, 5, null);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public final boolean validateAmountSelection() {
        boolean isReviewEnabled = this.getHighSpeedVideoSizes.isReviewEnabled();
        if (!isReviewEnabled) {
            this.getHighSpeedVideoSizes = com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState.copy$default(this.getHighSpeedVideoSizes, null, null, null, false, false, true, 31, null);
            getHighResolutionOutputSizeshNQ4ISI();
        }
        return isReviewEnabled;
    }

    public final void onAmountDisplayClick() {
        this.getHighSpeedVideoSizes = com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState.copy$default(this.getHighSpeedVideoSizes, null, null, null, true, false, false, 55, null);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public final void onCustomAmountSave(java.lang.String amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState onboardingAddMoneyFormState = this.getHighSpeedVideoSizes;
        java.lang.String trimStart = kotlin.text.StringsKt.trimStart(amount, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        if (trimStart.length() == 0) {
            trimStart = "0";
        }
        this.getHighSpeedVideoSizes = com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState.copy$default(onboardingAddMoneyFormState, null, null, trimStart, false, false, false, 51, null);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public final void onCustomAmountCancel() {
        boolean z = this.getHighSpeedVideoSizes.getCustomAmount().length() == 0 || kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes.getCustomAmount(), "0");
        com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState onboardingAddMoneyFormState = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState.copy$default(onboardingAddMoneyFormState, null, null, null, false, z ? false : onboardingAddMoneyFormState.isOtherSelected(), false, 39, null);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public final void onFrequencySelected(com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencyState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencyState, "");
        this.getHighSpeedVideoSizes = com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyFormState.copy$default(this.getHighSpeedVideoSizes, frequencyState, null, null, false, false, false, 62, null);
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public final java.lang.String getAmountForReview() {
        if (this.getHighSpeedVideoSizes.isOtherSelected()) {
            return this.getHighSpeedVideoSizes.getCustomAmount();
        }
        return this.getHighSpeedVideoSizes.getSelectedAmount();
    }

    /* renamed from: getCurrentGoal, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO = this.Camera2StreamConfigurationMap;
        if (goalSummaryDTO != null) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
            while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), new com.paypal.oslo.feature.savings.ui.onboarding.OnboardingAddMoneyScreenState.Content(goalSummaryDTO, this.getHighSpeedVideoSizes))) {
            }
        }
    }
}
