package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0004R\u0016\u0010#\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/Transaction;", "", "", "getId", "()Ljava/lang/String;", "id", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getAmount", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "amount", "Ljava/time/Instant;", "getCreationDate", "()Ljava/time/Instant;", "creationDate", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;", "getTransactionType", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionType;", "transactionType", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;", "getTransactionImage", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CreditImage;", "transactionImage", "getTransactionName", "transactionName", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/transaction/TransactionFundingInstrument;", "getTransactionFundingInstruments", "()Ljava/util/List;", "transactionFundingInstruments", "", "isCancellable", "()Z", "getTransactionCashbackPercentage", "transactionCashbackPercentage", "getReferenceId", "referenceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface Transaction {
    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getAmount();

    java.time.Instant getCreationDate();

    java.lang.String getId();

    java.lang.String getReferenceId();

    java.lang.String getTransactionCashbackPercentage();

    java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionFundingInstrument> getTransactionFundingInstruments();

    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CreditImage getTransactionImage();

    java.lang.String getTransactionName();

    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.transaction.TransactionType getTransactionType();

    /* renamed from: isCancellable */
    boolean getIsCancellable();
}
