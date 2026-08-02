package com.paypal.oslo.feature.identity.passkey.login.auth.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginSuccess;", "Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginResult;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginResult;", "loginResult", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionSuccess;", com.visa.cbp.getDeviceCerts.ReplenishRequest, "<init>", "(Lcom/paypal/oslo/feature/identity/login/domain/model/LoginResult;Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/identity/login/domain/model/LoginResult;", "component2", "()Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionSuccess;", "copy", "(Lcom/paypal/oslo/feature/identity/login/domain/model/LoginResult;Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionSuccess;)Lcom/paypal/oslo/feature/identity/passkey/login/auth/domain/model/PasskeyLoginSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginResult;", "getLoginResult", "Lcom/paypal/oslo/feature/identity/passkey/login/assertion/domain/model/PasskeyAssertionSuccess;", "getAssertion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PasskeyLoginSuccess extends com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginResult {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess assertion;
    private final com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyLoginSuccess(com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult, com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess passkeyAssertionSuccess) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyAssertionSuccess, "");
        this.loginResult = loginResult;
        this.assertion = passkeyAssertionSuccess;
    }

    public final com.paypal.oslo.feature.identity.login.domain.model.LoginResult getLoginResult() {
        return this.loginResult;
    }

    public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess getAssertion() {
        return this.assertion;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult = this.loginResult;
        com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess passkeyAssertionSuccess = this.assertion;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyLoginSuccess(loginResult=");
        sb.append(loginResult);
        sb.append(", assertion=");
        sb.append(passkeyAssertionSuccess);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.loginResult.hashCode() * 31) + this.assertion.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess passkeyLoginSuccess = (com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.loginResult, passkeyLoginSuccess.loginResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.assertion, passkeyLoginSuccess.assertion);
    }

    public final com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess copy(com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult, com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess assertion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assertion, "");
        return new com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess(loginResult, assertion);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess getAssertion() {
        return this.assertion;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.login.domain.model.LoginResult getLoginResult() {
        return this.loginResult;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess copy$default(com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess passkeyLoginSuccess, com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult, com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess passkeyAssertionSuccess, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            loginResult = passkeyLoginSuccess.loginResult;
        }
        if ((i & 2) != 0) {
            passkeyAssertionSuccess = passkeyLoginSuccess.assertion;
        }
        return passkeyLoginSuccess.copy(loginResult, passkeyAssertionSuccess);
    }
}
