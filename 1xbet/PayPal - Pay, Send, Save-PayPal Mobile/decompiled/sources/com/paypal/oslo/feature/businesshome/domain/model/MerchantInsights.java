package com.paypal.oslo.feature.businesshome.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsights;", "", "Lcom/paypal/oslo/feature/businesshome/domain/model/TransactionMetrics;", "transactionMetrics", "Lcom/paypal/oslo/feature/businesshome/domain/model/DisputeMetrics;", "disputeMetrics", "<init>", "(Lcom/paypal/oslo/feature/businesshome/domain/model/TransactionMetrics;Lcom/paypal/oslo/feature/businesshome/domain/model/DisputeMetrics;)V", "component1", "()Lcom/paypal/oslo/feature/businesshome/domain/model/TransactionMetrics;", "component2", "()Lcom/paypal/oslo/feature/businesshome/domain/model/DisputeMetrics;", "copy", "(Lcom/paypal/oslo/feature/businesshome/domain/model/TransactionMetrics;Lcom/paypal/oslo/feature/businesshome/domain/model/DisputeMetrics;)Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsights;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businesshome/domain/model/TransactionMetrics;", "getTransactionMetrics", "Lcom/paypal/oslo/feature/businesshome/domain/model/DisputeMetrics;", "getDisputeMetrics"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MerchantInsights {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.businesshome.domain.model.DisputeMetrics disputeMetrics;
    private final com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics transactionMetrics;

    public MerchantInsights(com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics transactionMetrics, com.paypal.oslo.feature.businesshome.domain.model.DisputeMetrics disputeMetrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionMetrics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disputeMetrics, "");
        this.transactionMetrics = transactionMetrics;
        this.disputeMetrics = disputeMetrics;
    }

    public final com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics getTransactionMetrics() {
        return this.transactionMetrics;
    }

    public final com.paypal.oslo.feature.businesshome.domain.model.DisputeMetrics getDisputeMetrics() {
        return this.disputeMetrics;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics transactionMetrics = this.transactionMetrics;
        com.paypal.oslo.feature.businesshome.domain.model.DisputeMetrics disputeMetrics = this.disputeMetrics;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MerchantInsights(transactionMetrics=");
        sb.append(transactionMetrics);
        sb.append(", disputeMetrics=");
        sb.append(disputeMetrics);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.transactionMetrics.hashCode() * 31) + this.disputeMetrics.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights)) {
            return false;
        }
        com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights merchantInsights = (com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionMetrics, merchantInsights.transactionMetrics) && kotlin.jvm.internal.Intrinsics.areEqual(this.disputeMetrics, merchantInsights.disputeMetrics);
    }

    public final com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights copy(com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics transactionMetrics, com.paypal.oslo.feature.businesshome.domain.model.DisputeMetrics disputeMetrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionMetrics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disputeMetrics, "");
        return new com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights(transactionMetrics, disputeMetrics);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.businesshome.domain.model.DisputeMetrics getDisputeMetrics() {
        return this.disputeMetrics;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics getTransactionMetrics() {
        return this.transactionMetrics;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights copy$default(com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights merchantInsights, com.paypal.oslo.feature.businesshome.domain.model.TransactionMetrics transactionMetrics, com.paypal.oslo.feature.businesshome.domain.model.DisputeMetrics disputeMetrics, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            transactionMetrics = merchantInsights.transactionMetrics;
        }
        if ((i & 2) != 0) {
            disputeMetrics = merchantInsights.disputeMetrics;
        }
        return merchantInsights.copy(transactionMetrics, disputeMetrics);
    }
}
