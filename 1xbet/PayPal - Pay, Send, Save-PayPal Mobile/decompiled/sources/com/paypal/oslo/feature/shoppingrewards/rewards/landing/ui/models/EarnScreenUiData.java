package com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/EarnScreenUiData;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/TrackerUiData;", "trackerData", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/rewardsactionlistsection/RewardsActionListSectionUiData;", "earnActionListSectionData", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/TrackerUiData;Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/rewardsactionlistsection/RewardsActionListSectionUiData;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/TrackerUiData;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/rewardsactionlistsection/RewardsActionListSectionUiData;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/TrackerUiData;Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/rewardsactionlistsection/RewardsActionListSectionUiData;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/EarnScreenUiData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/TrackerUiData;", "getTrackerData", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/rewardsactionlistsection/RewardsActionListSectionUiData;", "getEarnActionListSectionData"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class EarnScreenUiData {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.RewardsActionListSectionUiData earnActionListSectionData;
    private final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.TrackerUiData trackerData;

    public EarnScreenUiData(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.TrackerUiData trackerUiData, com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.RewardsActionListSectionUiData rewardsActionListSectionUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackerUiData, "");
        this.trackerData = trackerUiData;
        this.earnActionListSectionData = rewardsActionListSectionUiData;
    }

    public /* synthetic */ EarnScreenUiData(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.TrackerUiData trackerUiData, com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.RewardsActionListSectionUiData rewardsActionListSectionUiData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(trackerUiData, (i & 2) != 0 ? null : rewardsActionListSectionUiData);
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.TrackerUiData getTrackerData() {
        return this.trackerData;
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.RewardsActionListSectionUiData getEarnActionListSectionData() {
        return this.earnActionListSectionData;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.TrackerUiData trackerUiData = this.trackerData;
        com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.RewardsActionListSectionUiData rewardsActionListSectionUiData = this.earnActionListSectionData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EarnScreenUiData(trackerData=");
        sb.append(trackerUiData);
        sb.append(", earnActionListSectionData=");
        sb.append(rewardsActionListSectionUiData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.trackerData.hashCode();
        com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.RewardsActionListSectionUiData rewardsActionListSectionUiData = this.earnActionListSectionData;
        return (hashCode * 31) + (rewardsActionListSectionUiData == null ? 0 : rewardsActionListSectionUiData.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.EarnScreenUiData)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.EarnScreenUiData earnScreenUiData = (com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.EarnScreenUiData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.trackerData, earnScreenUiData.trackerData) && kotlin.jvm.internal.Intrinsics.areEqual(this.earnActionListSectionData, earnScreenUiData.earnActionListSectionData);
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.EarnScreenUiData copy(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.TrackerUiData trackerData, com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.RewardsActionListSectionUiData earnActionListSectionData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackerData, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.EarnScreenUiData(trackerData, earnActionListSectionData);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.RewardsActionListSectionUiData getEarnActionListSectionData() {
        return this.earnActionListSectionData;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.TrackerUiData getTrackerData() {
        return this.trackerData;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.EarnScreenUiData copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.EarnScreenUiData earnScreenUiData, com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.TrackerUiData trackerUiData, com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.rewardsactionlistsection.RewardsActionListSectionUiData rewardsActionListSectionUiData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trackerUiData = earnScreenUiData.trackerData;
        }
        if ((i & 2) != 0) {
            rewardsActionListSectionUiData = earnScreenUiData.earnActionListSectionData;
        }
        return earnScreenUiData.copy(trackerUiData, rewardsActionListSectionUiData);
    }
}
