package com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.milestoneshalfsheet;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/components/milestoneshalfsheet/MilestonesHalfSheetUiData;", "", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/components/milestoneshalfsheet/MilestoneItemUiData;", "milestones", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/components/milestoneshalfsheet/MilestonesHalfSheetUiData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getDescription", "Ljava/util/List;", "getMilestones"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MilestonesHalfSheetUiData {
    public static final int $stable = 8;
    private final java.lang.String description;
    private final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.milestoneshalfsheet.MilestoneItemUiData> milestones;
    private final java.lang.String title;

    public MilestonesHalfSheetUiData(java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.milestoneshalfsheet.MilestoneItemUiData> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.title = str;
        this.description = str2;
        this.milestones = list;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.milestoneshalfsheet.MilestoneItemUiData> getMilestones() {
        return this.milestones;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.description;
        java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.milestoneshalfsheet.MilestoneItemUiData> list = this.milestones;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MilestonesHalfSheetUiData(title=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", milestones=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.milestones.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.milestoneshalfsheet.MilestonesHalfSheetUiData)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.milestoneshalfsheet.MilestonesHalfSheetUiData milestonesHalfSheetUiData = (com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.milestoneshalfsheet.MilestonesHalfSheetUiData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, milestonesHalfSheetUiData.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, milestonesHalfSheetUiData.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.milestones, milestonesHalfSheetUiData.milestones);
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.milestoneshalfsheet.MilestonesHalfSheetUiData copy(java.lang.String title, java.lang.String description, java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.milestoneshalfsheet.MilestoneItemUiData> milestones) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(milestones, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.milestoneshalfsheet.MilestonesHalfSheetUiData(title, description, milestones);
    }

    public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.milestoneshalfsheet.MilestoneItemUiData> component3() {
        return this.milestones;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.milestoneshalfsheet.MilestonesHalfSheetUiData copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.milestoneshalfsheet.MilestonesHalfSheetUiData milestonesHalfSheetUiData, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = milestonesHalfSheetUiData.title;
        }
        if ((i & 2) != 0) {
            str2 = milestonesHalfSheetUiData.description;
        }
        if ((i & 4) != 0) {
            list = milestonesHalfSheetUiData.milestones;
        }
        return milestonesHalfSheetUiData.copy(str, str2, list);
    }
}
