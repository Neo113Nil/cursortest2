package com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/shippingaccordion/internal/ShippingOption;", "", "", "id", "recipientName", "addressSummary", "addressFull", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/ui/transfer/component/shippingaccordion/internal/ShippingOption;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getRecipientName", "getAddressSummary", "getAddressFull"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ShippingOption {
    public static final int $stable = 0;
    private final java.lang.String addressFull;
    private final java.lang.String addressSummary;
    private final java.lang.String id;
    private final java.lang.String recipientName;

    public ShippingOption(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.id = str;
        this.recipientName = str2;
        this.addressSummary = str3;
        this.addressFull = str4;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getRecipientName() {
        return this.recipientName;
    }

    public final java.lang.String getAddressSummary() {
        return this.addressSummary;
    }

    public final java.lang.String getAddressFull() {
        return this.addressFull;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.recipientName;
        java.lang.String str3 = this.addressSummary;
        java.lang.String str4 = this.addressFull;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ShippingOption(id=");
        sb.append(str);
        sb.append(", recipientName=");
        sb.append(str2);
        sb.append(", addressSummary=");
        sb.append(str3);
        sb.append(", addressFull=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + this.recipientName.hashCode()) * 31) + this.addressSummary.hashCode()) * 31) + this.addressFull.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption shippingOption = (com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, shippingOption.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.recipientName, shippingOption.recipientName) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressSummary, shippingOption.addressSummary) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressFull, shippingOption.addressFull);
    }

    public final com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption copy(java.lang.String id, java.lang.String recipientName, java.lang.String addressSummary, java.lang.String addressFull) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recipientName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressSummary, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressFull, "");
        return new com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption(id, recipientName, addressSummary, addressFull);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAddressFull() {
        return this.addressFull;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAddressSummary() {
        return this.addressSummary;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRecipientName() {
        return this.recipientName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption copy$default(com.paypal.oslo.feature.moneymovement.ui.transfer.component.shippingaccordion.internal.ShippingOption shippingOption, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = shippingOption.id;
        }
        if ((i & 2) != 0) {
            str2 = shippingOption.recipientName;
        }
        if ((i & 4) != 0) {
            str3 = shippingOption.addressSummary;
        }
        if ((i & 8) != 0) {
            str4 = shippingOption.addressFull;
        }
        return shippingOption.copy(str, str2, str3, str4);
    }
}
