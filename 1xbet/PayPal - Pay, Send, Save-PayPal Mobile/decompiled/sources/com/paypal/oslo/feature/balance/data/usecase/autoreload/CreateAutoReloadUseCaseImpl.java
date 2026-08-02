package com.paypal.oslo.feature.balance.data.usecase.autoreload;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/data/usecase/autoreload/CreateAutoReloadUseCaseImpl;", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/CreateAutoReloadUseCase;", "Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;)V", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/CreateAutoReloadRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/CreateAutoReloadSuccessResponse;", "invoke", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/CreateAutoReloadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoReloadRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CreateAutoReloadUseCaseImpl implements com.paypal.oslo.feature.balance.domain.usecase.autoreload.CreateAutoReloadUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CreateAutoReloadUseCaseImpl(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadRepository, "");
        this.Camera2StreamConfigurationMap = autoReloadRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.balance.domain.usecase.autoreload.CreateAutoReloadUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadRequest createAutoReloadRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse>> continuation) {
        com.paypal.oslo.feature.balance.data.usecase.autoreload.CreateAutoReloadUseCaseImpl$invoke$1 createAutoReloadUseCaseImpl$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.Raise raise;
        if (continuation instanceof com.paypal.oslo.feature.balance.data.usecase.autoreload.CreateAutoReloadUseCaseImpl$invoke$1) {
            createAutoReloadUseCaseImpl$invoke$1 = (com.paypal.oslo.feature.balance.data.usecase.autoreload.CreateAutoReloadUseCaseImpl$invoke$1) continuation;
            if ((createAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                createAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = createAutoReloadUseCaseImpl$invoke$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = createAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository = this.Camera2StreamConfigurationMap;
                        createAutoReloadUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createAutoReloadRequest);
                        createAutoReloadUseCaseImpl$invoke$1.getInputSizeshNQ4ISI = defaultRaise;
                        createAutoReloadUseCaseImpl$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(defaultRaise3);
                        createAutoReloadUseCaseImpl$invoke$1.getInputFormats = defaultRaise3;
                        createAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        createAutoReloadUseCaseImpl$invoke$1.Camera2StreamConfigurationMap = 0;
                        createAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges = 0;
                        createAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoSizes = 0;
                        createAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor = 1;
                        java.lang.Object createAutoReload = autoReloadRepository.createAutoReload(createAutoReloadRequest, createAutoReloadUseCaseImpl$invoke$1);
                        if (createAutoReload == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultRaise2 = defaultRaise;
                        obj = createAutoReload;
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
                    int i2 = createAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoSizes;
                    int i3 = createAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges;
                    int i4 = createAutoReloadUseCaseImpl$invoke$1.Camera2StreamConfigurationMap;
                    int i5 = createAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                    raise = (arrow.core.raise.Raise) createAutoReloadUseCaseImpl$invoke$1.getInputFormats;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) createAutoReloadUseCaseImpl$invoke$1.getInputSizeshNQ4ISI;
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
                com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse createAutoReloadSuccessResponse = (com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse) raise.bind((arrow.core.Either) obj);
                defaultRaise2.complete();
                return new arrow.core.Either.Right(createAutoReloadSuccessResponse);
            }
        }
        createAutoReloadUseCaseImpl$invoke$1 = new com.paypal.oslo.feature.balance.data.usecase.autoreload.CreateAutoReloadUseCaseImpl$invoke$1(this, continuation);
        java.lang.Object obj2 = createAutoReloadUseCaseImpl$invoke$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = createAutoReloadUseCaseImpl$invoke$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse createAutoReloadSuccessResponse2 = (com.paypal.oslo.feature.balance.domain.model.autoreload.CreateAutoReloadSuccessResponse) raise.bind((arrow.core.Either) obj2);
        defaultRaise2.complete();
        return new arrow.core.Either.Right(createAutoReloadSuccessResponse2);
    }
}
