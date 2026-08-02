package com.paypal.oslo.feature.activity.ui.search.model;

/* loaded from: classes10.dex */
public final class ActivitySearchViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySearchActionsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase> getHighSpeedVideoSizesFor;

    private ActivitySearchViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySearchActionsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchReducer> provider6) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.getHighResolutionOutputSizeshNQ4ISI = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySearchActionsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchReducer> provider6) {
        return new com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel newInstance(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig, com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUserActivitiesPaginationUseCase activityLedgerUserActivitiesPaginationUseCase, com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase activitySuggestionUseCase, com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySearchActionsUseCase activitySearchActionsUseCase, com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase activityNavigationUseCase, com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchReducer activitySearchReducer) {
        return new com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel(activityComposeConfig, activityLedgerUserActivitiesPaginationUseCase, activitySuggestionUseCase, activitySearchActionsUseCase, activityNavigationUseCase, activitySearchReducer);
    }
}
