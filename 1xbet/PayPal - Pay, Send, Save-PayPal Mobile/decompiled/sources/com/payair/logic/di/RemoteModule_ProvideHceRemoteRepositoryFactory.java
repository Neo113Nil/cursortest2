package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class RemoteModule_ProvideHceRemoteRepositoryFactory implements dagger.internal.Factory<com.payair.logic.remote.repositories.HceRemoteRepository> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4425a;
    public final javax.inject.Provider b;
    public final javax.inject.Provider c;
    public final javax.inject.Provider d;
    public final javax.inject.Provider e;
    public final javax.inject.Provider f;
    public final javax.inject.Provider g;
    public final javax.inject.Provider h;
    public final javax.inject.Provider i;
    public final javax.inject.Provider j;
    public final javax.inject.Provider k;

    public RemoteModule_ProvideHceRemoteRepositoryFactory(javax.inject.Provider<com.payair.logic.remote.remoteServices.ProvisioningService> provider, javax.inject.Provider<com.payair.logic.storage.implementation.CertificateStorage> provider2, javax.inject.Provider<com.payair.logic.implementation.CardEncryptionManager> provider3, javax.inject.Provider<com.payair.logic.storage.TokenizationTimestampStorage> provider4, javax.inject.Provider<com.payair.logic.storage.SchemeStorage> provider5, javax.inject.Provider<com.payair.logic.storage.EnrollmentIdStorage> provider6, javax.inject.Provider<com.payair.db.Database> provider7, javax.inject.Provider<com.payair.hce.visa.tokenization.VisaTokenization> provider8, javax.inject.Provider<com.payair.logic.managers.CoroutineDispatcherProvider> provider9, javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider10, javax.inject.Provider<android.content.Context> provider11) {
        this.f4425a = provider;
        this.b = provider2;
        this.c = provider3;
        this.d = provider4;
        this.e = provider5;
        this.f = provider6;
        this.g = provider7;
        this.h = provider8;
        this.i = provider9;
        this.j = provider10;
        this.k = provider11;
    }

    public static com.payair.logic.di.RemoteModule_ProvideHceRemoteRepositoryFactory create(javax.inject.Provider<com.payair.logic.remote.remoteServices.ProvisioningService> provider, javax.inject.Provider<com.payair.logic.storage.implementation.CertificateStorage> provider2, javax.inject.Provider<com.payair.logic.implementation.CardEncryptionManager> provider3, javax.inject.Provider<com.payair.logic.storage.TokenizationTimestampStorage> provider4, javax.inject.Provider<com.payair.logic.storage.SchemeStorage> provider5, javax.inject.Provider<com.payair.logic.storage.EnrollmentIdStorage> provider6, javax.inject.Provider<com.payair.db.Database> provider7, javax.inject.Provider<com.payair.hce.visa.tokenization.VisaTokenization> provider8, javax.inject.Provider<com.payair.logic.managers.CoroutineDispatcherProvider> provider9, javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider10, javax.inject.Provider<android.content.Context> provider11) {
        return new com.payair.logic.di.RemoteModule_ProvideHceRemoteRepositoryFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static com.payair.logic.remote.repositories.HceRemoteRepository provideHceRemoteRepository(com.payair.logic.remote.remoteServices.ProvisioningService provisioningService, com.payair.logic.storage.implementation.CertificateStorage certificateStorage, com.payair.logic.implementation.CardEncryptionManager cardEncryptionManager, com.payair.logic.storage.TokenizationTimestampStorage tokenizationTimestampStorage, com.payair.logic.storage.SchemeStorage schemeStorage, com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage, com.payair.db.Database database, com.payair.hce.visa.tokenization.VisaTokenization visaTokenization, com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider, com.payair.logic.implementation.HceSDKInterface hceSDKInterface, android.content.Context context) {
        return (com.payair.logic.remote.repositories.HceRemoteRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.RemoteModule.INSTANCE.provideHceRemoteRepository(provisioningService, certificateStorage, cardEncryptionManager, tokenizationTimestampStorage, schemeStorage, enrollmentIdStorage, database, visaTokenization, coroutineDispatcherProvider, hceSDKInterface, context));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.remote.repositories.HceRemoteRepository get() {
        return provideHceRemoteRepository((com.payair.logic.remote.remoteServices.ProvisioningService) this.f4425a.get(), (com.payair.logic.storage.implementation.CertificateStorage) this.b.get(), (com.payair.logic.implementation.CardEncryptionManager) this.c.get(), (com.payair.logic.storage.TokenizationTimestampStorage) this.d.get(), (com.payair.logic.storage.SchemeStorage) this.e.get(), (com.payair.logic.storage.EnrollmentIdStorage) this.f.get(), (com.payair.db.Database) this.g.get(), (com.payair.hce.visa.tokenization.VisaTokenization) this.h.get(), (com.payair.logic.managers.CoroutineDispatcherProvider) this.i.get(), (com.payair.logic.implementation.HceSDKInterface) this.j.get(), (android.content.Context) this.k.get());
    }
}
