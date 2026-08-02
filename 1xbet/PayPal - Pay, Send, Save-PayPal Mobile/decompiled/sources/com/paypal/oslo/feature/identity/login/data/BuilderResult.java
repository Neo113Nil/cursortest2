package com.paypal.oslo.feature.identity.login.data;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\f\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\f\b\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001e\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/data/BuilderResult;", "", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationGrantType;", "Lcom/paypal/oslo/feature/identity/graphql/type/AuthenticationGrantType;", "grantType", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeInput;", "Lcom/paypal/oslo/feature/identity/graphql/type/AuthenticationChallengeInput;", "challengeInput", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationGrantType;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeInput;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationGrantType;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeInput;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationGrantType;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeInput;)Lcom/paypal/oslo/feature/identity/login/data/BuilderResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationGrantType;", "getGrantType", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationChallengeInput;", "getChallengeInput"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BuilderResult {
    public static final int $stable = 8;
    private final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput challengeInput;
    private final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType grantType;

    public BuilderResult(com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType authenticationGrantType, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput authenticationChallengeInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationChallengeInput, "");
        this.grantType = authenticationGrantType;
        this.challengeInput = authenticationChallengeInput;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType getGrantType() {
        return this.grantType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput getChallengeInput() {
        return this.challengeInput;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType authenticationGrantType = this.grantType;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput authenticationChallengeInput = this.challengeInput;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BuilderResult(grantType=");
        sb.append(authenticationGrantType);
        sb.append(", challengeInput=");
        sb.append(authenticationChallengeInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType authenticationGrantType = this.grantType;
        return ((authenticationGrantType == null ? 0 : authenticationGrantType.hashCode()) * 31) + this.challengeInput.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.login.data.BuilderResult)) {
            return false;
        }
        com.paypal.oslo.feature.identity.login.data.BuilderResult builderResult = (com.paypal.oslo.feature.identity.login.data.BuilderResult) other;
        return this.grantType == builderResult.grantType && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeInput, builderResult.challengeInput);
    }

    public final com.paypal.oslo.feature.identity.login.data.BuilderResult copy(com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType grantType, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput challengeInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeInput, "");
        return new com.paypal.oslo.feature.identity.login.data.BuilderResult(grantType, challengeInput);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput getChallengeInput() {
        return this.challengeInput;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType getGrantType() {
        return this.grantType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.login.data.BuilderResult copy$default(com.paypal.oslo.feature.identity.login.data.BuilderResult builderResult, com.paypal.oslo.api.graphql.schema.type.AuthenticationGrantType authenticationGrantType, com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput authenticationChallengeInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            authenticationGrantType = builderResult.grantType;
        }
        if ((i & 2) != 0) {
            authenticationChallengeInput = builderResult.challengeInput;
        }
        return builderResult.copy(authenticationGrantType, authenticationChallengeInput);
    }
}
