package com.paypal.oslo.feature.p2p.domain.usecase;

/* loaded from: classes13.dex */
public final class IsAmountAndIntentUpdateInitiatedUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.domain.usecase.IsAmountAndIntentUpdateInitiatedUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> Camera2StreamConfigurationMap;

    private IsAmountAndIntentUpdateInitiatedUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.domain.usecase.IsAmountAndIntentUpdateInitiatedUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.IsAmountAndIntentUpdateInitiatedUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> provider) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.IsAmountAndIntentUpdateInitiatedUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.IsAmountAndIntentUpdateInitiatedUseCase newInstance(com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository transferFlowRepository) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.IsAmountAndIntentUpdateInitiatedUseCase(transferFlowRepository);
    }
}
