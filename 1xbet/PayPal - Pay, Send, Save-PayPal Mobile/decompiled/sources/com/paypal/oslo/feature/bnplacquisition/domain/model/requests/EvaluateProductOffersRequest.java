package com.paypal.oslo.feature.bnplacquisition.domain.model.requests;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/EvaluateProductOffersRequest;", "", "", "applicationSessionId", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "amount", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/EvaluateProductOffersRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getApplicationSessionId", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/Money;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class EvaluateProductOffersRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money amount;
    private final java.lang.String applicationSessionId;

    public EvaluateProductOffersRequest(java.lang.String str, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        this.applicationSessionId = str;
        this.amount = money;
    }

    public final java.lang.String getApplicationSessionId() {
        return this.applicationSessionId;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getAmount() {
        return this.amount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.applicationSessionId;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EvaluateProductOffersRequest(applicationSessionId=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(money);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.applicationSessionId.hashCode() * 31) + this.amount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.requests.EvaluateProductOffersRequest)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.EvaluateProductOffersRequest evaluateProductOffersRequest = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.EvaluateProductOffersRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.applicationSessionId, evaluateProductOffersRequest.applicationSessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, evaluateProductOffersRequest.amount);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.EvaluateProductOffersRequest copy(java.lang.String applicationSessionId, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationSessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.EvaluateProductOffersRequest(applicationSessionId, amount);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getApplicationSessionId() {
        return this.applicationSessionId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.EvaluateProductOffersRequest copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.EvaluateProductOffersRequest evaluateProductOffersRequest, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.domain.model.common.Money money, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = evaluateProductOffersRequest.applicationSessionId;
        }
        if ((i & 2) != 0) {
            money = evaluateProductOffersRequest.amount;
        }
        return evaluateProductOffersRequest.copy(str, money);
    }
}
