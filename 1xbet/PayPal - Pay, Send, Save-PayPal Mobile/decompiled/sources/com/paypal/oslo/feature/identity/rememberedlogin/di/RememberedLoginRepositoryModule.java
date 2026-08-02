package com.paypal.oslo.feature.identity.rememberedlogin.di;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/di/RememberedLoginRepositoryModule;", "", "Lcom/paypal/oslo/feature/identity/rememberedlogin/data/repository/RememberedLoginRepositoryImpl;", "repositoryImpl", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/repository/RememberedLoginRepository;", "bindRememberedLoginRepository", "(Lcom/paypal/oslo/feature/identity/rememberedlogin/data/repository/RememberedLoginRepositoryImpl;)Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/repository/RememberedLoginRepository;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorageWithProfile;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorage;", "bindRememberedUserStorage", "(Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorageWithProfile;)Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public interface RememberedLoginRepositoryModule {
    @dagger.Binds
    com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository bindRememberedLoginRepository(com.paypal.oslo.feature.identity.rememberedlogin.data.repository.RememberedLoginRepositoryImpl repositoryImpl);

    @dagger.Binds
    com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorage bindRememberedUserStorage(com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile storage);
}
