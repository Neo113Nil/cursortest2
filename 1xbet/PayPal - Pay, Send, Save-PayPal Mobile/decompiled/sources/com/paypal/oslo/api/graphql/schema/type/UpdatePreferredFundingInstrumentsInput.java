package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J<\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdatePreferredFundingInstrumentsInput;", "", "", "", "consumerAgreementsIds", "fundingInstrumentId", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementBalancePreference;", "balancePreference", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/UpdatePreferredFundingInstrumentsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getConsumerAgreementsIds", "Ljava/lang/String;", "getFundingInstrumentId", "Lcom/apollographql/apollo/api/Optional;", "getBalancePreference"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdatePreferredFundingInstrumentsInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference> balancePreference;
    private final java.util.List<java.lang.String> consumerAgreementsIds;
    private final java.lang.String fundingInstrumentId;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdatePreferredFundingInstrumentsInput(java.util.List<java.lang.String> list, java.lang.String str, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.consumerAgreementsIds = list;
        this.fundingInstrumentId = str;
        this.balancePreference = optional;
    }

    public final java.util.List<java.lang.String> getConsumerAgreementsIds() {
        return this.consumerAgreementsIds;
    }

    public final java.lang.String getFundingInstrumentId() {
        return this.fundingInstrumentId;
    }

    public /* synthetic */ UpdatePreferredFundingInstrumentsInput(java.util.List list, java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference> getBalancePreference() {
        return this.balancePreference;
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.String> list = this.consumerAgreementsIds;
        java.lang.String str = this.fundingInstrumentId;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference> optional = this.balancePreference;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePreferredFundingInstrumentsInput(consumerAgreementsIds=");
        sb.append(list);
        sb.append(", fundingInstrumentId=");
        sb.append(str);
        sb.append(", balancePreference=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.consumerAgreementsIds.hashCode() * 31) + this.fundingInstrumentId.hashCode()) * 31) + this.balancePreference.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdatePreferredFundingInstrumentsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdatePreferredFundingInstrumentsInput updatePreferredFundingInstrumentsInput = (com.paypal.oslo.api.graphql.schema.type.UpdatePreferredFundingInstrumentsInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.consumerAgreementsIds, updatePreferredFundingInstrumentsInput.consumerAgreementsIds) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrumentId, updatePreferredFundingInstrumentsInput.fundingInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.balancePreference, updatePreferredFundingInstrumentsInput.balancePreference);
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdatePreferredFundingInstrumentsInput copy(java.util.List<java.lang.String> consumerAgreementsIds, java.lang.String fundingInstrumentId, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference> balancePreference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAgreementsIds, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balancePreference, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdatePreferredFundingInstrumentsInput(consumerAgreementsIds, fundingInstrumentId, balancePreference);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementBalancePreference> component3() {
        return this.balancePreference;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFundingInstrumentId() {
        return this.fundingInstrumentId;
    }

    public final java.util.List<java.lang.String> component1() {
        return this.consumerAgreementsIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdatePreferredFundingInstrumentsInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdatePreferredFundingInstrumentsInput updatePreferredFundingInstrumentsInput, java.util.List list, java.lang.String str, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = updatePreferredFundingInstrumentsInput.consumerAgreementsIds;
        }
        if ((i & 2) != 0) {
            str = updatePreferredFundingInstrumentsInput.fundingInstrumentId;
        }
        if ((i & 4) != 0) {
            optional = updatePreferredFundingInstrumentsInput.balancePreference;
        }
        return updatePreferredFundingInstrumentsInput.copy(list, str, optional);
    }
}
