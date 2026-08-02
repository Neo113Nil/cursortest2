package com.paypal.oslo.feature.home.ui.accountsnapshot;

/* loaded from: classes12.dex */
public final class AccountSnapshotViewModel_Factory_Impl implements com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.Factory {
    private final com.paypal.oslo.feature.home.ui.accountsnapshot.C0370AccountSnapshotViewModel_Factory getHighSpeedVideoSizes;

    private AccountSnapshotViewModel_Factory_Impl(com.paypal.oslo.feature.home.ui.accountsnapshot.C0370AccountSnapshotViewModel_Factory c0370AccountSnapshotViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0370AccountSnapshotViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.Factory
    public final com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel create(java.util.Set<? extends com.paypal.oslo.feature.home.api.AccountSnapshotType> set) {
        return this.getHighSpeedVideoSizes.get(set);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.Factory> create(com.paypal.oslo.feature.home.ui.accountsnapshot.C0370AccountSnapshotViewModel_Factory c0370AccountSnapshotViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel_Factory_Impl(c0370AccountSnapshotViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.home.ui.accountsnapshot.C0370AccountSnapshotViewModel_Factory c0370AccountSnapshotViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotViewModel_Factory_Impl(c0370AccountSnapshotViewModel_Factory));
    }
}
