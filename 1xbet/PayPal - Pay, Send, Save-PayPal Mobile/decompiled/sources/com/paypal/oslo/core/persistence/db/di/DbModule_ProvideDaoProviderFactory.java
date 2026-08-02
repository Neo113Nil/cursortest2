package com.paypal.oslo.core.persistence.db.di;

/* loaded from: classes10.dex */
public final class DbModule_ProvideDaoProviderFactory implements dagger.internal.Factory<com.paypal.oslo.core.persistence.db.api.DaoProvider> {
    private final dagger.internal.Provider<androidx.room.RoomDatabase> getHighSpeedVideoSizes;

    private DbModule_ProvideDaoProviderFactory(dagger.internal.Provider<androidx.room.RoomDatabase> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.persistence.db.api.DaoProvider get() {
        return provideDaoProvider(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.persistence.db.di.DbModule_ProvideDaoProviderFactory create(dagger.internal.Provider<androidx.room.RoomDatabase> provider) {
        return new com.paypal.oslo.core.persistence.db.di.DbModule_ProvideDaoProviderFactory(provider);
    }

    public static com.paypal.oslo.core.persistence.db.api.DaoProvider provideDaoProvider(androidx.room.RoomDatabase roomDatabase) {
        return (com.paypal.oslo.core.persistence.db.api.DaoProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.persistence.db.di.DbModule.INSTANCE.provideDaoProvider(roomDatabase));
    }
}
