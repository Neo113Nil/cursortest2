package com.paypal.oslo.feature.taptopay.data.repository;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/PayPalLocalCardDataRepositoryProvider;", "", "Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Manager;", "tapToPayConfig", "Ljavax/inject/Provider;", "Lcom/paypal/oslo/feature/taptopay/data/repository/mock/PayPalMockLocalCardDataRepository;", "mockRepository", "Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/DeviceWalletDataBase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Manager;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalLocalCardDataRepository;", "get", "()Lcom/paypal/oslo/feature/taptopay/domain/repository/paypal/PayPalLocalCardDataRepository;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/remoteconfig/TapToPayConfig$Manager;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Ljavax/inject/Provider;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalLocalCardDataRepositoryProvider {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final javax.inject.Provider<com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase> getHighResolutionOutputSizeshNQ4ISI;
    private final javax.inject.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PayPalLocalCardDataRepositoryProvider(com.paypal.oslo.feature.taptopay.domain.remoteconfig.TapToPayConfig.Manager manager, javax.inject.Provider<com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository> provider, javax.inject.Provider<com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase> provider2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider2, "");
        this.Camera2StreamConfigurationMap = manager;
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    public final com.paypal.oslo.feature.taptopay.domain.repository.paypal.PayPalLocalCardDataRepository get() {
        if (this.Camera2StreamConfigurationMap.isTapToPayMockEnabled()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "MOCK: Using MockPayPalLocalCardDataRepository", null, null, 6, null);
            com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository payPalMockLocalCardDataRepository = this.getHighSpeedVideoFpsRangesFor.get();
            kotlin.jvm.internal.Intrinsics.checkNotNull(payPalMockLocalCardDataRepository);
            return payPalMockLocalCardDataRepository;
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Using LocalPayPalCardDatabaseRepository", null, null, 6, null);
        com.paypal.oslo.feature.taptopay.data.db.card.paypal.DeviceWalletDataBase deviceWalletDataBase = this.getHighResolutionOutputSizeshNQ4ISI.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deviceWalletDataBase, "");
        return new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.LocalPayPalCardDatabaseRepository(deviceWalletDataBase);
    }
}
