package com.paypal.oslo.feature.home.ui.accountsnapshot;

/* loaded from: classes12.dex */
public final class AccountSnapshotProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.Factory> getHighSpeedVideoSizes;

    private AccountSnapshotProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.Factory> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.Factory> provider2) {
        return new com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImpl newInstance(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.Factory factory) {
        return new com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImpl(appNavigator, factory);
    }
}
