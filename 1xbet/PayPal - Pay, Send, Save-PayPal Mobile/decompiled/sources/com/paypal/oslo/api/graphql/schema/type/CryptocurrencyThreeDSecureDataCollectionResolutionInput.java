package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ>\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyThreeDSecureDataCollectionResolutionInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyThreeDSecureVersion;", "version", "", "referenceId", "returnUrl", "<init>", "(Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyThreeDSecureDataCollectionResolutionInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/apollographql/apollo/api/Optional;", "getVersion", "Ljava/lang/String;", "getReferenceId", "getReturnUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CryptocurrencyThreeDSecureDataCollectionResolutionInput {
    private final java.lang.String referenceId;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> returnUrl;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureVersion> version;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptocurrencyThreeDSecureDataCollectionResolutionInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureVersion> optional, java.lang.String str, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.version = optional;
        this.referenceId = str;
        this.returnUrl = optional2;
    }

    public /* synthetic */ CryptocurrencyThreeDSecureDataCollectionResolutionInput(com.apollographql.apollo.api.Optional.Absent absent, java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, str, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureVersion> getVersion() {
        return this.version;
    }

    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getReturnUrl() {
        return this.returnUrl;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureVersion> optional = this.version;
        java.lang.String str = this.referenceId;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional2 = this.returnUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyThreeDSecureDataCollectionResolutionInput(version=");
        sb.append(optional);
        sb.append(", referenceId=");
        sb.append(str);
        sb.append(", returnUrl=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.version.hashCode() * 31) + this.referenceId.hashCode()) * 31) + this.returnUrl.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureDataCollectionResolutionInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureDataCollectionResolutionInput cryptocurrencyThreeDSecureDataCollectionResolutionInput = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureDataCollectionResolutionInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.version, cryptocurrencyThreeDSecureDataCollectionResolutionInput.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, cryptocurrencyThreeDSecureDataCollectionResolutionInput.referenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, cryptocurrencyThreeDSecureDataCollectionResolutionInput.returnUrl);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureDataCollectionResolutionInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureVersion> version, java.lang.String referenceId, com.apollographql.apollo.api.Optional<? extends java.lang.Object> returnUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnUrl, "");
        return new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureDataCollectionResolutionInput(version, referenceId, returnUrl);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component3() {
        return this.returnUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureVersion> component1() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureDataCollectionResolutionInput copy$default(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyThreeDSecureDataCollectionResolutionInput cryptocurrencyThreeDSecureDataCollectionResolutionInput, com.apollographql.apollo.api.Optional optional, java.lang.String str, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = cryptocurrencyThreeDSecureDataCollectionResolutionInput.version;
        }
        if ((i & 2) != 0) {
            str = cryptocurrencyThreeDSecureDataCollectionResolutionInput.referenceId;
        }
        if ((i & 4) != 0) {
            optional2 = cryptocurrencyThreeDSecureDataCollectionResolutionInput.returnUrl;
        }
        return cryptocurrencyThreeDSecureDataCollectionResolutionInput.copy(optional, str, optional2);
    }
}
