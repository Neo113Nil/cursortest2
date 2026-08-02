package com.paypal.oslo.feature.identity.devicebinding.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/usecase/DeviceBindingUseCase;", "", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/DeviceBindingRepository;", "deviceBindingRepository", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/DeviceBindingEligibilityRepository;", "eligibilityRepository", "<init>", "(Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/DeviceBindingRepository;Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/DeviceBindingEligibilityRepository;)V", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingInput;", "deviceBindingInput", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingOutput;", "invoke", "(Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/DeviceBindingRepository;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/repository/DeviceBindingEligibilityRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceBindingUseCase {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.identity.devicebinding.domain.repository.DeviceBindingRepository getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.repository.DeviceBindingEligibilityRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public DeviceBindingUseCase(com.paypal.oslo.feature.identity.devicebinding.domain.repository.DeviceBindingRepository deviceBindingRepository, com.paypal.oslo.feature.identity.devicebinding.domain.repository.DeviceBindingEligibilityRepository deviceBindingEligibilityRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindingRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindingEligibilityRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = deviceBindingRepository;
        this.Camera2StreamConfigurationMap = deviceBindingEligibilityRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput deviceBindingInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError, com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput>> continuation) {
        com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase$invoke$1 deviceBindingUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        if (continuation instanceof com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase$invoke$1) {
            deviceBindingUseCase$invoke$1 = (com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase$invoke$1) continuation;
            if ((deviceBindingUseCase$invoke$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                deviceBindingUseCase$invoke$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = deviceBindingUseCase$invoke$1.getOutputStallDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deviceBindingUseCase$invoke$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        if (!deviceBindingInput.getMethods().isEmpty()) {
                            java.util.Set<com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> methods = deviceBindingInput.getMethods();
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (java.lang.Object obj2 : methods) {
                                if (this.Camera2StreamConfigurationMap.isEligible((com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) obj2).isRight()) {
                                    arrayList.add(obj2);
                                }
                            }
                            java.util.Set set = kotlin.collections.CollectionsKt.toSet(arrayList);
                            if (!set.isEmpty()) {
                                com.paypal.oslo.feature.identity.devicebinding.domain.repository.DeviceBindingRepository deviceBindingRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                                com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput copy$default = com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingInput.copy$default(deviceBindingInput, set, null, 2, null);
                                deviceBindingUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deviceBindingInput);
                                deviceBindingUseCase$invoke$1.getInputFormats = defaultRaise;
                                deviceBindingUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                                deviceBindingUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(set);
                                deviceBindingUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise3;
                                deviceBindingUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                                deviceBindingUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                                deviceBindingUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                                deviceBindingUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                deviceBindingUseCase$invoke$1.getOutputFormats = 1;
                                java.lang.Object bind = deviceBindingRepository.bind(copy$default, deviceBindingUseCase$invoke$1);
                                if (bind == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                defaultRaise2 = defaultRaise;
                                obj = bind;
                                raise = defaultRaise3;
                            } else {
                                defaultRaise3.raise(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.NoEligibleMethods.INSTANCE);
                                throw new kotlin.KotlinNothingValueException();
                            }
                        } else {
                            defaultRaise3.raise(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.EmptyMethods.INSTANCE);
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } catch (arrow.core.raise.RaiseCancellationException e) {
                        e = e;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = deviceBindingUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = deviceBindingUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i4 = deviceBindingUseCase$invoke$1.Camera2StreamConfigurationMap;
                    int i5 = deviceBindingUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    raise = (arrow.core.raise.Raise) deviceBindingUseCase$invoke$1.getInputSizeshNQ4ISI;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) deviceBindingUseCase$invoke$1.getInputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (arrow.core.raise.RaiseCancellationException e2) {
                        e = e2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defaultRaise = defaultRaise2;
                        defaultRaise.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                    }
                }
                com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput deviceBindingOutput = (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput) raise.bind((arrow.core.Either) obj);
                defaultRaise2.complete();
                return new arrow.core.Either.Right(deviceBindingOutput);
            }
        }
        deviceBindingUseCase$invoke$1 = new com.paypal.oslo.feature.identity.devicebinding.domain.usecase.DeviceBindingUseCase$invoke$1(this, continuation);
        java.lang.Object obj3 = deviceBindingUseCase$invoke$1.getOutputStallDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deviceBindingUseCase$invoke$1.getOutputFormats;
        if (i != 0) {
        }
        com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput deviceBindingOutput2 = (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingOutput) raise.bind((arrow.core.Either) obj3);
        defaultRaise2.complete();
        return new arrow.core.Either.Right(deviceBindingOutput2);
    }
}
