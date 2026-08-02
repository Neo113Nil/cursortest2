package com.paypal.oslo.feature.savings.domain.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/OnboardingProperties;", "", "", "showDocUpload", "", "Lcom/paypal/oslo/feature/savings/domain/model/Policy;", "policies", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lcom/paypal/oslo/feature/savings/domain/model/OnboardingProperties;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getShowDocUpload", "Ljava/util/List;", "getPolicies"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnboardingProperties {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.savings.domain.model.Policy> policies;
    private final java.lang.Boolean showDocUpload;

    public OnboardingProperties(java.lang.Boolean bool, java.util.List<com.paypal.oslo.feature.savings.domain.model.Policy> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.showDocUpload = bool;
        this.policies = list;
    }

    public final java.lang.Boolean getShowDocUpload() {
        return this.showDocUpload;
    }

    public final java.util.List<com.paypal.oslo.feature.savings.domain.model.Policy> getPolicies() {
        return this.policies;
    }

    public final java.lang.String toString() {
        java.lang.Boolean bool = this.showDocUpload;
        java.util.List<com.paypal.oslo.feature.savings.domain.model.Policy> list = this.policies;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardingProperties(showDocUpload=");
        sb.append(bool);
        sb.append(", policies=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Boolean bool = this.showDocUpload;
        return ((bool == null ? 0 : bool.hashCode()) * 31) + this.policies.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.OnboardingProperties)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.OnboardingProperties onboardingProperties = (com.paypal.oslo.feature.savings.domain.model.OnboardingProperties) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.showDocUpload, onboardingProperties.showDocUpload) && kotlin.jvm.internal.Intrinsics.areEqual(this.policies, onboardingProperties.policies);
    }

    public final com.paypal.oslo.feature.savings.domain.model.OnboardingProperties copy(java.lang.Boolean showDocUpload, java.util.List<com.paypal.oslo.feature.savings.domain.model.Policy> policies) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(policies, "");
        return new com.paypal.oslo.feature.savings.domain.model.OnboardingProperties(showDocUpload, policies);
    }

    public final java.util.List<com.paypal.oslo.feature.savings.domain.model.Policy> component2() {
        return this.policies;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Boolean getShowDocUpload() {
        return this.showDocUpload;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.OnboardingProperties copy$default(com.paypal.oslo.feature.savings.domain.model.OnboardingProperties onboardingProperties, java.lang.Boolean bool, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = onboardingProperties.showDocUpload;
        }
        if ((i & 2) != 0) {
            list = onboardingProperties.policies;
        }
        return onboardingProperties.copy(bool, list);
    }
}
