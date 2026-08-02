package com.paypal.oslo.feature.bnplservicing.di;

/* loaded from: classes11.dex */
public final class BnplServDataModule_BindDocumentRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.repository.DocumentRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.DocumentRepositoryImpl> getHighSpeedVideoFpsRangesFor;

    private BnplServDataModule_BindDocumentRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.DocumentRepositoryImpl> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.repository.DocumentRepository get() {
        return bindDocumentRepository(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule_BindDocumentRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.DocumentRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule_BindDocumentRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.repository.DocumentRepository bindDocumentRepository(com.paypal.oslo.feature.bnplservicing.data.repository.DocumentRepositoryImpl documentRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplservicing.domain.repository.DocumentRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule.INSTANCE.bindDocumentRepository(documentRepositoryImpl));
    }
}
