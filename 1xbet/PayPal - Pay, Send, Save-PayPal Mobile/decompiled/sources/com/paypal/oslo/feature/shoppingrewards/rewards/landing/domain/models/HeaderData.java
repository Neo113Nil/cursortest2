package com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/models/HeaderData;", "", "", "tierName", "", "tierColorHex", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "pointsDescription", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/domain/models/HeaderData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTierName", "J", "getTierColorHex", "getPoints", "getPointsDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class HeaderData {
    public static final int $stable = 0;
    private final java.lang.String points;
    private final java.lang.String pointsDescription;
    private final long tierColorHex;
    private final java.lang.String tierName;

    public HeaderData(java.lang.String str, long j, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.tierName = str;
        this.tierColorHex = j;
        this.points = str2;
        this.pointsDescription = str3;
    }

    public final java.lang.String getTierName() {
        return this.tierName;
    }

    public final long getTierColorHex() {
        return this.tierColorHex;
    }

    public final java.lang.String getPoints() {
        return this.points;
    }

    public final java.lang.String getPointsDescription() {
        return this.pointsDescription;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.tierName;
        long j = this.tierColorHex;
        java.lang.String str2 = this.points;
        java.lang.String str3 = this.pointsDescription;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HeaderData(tierName=");
        sb.append(str);
        sb.append(", tierColorHex=");
        sb.append(j);
        sb.append(", points=");
        sb.append(str2);
        sb.append(", pointsDescription=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.tierName.hashCode() * 31) + java.lang.Long.hashCode(this.tierColorHex)) * 31) + this.points.hashCode()) * 31) + this.pointsDescription.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.HeaderData)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.HeaderData headerData = (com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.HeaderData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.tierName, headerData.tierName) && this.tierColorHex == headerData.tierColorHex && kotlin.jvm.internal.Intrinsics.areEqual(this.points, headerData.points) && kotlin.jvm.internal.Intrinsics.areEqual(this.pointsDescription, headerData.pointsDescription);
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.HeaderData copy(java.lang.String tierName, long tierColorHex, java.lang.String points, java.lang.String pointsDescription) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tierName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(points, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pointsDescription, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.HeaderData(tierName, tierColorHex, points, pointsDescription);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPointsDescription() {
        return this.pointsDescription;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPoints() {
        return this.points;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTierColorHex() {
        return this.tierColorHex;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTierName() {
        return this.tierName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.HeaderData copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.models.HeaderData headerData, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = headerData.tierName;
        }
        if ((i & 2) != 0) {
            j = headerData.tierColorHex;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = headerData.points;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            str3 = headerData.pointsDescription;
        }
        return headerData.copy(str, j2, str4, str3);
    }
}
