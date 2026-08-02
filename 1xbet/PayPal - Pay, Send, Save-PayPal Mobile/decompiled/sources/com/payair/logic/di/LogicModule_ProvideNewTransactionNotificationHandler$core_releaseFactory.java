package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvideNewTransactionNotificationHandler$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.managers.NewTransactionNotificationHandler> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4412a;
    public final javax.inject.Provider b;

    public LogicModule_ProvideNewTransactionNotificationHandler$core_releaseFactory(javax.inject.Provider<com.payair.logic.managers.TransactionHistoryManager> provider, javax.inject.Provider<com.payair.logic.managers.CoroutineDispatcherProvider> provider2) {
        this.f4412a = provider;
        this.b = provider2;
    }

    public static com.payair.logic.di.LogicModule_ProvideNewTransactionNotificationHandler$core_releaseFactory create(javax.inject.Provider<com.payair.logic.managers.TransactionHistoryManager> provider, javax.inject.Provider<com.payair.logic.managers.CoroutineDispatcherProvider> provider2) {
        return new com.payair.logic.di.LogicModule_ProvideNewTransactionNotificationHandler$core_releaseFactory(provider, provider2);
    }

    public static com.payair.logic.managers.NewTransactionNotificationHandler provideNewTransactionNotificationHandler$core_release(com.payair.logic.managers.TransactionHistoryManager transactionHistoryManager, com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider) {
        return (com.payair.logic.managers.NewTransactionNotificationHandler) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideNewTransactionNotificationHandler$core_release(transactionHistoryManager, coroutineDispatcherProvider));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.managers.NewTransactionNotificationHandler get() {
        return provideNewTransactionNotificationHandler$core_release((com.payair.logic.managers.TransactionHistoryManager) this.f4412a.get(), (com.payair.logic.managers.CoroutineDispatcherProvider) this.b.get());
    }
}
