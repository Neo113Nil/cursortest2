package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ResolvePlanContingencyInput;", "", "", "id", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData;", "resolution", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData;)Lcom/paypal/oslo/feature/p2p/domain/model/ResolvePlanContingencyInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getFundingOptionId", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData;", "getResolution"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ResolvePlanContingencyInput {
    public static final int $stable = 0;
    private final java.lang.String fundingOptionId;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData resolution;

    public ResolvePlanContingencyInput(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData planContingencyResolutionData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planContingencyResolutionData, "");
        this.id = str;
        this.fundingOptionId = str2;
        this.resolution = planContingencyResolutionData;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getFundingOptionId() {
        return this.fundingOptionId;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData getResolution() {
        return this.resolution;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.fundingOptionId;
        com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData planContingencyResolutionData = this.resolution;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResolvePlanContingencyInput(id=");
        sb.append(str);
        sb.append(", fundingOptionId=");
        sb.append(str2);
        sb.append(", resolution=");
        sb.append(planContingencyResolutionData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.fundingOptionId.hashCode()) * 31) + this.resolution.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput resolvePlanContingencyInput = (com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, resolvePlanContingencyInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptionId, resolvePlanContingencyInput.fundingOptionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.resolution, resolvePlanContingencyInput.resolution);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput copy(java.lang.String id, java.lang.String fundingOptionId, com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData resolution) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolution, "");
        return new com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput(id, fundingOptionId, resolution);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData getResolution() {
        return this.resolution;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFundingOptionId() {
        return this.fundingOptionId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput copy$default(com.paypal.oslo.feature.p2p.domain.model.ResolvePlanContingencyInput resolvePlanContingencyInput, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData planContingencyResolutionData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = resolvePlanContingencyInput.id;
        }
        if ((i & 2) != 0) {
            str2 = resolvePlanContingencyInput.fundingOptionId;
        }
        if ((i & 4) != 0) {
            planContingencyResolutionData = resolvePlanContingencyInput.resolution;
        }
        return resolvePlanContingencyInput.copy(str, str2, planContingencyResolutionData);
    }
}
