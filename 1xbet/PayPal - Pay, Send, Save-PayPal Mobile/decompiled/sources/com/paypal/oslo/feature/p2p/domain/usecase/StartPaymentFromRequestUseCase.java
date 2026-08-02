package com.paypal.oslo.feature.p2p.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/usecase/StartPaymentFromRequestUseCase;", "", "Lcom/paypal/oslo/feature/p2p/domain/repository/PaymentRequestRepository;", "paymentRequestRepository", "Lcom/paypal/oslo/feature/p2p/domain/repository/TransferFlowRepository;", "transferFlowRepository", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/repository/PaymentRequestRepository;Lcom/paypal/oslo/feature/p2p/domain/repository/TransferFlowRepository;)V", "", "requestId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/p2p/domain/error/PaymentTransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferAttempt;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/p2p/domain/repository/PaymentRequestRepository;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/domain/repository/TransferFlowRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StartPaymentFromRequestUseCase {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.repository.PaymentRequestRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public StartPaymentFromRequestUseCase(com.paypal.oslo.feature.p2p.domain.repository.PaymentRequestRepository paymentRequestRepository, com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository transferFlowRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentRequestRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferFlowRepository, "");
        this.Camera2StreamConfigurationMap = paymentRequestRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = transferFlowRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.p2p.domain.error.PaymentTransferError, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt>> continuation) {
        com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase$invoke$1 startPaymentFromRequestUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase$invoke$1) {
            startPaymentFromRequestUseCase$invoke$1 = (com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase$invoke$1) continuation;
            if ((startPaymentFromRequestUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                startPaymentFromRequestUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = startPaymentFromRequestUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = startPaymentFromRequestUseCase$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.p2p.domain.repository.PaymentRequestRepository paymentRequestRepository = this.Camera2StreamConfigurationMap;
                    startPaymentFromRequestUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    startPaymentFromRequestUseCase$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = paymentRequestRepository.startPaymentTransferAttemptForSubflow(str, startPaymentFromRequestUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isRight()) {
                    this.getHighResolutionOutputSizeshNQ4ISI.setPaymentTransferAttempt((com.paypal.oslo.feature.p2p.domain.model.PaymentTransferAttempt) ((arrow.core.Either.Right) either).getValue());
                }
                return either;
            }
        }
        startPaymentFromRequestUseCase$invoke$1 = new com.paypal.oslo.feature.p2p.domain.usecase.StartPaymentFromRequestUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = startPaymentFromRequestUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = startPaymentFromRequestUseCase$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isRight()) {
        }
        return either;
    }
}
