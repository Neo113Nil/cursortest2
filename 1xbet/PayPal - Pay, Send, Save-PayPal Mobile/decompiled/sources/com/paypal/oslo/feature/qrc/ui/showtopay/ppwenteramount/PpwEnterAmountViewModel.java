package com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00158\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountReducer;", "reducer", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountReducer;Lcom/paypal/oslo/core/userstore/UserStore;Landroidx/lifecycle/SavedStateHandle;)V", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent;", "event", "", "handleEvent", "(Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiState;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountUiEffect;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/mvi/MviStateStore;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PpwEnterAmountViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState, com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent, com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect> uiEffect;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState> uiState;

    @javax.inject.Inject
    public PpwEnterAmountViewModel(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountReducer ppwEnterAmountReducer, com.paypal.oslo.core.userstore.UserStore userStore, androidx.view.SavedStateHandle savedStateHandle) {
        java.lang.String accountCountryCode;
        java.lang.String accountCurrencyCode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ppwEnterAmountReducer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        java.lang.String str = (java.lang.String) savedStateHandle.get("detectedCountryCode");
        java.lang.String str2 = str == null ? "CN" : str;
        java.lang.String currencyCodeFromCountry = com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountViewModelKt.currencyCodeFromCountry(str2);
        com.paypal.oslo.core.userstore.model.UserState value = userStore.getUserState().getValue();
        com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
        com.paypal.oslo.core.userstore.model.User user = profileLoaded != null ? profileLoaded.getUser() : null;
        com.paypal.oslo.core.mvi.MviStateStore<com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState, com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent, com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect> mviStateStore = new com.paypal.oslo.core.mvi.MviStateStore<>("PpwEnterAmountViewModel.store", new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState.Content(new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiModel(null, null, (user == null || (accountCurrencyCode = user.getAccountCurrencyCode()) == null) ? "USD" : accountCurrencyCode, currencyCodeFromCountry, (user == null || (accountCountryCode = user.getAccountCountryCode()) == null) ? "US" : accountCountryCode, str2, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, null)), ppwEnterAmountReducer, kotlin.collections.CollectionsKt.emptyList(), androidx.view.ViewModelKt.getViewModelScope(this));
        this.getHighSpeedVideoFpsRanges = mviStateStore;
        this.uiState = mviStateStore.getUiState();
        this.uiEffect = mviStateStore.getUiEffect();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiState> getUiState() {
        return this.uiState;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void handleEvent(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        this.getHighSpeedVideoFpsRanges.onEvent(event);
    }
}
