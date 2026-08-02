package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRewardItem;", "", "", "rewardValueResId", "", "rewardDescription", "rewardValue", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRewardItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Integer;", "getRewardValueResId", "Ljava/lang/String;", "getRewardDescription", "getRewardValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityDetailRewardItem {
    public static final int $stable = 0;
    private final java.lang.String rewardDescription;
    private final java.lang.String rewardValue;
    private final java.lang.Integer rewardValueResId;

    public ActivityDetailRewardItem(java.lang.Integer num, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.rewardValueResId = num;
        this.rewardDescription = str;
        this.rewardValue = str2;
    }

    public /* synthetic */ ActivityDetailRewardItem(java.lang.Integer num, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, str, (i & 4) != 0 ? null : str2);
    }

    public final java.lang.Integer getRewardValueResId() {
        return this.rewardValueResId;
    }

    public final java.lang.String getRewardDescription() {
        return this.rewardDescription;
    }

    public final java.lang.String getRewardValue() {
        return this.rewardValue;
    }

    public final java.lang.String toString() {
        java.lang.Integer num = this.rewardValueResId;
        java.lang.String str = this.rewardDescription;
        java.lang.String str2 = this.rewardValue;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDetailRewardItem(rewardValueResId=");
        sb.append(num);
        sb.append(", rewardDescription=");
        sb.append(str);
        sb.append(", rewardValue=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Integer num = this.rewardValueResId;
        int hashCode = num == null ? 0 : num.hashCode();
        int hashCode2 = this.rewardDescription.hashCode();
        java.lang.String str = this.rewardValue;
        return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardItem)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardItem activityDetailRewardItem = (com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.rewardValueResId, activityDetailRewardItem.rewardValueResId) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardDescription, activityDetailRewardItem.rewardDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardValue, activityDetailRewardItem.rewardValue);
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardItem copy(java.lang.Integer rewardValueResId, java.lang.String rewardDescription, java.lang.String rewardValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardDescription, "");
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardItem(rewardValueResId, rewardDescription, rewardValue);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRewardValue() {
        return this.rewardValue;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRewardDescription() {
        return this.rewardDescription;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getRewardValueResId() {
        return this.rewardValueResId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardItem copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRewardItem activityDetailRewardItem, java.lang.Integer num, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = activityDetailRewardItem.rewardValueResId;
        }
        if ((i & 2) != 0) {
            str = activityDetailRewardItem.rewardDescription;
        }
        if ((i & 4) != 0) {
            str2 = activityDetailRewardItem.rewardValue;
        }
        return activityDetailRewardItem.copy(num, str, str2);
    }
}
