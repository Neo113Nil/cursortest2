package com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/usecase/PasskeyDeleteUseCase;", "", "Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/repository/PasskeyDeleteRepository;", "passkeyDeleteRepository", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/repository/PasskeyDeleteRepository;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "passkeyCredentialId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/model/PasskeyDeleteError;", "Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/model/PasskeyDeleteSuccess;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/repository/PasskeyDeleteRepository;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyDeleteUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.passkey.management.deletion.domain.repository.PasskeyDeleteRepository getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PasskeyDeleteUseCase(com.paypal.oslo.feature.identity.passkey.management.deletion.domain.repository.PasskeyDeleteRepository passkeyDeleteRepository, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyDeleteRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoSizes = passkeyDeleteRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = featureGate;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteError, com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteSuccess>> continuation) {
        com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase$invoke$1 passkeyDeleteUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        if (continuation instanceof com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase$invoke$1) {
            passkeyDeleteUseCase$invoke$1 = (com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase$invoke$1) continuation;
            if ((passkeyDeleteUseCase$invoke$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                passkeyDeleteUseCase$invoke$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = passkeyDeleteUseCase$invoke$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passkeyDeleteUseCase$invoke$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        if (this.getHighResolutionOutputSizeshNQ4ISI.checkGate(com.paypal.oslo.feature.identity.remoteconfig.AuthFeatureGates.INSTANCE.getNativePasskeyDeletionEnabled())) {
                            com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteRequest passkeyDeleteRequest = new com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteRequest(str);
                            com.paypal.oslo.feature.identity.passkey.management.deletion.domain.repository.PasskeyDeleteRepository passkeyDeleteRepository = this.getHighSpeedVideoSizes;
                            passkeyDeleteUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            passkeyDeleteUseCase$invoke$1.getInputFormats = defaultRaise;
                            passkeyDeleteUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                            passkeyDeleteUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyDeleteRequest);
                            passkeyDeleteUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise3;
                            passkeyDeleteUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                            passkeyDeleteUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                            passkeyDeleteUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                            passkeyDeleteUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                            passkeyDeleteUseCase$invoke$1.getOutputFormats = 1;
                            java.lang.Object deletePasskey = passkeyDeleteRepository.deletePasskey(passkeyDeleteRequest, passkeyDeleteUseCase$invoke$1);
                            if (deletePasskey == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            defaultRaise2 = defaultRaise;
                            obj = deletePasskey;
                            raise = defaultRaise3;
                        } else {
                            defaultRaise3.raise(com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteError.FeatureDisabled.INSTANCE);
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
                    int i2 = passkeyDeleteUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    int i3 = passkeyDeleteUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = passkeyDeleteUseCase$invoke$1.Camera2StreamConfigurationMap;
                    int i5 = passkeyDeleteUseCase$invoke$1.getHighSpeedVideoSizes;
                    raise = (arrow.core.raise.Raise) passkeyDeleteUseCase$invoke$1.getInputSizeshNQ4ISI;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) passkeyDeleteUseCase$invoke$1.getInputFormats;
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
                com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteSuccess passkeyDeleteSuccess = (com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteSuccess) raise.bind((arrow.core.Either) obj);
                defaultRaise2.complete();
                return new arrow.core.Either.Right(passkeyDeleteSuccess);
            }
        }
        passkeyDeleteUseCase$invoke$1 = new com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = passkeyDeleteUseCase$invoke$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyDeleteUseCase$invoke$1.getOutputFormats;
        if (i != 0) {
        }
        com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteSuccess passkeyDeleteSuccess2 = (com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteSuccess) raise.bind((arrow.core.Either) obj2);
        defaultRaise2.complete();
        return new arrow.core.Either.Right(passkeyDeleteSuccess2);
    }
}
