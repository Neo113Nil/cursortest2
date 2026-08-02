package com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallengeRequest;", "", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyFlowVariant;", "passkeyFlowVariant", "", "publicCredential", "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyFlowVariant;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyFlowVariant;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyFlowVariant;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallengeRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyFlowVariant;", "getPasskeyFlowVariant", "Ljava/lang/String;", "getPublicCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PasskeyCreateChallengeRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant;
    private final java.lang.String publicCredential;

    public PasskeyCreateChallengeRequest(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyFlowVariant, "");
        this.passkeyFlowVariant = passkeyFlowVariant;
        this.publicCredential = str;
        if (str != null && kotlin.text.StringsKt.isBlank(str)) {
            throw new java.lang.IllegalArgumentException("If provided, public credential token cannot be empty".toString());
        }
    }

    public /* synthetic */ PasskeyCreateChallengeRequest(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(passkeyFlowVariant, (i & 2) != 0 ? null : str);
    }

    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant getPasskeyFlowVariant() {
        return this.passkeyFlowVariant;
    }

    public final java.lang.String getPublicCredential() {
        return this.publicCredential;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant = this.passkeyFlowVariant;
        java.lang.String str = this.publicCredential;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyCreateChallengeRequest(passkeyFlowVariant=");
        sb.append(passkeyFlowVariant);
        sb.append(", publicCredential=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.passkeyFlowVariant.hashCode();
        java.lang.String str = this.publicCredential;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeRequest)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeRequest passkeyCreateChallengeRequest = (com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeRequest) other;
        return this.passkeyFlowVariant == passkeyCreateChallengeRequest.passkeyFlowVariant && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, passkeyCreateChallengeRequest.publicCredential);
    }

    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeRequest copy(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant, java.lang.String publicCredential) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyFlowVariant, "");
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeRequest(passkeyFlowVariant, publicCredential);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPublicCredential() {
        return this.publicCredential;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant getPasskeyFlowVariant() {
        return this.passkeyFlowVariant;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeRequest copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeRequest passkeyCreateChallengeRequest, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            passkeyFlowVariant = passkeyCreateChallengeRequest.passkeyFlowVariant;
        }
        if ((i & 2) != 0) {
            str = passkeyCreateChallengeRequest.publicCredential;
        }
        return passkeyCreateChallengeRequest.copy(passkeyFlowVariant, str);
    }
}
