package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class CacheModule_ProvideEnrollmentIdStorageFactory implements dagger.internal.Factory<com.payair.logic.storage.EnrollmentIdStorage> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4402a;

    public CacheModule_ProvideEnrollmentIdStorageFactory(javax.inject.Provider<android.content.Context> provider) {
        this.f4402a = provider;
    }

    public static com.payair.logic.di.CacheModule_ProvideEnrollmentIdStorageFactory create(javax.inject.Provider<android.content.Context> provider) {
        return new com.payair.logic.di.CacheModule_ProvideEnrollmentIdStorageFactory(provider);
    }

    public static com.payair.logic.storage.EnrollmentIdStorage provideEnrollmentIdStorage(android.content.Context context) {
        return (com.payair.logic.storage.EnrollmentIdStorage) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.CacheModule.INSTANCE.provideEnrollmentIdStorage(context));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.storage.EnrollmentIdStorage get() {
        return provideEnrollmentIdStorage((android.content.Context) this.f4402a.get());
    }
}
