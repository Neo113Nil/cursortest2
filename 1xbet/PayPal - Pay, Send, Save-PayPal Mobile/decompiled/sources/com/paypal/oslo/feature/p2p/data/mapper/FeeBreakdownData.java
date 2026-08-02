package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/FeeBreakdownData;", "", "Lcom/paypal/oslo/feature/p2p/data/mapper/AmountData;", "instrumentFees", "crossBorderFees", "<init>", "(Lcom/paypal/oslo/feature/p2p/data/mapper/AmountData;Lcom/paypal/oslo/feature/p2p/data/mapper/AmountData;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/data/mapper/AmountData;", "component2", "copy", "(Lcom/paypal/oslo/feature/p2p/data/mapper/AmountData;Lcom/paypal/oslo/feature/p2p/data/mapper/AmountData;)Lcom/paypal/oslo/feature/p2p/data/mapper/FeeBreakdownData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/data/mapper/AmountData;", "getInstrumentFees", "getCrossBorderFees"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FeeBreakdownData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.p2p.data.mapper.AmountData crossBorderFees;
    private final com.paypal.oslo.feature.p2p.data.mapper.AmountData instrumentFees;

    public FeeBreakdownData(com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData, com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData2) {
        this.instrumentFees = amountData;
        this.crossBorderFees = amountData2;
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.AmountData getInstrumentFees() {
        return this.instrumentFees;
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.AmountData getCrossBorderFees() {
        return this.crossBorderFees;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData = this.instrumentFees;
        com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData2 = this.crossBorderFees;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FeeBreakdownData(instrumentFees=");
        sb.append(amountData);
        sb.append(", crossBorderFees=");
        sb.append(amountData2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData = this.instrumentFees;
        int hashCode = amountData == null ? 0 : amountData.hashCode();
        com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData2 = this.crossBorderFees;
        return (hashCode * 31) + (amountData2 != null ? amountData2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData feeBreakdownData = (com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentFees, feeBreakdownData.instrumentFees) && kotlin.jvm.internal.Intrinsics.areEqual(this.crossBorderFees, feeBreakdownData.crossBorderFees);
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData copy(com.paypal.oslo.feature.p2p.data.mapper.AmountData instrumentFees, com.paypal.oslo.feature.p2p.data.mapper.AmountData crossBorderFees) {
        return new com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData(instrumentFees, crossBorderFees);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.data.mapper.AmountData getCrossBorderFees() {
        return this.crossBorderFees;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.p2p.data.mapper.AmountData getInstrumentFees() {
        return this.instrumentFees;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData copy$default(com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData feeBreakdownData, com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData, com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            amountData = feeBreakdownData.instrumentFees;
        }
        if ((i & 2) != 0) {
            amountData2 = feeBreakdownData.crossBorderFees;
        }
        return feeBreakdownData.copy(amountData, amountData2);
    }
}
