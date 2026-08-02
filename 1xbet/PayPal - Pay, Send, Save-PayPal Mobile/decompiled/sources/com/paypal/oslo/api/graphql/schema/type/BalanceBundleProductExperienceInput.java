package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ4\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleProductExperienceInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "userExperienceFlow", "productFlow", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/BalanceBundleProductExperienceInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getUserExperienceFlow", "getProductFlow"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BalanceBundleProductExperienceInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> productFlow;
    private final com.apollographql.apollo.api.Optional<java.lang.String> userExperienceFlow;

    public BalanceBundleProductExperienceInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.userExperienceFlow = optional;
        this.productFlow = optional2;
    }

    public /* synthetic */ BalanceBundleProductExperienceInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getUserExperienceFlow() {
        return this.userExperienceFlow;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getProductFlow() {
        return this.productFlow;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.userExperienceFlow;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.productFlow;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceBundleProductExperienceInput(userExperienceFlow=");
        sb.append(optional);
        sb.append(", productFlow=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.userExperienceFlow.hashCode() * 31) + this.productFlow.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductExperienceInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductExperienceInput balanceBundleProductExperienceInput = (com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductExperienceInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.userExperienceFlow, balanceBundleProductExperienceInput.userExperienceFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.productFlow, balanceBundleProductExperienceInput.productFlow);
    }

    public final com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductExperienceInput copy(com.apollographql.apollo.api.Optional<java.lang.String> userExperienceFlow, com.apollographql.apollo.api.Optional<java.lang.String> productFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userExperienceFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productFlow, "");
        return new com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductExperienceInput(userExperienceFlow, productFlow);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.productFlow;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.userExperienceFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductExperienceInput copy$default(com.paypal.oslo.api.graphql.schema.type.BalanceBundleProductExperienceInput balanceBundleProductExperienceInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = balanceBundleProductExperienceInput.userExperienceFlow;
        }
        if ((i & 2) != 0) {
            optional2 = balanceBundleProductExperienceInput.productFlow;
        }
        return balanceBundleProductExperienceInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BalanceBundleProductExperienceInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
