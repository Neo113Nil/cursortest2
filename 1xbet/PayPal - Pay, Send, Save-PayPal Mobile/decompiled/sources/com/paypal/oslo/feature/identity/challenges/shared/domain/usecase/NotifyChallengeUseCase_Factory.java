package com.paypal.oslo.feature.identity.challenges.shared.domain.usecase;

/* loaded from: classes12.dex */
public final class NotifyChallengeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.NotifyChallengeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.repository.NotifyChallengeRepository> Camera2StreamConfigurationMap;

    private NotifyChallengeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.repository.NotifyChallengeRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.NotifyChallengeUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.NotifyChallengeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.challenges.shared.domain.repository.NotifyChallengeRepository> provider) {
        return new com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.NotifyChallengeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.NotifyChallengeUseCase newInstance(com.paypal.oslo.feature.identity.challenges.shared.domain.repository.NotifyChallengeRepository notifyChallengeRepository) {
        return new com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.NotifyChallengeUseCase(notifyChallengeRepository);
    }
}
