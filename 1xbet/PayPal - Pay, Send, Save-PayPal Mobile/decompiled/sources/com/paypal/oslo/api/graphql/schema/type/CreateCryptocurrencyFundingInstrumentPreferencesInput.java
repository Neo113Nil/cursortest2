package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CreateCryptocurrencyFundingInstrumentPreferencesInput;", "", "", "useAvailableBalanceAmount", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "primaryFundingInstrumentId", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CreateCryptocurrencyFundingInstrumentPreferencesInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getUseAvailableBalanceAmount", "Ljava/lang/String;", "getFundingOptionId", "getPrimaryFundingInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateCryptocurrencyFundingInstrumentPreferencesInput {
    private final java.lang.String fundingOptionId;
    private final java.lang.String primaryFundingInstrumentId;
    private final boolean useAvailableBalanceAmount;

    public CreateCryptocurrencyFundingInstrumentPreferencesInput(boolean z, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.useAvailableBalanceAmount = z;
        this.fundingOptionId = str;
        this.primaryFundingInstrumentId = str2;
    }

    public final boolean getUseAvailableBalanceAmount() {
        return this.useAvailableBalanceAmount;
    }

    public final java.lang.String getFundingOptionId() {
        return this.fundingOptionId;
    }

    public final java.lang.String getPrimaryFundingInstrumentId() {
        return this.primaryFundingInstrumentId;
    }

    public final java.lang.String toString() {
        boolean z = this.useAvailableBalanceAmount;
        java.lang.String str = this.fundingOptionId;
        java.lang.String str2 = this.primaryFundingInstrumentId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateCryptocurrencyFundingInstrumentPreferencesInput(useAvailableBalanceAmount=");
        sb.append(z);
        sb.append(", fundingOptionId=");
        sb.append(str);
        sb.append(", primaryFundingInstrumentId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.useAvailableBalanceAmount) * 31) + this.fundingOptionId.hashCode()) * 31) + this.primaryFundingInstrumentId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyFundingInstrumentPreferencesInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyFundingInstrumentPreferencesInput createCryptocurrencyFundingInstrumentPreferencesInput = (com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyFundingInstrumentPreferencesInput) other;
        return this.useAvailableBalanceAmount == createCryptocurrencyFundingInstrumentPreferencesInput.useAvailableBalanceAmount && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptionId, createCryptocurrencyFundingInstrumentPreferencesInput.fundingOptionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryFundingInstrumentId, createCryptocurrencyFundingInstrumentPreferencesInput.primaryFundingInstrumentId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyFundingInstrumentPreferencesInput copy(boolean useAvailableBalanceAmount, java.lang.String fundingOptionId, java.lang.String primaryFundingInstrumentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryFundingInstrumentId, "");
        return new com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyFundingInstrumentPreferencesInput(useAvailableBalanceAmount, fundingOptionId, primaryFundingInstrumentId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPrimaryFundingInstrumentId() {
        return this.primaryFundingInstrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFundingOptionId() {
        return this.fundingOptionId;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getUseAvailableBalanceAmount() {
        return this.useAvailableBalanceAmount;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyFundingInstrumentPreferencesInput copy$default(com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyFundingInstrumentPreferencesInput createCryptocurrencyFundingInstrumentPreferencesInput, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = createCryptocurrencyFundingInstrumentPreferencesInput.useAvailableBalanceAmount;
        }
        if ((i & 2) != 0) {
            str = createCryptocurrencyFundingInstrumentPreferencesInput.fundingOptionId;
        }
        if ((i & 4) != 0) {
            str2 = createCryptocurrencyFundingInstrumentPreferencesInput.primaryFundingInstrumentId;
        }
        return createCryptocurrencyFundingInstrumentPreferencesInput.copy(z, str, str2);
    }
}
