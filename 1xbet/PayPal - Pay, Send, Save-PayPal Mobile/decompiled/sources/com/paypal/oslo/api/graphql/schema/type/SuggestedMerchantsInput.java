package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SuggestedMerchantsInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/SuggestedMerchantsSearchType;", com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes.SEARCH_TYPE, "Lcom/apollographql/apollo/api/Optional;", "", "searchText", "Lcom/paypal/oslo/api/graphql/schema/type/ConsumerAgreementType;", "agreementType", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SuggestedMerchantsSearchType;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SuggestedMerchantsSearchType;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SuggestedMerchantsSearchType;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/SuggestedMerchantsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/SuggestedMerchantsSearchType;", "getSearchType", "Lcom/apollographql/apollo/api/Optional;", "getSearchText", "getAgreementType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SuggestedMerchantsInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType> agreementType;
    private final com.apollographql.apollo.api.Optional<java.lang.String> searchText;
    private final com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsSearchType searchType;

    /* JADX WARN: Multi-variable type inference failed */
    public SuggestedMerchantsInput(com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsSearchType suggestedMerchantsSearchType, com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suggestedMerchantsSearchType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.searchType = suggestedMerchantsSearchType;
        this.searchText = optional;
        this.agreementType = optional2;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsSearchType getSearchType() {
        return this.searchType;
    }

    public /* synthetic */ SuggestedMerchantsInput(com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsSearchType suggestedMerchantsSearchType, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(suggestedMerchantsSearchType, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getSearchText() {
        return this.searchText;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType> getAgreementType() {
        return this.agreementType;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsSearchType suggestedMerchantsSearchType = this.searchType;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.searchText;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType> optional2 = this.agreementType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SuggestedMerchantsInput(searchType=");
        sb.append(suggestedMerchantsSearchType);
        sb.append(", searchText=");
        sb.append(optional);
        sb.append(", agreementType=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.searchType.hashCode() * 31) + this.searchText.hashCode()) * 31) + this.agreementType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput suggestedMerchantsInput = (com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput) other;
        return this.searchType == suggestedMerchantsInput.searchType && kotlin.jvm.internal.Intrinsics.areEqual(this.searchText, suggestedMerchantsInput.searchText) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementType, suggestedMerchantsInput.agreementType);
    }

    public final com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput copy(com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsSearchType searchType, com.apollographql.apollo.api.Optional<java.lang.String> searchText, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType> agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        return new com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput(searchType, searchText, agreementType);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType> component3() {
        return this.agreementType;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.searchText;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsSearchType getSearchType() {
        return this.searchType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput copy$default(com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput suggestedMerchantsInput, com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsSearchType suggestedMerchantsSearchType, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            suggestedMerchantsSearchType = suggestedMerchantsInput.searchType;
        }
        if ((i & 2) != 0) {
            optional = suggestedMerchantsInput.searchText;
        }
        if ((i & 4) != 0) {
            optional2 = suggestedMerchantsInput.agreementType;
        }
        return suggestedMerchantsInput.copy(suggestedMerchantsSearchType, optional, optional2);
    }
}
