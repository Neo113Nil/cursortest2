package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJJ\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001f\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/FeeRate;", "", "", "percentFee", "", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "fixedFees", "minimumFees", "maximumFees", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/FeeRate;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPercentFee", "Ljava/util/List;", "getFixedFees", "getMinimumFees", "getMaximumFees"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FeeRate {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> fixedFees;
    private final java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> maximumFees;
    private final java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> minimumFees;
    private final java.lang.String percentFee;

    public FeeRate(java.lang.String str, java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> list, java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> list2, java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> list3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.percentFee = str;
        this.fixedFees = list;
        this.minimumFees = list2;
        this.maximumFees = list3;
    }

    public final java.lang.String getPercentFee() {
        return this.percentFee;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> getFixedFees() {
        return this.fixedFees;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> getMinimumFees() {
        return this.minimumFees;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> getMaximumFees() {
        return this.maximumFees;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.percentFee;
        java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> list = this.fixedFees;
        java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> list2 = this.minimumFees;
        java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> list3 = this.maximumFees;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FeeRate(percentFee=");
        sb.append(str);
        sb.append(", fixedFees=");
        sb.append(list);
        sb.append(", minimumFees=");
        sb.append(list2);
        sb.append(", maximumFees=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.percentFee.hashCode() * 31) + this.fixedFees.hashCode()) * 31) + this.minimumFees.hashCode()) * 31) + this.maximumFees.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FeeRate)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FeeRate feeRate = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FeeRate) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.percentFee, feeRate.percentFee) && kotlin.jvm.internal.Intrinsics.areEqual(this.fixedFees, feeRate.fixedFees) && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumFees, feeRate.minimumFees) && kotlin.jvm.internal.Intrinsics.areEqual(this.maximumFees, feeRate.maximumFees);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FeeRate copy(java.lang.String percentFee, java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> fixedFees, java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> minimumFees, java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> maximumFees) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percentFee, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fixedFees, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minimumFees, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maximumFees, "");
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FeeRate(percentFee, fixedFees, minimumFees, maximumFees);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> component4() {
        return this.maximumFees;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> component3() {
        return this.minimumFees;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.common.domain.model.Money> component2() {
        return this.fixedFees;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPercentFee() {
        return this.percentFee;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FeeRate copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FeeRate feeRate, java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = feeRate.percentFee;
        }
        if ((i & 2) != 0) {
            list = feeRate.fixedFees;
        }
        if ((i & 4) != 0) {
            list2 = feeRate.minimumFees;
        }
        if ((i & 8) != 0) {
            list3 = feeRate.maximumFees;
        }
        return feeRate.copy(str, list, list2, list3);
    }
}
