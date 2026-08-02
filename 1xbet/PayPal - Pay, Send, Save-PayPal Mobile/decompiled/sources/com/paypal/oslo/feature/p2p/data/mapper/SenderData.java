package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/SenderData;", "", "Lcom/paypal/oslo/feature/p2p/data/mapper/AmountData;", "amountSent", "totalFee", "Lcom/paypal/oslo/feature/p2p/data/mapper/FeeBreakdownData;", "feeBreakdown", "totalAmountSent", "<init>", "(Lcom/paypal/oslo/feature/p2p/data/mapper/AmountData;Lcom/paypal/oslo/feature/p2p/data/mapper/AmountData;Lcom/paypal/oslo/feature/p2p/data/mapper/FeeBreakdownData;Lcom/paypal/oslo/feature/p2p/data/mapper/AmountData;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/data/mapper/AmountData;", "component2", "component3", "()Lcom/paypal/oslo/feature/p2p/data/mapper/FeeBreakdownData;", "component4", "copy", "(Lcom/paypal/oslo/feature/p2p/data/mapper/AmountData;Lcom/paypal/oslo/feature/p2p/data/mapper/AmountData;Lcom/paypal/oslo/feature/p2p/data/mapper/FeeBreakdownData;Lcom/paypal/oslo/feature/p2p/data/mapper/AmountData;)Lcom/paypal/oslo/feature/p2p/data/mapper/SenderData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/data/mapper/AmountData;", "getAmountSent", "getTotalFee", "Lcom/paypal/oslo/feature/p2p/data/mapper/FeeBreakdownData;", "getFeeBreakdown", "getTotalAmountSent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SenderData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.p2p.data.mapper.AmountData amountSent;
    private final com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData feeBreakdown;
    private final com.paypal.oslo.feature.p2p.data.mapper.AmountData totalAmountSent;
    private final com.paypal.oslo.feature.p2p.data.mapper.AmountData totalFee;

    public SenderData(com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData, com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData2, com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData feeBreakdownData, com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountData2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountData3, "");
        this.amountSent = amountData;
        this.totalFee = amountData2;
        this.feeBreakdown = feeBreakdownData;
        this.totalAmountSent = amountData3;
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.AmountData getAmountSent() {
        return this.amountSent;
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.AmountData getTotalFee() {
        return this.totalFee;
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData getFeeBreakdown() {
        return this.feeBreakdown;
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.AmountData getTotalAmountSent() {
        return this.totalAmountSent;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData = this.amountSent;
        com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData2 = this.totalFee;
        com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData feeBreakdownData = this.feeBreakdown;
        com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData3 = this.totalAmountSent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SenderData(amountSent=");
        sb.append(amountData);
        sb.append(", totalFee=");
        sb.append(amountData2);
        sb.append(", feeBreakdown=");
        sb.append(feeBreakdownData);
        sb.append(", totalAmountSent=");
        sb.append(amountData3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.amountSent.hashCode();
        int hashCode2 = this.totalFee.hashCode();
        com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData feeBreakdownData = this.feeBreakdown;
        return (((((hashCode * 31) + hashCode2) * 31) + (feeBreakdownData == null ? 0 : feeBreakdownData.hashCode())) * 31) + this.totalAmountSent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.data.mapper.SenderData)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.data.mapper.SenderData senderData = (com.paypal.oslo.feature.p2p.data.mapper.SenderData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amountSent, senderData.amountSent) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalFee, senderData.totalFee) && kotlin.jvm.internal.Intrinsics.areEqual(this.feeBreakdown, senderData.feeBreakdown) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmountSent, senderData.totalAmountSent);
    }

    public final com.paypal.oslo.feature.p2p.data.mapper.SenderData copy(com.paypal.oslo.feature.p2p.data.mapper.AmountData amountSent, com.paypal.oslo.feature.p2p.data.mapper.AmountData totalFee, com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData feeBreakdown, com.paypal.oslo.feature.p2p.data.mapper.AmountData totalAmountSent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountSent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalFee, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmountSent, "");
        return new com.paypal.oslo.feature.p2p.data.mapper.SenderData(amountSent, totalFee, feeBreakdown, totalAmountSent);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.p2p.data.mapper.AmountData getTotalAmountSent() {
        return this.totalAmountSent;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData getFeeBreakdown() {
        return this.feeBreakdown;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.data.mapper.AmountData getTotalFee() {
        return this.totalFee;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.p2p.data.mapper.AmountData getAmountSent() {
        return this.amountSent;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.data.mapper.SenderData copy$default(com.paypal.oslo.feature.p2p.data.mapper.SenderData senderData, com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData, com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData2, com.paypal.oslo.feature.p2p.data.mapper.FeeBreakdownData feeBreakdownData, com.paypal.oslo.feature.p2p.data.mapper.AmountData amountData3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            amountData = senderData.amountSent;
        }
        if ((i & 2) != 0) {
            amountData2 = senderData.totalFee;
        }
        if ((i & 4) != 0) {
            feeBreakdownData = senderData.feeBreakdown;
        }
        if ((i & 8) != 0) {
            amountData3 = senderData.totalAmountSent;
        }
        return senderData.copy(amountData, amountData2, feeBreakdownData, amountData3);
    }
}
