package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ>\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureDataCollectionResolutionInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureVersion;", "version", "Lcom/apollographql/apollo/api/Optional;", "", "referenceId", "returnUrl", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureVersion;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureVersion;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureVersion;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureDataCollectionResolutionInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/ThreeDSecureVersion;", "getVersion", "Lcom/apollographql/apollo/api/Optional;", "getReferenceId", "getReturnUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ThreeDSecureDataCollectionResolutionInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> referenceId;
    private final com.apollographql.apollo.api.Optional<java.lang.String> returnUrl;
    private final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion version;

    public ThreeDSecureDataCollectionResolutionInput(com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion threeDSecureVersion, com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDSecureVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.version = threeDSecureVersion;
        this.referenceId = optional;
        this.returnUrl = optional2;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion getVersion() {
        return this.version;
    }

    public /* synthetic */ ThreeDSecureDataCollectionResolutionInput(com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion threeDSecureVersion, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(threeDSecureVersion, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getReferenceId() {
        return this.referenceId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getReturnUrl() {
        return this.returnUrl;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion threeDSecureVersion = this.version;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.referenceId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.returnUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ThreeDSecureDataCollectionResolutionInput(version=");
        sb.append(threeDSecureVersion);
        sb.append(", referenceId=");
        sb.append(optional);
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
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDataCollectionResolutionInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDataCollectionResolutionInput threeDSecureDataCollectionResolutionInput = (com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDataCollectionResolutionInput) other;
        return this.version == threeDSecureDataCollectionResolutionInput.version && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, threeDSecureDataCollectionResolutionInput.referenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, threeDSecureDataCollectionResolutionInput.returnUrl);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDataCollectionResolutionInput copy(com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion version, com.apollographql.apollo.api.Optional<java.lang.String> referenceId, com.apollographql.apollo.api.Optional<java.lang.String> returnUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnUrl, "");
        return new com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDataCollectionResolutionInput(version, referenceId, returnUrl);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.returnUrl;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.referenceId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDataCollectionResolutionInput copy$default(com.paypal.oslo.api.graphql.schema.type.ThreeDSecureDataCollectionResolutionInput threeDSecureDataCollectionResolutionInput, com.paypal.oslo.api.graphql.schema.type.ThreeDSecureVersion threeDSecureVersion, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            threeDSecureVersion = threeDSecureDataCollectionResolutionInput.version;
        }
        if ((i & 2) != 0) {
            optional = threeDSecureDataCollectionResolutionInput.referenceId;
        }
        if ((i & 4) != 0) {
            optional2 = threeDSecureDataCollectionResolutionInput.returnUrl;
        }
        return threeDSecureDataCollectionResolutionInput.copy(threeDSecureVersion, optional, optional2);
    }
}
