package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SetFinancialInstrumentPreferenceInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentClientEntrypoint;", "clientEntrypoint", "", "preference", "Lcom/paypal/oslo/api/graphql/schema/type/FinancialInstrumentPreferenceChannel;", "channel", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentClientEntrypoint;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FinancialInstrumentPreferenceChannel;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentClientEntrypoint;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/FinancialInstrumentPreferenceChannel;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentClientEntrypoint;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/FinancialInstrumentPreferenceChannel;)Lcom/paypal/oslo/api/graphql/schema/type/SetFinancialInstrumentPreferenceInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentClientEntrypoint;", "getClientEntrypoint", "Ljava/lang/String;", "getPreference", "Lcom/paypal/oslo/api/graphql/schema/type/FinancialInstrumentPreferenceChannel;", "getChannel"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SetFinancialInstrumentPreferenceInput {
    private final com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceChannel channel;
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint clientEntrypoint;
    private final java.lang.String preference;

    public SetFinancialInstrumentPreferenceInput(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceChannel financialInstrumentPreferenceChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentClientEntrypoint, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstrumentPreferenceChannel, "");
        this.clientEntrypoint = debitInstrumentClientEntrypoint;
        this.preference = str;
        this.channel = financialInstrumentPreferenceChannel;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint getClientEntrypoint() {
        return this.clientEntrypoint;
    }

    public final java.lang.String getPreference() {
        return this.preference;
    }

    public final com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceChannel getChannel() {
        return this.channel;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint = this.clientEntrypoint;
        java.lang.String str = this.preference;
        com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceChannel financialInstrumentPreferenceChannel = this.channel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SetFinancialInstrumentPreferenceInput(clientEntrypoint=");
        sb.append(debitInstrumentClientEntrypoint);
        sb.append(", preference=");
        sb.append(str);
        sb.append(", channel=");
        sb.append(financialInstrumentPreferenceChannel);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.clientEntrypoint.hashCode() * 31) + this.preference.hashCode()) * 31) + this.channel.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.SetFinancialInstrumentPreferenceInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.SetFinancialInstrumentPreferenceInput setFinancialInstrumentPreferenceInput = (com.paypal.oslo.api.graphql.schema.type.SetFinancialInstrumentPreferenceInput) other;
        return this.clientEntrypoint == setFinancialInstrumentPreferenceInput.clientEntrypoint && kotlin.jvm.internal.Intrinsics.areEqual(this.preference, setFinancialInstrumentPreferenceInput.preference) && this.channel == setFinancialInstrumentPreferenceInput.channel;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SetFinancialInstrumentPreferenceInput copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint clientEntrypoint, java.lang.String preference, com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceChannel channel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientEntrypoint, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        return new com.paypal.oslo.api.graphql.schema.type.SetFinancialInstrumentPreferenceInput(clientEntrypoint, preference, channel);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceChannel getChannel() {
        return this.channel;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPreference() {
        return this.preference;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint getClientEntrypoint() {
        return this.clientEntrypoint;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.SetFinancialInstrumentPreferenceInput copy$default(com.paypal.oslo.api.graphql.schema.type.SetFinancialInstrumentPreferenceInput setFinancialInstrumentPreferenceInput, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentClientEntrypoint debitInstrumentClientEntrypoint, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.FinancialInstrumentPreferenceChannel financialInstrumentPreferenceChannel, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentClientEntrypoint = setFinancialInstrumentPreferenceInput.clientEntrypoint;
        }
        if ((i & 2) != 0) {
            str = setFinancialInstrumentPreferenceInput.preference;
        }
        if ((i & 4) != 0) {
            financialInstrumentPreferenceChannel = setFinancialInstrumentPreferenceInput.channel;
        }
        return setFinancialInstrumentPreferenceInput.copy(debitInstrumentClientEntrypoint, str, financialInstrumentPreferenceChannel);
    }
}
