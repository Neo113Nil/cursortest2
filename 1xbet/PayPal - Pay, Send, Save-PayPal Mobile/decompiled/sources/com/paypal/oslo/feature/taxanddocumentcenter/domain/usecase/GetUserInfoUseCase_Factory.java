package com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase;

/* loaded from: classes15.dex */
public final class GetUserInfoUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> Camera2StreamConfigurationMap;

    private GetUserInfoUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetUserInfoUseCase(userStore);
    }
}
