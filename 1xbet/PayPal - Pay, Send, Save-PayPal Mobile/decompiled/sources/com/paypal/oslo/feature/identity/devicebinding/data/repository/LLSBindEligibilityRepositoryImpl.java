package com.paypal.oslo.feature.identity.devicebinding.data.repository;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/data/repository/LLSBindEligibilityRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/LLSBindEligibilityRepository;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapabilityChecker;", "deviceLockCapabilityChecker", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapabilityChecker;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError;", "", "isEligible", "()Larrow/core/Either;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapabilityChecker;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LLSBindEligibilityRepositoryImpl implements com.paypal.oslo.feature.identity.devicebinding.domain.repository.LLSBindEligibilityRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public LLSBindEligibilityRepositoryImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker deviceLockCapabilityChecker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceLockCapabilityChecker, "");
        this.getHighSpeedVideoFpsRanges = featureGate;
        this.getHighSpeedVideoFpsRangesFor = deviceLockCapabilityChecker;
    }

    @Override // com.paypal.oslo.feature.identity.devicebinding.domain.repository.LLSBindEligibilityRepository
    public final arrow.core.Either<com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError, kotlin.Unit> isEligible() {
        if (!this.getHighSpeedVideoFpsRanges.checkGate(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.INSTANCE.getNativeLlsBindEnabled())) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.MethodNotEligible(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.LLS));
        }
        if (!this.getHighSpeedVideoFpsRangesFor.check().isAvailable()) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.MethodNotEligible(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.LLS));
        }
        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
    }
}
