package com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J^\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b-\u0010\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u0010\u0019R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b0\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionCategories;", "", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "depositAmount", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;", "depositType", "", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositOption;", "options", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/PotentialInstrument;", "potentialInstruments", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "recommendedTransferSpeed", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositInstrument;", "ineligibleDepositInstruments", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "component2", "()Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "component6", "copy", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;Ljava/util/List;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/BalanceDepositSelectionCategories;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getDepositAmount", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/DepositType;", "getDepositType", "Ljava/util/List;", "getOptions", "getPotentialInstruments", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/domain/model/TransferSpeed;", "getRecommendedTransferSpeed", "getIneligibleDepositInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BalanceDepositSelectionCategories {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money depositAmount;
    private final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType;
    private final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositInstrument> ineligibleDepositInstruments;
    private final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption> options;
    private final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.PotentialInstrument> potentialInstruments;
    private final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed recommendedTransferSpeed;

    /* JADX WARN: Multi-variable type inference failed */
    public BalanceDepositSelectionCategories(com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType, java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption> list, java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.PotentialInstrument> list2, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed, java.util.List<? extends com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositInstrument> list3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferSpeed, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.depositAmount = money;
        this.depositType = depositType;
        this.options = list;
        this.potentialInstruments = list2;
        this.recommendedTransferSpeed = transferSpeed;
        this.ineligibleDepositInstruments = list3;
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getDepositAmount() {
        return this.depositAmount;
    }

    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType getDepositType() {
        return this.depositType;
    }

    public /* synthetic */ BalanceDepositSelectionCategories(com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType, java.util.List list, java.util.List list2, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed, java.util.List list3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(money, depositType, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, transferSpeed, (i & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption> getOptions() {
        return this.options;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.PotentialInstrument> getPotentialInstruments() {
        return this.potentialInstruments;
    }

    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed getRecommendedTransferSpeed() {
        return this.recommendedTransferSpeed;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositInstrument> getIneligibleDepositInstruments() {
        return this.ineligibleDepositInstruments;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.depositAmount;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType = this.depositType;
        java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption> list = this.options;
        java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.PotentialInstrument> list2 = this.potentialInstruments;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed = this.recommendedTransferSpeed;
        java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositInstrument> list3 = this.ineligibleDepositInstruments;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceDepositSelectionCategories(depositAmount=");
        sb.append(money);
        sb.append(", depositType=");
        sb.append(depositType);
        sb.append(", options=");
        sb.append(list);
        sb.append(", potentialInstruments=");
        sb.append(list2);
        sb.append(", recommendedTransferSpeed=");
        sb.append(transferSpeed);
        sb.append(", ineligibleDepositInstruments=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.depositAmount.hashCode() * 31) + this.depositType.hashCode()) * 31) + this.options.hashCode()) * 31) + this.potentialInstruments.hashCode()) * 31) + this.recommendedTransferSpeed.hashCode()) * 31) + this.ineligibleDepositInstruments.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionCategories)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionCategories balanceDepositSelectionCategories = (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionCategories) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.depositAmount, balanceDepositSelectionCategories.depositAmount) && this.depositType == balanceDepositSelectionCategories.depositType && kotlin.jvm.internal.Intrinsics.areEqual(this.options, balanceDepositSelectionCategories.options) && kotlin.jvm.internal.Intrinsics.areEqual(this.potentialInstruments, balanceDepositSelectionCategories.potentialInstruments) && this.recommendedTransferSpeed == balanceDepositSelectionCategories.recommendedTransferSpeed && kotlin.jvm.internal.Intrinsics.areEqual(this.ineligibleDepositInstruments, balanceDepositSelectionCategories.ineligibleDepositInstruments);
    }

    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionCategories copy(com.paypal.oslo.feature.wallet.common.domain.model.Money depositAmount, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType, java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption> options, java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.PotentialInstrument> potentialInstruments, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed recommendedTransferSpeed, java.util.List<? extends com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositInstrument> ineligibleDepositInstruments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(depositType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(potentialInstruments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recommendedTransferSpeed, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ineligibleDepositInstruments, "");
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionCategories(depositAmount, depositType, options, potentialInstruments, recommendedTransferSpeed, ineligibleDepositInstruments);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositInstrument> component6() {
        return this.ineligibleDepositInstruments;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed getRecommendedTransferSpeed() {
        return this.recommendedTransferSpeed;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.PotentialInstrument> component4() {
        return this.potentialInstruments;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositOption> component3() {
        return this.options;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType getDepositType() {
        return this.depositType;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getDepositAmount() {
        return this.depositAmount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionCategories copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionCategories balanceDepositSelectionCategories, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType, java.util.List list, java.util.List list2, com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            money = balanceDepositSelectionCategories.depositAmount;
        }
        if ((i & 2) != 0) {
            depositType = balanceDepositSelectionCategories.depositType;
        }
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType depositType2 = depositType;
        if ((i & 4) != 0) {
            list = balanceDepositSelectionCategories.options;
        }
        java.util.List list4 = list;
        if ((i & 8) != 0) {
            list2 = balanceDepositSelectionCategories.potentialInstruments;
        }
        java.util.List list5 = list2;
        if ((i & 16) != 0) {
            transferSpeed = balanceDepositSelectionCategories.recommendedTransferSpeed;
        }
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.TransferSpeed transferSpeed2 = transferSpeed;
        if ((i & 32) != 0) {
            list3 = balanceDepositSelectionCategories.ineligibleDepositInstruments;
        }
        return balanceDepositSelectionCategories.copy(money, depositType2, list4, list5, transferSpeed2, list3);
    }
}
