package com.paypal.oslo.feature.identity.passwordlogin.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b\t\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordlogin/domain/model/PasswordLoginRequest;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "", "requestId", "email", "password", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "intent", "", "isAuthRequired", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;Z)Lcom/paypal/oslo/feature/identity/passwordlogin/domain/model/PasswordLoginRequest;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRequestId", "getEmail", "getPassword", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "getIntent", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PasswordLoginRequest implements com.paypal.oslo.feature.identity.login.domain.model.LoginRequest {
    public static final int $stable = 0;
    private final java.lang.String email;
    private final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent intent;
    private final boolean isAuthRequired;
    private final java.lang.String password;
    private final java.lang.String requestId;

    public PasswordLoginRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
        this.requestId = str;
        this.email = str2;
        this.password = str3;
        this.intent = authIntent;
        this.isAuthRequired = z;
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.model.LoginRequest
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.String getPassword() {
        return this.password;
    }

    public /* synthetic */ PasswordLoginRequest(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN : authIntent, (i & 16) != 0 ? true : z);
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.model.LoginRequest
    public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getIntent() {
        return this.intent;
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.model.LoginRequest
    public final boolean isAuthRequired() {
        return this.isAuthRequired;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.requestId;
        java.lang.String str2 = this.email;
        java.lang.String str3 = this.password;
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent = this.intent;
        boolean z = this.isAuthRequired;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasswordLoginRequest(requestId=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", password=");
        sb.append(str3);
        sb.append(", intent=");
        sb.append(authIntent);
        sb.append(", isAuthRequired=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.requestId.hashCode() * 31) + this.email.hashCode()) * 31) + this.password.hashCode()) * 31) + this.intent.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isAuthRequired);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passwordlogin.domain.model.PasswordLoginRequest)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passwordlogin.domain.model.PasswordLoginRequest passwordLoginRequest = (com.paypal.oslo.feature.identity.passwordlogin.domain.model.PasswordLoginRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, passwordLoginRequest.requestId) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, passwordLoginRequest.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.password, passwordLoginRequest.password) && this.intent == passwordLoginRequest.intent && this.isAuthRequired == passwordLoginRequest.isAuthRequired;
    }

    public final com.paypal.oslo.feature.identity.passwordlogin.domain.model.PasswordLoginRequest copy(java.lang.String requestId, java.lang.String email, java.lang.String password, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent intent, boolean isAuthRequired) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return new com.paypal.oslo.feature.identity.passwordlogin.domain.model.PasswordLoginRequest(requestId, email, password, intent, isAuthRequired);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsAuthRequired() {
        return this.isAuthRequired;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getIntent() {
        return this.intent;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPassword() {
        return this.password;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passwordlogin.domain.model.PasswordLoginRequest copy$default(com.paypal.oslo.feature.identity.passwordlogin.domain.model.PasswordLoginRequest passwordLoginRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = passwordLoginRequest.requestId;
        }
        if ((i & 2) != 0) {
            str2 = passwordLoginRequest.email;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = passwordLoginRequest.password;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            authIntent = passwordLoginRequest.intent;
        }
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent2 = authIntent;
        if ((i & 16) != 0) {
            z = passwordLoginRequest.isAuthRequired;
        }
        return passwordLoginRequest.copy(str, str4, str5, authIntent2, z);
    }
}
