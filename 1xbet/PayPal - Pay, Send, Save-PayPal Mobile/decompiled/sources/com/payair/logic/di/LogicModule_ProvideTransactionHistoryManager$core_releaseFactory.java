package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvideTransactionHistoryManager$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.managers.TransactionHistoryManager> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4423a;
    public final javax.inject.Provider b;
    public final javax.inject.Provider c;

    public LogicModule_ProvideTransactionHistoryManager$core_releaseFactory(javax.inject.Provider<com.payair.logic.remote.repositories.TransactionHistoryRepository> provider, javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider2, javax.inject.Provider<com.payair.db.Database> provider3) {
        this.f4423a = provider;
        this.b = provider2;
        this.c = provider3;
    }

    public static com.payair.logic.di.LogicModule_ProvideTransactionHistoryManager$core_releaseFactory create(javax.inject.Provider<com.payair.logic.remote.repositories.TransactionHistoryRepository> provider, javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider2, javax.inject.Provider<com.payair.db.Database> provider3) {
        return new com.payair.logic.di.LogicModule_ProvideTransactionHistoryManager$core_releaseFactory(provider, provider2, provider3);
    }

    public static com.payair.logic.managers.TransactionHistoryManager provideTransactionHistoryManager$core_release(com.payair.logic.remote.repositories.TransactionHistoryRepository transactionHistoryRepository, com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.db.Database database) {
        return (com.payair.logic.managers.TransactionHistoryManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideTransactionHistoryManager$core_release(transactionHistoryRepository, hceSDKInterface, database));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.managers.TransactionHistoryManager get() {
        return provideTransactionHistoryManager$core_release((com.payair.logic.remote.repositories.TransactionHistoryRepository) this.f4423a.get(), (com.payair.logic.implementation.HceSDKInterface) this.b.get(), (com.payair.db.Database) this.c.get());
    }
}
