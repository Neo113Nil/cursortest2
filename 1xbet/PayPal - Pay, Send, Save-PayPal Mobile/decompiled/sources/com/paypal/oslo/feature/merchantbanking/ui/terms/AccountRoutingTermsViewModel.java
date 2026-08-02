package com.paypal.oslo.feature.merchantbanking.ui.terms;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/merchantbanking/api/usecase/CheckAccountRoutingEligibilityUseCase;", "checkAccountRoutingEligibilityUseCase", "Lcom/paypal/oslo/feature/merchantbanking/domain/usecase/EnrollForAccountRoutingNumbersUseCase;", "enrollForAccountRoutingNumbersUseCase", "<init>", "(Lcom/paypal/oslo/feature/merchantbanking/api/usecase/CheckAccountRoutingEligibilityUseCase;Lcom/paypal/oslo/feature/merchantbanking/domain/usecase/EnrollForAccountRoutingNumbersUseCase;)V", "", "enrollForAccountRoutingNumbers", "()V", "setInitialState", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/merchantbanking/api/usecase/CheckAccountRoutingEligibilityUseCase;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/merchantbanking/domain/usecase/EnrollForAccountRoutingNumbersUseCase;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/merchantbanking/ui/terms/AccountRoutingTermsUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccountRoutingTermsViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.merchantbanking.domain.usecase.EnrollForAccountRoutingNumbersUseCase getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState> uiState;

    @javax.inject.Inject
    public AccountRoutingTermsViewModel(com.paypal.oslo.feature.merchantbanking.api.usecase.CheckAccountRoutingEligibilityUseCase checkAccountRoutingEligibilityUseCase, com.paypal.oslo.feature.merchantbanking.domain.usecase.EnrollForAccountRoutingNumbersUseCase enrollForAccountRoutingNumbersUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkAccountRoutingEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollForAccountRoutingNumbersUseCase, "");
        this.getHighSpeedVideoSizes = checkAccountRoutingEligibilityUseCase;
        this.getHighSpeedVideoFpsRangesFor = enrollForAccountRoutingNumbersUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.Initial.INSTANCE);
        this.getHighSpeedVideoFpsRanges = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState> getUiState() {
        return this.uiState;
    }

    public final void enrollForAccountRoutingNumbers() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel$enrollForAccountRoutingNumbers$1(this, null), 3, null);
    }

    public final void setInitialState() {
        this.getHighSpeedVideoFpsRanges.setValue(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.Initial.INSTANCE);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum access$mapErrorToErrorScreenType(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel accountRoutingTermsViewModel, com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError accountRoutingError) {
        if (accountRoutingError instanceof com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.NoNetwork) {
            return com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.NO_NETWORK;
        }
        if (accountRoutingError instanceof com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.RiskDeclined) {
            return com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.RISK_DECLINED;
        }
        if (accountRoutingError instanceof com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.Ineligible) {
            return com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.INELIGIBLE;
        }
        if (accountRoutingError instanceof com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.ServerError) {
            return com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.GENERIC_500;
        }
        if (!(accountRoutingError instanceof com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.ClientError) && !(accountRoutingError instanceof com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.EnrollmentRequired)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.merchantbanking.ui.errorScreen.ErrorScreenTypeEnum.GENERIC_400;
    }
}
