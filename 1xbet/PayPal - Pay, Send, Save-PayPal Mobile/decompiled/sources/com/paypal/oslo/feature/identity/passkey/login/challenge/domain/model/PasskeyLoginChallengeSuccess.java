package com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeSuccess;", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeResult;", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;", "passkeyLoginCredentialChallenge", "", "encodedChallenge", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginCredentialChallenge;", "getPasskeyLoginCredentialChallenge", "Ljava/lang/String;", "getEncodedChallenge"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PasskeyLoginChallengeSuccess extends com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeResult {
    public static final int $stable = 8;
    private final java.lang.String encodedChallenge;
    private final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge passkeyLoginCredentialChallenge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyLoginChallengeSuccess(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge passkeyLoginCredentialChallenge, java.lang.String str) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyLoginCredentialChallenge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.passkeyLoginCredentialChallenge = passkeyLoginCredentialChallenge;
        this.encodedChallenge = str;
    }

    public final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge getPasskeyLoginCredentialChallenge() {
        return this.passkeyLoginCredentialChallenge;
    }

    public final java.lang.String getEncodedChallenge() {
        return this.encodedChallenge;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge passkeyLoginCredentialChallenge = this.passkeyLoginCredentialChallenge;
        java.lang.String str = this.encodedChallenge;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyLoginChallengeSuccess(passkeyLoginCredentialChallenge=");
        sb.append(passkeyLoginCredentialChallenge);
        sb.append(", encodedChallenge=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.passkeyLoginCredentialChallenge.hashCode() * 31) + this.encodedChallenge.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess passkeyLoginChallengeSuccess = (com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.passkeyLoginCredentialChallenge, passkeyLoginChallengeSuccess.passkeyLoginCredentialChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.encodedChallenge, passkeyLoginChallengeSuccess.encodedChallenge);
    }

    public final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess copy(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge passkeyLoginCredentialChallenge, java.lang.String encodedChallenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyLoginCredentialChallenge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encodedChallenge, "");
        return new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess(passkeyLoginCredentialChallenge, encodedChallenge);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEncodedChallenge() {
        return this.encodedChallenge;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge getPasskeyLoginCredentialChallenge() {
        return this.passkeyLoginCredentialChallenge;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess copy$default(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeSuccess passkeyLoginChallengeSuccess, com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginCredentialChallenge passkeyLoginCredentialChallenge, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            passkeyLoginCredentialChallenge = passkeyLoginChallengeSuccess.passkeyLoginCredentialChallenge;
        }
        if ((i & 2) != 0) {
            str = passkeyLoginChallengeSuccess.encodedChallenge;
        }
        return passkeyLoginChallengeSuccess.copy(passkeyLoginCredentialChallenge, str);
    }
}
