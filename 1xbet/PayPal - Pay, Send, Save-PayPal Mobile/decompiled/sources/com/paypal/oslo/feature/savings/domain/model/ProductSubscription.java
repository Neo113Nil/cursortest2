package com.paypal.oslo.feature.savings.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/ProductSubscription;", "", "", "id", "status", "Lcom/paypal/oslo/feature/savings/domain/model/IneligibilityReason;", "ineligibilityReason", "Lcom/paypal/oslo/feature/savings/domain/model/OnboardingProperties;", "onboardingProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/IneligibilityReason;Lcom/paypal/oslo/feature/savings/domain/model/OnboardingProperties;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/savings/domain/model/IneligibilityReason;", "component4", "()Lcom/paypal/oslo/feature/savings/domain/model/OnboardingProperties;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/IneligibilityReason;Lcom/paypal/oslo/feature/savings/domain/model/OnboardingProperties;)Lcom/paypal/oslo/feature/savings/domain/model/ProductSubscription;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getStatus", "Lcom/paypal/oslo/feature/savings/domain/model/IneligibilityReason;", "getIneligibilityReason", "Lcom/paypal/oslo/feature/savings/domain/model/OnboardingProperties;", "getOnboardingProperties"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ProductSubscription {
    public static final int $stable = 8;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.savings.domain.model.IneligibilityReason ineligibilityReason;
    private final com.paypal.oslo.feature.savings.domain.model.OnboardingProperties onboardingProperties;
    private final java.lang.String status;

    public ProductSubscription(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.IneligibilityReason ineligibilityReason, com.paypal.oslo.feature.savings.domain.model.OnboardingProperties onboardingProperties) {
        this.id = str;
        this.status = str2;
        this.ineligibilityReason = ineligibilityReason;
        this.onboardingProperties = onboardingProperties;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.savings.domain.model.IneligibilityReason getIneligibilityReason() {
        return this.ineligibilityReason;
    }

    public final com.paypal.oslo.feature.savings.domain.model.OnboardingProperties getOnboardingProperties() {
        return this.onboardingProperties;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.status;
        com.paypal.oslo.feature.savings.domain.model.IneligibilityReason ineligibilityReason = this.ineligibilityReason;
        com.paypal.oslo.feature.savings.domain.model.OnboardingProperties onboardingProperties = this.onboardingProperties;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProductSubscription(id=");
        sb.append(str);
        sb.append(", status=");
        sb.append(str2);
        sb.append(", ineligibilityReason=");
        sb.append(ineligibilityReason);
        sb.append(", onboardingProperties=");
        sb.append(onboardingProperties);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.id;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.status;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.savings.domain.model.IneligibilityReason ineligibilityReason = this.ineligibilityReason;
        int hashCode3 = ineligibilityReason == null ? 0 : ineligibilityReason.hashCode();
        com.paypal.oslo.feature.savings.domain.model.OnboardingProperties onboardingProperties = this.onboardingProperties;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (onboardingProperties != null ? onboardingProperties.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.ProductSubscription)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.ProductSubscription productSubscription = (com.paypal.oslo.feature.savings.domain.model.ProductSubscription) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, productSubscription.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, productSubscription.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.ineligibilityReason, productSubscription.ineligibilityReason) && kotlin.jvm.internal.Intrinsics.areEqual(this.onboardingProperties, productSubscription.onboardingProperties);
    }

    public final com.paypal.oslo.feature.savings.domain.model.ProductSubscription copy(java.lang.String id, java.lang.String status, com.paypal.oslo.feature.savings.domain.model.IneligibilityReason ineligibilityReason, com.paypal.oslo.feature.savings.domain.model.OnboardingProperties onboardingProperties) {
        return new com.paypal.oslo.feature.savings.domain.model.ProductSubscription(id, status, ineligibilityReason, onboardingProperties);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.OnboardingProperties getOnboardingProperties() {
        return this.onboardingProperties;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.IneligibilityReason getIneligibilityReason() {
        return this.ineligibilityReason;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.ProductSubscription copy$default(com.paypal.oslo.feature.savings.domain.model.ProductSubscription productSubscription, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.IneligibilityReason ineligibilityReason, com.paypal.oslo.feature.savings.domain.model.OnboardingProperties onboardingProperties, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = productSubscription.id;
        }
        if ((i & 2) != 0) {
            str2 = productSubscription.status;
        }
        if ((i & 4) != 0) {
            ineligibilityReason = productSubscription.ineligibilityReason;
        }
        if ((i & 8) != 0) {
            onboardingProperties = productSubscription.onboardingProperties;
        }
        return productSubscription.copy(str, str2, ineligibilityReason, onboardingProperties);
    }
}
