package com.paypal.oslo.feature.businesshome.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/model/TransactionMetrics;", "", "", "total", "Lcom/paypal/oslo/feature/businesshome/domain/model/PendingPaymentMetrics;", "receivable", "payable", "<init>", "(ILcom/paypal/oslo/feature/businesshome/domain/model/PendingPaymentMetrics;Lcom/paypal/oslo/feature/businesshome/domain/model/PendingPaymentMetrics;)V", "component1", "()I", "component2", "()Lcom/paypal/oslo/feature/businesshome/domain/model/PendingPaymentMetrics;", "component3", "copy", "(ILcom/paypal/oslo/feature/businesshome/domain/model/PendingPaymentMetrics;Lcom/paypal/oslo/feature/businesshome/domain/model/PendingPaymentMetrics;)Lcom/paypal/oslo/feature/businesshome/domain/model/TransactionMetrics;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTotal", "Lcom/paypal/oslo/feature/businesshome/domain/model/PendingPaymentMetrics;", "getReceivable", "getPayable"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TransactionMetrics {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics payable;
    private final com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics receivable;
    private final int total;

    public TransactionMetrics(int i, com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics pendingPaymentMetrics, com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics pendingPaymentMetrics2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingPaymentMetrics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pendingPaymentMetrics2, "");
        this.total = i;
        this.receivable = pendingPaymentMetrics;
        this.payable = pendingPaymentMetrics2;
    }

    public final int getTotal() {
        return this.total;
    }

    public final com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics getReceivable() {
        return this.receivable;
    }

    public final com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics getPayable() {
        return this.payable;
    }

    public final java.lang.String toString() {
        int i = this.total;
        com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics pendingPaymentMetrics = this.receivable;
        com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics pendingPaymentMetrics2 = this.payable;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionMetrics(total=");
        sb.append(i);
        sb.append(", receivable=");
        sb.append(pendingPaymentMetrics);
        sb.append(", payable=");
        sb.append(pendingPaymentMetrics2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.total) * 31) + this.receivable.hashCode()) * 31) + this.payable.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics)) {
            return false;
        }
        com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics transactionMetrics = (com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics) other;
        return this.total == transactionMetrics.total && kotlin.jvm.internal.Intrinsics.areEqual(this.receivable, transactionMetrics.receivable) && kotlin.jvm.internal.Intrinsics.areEqual(this.payable, transactionMetrics.payable);
    }

    public final com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics copy(int total, com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics receivable, com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics payable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receivable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payable, "");
        return new com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics(total, receivable, payable);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics getPayable() {
        return this.payable;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics getReceivable() {
        return this.receivable;
    }

    /* renamed from: component1, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics copy$default(com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics transactionMetrics, int i, com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics pendingPaymentMetrics, com.paypal.oslo.feature.businesshome.domain.model.PendingPaymentMetrics pendingPaymentMetrics2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = transactionMetrics.total;
        }
        if ((i2 & 2) != 0) {
            pendingPaymentMetrics = transactionMetrics.receivable;
        }
        if ((i2 & 4) != 0) {
            pendingPaymentMetrics2 = transactionMetrics.payable;
        }
        return transactionMetrics.copy(i, pendingPaymentMetrics, pendingPaymentMetrics2);
    }
}
