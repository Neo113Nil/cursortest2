package com.paypal.oslo.feature.identity.userverification.domain.model.request;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/VerifyCredentialRequest;", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "authIntent", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;", "publicCredential", "<init>", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;)V", "component1", "()Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "component2", "()Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;", "copy", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;)Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/VerifyCredentialRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "getAuthIntent", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;", "getPublicCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class VerifyCredentialRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent;
    private final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential;

    public VerifyCredentialRequest(com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
        this.authIntent = authIntent;
        this.publicCredential = publicCredential;
    }

    public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getAuthIntent() {
        return this.authIntent;
    }

    public final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential getPublicCredential() {
        return this.publicCredential;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent = this.authIntent;
        com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential = this.publicCredential;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VerifyCredentialRequest(authIntent=");
        sb.append(authIntent);
        sb.append(", publicCredential=");
        sb.append(publicCredential);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.authIntent.hashCode() * 31) + this.publicCredential.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest)) {
            return false;
        }
        com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest verifyCredentialRequest = (com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest) other;
        return this.authIntent == verifyCredentialRequest.authIntent && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, verifyCredentialRequest.publicCredential);
    }

    public final com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest copy(com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authIntent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
        return new com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest(authIntent, publicCredential);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential getPublicCredential() {
        return this.publicCredential;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getAuthIntent() {
        return this.authIntent;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest copy$default(com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest verifyCredentialRequest, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            authIntent = verifyCredentialRequest.authIntent;
        }
        if ((i & 2) != 0) {
            publicCredential = verifyCredentialRequest.publicCredential;
        }
        return verifyCredentialRequest.copy(authIntent, publicCredential);
    }
}
