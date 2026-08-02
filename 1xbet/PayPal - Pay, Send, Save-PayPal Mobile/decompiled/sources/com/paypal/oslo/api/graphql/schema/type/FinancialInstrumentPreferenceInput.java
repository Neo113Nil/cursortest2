package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/FinancialInstrumentPreferenceInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentClientEntrypoint;", "clientEntrypoint", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/FinancialInstrumentPreferenceChannel;", "channel", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentClientEntrypoint;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentClientEntrypoint;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentClientEntrypoint;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/FinancialInstrumentPreferenceInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentClientEntrypoint;", "getClientEntrypoint", "Lcom/apollographql/apollo/api/Optional;", "getChannel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FinancialInstrumentPreferenceInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceChannel> channel;
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint clientEntrypoint;

    /* JADX WARN: Multi-variable type inference failed */
    public FinancialInstrumentPreferenceInput(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceChannel> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentClientEntrypoint, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.clientEntrypoint = debitInstrumentClientEntrypoint;
        this.channel = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint getClientEntrypoint() {
        return this.clientEntrypoint;
    }

    public /* synthetic */ FinancialInstrumentPreferenceInput(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(debitInstrumentClientEntrypoint, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceChannel> getChannel() {
        return this.channel;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint = this.clientEntrypoint;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceChannel> optional = this.channel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FinancialInstrumentPreferenceInput(clientEntrypoint=");
        sb.append(debitInstrumentClientEntrypoint);
        sb.append(", channel=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.clientEntrypoint.hashCode() * 31) + this.channel.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceInput financialInstrumentPreferenceInput = (com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceInput) other;
        return this.clientEntrypoint == financialInstrumentPreferenceInput.clientEntrypoint && kotlin.jvm.internal.Intrinsics.areEqual(this.channel, financialInstrumentPreferenceInput.channel);
    }

    public final com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceInput copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint clientEntrypoint, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceChannel> channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientEntrypoint, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        return new com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceInput(clientEntrypoint, channel);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceChannel> component2() {
        return this.channel;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint getClientEntrypoint() {
        return this.clientEntrypoint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceInput copy$default(com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceInput financialInstrumentPreferenceInput, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentClientEntrypoint = financialInstrumentPreferenceInput.clientEntrypoint;
        }
        if ((i & 2) != 0) {
            optional = financialInstrumentPreferenceInput.channel;
        }
        return financialInstrumentPreferenceInput.copy(debitInstrumentClientEntrypoint, optional);
    }
}
