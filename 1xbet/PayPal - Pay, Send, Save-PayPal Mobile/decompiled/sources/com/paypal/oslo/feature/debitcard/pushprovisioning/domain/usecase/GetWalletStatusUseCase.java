package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/usecase/GetWalletStatusUseCase;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/GetWalletStatusRequest;", "Lcom/paypal/oslo/feature/starpay/api/WalletStatus;", "<init>", "()V", "request", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/GetWalletStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetWalletStatusUseCase implements com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetWalletStatusRequest, com.paypal.oslo.feature.starpay.api.WalletStatus> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public GetWalletStatusUseCase() {
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<com.paypal.oslo.feature.starpay.api.WalletStatus> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError, ? extends T> ior, kotlin.jvm.functions.Function1<? super T, ? extends com.paypal.oslo.feature.starpay.api.WalletStatus> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.GetWalletStatusRequest getWalletStatusRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends com.paypal.oslo.feature.starpay.api.WalletStatus>> continuation) {
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase$invoke$1 getWalletStatusUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.starpay.api.Result result;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase$invoke$1) {
            getWalletStatusUseCase$invoke$1 = (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase$invoke$1) continuation;
            if ((getWalletStatusUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                getWalletStatusUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = getWalletStatusUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getWalletStatusUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    getWalletStatusUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = getWalletStatusRequest;
                    getWalletStatusUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                    getWalletStatusUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase$invoke$1 getWalletStatusUseCase$invoke$12 = getWalletStatusUseCase$invoke$1;
                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(getWalletStatusUseCase$invoke$12), 1);
                    cancellableContinuationImpl.initCancellability();
                    final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                    getWalletStatusRequest.getStarPayClient().checkWalletStatus(new com.paypal.oslo.feature.starpay.api.OnCompleteListener<com.paypal.oslo.feature.starpay.api.WalletStatus>() { // from class: com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase$invoke$result$1$1
                        @Override // com.paypal.oslo.feature.starpay.api.OnCompleteListener
                        public final void onComplete(com.paypal.oslo.feature.starpay.api.Result<? extends com.paypal.oslo.feature.starpay.api.WalletStatus> result2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result2, "");
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Wallet status check completed: ".concat(java.lang.String.valueOf(result2)), null, null, 6, null);
                            kotlinx.coroutines.CancellableContinuation<com.paypal.oslo.feature.starpay.api.Result<? extends com.paypal.oslo.feature.starpay.api.WalletStatus>> cancellableContinuation = cancellableContinuationImpl2;
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(result2));
                        }
                    });
                    obj = cancellableContinuationImpl.getResult();
                    if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(getWalletStatusUseCase$invoke$12);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = getWalletStatusUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                result = (com.paypal.oslo.feature.starpay.api.Result) obj;
                if (!(result instanceof com.paypal.oslo.feature.starpay.api.Result.Failure)) {
                    return new com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.PushProvisioningWalletError(null, ((com.paypal.oslo.feature.starpay.api.Result.Failure) result).getError().getMessage());
                }
                if (!(result instanceof com.paypal.oslo.feature.starpay.api.Result.Success)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return new com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Success(null, ((com.paypal.oslo.feature.starpay.api.Result.Success) result).getData());
            }
        }
        getWalletStatusUseCase$invoke$1 = new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetWalletStatusUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getWalletStatusUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getWalletStatusUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        result = (com.paypal.oslo.feature.starpay.api.Result) obj2;
        if (!(result instanceof com.paypal.oslo.feature.starpay.api.Result.Failure)) {
        }
    }
}
