package com.paypal.oslo.feature.identity.devicebinding.data.repository;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/data/repository/DeviceBindingEligibilityRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/DeviceBindingEligibilityRepository;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/BiometricBindEligibilityRepository;", "biometricBindEligibilityRepository", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/LLSBindEligibilityRepository;", "llsBindEligibilityRepository", "<init>", "(Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/BiometricBindEligibilityRepository;Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/LLSBindEligibilityRepository;)V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "method", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError;", "", "isEligible", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;)Larrow/core/Either;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/BiometricBindEligibilityRepository;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/LLSBindEligibilityRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceBindingEligibilityRepositoryImpl implements com.paypal.oslo.feature.identity.devicebinding.domain.repository.DeviceBindingEligibilityRepository {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.repository.LLSBindEligibilityRepository getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.repository.BiometricBindEligibilityRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DeviceBindingEligibilityRepositoryImpl(com.paypal.oslo.feature.identity.devicebinding.domain.repository.BiometricBindEligibilityRepository biometricBindEligibilityRepository, com.paypal.oslo.feature.identity.devicebinding.domain.repository.LLSBindEligibilityRepository lLSBindEligibilityRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricBindEligibilityRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lLSBindEligibilityRepository, "");
        this.getHighSpeedVideoFpsRanges = biometricBindEligibilityRepository;
        this.getHighSpeedVideoSizes = lLSBindEligibilityRepository;
    }

    @Override // com.paypal.oslo.feature.identity.devicebinding.domain.repository.DeviceBindingEligibilityRepository
    public final arrow.core.Either<com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError, kotlin.Unit> isEligible(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        int i = com.paypal.oslo.feature.identity.devicebinding.data.repository.DeviceBindingEligibilityRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
        if (i == 1) {
            return this.getHighSpeedVideoFpsRanges.isEligible();
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return this.getHighSpeedVideoSizes.isEligible();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.BIOMETRIC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.LLS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
