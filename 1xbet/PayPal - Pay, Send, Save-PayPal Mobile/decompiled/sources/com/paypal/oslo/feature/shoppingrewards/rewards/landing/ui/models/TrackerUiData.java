package com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/TrackerUiData;", "", "", "currentTier", "", "pointsEarned", "", "milestones", "totalPoints", "<init>", "(Ljava/lang/String;ILjava/util/List;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;ILjava/util/List;I)Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/TrackerUiData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCurrentTier", com.visa.cbp.getEncExpo.warmup, "getPointsEarned", "Ljava/util/List;", "getMilestones", "getTotalPoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class TrackerUiData {
    public static final int $stable = 8;
    private final java.lang.String currentTier;
    private final java.util.List<java.lang.String> milestones;
    private final int pointsEarned;
    private final int totalPoints;

    public TrackerUiData(java.lang.String str, int i, java.util.List<java.lang.String> list, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.currentTier = str;
        this.pointsEarned = i;
        this.milestones = list;
        this.totalPoints = i2;
    }

    public final java.lang.String getCurrentTier() {
        return this.currentTier;
    }

    public final int getPointsEarned() {
        return this.pointsEarned;
    }

    public final java.util.List<java.lang.String> getMilestones() {
        return this.milestones;
    }

    public final int getTotalPoints() {
        return this.totalPoints;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.currentTier;
        int i = this.pointsEarned;
        java.util.List<java.lang.String> list = this.milestones;
        int i2 = this.totalPoints;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TrackerUiData(currentTier=");
        sb.append(str);
        sb.append(", pointsEarned=");
        sb.append(i);
        sb.append(", milestones=");
        sb.append(list);
        sb.append(", totalPoints=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.currentTier.hashCode() * 31) + java.lang.Integer.hashCode(this.pointsEarned)) * 31) + this.milestones.hashCode()) * 31) + java.lang.Integer.hashCode(this.totalPoints);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.TrackerUiData)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.TrackerUiData trackerUiData = (com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.TrackerUiData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.currentTier, trackerUiData.currentTier) && this.pointsEarned == trackerUiData.pointsEarned && kotlin.jvm.internal.Intrinsics.areEqual(this.milestones, trackerUiData.milestones) && this.totalPoints == trackerUiData.totalPoints;
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.TrackerUiData copy(java.lang.String currentTier, int pointsEarned, java.util.List<java.lang.String> milestones, int totalPoints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(milestones, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.TrackerUiData(currentTier, pointsEarned, milestones, totalPoints);
    }

    /* renamed from: component4, reason: from getter */
    public final int getTotalPoints() {
        return this.totalPoints;
    }

    public final java.util.List<java.lang.String> component3() {
        return this.milestones;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPointsEarned() {
        return this.pointsEarned;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCurrentTier() {
        return this.currentTier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.TrackerUiData copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.TrackerUiData trackerUiData, java.lang.String str, int i, java.util.List list, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = trackerUiData.currentTier;
        }
        if ((i3 & 2) != 0) {
            i = trackerUiData.pointsEarned;
        }
        if ((i3 & 4) != 0) {
            list = trackerUiData.milestones;
        }
        if ((i3 & 8) != 0) {
            i2 = trackerUiData.totalPoints;
        }
        return trackerUiData.copy(str, i, list, i2);
    }
}
