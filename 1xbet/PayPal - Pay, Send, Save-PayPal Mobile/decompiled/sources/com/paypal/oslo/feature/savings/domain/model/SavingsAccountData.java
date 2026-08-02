package com.paypal.oslo.feature.savings.domain.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJz\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b,\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b-\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b0\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b1\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/SavingsAccountData;", "", "", "id", "accountStatus", "", "electronic1099OptIn", "backupWithholdingEnabled", "moneyboxId", "Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;", "totalBalance", "totalNonGoalBalance", "totalGoalsBalance", "Lcom/paypal/oslo/feature/savings/domain/model/MoneyboxData;", "moneybox", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Lcom/paypal/oslo/feature/savings/domain/model/MoneyboxData;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;", "component7", "component8", "component9", "()Lcom/paypal/oslo/feature/savings/domain/model/MoneyboxData;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Lcom/paypal/oslo/feature/savings/domain/model/MoneyboxData;)Lcom/paypal/oslo/feature/savings/domain/model/SavingsAccountData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getAccountStatus", "Ljava/lang/Boolean;", "getElectronic1099OptIn", "getBackupWithholdingEnabled", "getMoneyboxId", "Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;", "getTotalBalance", "getTotalNonGoalBalance", "getTotalGoalsBalance", "Lcom/paypal/oslo/feature/savings/domain/model/MoneyboxData;", "getMoneybox"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SavingsAccountData {
    public static final int $stable = 0;
    private final java.lang.String accountStatus;
    private final java.lang.Boolean backupWithholdingEnabled;
    private final java.lang.Boolean electronic1099OptIn;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneybox;
    private final java.lang.String moneyboxId;
    private final com.paypal.oslo.feature.savings.domain.model.MoneyData totalBalance;
    private final com.paypal.oslo.feature.savings.domain.model.MoneyData totalGoalsBalance;
    private final com.paypal.oslo.feature.savings.domain.model.MoneyData totalNonGoalBalance;

    public SavingsAccountData(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str3, com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData, com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData2, com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData3, com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneyboxData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.accountStatus = str2;
        this.electronic1099OptIn = bool;
        this.backupWithholdingEnabled = bool2;
        this.moneyboxId = str3;
        this.totalBalance = moneyData;
        this.totalNonGoalBalance = moneyData2;
        this.totalGoalsBalance = moneyData3;
        this.moneybox = moneyboxData;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getAccountStatus() {
        return this.accountStatus;
    }

    public final java.lang.Boolean getElectronic1099OptIn() {
        return this.electronic1099OptIn;
    }

    public final java.lang.Boolean getBackupWithholdingEnabled() {
        return this.backupWithholdingEnabled;
    }

    public final java.lang.String getMoneyboxId() {
        return this.moneyboxId;
    }

    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getTotalBalance() {
        return this.totalBalance;
    }

    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getTotalNonGoalBalance() {
        return this.totalNonGoalBalance;
    }

    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getTotalGoalsBalance() {
        return this.totalGoalsBalance;
    }

    public final com.paypal.oslo.feature.savings.domain.model.MoneyboxData getMoneybox() {
        return this.moneybox;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.accountStatus;
        java.lang.Boolean bool = this.electronic1099OptIn;
        java.lang.Boolean bool2 = this.backupWithholdingEnabled;
        java.lang.String str3 = this.moneyboxId;
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData = this.totalBalance;
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData2 = this.totalNonGoalBalance;
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData3 = this.totalGoalsBalance;
        com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneyboxData = this.moneybox;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsAccountData(id=");
        sb.append(str);
        sb.append(", accountStatus=");
        sb.append(str2);
        sb.append(", electronic1099OptIn=");
        sb.append(bool);
        sb.append(", backupWithholdingEnabled=");
        sb.append(bool2);
        sb.append(", moneyboxId=");
        sb.append(str3);
        sb.append(", totalBalance=");
        sb.append(moneyData);
        sb.append(", totalNonGoalBalance=");
        sb.append(moneyData2);
        sb.append(", totalGoalsBalance=");
        sb.append(moneyData3);
        sb.append(", moneybox=");
        sb.append(moneyboxData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        java.lang.String str = this.accountStatus;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.Boolean bool = this.electronic1099OptIn;
        int hashCode3 = bool == null ? 0 : bool.hashCode();
        java.lang.Boolean bool2 = this.backupWithholdingEnabled;
        int hashCode4 = bool2 == null ? 0 : bool2.hashCode();
        java.lang.String str2 = this.moneyboxId;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData = this.totalBalance;
        int hashCode6 = moneyData == null ? 0 : moneyData.hashCode();
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData2 = this.totalNonGoalBalance;
        int hashCode7 = moneyData2 == null ? 0 : moneyData2.hashCode();
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData3 = this.totalGoalsBalance;
        int hashCode8 = moneyData3 == null ? 0 : moneyData3.hashCode();
        com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneyboxData = this.moneybox;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (moneyboxData != null ? moneyboxData.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.SavingsAccountData)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.SavingsAccountData savingsAccountData = (com.paypal.oslo.feature.savings.domain.model.SavingsAccountData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, savingsAccountData.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountStatus, savingsAccountData.accountStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.electronic1099OptIn, savingsAccountData.electronic1099OptIn) && kotlin.jvm.internal.Intrinsics.areEqual(this.backupWithholdingEnabled, savingsAccountData.backupWithholdingEnabled) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneyboxId, savingsAccountData.moneyboxId) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalBalance, savingsAccountData.totalBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalNonGoalBalance, savingsAccountData.totalNonGoalBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalGoalsBalance, savingsAccountData.totalGoalsBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.moneybox, savingsAccountData.moneybox);
    }

    public final com.paypal.oslo.feature.savings.domain.model.SavingsAccountData copy(java.lang.String id, java.lang.String accountStatus, java.lang.Boolean electronic1099OptIn, java.lang.Boolean backupWithholdingEnabled, java.lang.String moneyboxId, com.paypal.oslo.feature.savings.domain.model.MoneyData totalBalance, com.paypal.oslo.feature.savings.domain.model.MoneyData totalNonGoalBalance, com.paypal.oslo.feature.savings.domain.model.MoneyData totalGoalsBalance, com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneybox) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.savings.domain.model.SavingsAccountData(id, accountStatus, electronic1099OptIn, backupWithholdingEnabled, moneyboxId, totalBalance, totalNonGoalBalance, totalGoalsBalance, moneybox);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.MoneyboxData getMoneybox() {
        return this.moneybox;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getTotalGoalsBalance() {
        return this.totalGoalsBalance;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getTotalNonGoalBalance() {
        return this.totalNonGoalBalance;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getTotalBalance() {
        return this.totalBalance;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getMoneyboxId() {
        return this.moneyboxId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Boolean getBackupWithholdingEnabled() {
        return this.backupWithholdingEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Boolean getElectronic1099OptIn() {
        return this.electronic1099OptIn;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAccountStatus() {
        return this.accountStatus;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
