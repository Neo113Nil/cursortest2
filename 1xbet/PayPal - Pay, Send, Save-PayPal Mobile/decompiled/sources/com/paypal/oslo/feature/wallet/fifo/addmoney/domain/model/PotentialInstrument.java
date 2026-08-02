package com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/PotentialInstrument;", "", "", "instrumentId", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "transferSpeed", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "instrumentType", "displayName", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "component3", "()Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/PotentialInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInstrumentId", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "getTransferSpeed", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "getInstrumentType", "getDisplayName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PotentialInstrument {
    public static final int $stable = 0;
    private final java.lang.String displayName;
    private final java.lang.String instrumentId;
    private final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType instrumentType;
    private final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed;

    public PotentialInstrument(java.lang.String str, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferSpeed, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.instrumentId = str;
        this.transferSpeed = transferSpeed;
        this.instrumentType = fundingInstrumentType;
        this.displayName = str2;
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed getTransferSpeed() {
        return this.transferSpeed;
    }

    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.instrumentId;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed = this.transferSpeed;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType = this.instrumentType;
        java.lang.String str2 = this.displayName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PotentialInstrument(instrumentId=");
        sb.append(str);
        sb.append(", transferSpeed=");
        sb.append(transferSpeed);
        sb.append(", instrumentType=");
        sb.append(fundingInstrumentType);
        sb.append(", displayName=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.instrumentId.hashCode() * 31) + this.transferSpeed.hashCode()) * 31) + this.instrumentType.hashCode()) * 31) + this.displayName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.PotentialInstrument)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.PotentialInstrument potentialInstrument = (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.PotentialInstrument) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, potentialInstrument.instrumentId) && this.transferSpeed == potentialInstrument.transferSpeed && this.instrumentType == potentialInstrument.instrumentType && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, potentialInstrument.displayName);
    }

    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.PotentialInstrument copy(java.lang.String instrumentId, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType instrumentType, java.lang.String displayName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferSpeed, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.PotentialInstrument(instrumentId, transferSpeed, instrumentType, displayName);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed getTransferSpeed() {
        return this.transferSpeed;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.PotentialInstrument copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.PotentialInstrument potentialInstrument, java.lang.String str, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = potentialInstrument.instrumentId;
        }
        if ((i & 2) != 0) {
            transferSpeed = potentialInstrument.transferSpeed;
        }
        if ((i & 4) != 0) {
            fundingInstrumentType = potentialInstrument.instrumentType;
        }
        if ((i & 8) != 0) {
            str2 = potentialInstrument.displayName;
        }
        return potentialInstrument.copy(str, transferSpeed, fundingInstrumentType, str2);
    }
}
