package com.paypal.oslo.feature.bnplacquisition.domain.model.requests;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/BnplPlansRequest;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/BnplPlansFilterOptions;", "filterOptions", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/BnplPlansFilterOptions;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/BnplPlansFilterOptions;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/BnplPlansFilterOptions;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/BnplPlansRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/BnplPlansFilterOptions;", "getFilterOptions", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BnplPlansRequest {
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansFilterOptions filterOptions;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansRequest.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansRequest.Companion(null);
    public static final int $stable = 8;

    public BnplPlansRequest(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansFilterOptions bnplPlansFilterOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bnplPlansFilterOptions, "");
        this.filterOptions = bnplPlansFilterOptions;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansFilterOptions getFilterOptions() {
        return this.filterOptions;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/BnplPlansRequest$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/productselection/CreditProductIdentifier;", "creditProductIdentifiers", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/BnplPlansRequest;", "forAcquisition", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/BnplPlansRequest;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansRequest forAcquisition$default(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansRequest.Companion companion, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = kotlin.collections.CollectionsKt.emptyList();
            }
            return companion.forAcquisition(list);
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansRequest forAcquisition(java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier> creditProductIdentifiers) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifiers, "");
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansRequest(new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansFilterOptions(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplServicingPlanStatus.READY_TO_USE), creditProductIdentifiers, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BnplAccountStatus.PENDING)));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansFilterOptions bnplPlansFilterOptions = this.filterOptions;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplPlansRequest(filterOptions=");
        sb.append(bnplPlansFilterOptions);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.filterOptions.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansRequest) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterOptions, ((com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansRequest) other).filterOptions);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansRequest copy(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansFilterOptions filterOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterOptions, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansRequest(filterOptions);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansFilterOptions getFilterOptions() {
        return this.filterOptions;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansRequest copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansRequest bnplPlansRequest, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansFilterOptions bnplPlansFilterOptions, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bnplPlansFilterOptions = bnplPlansRequest.filterOptions;
        }
        return bnplPlansRequest.copy(bnplPlansFilterOptions);
    }
}
