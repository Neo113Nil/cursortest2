package com.paypal.oslo.feature.p2p.domain.usecase;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JF\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateAmountAndIntentUseCase;", "", "Lcom/paypal/oslo/feature/p2p/domain/repository/TransferFlowRepository;", "transferFlowRepository", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/repository/TransferFlowRepository;)V", "", "id", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "amount", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "intent", "fxQuoteId", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdateAmountAndIntentResult;", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/p2p/domain/repository/TransferFlowRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UpdateAmountAndIntentUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public UpdateAmountAndIntentUseCase(com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository transferFlowRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferFlowRepository, "");
        this.getHighSpeedVideoFpsRangesFor = transferFlowRepository;
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow invoke$default(com.paypal.oslo.feature.p2p.domain.usecase.UpdateAmountAndIntentUseCase updateAmountAndIntentUseCase, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.Amount amount, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return updateAmountAndIntentUseCase.invoke(str, amount, paymentTransferIntent, str2);
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.TransferError, com.paypal.oslo.feature.p2p.domain.model.UpdateAmountAndIntentResult>> invoke(java.lang.String id, com.paypal.oslo.feature.p2p.domain.model.Amount amount, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent intent, java.lang.String fxQuoteId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return this.getHighSpeedVideoFpsRangesFor.updatePaymentTransferAttemptAmountAndIntent(id, amount, intent, fxQuoteId);
    }
}
