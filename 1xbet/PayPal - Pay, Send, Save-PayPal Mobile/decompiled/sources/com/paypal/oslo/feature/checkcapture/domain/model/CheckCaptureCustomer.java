package com.paypal.oslo.feature.checkcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureCustomer;", "", "", "id", "Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureCustomerStatus;", "status", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureCustomerStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureCustomerStatus;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureCustomerStatus;)Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureCustomer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/checkcapture/domain/model/CheckCaptureCustomerStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CheckCaptureCustomer {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus status;

    public CheckCaptureCustomer(java.lang.String str, com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus checkCaptureCustomerStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCaptureCustomerStatus, "");
        this.id = str;
        this.status = checkCaptureCustomerStatus;
        if (kotlin.text.StringsKt.isBlank(str)) {
            throw new java.lang.IllegalArgumentException("Customer ID cannot be blank".toString());
        }
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus getStatus() {
        return this.status;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus checkCaptureCustomerStatus = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CheckCaptureCustomer(id=");
        sb.append(str);
        sb.append(", status=");
        sb.append(checkCaptureCustomerStatus);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.id.hashCode() * 31) + this.status.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomer)) {
            return false;
        }
        com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomer checkCaptureCustomer = (com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomer) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, checkCaptureCustomer.id) && this.status == checkCaptureCustomer.status;
    }

    public final com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomer copy(java.lang.String id, com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomer(id, status);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomer copy$default(com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomer checkCaptureCustomer, java.lang.String str, com.paypal.oslo.feature.checkcapture.domain.model.CheckCaptureCustomerStatus checkCaptureCustomerStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = checkCaptureCustomer.id;
        }
        if ((i & 2) != 0) {
            checkCaptureCustomerStatus = checkCaptureCustomer.status;
        }
        return checkCaptureCustomer.copy(str, checkCaptureCustomerStatus);
    }
}
