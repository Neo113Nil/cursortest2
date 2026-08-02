package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailActionsModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailActionsModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getActions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityDetailActionsModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> actions;

    public ActivityDetailActionsModel(java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> list) {
        super(null, null, false, false, false, null, null, 127, null);
        this.actions = list;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> getActions() {
        return this.actions;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> list = this.actions;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDetailActionsModel(actions=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> list = this.actions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailActionsModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.actions, ((com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailActionsModel) other).actions);
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailActionsModel copy(java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> actions) {
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailActionsModel(actions);
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> component1() {
        return this.actions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailActionsModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailActionsModel activityDetailActionsModel, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = activityDetailActionsModel.actions;
        }
        return activityDetailActionsModel.copy(list);
    }
}
