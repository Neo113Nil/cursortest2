package com.paypal.oslo.feature.identity.passkey.login.auth.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\b\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginRequest;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "", "requestId", com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.FEATURE, "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "intent", "", "isAuthRequired", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;Z)Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginRequest;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRequestId", "getPasskey", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "getIntent", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PasskeyLoginRequest implements com.paypal.oslo.feature.identity.login.domain.model.LoginRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent intent;
    private final boolean isAuthRequired;
    private final java.lang.String passkey;
    private final java.lang.String requestId;

    public PasskeyLoginRequest(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
        this.requestId = str;
        this.passkey = str2;
        this.intent = authIntent;
        this.isAuthRequired = z;
        if (kotlin.text.StringsKt.isBlank(getRequestId())) {
            throw new java.lang.IllegalArgumentException("Passkey login failed: Request ID is required".toString());
        }
        if (kotlin.text.StringsKt.isBlank(str2)) {
            throw new java.lang.IllegalArgumentException("Passkey login failed: Assertion data is empty".toString());
        }
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.model.LoginRequest
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    public final java.lang.String getPasskey() {
        return this.passkey;
    }

    public /* synthetic */ PasskeyLoginRequest(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN : authIntent, (i & 8) != 0 ? true : z);
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.model.LoginRequest
    public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getIntent() {
        return this.intent;
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.model.LoginRequest
    /* renamed from: isAuthRequired */
    public final boolean getIsAuthRequired() {
        return this.isAuthRequired;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.requestId;
        java.lang.String str2 = this.passkey;
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent = this.intent;
        boolean z = this.isAuthRequired;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyLoginRequest(requestId=");
        sb.append(str);
        sb.append(", passkey=");
        sb.append(str2);
        sb.append(", intent=");
        sb.append(authIntent);
        sb.append(", isAuthRequired=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.requestId.hashCode() * 31) + this.passkey.hashCode()) * 31) + this.intent.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isAuthRequired);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginRequest)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginRequest passkeyLoginRequest = (com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, passkeyLoginRequest.requestId) && kotlin.jvm.internal.Intrinsics.areEqual(this.passkey, passkeyLoginRequest.passkey) && this.intent == passkeyLoginRequest.intent && this.isAuthRequired == passkeyLoginRequest.isAuthRequired;
    }

    public final com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginRequest copy(java.lang.String requestId, java.lang.String passkey, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent intent, boolean isAuthRequired) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return new com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginRequest(requestId, passkey, intent, isAuthRequired);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAuthRequired() {
        return this.isAuthRequired;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getIntent() {
        return this.intent;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPasskey() {
        return this.passkey;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginRequest copy$default(com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginRequest passkeyLoginRequest, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = passkeyLoginRequest.requestId;
        }
        if ((i & 2) != 0) {
            str2 = passkeyLoginRequest.passkey;
        }
        if ((i & 4) != 0) {
            authIntent = passkeyLoginRequest.intent;
        }
        if ((i & 8) != 0) {
            z = passkeyLoginRequest.isAuthRequired;
        }
        return passkeyLoginRequest.copy(str, str2, authIntent, z);
    }
}
