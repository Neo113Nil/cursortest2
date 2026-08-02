package com.paypal.oslo.feature.balance.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJx\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b\b\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b/\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b0\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b1\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001dR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/CurrencyBalance;", "", "", "id", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "availableAmount", "totalAmount", "", "isPrimary", "primaryCurrencyAmount", "reservedAmount", "pendingAmount", "", "exchangeRate", "", "subBalanceTypes", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;ZLcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Ljava/lang/Double;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "component3", "component4", "()Z", "component5", "component6", "component7", "component8", "()Ljava/lang/Double;", "component9", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;ZLcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;Ljava/lang/Double;Ljava/util/List;)Lcom/paypal/oslo/feature/balance/domain/model/CurrencyBalance;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getAvailableAmount", "getTotalAmount", "Z", "getPrimaryCurrencyAmount", "getReservedAmount", "getPendingAmount", "Ljava/lang/Double;", "getExchangeRate", "Ljava/util/List;", "getSubBalanceTypes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CurrencyBalance {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.balance.domain.model.Money availableAmount;
    private final java.lang.Double exchangeRate;
    private final java.lang.String id;
    private final boolean isPrimary;
    private final com.paypal.oslo.feature.balance.domain.model.Money pendingAmount;
    private final com.paypal.oslo.feature.balance.domain.model.Money primaryCurrencyAmount;
    private final com.paypal.oslo.feature.balance.domain.model.Money reservedAmount;
    private final java.util.List<java.lang.String> subBalanceTypes;
    private final com.paypal.oslo.feature.balance.domain.model.Money totalAmount;

    public CurrencyBalance(java.lang.String str, com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2, boolean z, com.paypal.oslo.feature.balance.domain.model.Money money3, com.paypal.oslo.feature.balance.domain.model.Money money4, com.paypal.oslo.feature.balance.domain.model.Money money5, java.lang.Double d, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.id = str;
        this.availableAmount = money;
        this.totalAmount = money2;
        this.isPrimary = z;
        this.primaryCurrencyAmount = money3;
        this.reservedAmount = money4;
        this.pendingAmount = money5;
        this.exchangeRate = d;
        this.subBalanceTypes = list;
    }

    public /* synthetic */ CurrencyBalance(java.lang.String str, com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2, boolean z, com.paypal.oslo.feature.balance.domain.model.Money money3, com.paypal.oslo.feature.balance.domain.model.Money money4, com.paypal.oslo.feature.balance.domain.model.Money money5, java.lang.Double d, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, money, money2, z, (i & 16) != 0 ? null : money3, (i & 32) != 0 ? null : money4, (i & 64) != 0 ? null : money5, (i & 128) != 0 ? null : d, (i & 256) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getAvailableAmount() {
        return this.availableAmount;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getTotalAmount() {
        return this.totalAmount;
    }

    public final boolean isPrimary() {
        return this.isPrimary;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getPrimaryCurrencyAmount() {
        return this.primaryCurrencyAmount;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getReservedAmount() {
        return this.reservedAmount;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getPendingAmount() {
        return this.pendingAmount;
    }

    public final java.lang.Double getExchangeRate() {
        return this.exchangeRate;
    }

    public final java.util.List<java.lang.String> getSubBalanceTypes() {
        return this.subBalanceTypes;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.balance.domain.model.Money money = this.availableAmount;
        com.paypal.oslo.feature.balance.domain.model.Money money2 = this.totalAmount;
        boolean z = this.isPrimary;
        com.paypal.oslo.feature.balance.domain.model.Money money3 = this.primaryCurrencyAmount;
        com.paypal.oslo.feature.balance.domain.model.Money money4 = this.reservedAmount;
        com.paypal.oslo.feature.balance.domain.model.Money money5 = this.pendingAmount;
        java.lang.Double d = this.exchangeRate;
        java.util.List<java.lang.String> list = this.subBalanceTypes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyBalance(id=");
        sb.append(str);
        sb.append(", availableAmount=");
        sb.append(money);
        sb.append(", totalAmount=");
        sb.append(money2);
        sb.append(", isPrimary=");
        sb.append(z);
        sb.append(", primaryCurrencyAmount=");
        sb.append(money3);
        sb.append(", reservedAmount=");
        sb.append(money4);
        sb.append(", pendingAmount=");
        sb.append(money5);
        sb.append(", exchangeRate=");
        sb.append(d);
        sb.append(", subBalanceTypes=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.availableAmount.hashCode();
        int hashCode3 = this.totalAmount.hashCode();
        int hashCode4 = java.lang.Boolean.hashCode(this.isPrimary);
        com.paypal.oslo.feature.balance.domain.model.Money money = this.primaryCurrencyAmount;
        int hashCode5 = money == null ? 0 : money.hashCode();
        com.paypal.oslo.feature.balance.domain.model.Money money2 = this.reservedAmount;
        int hashCode6 = money2 == null ? 0 : money2.hashCode();
        com.paypal.oslo.feature.balance.domain.model.Money money3 = this.pendingAmount;
        int hashCode7 = money3 == null ? 0 : money3.hashCode();
        java.lang.Double d = this.exchangeRate;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (d != null ? d.hashCode() : 0)) * 31) + this.subBalanceTypes.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.CurrencyBalance)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.CurrencyBalance currencyBalance = (com.paypal.oslo.feature.balance.domain.model.CurrencyBalance) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, currencyBalance.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableAmount, currencyBalance.availableAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmount, currencyBalance.totalAmount) && this.isPrimary == currencyBalance.isPrimary && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrencyAmount, currencyBalance.primaryCurrencyAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.reservedAmount, currencyBalance.reservedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.pendingAmount, currencyBalance.pendingAmount) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.exchangeRate, (java.lang.Object) currencyBalance.exchangeRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.subBalanceTypes, currencyBalance.subBalanceTypes);
    }

    public final com.paypal.oslo.feature.balance.domain.model.CurrencyBalance copy(java.lang.String id, com.paypal.oslo.feature.balance.domain.model.Money availableAmount, com.paypal.oslo.feature.balance.domain.model.Money totalAmount, boolean isPrimary, com.paypal.oslo.feature.balance.domain.model.Money primaryCurrencyAmount, com.paypal.oslo.feature.balance.domain.model.Money reservedAmount, com.paypal.oslo.feature.balance.domain.model.Money pendingAmount, java.lang.Double exchangeRate, java.util.List<java.lang.String> subBalanceTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subBalanceTypes, "");
        return new com.paypal.oslo.feature.balance.domain.model.CurrencyBalance(id, availableAmount, totalAmount, isPrimary, primaryCurrencyAmount, reservedAmount, pendingAmount, exchangeRate, subBalanceTypes);
    }

    public final java.util.List<java.lang.String> component9() {
        return this.subBalanceTypes;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.Double getExchangeRate() {
        return this.exchangeRate;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getPendingAmount() {
        return this.pendingAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getReservedAmount() {
        return this.reservedAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getPrimaryCurrencyAmount() {
        return this.primaryCurrencyAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getTotalAmount() {
        return this.totalAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getAvailableAmount() {
        return this.availableAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
