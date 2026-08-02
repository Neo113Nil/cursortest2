package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJF\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\u000bR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdateCryptocurrencyFundingInstrumentPreferencesInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "useAvailableBalanceAmount", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "primaryFundingInstrumentId", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateCryptocurrencyFundingInstrumentPreferencesInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getUseAvailableBalanceAmount", "getFundingOptionId", "getPrimaryFundingInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateCryptocurrencyFundingInstrumentPreferencesInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> fundingOptionId;
    private final com.apollographql.apollo.api.Optional<java.lang.String> primaryFundingInstrumentId;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> useAvailableBalanceAmount;

    public UpdateCryptocurrencyFundingInstrumentPreferencesInput(com.apollographql.apollo.api.Optional<java.lang.Boolean> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2, com.apollographql.apollo.api.Optional<java.lang.String> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.useAvailableBalanceAmount = optional;
        this.fundingOptionId = optional2;
        this.primaryFundingInstrumentId = optional3;
    }

    public /* synthetic */ UpdateCryptocurrencyFundingInstrumentPreferencesInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getUseAvailableBalanceAmount() {
        return this.useAvailableBalanceAmount;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getFundingOptionId() {
        return this.fundingOptionId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getPrimaryFundingInstrumentId() {
        return this.primaryFundingInstrumentId;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional = this.useAvailableBalanceAmount;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.fundingOptionId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional3 = this.primaryFundingInstrumentId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateCryptocurrencyFundingInstrumentPreferencesInput(useAvailableBalanceAmount=");
        sb.append(optional);
        sb.append(", fundingOptionId=");
        sb.append(optional2);
        sb.append(", primaryFundingInstrumentId=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.useAvailableBalanceAmount.hashCode() * 31) + this.fundingOptionId.hashCode()) * 31) + this.primaryFundingInstrumentId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyFundingInstrumentPreferencesInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyFundingInstrumentPreferencesInput updateCryptocurrencyFundingInstrumentPreferencesInput = (com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyFundingInstrumentPreferencesInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.useAvailableBalanceAmount, updateCryptocurrencyFundingInstrumentPreferencesInput.useAvailableBalanceAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptionId, updateCryptocurrencyFundingInstrumentPreferencesInput.fundingOptionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryFundingInstrumentId, updateCryptocurrencyFundingInstrumentPreferencesInput.primaryFundingInstrumentId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyFundingInstrumentPreferencesInput copy(com.apollographql.apollo.api.Optional<java.lang.Boolean> useAvailableBalanceAmount, com.apollographql.apollo.api.Optional<java.lang.String> fundingOptionId, com.apollographql.apollo.api.Optional<java.lang.String> primaryFundingInstrumentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useAvailableBalanceAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryFundingInstrumentId, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyFundingInstrumentPreferencesInput(useAvailableBalanceAmount, fundingOptionId, primaryFundingInstrumentId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.primaryFundingInstrumentId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.fundingOptionId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component1() {
        return this.useAvailableBalanceAmount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyFundingInstrumentPreferencesInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyFundingInstrumentPreferencesInput updateCryptocurrencyFundingInstrumentPreferencesInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = updateCryptocurrencyFundingInstrumentPreferencesInput.useAvailableBalanceAmount;
        }
        if ((i & 2) != 0) {
            optional2 = updateCryptocurrencyFundingInstrumentPreferencesInput.fundingOptionId;
        }
        if ((i & 4) != 0) {
            optional3 = updateCryptocurrencyFundingInstrumentPreferencesInput.primaryFundingInstrumentId;
        }
        return updateCryptocurrencyFundingInstrumentPreferencesInput.copy(optional, optional2, optional3);
    }

    public UpdateCryptocurrencyFundingInstrumentPreferencesInput() {
        this(null, null, null, 7, null);
    }
}
