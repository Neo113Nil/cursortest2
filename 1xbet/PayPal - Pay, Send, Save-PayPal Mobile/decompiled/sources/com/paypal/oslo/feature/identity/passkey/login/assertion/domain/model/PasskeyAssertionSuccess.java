package com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionSuccess;", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionResult;", "", "rawJsonResponse", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;", "passkeyLoginCredentialChallenge", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;)V", "toUrlEncoded", "()Ljava/lang/String;", "component1", "component2", "()Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRawJsonResponse", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;", "getPasskeyLoginCredentialChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PasskeyAssertionSuccess extends com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionResult {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge passkeyLoginCredentialChallenge;
    private final java.lang.String rawJsonResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyAssertionSuccess(java.lang.String str, com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge passkeyLoginCredentialChallenge) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyLoginCredentialChallenge, "");
        this.rawJsonResponse = str;
        this.passkeyLoginCredentialChallenge = passkeyLoginCredentialChallenge;
    }

    public final java.lang.String getRawJsonResponse() {
        return this.rawJsonResponse;
    }

    public final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge getPasskeyLoginCredentialChallenge() {
        return this.passkeyLoginCredentialChallenge;
    }

    public final java.lang.String toUrlEncoded() {
        java.lang.String encode = java.net.URLEncoder.encode(this.rawJsonResponse, kotlin.text.Charsets.UTF_8.name());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encode, "");
        return encode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.rawJsonResponse;
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge passkeyLoginCredentialChallenge = this.passkeyLoginCredentialChallenge;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyAssertionSuccess(rawJsonResponse=");
        sb.append(str);
        sb.append(", passkeyLoginCredentialChallenge=");
        sb.append(passkeyLoginCredentialChallenge);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.rawJsonResponse.hashCode() * 31) + this.passkeyLoginCredentialChallenge.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess passkeyAssertionSuccess = (com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.rawJsonResponse, passkeyAssertionSuccess.rawJsonResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.passkeyLoginCredentialChallenge, passkeyAssertionSuccess.passkeyLoginCredentialChallenge);
    }

    public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess copy(java.lang.String rawJsonResponse, com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge passkeyLoginCredentialChallenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawJsonResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyLoginCredentialChallenge, "");
        return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess(rawJsonResponse, passkeyLoginCredentialChallenge);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge getPasskeyLoginCredentialChallenge() {
        return this.passkeyLoginCredentialChallenge;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getRawJsonResponse() {
        return this.rawJsonResponse;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess copy$default(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess passkeyAssertionSuccess, java.lang.String str, com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge passkeyLoginCredentialChallenge, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = passkeyAssertionSuccess.rawJsonResponse;
        }
        if ((i & 2) != 0) {
            passkeyLoginCredentialChallenge = passkeyAssertionSuccess.passkeyLoginCredentialChallenge;
        }
        return passkeyAssertionSuccess.copy(str, passkeyLoginCredentialChallenge);
    }
}
