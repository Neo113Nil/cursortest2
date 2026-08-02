package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J^\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0013R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalOption;", "", "", "id", "optionStatus", "transferMethod", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DisplayFee;", "displayFee", "", "supportedCurrencies", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalPlan;", "plan", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DisplayFee;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalPlan;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DisplayFee;", "component5", "()Ljava/util/List;", "component6", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalPlan;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DisplayFee;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalPlan;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalOption;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getOptionStatus", "getTransferMethod", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DisplayFee;", "getDisplayFee", "Ljava/util/List;", "getSupportedCurrencies", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalPlan;", "getPlan"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WithdrawalOption {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee displayFee;
    private final java.lang.String id;
    private final java.lang.String optionStatus;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPlan plan;
    private final java.util.List<java.lang.String> supportedCurrencies;
    private final java.lang.String transferMethod;

    public WithdrawalOption(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee displayFee, java.util.List<java.lang.String> list, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPlan withdrawalPlan) {
        this.id = str;
        this.optionStatus = str2;
        this.transferMethod = str3;
        this.displayFee = displayFee;
        this.supportedCurrencies = list;
        this.plan = withdrawalPlan;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getOptionStatus() {
        return this.optionStatus;
    }

    public final java.lang.String getTransferMethod() {
        return this.transferMethod;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee getDisplayFee() {
        return this.displayFee;
    }

    public final java.util.List<java.lang.String> getSupportedCurrencies() {
        return this.supportedCurrencies;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPlan getPlan() {
        return this.plan;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.optionStatus;
        java.lang.String str3 = this.transferMethod;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee displayFee = this.displayFee;
        java.util.List<java.lang.String> list = this.supportedCurrencies;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPlan withdrawalPlan = this.plan;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WithdrawalOption(id=");
        sb.append(str);
        sb.append(", optionStatus=");
        sb.append(str2);
        sb.append(", transferMethod=");
        sb.append(str3);
        sb.append(", displayFee=");
        sb.append(displayFee);
        sb.append(", supportedCurrencies=");
        sb.append(list);
        sb.append(", plan=");
        sb.append(withdrawalPlan);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.id;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.optionStatus;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.transferMethod;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee displayFee = this.displayFee;
        int hashCode4 = displayFee == null ? 0 : displayFee.hashCode();
        java.util.List<java.lang.String> list = this.supportedCurrencies;
        int hashCode5 = list == null ? 0 : list.hashCode();
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPlan withdrawalPlan = this.plan;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (withdrawalPlan != null ? withdrawalPlan.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption withdrawalOption = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, withdrawalOption.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.optionStatus, withdrawalOption.optionStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferMethod, withdrawalOption.transferMethod) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayFee, withdrawalOption.displayFee) && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedCurrencies, withdrawalOption.supportedCurrencies) && kotlin.jvm.internal.Intrinsics.areEqual(this.plan, withdrawalOption.plan);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption copy(java.lang.String id, java.lang.String optionStatus, java.lang.String transferMethod, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee displayFee, java.util.List<java.lang.String> supportedCurrencies, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPlan plan) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption(id, optionStatus, transferMethod, displayFee, supportedCurrencies, plan);
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPlan getPlan() {
        return this.plan;
    }

    public final java.util.List<java.lang.String> component5() {
        return this.supportedCurrencies;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee getDisplayFee() {
        return this.displayFee;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTransferMethod() {
        return this.transferMethod;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getOptionStatus() {
        return this.optionStatus;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption withdrawalOption, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee displayFee, java.util.List list, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPlan withdrawalPlan, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = withdrawalOption.id;
        }
        if ((i & 2) != 0) {
            str2 = withdrawalOption.optionStatus;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = withdrawalOption.transferMethod;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            displayFee = withdrawalOption.displayFee;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DisplayFee displayFee2 = displayFee;
        if ((i & 16) != 0) {
            list = withdrawalOption.supportedCurrencies;
        }
        java.util.List list2 = list;
        if ((i & 32) != 0) {
            withdrawalPlan = withdrawalOption.plan;
        }
        return withdrawalOption.copy(str, str4, str5, displayFee2, list2, withdrawalPlan);
    }
}
