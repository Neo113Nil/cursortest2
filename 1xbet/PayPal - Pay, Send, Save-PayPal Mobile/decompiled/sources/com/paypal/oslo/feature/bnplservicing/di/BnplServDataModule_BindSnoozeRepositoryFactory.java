package com.paypal.oslo.feature.bnplservicing.di;

/* loaded from: classes11.dex */
public final class BnplServDataModule_BindSnoozeRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.repository.SnoozeRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.SnoozeRepositoryImpl> getHighSpeedVideoSizes;

    private BnplServDataModule_BindSnoozeRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.SnoozeRepositoryImpl> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.repository.SnoozeRepository get() {
        return bindSnoozeRepository(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule_BindSnoozeRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.SnoozeRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule_BindSnoozeRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.repository.SnoozeRepository bindSnoozeRepository(com.paypal.oslo.feature.bnplservicing.data.repository.SnoozeRepositoryImpl snoozeRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplservicing.domain.repository.SnoozeRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule.INSTANCE.bindSnoozeRepository(snoozeRepositoryImpl));
    }
}
