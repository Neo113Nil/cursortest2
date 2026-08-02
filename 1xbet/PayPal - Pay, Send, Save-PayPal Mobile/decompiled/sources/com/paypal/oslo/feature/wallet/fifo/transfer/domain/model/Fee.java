package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/Fee;", "", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/FeeRate;", "feeRate", "", "rateType", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/FeeRate;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/FeeRate;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/FeeRate;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/Fee;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/FeeRate;", "getFeeRate", "Ljava/lang/String;", "getRateType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Fee {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FeeRate feeRate;
    private final java.lang.String rateType;

    public Fee(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FeeRate feeRate, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feeRate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.feeRate = feeRate;
        this.rateType = str;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FeeRate getFeeRate() {
        return this.feeRate;
    }

    public final java.lang.String getRateType() {
        return this.rateType;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FeeRate feeRate = this.feeRate;
        java.lang.String str = this.rateType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Fee(feeRate=");
        sb.append(feeRate);
        sb.append(", rateType=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.feeRate.hashCode() * 31) + this.rateType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.Fee)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.Fee fee = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.Fee) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.feeRate, fee.feeRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.rateType, fee.rateType);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.Fee copy(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FeeRate feeRate, java.lang.String rateType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feeRate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rateType, "");
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.Fee(feeRate, rateType);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRateType() {
        return this.rateType;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FeeRate getFeeRate() {
        return this.feeRate;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.Fee copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.Fee fee, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FeeRate feeRate, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            feeRate = fee.feeRate;
        }
        if ((i & 2) != 0) {
            str = fee.rateType;
        }
        return fee.copy(feeRate, str);
    }
}
