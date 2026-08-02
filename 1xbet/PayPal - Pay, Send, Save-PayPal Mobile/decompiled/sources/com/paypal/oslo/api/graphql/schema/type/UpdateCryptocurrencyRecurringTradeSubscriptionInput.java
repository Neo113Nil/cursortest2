package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdateCryptocurrencyRecurringTradeSubscriptionInput;", "", "", "id", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/UpdateCryptocurrencyFundingInstrumentPreferencesInput;", "fundingInstrumentPreferences", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateCryptocurrencyRecurringTradeSubscriptionInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/apollographql/apollo/api/Optional;", "getFundingInstrumentPreferences"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateCryptocurrencyRecurringTradeSubscriptionInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyFundingInstrumentPreferencesInput> fundingInstrumentPreferences;
    private final java.lang.String id;

    public UpdateCryptocurrencyRecurringTradeSubscriptionInput(java.lang.String str, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyFundingInstrumentPreferencesInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.id = str;
        this.fundingInstrumentPreferences = optional;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyFundingInstrumentPreferencesInput> getFundingInstrumentPreferences() {
        return this.fundingInstrumentPreferences;
    }

    public /* synthetic */ UpdateCryptocurrencyRecurringTradeSubscriptionInput(java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyFundingInstrumentPreferencesInput> optional = this.fundingInstrumentPreferences;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateCryptocurrencyRecurringTradeSubscriptionInput(id=");
        sb.append(str);
        sb.append(", fundingInstrumentPreferences=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.id.hashCode() * 31) + this.fundingInstrumentPreferences.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyRecurringTradeSubscriptionInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyRecurringTradeSubscriptionInput updateCryptocurrencyRecurringTradeSubscriptionInput = (com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyRecurringTradeSubscriptionInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, updateCryptocurrencyRecurringTradeSubscriptionInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrumentPreferences, updateCryptocurrencyRecurringTradeSubscriptionInput.fundingInstrumentPreferences);
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyRecurringTradeSubscriptionInput copy(java.lang.String id, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyFundingInstrumentPreferencesInput> fundingInstrumentPreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentPreferences, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyRecurringTradeSubscriptionInput(id, fundingInstrumentPreferences);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyFundingInstrumentPreferencesInput> component2() {
        return this.fundingInstrumentPreferences;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyRecurringTradeSubscriptionInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyRecurringTradeSubscriptionInput updateCryptocurrencyRecurringTradeSubscriptionInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = updateCryptocurrencyRecurringTradeSubscriptionInput.id;
        }
        if ((i & 2) != 0) {
            optional = updateCryptocurrencyRecurringTradeSubscriptionInput.fundingInstrumentPreferences;
        }
        return updateCryptocurrencyRecurringTradeSubscriptionInput.copy(str, optional);
    }
}
