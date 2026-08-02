package com.paypal.oslo.feature.packagetracking.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/AmazonOrderItemInfo;", "", "", "itemDescription", "", "itemQuantity", "itemImageUrl", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;ILjava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/domain/model/AmazonOrderItemInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getItemDescription", com.visa.cbp.getEncExpo.warmup, "getItemQuantity", "getItemImageUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AmazonOrderItemInfo {
    public static final int $stable = 0;
    private final java.lang.String itemDescription;
    private final java.lang.String itemImageUrl;
    private final int itemQuantity;

    public AmazonOrderItemInfo(java.lang.String str, int i, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.itemDescription = str;
        this.itemQuantity = i;
        this.itemImageUrl = str2;
    }

    public final java.lang.String getItemDescription() {
        return this.itemDescription;
    }

    public final int getItemQuantity() {
        return this.itemQuantity;
    }

    public final java.lang.String getItemImageUrl() {
        return this.itemImageUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.itemDescription;
        int i = this.itemQuantity;
        java.lang.String str2 = this.itemImageUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmazonOrderItemInfo(itemDescription=");
        sb.append(str);
        sb.append(", itemQuantity=");
        sb.append(i);
        sb.append(", itemImageUrl=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.itemDescription.hashCode();
        int hashCode2 = java.lang.Integer.hashCode(this.itemQuantity);
        java.lang.String str = this.itemImageUrl;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.model.AmazonOrderItemInfo)) {
            return false;
        }
        com.paypal.oslo.feature.packagetracking.domain.model.AmazonOrderItemInfo amazonOrderItemInfo = (com.paypal.oslo.feature.packagetracking.domain.model.AmazonOrderItemInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.itemDescription, amazonOrderItemInfo.itemDescription) && this.itemQuantity == amazonOrderItemInfo.itemQuantity && kotlin.jvm.internal.Intrinsics.areEqual(this.itemImageUrl, amazonOrderItemInfo.itemImageUrl);
    }

    public final com.paypal.oslo.feature.packagetracking.domain.model.AmazonOrderItemInfo copy(java.lang.String itemDescription, int itemQuantity, java.lang.String itemImageUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemDescription, "");
        return new com.paypal.oslo.feature.packagetracking.domain.model.AmazonOrderItemInfo(itemDescription, itemQuantity, itemImageUrl);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getItemImageUrl() {
        return this.itemImageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final int getItemQuantity() {
        return this.itemQuantity;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getItemDescription() {
        return this.itemDescription;
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.model.AmazonOrderItemInfo copy$default(com.paypal.oslo.feature.packagetracking.domain.model.AmazonOrderItemInfo amazonOrderItemInfo, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = amazonOrderItemInfo.itemDescription;
        }
        if ((i2 & 2) != 0) {
            i = amazonOrderItemInfo.itemQuantity;
        }
        if ((i2 & 4) != 0) {
            str2 = amazonOrderItemInfo.itemImageUrl;
        }
        return amazonOrderItemInfo.copy(str, i, str2);
    }
}
