package com.paypal.oslo.feature.savings.ui.onboarding;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\fJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010$\u001a\b\u0012\u0004\u0012\u00020 0#8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/savings/domain/usecase/AcceptSavingsAccountTermsUseCase;", "acceptSavingsAccountTermsUseCase", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/usecase/AcceptSavingsAccountTermsUseCase;)V", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent;", "intent", "", "processIntent", "(Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsIntent;)V", "getHighSpeedVideoFpsRanges", "()V", "onFdicInsuredClick", "onFdicRatesClick", "onRateInfoClick", "onEDeliveryClick", "onDepositAccountClick", "onPrivacyClick", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/savings/domain/usecase/AcceptSavingsAccountTermsUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsState;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsEffect;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/flow/Flow;", "effects", "Lkotlinx/coroutines/flow/Flow;", "getEffects", "()Lkotlinx/coroutines/flow/Flow;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsTermsViewModel extends androidx.view.ViewModel {

    @java.lang.Deprecated
    public static final java.lang.String DEPOSIT_ACCOUNT_TITLE = "Deposit Account Agreement";

    @java.lang.Deprecated
    public static final java.lang.String E_DELIVERY_TITLE = "E-Delivery Agreement";

    @java.lang.Deprecated
    public static final java.lang.String FDIC_INSURED_TITLE = "FDIC Insurance";

    @java.lang.Deprecated
    public static final java.lang.String FDIC_RATES_TITLE = "FDIC National Rates";

    @java.lang.Deprecated
    public static final java.lang.String PRIVACY_TITLE = "Privacy Policy";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect> effects;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsState> getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.savings.domain.usecase.AcceptSavingsAccountTermsUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsState> uiState;
    private static final com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel.Companion Companion = new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public SavingsTermsViewModel(com.paypal.oslo.feature.savings.domain.usecase.AcceptSavingsAccountTermsUseCase acceptSavingsAccountTermsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acceptSavingsAccountTermsUseCase, "");
        this.getHighSpeedVideoFpsRangesFor = acceptSavingsAccountTermsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsState.Content.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.getHighResolutionOutputSizeshNQ4ISI = Channel$default;
        this.effects = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/onboarding/SavingsTermsViewModel$Companion;", "", "<init>", "()V", "", "FDIC_INSURED_TITLE", "Ljava/lang/String;", "FDIC_RATES_TITLE", "E_DELIVERY_TITLE", "DEPOSIT_ACCOUNT_TITLE", "PRIVACY_TITLE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect> getEffects() {
        return this.effects;
    }

    public final void processIntent(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (intent instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.BackClicked) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getHighResolutionOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateBack.INSTANCE));
            return;
        }
        if (intent instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.AgreeClicked) {
            getHighSpeedVideoFpsRanges();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            return;
        }
        if (intent instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.RetryClicked) {
            getHighSpeedVideoFpsRanges();
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            return;
        }
        if (intent instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingCompleted) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getHighResolutionOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToAddMoneyGeneralSavingsFlow.INSTANCE));
            return;
        }
        if (intent instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingFailed) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getHighResolutionOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.OnboardingFailed.INSTANCE));
            return;
        }
        if (intent instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingCancelled) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getHighResolutionOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.OnboardingCancelled.INSTANCE));
        } else if (intent instanceof com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingInReview) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(this.getHighResolutionOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.OnboardingInReview.INSTANCE));
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(intent, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsIntent.OnboardingInProgress.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
        }
    }

    private final void getHighSpeedVideoFpsRanges() {
        this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsState.Submitting.INSTANCE);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel$acceptTerms$1(this, null), 3, null);
    }

    public final void onFdicInsuredClick() {
        this.getHighResolutionOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToFdicInsuranceSheet.INSTANCE);
    }

    public final void onFdicRatesClick() {
        this.getHighResolutionOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToWebView(com.paypal.oslo.feature.savings.constants.SavingsConstants.DocumentUrls.FDIC_NATIONAL_RATES, FDIC_RATES_TITLE));
    }

    public final void onRateInfoClick() {
        this.getHighResolutionOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToApyInfoSheet.INSTANCE);
    }

    public final void onEDeliveryClick() {
        this.getHighResolutionOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToWebView(com.paypal.oslo.feature.savings.constants.SavingsConstants.DocumentUrls.SYNCHRONY_E_DELIVERY_TERMS, E_DELIVERY_TITLE));
    }

    public final void onDepositAccountClick() {
        this.getHighResolutionOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToWebView(com.paypal.oslo.feature.savings.constants.SavingsConstants.DocumentUrls.SYNCHRONY_ACCOUNT_AGREEMENT, DEPOSIT_ACCOUNT_TITLE));
    }

    public final void onPrivacyClick() {
        this.getHighResolutionOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(new com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsEffect.NavigateToWebView(com.paypal.oslo.feature.savings.constants.SavingsConstants.DocumentUrls.SYNCHRONY_PRIVACY_POLICY, PRIVACY_TITLE));
    }
}
