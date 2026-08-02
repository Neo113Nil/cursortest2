package com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationSuccess;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationResult;", "", "rawJsonResponse", "credentialId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toUrlEncoded", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRawJsonResponse", "getCredentialId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PasskeyAttestationSuccess extends com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationResult {
    public static final int $stable = 0;
    private final java.lang.String credentialId;
    private final java.lang.String rawJsonResponse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyAttestationSuccess(java.lang.String str, java.lang.String str2) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.rawJsonResponse = str;
        this.credentialId = str2;
    }

    public final java.lang.String getRawJsonResponse() {
        return this.rawJsonResponse;
    }

    public final java.lang.String getCredentialId() {
        return this.credentialId;
    }

    public final java.lang.String toUrlEncoded() {
        java.lang.String encode = java.net.URLEncoder.encode(this.rawJsonResponse, kotlin.text.Charsets.UTF_8.name());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encode, "");
        return encode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.rawJsonResponse;
        java.lang.String str2 = this.credentialId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyAttestationSuccess(rawJsonResponse=");
        sb.append(str);
        sb.append(", credentialId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.rawJsonResponse.hashCode() * 31) + this.credentialId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess passkeyAttestationSuccess = (com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.rawJsonResponse, passkeyAttestationSuccess.rawJsonResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.credentialId, passkeyAttestationSuccess.credentialId);
    }

    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess copy(java.lang.String rawJsonResponse, java.lang.String credentialId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawJsonResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialId, "");
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess(rawJsonResponse, credentialId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCredentialId() {
        return this.credentialId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getRawJsonResponse() {
        return this.rawJsonResponse;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationSuccess passkeyAttestationSuccess, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = passkeyAttestationSuccess.rawJsonResponse;
        }
        if ((i & 2) != 0) {
            str2 = passkeyAttestationSuccess.credentialId;
        }
        return passkeyAttestationSuccess.copy(str, str2);
    }
}
