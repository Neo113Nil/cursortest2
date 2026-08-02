package com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.header;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000bJ8\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/components/header/RewardsHeaderUiData;", "", "", "tierName", "Landroidx/compose/ui/graphics/Color;", "tierColor", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "pointsDescription", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2-0d7_KjU", "()J", "component2", "component3", "component4", "copy-RPmYEkk", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/components/header/RewardsHeaderUiData;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTierName", "J", "getTierColor-0d7_KjU", "getPoints", "getPointsDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class RewardsHeaderUiData {
    public static final int $stable = 0;
    private final java.lang.String points;
    private final java.lang.String pointsDescription;
    private final long tierColor;
    private final java.lang.String tierName;

    private RewardsHeaderUiData(java.lang.String str, long j, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.tierName = str;
        this.tierColor = j;
        this.points = str2;
        this.pointsDescription = str3;
    }

    public final java.lang.String getTierName() {
        return this.tierName;
    }

    /* renamed from: getTierColor-0d7_KjU, reason: not valid java name */
    public final long m19450getTierColor0d7_KjU() {
        return this.tierColor;
    }

    public final java.lang.String getPoints() {
        return this.points;
    }

    public final java.lang.String getPointsDescription() {
        return this.pointsDescription;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.tierName;
        java.lang.String m6004toStringimpl = androidx.compose.ui.graphics.Color.m6004toStringimpl(this.tierColor);
        java.lang.String str2 = this.points;
        java.lang.String str3 = this.pointsDescription;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardsHeaderUiData(tierName=");
        sb.append(str);
        sb.append(", tierColor=");
        sb.append(m6004toStringimpl);
        sb.append(", points=");
        sb.append(str2);
        sb.append(", pointsDescription=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.tierName.hashCode() * 31) + androidx.compose.ui.graphics.Color.m6003hashCodeimpl(this.tierColor)) * 31) + this.points.hashCode()) * 31) + this.pointsDescription.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.header.RewardsHeaderUiData)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.header.RewardsHeaderUiData rewardsHeaderUiData = (com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.header.RewardsHeaderUiData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.tierName, rewardsHeaderUiData.tierName) && androidx.compose.ui.graphics.Color.m5997equalsimpl0(this.tierColor, rewardsHeaderUiData.tierColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.points, rewardsHeaderUiData.points) && kotlin.jvm.internal.Intrinsics.areEqual(this.pointsDescription, rewardsHeaderUiData.pointsDescription);
    }

    /* renamed from: copy-RPmYEkk, reason: not valid java name */
    public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.header.RewardsHeaderUiData m19449copyRPmYEkk(java.lang.String tierName, long tierColor, java.lang.String points, java.lang.String pointsDescription) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tierName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(points, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointsDescription, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.header.RewardsHeaderUiData(tierName, tierColor, points, pointsDescription, null);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPointsDescription() {
        return this.pointsDescription;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPoints() {
        return this.points;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getTierColor() {
        return this.tierColor;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTierName() {
        return this.tierName;
    }

    /* renamed from: copy-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.header.RewardsHeaderUiData m19447copyRPmYEkk$default(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.components.header.RewardsHeaderUiData rewardsHeaderUiData, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = rewardsHeaderUiData.tierName;
        }
        if ((i & 2) != 0) {
            j = rewardsHeaderUiData.tierColor;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = rewardsHeaderUiData.points;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            str3 = rewardsHeaderUiData.pointsDescription;
        }
        return rewardsHeaderUiData.m19449copyRPmYEkk(str, j2, str4, str3);
    }

    public /* synthetic */ RewardsHeaderUiData(java.lang.String str, long j, java.lang.String str2, java.lang.String str3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, str3);
    }
}
