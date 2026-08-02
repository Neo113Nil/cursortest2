package com.payair.listener.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013"}, d2 = {"Lcom/payair/listener/model/TransactionEventData;", "", "", "transactionAccepted", "", "amount", "Ljava/util/Currency;", "currency", "Lcom/payair/listener/model/TransactionStatus;", "transactionStatus", "<init>", "(ZLjava/lang/Long;Ljava/util/Currency;Lcom/payair/listener/model/TransactionStatus;)V", "component1", "()Z", "component2", "()Ljava/lang/Long;", "component3", "()Ljava/util/Currency;", "component4", "()Lcom/payair/listener/model/TransactionStatus;", "copy", "(ZLjava/lang/Long;Ljava/util/Currency;Lcom/payair/listener/model/TransactionStatus;)Lcom/payair/listener/model/TransactionEventData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getTransactionAccepted", util.h.xy.cb.b.f1091, "Ljava/lang/Long;", "getAmount", "c", "Ljava/util/Currency;", "getCurrency", "d", "Lcom/payair/listener/model/TransactionStatus;", "getTransactionStatus"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TransactionEventData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean transactionAccepted;

    /* renamed from: b, reason: from kotlin metadata */
    public final java.lang.Long amount;

    /* renamed from: c, reason: from kotlin metadata */
    public final java.util.Currency currency;

    /* renamed from: d, reason: from kotlin metadata */
    public final com.payair.listener.model.TransactionStatus transactionStatus;

    public TransactionEventData(boolean z, java.lang.Long l, java.util.Currency currency, com.payair.listener.model.TransactionStatus transactionStatus) {
        this.transactionAccepted = z;
        this.amount = l;
        this.currency = currency;
        this.transactionStatus = transactionStatus;
    }

    public final java.lang.Long getAmount() {
        return this.amount;
    }

    public final java.util.Currency getCurrency() {
        return this.currency;
    }

    public final boolean getTransactionAccepted() {
        return this.transactionAccepted;
    }

    public final com.payair.listener.model.TransactionStatus getTransactionStatus() {
        return this.transactionStatus;
    }

    public /* synthetic */ TransactionEventData(boolean z, java.lang.Long l, java.util.Currency currency, com.payair.listener.model.TransactionStatus transactionStatus, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : currency, (i & 8) != 0 ? null : transactionStatus);
    }

    public final java.lang.String toString() {
        boolean z = this.transactionAccepted;
        java.lang.Long l = this.amount;
        java.util.Currency currency = this.currency;
        com.payair.listener.model.TransactionStatus transactionStatus = this.transactionStatus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionEventData(transactionAccepted=");
        sb.append(z);
        sb.append(", amount=");
        sb.append(l);
        sb.append(", currency=");
        sb.append(currency);
        sb.append(", transactionStatus=");
        sb.append(transactionStatus);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.transactionAccepted);
        java.lang.Long l = this.amount;
        int hashCode2 = l == null ? 0 : l.hashCode();
        java.util.Currency currency = this.currency;
        int hashCode3 = currency == null ? 0 : currency.hashCode();
        com.payair.listener.model.TransactionStatus transactionStatus = this.transactionStatus;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (transactionStatus != null ? transactionStatus.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.listener.model.TransactionEventData)) {
            return false;
        }
        com.payair.listener.model.TransactionEventData transactionEventData = (com.payair.listener.model.TransactionEventData) other;
        return this.transactionAccepted == transactionEventData.transactionAccepted && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, transactionEventData.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, transactionEventData.currency) && this.transactionStatus == transactionEventData.transactionStatus;
    }

    public final com.payair.listener.model.TransactionEventData copy(boolean transactionAccepted, java.lang.Long amount, java.util.Currency currency, com.payair.listener.model.TransactionStatus transactionStatus) {
        return new com.payair.listener.model.TransactionEventData(transactionAccepted, amount, currency, transactionStatus);
    }

    /* renamed from: component4, reason: from getter */
    public final com.payair.listener.model.TransactionStatus getTransactionStatus() {
        return this.transactionStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final java.util.Currency getCurrency() {
        return this.currency;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getTransactionAccepted() {
        return this.transactionAccepted;
    }

    public static /* synthetic */ com.payair.listener.model.TransactionEventData copy$default(com.payair.listener.model.TransactionEventData transactionEventData, boolean z, java.lang.Long l, java.util.Currency currency, com.payair.listener.model.TransactionStatus transactionStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = transactionEventData.transactionAccepted;
        }
        if ((i & 2) != 0) {
            l = transactionEventData.amount;
        }
        if ((i & 4) != 0) {
            currency = transactionEventData.currency;
        }
        if ((i & 8) != 0) {
            transactionStatus = transactionEventData.transactionStatus;
        }
        return transactionEventData.copy(z, l, currency, transactionStatus);
    }
}
