package com.paypal.oslo.feature.qrc.domain.model.eligibility;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcCapabilityEligibilityStatus;", "", "Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcCapability;", "capability", "Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcEligibilityStatus;", "status", "", "statusReason", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcCapability;Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcEligibilityStatus;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcCapability;", "component2", "()Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcEligibilityStatus;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcCapability;Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcEligibilityStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcCapabilityEligibilityStatus;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcCapability;", "getCapability", "Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcEligibilityStatus;", "getStatus", "Ljava/lang/String;", "getStatusReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class QrcCapabilityEligibilityStatus {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability capability;
    private final com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus status;
    private final java.lang.String statusReason;

    public QrcCapabilityEligibilityStatus(com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability qrcCapability, com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus qrcEligibilityStatus, java.lang.String str) {
        this.capability = qrcCapability;
        this.status = qrcEligibilityStatus;
        this.statusReason = str;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability getCapability() {
        return this.capability;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus getStatus() {
        return this.status;
    }

    public final java.lang.String getStatusReason() {
        return this.statusReason;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability qrcCapability = this.capability;
        com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus qrcEligibilityStatus = this.status;
        java.lang.String str = this.statusReason;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QrcCapabilityEligibilityStatus(capability=");
        sb.append(qrcCapability);
        sb.append(", status=");
        sb.append(qrcEligibilityStatus);
        sb.append(", statusReason=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability qrcCapability = this.capability;
        int hashCode = qrcCapability == null ? 0 : qrcCapability.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus qrcEligibilityStatus = this.status;
        int hashCode2 = qrcEligibilityStatus == null ? 0 : qrcEligibilityStatus.hashCode();
        java.lang.String str = this.statusReason;
        return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcCapabilityEligibilityStatus)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcCapabilityEligibilityStatus qrcCapabilityEligibilityStatus = (com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcCapabilityEligibilityStatus) other;
        return this.capability == qrcCapabilityEligibilityStatus.capability && this.status == qrcCapabilityEligibilityStatus.status && kotlin.jvm.internal.Intrinsics.areEqual(this.statusReason, qrcCapabilityEligibilityStatus.statusReason);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcCapabilityEligibilityStatus copy(com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability capability, com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus status, java.lang.String statusReason) {
        return new com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcCapabilityEligibilityStatus(capability, status, statusReason);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getStatusReason() {
        return this.statusReason;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability getCapability() {
        return this.capability;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcCapabilityEligibilityStatus copy$default(com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcCapabilityEligibilityStatus qrcCapabilityEligibilityStatus, com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability qrcCapability, com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus qrcEligibilityStatus, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qrcCapability = qrcCapabilityEligibilityStatus.capability;
        }
        if ((i & 2) != 0) {
            qrcEligibilityStatus = qrcCapabilityEligibilityStatus.status;
        }
        if ((i & 4) != 0) {
            str = qrcCapabilityEligibilityStatus.statusReason;
        }
        return qrcCapabilityEligibilityStatus.copy(qrcCapability, qrcEligibilityStatus, str);
    }
}
