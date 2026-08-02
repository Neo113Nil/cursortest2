package com.paypal.oslo.feature.home.domain.usecase;

/* loaded from: classes12.dex */
public final class RefreshHomeFeedSectionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.domain.usecase.RefreshHomeFeedSectionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository> getHighSpeedVideoFpsRangesFor;

    private RefreshHomeFeedSectionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.domain.usecase.RefreshHomeFeedSectionsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.home.domain.usecase.RefreshHomeFeedSectionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository> provider) {
        return new com.paypal.oslo.feature.home.domain.usecase.RefreshHomeFeedSectionsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.home.domain.usecase.RefreshHomeFeedSectionsUseCase newInstance(com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository homeFeedRepository) {
        return new com.paypal.oslo.feature.home.domain.usecase.RefreshHomeFeedSectionsUseCase(homeFeedRepository);
    }
}
