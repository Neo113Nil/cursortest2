package com.paypal.oslo.feature.identity.llslogin.data.repository;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/identity/llslogin/data/repository/LLSEligibilityRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/llslogin/domain/repository/LLSEligibilityRepository;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "tokenStorage", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapabilityChecker;", "deviceLockCapabilityChecker", "<init>", "(Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapabilityChecker;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/llslogin/domain/model/LLSLoginError;", "", "isEligibleForLogin", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapabilityChecker;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LLSEligibilityRepositoryImpl implements com.paypal.oslo.feature.identity.llslogin.domain.repository.LLSEligibilityRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public LLSEligibilityRepositoryImpl(com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker deviceLockCapabilityChecker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindingTokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceLockCapabilityChecker, "");
        this.getHighSpeedVideoFpsRangesFor = deviceBindingTokenStorage;
        this.Camera2StreamConfigurationMap = featureGate;
        this.getHighResolutionOutputSizeshNQ4ISI = deviceLockCapabilityChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.identity.llslogin.domain.repository.LLSEligibilityRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object isEligibleForLogin(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.llslogin.domain.model.LLSLoginError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.identity.llslogin.data.repository.LLSEligibilityRepositoryImpl$isEligibleForLogin$1 lLSEligibilityRepositoryImpl$isEligibleForLogin$1;
        java.lang.Object obj;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.llslogin.data.repository.LLSEligibilityRepositoryImpl$isEligibleForLogin$1) {
            lLSEligibilityRepositoryImpl$isEligibleForLogin$1 = (com.paypal.oslo.feature.identity.llslogin.data.repository.LLSEligibilityRepositoryImpl$isEligibleForLogin$1) continuation;
            if ((lLSEligibilityRepositoryImpl$isEligibleForLogin$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                lLSEligibilityRepositoryImpl$isEligibleForLogin$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                obj = lLSEligibilityRepositoryImpl$isEligibleForLogin$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = lLSEligibilityRepositoryImpl$isEligibleForLogin$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.Camera2StreamConfigurationMap.checkGate(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.INSTANCE.getNativeLlsLoginEnabled())) {
                        return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.llslogin.domain.model.LLSLoginError.NotEligible.INSTANCE);
                    }
                    if (!this.getHighResolutionOutputSizeshNQ4ISI.check().isAvailable()) {
                        return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.llslogin.domain.model.LLSLoginError.NotEligible.INSTANCE);
                    }
                    com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod = com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.LLS;
                    lLSEligibilityRepositoryImpl$isEligibleForLogin$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = deviceBindingTokenStorage.getBindingToken(deviceAuthMethod, lLSEligibilityRepositoryImpl$isEligibleForLogin$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((java.lang.String) obj) != null) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.llslogin.domain.model.LLSLoginError.NotEligible.INSTANCE);
                }
                return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
            }
        }
        lLSEligibilityRepositoryImpl$isEligibleForLogin$1 = new com.paypal.oslo.feature.identity.llslogin.data.repository.LLSEligibilityRepositoryImpl$isEligibleForLogin$1(this, continuation);
        obj = lLSEligibilityRepositoryImpl$isEligibleForLogin$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = lLSEligibilityRepositoryImpl$isEligibleForLogin$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        if (((java.lang.String) obj) != null) {
        }
    }
}
