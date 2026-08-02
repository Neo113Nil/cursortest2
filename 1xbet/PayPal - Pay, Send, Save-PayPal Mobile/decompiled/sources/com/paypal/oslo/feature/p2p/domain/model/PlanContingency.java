package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingency;", "", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyAction;", "action", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyStatus;", "status", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails;", "details", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyAction;Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyStatus;Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyAction;", "component2", "()Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyStatus;", "component3", "()Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyAction;Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyStatus;Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails;)Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyAction;", "getAction", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyStatus;", "getStatus", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails;", "getDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlanContingency {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction action;
    private final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails details;
    private final com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus status;

    public PlanContingency(com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction planContingencyAction, com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus contingencyStatus, com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails planContingencyDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planContingencyAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyStatus, "");
        this.action = planContingencyAction;
        this.status = contingencyStatus;
        this.details = planContingencyDetails;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction getAction() {
        return this.action;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails getDetails() {
        return this.details;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction planContingencyAction = this.action;
        com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus contingencyStatus = this.status;
        com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails planContingencyDetails = this.details;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanContingency(action=");
        sb.append(planContingencyAction);
        sb.append(", status=");
        sb.append(contingencyStatus);
        sb.append(", details=");
        sb.append(planContingencyDetails);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode();
        int hashCode2 = this.status.hashCode();
        com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails planContingencyDetails = this.details;
        return (((hashCode * 31) + hashCode2) * 31) + (planContingencyDetails == null ? 0 : planContingencyDetails.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingency)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.PlanContingency planContingency = (com.paypal.oslo.feature.p2p.domain.model.PlanContingency) other;
        return this.action == planContingency.action && this.status == planContingency.status && kotlin.jvm.internal.Intrinsics.areEqual(this.details, planContingency.details);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.PlanContingency copy(com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction action, com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus status, com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails details) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.p2p.domain.model.PlanContingency(action, status, details);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails getDetails() {
        return this.details;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction getAction() {
        return this.action;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PlanContingency copy$default(com.paypal.oslo.feature.p2p.domain.model.PlanContingency planContingency, com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction planContingencyAction, com.paypal.oslo.feature.p2p.domain.model.ContingencyStatus contingencyStatus, com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails planContingencyDetails, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            planContingencyAction = planContingency.action;
        }
        if ((i & 2) != 0) {
            contingencyStatus = planContingency.status;
        }
        if ((i & 4) != 0) {
            planContingencyDetails = planContingency.details;
        }
        return planContingency.copy(planContingencyAction, contingencyStatus, planContingencyDetails);
    }
}
