package com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositFulfillmentRequest;", "", "", "depositOptionId", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FlowIdentifier;", "identifier", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "depositAmount", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;", "depositType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FlowIdentifier;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FlowIdentifier;", "component3", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "component4", "()Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FlowIdentifier;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositFulfillmentRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDepositOptionId", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FlowIdentifier;", "getIdentifier", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getDepositAmount", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;", "getDepositType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DepositFulfillmentRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money depositAmount;
    private final java.lang.String depositOptionId;
    private final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType;
    private final com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier identifier;

    public DepositFulfillmentRequest(java.lang.String str, com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier flowIdentifier, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        this.depositOptionId = str;
        this.identifier = flowIdentifier;
        this.depositAmount = money;
        this.depositType = depositType;
    }

    public /* synthetic */ DepositFulfillmentRequest(java.lang.String str, com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier flowIdentifier, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, flowIdentifier, money, (i & 8) != 0 ? null : depositType);
    }

    public final java.lang.String getDepositOptionId() {
        return this.depositOptionId;
    }

    public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier getIdentifier() {
        return this.identifier;
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getDepositAmount() {
        return this.depositAmount;
    }

    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType getDepositType() {
        return this.depositType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.depositOptionId;
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier flowIdentifier = this.identifier;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.depositAmount;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType = this.depositType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DepositFulfillmentRequest(depositOptionId=");
        sb.append(str);
        sb.append(", identifier=");
        sb.append(flowIdentifier);
        sb.append(", depositAmount=");
        sb.append(money);
        sb.append(", depositType=");
        sb.append(depositType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.depositOptionId.hashCode();
        int hashCode2 = this.identifier.hashCode();
        int hashCode3 = this.depositAmount.hashCode();
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType = this.depositType;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (depositType == null ? 0 : depositType.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentRequest)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentRequest depositFulfillmentRequest = (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.depositOptionId, depositFulfillmentRequest.depositOptionId) && this.identifier == depositFulfillmentRequest.identifier && kotlin.jvm.internal.Intrinsics.areEqual(this.depositAmount, depositFulfillmentRequest.depositAmount) && this.depositType == depositFulfillmentRequest.depositType;
    }

    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentRequest copy(java.lang.String depositOptionId, com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier identifier, com.paypal.oslo.feature.wallet.common.domain.model.Money depositAmount, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositOptionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositAmount, "");
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentRequest(depositOptionId, identifier, depositAmount, depositType);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType getDepositType() {
        return this.depositType;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getDepositAmount() {
        return this.depositAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDepositOptionId() {
        return this.depositOptionId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentRequest copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFulfillmentRequest depositFulfillmentRequest, java.lang.String str, com.paypal.oslo.feature.wallet.fifo.common.domain.model.FlowIdentifier flowIdentifier, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = depositFulfillmentRequest.depositOptionId;
        }
        if ((i & 2) != 0) {
            flowIdentifier = depositFulfillmentRequest.identifier;
        }
        if ((i & 4) != 0) {
            money = depositFulfillmentRequest.depositAmount;
        }
        if ((i & 8) != 0) {
            depositType = depositFulfillmentRequest.depositType;
        }
        return depositFulfillmentRequest.copy(str, flowIdentifier, money, depositType);
    }
}
