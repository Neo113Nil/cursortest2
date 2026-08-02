package com.paypal.oslo.feature.wallet.cards.ui.nickname;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModelImpl;", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel;", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/UpdateNicknameUseCase;", "updateNicknameUseCase", "<init>", "(Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/UpdateNicknameUseCase;)V", "", "cardId", "initialNickname", "", "initialize", "(Ljava/lang/String;Ljava/lang/String;)V", "nickname", "save", "(Ljava/lang/String;)V", "onSecondaryButtonPressed", "()V", "removeNickname", "onRemoveConfirm", "onRemoveCancel", "resetState", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/wallet/cards/domain/usecase/UpdateNicknameUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NicknameViewModelImpl extends com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState> uiState;

    @javax.inject.Inject
    public NicknameViewModelImpl(com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase updateNicknameUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateNicknameUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = updateNicknameUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Idle.INSTANCE);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.getHighSpeedVideoFpsRanges = "";
        this.getHighSpeedVideoSizes = "";
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel
    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState> getUiState() {
        return this.uiState;
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel
    public final void initialize(java.lang.String cardId, java.lang.String initialNickname) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialNickname, "");
        this.getHighSpeedVideoFpsRanges = cardId;
        this.getHighSpeedVideoSizes = initialNickname;
        resetState();
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel
    public final void save(java.lang.String nickname) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nickname, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState> mutableStateFlow = this.Camera2StreamConfigurationMap;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Loading.INSTANCE)) {
        }
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(this.getHighResolutionOutputSizeshNQ4ISI.invoke(this.getHighSpeedVideoFpsRanges, nickname), new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl$save$2(this, null)), androidx.view.ViewModelKt.getViewModelScope(this));
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel
    public final void onSecondaryButtonPressed() {
        com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState value;
        com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Dismissed dismissed;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState> mutableStateFlow = this.Camera2StreamConfigurationMap;
        do {
            value = mutableStateFlow.getValue();
            if (this.getHighSpeedVideoSizes.length() > 0) {
                dismissed = com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveConfirm.INSTANCE;
            } else {
                dismissed = com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Dismissed.INSTANCE;
            }
        } while (!mutableStateFlow.compareAndSet(value, dismissed));
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel
    public final void removeNickname() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState> mutableStateFlow = this.Camera2StreamConfigurationMap;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveConfirm.INSTANCE)) {
        }
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel
    public final void onRemoveConfirm() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState> mutableStateFlow = this.Camera2StreamConfigurationMap;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveLoading.INSTANCE)) {
        }
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(this.getHighResolutionOutputSizeshNQ4ISI.invoke(this.getHighSpeedVideoFpsRanges, ""), new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl$onRemoveConfirm$2(this, null)), androidx.view.ViewModelKt.getViewModelScope(this));
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel
    public final void onRemoveCancel() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState> mutableStateFlow = this.Camera2StreamConfigurationMap;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Idle.INSTANCE)) {
        }
    }

    @Override // com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel
    public final void resetState() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState> mutableStateFlow = this.Camera2StreamConfigurationMap;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Idle.INSTANCE)) {
        }
    }
}
