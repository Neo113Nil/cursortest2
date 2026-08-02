package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyFundingInstrumentPreferencesInput;", "", "", "useAvailableBalanceAmount", "Lcom/apollographql/apollo/api/Optional;", "", "primaryFundingInstrument", "<init>", "(ZLcom/apollographql/apollo/api/Optional;)V", "component1", "()Z", "component2", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(ZLcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyFundingInstrumentPreferencesInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Z", "getUseAvailableBalanceAmount", "Lcom/apollographql/apollo/api/Optional;", "getPrimaryFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CryptocurrencyFundingInstrumentPreferencesInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> primaryFundingInstrument;
    private final boolean useAvailableBalanceAmount;

    public CryptocurrencyFundingInstrumentPreferencesInput(boolean z, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.useAvailableBalanceAmount = z;
        this.primaryFundingInstrument = optional;
    }

    public final boolean getUseAvailableBalanceAmount() {
        return this.useAvailableBalanceAmount;
    }

    public /* synthetic */ CryptocurrencyFundingInstrumentPreferencesInput(boolean z, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getPrimaryFundingInstrument() {
        return this.primaryFundingInstrument;
    }

    public final java.lang.String toString() {
        boolean z = this.useAvailableBalanceAmount;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.primaryFundingInstrument;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyFundingInstrumentPreferencesInput(useAvailableBalanceAmount=");
        sb.append(z);
        sb.append(", primaryFundingInstrument=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.useAvailableBalanceAmount) * 31) + this.primaryFundingInstrument.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CryptocurrencyFundingInstrumentPreferencesInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyFundingInstrumentPreferencesInput cryptocurrencyFundingInstrumentPreferencesInput = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyFundingInstrumentPreferencesInput) other;
        return this.useAvailableBalanceAmount == cryptocurrencyFundingInstrumentPreferencesInput.useAvailableBalanceAmount && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryFundingInstrument, cryptocurrencyFundingInstrumentPreferencesInput.primaryFundingInstrument);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyFundingInstrumentPreferencesInput copy(boolean useAvailableBalanceAmount, com.apollographql.apollo.api.Optional<java.lang.String> primaryFundingInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryFundingInstrument, "");
        return new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyFundingInstrumentPreferencesInput(useAvailableBalanceAmount, primaryFundingInstrument);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.primaryFundingInstrument;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getUseAvailableBalanceAmount() {
        return this.useAvailableBalanceAmount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyFundingInstrumentPreferencesInput copy$default(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyFundingInstrumentPreferencesInput cryptocurrencyFundingInstrumentPreferencesInput, boolean z, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = cryptocurrencyFundingInstrumentPreferencesInput.useAvailableBalanceAmount;
        }
        if ((i & 2) != 0) {
            optional = cryptocurrencyFundingInstrumentPreferencesInput.primaryFundingInstrument;
        }
        return cryptocurrencyFundingInstrumentPreferencesInput.copy(z, optional);
    }
}
