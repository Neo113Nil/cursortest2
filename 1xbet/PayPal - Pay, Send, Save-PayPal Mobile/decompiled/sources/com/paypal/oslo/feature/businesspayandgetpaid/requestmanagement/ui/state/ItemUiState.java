package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJZ\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b%\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0014R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b(\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/ItemUiState;", "", "", "name", "quantity", "unitPriceFormatted", "totalFormatted", "taxFormatted", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/ItemDiscountData;", "discountData", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/ItemDiscountData;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/ItemDiscountData;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/ItemDiscountData;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/ItemUiState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getQuantity", "getUnitPriceFormatted", "getTotalFormatted", "getTaxFormatted", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/state/ItemDiscountData;", "getDiscountData", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ItemUiState {
    public static final int $stable = 0;
    private final java.lang.String description;
    private final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemDiscountData discountData;
    private final java.lang.String name;
    private final java.lang.String quantity;
    private final java.lang.String taxFormatted;
    private final java.lang.String totalFormatted;
    private final java.lang.String unitPriceFormatted;

    public ItemUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemDiscountData itemDiscountData, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        this.name = str;
        this.quantity = str2;
        this.unitPriceFormatted = str3;
        this.totalFormatted = str4;
        this.taxFormatted = str5;
        this.discountData = itemDiscountData;
        this.description = str6;
    }

    public /* synthetic */ ItemUiState(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemDiscountData itemDiscountData, java.lang.String str6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : itemDiscountData, str6);
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getQuantity() {
        return this.quantity;
    }

    public final java.lang.String getUnitPriceFormatted() {
        return this.unitPriceFormatted;
    }

    public final java.lang.String getTotalFormatted() {
        return this.totalFormatted;
    }

    public final java.lang.String getTaxFormatted() {
        return this.taxFormatted;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemDiscountData getDiscountData() {
        return this.discountData;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.quantity;
        java.lang.String str3 = this.unitPriceFormatted;
        java.lang.String str4 = this.totalFormatted;
        java.lang.String str5 = this.taxFormatted;
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemDiscountData itemDiscountData = this.discountData;
        java.lang.String str6 = this.description;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ItemUiState(name=");
        sb.append(str);
        sb.append(", quantity=");
        sb.append(str2);
        sb.append(", unitPriceFormatted=");
        sb.append(str3);
        sb.append(", totalFormatted=");
        sb.append(str4);
        sb.append(", taxFormatted=");
        sb.append(str5);
        sb.append(", discountData=");
        sb.append(itemDiscountData);
        sb.append(", description=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.quantity.hashCode();
        int hashCode3 = this.unitPriceFormatted.hashCode();
        int hashCode4 = this.totalFormatted.hashCode();
        java.lang.String str = this.taxFormatted;
        int hashCode5 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemDiscountData itemDiscountData = this.discountData;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (itemDiscountData != null ? itemDiscountData.hashCode() : 0)) * 31) + this.description.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiState)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiState itemUiState = (com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, itemUiState.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, itemUiState.quantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.unitPriceFormatted, itemUiState.unitPriceFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalFormatted, itemUiState.totalFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxFormatted, itemUiState.taxFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.discountData, itemUiState.discountData) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, itemUiState.description);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiState copy(java.lang.String name2, java.lang.String quantity, java.lang.String unitPriceFormatted, java.lang.String totalFormatted, java.lang.String taxFormatted, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemDiscountData discountData, java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quantity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unitPriceFormatted, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalFormatted, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        return new com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiState(name2, quantity, unitPriceFormatted, totalFormatted, taxFormatted, discountData, description);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemDiscountData getDiscountData() {
        return this.discountData;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getTaxFormatted() {
        return this.taxFormatted;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getTotalFormatted() {
        return this.totalFormatted;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getUnitPriceFormatted() {
        return this.unitPriceFormatted;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getQuantity() {
        return this.quantity;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiState copy$default(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemUiState itemUiState, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemDiscountData itemDiscountData, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = itemUiState.name;
        }
        if ((i & 2) != 0) {
            str2 = itemUiState.quantity;
        }
        java.lang.String str7 = str2;
        if ((i & 4) != 0) {
            str3 = itemUiState.unitPriceFormatted;
        }
        java.lang.String str8 = str3;
        if ((i & 8) != 0) {
            str4 = itemUiState.totalFormatted;
        }
        java.lang.String str9 = str4;
        if ((i & 16) != 0) {
            str5 = itemUiState.taxFormatted;
        }
        java.lang.String str10 = str5;
        if ((i & 32) != 0) {
            itemDiscountData = itemUiState.discountData;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.state.ItemDiscountData itemDiscountData2 = itemDiscountData;
        if ((i & 64) != 0) {
            str6 = itemUiState.description;
        }
        return itemUiState.copy(str, str7, str8, str9, str10, itemDiscountData2, str6);
    }
}
