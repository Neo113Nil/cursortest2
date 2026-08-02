package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013JZ\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b'\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b(\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b)\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/FetchedPurchaseDetails;", "", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/FetchedLineItem;", "items", "", "currencyCode", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "totalAmount", "itemTotal", "taxTotal", "itemDiscount", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/FetchedPurchaseDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getItems", "Ljava/lang/String;", "getCurrencyCode", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "getTotalAmount", "getItemTotal", "getTaxTotal", "getItemDiscount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FetchedPurchaseDetails {
    public static final int $stable = 0;
    private final java.lang.String currencyCode;
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney itemDiscount;
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney itemTotal;
    private final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedLineItem> items;
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney taxTotal;
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney totalAmount;

    public FetchedPurchaseDetails(java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedLineItem> list, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney2, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney3, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.items = list;
        this.currencyCode = str;
        this.totalAmount = getPaidMoney;
        this.itemTotal = getPaidMoney2;
        this.taxTotal = getPaidMoney3;
        this.itemDiscount = getPaidMoney4;
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedLineItem> getItems() {
        return this.items;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getTotalAmount() {
        return this.totalAmount;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getItemTotal() {
        return this.itemTotal;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getTaxTotal() {
        return this.taxTotal;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getItemDiscount() {
        return this.itemDiscount;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedLineItem> list = this.items;
        java.lang.String str = this.currencyCode;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney = this.totalAmount;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney2 = this.itemTotal;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney3 = this.taxTotal;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney4 = this.itemDiscount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchedPurchaseDetails(items=");
        sb.append(list);
        sb.append(", currencyCode=");
        sb.append(str);
        sb.append(", totalAmount=");
        sb.append(getPaidMoney);
        sb.append(", itemTotal=");
        sb.append(getPaidMoney2);
        sb.append(", taxTotal=");
        sb.append(getPaidMoney3);
        sb.append(", itemDiscount=");
        sb.append(getPaidMoney4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode();
        int hashCode2 = this.currencyCode.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney = this.totalAmount;
        int hashCode3 = getPaidMoney == null ? 0 : getPaidMoney.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney2 = this.itemTotal;
        int hashCode4 = getPaidMoney2 == null ? 0 : getPaidMoney2.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney3 = this.taxTotal;
        int hashCode5 = getPaidMoney3 == null ? 0 : getPaidMoney3.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney4 = this.itemDiscount;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (getPaidMoney4 != null ? getPaidMoney4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseDetails)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseDetails fetchedPurchaseDetails = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.items, fetchedPurchaseDetails.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, fetchedPurchaseDetails.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalAmount, fetchedPurchaseDetails.totalAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.itemTotal, fetchedPurchaseDetails.itemTotal) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxTotal, fetchedPurchaseDetails.taxTotal) && kotlin.jvm.internal.Intrinsics.areEqual(this.itemDiscount, fetchedPurchaseDetails.itemDiscount);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseDetails copy(java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedLineItem> items, java.lang.String currencyCode, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney totalAmount, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney itemTotal, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney taxTotal, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney itemDiscount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseDetails(items, currencyCode, totalAmount, itemTotal, taxTotal, itemDiscount);
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getItemDiscount() {
        return this.itemDiscount;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getTaxTotal() {
        return this.taxTotal;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getItemTotal() {
        return this.itemTotal;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getTotalAmount() {
        return this.totalAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedLineItem> component1() {
        return this.items;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseDetails copy$default(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.FetchedPurchaseDetails fetchedPurchaseDetails, java.util.List list, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney2, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney3, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = fetchedPurchaseDetails.items;
        }
        if ((i & 2) != 0) {
            str = fetchedPurchaseDetails.currencyCode;
        }
        java.lang.String str2 = str;
        if ((i & 4) != 0) {
            getPaidMoney = fetchedPurchaseDetails.totalAmount;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney5 = getPaidMoney;
        if ((i & 8) != 0) {
            getPaidMoney2 = fetchedPurchaseDetails.itemTotal;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney6 = getPaidMoney2;
        if ((i & 16) != 0) {
            getPaidMoney3 = fetchedPurchaseDetails.taxTotal;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney7 = getPaidMoney3;
        if ((i & 32) != 0) {
            getPaidMoney4 = fetchedPurchaseDetails.itemDiscount;
        }
        return fetchedPurchaseDetails.copy(list, str2, getPaidMoney5, getPaidMoney6, getPaidMoney7, getPaidMoney4);
    }
}
