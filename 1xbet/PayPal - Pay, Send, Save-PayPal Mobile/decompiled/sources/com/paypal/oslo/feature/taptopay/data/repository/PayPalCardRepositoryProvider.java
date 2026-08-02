package com.paypal.oslo.feature.taptopay.data.repository;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/PayPalCardRepositoryProvider;", "", "Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Manager;", "tapToPayConfig", "Ljavax/inject/Provider;", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/PayPalMockCardRepository;", "mockRepository", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/device/DeviceInfoProvider;", "deviceInfoProvider", "Lcom/paypal/oslo/feature/taptopay/data/worker/paypal/BackgroundSyncWorkerScheduler;", "workerScheduler", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Manager;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;", "get", "()Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalCardRepository;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Manager;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Ljavax/inject/Provider;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayPalCardRepositoryProvider {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final javax.inject.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final javax.inject.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final javax.inject.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final javax.inject.Provider<com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PayPalCardRepositoryProvider(com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager manager, javax.inject.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository> provider, javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider2, javax.inject.Provider<com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider> provider3, javax.inject.Provider<com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler> provider4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider4, "");
        this.getHighSpeedVideoSizes = manager;
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    public final com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalCardRepository get() {
        if (this.getHighSpeedVideoSizes.isTapToPayMockEnabled()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "MOCK: Using MockPayPalCardRepository", null, null, 6, null);
            com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockCardRepository payPalMockCardRepository = this.getHighSpeedVideoFpsRanges.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(payPalMockCardRepository);
            return payPalMockCardRepository;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Using RemotePayPalCardRepository", null, null, 6, null);
        javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.feature.taptopay.data.repository.paypal.device.DeviceInfoProvider deviceInfoProvider = this.getHighSpeedVideoFpsRangesFor.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceInfoProvider, "");
        com.paypal.oslo.feature.taptopay.data.worker.paypal.BackgroundSyncWorkerScheduler backgroundSyncWorkerScheduler = this.getHighResolutionOutputSizeshNQ4ISI.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(backgroundSyncWorkerScheduler, "");
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.RemotePayPalCardRepository(provider, deviceInfoProvider, backgroundSyncWorkerScheduler);
    }
}
