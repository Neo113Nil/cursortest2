package com.paypal.oslo.feature.wallet.cards.ui.expired;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0*8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u0010'\u001a\u00020/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u00100R\u0016\u0010\u001f\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u00102R\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u00103R\u0016\u00104\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u00103R\u0016\u00105\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00103"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/expired/ExpiredCardViewModelImpl;", "Lcom/paypal/oslo/feature/wallet/cards/ui/expired/ExpiredCardViewModel;", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/GetUserProfileUseCase;", "getUserProfile", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/GetCardDefinitionsUseCase;", "getCardDefinitionsUseCase", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/GetUserProfileUseCase;Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/GetCardDefinitionsUseCase;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "onExpiryDateChanged", "(Ljava/lang/String;)V", "onCvvChanged", "", "isFocused", "onExpiryDateFocusChanged", "(Z)V", "onCvvFocusChanged", "onSubmit", "()V", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "cardBrand", "initialize", "(Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;)V", "onReset", "getInputFormats", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/GetUserProfileUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputFormats", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/GetCardDefinitionsUseCase;", "Camera2StreamConfigurationMap", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/expired/ExpiredCardViewModel$UiState;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/ExpirationDateValidator;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/ExpirationDateValidator;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CvvValidator;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CvvValidator;", "Z", "getHighSpeedVideoSizesFor", "getOutputMinFrameDuration"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExpiredCardViewModelImpl extends com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private com.paypal.oslo.feature.wallet.cards.domain.add.validation.CvvValidator getOutputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private com.paypal.oslo.feature.wallet.cards.domain.add.validation.ExpirationDateValidator getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase Camera2StreamConfigurationMap;
    private boolean getOutputMinFrameDuration;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState> uiState;

    /* JADX WARN: Multi-variable type inference failed */
    @javax.inject.Inject
    public ExpiredCardViewModelImpl(com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase getUserProfileUseCase, com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase getCardDefinitionsUseCase, @com.paypal.oslo.feature.wallet.common.di.IoDispatcher kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUserProfileUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCardDefinitionsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighResolutionOutputSizeshNQ4ISI = getUserProfileUseCase;
        this.Camera2StreamConfigurationMap = getCardDefinitionsUseCase;
        this.getHighSpeedVideoFpsRanges = coroutineDispatcher;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState(null, null, null, null, false, false, false, 127, null));
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.getHighSpeedVideoSizes = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.ExpirationDateValidator(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        this.getOutputFormats = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CvvValidator(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel
    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState> getUiState() {
        return this.uiState;
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel
    public final void onExpiryDateChanged(java.lang.String value) {
        com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState value2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value2, com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState.copy$default(value2, null, com.paypal.oslo.feature.wallet.cards.domain.add.StringKtKt.expiryDateDigits$default(value, 0, 1, null), null, null, false, false, false, 117, null)));
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel
    public final void onCvvChanged(java.lang.String value) {
        com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState value2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value2, com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState.copy$default(value2, com.paypal.oslo.feature.wallet.cards.domain.add.StringKtKt.cvvDigits$default(value, 0, 1, null), null, null, null, false, false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null)));
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel
    public final void onExpiryDateFocusChanged(boolean isFocused) {
        com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState value;
        if (isFocused) {
            this.getInputFormats = true;
        } else if (this.getInputFormats) {
            java.lang.String expiryDate = this.getHighSpeedVideoFpsRangesFor.getValue().getExpiryDate();
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState.copy$default(value, null, null, null, !this.getHighSpeedVideoSizes.isValid(expiryDate) ? java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_check_expiration_date) : null, false, false, false, 119, null)));
        }
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel
    public final void onCvvFocusChanged(boolean isFocused) {
        com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState value;
        if (isFocused) {
            this.getHighSpeedVideoSizesFor = true;
        } else if (this.getHighSpeedVideoSizesFor) {
            java.lang.String cvv = this.getHighSpeedVideoFpsRangesFor.getValue().getCvv();
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState.copy$default(value, null, null, !this.getOutputFormats.isValid(cvv) ? java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_check_cvv) : null, null, false, false, false, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, null)));
        }
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel
    public final void onSubmit() {
        com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState value;
        com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState value2;
        com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState value3;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState.copy$default(value, null, null, null, null, true, false, false, 111, null)));
        com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState value4 = this.getHighSpeedVideoFpsRangesFor.getValue();
        boolean isValid = this.getHighSpeedVideoSizes.isValid(value4.getExpiryDate());
        boolean isValid2 = this.getOutputFormats.isValid(value4.getCvv());
        if (isValid2 && isValid) {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState> mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor;
            do {
                value3 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value3, com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState.copy$default(value3, null, null, null, null, false, true, false, 79, null)));
        } else {
            kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState> mutableStateFlow3 = this.getHighSpeedVideoFpsRangesFor;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value2, com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState.copy$default(value2, null, null, !isValid2 ? java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_check_cvv) : null, isValid ? null : java.lang.Integer.valueOf(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_check_expiration_date), false, false, false, 99, null)));
        }
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel
    public final void initialize(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand) {
        com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardBrand, "");
        if (this.getOutputMinFrameDuration) {
            return;
        }
        this.getOutputMinFrameDuration = true;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState.copy$default(value, null, null, null, null, false, false, true, 63, null)));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl$initialize$2(this, cardBrand, null), 3, null);
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel
    public final void onReset() {
        this.getHighSpeedVideoFpsRangesFor.setValue(new com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState(null, null, null, null, false, false, false, 127, null));
        this.getInputFormats = false;
        this.getHighSpeedVideoSizesFor = false;
        this.getOutputMinFrameDuration = false;
    }
}
