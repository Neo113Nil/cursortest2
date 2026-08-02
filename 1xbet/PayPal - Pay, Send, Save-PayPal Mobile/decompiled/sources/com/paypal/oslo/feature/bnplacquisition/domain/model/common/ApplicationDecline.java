package com.paypal.oslo.feature.bnplacquisition.domain.model.common;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/ApplicationDecline;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DeclineReason;", "reason", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DeclineReason;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DeclineReason;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DeclineReason;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/ApplicationDecline;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/DeclineReason;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ApplicationDecline {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason reason;

    public ApplicationDecline(com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declineReason, "");
        this.reason = declineReason;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason getReason() {
        return this.reason;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason = this.reason;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ApplicationDecline(reason=");
        sb.append(declineReason);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.reason.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline) && this.reason == ((com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline) other).reason;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline copy(com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline(reason);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason getReason() {
        return this.reason;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline applicationDecline, com.paypal.oslo.feature.bnplacquisition.domain.model.common.DeclineReason declineReason, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            declineReason = applicationDecline.reason;
        }
        return applicationDecline.copy(declineReason);
    }
}
