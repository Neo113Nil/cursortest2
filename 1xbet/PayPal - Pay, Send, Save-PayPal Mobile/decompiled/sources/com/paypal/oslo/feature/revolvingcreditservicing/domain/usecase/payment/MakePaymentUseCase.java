package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/payment/MakePaymentUseCase;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/PaymentReviewRepository;", "repository", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/PaymentReviewRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/makeapayment/MakePaymentRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/MakePaymentResponse;", "invoke", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/makeapayment/MakePaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/PaymentReviewRepository;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MakePaymentUseCase {
    public static final int $stable = 8;
    private final kotlinx.coroutines.CoroutineDispatcher getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentReviewRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public MakePaymentUseCase(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentReviewRepository paymentReviewRepository, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoSizes = paymentReviewRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineDispatcher;
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest makePaymentRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase$invoke$2(this, makePaymentRequest, null), continuation);
    }
}
