package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/EnrollInPromotionOfferInput;", "", "", "offerId", "touchpointId", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionPlatform;", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PromotionPlatform;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/PromotionPlatform;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PromotionPlatform;)Lcom/paypal/oslo/api/graphql/schema/type/EnrollInPromotionOfferInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOfferId", "getTouchpointId", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionPlatform;", "getPlatform"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EnrollInPromotionOfferInput {
    private final java.lang.String offerId;
    private final com.paypal.oslo.api.graphql.schema.type.PromotionPlatform platform;
    private final java.lang.String touchpointId;

    public EnrollInPromotionOfferInput(java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.PromotionPlatform promotionPlatform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionPlatform, "");
        this.offerId = str;
        this.touchpointId = str2;
        this.platform = promotionPlatform;
    }

    public final java.lang.String getOfferId() {
        return this.offerId;
    }

    public final java.lang.String getTouchpointId() {
        return this.touchpointId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PromotionPlatform getPlatform() {
        return this.platform;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.offerId;
        java.lang.String str2 = this.touchpointId;
        com.paypal.oslo.api.graphql.schema.type.PromotionPlatform promotionPlatform = this.platform;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EnrollInPromotionOfferInput(offerId=");
        sb.append(str);
        sb.append(", touchpointId=");
        sb.append(str2);
        sb.append(", platform=");
        sb.append(promotionPlatform);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.offerId.hashCode() * 31) + this.touchpointId.hashCode()) * 31) + this.platform.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput enrollInPromotionOfferInput = (com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.offerId, enrollInPromotionOfferInput.offerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.touchpointId, enrollInPromotionOfferInput.touchpointId) && this.platform == enrollInPromotionOfferInput.platform;
    }

    public final com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput copy(java.lang.String offerId, java.lang.String touchpointId, com.paypal.oslo.api.graphql.schema.type.PromotionPlatform platform) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchpointId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
        return new com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput(offerId, touchpointId, platform);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PromotionPlatform getPlatform() {
        return this.platform;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTouchpointId() {
        return this.touchpointId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getOfferId() {
        return this.offerId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput copy$default(com.paypal.oslo.api.graphql.schema.type.EnrollInPromotionOfferInput enrollInPromotionOfferInput, java.lang.String str, java.lang.String str2, com.paypal.oslo.api.graphql.schema.type.PromotionPlatform promotionPlatform, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = enrollInPromotionOfferInput.offerId;
        }
        if ((i & 2) != 0) {
            str2 = enrollInPromotionOfferInput.touchpointId;
        }
        if ((i & 4) != 0) {
            promotionPlatform = enrollInPromotionOfferInput.platform;
        }
        return enrollInPromotionOfferInput.copy(str, str2, promotionPlatform);
    }
}
