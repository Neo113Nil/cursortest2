package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class RemoteModule_ProvideTransactionHistoryRepositoryFactory implements dagger.internal.Factory<com.payair.logic.remote.repositories.TransactionHistoryRepository> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4430a;

    public RemoteModule_ProvideTransactionHistoryRepositoryFactory(javax.inject.Provider<com.payair.logic.remote.remoteServices.TransactionHistoryService> provider) {
        this.f4430a = provider;
    }

    public static com.payair.logic.di.RemoteModule_ProvideTransactionHistoryRepositoryFactory create(javax.inject.Provider<com.payair.logic.remote.remoteServices.TransactionHistoryService> provider) {
        return new com.payair.logic.di.RemoteModule_ProvideTransactionHistoryRepositoryFactory(provider);
    }

    public static com.payair.logic.remote.repositories.TransactionHistoryRepository provideTransactionHistoryRepository(com.payair.logic.remote.remoteServices.TransactionHistoryService transactionHistoryService) {
        return (com.payair.logic.remote.repositories.TransactionHistoryRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.RemoteModule.INSTANCE.provideTransactionHistoryRepository(transactionHistoryService));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.remote.repositories.TransactionHistoryRepository get() {
        return provideTransactionHistoryRepository((com.payair.logic.remote.remoteServices.TransactionHistoryService) this.f4430a.get());
    }
}
