package com.paypal.oslo.feature.bnplacquisition.domain.model.requests;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/LoanConstraintsRequest;", "", "", "applicationSessionId", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "creditProductIdentifiers", "", "includePrequalSummary", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/util/List;Z)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/LoanConstraintsRequest;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getApplicationSessionId", "Ljava/util/List;", "getCreditProductIdentifiers", "Z", "getIncludePrequalSummary"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LoanConstraintsRequest {
    public static final int $stable = 8;
    private final java.lang.String applicationSessionId;
    private final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> creditProductIdentifiers;
    private final boolean includePrequalSummary;

    /* JADX WARN: Multi-variable type inference failed */
    public LoanConstraintsRequest(java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.applicationSessionId = str;
        this.creditProductIdentifiers = list;
        this.includePrequalSummary = z;
    }

    public /* synthetic */ LoanConstraintsRequest(java.lang.String str, java.util.List list, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? false : z);
    }

    public final java.lang.String getApplicationSessionId() {
        return this.applicationSessionId;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> getCreditProductIdentifiers() {
        return this.creditProductIdentifiers;
    }

    public final boolean getIncludePrequalSummary() {
        return this.includePrequalSummary;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.applicationSessionId;
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> list = this.creditProductIdentifiers;
        boolean z = this.includePrequalSummary;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LoanConstraintsRequest(applicationSessionId=");
        sb.append(str);
        sb.append(", creditProductIdentifiers=");
        sb.append(list);
        sb.append(", includePrequalSummary=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.applicationSessionId.hashCode() * 31) + this.creditProductIdentifiers.hashCode()) * 31) + java.lang.Boolean.hashCode(this.includePrequalSummary);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest loanConstraintsRequest = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.applicationSessionId, loanConstraintsRequest.applicationSessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditProductIdentifiers, loanConstraintsRequest.creditProductIdentifiers) && this.includePrequalSummary == loanConstraintsRequest.includePrequalSummary;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest copy(java.lang.String applicationSessionId, java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> creditProductIdentifiers, boolean includePrequalSummary) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationSessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifiers, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest(applicationSessionId, creditProductIdentifiers, includePrequalSummary);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIncludePrequalSummary() {
        return this.includePrequalSummary;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> component2() {
        return this.creditProductIdentifiers;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getApplicationSessionId() {
        return this.applicationSessionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.LoanConstraintsRequest loanConstraintsRequest, java.lang.String str, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = loanConstraintsRequest.applicationSessionId;
        }
        if ((i & 2) != 0) {
            list = loanConstraintsRequest.creditProductIdentifiers;
        }
        if ((i & 4) != 0) {
            z = loanConstraintsRequest.includePrequalSummary;
        }
        return loanConstraintsRequest.copy(str, list, z);
    }
}
