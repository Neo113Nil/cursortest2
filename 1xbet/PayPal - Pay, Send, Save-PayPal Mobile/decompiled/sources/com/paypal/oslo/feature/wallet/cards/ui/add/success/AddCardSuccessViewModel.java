package com.paypal.oslo.feature.wallet.cards.ui.add.success;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/ui/add/success/AddCardSuccessViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "addCardResult", "", "initialize", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;)V", "", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/wallet/cards/ui/add/success/AddCardSuccessUiState;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddCardSuccessViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.success.AddCardSuccessUiState> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.success.AddCardSuccessUiState> uiState;

    @javax.inject.Inject
    public AddCardSuccessViewModel() {
        boolean z = true;
        com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardErrorRefreshSectionState rewardErrorRefreshSectionState = null;
        int i = 16;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.success.AddCardSuccessUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.wallet.cards.ui.add.success.AddCardSuccessUiState(new com.paypal.oslo.feature.wallet.cards.ui.add.success.CardInfo("", "", "", ""), new com.paypal.oslo.feature.wallet.cards.ui.add.success.CurrencySectionState(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_now_you_can, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_now_you_can, new java.lang.Object[0]), "", true, null, 16, null), new com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardSectionState(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_now_you_can, new java.lang.Object[0]), kotlin.collections.CollectionsKt.emptyList(), com.paypal.pds.core.Icon.NoIcon.INSTANCE, z, rewardErrorRefreshSectionState, i, defaultConstructorMarker), null, new com.paypal.oslo.feature.wallet.cards.ui.add.success.RewardSectionState(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_now_you_can, new java.lang.Object[0]), kotlin.collections.CollectionsKt.emptyList(), com.paypal.pds.core.Icon.NoIcon.INSTANCE, z, rewardErrorRefreshSectionState, i, defaultConstructorMarker)));
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.wallet.cards.ui.add.success.AddCardSuccessUiState> getUiState() {
        return this.uiState;
    }

    public final void initialize(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardResult, "");
        if (this.getHighSpeedVideoFpsRangesFor) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = true;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.wallet.cards.ui.add.success.AddCardSuccessViewModel$loadInitialData$1(addCardResult, this, null), 3, null);
    }
}
