package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RedeemPointsToCharityInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RewardPointsInput;", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "", "charityId", "idempotencyKey", "", "shareContactConsent", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RewardPointsInput;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RewardPointsInput;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Z", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RewardPointsInput;Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/api/graphql/schema/type/RedeemPointsToCharityInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/RewardPointsInput;", "getPoints", "Ljava/lang/String;", "getCharityId", "getIdempotencyKey", "Z", "getShareContactConsent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RedeemPointsToCharityInput {
    private final java.lang.String charityId;
    private final java.lang.String idempotencyKey;
    private final com.paypal.oslo.api.graphql.schema.type.RewardPointsInput points;
    private final boolean shareContactConsent;

    public RedeemPointsToCharityInput(com.paypal.oslo.api.graphql.schema.type.RewardPointsInput rewardPointsInput, java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardPointsInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.points = rewardPointsInput;
        this.charityId = str;
        this.idempotencyKey = str2;
        this.shareContactConsent = z;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RewardPointsInput getPoints() {
        return this.points;
    }

    public final java.lang.String getCharityId() {
        return this.charityId;
    }

    public final java.lang.String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    public final boolean getShareContactConsent() {
        return this.shareContactConsent;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RewardPointsInput rewardPointsInput = this.points;
        java.lang.String str = this.charityId;
        java.lang.String str2 = this.idempotencyKey;
        boolean z = this.shareContactConsent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RedeemPointsToCharityInput(points=");
        sb.append(rewardPointsInput);
        sb.append(", charityId=");
        sb.append(str);
        sb.append(", idempotencyKey=");
        sb.append(str2);
        sb.append(", shareContactConsent=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.points.hashCode() * 31) + this.charityId.hashCode()) * 31) + this.idempotencyKey.hashCode()) * 31) + java.lang.Boolean.hashCode(this.shareContactConsent);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RedeemPointsToCharityInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RedeemPointsToCharityInput redeemPointsToCharityInput = (com.paypal.oslo.api.graphql.schema.type.RedeemPointsToCharityInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.points, redeemPointsToCharityInput.points) && kotlin.jvm.internal.Intrinsics.areEqual(this.charityId, redeemPointsToCharityInput.charityId) && kotlin.jvm.internal.Intrinsics.areEqual(this.idempotencyKey, redeemPointsToCharityInput.idempotencyKey) && this.shareContactConsent == redeemPointsToCharityInput.shareContactConsent;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RedeemPointsToCharityInput copy(com.paypal.oslo.api.graphql.schema.type.RewardPointsInput points, java.lang.String charityId, java.lang.String idempotencyKey, boolean shareContactConsent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(points, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charityId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idempotencyKey, "");
        return new com.paypal.oslo.api.graphql.schema.type.RedeemPointsToCharityInput(points, charityId, idempotencyKey, shareContactConsent);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShareContactConsent() {
        return this.shareContactConsent;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCharityId() {
        return this.charityId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RewardPointsInput getPoints() {
        return this.points;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RedeemPointsToCharityInput copy$default(com.paypal.oslo.api.graphql.schema.type.RedeemPointsToCharityInput redeemPointsToCharityInput, com.paypal.oslo.api.graphql.schema.type.RewardPointsInput rewardPointsInput, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            rewardPointsInput = redeemPointsToCharityInput.points;
        }
        if ((i & 2) != 0) {
            str = redeemPointsToCharityInput.charityId;
        }
        if ((i & 4) != 0) {
            str2 = redeemPointsToCharityInput.idempotencyKey;
        }
        if ((i & 8) != 0) {
            z = redeemPointsToCharityInput.shareContactConsent;
        }
        return redeemPointsToCharityInput.copy(rewardPointsInput, str, str2, z);
    }
}
