package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJH\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordIdentityChallengeInput;", "", "", androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, "password", "Lcom/apollographql/apollo/api/Optional;", "nonce", "partialToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/apollographql/apollo/api/Optional;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordIdentityChallengeInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUsername", "getPassword", "Lcom/apollographql/apollo/api/Optional;", "getNonce", "getPartialToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChangePasswordIdentityChallengeInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> nonce;
    private final com.apollographql.apollo.api.Optional<java.lang.String> partialToken;
    private final java.lang.String password;
    private final java.lang.String username;

    public ChangePasswordIdentityChallengeInput(java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.username = str;
        this.password = str2;
        this.nonce = optional;
        this.partialToken = optional2;
    }

    public final java.lang.String getUsername() {
        return this.username;
    }

    public final java.lang.String getPassword() {
        return this.password;
    }

    public /* synthetic */ ChangePasswordIdentityChallengeInput(java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getNonce() {
        return this.nonce;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getPartialToken() {
        return this.partialToken;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.username;
        java.lang.String str2 = this.password;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.nonce;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.partialToken;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChangePasswordIdentityChallengeInput(username=");
        sb.append(str);
        sb.append(", password=");
        sb.append(str2);
        sb.append(", nonce=");
        sb.append(optional);
        sb.append(", partialToken=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.username.hashCode() * 31) + this.password.hashCode()) * 31) + this.nonce.hashCode()) * 31) + this.partialToken.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ChangePasswordIdentityChallengeInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ChangePasswordIdentityChallengeInput changePasswordIdentityChallengeInput = (com.paypal.oslo.api.graphql.schema.type.ChangePasswordIdentityChallengeInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.username, changePasswordIdentityChallengeInput.username) && kotlin.jvm.internal.Intrinsics.areEqual(this.password, changePasswordIdentityChallengeInput.password) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, changePasswordIdentityChallengeInput.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, changePasswordIdentityChallengeInput.partialToken);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ChangePasswordIdentityChallengeInput copy(java.lang.String username, java.lang.String password, com.apollographql.apollo.api.Optional<java.lang.String> nonce, com.apollographql.apollo.api.Optional<java.lang.String> partialToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partialToken, "");
        return new com.paypal.oslo.api.graphql.schema.type.ChangePasswordIdentityChallengeInput(username, password, nonce, partialToken);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component4() {
        return this.partialToken;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.nonce;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPassword() {
        return this.password;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUsername() {
        return this.username;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ChangePasswordIdentityChallengeInput copy$default(com.paypal.oslo.api.graphql.schema.type.ChangePasswordIdentityChallengeInput changePasswordIdentityChallengeInput, java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = changePasswordIdentityChallengeInput.username;
        }
        if ((i & 2) != 0) {
            str2 = changePasswordIdentityChallengeInput.password;
        }
        if ((i & 4) != 0) {
            optional = changePasswordIdentityChallengeInput.nonce;
        }
        if ((i & 8) != 0) {
            optional2 = changePasswordIdentityChallengeInput.partialToken;
        }
        return changePasswordIdentityChallengeInput.copy(str, str2, optional, optional2);
    }
}
