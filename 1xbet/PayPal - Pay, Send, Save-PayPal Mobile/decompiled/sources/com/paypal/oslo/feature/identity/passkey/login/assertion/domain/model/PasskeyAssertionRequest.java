package com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionRequest;", "", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;", "passkeyLoginCredentialChallenge", "", "preferImmediatelyAvailableCredentials", "", "encodedChallenge", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;ZLjava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;", "component2", "()Z", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;ZLjava/lang/String;)Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionRequest;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;", "getPasskeyLoginCredentialChallenge", "Z", "getPreferImmediatelyAvailableCredentials", "Ljava/lang/String;", "getEncodedChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PasskeyAssertionRequest {
    public static final int $stable = 8;
    private final java.lang.String encodedChallenge;
    private final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge passkeyLoginCredentialChallenge;
    private final boolean preferImmediatelyAvailableCredentials;

    public PasskeyAssertionRequest(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge passkeyLoginCredentialChallenge, boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyLoginCredentialChallenge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.passkeyLoginCredentialChallenge = passkeyLoginCredentialChallenge;
        this.preferImmediatelyAvailableCredentials = z;
        this.encodedChallenge = str;
    }

    public final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge getPasskeyLoginCredentialChallenge() {
        return this.passkeyLoginCredentialChallenge;
    }

    public final boolean getPreferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }

    public final java.lang.String getEncodedChallenge() {
        return this.encodedChallenge;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge passkeyLoginCredentialChallenge = this.passkeyLoginCredentialChallenge;
        boolean z = this.preferImmediatelyAvailableCredentials;
        java.lang.String str = this.encodedChallenge;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyAssertionRequest(passkeyLoginCredentialChallenge=");
        sb.append(passkeyLoginCredentialChallenge);
        sb.append(", preferImmediatelyAvailableCredentials=");
        sb.append(z);
        sb.append(", encodedChallenge=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.passkeyLoginCredentialChallenge.hashCode() * 31) + java.lang.Boolean.hashCode(this.preferImmediatelyAvailableCredentials)) * 31) + this.encodedChallenge.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionRequest)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionRequest passkeyAssertionRequest = (com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.passkeyLoginCredentialChallenge, passkeyAssertionRequest.passkeyLoginCredentialChallenge) && this.preferImmediatelyAvailableCredentials == passkeyAssertionRequest.preferImmediatelyAvailableCredentials && kotlin.jvm.internal.Intrinsics.areEqual(this.encodedChallenge, passkeyAssertionRequest.encodedChallenge);
    }

    public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionRequest copy(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge passkeyLoginCredentialChallenge, boolean preferImmediatelyAvailableCredentials, java.lang.String encodedChallenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyLoginCredentialChallenge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedChallenge, "");
        return new com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionRequest(passkeyLoginCredentialChallenge, preferImmediatelyAvailableCredentials, encodedChallenge);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getEncodedChallenge() {
        return this.encodedChallenge;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getPreferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge getPasskeyLoginCredentialChallenge() {
        return this.passkeyLoginCredentialChallenge;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionRequest copy$default(com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionRequest passkeyAssertionRequest, com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge passkeyLoginCredentialChallenge, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            passkeyLoginCredentialChallenge = passkeyAssertionRequest.passkeyLoginCredentialChallenge;
        }
        if ((i & 2) != 0) {
            z = passkeyAssertionRequest.preferImmediatelyAvailableCredentials;
        }
        if ((i & 4) != 0) {
            str = passkeyAssertionRequest.encodedChallenge;
        }
        return passkeyAssertionRequest.copy(passkeyLoginCredentialChallenge, z, str);
    }
}
