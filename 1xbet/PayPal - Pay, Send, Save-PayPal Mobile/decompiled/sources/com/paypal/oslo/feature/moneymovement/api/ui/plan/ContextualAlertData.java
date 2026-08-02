package com.paypal.oslo.feature.moneymovement.api.ui.plan;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/ContextualAlertData;", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureAlertType;", "type", "", "message", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureAlertType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureAlertType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureAlertType;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/ContextualAlertData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureAlertType;", "getType", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ContextualAlertData {
    public static final int $stable = 0;
    private final java.lang.String message;
    private final com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType type;

    public ContextualAlertData(com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType planDisclosureAlertType, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planDisclosureAlertType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = planDisclosureAlertType;
        this.message = str;
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType getType() {
        return this.type;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType planDisclosureAlertType = this.type;
        java.lang.String str = this.message;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContextualAlertData(type=");
        sb.append(planDisclosureAlertType);
        sb.append(", message=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.type.hashCode() * 31) + this.message.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.ui.plan.ContextualAlertData)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.ui.plan.ContextualAlertData contextualAlertData = (com.paypal.oslo.feature.moneymovement.api.ui.plan.ContextualAlertData) other;
        return this.type == contextualAlertData.type && kotlin.jvm.internal.Intrinsics.areEqual(this.message, contextualAlertData.message);
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.plan.ContextualAlertData copy(com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType type, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        return new com.paypal.oslo.feature.moneymovement.api.ui.plan.ContextualAlertData(type, message);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.plan.ContextualAlertData copy$default(com.paypal.oslo.feature.moneymovement.api.ui.plan.ContextualAlertData contextualAlertData, com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType planDisclosureAlertType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            planDisclosureAlertType = contextualAlertData.type;
        }
        if ((i & 2) != 0) {
            str = contextualAlertData.message;
        }
        return contextualAlertData.copy(planDisclosureAlertType, str);
    }
}
