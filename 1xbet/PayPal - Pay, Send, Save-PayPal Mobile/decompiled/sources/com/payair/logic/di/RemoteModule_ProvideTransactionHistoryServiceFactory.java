package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class RemoteModule_ProvideTransactionHistoryServiceFactory implements dagger.internal.Factory<com.payair.logic.remote.remoteServices.TransactionHistoryService> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4431a;

    public RemoteModule_ProvideTransactionHistoryServiceFactory(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider) {
        this.f4431a = provider;
    }

    public static com.payair.logic.di.RemoteModule_ProvideTransactionHistoryServiceFactory create(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider) {
        return new com.payair.logic.di.RemoteModule_ProvideTransactionHistoryServiceFactory(provider);
    }

    public static com.payair.logic.remote.remoteServices.TransactionHistoryService provideTransactionHistoryService(com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        return (com.payair.logic.remote.remoteServices.TransactionHistoryService) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.RemoteModule.INSTANCE.provideTransactionHistoryService(hceSDKInterface));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.remote.remoteServices.TransactionHistoryService get() {
        return provideTransactionHistoryService((com.payair.logic.implementation.HceSDKInterface) this.f4431a.get());
    }
}
