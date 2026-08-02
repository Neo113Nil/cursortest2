package com.paypal.oslo.feature.identity.connect.inboundconnect.di;

/* loaded from: classes12.dex */
public final class InboundConnectUseCaseModule_ProvideInboundConnectUseCaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.domain.IdentitySessionTransfer> getHighSpeedVideoFpsRangesFor;

    private InboundConnectUseCaseModule_ProvideInboundConnectUseCaseFactory(dagger.internal.Provider<com.paypal.oslo.core.identity.domain.IdentitySessionTransfer> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase get() {
        return provideInboundConnectUseCase(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.connect.inboundconnect.di.InboundConnectUseCaseModule_ProvideInboundConnectUseCaseFactory create(dagger.internal.Provider<com.paypal.oslo.core.identity.domain.IdentitySessionTransfer> provider) {
        return new com.paypal.oslo.feature.identity.connect.inboundconnect.di.InboundConnectUseCaseModule_ProvideInboundConnectUseCaseFactory(provider);
    }

    public static com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase provideInboundConnectUseCase(com.paypal.oslo.core.identity.domain.IdentitySessionTransfer identitySessionTransfer) {
        return (com.paypal.oslo.feature.identity.connect.inboundconnect.domain.usecase.InboundConnectUseCase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.connect.inboundconnect.di.InboundConnectUseCaseModule.INSTANCE.provideInboundConnectUseCase(identitySessionTransfer));
    }
}
