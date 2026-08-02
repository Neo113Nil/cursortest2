package com.paypal.oslo.feature.inappcheckout.graphql.checkout.type;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalFundingSelectionInput;", "", "", "fundingInstrumentID", "Lcom/apollographql/apollo/api/Optional;", "", "useBalance", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalFundingSelectionInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFundingInstrumentID", "Lcom/apollographql/apollo/api/Optional;", "getUseBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExternalFundingSelectionInput {
    public static final int $stable = 8;
    private final java.lang.String fundingInstrumentID;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> useBalance;

    public ExternalFundingSelectionInput(java.lang.String str, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.fundingInstrumentID = str;
        this.useBalance = optional;
    }

    public final java.lang.String getFundingInstrumentID() {
        return this.fundingInstrumentID;
    }

    public /* synthetic */ ExternalFundingSelectionInput(java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getUseBalance() {
        return this.useBalance;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.fundingInstrumentID;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional = this.useBalance;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalFundingSelectionInput(fundingInstrumentID=");
        sb.append(str);
        sb.append(", useBalance=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.fundingInstrumentID.hashCode() * 31) + this.useBalance.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingSelectionInput)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingSelectionInput externalFundingSelectionInput = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingSelectionInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrumentID, externalFundingSelectionInput.fundingInstrumentID) && kotlin.jvm.internal.Intrinsics.areEqual(this.useBalance, externalFundingSelectionInput.useBalance);
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingSelectionInput copy(java.lang.String fundingInstrumentID, com.apollographql.apollo.api.Optional<java.lang.Boolean> useBalance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentID, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useBalance, "");
        return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingSelectionInput(fundingInstrumentID, useBalance);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component2() {
        return this.useBalance;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFundingInstrumentID() {
        return this.fundingInstrumentID;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingSelectionInput copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingSelectionInput externalFundingSelectionInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = externalFundingSelectionInput.fundingInstrumentID;
        }
        if ((i & 2) != 0) {
            optional = externalFundingSelectionInput.useBalance;
        }
        return externalFundingSelectionInput.copy(str, optional);
    }
}
