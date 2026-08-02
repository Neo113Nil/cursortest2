package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleEligibilityInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleProductExperienceInput;", "productExperience", "", "includePreEligibilityDecision", "<init>", "(Lcom/apollographql/apollo/api/Optional;Z)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "()Z", "copy", "(Lcom/apollographql/apollo/api/Optional;Z)Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleEligibilityInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getProductExperience", "Z", "getIncludePreEligibilityDecision"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BalanceBundleEligibilityInput {
    private final boolean includePreEligibilityDecision;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductExperienceInput> productExperience;

    public BalanceBundleEligibilityInput(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductExperienceInput> optional, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.productExperience = optional;
        this.includePreEligibilityDecision = z;
    }

    public /* synthetic */ BalanceBundleEligibilityInput(com.apollographql.apollo.api.Optional.Absent absent, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, z);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductExperienceInput> getProductExperience() {
        return this.productExperience;
    }

    public final boolean getIncludePreEligibilityDecision() {
        return this.includePreEligibilityDecision;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductExperienceInput> optional = this.productExperience;
        boolean z = this.includePreEligibilityDecision;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceBundleEligibilityInput(productExperience=");
        sb.append(optional);
        sb.append(", includePreEligibilityDecision=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.productExperience.hashCode() * 31) + java.lang.Boolean.hashCode(this.includePreEligibilityDecision);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityInput balanceBundleEligibilityInput = (com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.productExperience, balanceBundleEligibilityInput.productExperience) && this.includePreEligibilityDecision == balanceBundleEligibilityInput.includePreEligibilityDecision;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityInput copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductExperienceInput> productExperience, boolean includePreEligibilityDecision) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productExperience, "");
        return new com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityInput(productExperience, includePreEligibilityDecision);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIncludePreEligibilityDecision() {
        return this.includePreEligibilityDecision;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductExperienceInput> component1() {
        return this.productExperience;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityInput copy$default(com.paypal.oslo.api.graphql.schema.type.BalanceBundleEligibilityInput balanceBundleEligibilityInput, com.apollographql.apollo.api.Optional optional, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = balanceBundleEligibilityInput.productExperience;
        }
        if ((i & 2) != 0) {
            z = balanceBundleEligibilityInput.includePreEligibilityDecision;
        }
        return balanceBundleEligibilityInput.copy(optional, z);
    }
}
