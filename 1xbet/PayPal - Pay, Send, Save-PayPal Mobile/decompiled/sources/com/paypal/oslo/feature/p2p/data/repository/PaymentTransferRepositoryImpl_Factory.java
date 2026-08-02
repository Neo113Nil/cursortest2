package com.paypal.oslo.feature.p2p.data.repository;

/* loaded from: classes13.dex */
public final class PaymentTransferRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferSendMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferFlowConfigurationMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferRequestMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.CallErrorToExecutePaymentTransferErrorMapper> getHighSpeedVideoSizes;

    private PaymentTransferRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferFlowConfigurationMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferSendMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferRequestMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.CallErrorToExecutePaymentTransferErrorMapper> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferFlowConfigurationMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferSendMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferRequestMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.CallErrorToExecutePaymentTransferErrorMapper> provider5) {
        return new com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl newInstance(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider, com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferFlowConfigurationMapper paymentTransferFlowConfigurationMapper, com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferSendMapper executePaymentTransferSendMapper, com.paypal.oslo.feature.p2p.data.mapper.ExecutePaymentTransferRequestMapper executePaymentTransferRequestMapper, com.paypal.oslo.feature.p2p.data.mapper.CallErrorToExecutePaymentTransferErrorMapper callErrorToExecutePaymentTransferErrorMapper) {
        return new com.paypal.oslo.feature.p2p.data.repository.PaymentTransferRepositoryImpl(provider, paymentTransferFlowConfigurationMapper, executePaymentTransferSendMapper, executePaymentTransferRequestMapper, callErrorToExecutePaymentTransferErrorMapper);
    }
}
