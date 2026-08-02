package com.paypal.oslo.feature.smartroute.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/UpdatePyusdOptInStatusUseCase;", "", "Lcom/paypal/oslo/feature/smartroute/domain/repository/DistributionRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/smartroute/domain/repository/DistributionRepository;)V", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError;", "invoke", "(Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/smartroute/domain/repository/DistributionRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdatePyusdOptInStatusUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public UpdatePyusdOptInStatusUseCase(com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository distributionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionRepository, "");
        this.getHighSpeedVideoSizes = distributionRepository;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.smartroute.domain.error.DistributionError, com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration>> continuation) {
        com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration copy;
        copy = distributionConfiguration.copy((r30 & 1) != 0 ? distributionConfiguration.status : null, (r30 & 2) != 0 ? distributionConfiguration.savingsPercentage : 0.0f, (r30 & 4) != 0 ? distributionConfiguration.cryptoPercentage : 0.0f, (r30 & 8) != 0 ? distributionConfiguration.cryptoApyRate : null, (r30 & 16) != 0 ? distributionConfiguration.cryptoOptInStatus : com.paypal.oslo.feature.smartroute.domain.model.CryptoStatus.OPTED_IN, (r30 & 32) != 0 ? distributionConfiguration.savingsApy : null, (r30 & 64) != 0 ? distributionConfiguration.autoReloadEnabled : false, (r30 & 128) != 0 ? distributionConfiguration.autoReloadThresholdAmount : null, (r30 & 256) != 0 ? distributionConfiguration.autoReloadAmount : null, (r30 & 512) != 0 ? distributionConfiguration.autoReloadCurrency : null, (r30 & 1024) != 0 ? distributionConfiguration.autoReloadFinancialInstrumentId : null, (r30 & 2048) != 0 ? distributionConfiguration.version : null, (r30 & 4096) != 0 ? distributionConfiguration.savingsEligibilityStatus : null, (r30 & 8192) != 0 ? distributionConfiguration.pyusdEligibilityStatus : null);
        return this.getHighSpeedVideoSizes.updateCryptocurrencyPreferences(copy, continuation);
    }
}
