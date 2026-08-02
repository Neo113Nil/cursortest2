package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJD\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR(\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000fR\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentUserPreferenceInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceInput;", com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.FUNDING_SOURCE, "Lcom/apollographql/apollo/api/Optional;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingAmountInput;", "amounts", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentPrimaryFundingSourceType;", "primaryFundingOption", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceInput;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceInput;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceInput;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentUserPreferenceInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentFundingSourceInput;", "getFundingSource", "Lcom/apollographql/apollo/api/Optional;", "getAmounts", "getPrimaryFundingOption"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DebitInstrumentUserPreferenceInput {
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingAmountInput>> amounts;
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceInput fundingSource;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType> primaryFundingOption;

    /* JADX WARN: Multi-variable type inference failed */
    public DebitInstrumentUserPreferenceInput(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceInput debitInstrumentFundingSourceInput, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingAmountInput>> optional, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentFundingSourceInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.fundingSource = debitInstrumentFundingSourceInput;
        this.amounts = optional;
        this.primaryFundingOption = optional2;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceInput getFundingSource() {
        return this.fundingSource;
    }

    public /* synthetic */ DebitInstrumentUserPreferenceInput(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceInput debitInstrumentFundingSourceInput, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(debitInstrumentFundingSourceInput, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingAmountInput>> getAmounts() {
        return this.amounts;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType> getPrimaryFundingOption() {
        return this.primaryFundingOption;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceInput debitInstrumentFundingSourceInput = this.fundingSource;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingAmountInput>> optional = this.amounts;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType> optional2 = this.primaryFundingOption;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentUserPreferenceInput(fundingSource=");
        sb.append(debitInstrumentFundingSourceInput);
        sb.append(", amounts=");
        sb.append(optional);
        sb.append(", primaryFundingOption=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.fundingSource.hashCode() * 31) + this.amounts.hashCode()) * 31) + this.primaryFundingOption.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput debitInstrumentUserPreferenceInput = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSource, debitInstrumentUserPreferenceInput.fundingSource) && kotlin.jvm.internal.Intrinsics.areEqual(this.amounts, debitInstrumentUserPreferenceInput.amounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryFundingOption, debitInstrumentUserPreferenceInput.primaryFundingOption);
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceInput fundingSource, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingAmountInput>> amounts, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType> primaryFundingOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amounts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryFundingOption, "");
        return new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput(fundingSource, amounts, primaryFundingOption);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentPrimaryFundingSourceType> component3() {
        return this.primaryFundingOption;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingAmountInput>> component2() {
        return this.amounts;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceInput getFundingSource() {
        return this.fundingSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput copy$default(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentUserPreferenceInput debitInstrumentUserPreferenceInput, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentFundingSourceInput debitInstrumentFundingSourceInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentFundingSourceInput = debitInstrumentUserPreferenceInput.fundingSource;
        }
        if ((i & 2) != 0) {
            optional = debitInstrumentUserPreferenceInput.amounts;
        }
        if ((i & 4) != 0) {
            optional2 = debitInstrumentUserPreferenceInput.primaryFundingOption;
        }
        return debitInstrumentUserPreferenceInput.copy(debitInstrumentFundingSourceInput, optional, optional2);
    }
}
