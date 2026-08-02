package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ4\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyThreeDSecureAuthenticationResolutionInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyThreeDSecureVersion;", "version", "", "paymentAuthenticationResponse", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyThreeDSecureAuthenticationResolutionInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getVersion", "getPaymentAuthenticationResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CryptocurrencyThreeDSecureAuthenticationResolutionInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> paymentAuthenticationResponse;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureVersion> version;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptocurrencyThreeDSecureAuthenticationResolutionInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureVersion> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.version = optional;
        this.paymentAuthenticationResponse = optional2;
    }

    public /* synthetic */ CryptocurrencyThreeDSecureAuthenticationResolutionInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureVersion> getVersion() {
        return this.version;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getPaymentAuthenticationResponse() {
        return this.paymentAuthenticationResponse;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureVersion> optional = this.version;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.paymentAuthenticationResponse;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyThreeDSecureAuthenticationResolutionInput(version=");
        sb.append(optional);
        sb.append(", paymentAuthenticationResponse=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.version.hashCode() * 31) + this.paymentAuthenticationResponse.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureAuthenticationResolutionInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureAuthenticationResolutionInput cryptocurrencyThreeDSecureAuthenticationResolutionInput = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureAuthenticationResolutionInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.version, cryptocurrencyThreeDSecureAuthenticationResolutionInput.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAuthenticationResponse, cryptocurrencyThreeDSecureAuthenticationResolutionInput.paymentAuthenticationResponse);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureAuthenticationResolutionInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureVersion> version, com.apollographql.apollo.api.Optional<java.lang.String> paymentAuthenticationResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAuthenticationResponse, "");
        return new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureAuthenticationResolutionInput(version, paymentAuthenticationResponse);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.paymentAuthenticationResponse;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureVersion> component1() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureAuthenticationResolutionInput copy$default(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureAuthenticationResolutionInput cryptocurrencyThreeDSecureAuthenticationResolutionInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = cryptocurrencyThreeDSecureAuthenticationResolutionInput.version;
        }
        if ((i & 2) != 0) {
            optional2 = cryptocurrencyThreeDSecureAuthenticationResolutionInput.paymentAuthenticationResponse;
        }
        return cryptocurrencyThreeDSecureAuthenticationResolutionInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptocurrencyThreeDSecureAuthenticationResolutionInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
