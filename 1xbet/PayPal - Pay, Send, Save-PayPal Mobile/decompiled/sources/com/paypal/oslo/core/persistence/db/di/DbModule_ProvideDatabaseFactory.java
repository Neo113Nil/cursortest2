package com.paypal.oslo.core.persistence.db.di;

/* loaded from: classes10.dex */
public final class DbModule_ProvideDatabaseFactory implements dagger.internal.Factory<androidx.room.RoomDatabase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.db.impl.OsloDatabaseFactory> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.db.di.DatabaseClassProvider> getHighSpeedVideoFpsRangesFor;

    private DbModule_ProvideDatabaseFactory(dagger.internal.Provider<com.paypal.oslo.core.persistence.db.impl.OsloDatabaseFactory> provider, dagger.internal.Provider<com.paypal.oslo.core.persistence.db.di.DatabaseClassProvider> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.room.RoomDatabase get() {
        return provideDatabase(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.persistence.db.di.DbModule_ProvideDatabaseFactory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.db.impl.OsloDatabaseFactory> provider, dagger.internal.Provider<com.paypal.oslo.core.persistence.db.di.DatabaseClassProvider> provider2) {
        return new com.paypal.oslo.core.persistence.db.di.DbModule_ProvideDatabaseFactory(provider, provider2);
    }

    public static androidx.room.RoomDatabase provideDatabase(com.paypal.oslo.core.persistence.db.impl.OsloDatabaseFactory osloDatabaseFactory, com.paypal.oslo.core.persistence.db.di.DatabaseClassProvider databaseClassProvider) {
        return (androidx.room.RoomDatabase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.persistence.db.di.DbModule.INSTANCE.provideDatabase(osloDatabaseFactory, databaseClassProvider));
    }
}
