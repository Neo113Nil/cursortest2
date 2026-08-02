package com.paypal.oslo.feature.identity.passwordrecovery.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\u0006\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/InitiatePasswordRecoveryInput;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "", "publicCredential", "requestId", "", "isAuthRequired", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "intent", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;)Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/InitiatePasswordRecoveryInput;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPublicCredential", "getRequestId", "Z", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class InitiatePasswordRecoveryInput implements com.paypal.oslo.feature.identity.login.domain.model.LoginRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent intent;
    private final boolean isAuthRequired;
    private final java.lang.String publicCredential;
    private final java.lang.String requestId;

    public InitiatePasswordRecoveryInput(java.lang.String str, java.lang.String str2, boolean z, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
        this.publicCredential = str;
        this.requestId = str2;
        this.isAuthRequired = z;
        this.intent = authIntent;
    }

    public final java.lang.String getPublicCredential() {
        return this.publicCredential;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ InitiatePasswordRecoveryInput(java.lang.String str, java.lang.String str2, boolean z, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.PASSWORD_RECOVERY : authIntent);
        if ((i & 2) != 0) {
            str2 = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
        }
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.model.LoginRequest
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.model.LoginRequest
    public final boolean isAuthRequired() {
        return this.isAuthRequired;
    }

    @Override // com.paypal.oslo.feature.identity.login.domain.model.LoginRequest
    public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getIntent() {
        return this.intent;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.publicCredential;
        java.lang.String str2 = this.requestId;
        boolean z = this.isAuthRequired;
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent = this.intent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InitiatePasswordRecoveryInput(publicCredential=");
        sb.append(str);
        sb.append(", requestId=");
        sb.append(str2);
        sb.append(", isAuthRequired=");
        sb.append(z);
        sb.append(", intent=");
        sb.append(authIntent);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.publicCredential.hashCode() * 31) + this.requestId.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isAuthRequired)) * 31) + this.intent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryInput)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryInput initiatePasswordRecoveryInput = (com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, initiatePasswordRecoveryInput.publicCredential) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, initiatePasswordRecoveryInput.requestId) && this.isAuthRequired == initiatePasswordRecoveryInput.isAuthRequired && this.intent == initiatePasswordRecoveryInput.intent;
    }

    public final com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryInput copy(java.lang.String publicCredential, java.lang.String requestId, boolean isAuthRequired, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        return new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryInput(publicCredential, requestId, isAuthRequired, intent);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getIntent() {
        return this.intent;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAuthRequired() {
        return this.isAuthRequired;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPublicCredential() {
        return this.publicCredential;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryInput copy$default(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryInput initiatePasswordRecoveryInput, java.lang.String str, java.lang.String str2, boolean z, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = initiatePasswordRecoveryInput.publicCredential;
        }
        if ((i & 2) != 0) {
            str2 = initiatePasswordRecoveryInput.requestId;
        }
        if ((i & 4) != 0) {
            z = initiatePasswordRecoveryInput.isAuthRequired;
        }
        if ((i & 8) != 0) {
            authIntent = initiatePasswordRecoveryInput.intent;
        }
        return initiatePasswordRecoveryInput.copy(str, str2, z, authIntent);
    }
}
