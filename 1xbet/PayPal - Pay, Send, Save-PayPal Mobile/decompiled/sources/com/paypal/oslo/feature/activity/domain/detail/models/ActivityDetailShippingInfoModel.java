package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailShippingInfoModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ShippingAddress;", "shippingAddress", "", "leadingTitleResId", "", "showLeadingHeader", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ShippingAddress;Ljava/lang/Integer;Z)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/ShippingAddress;", "component2", "()Ljava/lang/Integer;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ShippingAddress;Ljava/lang/Integer;Z)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailShippingInfoModel;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ShippingAddress;", "getShippingAddress", "Ljava/lang/Integer;", "getLeadingTitleResId", "Z", "getShowLeadingHeader"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityDetailShippingInfoModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel {
    public static final int $stable = 8;
    private final java.lang.Integer leadingTitleResId;
    private final com.paypal.oslo.feature.activity.domain.detail.models.ShippingAddress shippingAddress;
    private final boolean showLeadingHeader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityDetailShippingInfoModel(com.paypal.oslo.feature.activity.domain.detail.models.ShippingAddress shippingAddress, java.lang.Integer num, boolean z) {
        super(num, null, false, z, false, null, null, 118, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAddress, "");
        this.shippingAddress = shippingAddress;
        this.leadingTitleResId = num;
        this.showLeadingHeader = z;
    }

    public /* synthetic */ ActivityDetailShippingInfoModel(com.paypal.oslo.feature.activity.domain.detail.models.ShippingAddress shippingAddress, java.lang.Integer num, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(shippingAddress, (i & 2) != 0 ? null : num, z);
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ShippingAddress getShippingAddress() {
        return this.shippingAddress;
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel
    public final java.lang.Integer getLeadingTitleResId() {
        return this.leadingTitleResId;
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel
    public final boolean getShowLeadingHeader() {
        return this.showLeadingHeader;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.activity.domain.detail.models.ShippingAddress shippingAddress = this.shippingAddress;
        java.lang.Integer num = this.leadingTitleResId;
        boolean z = this.showLeadingHeader;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDetailShippingInfoModel(shippingAddress=");
        sb.append(shippingAddress);
        sb.append(", leadingTitleResId=");
        sb.append(num);
        sb.append(", showLeadingHeader=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.shippingAddress.hashCode();
        java.lang.Integer num = this.leadingTitleResId;
        return (((hashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Boolean.hashCode(this.showLeadingHeader);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailShippingInfoModel)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailShippingInfoModel activityDetailShippingInfoModel = (com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailShippingInfoModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.shippingAddress, activityDetailShippingInfoModel.shippingAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.leadingTitleResId, activityDetailShippingInfoModel.leadingTitleResId) && this.showLeadingHeader == activityDetailShippingInfoModel.showLeadingHeader;
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailShippingInfoModel copy(com.paypal.oslo.feature.activity.domain.detail.models.ShippingAddress shippingAddress, java.lang.Integer leadingTitleResId, boolean showLeadingHeader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAddress, "");
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailShippingInfoModel(shippingAddress, leadingTitleResId, showLeadingHeader);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowLeadingHeader() {
        return this.showLeadingHeader;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getLeadingTitleResId() {
        return this.leadingTitleResId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.detail.models.ShippingAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailShippingInfoModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailShippingInfoModel activityDetailShippingInfoModel, com.paypal.oslo.feature.activity.domain.detail.models.ShippingAddress shippingAddress, java.lang.Integer num, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            shippingAddress = activityDetailShippingInfoModel.shippingAddress;
        }
        if ((i & 2) != 0) {
            num = activityDetailShippingInfoModel.leadingTitleResId;
        }
        if ((i & 4) != 0) {
            z = activityDetailShippingInfoModel.showLeadingHeader;
        }
        return activityDetailShippingInfoModel.copy(shippingAddress, num, z);
    }
}
