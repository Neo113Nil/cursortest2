package com.paypal.oslo.feature.identity.passkey.eligibility.domain.usecase;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/usecase/SystemPasskeyEligibilityUseCase;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapabilityChecker;", "biometricCapabilityChecker", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapabilityChecker;", "deviceLockCapabilityChecker", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/EmulatorDetector;", "emulatorDetector", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapabilityChecker;Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapabilityChecker;Lcom/paypal/oslo/feature/identity/shared/domain/capability/EmulatorDetector;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passkey/eligibility/domain/model/PasskeyIneligibilityReason;", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/BiometricCapabilityChecker;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/DeviceLockCapabilityChecker;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/shared/domain/capability/EmulatorDetector;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SystemPasskeyEligibilityUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapabilityChecker getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.shared.domain.capability.EmulatorDetector getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SystemPasskeyEligibilityUseCase(com.paypal.oslo.feature.identity.shared.domain.capability.BiometricCapabilityChecker biometricCapabilityChecker, com.paypal.oslo.feature.identity.shared.domain.capability.DeviceLockCapabilityChecker deviceLockCapabilityChecker, com.paypal.oslo.feature.identity.shared.domain.capability.EmulatorDetector emulatorDetector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricCapabilityChecker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceLockCapabilityChecker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emulatorDetector, "");
        this.getHighSpeedVideoSizes = biometricCapabilityChecker;
        this.Camera2StreamConfigurationMap = deviceLockCapabilityChecker;
        this.getHighResolutionOutputSizeshNQ4ISI = emulatorDetector;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason, kotlin.Unit>> continuation) {
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                if (!this.getHighResolutionOutputSizeshNQ4ISI.isEmulator()) {
                    boolean isAvailable = this.getHighSpeedVideoSizes.check().isAvailable();
                    boolean isAvailable2 = this.Camera2StreamConfigurationMap.check().isAvailable();
                    if (!isAvailable && !isAvailable2) {
                        defaultRaise2.raise(com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.NoUVPAA.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(unit);
                }
                defaultRaise2.raise(com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.RunningOnEmulator.INSTANCE);
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise2.raise(com.paypal.oslo.feature.identity.passkey.eligibility.domain.model.PasskeyIneligibilityReason.OsVersionNotSupported.INSTANCE);
            throw new kotlin.KotlinNothingValueException();
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
    }
}
