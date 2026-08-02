package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailCounterpartyInfoSectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "", "headerResId", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailCounterpartyInfoSectionModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Integer;", "getHeaderResId", "Ljava/lang/String;", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityDetailCounterpartyInfoSectionModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel {
    public static final int $stable = 8;
    private final java.lang.String description;
    private final java.lang.Integer headerResId;

    public ActivityDetailCounterpartyInfoSectionModel(java.lang.Integer num, java.lang.String str) {
        super(null, null, false, false, false, null, null, 127, null);
        this.headerResId = num;
        this.description = str;
    }

    public /* synthetic */ ActivityDetailCounterpartyInfoSectionModel(java.lang.Integer num, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }

    public final java.lang.Integer getHeaderResId() {
        return this.headerResId;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String toString() {
        java.lang.Integer num = this.headerResId;
        java.lang.String str = this.description;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDetailCounterpartyInfoSectionModel(headerResId=");
        sb.append(num);
        sb.append(", description=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Integer num = this.headerResId;
        int hashCode = num == null ? 0 : num.hashCode();
        java.lang.String str = this.description;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel activityDetailCounterpartyInfoSectionModel = (com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.headerResId, activityDetailCounterpartyInfoSectionModel.headerResId) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, activityDetailCounterpartyInfoSectionModel.description);
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel copy(java.lang.Integer headerResId, java.lang.String description) {
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel(headerResId, description);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getHeaderResId() {
        return this.headerResId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailCounterpartyInfoSectionModel activityDetailCounterpartyInfoSectionModel, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = activityDetailCounterpartyInfoSectionModel.headerResId;
        }
        if ((i & 2) != 0) {
            str = activityDetailCounterpartyInfoSectionModel.description;
        }
        return activityDetailCounterpartyInfoSectionModel.copy(num, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityDetailCounterpartyInfoSectionModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
