package com.paypal.oslo.feature.wallet.cards.ui.confirm;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/confirm/ConfirmCardViewModelImpl;", "Lcom/paypal/oslo/feature/wallet/cards/ui/confirm/ConfirmCardViewModel;", "<init>", "()V", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "", "onSubmit", "(Ljava/lang/String;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/confirm/ConfirmCardModalState;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CvvValidator;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/validation/CvvValidator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConfirmCardViewModelImpl extends com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.cards.domain.add.validation.CvvValidator getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState> getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState> uiState;

    /* JADX WARN: Multi-variable type inference failed */
    @javax.inject.Inject
    public ConfirmCardViewModelImpl() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState.Idle.INSTANCE);
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.wallet.cards.domain.add.validation.CvvValidator(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardViewModel
    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState> getUiState() {
        return this.uiState;
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardViewModel
    public final void onSubmit(java.lang.String cvv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
        this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState.Loading.INSTANCE);
        if (this.getHighSpeedVideoFpsRangesFor.isValid(cvv)) {
            this.getHighSpeedVideoSizes.setValue(com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState.Success.INSTANCE);
        } else {
            this.getHighSpeedVideoSizes.setValue(new com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState.Error(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_check_cvv));
        }
    }
}
