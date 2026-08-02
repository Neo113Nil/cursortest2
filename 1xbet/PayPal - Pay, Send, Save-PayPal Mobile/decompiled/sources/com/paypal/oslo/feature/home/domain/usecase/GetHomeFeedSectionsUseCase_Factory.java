package com.paypal.oslo.feature.home.domain.usecase;

/* loaded from: classes12.dex */
public final class GetHomeFeedSectionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.domain.usecase.GetHomeFeedSectionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository> Camera2StreamConfigurationMap;

    private GetHomeFeedSectionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.domain.usecase.GetHomeFeedSectionsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.home.domain.usecase.GetHomeFeedSectionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository> provider) {
        return new com.paypal.oslo.feature.home.domain.usecase.GetHomeFeedSectionsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.home.domain.usecase.GetHomeFeedSectionsUseCase newInstance(com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository homeFeedRepository) {
        return new com.paypal.oslo.feature.home.domain.usecase.GetHomeFeedSectionsUseCase(homeFeedRepository);
    }
}
