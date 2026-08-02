package com.paypal.oslo.feature.balance.data.usecase.autoreload;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/data/usecase/autoreload/UpdateAutoReloadUseCaseImpl;", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/UpdateAutoReloadUseCase;", "Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;)V", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/UpdateAutoReloadRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/CreateAutoReloadSuccessResponse;", "invoke", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/UpdateAutoReloadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UpdateAutoReloadUseCaseImpl implements com.paypal.oslo.feature.balance.domain.usecase.autoreload.UpdateAutoReloadUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public UpdateAutoReloadUseCaseImpl(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadRepository, "");
        this.Camera2StreamConfigurationMap = autoReloadRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007b A[Catch: all -> 0x003e, RaiseCancellationException -> 0x0041, TRY_ENTER, TryCatch #3 {RaiseCancellationException -> 0x0041, all -> 0x003e, blocks: (B:11:0x003a, B:12:0x0075, B:15:0x007b, B:17:0x0089, B:20:0x00a9, B:21:0x00b3, B:24:0x00b8, B:25:0x00c8, B:26:0x00c9, B:27:0x00ce), top: B:10:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.balance.domain.usecase.autoreload.UpdateAutoReloadUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.balance.domain.model.autoreload.UpdateAutoReloadRequest updateAutoReloadRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse>> continuation) {
        com.paypal.oslo.feature.balance.data.usecase.autoreload.UpdateAutoReloadUseCaseImpl$invoke$1 updateAutoReloadUseCaseImpl$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        com.paypal.oslo.feature.balance.domain.model.autoreload.UpdateAutoReloadRequest updateAutoReloadRequest2;
        arrow.core.raise.Raise raise;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.usecase.autoreload.UpdateAutoReloadUseCaseImpl$invoke$1) {
            updateAutoReloadUseCaseImpl$invoke$1 = (com.paypal.oslo.feature.balance.data.usecase.autoreload.UpdateAutoReloadUseCaseImpl$invoke$1) continuation;
            if ((updateAutoReloadUseCaseImpl$invoke$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                updateAutoReloadUseCaseImpl$invoke$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = updateAutoReloadUseCaseImpl$invoke$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = updateAutoReloadUseCaseImpl$invoke$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository = this.Camera2StreamConfigurationMap;
                        updateAutoReloadUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI = updateAutoReloadRequest;
                        updateAutoReloadUseCaseImpl$invoke$1.getInputSizeshNQ4ISI = defaultRaise;
                        updateAutoReloadUseCaseImpl$invoke$1.getInputFormats = defaultRaise3;
                        updateAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoSizes = 0;
                        updateAutoReloadUseCaseImpl$invoke$1.Camera2StreamConfigurationMap = 0;
                        updateAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        updateAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        updateAutoReloadUseCaseImpl$invoke$1.getOutputFormats = 1;
                        java.lang.Object updateAutoReload = autoReloadRepository.updateAutoReload(updateAutoReloadRequest, updateAutoReloadUseCaseImpl$invoke$1);
                        if (updateAutoReload == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = updateAutoReload;
                        updateAutoReloadRequest2 = updateAutoReloadRequest;
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
                    int i2 = updateAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges;
                    int i3 = updateAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                    int i4 = updateAutoReloadUseCaseImpl$invoke$1.Camera2StreamConfigurationMap;
                    int i5 = updateAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoSizes;
                    raise = (arrow.core.raise.Raise) updateAutoReloadUseCaseImpl$invoke$1.getInputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) updateAutoReloadUseCaseImpl$invoke$1.getInputSizeshNQ4ISI;
                    updateAutoReloadRequest2 = (com.paypal.oslo.feature.balance.domain.model.autoreload.UpdateAutoReloadRequest) updateAutoReloadUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
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
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    if (((com.paypal.oslo.feature.balance.domain.model.autoreload.UpdateAutoReloadResponse) ((arrow.core.Either.Right) either).getValue()).getSuccess()) {
                        com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse createAutoReloadSuccessResponse = new com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse(updateAutoReloadRequest2.getBalanceId(), updateAutoReloadRequest2.getFinancialInstrumentId(), updateAutoReloadRequest2.getReloadAmount(), updateAutoReloadRequest2.getThresholdAmount());
                        defaultRaise2.complete();
                        return new arrow.core.Either.Right(createAutoReloadSuccessResponse);
                    }
                    raise.raise(com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericAutoReloadError.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
                if (either instanceof arrow.core.Either.Left) {
                    raise.raise((com.paypal.oslo.feature.balance.domain.error.AutoReloadError) ((arrow.core.Either.Left) either).getValue());
                    throw new kotlin.KotlinNothingValueException();
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        updateAutoReloadUseCaseImpl$invoke$1 = new com.paypal.oslo.feature.balance.data.usecase.autoreload.UpdateAutoReloadUseCaseImpl$invoke$1(this, continuation);
        java.lang.Object obj2 = updateAutoReloadUseCaseImpl$invoke$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updateAutoReloadUseCaseImpl$invoke$1.getOutputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
