package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class CacheModule_ProvideSchemeStorageFactory implements dagger.internal.Factory<com.payair.logic.storage.SchemeStorage> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4403a;

    public CacheModule_ProvideSchemeStorageFactory(javax.inject.Provider<android.content.Context> provider) {
        this.f4403a = provider;
    }

    public static com.payair.logic.di.CacheModule_ProvideSchemeStorageFactory create(javax.inject.Provider<android.content.Context> provider) {
        return new com.payair.logic.di.CacheModule_ProvideSchemeStorageFactory(provider);
    }

    public static com.payair.logic.storage.SchemeStorage provideSchemeStorage(android.content.Context context) {
        return (com.payair.logic.storage.SchemeStorage) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.CacheModule.INSTANCE.provideSchemeStorage(context));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.storage.SchemeStorage get() {
        return provideSchemeStorage((android.content.Context) this.f4403a.get());
    }
}
