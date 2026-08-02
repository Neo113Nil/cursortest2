package com.paypal.oslo.feature.bnplacquisition.domain.model.requests;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/ExperienceSessionRequest;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowSpecifier;", "flowSpecifier", "", "usageChannel", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowOutcome;", "flowOutcome", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowSpecifier;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowOutcome;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowSpecifier;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowOutcome;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowSpecifier;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowOutcome;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/ExperienceSessionRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowSpecifier;", "getFlowSpecifier", "Ljava/lang/String;", "getUsageChannel", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowOutcome;", "getFlowOutcome"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ExperienceSessionRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome flowOutcome;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier flowSpecifier;
    private final java.lang.String usageChannel;

    public ExperienceSessionRequest(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier flowSpecifier, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome flowOutcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowSpecifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowOutcome, "");
        this.flowSpecifier = flowSpecifier;
        this.usageChannel = str;
        this.flowOutcome = flowOutcome;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier getFlowSpecifier() {
        return this.flowSpecifier;
    }

    public final java.lang.String getUsageChannel() {
        return this.usageChannel;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome getFlowOutcome() {
        return this.flowOutcome;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier flowSpecifier = this.flowSpecifier;
        java.lang.String str = this.usageChannel;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome flowOutcome = this.flowOutcome;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExperienceSessionRequest(flowSpecifier=");
        sb.append(flowSpecifier);
        sb.append(", usageChannel=");
        sb.append(str);
        sb.append(", flowOutcome=");
        sb.append(flowOutcome);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.flowSpecifier.hashCode() * 31) + this.usageChannel.hashCode()) * 31) + this.flowOutcome.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ExperienceSessionRequest)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ExperienceSessionRequest experienceSessionRequest = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ExperienceSessionRequest) other;
        return this.flowSpecifier == experienceSessionRequest.flowSpecifier && kotlin.jvm.internal.Intrinsics.areEqual(this.usageChannel, experienceSessionRequest.usageChannel) && this.flowOutcome == experienceSessionRequest.flowOutcome;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ExperienceSessionRequest copy(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier flowSpecifier, java.lang.String usageChannel, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome flowOutcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowSpecifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(usageChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowOutcome, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ExperienceSessionRequest(flowSpecifier, usageChannel, flowOutcome);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome getFlowOutcome() {
        return this.flowOutcome;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUsageChannel() {
        return this.usageChannel;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier getFlowSpecifier() {
        return this.flowSpecifier;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ExperienceSessionRequest copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ExperienceSessionRequest experienceSessionRequest, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier flowSpecifier, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowOutcome flowOutcome, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            flowSpecifier = experienceSessionRequest.flowSpecifier;
        }
        if ((i & 2) != 0) {
            str = experienceSessionRequest.usageChannel;
        }
        if ((i & 4) != 0) {
            flowOutcome = experienceSessionRequest.flowOutcome;
        }
        return experienceSessionRequest.copy(flowSpecifier, str, flowOutcome);
    }
}
