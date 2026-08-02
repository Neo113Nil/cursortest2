package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/RewardChallengeTrackerModel;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "timeLeft", "", "timeRemainingResId", "completedPurchases", "totalPurchases", "<init>", "(Ljava/lang/String;Ljava/lang/String;III)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;III)Lcom/paypal/oslo/feature/activity/domain/detail/models/RewardChallengeTrackerModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getDescription", "getTimeLeft", com.visa.cbp.getEncExpo.warmup, "getTimeRemainingResId", "getCompletedPurchases", "getTotalPurchases"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RewardChallengeTrackerModel {
    public static final int $stable = 0;
    private final int completedPurchases;
    private final java.lang.String description;
    private final java.lang.String timeLeft;
    private final int timeRemainingResId;
    private final int totalPurchases;

    public RewardChallengeTrackerModel(java.lang.String str, java.lang.String str2, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.description = str;
        this.timeLeft = str2;
        this.timeRemainingResId = i;
        this.completedPurchases = i2;
        this.totalPurchases = i3;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getTimeLeft() {
        return this.timeLeft;
    }

    public final int getTimeRemainingResId() {
        return this.timeRemainingResId;
    }

    public final int getCompletedPurchases() {
        return this.completedPurchases;
    }

    public final int getTotalPurchases() {
        return this.totalPurchases;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.description;
        java.lang.String str2 = this.timeLeft;
        int i = this.timeRemainingResId;
        int i2 = this.completedPurchases;
        int i3 = this.totalPurchases;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardChallengeTrackerModel(description=");
        sb.append(str);
        sb.append(", timeLeft=");
        sb.append(str2);
        sb.append(", timeRemainingResId=");
        sb.append(i);
        sb.append(", completedPurchases=");
        sb.append(i2);
        sb.append(", totalPurchases=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.description.hashCode() * 31) + this.timeLeft.hashCode()) * 31) + java.lang.Integer.hashCode(this.timeRemainingResId)) * 31) + java.lang.Integer.hashCode(this.completedPurchases)) * 31) + java.lang.Integer.hashCode(this.totalPurchases);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel rewardChallengeTrackerModel = (com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.description, rewardChallengeTrackerModel.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.timeLeft, rewardChallengeTrackerModel.timeLeft) && this.timeRemainingResId == rewardChallengeTrackerModel.timeRemainingResId && this.completedPurchases == rewardChallengeTrackerModel.completedPurchases && this.totalPurchases == rewardChallengeTrackerModel.totalPurchases;
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel copy(java.lang.String description, java.lang.String timeLeft, int timeRemainingResId, int completedPurchases, int totalPurchases) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeLeft, "");
        return new com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel(description, timeLeft, timeRemainingResId, completedPurchases, totalPurchases);
    }

    /* renamed from: component5, reason: from getter */
    public final int getTotalPurchases() {
        return this.totalPurchases;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCompletedPurchases() {
        return this.completedPurchases;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTimeRemainingResId() {
        return this.timeRemainingResId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTimeLeft() {
        return this.timeLeft;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.RewardChallengeTrackerModel rewardChallengeTrackerModel, java.lang.String str, java.lang.String str2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            str = rewardChallengeTrackerModel.description;
        }
        if ((i4 & 2) != 0) {
            str2 = rewardChallengeTrackerModel.timeLeft;
        }
        java.lang.String str3 = str2;
        if ((i4 & 4) != 0) {
            i = rewardChallengeTrackerModel.timeRemainingResId;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = rewardChallengeTrackerModel.completedPurchases;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = rewardChallengeTrackerModel.totalPurchases;
        }
        return rewardChallengeTrackerModel.copy(str, str3, i5, i6, i3);
    }
}
