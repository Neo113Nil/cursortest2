package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

/* loaded from: classes12.dex */
public final class ObserveLinkAccountCompletionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ObserveLinkAccountCompletionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.repository.LinkAccountRepository> getHighSpeedVideoFpsRangesFor;

    private ObserveLinkAccountCompletionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.repository.LinkAccountRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ObserveLinkAccountCompletionUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ObserveLinkAccountCompletionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.accountswitch.domain.repository.LinkAccountRepository> provider) {
        return new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ObserveLinkAccountCompletionUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ObserveLinkAccountCompletionUseCase newInstance(com.paypal.oslo.feature.identity.accountswitch.domain.repository.LinkAccountRepository linkAccountRepository) {
        return new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ObserveLinkAccountCompletionUseCase(linkAccountRepository);
    }
}
