package com.paypal.oslo.feature.activity.ui.ledger.model.helper;

/* loaded from: classes10.dex */
public final class ActivityLedgerBaseViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.api.domain.usecase.GetPackageTrackingEmailLinkStatusUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerReducer> getHighSpeedVideoSizes;

    private ActivityLedgerBaseViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.api.domain.usecase.GetPackageTrackingEmailLinkStatusUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerReducer> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.api.domain.usecase.GetPackageTrackingEmailLinkStatusUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerReducer> provider4) {
        return new com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.packagetracking.api.domain.usecase.GetPackageTrackingEmailLinkStatusUseCase getPackageTrackingEmailLinkStatusUseCase, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerReducer activityLedgerReducer) {
        return new com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel(appNavigator, userStore, getPackageTrackingEmailLinkStatusUseCase, activityLedgerReducer);
    }
}
