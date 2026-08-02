package com.paypal.oslo.feature.smartroute.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadSetupDetails;", "", "", "balanceId", "moneyboxId", "Ljava/math/BigDecimal;", "savingsBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/math/BigDecimal;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadSetupDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBalanceId", "getMoneyboxId", "Ljava/math/BigDecimal;", "getSavingsBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AutoReloadSetupDetails {
    public static final int $stable = 0;
    private final java.lang.String balanceId;
    private final java.lang.String moneyboxId;
    private final java.math.BigDecimal savingsBalance;

    public AutoReloadSetupDetails(java.lang.String str, java.lang.String str2, java.math.BigDecimal bigDecimal) {
        this.balanceId = str;
        this.moneyboxId = str2;
        this.savingsBalance = bigDecimal;
    }

    public final java.lang.String getBalanceId() {
        return this.balanceId;
    }

    public final java.lang.String getMoneyboxId() {
        return this.moneyboxId;
    }

    public final java.math.BigDecimal getSavingsBalance() {
        return this.savingsBalance;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.balanceId;
        java.lang.String str2 = this.moneyboxId;
        java.math.BigDecimal bigDecimal = this.savingsBalance;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoReloadSetupDetails(balanceId=");
        sb.append(str);
        sb.append(", moneyboxId=");
        sb.append(str2);
        sb.append(", savingsBalance=");
        sb.append(bigDecimal);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.balanceId;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.moneyboxId;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.math.BigDecimal bigDecimal = this.savingsBalance;
        return (((hashCode * 31) + hashCode2) * 31) + (bigDecimal != null ? bigDecimal.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupDetails)) {
            return false;
        }
        com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupDetails autoReloadSetupDetails = (com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.balanceId, autoReloadSetupDetails.balanceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyboxId, autoReloadSetupDetails.moneyboxId) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsBalance, autoReloadSetupDetails.savingsBalance);
    }

    public final com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupDetails copy(java.lang.String balanceId, java.lang.String moneyboxId, java.math.BigDecimal savingsBalance) {
        return new com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupDetails(balanceId, moneyboxId, savingsBalance);
    }

    /* renamed from: component3, reason: from getter */
    public final java.math.BigDecimal getSavingsBalance() {
        return this.savingsBalance;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMoneyboxId() {
        return this.moneyboxId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getBalanceId() {
        return this.balanceId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupDetails copy$default(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupDetails autoReloadSetupDetails, java.lang.String str, java.lang.String str2, java.math.BigDecimal bigDecimal, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = autoReloadSetupDetails.balanceId;
        }
        if ((i & 2) != 0) {
            str2 = autoReloadSetupDetails.moneyboxId;
        }
        if ((i & 4) != 0) {
            bigDecimal = autoReloadSetupDetails.savingsBalance;
        }
        return autoReloadSetupDetails.copy(str, str2, bigDecimal);
    }
}
