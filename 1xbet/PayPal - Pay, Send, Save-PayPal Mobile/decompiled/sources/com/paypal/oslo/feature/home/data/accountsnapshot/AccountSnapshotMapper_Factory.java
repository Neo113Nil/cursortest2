package com.paypal.oslo.feature.home.data.accountsnapshot;

/* loaded from: classes12.dex */
public final class AccountSnapshotMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.AccountSnapshotMapper> {
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory>> getHighSpeedVideoFpsRanges;

    private AccountSnapshotMapper_Factory(dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory>> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.AccountSnapshotMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.AccountSnapshotMapper_Factory create(dagger.internal.Provider<java.util.Set<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory>> provider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.AccountSnapshotMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.AccountSnapshotMapper newInstance(java.util.Set<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory> set) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.AccountSnapshotMapper(set);
    }
}
