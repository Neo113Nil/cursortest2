package com.paypal.oslo.feature.settings.closeaccount.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/usecase/GetCloseAccountEligibilityUseCase;", "", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/repository/CloseAccountRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/settings/closeaccount/domain/repository/CloseAccountRepository;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountEligibilityResult;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/repository/CloseAccountRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GetCloseAccountEligibilityUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetCloseAccountEligibilityUseCase(com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository closeAccountRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountRepository, "");
        this.getHighSpeedVideoFpsRangesFor = closeAccountRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8 A[Catch: all -> 0x003a, RaiseCancellationException -> 0x003d, TryCatch #3 {RaiseCancellationException -> 0x003d, all -> 0x003a, blocks: (B:11:0x0036, B:12:0x006f, B:17:0x0079, B:18:0x0097, B:23:0x0086, B:24:0x00a2, B:25:0x00a7, B:26:0x00a8, B:27:0x00b8), top: B:10:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult>> continuation) {
        com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase$invoke$1 getCloseAccountEligibilityUseCase$invoke$1;
        int i;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult closeAccountEligibilityResult;
        if (continuation instanceof com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase$invoke$1) {
            getCloseAccountEligibilityUseCase$invoke$1 = (com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase$invoke$1) continuation;
            if ((getCloseAccountEligibilityUseCase$invoke$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                getCloseAccountEligibilityUseCase$invoke$1.getInputFormats -= 2147483648;
                java.lang.Object obj = getCloseAccountEligibilityUseCase$invoke$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getCloseAccountEligibilityUseCase$invoke$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    defaultRaise = new arrow.core.raise.DefaultRaise(false);
                    try {
                        arrow.core.raise.DefaultRaise defaultRaise3 = defaultRaise;
                        com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository closeAccountRepository = this.getHighSpeedVideoFpsRangesFor;
                        getCloseAccountEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges = defaultRaise;
                        getCloseAccountEligibilityUseCase$invoke$1.getOutputMinFrameDuration = defaultRaise3;
                        getCloseAccountEligibilityUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                        getCloseAccountEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                        getCloseAccountEligibilityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        getCloseAccountEligibilityUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                        getCloseAccountEligibilityUseCase$invoke$1.getInputFormats = 1;
                        java.lang.Object checkCloseAccountEligibility = closeAccountRepository.checkCloseAccountEligibility(getCloseAccountEligibilityUseCase$invoke$1);
                        if (checkCloseAccountEligibility == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise3;
                        defaultRaise2 = defaultRaise;
                        obj = checkCloseAccountEligibility;
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
                    int i2 = getCloseAccountEligibilityUseCase$invoke$1.Camera2StreamConfigurationMap;
                    int i3 = getCloseAccountEligibilityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    int i4 = getCloseAccountEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    int i5 = getCloseAccountEligibilityUseCase$invoke$1.getHighSpeedVideoSizes;
                    raise = (arrow.core.raise.Raise) getCloseAccountEligibilityUseCase$invoke$1.getOutputMinFrameDuration;
                    defaultRaise2 = (arrow.core.raise.DefaultRaise) getCloseAccountEligibilityUseCase$invoke$1.getHighSpeedVideoFpsRanges;
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
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    raise.raise((com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError) ((arrow.core.Ior.Left) ior).getValue());
                    throw new kotlin.KotlinNothingValueException();
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    closeAccountEligibilityResult = (com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult) ((arrow.core.Ior.Right) ior).getValue();
                } else {
                    if (!(ior instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    java.lang.Object leftValue = ((arrow.core.Ior.Both) ior).getLeftValue();
                    closeAccountEligibilityResult = (com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult) ((arrow.core.Ior.Both) ior).getRightValue();
                }
                defaultRaise2.complete();
                return new arrow.core.Either.Right(closeAccountEligibilityResult);
            }
        }
        getCloseAccountEligibilityUseCase$invoke$1 = new com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getCloseAccountEligibilityUseCase$invoke$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCloseAccountEligibilityUseCase$invoke$1.getInputFormats;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
