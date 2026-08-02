package com.paypal.oslo.feature.moneymovement.api.domain;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JH\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/FinancialInstrument;", "", "", "id", "logoUrl", "displayName", "maskedAccountNumber", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "availableBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)Lcom/paypal/oslo/feature/moneymovement/api/domain/FinancialInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLogoUrl", "getDisplayName", "getMaskedAccountNumber", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getAvailableBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FinancialInstrument {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount availableBalance;
    private final java.lang.String displayName;
    private final java.lang.String id;
    private final java.lang.String logoUrl;
    private final java.lang.String maskedAccountNumber;

    public FinancialInstrument(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.logoUrl = str2;
        this.displayName = str3;
        this.maskedAccountNumber = str4;
        this.availableBalance = moneyAmount;
    }

    public /* synthetic */ FinancialInstrument(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : moneyAmount);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final java.lang.String getMaskedAccountNumber() {
        return this.maskedAccountNumber;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getAvailableBalance() {
        return this.availableBalance;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.logoUrl;
        java.lang.String str3 = this.displayName;
        java.lang.String str4 = this.maskedAccountNumber;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.availableBalance;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FinancialInstrument(id=");
        sb.append(str);
        sb.append(", logoUrl=");
        sb.append(str2);
        sb.append(", displayName=");
        sb.append(str3);
        sb.append(", maskedAccountNumber=");
        sb.append(str4);
        sb.append(", availableBalance=");
        sb.append(moneyAmount);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        java.lang.String str = this.logoUrl;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.displayName.hashCode();
        java.lang.String str2 = this.maskedAccountNumber;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.availableBalance;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (moneyAmount != null ? moneyAmount.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument financialInstrument = (com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, financialInstrument.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, financialInstrument.logoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, financialInstrument.displayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedAccountNumber, financialInstrument.maskedAccountNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableBalance, financialInstrument.availableBalance);
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument copy(java.lang.String id, java.lang.String logoUrl, java.lang.String displayName, java.lang.String maskedAccountNumber, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount availableBalance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        return new com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument(id, logoUrl, displayName, maskedAccountNumber, availableBalance);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getAvailableBalance() {
        return this.availableBalance;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMaskedAccountNumber() {
        return this.maskedAccountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument copy$default(com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument financialInstrument, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = financialInstrument.id;
        }
        if ((i & 2) != 0) {
            str2 = financialInstrument.logoUrl;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = financialInstrument.displayName;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = financialInstrument.maskedAccountNumber;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            moneyAmount = financialInstrument.availableBalance;
        }
        return financialInstrument.copy(str, str5, str6, str7, moneyAmount);
    }
}
