package com.paypal.oslo.feature.merchantbanking.ui.accountrouting;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b8\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/merchantbanking/domain/usecase/GetAccountRoutingNumberUseCase;", "getAccountRoutingNumberUseCase", "Lcom/paypal/oslo/feature/merchantbanking/domain/usecase/GetMerchantArnFeatureFlagUseCase;", "getMerchantArnFeatureFlagUseCase", "Lcom/paypal/oslo/feature/merchantbanking/api/usecase/CheckAccountRoutingEligibilityUseCase;", "checkAccountRoutingEligibilityUseCase", "<init>", "(Lcom/paypal/oslo/feature/merchantbanking/domain/usecase/GetAccountRoutingNumberUseCase;Lcom/paypal/oslo/feature/merchantbanking/domain/usecase/GetMerchantArnFeatureFlagUseCase;Lcom/paypal/oslo/feature/merchantbanking/api/usecase/CheckAccountRoutingEligibilityUseCase;)V", "", "loadAccountRoutingNumbers", "()V", "Lcom/paypal/oslo/feature/merchantbanking/api/errors/AccountRoutingError;", "p0", "Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/merchantbanking/api/errors/AccountRoutingError;)Lcom/paypal/oslo/feature/merchantbanking/ui/accountrouting/AccountRoutingNumberUiState;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/merchantbanking/domain/usecase/GetAccountRoutingNumberUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/merchantbanking/domain/usecase/GetMerchantArnFeatureFlagUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/merchantbanking/api/usecase/CheckAccountRoutingEligibilityUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccountRoutingNumberViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.merchantbanking.domain.usecase.GetAccountRoutingNumberUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.merchantbanking.domain.usecase.GetMerchantArnFeatureFlagUseCase getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState> uiState;

    @javax.inject.Inject
    public AccountRoutingNumberViewModel(com.paypal.oslo.feature.merchantbanking.domain.usecase.GetAccountRoutingNumberUseCase getAccountRoutingNumberUseCase, com.paypal.oslo.feature.merchantbanking.domain.usecase.GetMerchantArnFeatureFlagUseCase getMerchantArnFeatureFlagUseCase, com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase checkAccountRoutingEligibilityUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAccountRoutingNumberUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getMerchantArnFeatureFlagUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkAccountRoutingEligibilityUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getAccountRoutingNumberUseCase;
        this.getHighSpeedVideoFpsRangesFor = getMerchantArnFeatureFlagUseCase;
        this.Camera2StreamConfigurationMap = checkAccountRoutingEligibilityUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Default.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow.setValue(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Loading.INSTANCE);
        if (!getMerchantArnFeatureFlagUseCase.invoke()) {
            MutableStateFlow.setValue(new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.GENERIC_400));
        } else {
            loadAccountRoutingNumbers();
        }
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState> getUiState() {
        return this.uiState;
    }

    public final void loadAccountRoutingNumbers() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$loadAccountRoutingNumbers$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError p0) {
        if (p0 instanceof com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.NoNetwork) {
            return new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.NO_NETWORK);
        }
        if (p0 instanceof com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.RiskDeclined) {
            return new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.RISK_DECLINED);
        }
        if (p0 instanceof com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.Ineligible) {
            return new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.INELIGIBLE);
        }
        if (p0 instanceof com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.ServerError) {
            return new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.GENERIC_500);
        }
        if (p0 instanceof com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.ClientError) {
            return new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.Error(com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.GENERIC_400);
        }
        if (!(p0 instanceof com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.EnrollmentRequired)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberUiState.NavigateToTerms.INSTANCE;
    }

    public static final /* synthetic */ void access$checkEligibilityOnError(com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel accountRoutingNumberViewModel, com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError accountRoutingError) {
        if (!(accountRoutingError instanceof com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.RiskDeclined)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(accountRoutingNumberViewModel), null, null, new com.paypal.oslo.feature.merchantbanking.ui.accountrouting.AccountRoutingNumberViewModel$checkEligibilityOnError$1(accountRoutingNumberViewModel, accountRoutingError, null), 3, null);
        } else {
            accountRoutingNumberViewModel.getHighSpeedVideoSizes.setValue(getHighSpeedVideoFpsRangesFor(accountRoutingError));
        }
    }
}
