package com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeRequest;", "", "", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "partyId", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "intent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChallenge", "getPartyId", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PasskeyLoginChallengeRequest {
    public static final int $stable = 0;
    private final java.lang.String challenge;
    private final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent intent;
    private final java.lang.String partyId;

    public PasskeyLoginChallengeRequest(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
        this.challenge = str;
        this.partyId = str2;
        this.intent = authIntent;
        if (str2 != null && kotlin.text.StringsKt.isBlank(str2)) {
            throw new java.lang.IllegalArgumentException("If provided, Relying Party ID cannot be empty".toString());
        }
    }

    public final java.lang.String getChallenge() {
        return this.challenge;
    }

    public final java.lang.String getPartyId() {
        return this.partyId;
    }

    public /* synthetic */ PasskeyLoginChallengeRequest(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN : authIntent);
    }

    public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getIntent() {
        return this.intent;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.challenge;
        java.lang.String str2 = this.partyId;
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent = this.intent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyLoginChallengeRequest(challenge=");
        sb.append(str);
        sb.append(", partyId=");
        sb.append(str2);
        sb.append(", intent=");
        sb.append(authIntent);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.challenge.hashCode();
        java.lang.String str = this.partyId;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.intent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeRequest)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeRequest passkeyLoginChallengeRequest = (com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, passkeyLoginChallengeRequest.challenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.partyId, passkeyLoginChallengeRequest.partyId) && this.intent == passkeyLoginChallengeRequest.intent;
    }

    public final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeRequest copy(java.lang.String challenge, java.lang.String partyId, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeRequest(challenge, partyId, intent);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getIntent() {
        return this.intent;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPartyId() {
        return this.partyId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getChallenge() {
        return this.challenge;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeRequest copy$default(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeRequest passkeyLoginChallengeRequest, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = passkeyLoginChallengeRequest.challenge;
        }
        if ((i & 2) != 0) {
            str2 = passkeyLoginChallengeRequest.partyId;
        }
        if ((i & 4) != 0) {
            authIntent = passkeyLoginChallengeRequest.intent;
        }
        return passkeyLoginChallengeRequest.copy(str, str2, authIntent);
    }
}
