package com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationRequest;", "", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyBindChallenge;", "passkeyBindChallenge", "", "preferImmediatelyAvailableCredentials", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyBindChallenge;Z)V", "component1", "()Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyBindChallenge;", "component2", "()Z", "copy", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyBindChallenge;Z)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyAttestationRequest;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/attestation/domain/model/PasskeyBindChallenge;", "getPasskeyBindChallenge", "Z", "getPreferImmediatelyAvailableCredentials"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PasskeyAttestationRequest {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge passkeyBindChallenge;
    private final boolean preferImmediatelyAvailableCredentials;

    public PasskeyAttestationRequest(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge passkeyBindChallenge, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyBindChallenge, "");
        this.passkeyBindChallenge = passkeyBindChallenge;
        this.preferImmediatelyAvailableCredentials = z;
        if (kotlin.text.StringsKt.isBlank(passkeyBindChallenge.getChallenge())) {
            throw new java.lang.IllegalArgumentException("Challenge must not be blank".toString());
        }
        if (kotlin.text.StringsKt.isBlank(passkeyBindChallenge.getRelyingPartyId())) {
            throw new java.lang.IllegalArgumentException("Relying party ID must not be blank".toString());
        }
        if (kotlin.text.StringsKt.isBlank(passkeyBindChallenge.getUserId())) {
            throw new java.lang.IllegalArgumentException("User ID must not be blank".toString());
        }
        if (passkeyBindChallenge.getPubKeyCredParams().isEmpty()) {
            throw new java.lang.IllegalArgumentException("At least one public key credential parameter must be provided".toString());
        }
    }

    public /* synthetic */ PasskeyAttestationRequest(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge passkeyBindChallenge, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(passkeyBindChallenge, (i & 2) != 0 ? false : z);
    }

    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge getPasskeyBindChallenge() {
        return this.passkeyBindChallenge;
    }

    public final boolean getPreferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge passkeyBindChallenge = this.passkeyBindChallenge;
        boolean z = this.preferImmediatelyAvailableCredentials;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyAttestationRequest(passkeyBindChallenge=");
        sb.append(passkeyBindChallenge);
        sb.append(", preferImmediatelyAvailableCredentials=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.passkeyBindChallenge.hashCode() * 31) + java.lang.Boolean.hashCode(this.preferImmediatelyAvailableCredentials);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationRequest)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationRequest passkeyAttestationRequest = (com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.passkeyBindChallenge, passkeyAttestationRequest.passkeyBindChallenge) && this.preferImmediatelyAvailableCredentials == passkeyAttestationRequest.preferImmediatelyAvailableCredentials;
    }

    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationRequest copy(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge passkeyBindChallenge, boolean preferImmediatelyAvailableCredentials) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyBindChallenge, "");
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationRequest(passkeyBindChallenge, preferImmediatelyAvailableCredentials);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getPreferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge getPasskeyBindChallenge() {
        return this.passkeyBindChallenge;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationRequest copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationRequest passkeyAttestationRequest, com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyBindChallenge passkeyBindChallenge, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            passkeyBindChallenge = passkeyAttestationRequest.passkeyBindChallenge;
        }
        if ((i & 2) != 0) {
            z = passkeyAttestationRequest.preferImmediatelyAvailableCredentials;
        }
        return passkeyAttestationRequest.copy(passkeyBindChallenge, z);
    }
}
