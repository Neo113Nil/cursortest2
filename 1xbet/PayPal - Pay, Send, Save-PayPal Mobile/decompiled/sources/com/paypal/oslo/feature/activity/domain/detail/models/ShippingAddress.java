package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ShippingAddress;", "", "", "line1", "line2", "line3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ShippingAddress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLine1", "getLine2", "getLine3"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ShippingAddress {
    public static final int $stable = 0;
    private final java.lang.String line1;
    private final java.lang.String line2;
    private final java.lang.String line3;

    public ShippingAddress(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.line1 = str;
        this.line2 = str2;
        this.line3 = str3;
    }

    public final java.lang.String getLine1() {
        return this.line1;
    }

    public final java.lang.String getLine2() {
        return this.line2;
    }

    public final java.lang.String getLine3() {
        return this.line3;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.line1;
        java.lang.String str2 = this.line2;
        java.lang.String str3 = this.line3;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ShippingAddress(line1=");
        sb.append(str);
        sb.append(", line2=");
        sb.append(str2);
        sb.append(", line3=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.line1.hashCode() * 31) + this.line2.hashCode()) * 31) + this.line3.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ShippingAddress)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.ShippingAddress shippingAddress = (com.paypal.oslo.feature.activity.domain.detail.models.ShippingAddress) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.line1, shippingAddress.line1) && kotlin.jvm.internal.Intrinsics.areEqual(this.line2, shippingAddress.line2) && kotlin.jvm.internal.Intrinsics.areEqual(this.line3, shippingAddress.line3);
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ShippingAddress copy(java.lang.String line1, java.lang.String line2, java.lang.String line3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line3, "");
        return new com.paypal.oslo.feature.activity.domain.detail.models.ShippingAddress(line1, line2, line3);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLine3() {
        return this.line3;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLine2() {
        return this.line2;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLine1() {
        return this.line1;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ShippingAddress copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ShippingAddress shippingAddress, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = shippingAddress.line1;
        }
        if ((i & 2) != 0) {
            str2 = shippingAddress.line2;
        }
        if ((i & 4) != 0) {
            str3 = shippingAddress.line3;
        }
        return shippingAddress.copy(str, str2, str3);
    }
}
