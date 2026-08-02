package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewFlowContextInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingFlowSpecifier;", "flowSpecifier", "Lcom/paypal/oslo/api/graphql/schema/type/CreditFlowContextChannel;", "channel", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingFlowSpecifier;Lcom/paypal/oslo/api/graphql/schema/type/CreditFlowContextChannel;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingFlowSpecifier;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CreditFlowContextChannel;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingFlowSpecifier;Lcom/paypal/oslo/api/graphql/schema/type/CreditFlowContextChannel;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLPlansOverviewFlowContextInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLServicingFlowSpecifier;", "getFlowSpecifier", "Lcom/paypal/oslo/api/graphql/schema/type/CreditFlowContextChannel;", "getChannel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BNPLPlansOverviewFlowContextInput {
    private final com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel channel;
    private final com.paypal.oslo.api.graphql.schema.type.BNPLServicingFlowSpecifier flowSpecifier;

    public BNPLPlansOverviewFlowContextInput(com.paypal.oslo.api.graphql.schema.type.BNPLServicingFlowSpecifier bNPLServicingFlowSpecifier, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel creditFlowContextChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bNPLServicingFlowSpecifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditFlowContextChannel, "");
        this.flowSpecifier = bNPLServicingFlowSpecifier;
        this.channel = creditFlowContextChannel;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingFlowSpecifier getFlowSpecifier() {
        return this.flowSpecifier;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel getChannel() {
        return this.channel;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.BNPLServicingFlowSpecifier bNPLServicingFlowSpecifier = this.flowSpecifier;
        com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel creditFlowContextChannel = this.channel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BNPLPlansOverviewFlowContextInput(flowSpecifier=");
        sb.append(bNPLServicingFlowSpecifier);
        sb.append(", channel=");
        sb.append(creditFlowContextChannel);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.flowSpecifier.hashCode() * 31) + this.channel.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFlowContextInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFlowContextInput bNPLPlansOverviewFlowContextInput = (com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFlowContextInput) other;
        return this.flowSpecifier == bNPLPlansOverviewFlowContextInput.flowSpecifier && this.channel == bNPLPlansOverviewFlowContextInput.channel;
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFlowContextInput copy(com.paypal.oslo.api.graphql.schema.type.BNPLServicingFlowSpecifier flowSpecifier, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowSpecifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFlowContextInput(flowSpecifier, channel);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel getChannel() {
        return this.channel;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.BNPLServicingFlowSpecifier getFlowSpecifier() {
        return this.flowSpecifier;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFlowContextInput copy$default(com.paypal.oslo.api.graphql.schema.type.BNPLPlansOverviewFlowContextInput bNPLPlansOverviewFlowContextInput, com.paypal.oslo.api.graphql.schema.type.BNPLServicingFlowSpecifier bNPLServicingFlowSpecifier, com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel creditFlowContextChannel, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bNPLServicingFlowSpecifier = bNPLPlansOverviewFlowContextInput.flowSpecifier;
        }
        if ((i & 2) != 0) {
            creditFlowContextChannel = bNPLPlansOverviewFlowContextInput.channel;
        }
        return bNPLPlansOverviewFlowContextInput.copy(bNPLServicingFlowSpecifier, creditFlowContextChannel);
    }
}
