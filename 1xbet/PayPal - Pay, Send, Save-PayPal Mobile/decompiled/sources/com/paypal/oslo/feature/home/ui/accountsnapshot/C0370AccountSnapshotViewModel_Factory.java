package com.paypal.oslo.feature.home.ui.accountsnapshot;

/* renamed from: com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0370AccountSnapshotViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.RetrySectionUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase> getHighSpeedVideoFpsRangesFor;

    private C0370AccountSnapshotViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.RetrySectionUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotReducer> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    public final com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel get(java.util.Set<? extends com.paypal.oslo.feature.home.api.AccountSnapshotType> set) {
        return newInstance(set, this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.home.ui.accountsnapshot.C0370AccountSnapshotViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.usecase.RetrySectionUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotReducer> provider4) {
        return new com.paypal.oslo.feature.home.ui.accountsnapshot.C0370AccountSnapshotViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel newInstance(java.util.Set<? extends com.paypal.oslo.feature.home.api.AccountSnapshotType> set, com.paypal.oslo.feature.home.domain.usecase.GetAccountSnapshotSectionUseCase getAccountSnapshotSectionUseCase, com.paypal.oslo.feature.home.domain.usecase.RetrySectionUseCase retrySectionUseCase, com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider loadingSectionProvider, com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotReducer accountSnapshotReducer) {
        return new com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel(set, getAccountSnapshotSectionUseCase, retrySectionUseCase, loadingSectionProvider, accountSnapshotReducer);
    }
}
