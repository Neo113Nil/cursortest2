package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ4\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/TransferExecutionContextInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/PartialAmountPolicy;", "partialAmountPolicy", "", "skipReceivablesEligibility", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/TransferExecutionContextInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getPartialAmountPolicy", "getSkipReceivablesEligibility"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TransferExecutionContextInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PartialAmountPolicy> partialAmountPolicy;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> skipReceivablesEligibility;

    /* JADX WARN: Multi-variable type inference failed */
    public TransferExecutionContextInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.PartialAmountPolicy> optional, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.partialAmountPolicy = optional;
        this.skipReceivablesEligibility = optional2;
    }

    public /* synthetic */ TransferExecutionContextInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PartialAmountPolicy> getPartialAmountPolicy() {
        return this.partialAmountPolicy;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getSkipReceivablesEligibility() {
        return this.skipReceivablesEligibility;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PartialAmountPolicy> optional = this.partialAmountPolicy;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional2 = this.skipReceivablesEligibility;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferExecutionContextInput(partialAmountPolicy=");
        sb.append(optional);
        sb.append(", skipReceivablesEligibility=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.partialAmountPolicy.hashCode() * 31) + this.skipReceivablesEligibility.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.TransferExecutionContextInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.TransferExecutionContextInput transferExecutionContextInput = (com.paypal.oslo.api.graphql.schema.type.TransferExecutionContextInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.partialAmountPolicy, transferExecutionContextInput.partialAmountPolicy) && kotlin.jvm.internal.Intrinsics.areEqual(this.skipReceivablesEligibility, transferExecutionContextInput.skipReceivablesEligibility);
    }

    public final com.paypal.oslo.api.graphql.schema.type.TransferExecutionContextInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.PartialAmountPolicy> partialAmountPolicy, com.apollographql.apollo.api.Optional<java.lang.Boolean> skipReceivablesEligibility) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partialAmountPolicy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(skipReceivablesEligibility, "");
        return new com.paypal.oslo.api.graphql.schema.type.TransferExecutionContextInput(partialAmountPolicy, skipReceivablesEligibility);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component2() {
        return this.skipReceivablesEligibility;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PartialAmountPolicy> component1() {
        return this.partialAmountPolicy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.TransferExecutionContextInput copy$default(com.paypal.oslo.api.graphql.schema.type.TransferExecutionContextInput transferExecutionContextInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = transferExecutionContextInput.partialAmountPolicy;
        }
        if ((i & 2) != 0) {
            optional2 = transferExecutionContextInput.skipReceivablesEligibility;
        }
        return transferExecutionContextInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransferExecutionContextInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
