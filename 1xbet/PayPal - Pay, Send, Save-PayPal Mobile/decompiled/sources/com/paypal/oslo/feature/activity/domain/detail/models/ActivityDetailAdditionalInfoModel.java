package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailAdditionalInfoModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "", "Lcom/paypal/oslo/feature/activity/domain/detail/models/AdditionalInfoItemModel;", "additionalInfoItems", "Lcom/paypal/pds/core/Color;", "backgroundColor", "<init>", "(Ljava/util/List;Lcom/paypal/pds/core/Color;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/pds/core/Color;", "copy", "(Ljava/util/List;Lcom/paypal/pds/core/Color;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailAdditionalInfoModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAdditionalInfoItems", "Lcom/paypal/pds/core/Color;", "getBackgroundColor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityDetailAdditionalInfoModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel> additionalInfoItems;
    private final com.paypal.pds.core.Color backgroundColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityDetailAdditionalInfoModel(java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel> list, com.paypal.pds.core.Color color) {
        super(null, null, false, false, false, null, color, 63, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        this.additionalInfoItems = list;
        this.backgroundColor = color;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel> getAdditionalInfoItems() {
        return this.additionalInfoItems;
    }

    public /* synthetic */ ActivityDetailAdditionalInfoModel(java.util.List list, com.paypal.pds.core.Color.BackgroundBase backgroundBase, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? com.paypal.pds.core.Color.BackgroundBase.INSTANCE : backgroundBase);
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel
    public final com.paypal.pds.core.Color getBackgroundColor() {
        return this.backgroundColor;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel> list = this.additionalInfoItems;
        com.paypal.pds.core.Color color = this.backgroundColor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDetailAdditionalInfoModel(additionalInfoItems=");
        sb.append(list);
        sb.append(", backgroundColor=");
        sb.append(color);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.additionalInfoItems.hashCode() * 31) + this.backgroundColor.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel activityDetailAdditionalInfoModel = (com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.additionalInfoItems, activityDetailAdditionalInfoModel.additionalInfoItems) && kotlin.jvm.internal.Intrinsics.areEqual(this.backgroundColor, activityDetailAdditionalInfoModel.backgroundColor);
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel copy(java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel> additionalInfoItems, com.paypal.pds.core.Color backgroundColor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalInfoItems, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundColor, "");
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel(additionalInfoItems, backgroundColor);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.pds.core.Color getBackgroundColor() {
        return this.backgroundColor;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel> component1() {
        return this.additionalInfoItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel activityDetailAdditionalInfoModel, java.util.List list, com.paypal.pds.core.Color color, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = activityDetailAdditionalInfoModel.additionalInfoItems;
        }
        if ((i & 2) != 0) {
            color = activityDetailAdditionalInfoModel.backgroundColor;
        }
        return activityDetailAdditionalInfoModel.copy(list, color);
    }
}
