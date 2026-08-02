package com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase$Companion;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsRepository;", "cvmLimitsRepository", "Lcom/zettle/sdk/feature/taptopay/core/configuration/HerdAnalytics;", "cvmHerdAnalytics", "Lkotlinx/coroutines/CoroutineScope;", "zettleScope", "Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase;", "create", "(Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase$Companion;Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsRepository;Lcom/zettle/sdk/feature/taptopay/core/configuration/HerdAnalytics;Lkotlinx/coroutines/CoroutineScope;)Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CvmLimitsUsecaseKt {
    public static final com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase create(com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.Companion companion, com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository cvmLimitsRepository, com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics herdAnalytics, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvmLimitsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(herdAnalytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        return new com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecaseImpl(cvmLimitsRepository, herdAnalytics, coroutineScope);
    }
}
