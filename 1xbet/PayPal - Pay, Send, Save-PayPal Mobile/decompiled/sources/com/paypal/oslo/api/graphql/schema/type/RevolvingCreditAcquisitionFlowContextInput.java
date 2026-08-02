package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR(\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionFlowContextInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionFlowSpecifier;", "flowSpecifier", "Lcom/paypal/oslo/api/graphql/schema/type/CreditFlowContextChannel;", "channel", "Lcom/apollographql/apollo/api/Optional;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionFlowAttribute;", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionFlowSpecifier;Lcom/paypal/oslo/api/graphql/schema/type/CreditFlowContextChannel;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionFlowSpecifier;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CreditFlowContextChannel;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionFlowSpecifier;Lcom/paypal/oslo/api/graphql/schema/type/CreditFlowContextChannel;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionFlowContextInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionFlowSpecifier;", "getFlowSpecifier", "Lcom/paypal/oslo/api/graphql/schema/type/CreditFlowContextChannel;", "getChannel", "Lcom/apollographql/apollo/api/Optional;", "getAttributes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RevolvingCreditAcquisitionFlowContextInput {
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowAttribute>> attributes;
    private final com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel channel;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowSpecifier flowSpecifier;

    /* JADX WARN: Multi-variable type inference failed */
    public RevolvingCreditAcquisitionFlowContextInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowSpecifier revolvingCreditAcquisitionFlowSpecifier, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel creditFlowContextChannel, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowAttribute>> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditAcquisitionFlowSpecifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditFlowContextChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.flowSpecifier = revolvingCreditAcquisitionFlowSpecifier;
        this.channel = creditFlowContextChannel;
        this.attributes = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowSpecifier getFlowSpecifier() {
        return this.flowSpecifier;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel getChannel() {
        return this.channel;
    }

    public /* synthetic */ RevolvingCreditAcquisitionFlowContextInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowSpecifier revolvingCreditAcquisitionFlowSpecifier, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel creditFlowContextChannel, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(revolvingCreditAcquisitionFlowSpecifier, creditFlowContextChannel, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowAttribute>> getAttributes() {
        return this.attributes;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowSpecifier revolvingCreditAcquisitionFlowSpecifier = this.flowSpecifier;
        com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel creditFlowContextChannel = this.channel;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowAttribute>> optional = this.attributes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditAcquisitionFlowContextInput(flowSpecifier=");
        sb.append(revolvingCreditAcquisitionFlowSpecifier);
        sb.append(", channel=");
        sb.append(creditFlowContextChannel);
        sb.append(", attributes=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.flowSpecifier.hashCode() * 31) + this.channel.hashCode()) * 31) + this.attributes.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowContextInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowContextInput revolvingCreditAcquisitionFlowContextInput = (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowContextInput) other;
        return this.flowSpecifier == revolvingCreditAcquisitionFlowContextInput.flowSpecifier && this.channel == revolvingCreditAcquisitionFlowContextInput.channel && kotlin.jvm.internal.Intrinsics.areEqual(this.attributes, revolvingCreditAcquisitionFlowContextInput.attributes);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowContextInput copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowSpecifier flowSpecifier, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel channel, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowAttribute>> attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowSpecifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        return new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowContextInput(flowSpecifier, channel, attributes);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowAttribute>> component3() {
        return this.attributes;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel getChannel() {
        return this.channel;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowSpecifier getFlowSpecifier() {
        return this.flowSpecifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowContextInput copy$default(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowContextInput revolvingCreditAcquisitionFlowContextInput, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionFlowSpecifier revolvingCreditAcquisitionFlowSpecifier, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel creditFlowContextChannel, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            revolvingCreditAcquisitionFlowSpecifier = revolvingCreditAcquisitionFlowContextInput.flowSpecifier;
        }
        if ((i & 2) != 0) {
            creditFlowContextChannel = revolvingCreditAcquisitionFlowContextInput.channel;
        }
        if ((i & 4) != 0) {
            optional = revolvingCreditAcquisitionFlowContextInput.attributes;
        }
        return revolvingCreditAcquisitionFlowContextInput.copy(revolvingCreditAcquisitionFlowSpecifier, creditFlowContextChannel, optional);
    }
}
