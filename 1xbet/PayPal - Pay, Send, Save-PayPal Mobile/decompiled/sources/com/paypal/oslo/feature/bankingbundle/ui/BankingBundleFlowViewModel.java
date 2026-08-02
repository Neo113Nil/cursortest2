package com.paypal.oslo.feature.bankingbundle.ui;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00198\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0013\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/bankingbundle/ui/BankingBundleFlowViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/bankingbundle/domain/usecase/GetBankingBundleEligibilityUseCase;", "getBankingBundleEligibilityUseCase", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/bankingbundle/domain/usecase/GetBankingBundleEligibilityUseCase;Lcom/paypal/oslo/core/userstore/UserStore;)V", "", "checkEligibility", "()V", "retry", "Lcom/paypal/oslo/feature/bankingbundle/domain/model/BankingBundleEligibility;", "eligibility", "setDemoEligibility", "(Lcom/paypal/oslo/feature/bankingbundle/domain/model/BankingBundleEligibility;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/bankingbundle/domain/usecase/GetBankingBundleEligibilityUseCase;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/userstore/UserStore;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/bankingbundle/ui/EligibilityState;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "eligibilityState", "Lkotlinx/coroutines/flow/StateFlow;", "getEligibilityState", "()Lkotlinx/coroutines/flow/StateFlow;", "", "Z", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BankingBundleFlowViewModel extends androidx.view.ViewModel {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.bankingbundle.domain.usecase.GetBankingBundleEligibilityUseCase getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bankingbundle.ui.EligibilityState> eligibilityState;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.bankingbundle.ui.EligibilityState> getHighSpeedVideoSizes;
    public static final int $stable = 8;

    @javax.inject.Inject
    public BankingBundleFlowViewModel(com.paypal.oslo.feature.bankingbundle.domain.usecase.GetBankingBundleEligibilityUseCase getBankingBundleEligibilityUseCase, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBankingBundleEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoFpsRanges = getBankingBundleEligibilityUseCase;
        this.Camera2StreamConfigurationMap = userStore;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.bankingbundle.ui.EligibilityState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Loading.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.eligibilityState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.bankingbundle.ui.EligibilityState> getEligibilityState() {
        return this.eligibilityState;
    }

    public final void checkEligibility() {
        if (this.getHighSpeedVideoFpsRangesFor) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = true;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.bankingbundle.ui.BankingBundleFlowViewModel$checkEligibility$1(this, null), 3, null);
    }

    public final void retry() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bankingbundle.LoggerKt.log, "User initiated retry of eligibility check", null, null, 6, null);
        checkEligibility();
    }

    public final void setDemoEligibility(com.paypal.oslo.feature.bankingbundle.domain.model.BankingBundleEligibility eligibility) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibility, "");
        this.getHighSpeedVideoSizes.setValue(new com.paypal.oslo.feature.bankingbundle.ui.EligibilityState.Success(eligibility));
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bankingbundle.LoggerKt.log, "Demo eligibility set", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("status", eligibility.getStatus().name())), null, 4, null);
    }
}
