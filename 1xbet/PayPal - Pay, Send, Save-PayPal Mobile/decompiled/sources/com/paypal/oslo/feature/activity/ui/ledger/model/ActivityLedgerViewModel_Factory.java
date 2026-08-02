package com.paypal.oslo.feature.activity.ui.ledger.model;

/* loaded from: classes10.dex */
public final class ActivityLedgerViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerActionsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerFilterUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.api.domain.usecase.GetPackageTrackingEmailLinkStatusUseCase> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> getOutputMinFrameDuration;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getOutputStallDurationlomOqCM;

    private ActivityLedgerViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerFilterUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerActionsUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider7, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider8, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.api.domain.usecase.GetPackageTrackingEmailLinkStatusUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerReducer> provider10, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider11) {
        this.getHighSpeedVideoSizes = provider;
        this.getInputFormats = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoSizesFor = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
        this.getInputSizeshNQ4ISI = provider6;
        this.getOutputMinFrameDuration = provider7;
        this.Camera2StreamConfigurationMap = provider8;
        this.getOutputFormats = provider9;
        this.getHighSpeedVideoFpsRanges = provider10;
        this.getOutputStallDurationlomOqCM = provider11;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getInputFormats.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getInputSizeshNQ4ISI.get(), this.getOutputMinFrameDuration.get(), this.Camera2StreamConfigurationMap.get(), this.getOutputFormats.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputStallDurationlomOqCM.get());
    }

    public static com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerFilterUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerActionsUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider7, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider8, dagger.internal.Provider<com.paypal.oslo.feature.packagetracking.api.domain.usecase.GetPackageTrackingEmailLinkStatusUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerReducer> provider10, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider11) {
        return new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel newInstance(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig, com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase activityLedgerUseCase, com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerFilterUseCase activityLedgerFilterUseCase, com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase activityLedgerUserActivitiesPaginationUseCase, com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerActionsUseCase activityLedgerActionsUseCase, com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase activityNavigationUseCase, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager, com.paypal.oslo.feature.packagetracking.api.domain.usecase.GetPackageTrackingEmailLinkStatusUseCase getPackageTrackingEmailLinkStatusUseCase, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerReducer activityLedgerReducer, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel(activityComposeConfig, activityLedgerUseCase, activityLedgerFilterUseCase, activityLedgerUserActivitiesPaginationUseCase, activityLedgerActionsUseCase, activityNavigationUseCase, iActivityErrorMapper, activityFeatureManager, getPackageTrackingEmailLinkStatusUseCase, activityLedgerReducer, userStore);
    }
}
