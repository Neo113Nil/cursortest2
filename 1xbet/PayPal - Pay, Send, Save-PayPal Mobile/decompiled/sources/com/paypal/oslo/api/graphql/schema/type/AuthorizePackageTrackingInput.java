package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u001e\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JF\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u000fR(\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AuthorizePackageTrackingInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;", "provider", "", "authorizationCode", "state", "Lcom/apollographql/apollo/api/Optional;", "", "scopes", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/AuthorizePackageTrackingInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PackageTrackingIdentityProvider;", "getProvider", "Ljava/lang/String;", "getAuthorizationCode", "getState", "Lcom/apollographql/apollo/api/Optional;", "getScopes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AuthorizePackageTrackingInput {
    private final java.lang.String authorizationCode;
    private final com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider provider;
    private final com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> scopes;
    private final java.lang.String state;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthorizePackageTrackingInput(com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider, java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional<? extends java.util.List<java.lang.String>> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageTrackingIdentityProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.provider = packageTrackingIdentityProvider;
        this.authorizationCode = str;
        this.state = str2;
        this.scopes = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider getProvider() {
        return this.provider;
    }

    public final java.lang.String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public final java.lang.String getState() {
        return this.state;
    }

    public /* synthetic */ AuthorizePackageTrackingInput(com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider, java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(packageTrackingIdentityProvider, str, str2, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> getScopes() {
        return this.scopes;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider = this.provider;
        java.lang.String str = this.authorizationCode;
        java.lang.String str2 = this.state;
        com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> optional = this.scopes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthorizePackageTrackingInput(provider=");
        sb.append(packageTrackingIdentityProvider);
        sb.append(", authorizationCode=");
        sb.append(str);
        sb.append(", state=");
        sb.append(str2);
        sb.append(", scopes=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.provider.hashCode() * 31) + this.authorizationCode.hashCode()) * 31) + this.state.hashCode()) * 31) + this.scopes.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.AuthorizePackageTrackingInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.AuthorizePackageTrackingInput authorizePackageTrackingInput = (com.paypal.oslo.api.graphql.schema.type.AuthorizePackageTrackingInput) other;
        return this.provider == authorizePackageTrackingInput.provider && kotlin.jvm.internal.Intrinsics.areEqual(this.authorizationCode, authorizePackageTrackingInput.authorizationCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, authorizePackageTrackingInput.state) && kotlin.jvm.internal.Intrinsics.areEqual(this.scopes, authorizePackageTrackingInput.scopes);
    }

    public final com.paypal.oslo.api.graphql.schema.type.AuthorizePackageTrackingInput copy(com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider provider, java.lang.String authorizationCode, java.lang.String state, com.apollographql.apollo.api.Optional<? extends java.util.List<java.lang.String>> scopes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authorizationCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scopes, "");
        return new com.paypal.oslo.api.graphql.schema.type.AuthorizePackageTrackingInput(provider, authorizationCode, state, scopes);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<java.lang.String>> component4() {
        return this.scopes;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAuthorizationCode() {
        return this.authorizationCode;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider getProvider() {
        return this.provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AuthorizePackageTrackingInput copy$default(com.paypal.oslo.api.graphql.schema.type.AuthorizePackageTrackingInput authorizePackageTrackingInput, com.paypal.oslo.api.graphql.schema.type.PackageTrackingIdentityProvider packageTrackingIdentityProvider, java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            packageTrackingIdentityProvider = authorizePackageTrackingInput.provider;
        }
        if ((i & 2) != 0) {
            str = authorizePackageTrackingInput.authorizationCode;
        }
        if ((i & 4) != 0) {
            str2 = authorizePackageTrackingInput.state;
        }
        if ((i & 8) != 0) {
            optional = authorizePackageTrackingInput.scopes;
        }
        return authorizePackageTrackingInput.copy(packageTrackingIdentityProvider, str, str2, optional);
    }
}
