package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\fR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0 8\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R \u0010)\u001a\b\u0012\u0004\u0012\u00020&0(8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u00101"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/usecase/GetEligibilityUseCase;", "getCapabilities", "Lcom/paypal/oslo/feature/wallet/common/ui/formatter/AmountFormatter;", "amountFormatter", "Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;", "walletFeatureManager", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/usecase/GetEligibilityUseCase;Lcom/paypal/oslo/feature/wallet/common/ui/formatter/AmountFormatter;Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;)V", "", "getAddMoneyEligibility", "()V", "", "newAmount", "onAmountChange", "(Ljava/lang/String;)V", "onNextClick", "resetState", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/usecase/GetEligibilityUseCase;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/wallet/common/ui/formatter/AmountFormatter;", "getHighSpeedVideoSizes", "getOutputFormats", "Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionEvent;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "uiEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "getUiEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;", "Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;", "getInputFormats", "", "Z", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AmountSelectionViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent> uiEvent;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState> uiState;

    @javax.inject.Inject
    public AmountSelectionViewModel(com.paypal.oslo.feature.wallet.fifo.common.domain.usecase.GetEligibilityUseCase getEligibilityUseCase, com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter amountFormatter, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getEligibilityUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountFormatter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletFeatureManager, "");
        this.Camera2StreamConfigurationMap = getEligibilityUseCase;
        this.getHighSpeedVideoSizes = amountFormatter;
        this.getHighResolutionOutputSizeshNQ4ISI = walletFeatureManager;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loading.INSTANCE);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.getHighSpeedVideoFpsRanges = MutableSharedFlow$default;
        this.uiEvent = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.getInputFormats = com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.ADD_FI;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent> getUiEvent() {
        return this.uiEvent;
    }

    public final void getAddMoneyEligibility() {
        if (this.getHighSpeedVideoSizesFor) {
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel$getAddMoneyEligibility$1(this, null), 3, null);
    }

    public final void onAmountChange(java.lang.String newAmount) {
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState value;
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded loaded;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newAmount, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
        do {
            value = mutableStateFlow.getValue();
            loaded = value;
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState value2 = this.uiState.getValue();
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded loaded2 = value2 instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded ? (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded) value2 : null;
            if (loaded2 != null) {
                java.lang.String currencyCode = loaded2.getCurrencyCode();
                java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem> amountList = loaded2.getAmountList();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(amountList, 10));
                for (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem amountOptionItem : amountList) {
                    arrayList.add(new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem(amountOptionItem.getAmount(), amountOptionItem.getCurrencyCode(), kotlin.jvm.internal.Intrinsics.areEqual(amountOptionItem.getAmount(), newAmount)));
                }
                loaded = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded(arrayList, newAmount, currencyCode, null, 8, null);
            }
        } while (!mutableStateFlow.compareAndSet(value, loaded));
    }

    public final void onNextClick() {
        java.lang.Double parseLocalizedAmount$wallet_prodRelease;
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState value = this.uiState.getValue();
        java.lang.Double d = null;
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded loaded = value instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded ? (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded) value : null;
        if (loaded != null) {
            java.lang.String selectedAmount = loaded.getSelectedAmount();
            if (selectedAmount != null && (parseLocalizedAmount$wallet_prodRelease = com.paypal.oslo.feature.wallet.fifo.common.util.CurrencyUtils.INSTANCE.parseLocalizedAmount$wallet_prodRelease(selectedAmount)) != null) {
                double doubleValue = parseLocalizedAmount$wallet_prodRelease.doubleValue();
                if (doubleValue > 0.0d) {
                    d = java.lang.Double.valueOf(doubleValue);
                }
            }
            if (d != null) {
                this.getHighSpeedVideoFpsRanges.tryEmit(new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent.SubmitAmount(java.lang.String.valueOf(d.doubleValue()), this.getInputFormats));
            } else {
                kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
                do {
                } while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded.copy$default(loaded, null, null, null, java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_fifo_error_invalid_amount), 7, null)));
            }
        }
    }

    public final void resetState() {
        this.getHighSpeedVideoSizesFor = false;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loading.INSTANCE)) {
        }
    }

    public static final /* synthetic */ void access$handleEligibilitySuccess(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel amountSelectionViewModel, com.paypal.oslo.feature.wallet.fifo.common.domain.model.BalanceAddWithdrawEligibility balanceAddWithdrawEligibility) {
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState value;
        java.lang.String formatAmountOnly$default;
        java.lang.String str;
        java.util.ArrayList arrayList;
        java.lang.String currencyCode;
        java.lang.String currencyCode2;
        java.lang.String value2;
        amountSelectionViewModel.getInputFormats = balanceAddWithdrawEligibility.getAddFIFlowType();
        java.lang.String str2 = null;
        if (amountSelectionViewModel.getHighResolutionOutputSizeshNQ4ISI.isOneOnboardingForAddFundsEnabled()) {
            com.paypal.oslo.feature.wallet.fifo.common.domain.model.SuggestedAction.StandardDeposit suggestedActionStandardDeposit = balanceAddWithdrawEligibility.getSuggestedActionStandardDeposit();
            if (kotlin.jvm.internal.Intrinsics.areEqual(suggestedActionStandardDeposit != null ? suggestedActionStandardDeposit.getRemedialSteps() : null, "PROVISIONING_REQUIRED")) {
                amountSelectionViewModel.getHighSpeedVideoFpsRanges.tryEmit(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent.NavigateToCIP.INSTANCE);
                return;
            }
        }
        com.paypal.oslo.feature.wallet.common.domain.model.Money depositRecommendedAmount = balanceAddWithdrawEligibility.getDepositRecommendedAmount();
        if (depositRecommendedAmount != null && (value2 = depositRecommendedAmount.getValue()) != null) {
            str2 = value2.toString();
        }
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState> mutableStateFlow = amountSelectionViewModel.getHighSpeedVideoFpsRangesFor;
        do {
            value = mutableStateFlow.getValue();
            com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter amountFormatter = amountSelectionViewModel.getHighSpeedVideoSizes;
            java.lang.String str3 = str2 == null ? "0" : str2;
            com.paypal.oslo.feature.wallet.common.domain.model.Money depositRecommendedAmount2 = balanceAddWithdrawEligibility.getDepositRecommendedAmount();
            formatAmountOnly$default = com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter.formatAmountOnly$default(amountFormatter, str3, (depositRecommendedAmount2 == null || (currencyCode2 = depositRecommendedAmount2.getCurrencyCode()) == null) ? "USD" : currencyCode2, null, false, 12, null);
            com.paypal.oslo.feature.wallet.common.domain.model.Money depositRecommendedAmount3 = balanceAddWithdrawEligibility.getDepositRecommendedAmount();
            str = (depositRecommendedAmount3 == null || (currencyCode = depositRecommendedAmount3.getCurrencyCode()) == null) ? "USD" : currencyCode;
            java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> depositSuggestedAmounts = balanceAddWithdrawEligibility.getDepositSuggestedAmounts();
            arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(depositSuggestedAmounts, 10));
            for (com.paypal.oslo.feature.wallet.common.domain.model.Money money : depositSuggestedAmounts) {
                java.lang.String obj = money.getValue().toString();
                arrayList.add(new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.model.AmountOptionItem(com.paypal.oslo.feature.wallet.common.ui.formatter.AmountFormatter.formatAmountOnly$default(amountSelectionViewModel.getHighSpeedVideoSizes, obj, money.getCurrencyCode(), null, false, 12, null), money.getCurrencyCode(), kotlin.jvm.internal.Intrinsics.areEqual(obj, str2)));
            }
        } while (!mutableStateFlow.compareAndSet(value, new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionState.Loaded(arrayList, formatAmountOnly$default, str, null, 8, null)));
        amountSelectionViewModel.getHighSpeedVideoSizesFor = true;
    }
}
