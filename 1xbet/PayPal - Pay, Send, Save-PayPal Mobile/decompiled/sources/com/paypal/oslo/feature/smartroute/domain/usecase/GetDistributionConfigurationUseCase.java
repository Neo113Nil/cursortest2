package com.paypal.oslo.feature.smartroute.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/GetDistributionConfigurationUseCase;", "", "Lcom/paypal/oslo/feature/smartroute/domain/repository/DistributionRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/smartroute/domain/repository/DistributionRepository;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError;", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/smartroute/domain/repository/DistributionRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetDistributionConfigurationUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetDistributionConfigurationUseCase(com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository distributionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionRepository, "");
        this.getHighSpeedVideoSizes = distributionRepository;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.smartroute.domain.error.DistributionError, com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration>> continuation) {
        return this.getHighSpeedVideoSizes.loadConfiguration(continuation);
    }
}
