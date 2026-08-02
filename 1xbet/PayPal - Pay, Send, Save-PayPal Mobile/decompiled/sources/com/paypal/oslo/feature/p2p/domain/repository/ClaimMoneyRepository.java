package com.paypal.oslo.feature.p2p.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/repository/ClaimMoneyRepository;", "", "", "id", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/ClaimMoneyError;", "Lcom/paypal/oslo/feature/p2p/domain/model/ClaimMoneyTransfer;", "getPaymentTransfer", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transactionId", "completePendingPaymentTransfer"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ClaimMoneyRepository {
    java.lang.Object completePendingPaymentTransfer(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError, com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer>> continuation);

    java.lang.Object getPaymentTransfer(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.ClaimMoneyError, com.paypal.oslo.feature.p2p.domain.model.ClaimMoneyTransfer>> continuation);
}
