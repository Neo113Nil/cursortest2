package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/EConsentUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/EConsentRepository;", "eConsentRepository", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/repository/EConsentRepository;)V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/EConsentXOResponse;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/EConsentRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EConsentUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.repository.EConsentRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public EConsentUseCase(com.paypal.oslo.feature.inappcheckout.domain.repository.EConsentRepository eConsentRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eConsentRepository, "");
        this.getHighSpeedVideoSizes = eConsentRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse>> continuation) {
        com.paypal.oslo.feature.inappcheckout.domain.usecase.EConsentUseCase$invoke$1 eConsentUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.domain.usecase.EConsentUseCase$invoke$1) {
            eConsentUseCase$invoke$1 = (com.paypal.oslo.feature.inappcheckout.domain.usecase.EConsentUseCase$invoke$1) continuation;
            if ((eConsentUseCase$invoke$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                eConsentUseCase$invoke$1.getInputFormats -= 2147483648;
                java.lang.Object obj = eConsentUseCase$invoke$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = eConsentUseCase$invoke$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.inappcheckout.domain.repository.EConsentRepository eConsentRepository = this.getHighSpeedVideoSizes;
                        eConsentUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        eConsentUseCase$invoke$1.getInputSizeshNQ4ISI = defaultRaise;
                        eConsentUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        eConsentUseCase$invoke$1.getOutputFormats = defaultRaise3;
                        eConsentUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        eConsentUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        eConsentUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        eConsentUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        eConsentUseCase$invoke$1.getInputFormats = 1;
                        java.lang.Object approveElectronicConsent = eConsentRepository.approveElectronicConsent(str, eConsentUseCase$invoke$1);
                        if (approveElectronicConsent == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = approveElectronicConsent;
                        raise = defaultRaise3;
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
                    int i2 = eConsentUseCase$invoke$1.getHighSpeedVideoSizes;
                    int i3 = eConsentUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = eConsentUseCase$invoke$1.Camera2StreamConfigurationMap;
                    int i5 = eConsentUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    raise = (arrow.core.raise.Raise) eConsentUseCase$invoke$1.getOutputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) eConsentUseCase$invoke$1.getInputSizeshNQ4ISI;
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
                com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse eConsentXOResponse = (com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse) raise.bind((arrow.core.Either) obj);
                defaultRaise2.complete();
                return new arrow.core.Either.Right(eConsentXOResponse);
            }
        }
        eConsentUseCase$invoke$1 = new com.paypal.oslo.feature.inappcheckout.domain.usecase.EConsentUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = eConsentUseCase$invoke$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = eConsentUseCase$invoke$1.getInputFormats;
        if (i != 0) {
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse eConsentXOResponse2 = (com.paypal.oslo.feature.inappcheckout.domain.entity.EConsentXOResponse) raise.bind((arrow.core.Either) obj2);
        defaultRaise2.complete();
        return new arrow.core.Either.Right(eConsentXOResponse2);
    }
}
