package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class CacheModule_ProvideTokenizationTimestampStorageFactory implements dagger.internal.Factory<com.payair.logic.storage.TokenizationTimestampStorage> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4405a;

    public CacheModule_ProvideTokenizationTimestampStorageFactory(javax.inject.Provider<android.content.Context> provider) {
        this.f4405a = provider;
    }

    public static com.payair.logic.di.CacheModule_ProvideTokenizationTimestampStorageFactory create(javax.inject.Provider<android.content.Context> provider) {
        return new com.payair.logic.di.CacheModule_ProvideTokenizationTimestampStorageFactory(provider);
    }

    public static com.payair.logic.storage.TokenizationTimestampStorage provideTokenizationTimestampStorage(android.content.Context context) {
        return (com.payair.logic.storage.TokenizationTimestampStorage) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.CacheModule.INSTANCE.provideTokenizationTimestampStorage(context));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.storage.TokenizationTimestampStorage get() {
        return provideTokenizationTimestampStorage((android.content.Context) this.f4405a.get());
    }
}
