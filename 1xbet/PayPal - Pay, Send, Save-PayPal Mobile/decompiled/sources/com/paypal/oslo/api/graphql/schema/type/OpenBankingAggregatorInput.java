package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ:\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR(\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OpenBankingAggregatorInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/BankProductFlow;", "productFlow", "", "Lcom/paypal/oslo/api/graphql/schema/type/BankAggregatorName;", "excludeAggregators", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/OpenBankingAggregatorInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getProductFlow", "getExcludeAggregators"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OpenBankingAggregatorInput {
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.BankAggregatorName>> excludeAggregators;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BankProductFlow> productFlow;

    /* JADX WARN: Multi-variable type inference failed */
    public OpenBankingAggregatorInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.BankProductFlow> optional, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BankAggregatorName>> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.productFlow = optional;
        this.excludeAggregators = optional2;
    }

    public /* synthetic */ OpenBankingAggregatorInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BankProductFlow> getProductFlow() {
        return this.productFlow;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.BankAggregatorName>> getExcludeAggregators() {
        return this.excludeAggregators;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BankProductFlow> optional = this.productFlow;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.BankAggregatorName>> optional2 = this.excludeAggregators;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenBankingAggregatorInput(productFlow=");
        sb.append(optional);
        sb.append(", excludeAggregators=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.productFlow.hashCode() * 31) + this.excludeAggregators.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.OpenBankingAggregatorInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.OpenBankingAggregatorInput openBankingAggregatorInput = (com.paypal.oslo.api.graphql.schema.type.OpenBankingAggregatorInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.productFlow, openBankingAggregatorInput.productFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.excludeAggregators, openBankingAggregatorInput.excludeAggregators);
    }

    public final com.paypal.oslo.api.graphql.schema.type.OpenBankingAggregatorInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.BankProductFlow> productFlow, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BankAggregatorName>> excludeAggregators) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(excludeAggregators, "");
        return new com.paypal.oslo.api.graphql.schema.type.OpenBankingAggregatorInput(productFlow, excludeAggregators);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.BankAggregatorName>> component2() {
        return this.excludeAggregators;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BankProductFlow> component1() {
        return this.productFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.OpenBankingAggregatorInput copy$default(com.paypal.oslo.api.graphql.schema.type.OpenBankingAggregatorInput openBankingAggregatorInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = openBankingAggregatorInput.productFlow;
        }
        if ((i & 2) != 0) {
            optional2 = openBankingAggregatorInput.excludeAggregators;
        }
        return openBankingAggregatorInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenBankingAggregatorInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
