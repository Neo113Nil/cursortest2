package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ>\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailSKUItemSection;", "", "", "orderImageUrl", "orderItemName", "orderItemCount", "orderItemSpecs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailSKUItemSection;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOrderImageUrl", "getOrderItemName", "getOrderItemCount", "getOrderItemSpecs"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityDetailSKUItemSection {
    public static final int $stable = 0;
    private final java.lang.String orderImageUrl;
    private final java.lang.String orderItemCount;
    private final java.lang.String orderItemName;
    private final java.lang.String orderItemSpecs;

    public ActivityDetailSKUItemSection(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.orderImageUrl = str;
        this.orderItemName = str2;
        this.orderItemCount = str3;
        this.orderItemSpecs = str4;
    }

    public /* synthetic */ ActivityDetailSKUItemSection(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }

    public final java.lang.String getOrderImageUrl() {
        return this.orderImageUrl;
    }

    public final java.lang.String getOrderItemName() {
        return this.orderItemName;
    }

    public final java.lang.String getOrderItemCount() {
        return this.orderItemCount;
    }

    public final java.lang.String getOrderItemSpecs() {
        return this.orderItemSpecs;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.orderImageUrl;
        java.lang.String str2 = this.orderItemName;
        java.lang.String str3 = this.orderItemCount;
        java.lang.String str4 = this.orderItemSpecs;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDetailSKUItemSection(orderImageUrl=");
        sb.append(str);
        sb.append(", orderItemName=");
        sb.append(str2);
        sb.append(", orderItemCount=");
        sb.append(str3);
        sb.append(", orderItemSpecs=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.orderImageUrl;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.orderItemName.hashCode();
        java.lang.String str2 = this.orderItemCount;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.orderItemSpecs;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection activityDetailSKUItemSection = (com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.orderImageUrl, activityDetailSKUItemSection.orderImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.orderItemName, activityDetailSKUItemSection.orderItemName) && kotlin.jvm.internal.Intrinsics.areEqual(this.orderItemCount, activityDetailSKUItemSection.orderItemCount) && kotlin.jvm.internal.Intrinsics.areEqual(this.orderItemSpecs, activityDetailSKUItemSection.orderItemSpecs);
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection copy(java.lang.String orderImageUrl, java.lang.String orderItemName, java.lang.String orderItemCount, java.lang.String orderItemSpecs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orderItemName, "");
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection(orderImageUrl, orderItemName, orderItemCount, orderItemSpecs);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getOrderItemSpecs() {
        return this.orderItemSpecs;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getOrderItemCount() {
        return this.orderItemCount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getOrderItemName() {
        return this.orderItemName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getOrderImageUrl() {
        return this.orderImageUrl;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection activityDetailSKUItemSection, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activityDetailSKUItemSection.orderImageUrl;
        }
        if ((i & 2) != 0) {
            str2 = activityDetailSKUItemSection.orderItemName;
        }
        if ((i & 4) != 0) {
            str3 = activityDetailSKUItemSection.orderItemCount;
        }
        if ((i & 8) != 0) {
            str4 = activityDetailSKUItemSection.orderItemSpecs;
        }
        return activityDetailSKUItemSection.copy(str, str2, str3, str4);
    }
}
