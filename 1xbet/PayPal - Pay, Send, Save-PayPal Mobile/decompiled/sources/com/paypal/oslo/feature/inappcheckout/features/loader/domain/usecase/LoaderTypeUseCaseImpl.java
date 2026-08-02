package com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/usecase/LoaderTypeUseCaseImpl;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/usecase/LoaderTypeUseCase;", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;", "invoke", "()Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/features/statsig/featureGate/FeatureGateManager;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LoaderTypeUseCaseImpl implements com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public LoaderTypeUseCaseImpl(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighSpeedVideoFpsRangesFor = featureGateManager;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.usecase.LoaderTypeUseCase
    public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType invoke() {
        if (this.getHighSpeedVideoFpsRangesFor.isAnimatedGIFLoaderEnabled()) {
            return com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType.AnimatedLogo.INSTANCE;
        }
        return com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType.AnimatedCircle.INSTANCE;
    }
}
