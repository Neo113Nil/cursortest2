package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/TokenServiceProviderInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/IssuanceNetworkTokenServiceProvider;", "type", "", "networkEnrollmentId", "<init>", "(Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/TokenServiceProviderInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/apollographql/apollo/api/Optional;", "getType", "Ljava/lang/String;", "getNetworkEnrollmentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TokenServiceProviderInput {
    private final java.lang.String networkEnrollmentId;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider> type;

    /* JADX WARN: Multi-variable type inference failed */
    public TokenServiceProviderInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider> optional, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = optional;
        this.networkEnrollmentId = str;
    }

    public /* synthetic */ TokenServiceProviderInput(com.apollographql.apollo.api.Optional.Absent absent, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, str);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider> getType() {
        return this.type;
    }

    public final java.lang.String getNetworkEnrollmentId() {
        return this.networkEnrollmentId;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider> optional = this.type;
        java.lang.String str = this.networkEnrollmentId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenServiceProviderInput(type=");
        sb.append(optional);
        sb.append(", networkEnrollmentId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.type.hashCode() * 31) + this.networkEnrollmentId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.TokenServiceProviderInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.TokenServiceProviderInput tokenServiceProviderInput = (com.paypal.oslo.api.graphql.schema.type.TokenServiceProviderInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, tokenServiceProviderInput.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.networkEnrollmentId, tokenServiceProviderInput.networkEnrollmentId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.TokenServiceProviderInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider> type, java.lang.String networkEnrollmentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkEnrollmentId, "");
        return new com.paypal.oslo.api.graphql.schema.type.TokenServiceProviderInput(type, networkEnrollmentId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNetworkEnrollmentId() {
        return this.networkEnrollmentId;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.IssuanceNetworkTokenServiceProvider> component1() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.TokenServiceProviderInput copy$default(com.paypal.oslo.api.graphql.schema.type.TokenServiceProviderInput tokenServiceProviderInput, com.apollographql.apollo.api.Optional optional, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = tokenServiceProviderInput.type;
        }
        if ((i & 2) != 0) {
            str = tokenServiceProviderInput.networkEnrollmentId;
        }
        return tokenServiceProviderInput.copy(optional, str);
    }
}
