package com.discover.mpos.sdk.transaction;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JN\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b(\u0010\u0010R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0012R\u0014\u00100\u001a\u00020-8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020-8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u0014"}, d2 = {"Lcom/discover/mpos/sdk/transaction/TransactionData;", "", "Lcom/discover/mpos/sdk/core/data/Amount;", "amountAuthorized", "Ljava/util/Currency;", "currency", "Lcom/discover/mpos/sdk/transaction/TransactionType;", "type", "cashbackAmount", "Lcom/discover/mpos/sdk/card/connectors/ConnectorType;", "connectorType", "Ljava/util/Date;", "transactionDate", "<init>", "(Lcom/discover/mpos/sdk/core/data/Amount;Ljava/util/Currency;Lcom/discover/mpos/sdk/transaction/TransactionType;Lcom/discover/mpos/sdk/core/data/Amount;Lcom/discover/mpos/sdk/card/connectors/ConnectorType;Ljava/util/Date;)V", "component1", "()Lcom/discover/mpos/sdk/core/data/Amount;", "component2", "()Ljava/util/Currency;", "component3", "()Lcom/discover/mpos/sdk/transaction/TransactionType;", "component4", "component5", "()Lcom/discover/mpos/sdk/card/connectors/ConnectorType;", "component6", "()Ljava/util/Date;", "copy", "(Lcom/discover/mpos/sdk/core/data/Amount;Ljava/util/Currency;Lcom/discover/mpos/sdk/transaction/TransactionType;Lcom/discover/mpos/sdk/core/data/Amount;Lcom/discover/mpos/sdk/card/connectors/ConnectorType;Ljava/util/Date;)Lcom/discover/mpos/sdk/transaction/TransactionData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/discover/mpos/sdk/core/data/Amount;", "getAmountAuthorized", "getCashbackAmount", "Lcom/discover/mpos/sdk/card/connectors/ConnectorType;", "getConnectorType", "Ljava/util/Currency;", "getCurrency", "", "getEmvAmountAuthorized$mpos_sdk_card_reader_offlineRegularRelease", "()[B", "emvAmountAuthorized", "getEmvCashbackAuthorized$mpos_sdk_card_reader_offlineRegularRelease", "emvCashbackAuthorized", "Ljava/util/Date;", "getTransactionDate", "Lcom/discover/mpos/sdk/transaction/TransactionType;", "getType"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class TransactionData {
    private final com.discover.mpos.sdk.core.data.Amount amountAuthorized;
    private final com.discover.mpos.sdk.core.data.Amount cashbackAmount;
    private final com.discover.mpos.sdk.card.connectors.ConnectorType connectorType;
    private final java.util.Currency currency;
    private final java.util.Date transactionDate;
    private final com.discover.mpos.sdk.transaction.TransactionType type;

    public TransactionData(com.discover.mpos.sdk.core.data.Amount amount, java.util.Currency currency, com.discover.mpos.sdk.transaction.TransactionType transactionType, com.discover.mpos.sdk.core.data.Amount amount2, com.discover.mpos.sdk.card.connectors.ConnectorType connectorType, java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectorType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        this.amountAuthorized = amount;
        this.currency = currency;
        this.type = transactionType;
        this.cashbackAmount = amount2;
        this.connectorType = connectorType;
        this.transactionDate = date;
    }

    public final com.discover.mpos.sdk.core.data.Amount getAmountAuthorized() {
        return this.amountAuthorized;
    }

    public /* synthetic */ TransactionData(com.discover.mpos.sdk.core.data.Amount amount, java.util.Currency currency, com.discover.mpos.sdk.transaction.TransactionType transactionType, com.discover.mpos.sdk.core.data.Amount amount2, com.discover.mpos.sdk.card.connectors.ConnectorType connectorType, java.util.Date date, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(amount, (i & 2) != 0 ? java.util.Currency.getInstance(java.util.Locale.getDefault()) : currency, (i & 4) != 0 ? com.discover.mpos.sdk.transaction.TransactionType.PURCHASE : transactionType, (i & 8) != 0 ? null : amount2, (i & 16) != 0 ? com.discover.mpos.sdk.card.connectors.ConnectorType.NFC : connectorType, (i & 32) != 0 ? new java.util.Date() : date);
    }

    public final java.util.Currency getCurrency() {
        return this.currency;
    }

    public final com.discover.mpos.sdk.transaction.TransactionType getType() {
        return this.type;
    }

    public final com.discover.mpos.sdk.core.data.Amount getCashbackAmount() {
        return this.cashbackAmount;
    }

    public final com.discover.mpos.sdk.card.connectors.ConnectorType getConnectorType() {
        return this.connectorType;
    }

    public final java.util.Date getTransactionDate() {
        return this.transactionDate;
    }

    public final byte[] getEmvAmountAuthorized$mpos_sdk_card_reader_offlineRegularRelease() {
        return this.amountAuthorized.getEmvFormattedAmount(this.currency);
    }

    public final byte[] getEmvCashbackAuthorized$mpos_sdk_card_reader_offlineRegularRelease() {
        com.discover.mpos.sdk.core.data.Amount amount = this.cashbackAmount;
        if (amount == null) {
            amount = new com.discover.mpos.sdk.core.data.Amount(0.0d, (java.util.Currency) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return amount.getEmvFormattedAmount(this.currency);
    }

    public final java.lang.String toString() {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        return java.lang.String.format("{\namount: %s,\namount: %s,\nconnector type: %s,\ncurrency: %s,\ntransaction date: %s,\ntype: %s\n}", java.util.Arrays.copyOf(new java.lang.Object[]{this.amountAuthorized, this.cashbackAmount, this.connectorType, this.currency, this.transactionDate, this.type}, 6));
    }

    public final int hashCode() {
        com.discover.mpos.sdk.core.data.Amount amount = this.amountAuthorized;
        int hashCode = amount != null ? amount.hashCode() : 0;
        java.util.Currency currency = this.currency;
        int hashCode2 = currency != null ? currency.hashCode() : 0;
        com.discover.mpos.sdk.transaction.TransactionType transactionType = this.type;
        int hashCode3 = transactionType != null ? transactionType.hashCode() : 0;
        com.discover.mpos.sdk.core.data.Amount amount2 = this.cashbackAmount;
        int hashCode4 = amount2 != null ? amount2.hashCode() : 0;
        com.discover.mpos.sdk.card.connectors.ConnectorType connectorType = this.connectorType;
        int hashCode5 = connectorType != null ? connectorType.hashCode() : 0;
        java.util.Date date = this.transactionDate;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (date != null ? date.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.transaction.TransactionData)) {
            return false;
        }
        com.discover.mpos.sdk.transaction.TransactionData transactionData = (com.discover.mpos.sdk.transaction.TransactionData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amountAuthorized, transactionData.amountAuthorized) && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, transactionData.currency) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, transactionData.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.cashbackAmount, transactionData.cashbackAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.connectorType, transactionData.connectorType) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionDate, transactionData.transactionDate);
    }

    public final com.discover.mpos.sdk.transaction.TransactionData copy(com.discover.mpos.sdk.core.data.Amount amountAuthorized, java.util.Currency currency, com.discover.mpos.sdk.transaction.TransactionType type, com.discover.mpos.sdk.core.data.Amount cashbackAmount, com.discover.mpos.sdk.card.connectors.ConnectorType connectorType, java.util.Date transactionDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountAuthorized, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectorType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDate, "");
        return new com.discover.mpos.sdk.transaction.TransactionData(amountAuthorized, currency, type, cashbackAmount, connectorType, transactionDate);
    }

    /* renamed from: component6, reason: from getter */
    public final java.util.Date getTransactionDate() {
        return this.transactionDate;
    }

    /* renamed from: component5, reason: from getter */
    public final com.discover.mpos.sdk.card.connectors.ConnectorType getConnectorType() {
        return this.connectorType;
    }

    /* renamed from: component4, reason: from getter */
    public final com.discover.mpos.sdk.core.data.Amount getCashbackAmount() {
        return this.cashbackAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final com.discover.mpos.sdk.transaction.TransactionType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final java.util.Currency getCurrency() {
        return this.currency;
    }

    /* renamed from: component1, reason: from getter */
    public final com.discover.mpos.sdk.core.data.Amount getAmountAuthorized() {
        return this.amountAuthorized;
    }

    public static /* synthetic */ com.discover.mpos.sdk.transaction.TransactionData copy$default(com.discover.mpos.sdk.transaction.TransactionData transactionData, com.discover.mpos.sdk.core.data.Amount amount, java.util.Currency currency, com.discover.mpos.sdk.transaction.TransactionType transactionType, com.discover.mpos.sdk.core.data.Amount amount2, com.discover.mpos.sdk.card.connectors.ConnectorType connectorType, java.util.Date date, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            amount = transactionData.amountAuthorized;
        }
        if ((i & 2) != 0) {
            currency = transactionData.currency;
        }
        java.util.Currency currency2 = currency;
        if ((i & 4) != 0) {
            transactionType = transactionData.type;
        }
        com.discover.mpos.sdk.transaction.TransactionType transactionType2 = transactionType;
        if ((i & 8) != 0) {
            amount2 = transactionData.cashbackAmount;
        }
        com.discover.mpos.sdk.core.data.Amount amount3 = amount2;
        if ((i & 16) != 0) {
            connectorType = transactionData.connectorType;
        }
        com.discover.mpos.sdk.card.connectors.ConnectorType connectorType2 = connectorType;
        if ((i & 32) != 0) {
            date = transactionData.transactionDate;
        }
        return transactionData.copy(amount, currency2, transactionType2, amount3, connectorType2, date);
    }
}
