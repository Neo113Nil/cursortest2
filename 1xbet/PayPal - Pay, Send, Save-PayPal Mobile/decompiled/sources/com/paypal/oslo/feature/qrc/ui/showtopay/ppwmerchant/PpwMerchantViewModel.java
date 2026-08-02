package com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00108\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantReducer;", "reducer", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantReducer;)V", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantEvent;", "event", "", "handleEvent", "(Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantEvent;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiState;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwmerchant/PpwMerchantUiEffect;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PpwMerchantViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState, com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent, com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiEffect> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState> uiState;

    @javax.inject.Inject
    public PpwMerchantViewModel(com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantReducer ppwMerchantReducer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ppwMerchantReducer, "");
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState, com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent, com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("PpwMerchantViewModel.store", com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState.Initial.INSTANCE, ppwMerchantReducer, kotlin.collections.CollectionsKt.emptyList(), androidx.view.ViewModelKt.getViewModelScope(this));
        this.Camera2StreamConfigurationMap = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void handleEvent(com.paypal.oslo.feature.qrc.ui.showtopay.ppwmerchant.PpwMerchantEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.Camera2StreamConfigurationMap.onEvent(event);
    }
}
