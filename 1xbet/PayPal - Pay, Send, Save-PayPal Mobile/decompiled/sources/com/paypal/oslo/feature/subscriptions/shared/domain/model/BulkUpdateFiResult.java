package com.paypal.oslo.feature.subscriptions.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ6\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0011\u0010\u001e\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\"\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b!\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/BulkUpdateFiResult;", "", "", "", "successfulAgreementIds", "", "failedAgreements", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/util/List;Ljava/util/Map;)Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/BulkUpdateFiResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSuccessfulAgreementIds", "Ljava/util/Map;", "getFailedAgreements", "getHasFailures", "()Z", "hasFailures", "getAllSuccess", "allSuccess", "getAllFailed", "allFailed"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BulkUpdateFiResult {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.String, java.lang.String> failedAgreements;
    private final java.util.List<java.lang.String> successfulAgreementIds;

    public BulkUpdateFiResult(java.util.List<java.lang.String> list, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.successfulAgreementIds = list;
        this.failedAgreements = map;
    }

    public final java.util.List<java.lang.String> getSuccessfulAgreementIds() {
        return this.successfulAgreementIds;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getFailedAgreements() {
        return this.failedAgreements;
    }

    public final boolean getHasFailures() {
        return !this.failedAgreements.isEmpty();
    }

    public final boolean getAllSuccess() {
        return this.failedAgreements.isEmpty() && !this.successfulAgreementIds.isEmpty();
    }

    public final boolean getAllFailed() {
        return this.successfulAgreementIds.isEmpty() && !this.failedAgreements.isEmpty();
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.String> list = this.successfulAgreementIds;
        java.util.Map<java.lang.String, java.lang.String> map = this.failedAgreements;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BulkUpdateFiResult(successfulAgreementIds=");
        sb.append(list);
        sb.append(", failedAgreements=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.successfulAgreementIds.hashCode() * 31) + this.failedAgreements.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult bulkUpdateFiResult = (com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.successfulAgreementIds, bulkUpdateFiResult.successfulAgreementIds) && kotlin.jvm.internal.Intrinsics.areEqual(this.failedAgreements, bulkUpdateFiResult.failedAgreements);
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult copy(java.util.List<java.lang.String> successfulAgreementIds, java.util.Map<java.lang.String, java.lang.String> failedAgreements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successfulAgreementIds, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedAgreements, "");
        return new com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult(successfulAgreementIds, failedAgreements);
    }

    public final java.util.Map<java.lang.String, java.lang.String> component2() {
        return this.failedAgreements;
    }

    public final java.util.List<java.lang.String> component1() {
        return this.successfulAgreementIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult copy$default(com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult bulkUpdateFiResult, java.util.List list, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = bulkUpdateFiResult.successfulAgreementIds;
        }
        if ((i & 2) != 0) {
            map = bulkUpdateFiResult.failedAgreements;
        }
        return bulkUpdateFiResult.copy(list, map);
    }
}
