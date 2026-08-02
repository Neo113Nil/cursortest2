package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RealTimeBalanceResolutionInput;", "", "Lcom/apollographql/apollo/api/Optional;", "processorResponse", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/RealTimeBalanceResolutionInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getProcessorResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RealTimeBalanceResolutionInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Object> processorResponse;

    public RealTimeBalanceResolutionInput(com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.processorResponse = optional;
    }

    public /* synthetic */ RealTimeBalanceResolutionInput(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getProcessorResponse() {
        return this.processorResponse;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.processorResponse;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RealTimeBalanceResolutionInput(processorResponse=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.processorResponse.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.api.graphql.schema.type.RealTimeBalanceResolutionInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.processorResponse, ((com.paypal.oslo.api.graphql.schema.type.RealTimeBalanceResolutionInput) other).processorResponse);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RealTimeBalanceResolutionInput copy(com.apollographql.apollo.api.Optional<? extends java.lang.Object> processorResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processorResponse, "");
        return new com.paypal.oslo.api.graphql.schema.type.RealTimeBalanceResolutionInput(processorResponse);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component1() {
        return this.processorResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RealTimeBalanceResolutionInput copy$default(com.paypal.oslo.api.graphql.schema.type.RealTimeBalanceResolutionInput realTimeBalanceResolutionInput, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = realTimeBalanceResolutionInput.processorResponse;
        }
        return realTimeBalanceResolutionInput.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealTimeBalanceResolutionInput() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
