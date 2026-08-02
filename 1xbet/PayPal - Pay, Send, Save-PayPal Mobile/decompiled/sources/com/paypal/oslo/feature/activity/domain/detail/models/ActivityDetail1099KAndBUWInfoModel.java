package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetail1099KAndBUWInfoModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/AdditionalInfoItemModel;", "additionalInfoItems", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityTaxHoldBreakDownModel;", "activityTaxHoldBreakDownModel", "Lcom/paypal/pds/core/Color;", "backgroundColor", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/AdditionalInfoItemModel;Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityTaxHoldBreakDownModel;Lcom/paypal/pds/core/Color;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/AdditionalInfoItemModel;", "component2", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityTaxHoldBreakDownModel;", "component3", "()Lcom/paypal/pds/core/Color;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/AdditionalInfoItemModel;Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityTaxHoldBreakDownModel;Lcom/paypal/pds/core/Color;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetail1099KAndBUWInfoModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/AdditionalInfoItemModel;", "getAdditionalInfoItems", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityTaxHoldBreakDownModel;", "getActivityTaxHoldBreakDownModel", "Lcom/paypal/pds/core/Color;", "getBackgroundColor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityDetail1099KAndBUWInfoModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel activityTaxHoldBreakDownModel;
    private final com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItems;
    private final com.paypal.pds.core.Color backgroundColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityDetail1099KAndBUWInfoModel(com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItemModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel activityTaxHoldBreakDownModel, com.paypal.pds.core.Color color) {
        super(null, null, false, false, false, null, color, 63, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        this.additionalInfoItems = additionalInfoItemModel;
        this.activityTaxHoldBreakDownModel = activityTaxHoldBreakDownModel;
        this.backgroundColor = color;
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel getAdditionalInfoItems() {
        return this.additionalInfoItems;
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel getActivityTaxHoldBreakDownModel() {
        return this.activityTaxHoldBreakDownModel;
    }

    public /* synthetic */ ActivityDetail1099KAndBUWInfoModel(com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItemModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel activityTaxHoldBreakDownModel, com.paypal.pds.core.Color.BackgroundBase backgroundBase, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(additionalInfoItemModel, activityTaxHoldBreakDownModel, (i & 4) != 0 ? com.paypal.pds.core.Color.BackgroundBase.INSTANCE : backgroundBase);
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel
    public final com.paypal.pds.core.Color getBackgroundColor() {
        return this.backgroundColor;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItemModel = this.additionalInfoItems;
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel activityTaxHoldBreakDownModel = this.activityTaxHoldBreakDownModel;
        com.paypal.pds.core.Color color = this.backgroundColor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDetail1099KAndBUWInfoModel(additionalInfoItems=");
        sb.append(additionalInfoItemModel);
        sb.append(", activityTaxHoldBreakDownModel=");
        sb.append(activityTaxHoldBreakDownModel);
        sb.append(", backgroundColor=");
        sb.append(color);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItemModel = this.additionalInfoItems;
        int hashCode = additionalInfoItemModel == null ? 0 : additionalInfoItemModel.hashCode();
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel activityTaxHoldBreakDownModel = this.activityTaxHoldBreakDownModel;
        return (((hashCode * 31) + (activityTaxHoldBreakDownModel != null ? activityTaxHoldBreakDownModel.hashCode() : 0)) * 31) + this.backgroundColor.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel activityDetail1099KAndBUWInfoModel = (com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.additionalInfoItems, activityDetail1099KAndBUWInfoModel.additionalInfoItems) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityTaxHoldBreakDownModel, activityDetail1099KAndBUWInfoModel.activityTaxHoldBreakDownModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.backgroundColor, activityDetail1099KAndBUWInfoModel.backgroundColor);
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel copy(com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItems, com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel activityTaxHoldBreakDownModel, com.paypal.pds.core.Color backgroundColor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundColor, "");
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel(additionalInfoItems, activityTaxHoldBreakDownModel, backgroundColor);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.pds.core.Color getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel getActivityTaxHoldBreakDownModel() {
        return this.activityTaxHoldBreakDownModel;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel getAdditionalInfoItems() {
        return this.additionalInfoItems;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetail1099KAndBUWInfoModel activityDetail1099KAndBUWInfoModel, com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItemModel, com.paypal.oslo.feature.activity.domain.detail.models.ActivityTaxHoldBreakDownModel activityTaxHoldBreakDownModel, com.paypal.pds.core.Color color, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            additionalInfoItemModel = activityDetail1099KAndBUWInfoModel.additionalInfoItems;
        }
        if ((i & 2) != 0) {
            activityTaxHoldBreakDownModel = activityDetail1099KAndBUWInfoModel.activityTaxHoldBreakDownModel;
        }
        if ((i & 4) != 0) {
            color = activityDetail1099KAndBUWInfoModel.backgroundColor;
        }
        return activityDetail1099KAndBUWInfoModel.copy(additionalInfoItemModel, activityTaxHoldBreakDownModel, color);
    }
}
