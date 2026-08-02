package com.paypal.oslo.feature.identity.devicebinding.data.repository;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/data/repository/BiometricBindEligibilityRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/BiometricBindEligibilityRepository;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapabilityChecker;", "biometricCapabilityChecker", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapabilityChecker;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError;", "", "isEligible", "()Larrow/core/Either;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapabilityChecker;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BiometricBindEligibilityRepositoryImpl implements com.paypal.oslo.feature.identity.devicebinding.domain.repository.BiometricBindEligibilityRepository {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapabilityChecker getHighSpeedVideoSizes;

    @javax.inject.Inject
    public BiometricBindEligibilityRepositoryImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapabilityChecker biometricCapabilityChecker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricCapabilityChecker, "");
        this.getHighSpeedVideoFpsRangesFor = featureGate;
        this.getHighSpeedVideoSizes = biometricCapabilityChecker;
    }

    @Override // com.paypal.oslo.feature.identity.devicebinding.domain.repository.BiometricBindEligibilityRepository
    public final arrow.core.Either<com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError, kotlin.Unit> isEligible() {
        if (!this.getHighSpeedVideoFpsRangesFor.checkGate(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.INSTANCE.getNativeBiometricBindEnabled())) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.MethodNotEligible(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.BIOMETRIC));
        }
        if (!this.getHighSpeedVideoSizes.check().isAvailable()) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.MethodNotEligible(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.BIOMETRIC));
        }
        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
    }
}
