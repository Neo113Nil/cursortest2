package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR%\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CloseBNPLLoanFlowContextInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CloseBNPLLoanFlowAttribute;", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lcom/paypal/oslo/api/graphql/schema/type/CreditFlowContextChannel;", "channel", "Lcom/paypal/oslo/api/graphql/schema/type/CloseBNPLLoanFlowSpecifier;", "flowSpecifier", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/CreditFlowContextChannel;Lcom/paypal/oslo/api/graphql/schema/type/CloseBNPLLoanFlowSpecifier;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CreditFlowContextChannel;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CloseBNPLLoanFlowSpecifier;", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/CreditFlowContextChannel;Lcom/paypal/oslo/api/graphql/schema/type/CloseBNPLLoanFlowSpecifier;)Lcom/paypal/oslo/api/graphql/schema/type/CloseBNPLLoanFlowContextInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getAttributes", "Lcom/paypal/oslo/api/graphql/schema/type/CreditFlowContextChannel;", "getChannel", "Lcom/paypal/oslo/api/graphql/schema/type/CloseBNPLLoanFlowSpecifier;", "getFlowSpecifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CloseBNPLLoanFlowContextInput {
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowAttribute>> attributes;
    private final com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel channel;
    private final com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowSpecifier flowSpecifier;

    /* JADX WARN: Multi-variable type inference failed */
    public CloseBNPLLoanFlowContextInput(com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowAttribute>> optional, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel creditFlowContextChannel, com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowSpecifier closeBNPLLoanFlowSpecifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditFlowContextChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeBNPLLoanFlowSpecifier, "");
        this.attributes = optional;
        this.channel = creditFlowContextChannel;
        this.flowSpecifier = closeBNPLLoanFlowSpecifier;
    }

    public /* synthetic */ CloseBNPLLoanFlowContextInput(com.apollographql.apollo.api.Optional.Absent absent, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel creditFlowContextChannel, com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowSpecifier closeBNPLLoanFlowSpecifier, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, creditFlowContextChannel, closeBNPLLoanFlowSpecifier);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowAttribute>> getAttributes() {
        return this.attributes;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel getChannel() {
        return this.channel;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowSpecifier getFlowSpecifier() {
        return this.flowSpecifier;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowAttribute>> optional = this.attributes;
        com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel creditFlowContextChannel = this.channel;
        com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowSpecifier closeBNPLLoanFlowSpecifier = this.flowSpecifier;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseBNPLLoanFlowContextInput(attributes=");
        sb.append(optional);
        sb.append(", channel=");
        sb.append(creditFlowContextChannel);
        sb.append(", flowSpecifier=");
        sb.append(closeBNPLLoanFlowSpecifier);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.attributes.hashCode() * 31) + this.channel.hashCode()) * 31) + this.flowSpecifier.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowContextInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowContextInput closeBNPLLoanFlowContextInput = (com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowContextInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, closeBNPLLoanFlowContextInput.attributes) && this.channel == closeBNPLLoanFlowContextInput.channel && this.flowSpecifier == closeBNPLLoanFlowContextInput.flowSpecifier;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowContextInput copy(com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowAttribute>> attributes, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel channel, com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowSpecifier flowSpecifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowSpecifier, "");
        return new com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowContextInput(attributes, channel, flowSpecifier);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowSpecifier getFlowSpecifier() {
        return this.flowSpecifier;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel getChannel() {
        return this.channel;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowAttribute>> component1() {
        return this.attributes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowContextInput copy$default(com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowContextInput closeBNPLLoanFlowContextInput, com.apollographql.apollo.api.Optional optional, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel creditFlowContextChannel, com.paypal.oslo.api.graphql.schema.type.CloseBNPLLoanFlowSpecifier closeBNPLLoanFlowSpecifier, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = closeBNPLLoanFlowContextInput.attributes;
        }
        if ((i & 2) != 0) {
            creditFlowContextChannel = closeBNPLLoanFlowContextInput.channel;
        }
        if ((i & 4) != 0) {
            closeBNPLLoanFlowSpecifier = closeBNPLLoanFlowContextInput.flowSpecifier;
        }
        return closeBNPLLoanFlowContextInput.copy(optional, creditFlowContextChannel, closeBNPLLoanFlowSpecifier);
    }
}
