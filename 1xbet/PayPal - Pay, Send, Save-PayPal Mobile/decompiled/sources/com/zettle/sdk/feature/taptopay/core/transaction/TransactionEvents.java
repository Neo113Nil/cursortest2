package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH&¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionEvents;", "", "Lcom/zettle/sdk/feature/taptopay/core/transaction/CardEvent;", "event", "", "onCardEvent", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/CardEvent;)V", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "", "", "map", "onTransactionRequestOnlineAuthentication", "([BLjava/util/Map;)[B", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionResultEvent;", "onlineResponse", "onTransactionResult", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionResultEvent;[B)V", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionUIEvent;", "onTransactionUIEvent", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionUIEvent;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface TransactionEvents {
    void onCardEvent(com.zettle.sdk.feature.taptopay.core.transaction.CardEvent event);

    byte[] onTransactionRequestOnlineAuthentication(byte[] bytes, java.util.Map<java.lang.String, byte[]> map);

    void onTransactionResult(com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent event, byte[] onlineResponse);

    void onTransactionUIEvent(com.zettle.sdk.feature.taptopay.core.transaction.TransactionUIEvent event);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void onTransactionResult$default(com.zettle.sdk.feature.taptopay.core.transaction.TransactionEvents transactionEvents, com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent transactionResultEvent, byte[] bArr, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTransactionResult");
            }
            if ((i & 2) != 0) {
                bArr = null;
            }
            transactionEvents.onTransactionResult(transactionResultEvent, bArr);
        }
    }
}
