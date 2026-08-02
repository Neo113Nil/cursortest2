package com.paypal.oslo.feature.savings.domain.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0086\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b/\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b0\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b1\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b2\u0010\u0012R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/MoneyboxData;", "", "", "id", "name", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "type", "Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;", "targetAmount", "currentBalance", "pendingAmount", "category", "status", "Lcom/paypal/oslo/feature/savings/domain/model/TransferSettingsData;", "transferSettings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/TransferSettingsData;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;", "component6", "component7", "component8", "component9", "component10", "()Lcom/paypal/oslo/feature/savings/domain/model/TransferSettingsData;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/TransferSettingsData;)Lcom/paypal/oslo/feature/savings/domain/model/MoneyboxData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getDescription", "getType", "Lcom/paypal/oslo/feature/savings/domain/model/MoneyData;", "getTargetAmount", "getCurrentBalance", "getPendingAmount", "getCategory", "getStatus", "Lcom/paypal/oslo/feature/savings/domain/model/TransferSettingsData;", "getTransferSettings"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MoneyboxData {
    public static final int $stable = 0;
    private final java.lang.String category;
    private final com.paypal.oslo.feature.savings.domain.model.MoneyData currentBalance;
    private final java.lang.String description;
    private final java.lang.String id;
    private final java.lang.String name;
    private final com.paypal.oslo.feature.savings.domain.model.MoneyData pendingAmount;
    private final java.lang.String status;
    private final com.paypal.oslo.feature.savings.domain.model.MoneyData targetAmount;
    private final com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings;
    private final java.lang.String type;

    public MoneyboxData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData, com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData2, com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData3, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettingsData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.type = str4;
        this.targetAmount = moneyData;
        this.currentBalance = moneyData2;
        this.pendingAmount = moneyData3;
        this.category = str5;
        this.status = str6;
        this.transferSettings = transferSettingsData;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getTargetAmount() {
        return this.targetAmount;
    }

    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getCurrentBalance() {
        return this.currentBalance;
    }

    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getPendingAmount() {
        return this.pendingAmount;
    }

    public final java.lang.String getCategory() {
        return this.category;
    }

    public final java.lang.String getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.savings.domain.model.TransferSettingsData getTransferSettings() {
        return this.transferSettings;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        java.lang.String str3 = this.description;
        java.lang.String str4 = this.type;
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData = this.targetAmount;
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData2 = this.currentBalance;
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData3 = this.pendingAmount;
        java.lang.String str5 = this.category;
        java.lang.String str6 = this.status;
        com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettingsData = this.transferSettings;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyboxData(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", type=");
        sb.append(str4);
        sb.append(", targetAmount=");
        sb.append(moneyData);
        sb.append(", currentBalance=");
        sb.append(moneyData2);
        sb.append(", pendingAmount=");
        sb.append(moneyData3);
        sb.append(", category=");
        sb.append(str5);
        sb.append(", status=");
        sb.append(str6);
        sb.append(", transferSettings=");
        sb.append(transferSettingsData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        java.lang.String str = this.name;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.description;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.type;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData = this.targetAmount;
        int hashCode5 = moneyData == null ? 0 : moneyData.hashCode();
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData2 = this.currentBalance;
        int hashCode6 = moneyData2 == null ? 0 : moneyData2.hashCode();
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData3 = this.pendingAmount;
        int hashCode7 = moneyData3 == null ? 0 : moneyData3.hashCode();
        java.lang.String str4 = this.category;
        int hashCode8 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.status;
        int hashCode9 = str5 == null ? 0 : str5.hashCode();
        com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettingsData = this.transferSettings;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (transferSettingsData != null ? transferSettingsData.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.MoneyboxData)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.MoneyboxData moneyboxData = (com.paypal.oslo.feature.savings.domain.model.MoneyboxData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, moneyboxData.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, moneyboxData.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, moneyboxData.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, moneyboxData.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetAmount, moneyboxData.targetAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentBalance, moneyboxData.currentBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.pendingAmount, moneyboxData.pendingAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.category, moneyboxData.category) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, moneyboxData.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferSettings, moneyboxData.transferSettings);
    }

    public final com.paypal.oslo.feature.savings.domain.model.MoneyboxData copy(java.lang.String id, java.lang.String name2, java.lang.String description, java.lang.String type, com.paypal.oslo.feature.savings.domain.model.MoneyData targetAmount, com.paypal.oslo.feature.savings.domain.model.MoneyData currentBalance, com.paypal.oslo.feature.savings.domain.model.MoneyData pendingAmount, java.lang.String category, java.lang.String status, com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.savings.domain.model.MoneyboxData(id, name2, description, type, targetAmount, currentBalance, pendingAmount, category, status, transferSettings);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getStatus() {
        return this.status;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getCategory() {
        return this.category;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getPendingAmount() {
        return this.pendingAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getCurrentBalance() {
        return this.currentBalance;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.MoneyData getTargetAmount() {
        return this.targetAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.TransferSettingsData getTransferSettings() {
        return this.transferSettings;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
