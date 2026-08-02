package com.paypal.oslo.feature.cryptocurrency.ui.settings;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/settings/CryptoSettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/settings/GetCryptoSettingsUseCase;", "getCryptoSettingsUseCase", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/settings/GetCryptoSettingsUseCase;)V", "", "loadSettings$cryptocurrency_prodRelease", "()V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/settings/GetCryptoSettingsUseCase;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/settings/model/CryptoSettingsUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoSettingsViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState> uiState;

    @javax.inject.Inject
    public CryptoSettingsViewModel(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase getCryptoSettingsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCryptoSettingsUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = featureGateManager;
        this.getHighSpeedVideoFpsRanges = getCryptoSettingsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState.Initial.INSTANCE);
        this.Camera2StreamConfigurationMap = MutableStateFlow;
        this.uiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        loadSettings$cryptocurrency_prodRelease();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsUiState> getUiState() {
        return this.uiState;
    }

    public final void loadSettings$cryptocurrency_prodRelease() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel$loadSettings$1(this, null), 3, null);
    }

    public static final /* synthetic */ java.util.List access$buildSettingsItems(com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel cryptoSettingsViewModel, com.paypal.oslo.feature.cryptocurrency.domain.model.settings.CryptoSettingsData cryptoSettingsData) {
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        if (cryptoSettingsData.getRecurringBuys() != null) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.settings.RecurringBuysSettings recurringBuys = cryptoSettingsData.getRecurringBuys();
            createListBuilder.add(new com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemUiData(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId.RECURRING_BUYS, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_recurring_purchases, recurringBuys.getAssets(), recurringBuys.isActive() ? com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.On.INSTANCE : com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.Off.INSTANCE, true));
        }
        if (cryptoSettingsData.getPriceAlerts() != null) {
            com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PriceAlertsSettings priceAlerts = cryptoSettingsData.getPriceAlerts();
            createListBuilder.add(new com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemUiData(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId.PRICE_ALERTS, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_price_alerts, priceAlerts.getAssets(), priceAlerts.isActive() ? com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.On.INSTANCE : com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.Off.INSTANCE, true));
        }
        if (cryptoSettingsData.getPyusdRewards() != null) {
            createListBuilder.add(new com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemUiData(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId.PYUSD_REWARDS, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_pyusd_rewards, null, cryptoSettingsData.getPyusdRewards().isEnrolled() ? com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.On.INSTANCE : com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.Off.INSTANCE, true, 4, null));
        }
        if (cryptoSettingsViewModel.getHighResolutionOutputSizeshNQ4ISI.isAddressBookEnabled()) {
            createListBuilder.add(new com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemUiData(com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsItemId.ADDRESS_BOOK, com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_settings_address_book, null, com.paypal.oslo.feature.cryptocurrency.ui.settings.model.CryptoSettingsBadgeStatus.None.INSTANCE, true, 4, null));
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }
}
