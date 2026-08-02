package com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetails;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;", "success", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/ApplicationDecline;", "decline", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/ApplicationDecline;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/ApplicationDecline;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/ApplicationDecline;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;", "getSuccess", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/ApplicationDecline;", "getDecline"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SubmitVirtualCardApplicationDetails {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline decline;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess success;

    public SubmitVirtualCardApplicationDetails(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess, com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline applicationDecline) {
        this.success = submitVirtualCardApplicationDetailsSuccess;
        this.decline = applicationDecline;
    }

    public /* synthetic */ SubmitVirtualCardApplicationDetails(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess, com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline applicationDecline, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : submitVirtualCardApplicationDetailsSuccess, (i & 2) != 0 ? null : applicationDecline);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess getSuccess() {
        return this.success;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline getDecline() {
        return this.decline;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess = this.success;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline applicationDecline = this.decline;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubmitVirtualCardApplicationDetails(success=");
        sb.append(submitVirtualCardApplicationDetailsSuccess);
        sb.append(", decline=");
        sb.append(applicationDecline);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess = this.success;
        int hashCode = submitVirtualCardApplicationDetailsSuccess == null ? 0 : submitVirtualCardApplicationDetailsSuccess.hashCode();
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline applicationDecline = this.decline;
        return (hashCode * 31) + (applicationDecline != null ? applicationDecline.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails submitVirtualCardApplicationDetails = (com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.success, submitVirtualCardApplicationDetails.success) && kotlin.jvm.internal.Intrinsics.areEqual(this.decline, submitVirtualCardApplicationDetails.decline);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails copy(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess success, com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline decline) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails(success, decline);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline getDecline() {
        return this.decline;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess getSuccess() {
        return this.success;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails submitVirtualCardApplicationDetails, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess, com.paypal.oslo.feature.bnplacquisition.domain.model.common.ApplicationDecline applicationDecline, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            submitVirtualCardApplicationDetailsSuccess = submitVirtualCardApplicationDetails.success;
        }
        if ((i & 2) != 0) {
            applicationDecline = submitVirtualCardApplicationDetails.decline;
        }
        return submitVirtualCardApplicationDetails.copy(submitVirtualCardApplicationDetailsSuccess, applicationDecline);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubmitVirtualCardApplicationDetails() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
