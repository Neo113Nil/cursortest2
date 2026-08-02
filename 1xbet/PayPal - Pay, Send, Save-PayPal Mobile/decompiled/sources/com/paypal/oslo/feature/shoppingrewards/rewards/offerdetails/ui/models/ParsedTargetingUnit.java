package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/ParsedTargetingUnit;", "", "", "touchpointId", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "offerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/ParsedTargetingUnit;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTouchpointId", "getPlatform", "getOfferId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ParsedTargetingUnit {
    public static final int $stable = 0;
    private final java.lang.String offerId;
    private final java.lang.String platform;
    private final java.lang.String touchpointId;

    public ParsedTargetingUnit(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.touchpointId = str;
        this.platform = str2;
        this.offerId = str3;
    }

    public final java.lang.String getTouchpointId() {
        return this.touchpointId;
    }

    public final java.lang.String getPlatform() {
        return this.platform;
    }

    public final java.lang.String getOfferId() {
        return this.offerId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.touchpointId;
        java.lang.String str2 = this.platform;
        java.lang.String str3 = this.offerId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParsedTargetingUnit(touchpointId=");
        sb.append(str);
        sb.append(", platform=");
        sb.append(str2);
        sb.append(", offerId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.touchpointId.hashCode() * 31) + this.platform.hashCode()) * 31) + this.offerId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.ParsedTargetingUnit)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.ParsedTargetingUnit parsedTargetingUnit = (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.ParsedTargetingUnit) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.touchpointId, parsedTargetingUnit.touchpointId) && kotlin.jvm.internal.Intrinsics.areEqual(this.platform, parsedTargetingUnit.platform) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerId, parsedTargetingUnit.offerId);
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.ParsedTargetingUnit copy(java.lang.String touchpointId, java.lang.String platform, java.lang.String offerId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchpointId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.ParsedTargetingUnit(touchpointId, platform, offerId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getOfferId() {
        return this.offerId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPlatform() {
        return this.platform;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTouchpointId() {
        return this.touchpointId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.ParsedTargetingUnit copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.ParsedTargetingUnit parsedTargetingUnit, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = parsedTargetingUnit.touchpointId;
        }
        if ((i & 2) != 0) {
            str2 = parsedTargetingUnit.platform;
        }
        if ((i & 4) != 0) {
            str3 = parsedTargetingUnit.offerId;
        }
        return parsedTargetingUnit.copy(str, str2, str3);
    }
}
