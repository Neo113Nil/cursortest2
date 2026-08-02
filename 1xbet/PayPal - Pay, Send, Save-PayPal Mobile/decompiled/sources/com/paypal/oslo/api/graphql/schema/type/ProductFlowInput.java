package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowIdentifier;", "identifier", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/ProductSubFlowIdentifier;", "subFlow", "Lcom/paypal/oslo/api/graphql/schema/type/TransferChannel;", "channel", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowIdentifier;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowIdentifier;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowIdentifier;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/ProductFlowIdentifier;", "getIdentifier", "Lcom/apollographql/apollo/api/Optional;", "getSubFlow", "getChannel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductFlowInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferChannel> channel;
    private final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier identifier;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ProductSubFlowIdentifier> subFlow;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductFlowInput(com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ProductSubFlowIdentifier> optional, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.TransferChannel> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productFlowIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.identifier = productFlowIdentifier;
        this.subFlow = optional;
        this.channel = optional2;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier getIdentifier() {
        return this.identifier;
    }

    public /* synthetic */ ProductFlowInput(com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(productFlowIdentifier, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ProductSubFlowIdentifier> getSubFlow() {
        return this.subFlow;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferChannel> getChannel() {
        return this.channel;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier = this.identifier;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ProductSubFlowIdentifier> optional = this.subFlow;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferChannel> optional2 = this.channel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProductFlowInput(identifier=");
        sb.append(productFlowIdentifier);
        sb.append(", subFlow=");
        sb.append(optional);
        sb.append(", channel=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.identifier.hashCode() * 31) + this.subFlow.hashCode()) * 31) + this.channel.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ProductFlowInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ProductFlowInput productFlowInput = (com.paypal.oslo.api.graphql.schema.type.ProductFlowInput) other;
        return this.identifier == productFlowInput.identifier && kotlin.jvm.internal.Intrinsics.areEqual(this.subFlow, productFlowInput.subFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.channel, productFlowInput.channel);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ProductFlowInput copy(com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier identifier, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ProductSubFlowIdentifier> subFlow, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.TransferChannel> channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        return new com.paypal.oslo.api.graphql.schema.type.ProductFlowInput(identifier, subFlow, channel);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.TransferChannel> component3() {
        return this.channel;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ProductSubFlowIdentifier> component2() {
        return this.subFlow;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier getIdentifier() {
        return this.identifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ProductFlowInput copy$default(com.paypal.oslo.api.graphql.schema.type.ProductFlowInput productFlowInput, com.paypal.oslo.api.graphql.schema.type.ProductFlowIdentifier productFlowIdentifier, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            productFlowIdentifier = productFlowInput.identifier;
        }
        if ((i & 2) != 0) {
            optional = productFlowInput.subFlow;
        }
        if ((i & 4) != 0) {
            optional2 = productFlowInput.channel;
        }
        return productFlowInput.copy(productFlowIdentifier, optional, optional2);
    }
}
