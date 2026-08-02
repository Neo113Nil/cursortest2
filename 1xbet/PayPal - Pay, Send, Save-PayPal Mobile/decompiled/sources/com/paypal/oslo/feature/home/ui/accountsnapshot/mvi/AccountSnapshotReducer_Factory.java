package com.paypal.oslo.feature.home.ui.accountsnapshot.mvi;

/* loaded from: classes12.dex */
public final class AccountSnapshotReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotReducer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter> getHighSpeedVideoSizes;

    private AccountSnapshotReducer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotReducer get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotReducer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider> provider2) {
        return new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotReducer_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotReducer newInstance(com.paypal.oslo.feature.home.ui.navigation.HomeNavigationRouter homeNavigationRouter, com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider loadingSectionProvider) {
        return new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotReducer(homeNavigationRouter, loadingSectionProvider);
    }
}
