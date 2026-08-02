package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0018\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012Jb\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0010R\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0012R\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b$\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b%\u0010\u0012R\"\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b&\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ResolveCryptocurrencyTradeContingenciesInput;", "", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyRealTimeBalanceConsentResolutionInput;", "realTimeBalanceConsent", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyRealTimeBalanceRefreshResolutionInput;", "realTimeBalanceRefresh", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyThreeDSecureDataCollectionResolutionInput;", "threeDSecureDataCollection", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyThreeDSecureAuthenticationResolutionInput;", "threeDSecureAuthentication", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ResolveCryptocurrencyTradeContingenciesInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFundingOptionId", "Lcom/apollographql/apollo/api/Optional;", "getRealTimeBalanceConsent", "getRealTimeBalanceRefresh", "getThreeDSecureDataCollection", "getThreeDSecureAuthentication"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ResolveCryptocurrencyTradeContingenciesInput {
    private final java.lang.String fundingOptionId;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRealTimeBalanceConsentResolutionInput> realTimeBalanceConsent;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRealTimeBalanceRefreshResolutionInput> realTimeBalanceRefresh;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureAuthenticationResolutionInput> threeDSecureAuthentication;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureDataCollectionResolutionInput> threeDSecureDataCollection;

    public ResolveCryptocurrencyTradeContingenciesInput(java.lang.String str, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRealTimeBalanceConsentResolutionInput> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRealTimeBalanceRefreshResolutionInput> optional2, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureDataCollectionResolutionInput> optional3, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureAuthenticationResolutionInput> optional4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional4, "");
        this.fundingOptionId = str;
        this.realTimeBalanceConsent = optional;
        this.realTimeBalanceRefresh = optional2;
        this.threeDSecureDataCollection = optional3;
        this.threeDSecureAuthentication = optional4;
    }

    public final java.lang.String getFundingOptionId() {
        return this.fundingOptionId;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRealTimeBalanceConsentResolutionInput> getRealTimeBalanceConsent() {
        return this.realTimeBalanceConsent;
    }

    public /* synthetic */ ResolveCryptocurrencyTradeContingenciesInput(java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, com.apollographql.apollo.api.Optional.Absent absent4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3, (i & 16) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent4);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRealTimeBalanceRefreshResolutionInput> getRealTimeBalanceRefresh() {
        return this.realTimeBalanceRefresh;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureDataCollectionResolutionInput> getThreeDSecureDataCollection() {
        return this.threeDSecureDataCollection;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureAuthenticationResolutionInput> getThreeDSecureAuthentication() {
        return this.threeDSecureAuthentication;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.fundingOptionId;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRealTimeBalanceConsentResolutionInput> optional = this.realTimeBalanceConsent;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRealTimeBalanceRefreshResolutionInput> optional2 = this.realTimeBalanceRefresh;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureDataCollectionResolutionInput> optional3 = this.threeDSecureDataCollection;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureAuthenticationResolutionInput> optional4 = this.threeDSecureAuthentication;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResolveCryptocurrencyTradeContingenciesInput(fundingOptionId=");
        sb.append(str);
        sb.append(", realTimeBalanceConsent=");
        sb.append(optional);
        sb.append(", realTimeBalanceRefresh=");
        sb.append(optional2);
        sb.append(", threeDSecureDataCollection=");
        sb.append(optional3);
        sb.append(", threeDSecureAuthentication=");
        sb.append(optional4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.fundingOptionId.hashCode() * 31) + this.realTimeBalanceConsent.hashCode()) * 31) + this.realTimeBalanceRefresh.hashCode()) * 31) + this.threeDSecureDataCollection.hashCode()) * 31) + this.threeDSecureAuthentication.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ResolveCryptocurrencyTradeContingenciesInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ResolveCryptocurrencyTradeContingenciesInput resolveCryptocurrencyTradeContingenciesInput = (com.paypal.oslo.api.graphql.schema.type.ResolveCryptocurrencyTradeContingenciesInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptionId, resolveCryptocurrencyTradeContingenciesInput.fundingOptionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.realTimeBalanceConsent, resolveCryptocurrencyTradeContingenciesInput.realTimeBalanceConsent) && kotlin.jvm.internal.Intrinsics.areEqual(this.realTimeBalanceRefresh, resolveCryptocurrencyTradeContingenciesInput.realTimeBalanceRefresh) && kotlin.jvm.internal.Intrinsics.areEqual(this.threeDSecureDataCollection, resolveCryptocurrencyTradeContingenciesInput.threeDSecureDataCollection) && kotlin.jvm.internal.Intrinsics.areEqual(this.threeDSecureAuthentication, resolveCryptocurrencyTradeContingenciesInput.threeDSecureAuthentication);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ResolveCryptocurrencyTradeContingenciesInput copy(java.lang.String fundingOptionId, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRealTimeBalanceConsentResolutionInput> realTimeBalanceConsent, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRealTimeBalanceRefreshResolutionInput> realTimeBalanceRefresh, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureDataCollectionResolutionInput> threeDSecureDataCollection, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureAuthenticationResolutionInput> threeDSecureAuthentication) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realTimeBalanceConsent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(realTimeBalanceRefresh, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDSecureDataCollection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDSecureAuthentication, "");
        return new com.paypal.oslo.api.graphql.schema.type.ResolveCryptocurrencyTradeContingenciesInput(fundingOptionId, realTimeBalanceConsent, realTimeBalanceRefresh, threeDSecureDataCollection, threeDSecureAuthentication);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureAuthenticationResolutionInput> component5() {
        return this.threeDSecureAuthentication;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureDataCollectionResolutionInput> component4() {
        return this.threeDSecureDataCollection;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRealTimeBalanceRefreshResolutionInput> component3() {
        return this.realTimeBalanceRefresh;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyRealTimeBalanceConsentResolutionInput> component2() {
        return this.realTimeBalanceConsent;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFundingOptionId() {
        return this.fundingOptionId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ResolveCryptocurrencyTradeContingenciesInput copy$default(com.paypal.oslo.api.graphql.schema.type.ResolveCryptocurrencyTradeContingenciesInput resolveCryptocurrencyTradeContingenciesInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, com.apollographql.apollo.api.Optional optional4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = resolveCryptocurrencyTradeContingenciesInput.fundingOptionId;
        }
        if ((i & 2) != 0) {
            optional = resolveCryptocurrencyTradeContingenciesInput.realTimeBalanceConsent;
        }
        com.apollographql.apollo.api.Optional optional5 = optional;
        if ((i & 4) != 0) {
            optional2 = resolveCryptocurrencyTradeContingenciesInput.realTimeBalanceRefresh;
        }
        com.apollographql.apollo.api.Optional optional6 = optional2;
        if ((i & 8) != 0) {
            optional3 = resolveCryptocurrencyTradeContingenciesInput.threeDSecureDataCollection;
        }
        com.apollographql.apollo.api.Optional optional7 = optional3;
        if ((i & 16) != 0) {
            optional4 = resolveCryptocurrencyTradeContingenciesInput.threeDSecureAuthentication;
        }
        return resolveCryptocurrencyTradeContingenciesInput.copy(str, optional5, optional6, optional7, optional4);
    }
}
