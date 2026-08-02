package com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJj\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b\u0005\u0010\u0015R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0019R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b.\u0010\u0017R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b/\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositOption;", "", "", "planId", "", "isDefault", "", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositFundingSource;", "fundingSources", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "transferSpeed", "tags", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositLimit;", "limits", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "fee", "<init>", "(Ljava/lang/String;ZLjava/util/List;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "copy", "(Ljava/lang/String;ZLjava/util/List;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositOption;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPlanId", "Z", "Ljava/util/List;", "getFundingSources", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "getTransferSpeed", "getTags", "getLimits", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getFee"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DepositOption {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money fee;
    private final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFundingSource> fundingSources;
    private final boolean isDefault;
    private final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositLimit> limits;
    private final java.lang.String planId;
    private final java.util.List<java.lang.String> tags;
    private final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed;

    public DepositOption(java.lang.String str, boolean z, java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFundingSource> list, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed, java.util.List<java.lang.String> list2, java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositLimit> list3, com.paypal.oslo.feature.wallet.common.domain.model.Money money) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferSpeed, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.planId = str;
        this.isDefault = z;
        this.fundingSources = list;
        this.transferSpeed = transferSpeed;
        this.tags = list2;
        this.limits = list3;
        this.fee = money;
    }

    public /* synthetic */ DepositOption(java.lang.String str, boolean z, java.util.List list, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed, java.util.List list2, java.util.List list3, com.paypal.oslo.feature.wallet.common.domain.model.Money money, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, list, transferSpeed, list2, list3, (i & 64) != 0 ? null : money);
    }

    public final java.lang.String getPlanId() {
        return this.planId;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFundingSource> getFundingSources() {
        return this.fundingSources;
    }

    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed getTransferSpeed() {
        return this.transferSpeed;
    }

    public final java.util.List<java.lang.String> getTags() {
        return this.tags;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositLimit> getLimits() {
        return this.limits;
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getFee() {
        return this.fee;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.planId;
        boolean z = this.isDefault;
        java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFundingSource> list = this.fundingSources;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed = this.transferSpeed;
        java.util.List<java.lang.String> list2 = this.tags;
        java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositLimit> list3 = this.limits;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.fee;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DepositOption(planId=");
        sb.append(str);
        sb.append(", isDefault=");
        sb.append(z);
        sb.append(", fundingSources=");
        sb.append(list);
        sb.append(", transferSpeed=");
        sb.append(transferSpeed);
        sb.append(", tags=");
        sb.append(list2);
        sb.append(", limits=");
        sb.append(list3);
        sb.append(", fee=");
        sb.append(money);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.planId.hashCode();
        int hashCode2 = java.lang.Boolean.hashCode(this.isDefault);
        int hashCode3 = this.fundingSources.hashCode();
        int hashCode4 = this.transferSpeed.hashCode();
        int hashCode5 = this.tags.hashCode();
        int hashCode6 = this.limits.hashCode();
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.fee;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (money == null ? 0 : money.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption depositOption = (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.planId, depositOption.planId) && this.isDefault == depositOption.isDefault && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSources, depositOption.fundingSources) && this.transferSpeed == depositOption.transferSpeed && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, depositOption.tags) && kotlin.jvm.internal.Intrinsics.areEqual(this.limits, depositOption.limits) && kotlin.jvm.internal.Intrinsics.areEqual(this.fee, depositOption.fee);
    }

    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption copy(java.lang.String planId, boolean isDefault, java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFundingSource> fundingSources, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed, java.util.List<java.lang.String> tags, java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositLimit> limits, com.paypal.oslo.feature.wallet.common.domain.model.Money fee) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSources, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferSpeed, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limits, "");
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption(planId, isDefault, fundingSources, transferSpeed, tags, limits, fee);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getFee() {
        return this.fee;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositLimit> component6() {
        return this.limits;
    }

    public final java.util.List<java.lang.String> component5() {
        return this.tags;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed getTransferSpeed() {
        return this.transferSpeed;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositFundingSource> component3() {
        return this.fundingSources;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPlanId() {
        return this.planId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption depositOption, java.lang.String str, boolean z, java.util.List list, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed, java.util.List list2, java.util.List list3, com.paypal.oslo.feature.wallet.common.domain.model.Money money, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = depositOption.planId;
        }
        if ((i & 2) != 0) {
            z = depositOption.isDefault;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            list = depositOption.fundingSources;
        }
        java.util.List list4 = list;
        if ((i & 8) != 0) {
            transferSpeed = depositOption.transferSpeed;
        }
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed2 = transferSpeed;
        if ((i & 16) != 0) {
            list2 = depositOption.tags;
        }
        java.util.List list5 = list2;
        if ((i & 32) != 0) {
            list3 = depositOption.limits;
        }
        java.util.List list6 = list3;
        if ((i & 64) != 0) {
            money = depositOption.fee;
        }
        return depositOption.copy(str, z2, list4, transferSpeed2, list5, list6, money);
    }
}
