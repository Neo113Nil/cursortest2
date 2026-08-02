package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JJ\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailOrderSummarySectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailSKUItemSection;", "orderItems", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailPackageTrackingItem;", "packageTrackingItems", "", "leadingTitleResId", "", "showLeadingHeader", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Z)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Z", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Z)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailOrderSummarySectionModel;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getOrderItems", "getPackageTrackingItems", "Ljava/lang/Integer;", "getLeadingTitleResId", "Z", "getShowLeadingHeader"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityDetailOrderSummarySectionModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel {
    public static final int $stable = 8;
    private final java.lang.Integer leadingTitleResId;
    private final java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection> orderItems;
    private final java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailPackageTrackingItem> packageTrackingItems;
    private final boolean showLeadingHeader;

    public ActivityDetailOrderSummarySectionModel(java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection> list, java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailPackageTrackingItem> list2, java.lang.Integer num, boolean z) {
        super(num, null, false, z, false, null, null, 118, null);
        this.orderItems = list;
        this.packageTrackingItems = list2;
        this.leadingTitleResId = num;
        this.showLeadingHeader = z;
    }

    public /* synthetic */ ActivityDetailOrderSummarySectionModel(java.util.List list, java.util.List list2, java.lang.Integer num, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i & 4) != 0 ? null : num, z);
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection> getOrderItems() {
        return this.orderItems;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailPackageTrackingItem> getPackageTrackingItems() {
        return this.packageTrackingItems;
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
        java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection> list = this.orderItems;
        java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailPackageTrackingItem> list2 = this.packageTrackingItems;
        java.lang.Integer num = this.leadingTitleResId;
        boolean z = this.showLeadingHeader;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDetailOrderSummarySectionModel(orderItems=");
        sb.append(list);
        sb.append(", packageTrackingItems=");
        sb.append(list2);
        sb.append(", leadingTitleResId=");
        sb.append(num);
        sb.append(", showLeadingHeader=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection> list = this.orderItems;
        int hashCode = list == null ? 0 : list.hashCode();
        java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailPackageTrackingItem> list2 = this.packageTrackingItems;
        int hashCode2 = list2 == null ? 0 : list2.hashCode();
        java.lang.Integer num = this.leadingTitleResId;
        return (((((hashCode * 31) + hashCode2) * 31) + (num != null ? num.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.showLeadingHeader);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel activityDetailOrderSummarySectionModel = (com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.orderItems, activityDetailOrderSummarySectionModel.orderItems) && kotlin.jvm.internal.Intrinsics.areEqual(this.packageTrackingItems, activityDetailOrderSummarySectionModel.packageTrackingItems) && kotlin.jvm.internal.Intrinsics.areEqual(this.leadingTitleResId, activityDetailOrderSummarySectionModel.leadingTitleResId) && this.showLeadingHeader == activityDetailOrderSummarySectionModel.showLeadingHeader;
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel copy(java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection> orderItems, java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailPackageTrackingItem> packageTrackingItems, java.lang.Integer leadingTitleResId, boolean showLeadingHeader) {
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel(orderItems, packageTrackingItems, leadingTitleResId, showLeadingHeader);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowLeadingHeader() {
        return this.showLeadingHeader;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getLeadingTitleResId() {
        return this.leadingTitleResId;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailPackageTrackingItem> component2() {
        return this.packageTrackingItems;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailSKUItemSection> component1() {
        return this.orderItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailOrderSummarySectionModel activityDetailOrderSummarySectionModel, java.util.List list, java.util.List list2, java.lang.Integer num, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = activityDetailOrderSummarySectionModel.orderItems;
        }
        if ((i & 2) != 0) {
            list2 = activityDetailOrderSummarySectionModel.packageTrackingItems;
        }
        if ((i & 4) != 0) {
            num = activityDetailOrderSummarySectionModel.leadingTitleResId;
        }
        if ((i & 8) != 0) {
            z = activityDetailOrderSummarySectionModel.showLeadingHeader;
        }
        return activityDetailOrderSummarySectionModel.copy(list, list2, num, z);
    }
}
