package com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateRequest;", "", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyFlowVariant;", "passkeyFlowVariant", "", "passkeyCredentialId", "rawPasskeyCredentialId", com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.FEATURE, "<init>", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyFlowVariant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyFlowVariant;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyFlowVariant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyFlowVariant;", "getPasskeyFlowVariant", "Ljava/lang/String;", "getPasskeyCredentialId", "getRawPasskeyCredentialId", "getPasskey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PasskeyCreateRequest {
    public static final int $stable = 0;
    private final java.lang.String passkey;
    private final java.lang.String passkeyCredentialId;
    private final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant;
    private final java.lang.String rawPasskeyCredentialId;

    public PasskeyCreateRequest(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyFlowVariant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.passkeyFlowVariant = passkeyFlowVariant;
        this.passkeyCredentialId = str;
        this.rawPasskeyCredentialId = str2;
        this.passkey = str3;
        if (kotlin.text.StringsKt.isBlank(str)) {
            throw new java.lang.IllegalArgumentException("Passkey credential ID must not be blank".toString());
        }
        if (kotlin.text.StringsKt.isBlank(str2)) {
            throw new java.lang.IllegalArgumentException("Raw passkey credential ID must not be blank".toString());
        }
        if (kotlin.text.StringsKt.isBlank(str3)) {
            throw new java.lang.IllegalArgumentException("Passkey attestation response must not be blank".toString());
        }
    }

    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant getPasskeyFlowVariant() {
        return this.passkeyFlowVariant;
    }

    public final java.lang.String getPasskeyCredentialId() {
        return this.passkeyCredentialId;
    }

    public final java.lang.String getRawPasskeyCredentialId() {
        return this.rawPasskeyCredentialId;
    }

    public final java.lang.String getPasskey() {
        return this.passkey;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant = this.passkeyFlowVariant;
        java.lang.String str = this.passkeyCredentialId;
        java.lang.String str2 = this.rawPasskeyCredentialId;
        java.lang.String str3 = this.passkey;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyCreateRequest(passkeyFlowVariant=");
        sb.append(passkeyFlowVariant);
        sb.append(", passkeyCredentialId=");
        sb.append(str);
        sb.append(", rawPasskeyCredentialId=");
        sb.append(str2);
        sb.append(", passkey=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.passkeyFlowVariant.hashCode() * 31) + this.passkeyCredentialId.hashCode()) * 31) + this.rawPasskeyCredentialId.hashCode()) * 31) + this.passkey.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateRequest)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateRequest passkeyCreateRequest = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateRequest) other;
        return this.passkeyFlowVariant == passkeyCreateRequest.passkeyFlowVariant && kotlin.jvm.internal.Intrinsics.areEqual(this.passkeyCredentialId, passkeyCreateRequest.passkeyCredentialId) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawPasskeyCredentialId, passkeyCreateRequest.rawPasskeyCredentialId) && kotlin.jvm.internal.Intrinsics.areEqual(this.passkey, passkeyCreateRequest.passkey);
    }

    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateRequest copy(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant, java.lang.String passkeyCredentialId, java.lang.String rawPasskeyCredentialId, java.lang.String passkey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyFlowVariant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCredentialId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawPasskeyCredentialId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkey, "");
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateRequest(passkeyFlowVariant, passkeyCredentialId, rawPasskeyCredentialId, passkey);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPasskey() {
        return this.passkey;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRawPasskeyCredentialId() {
        return this.rawPasskeyCredentialId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPasskeyCredentialId() {
        return this.passkeyCredentialId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant getPasskeyFlowVariant() {
        return this.passkeyFlowVariant;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateRequest copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateRequest passkeyCreateRequest, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant passkeyFlowVariant, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            passkeyFlowVariant = passkeyCreateRequest.passkeyFlowVariant;
        }
        if ((i & 2) != 0) {
            str = passkeyCreateRequest.passkeyCredentialId;
        }
        if ((i & 4) != 0) {
            str2 = passkeyCreateRequest.rawPasskeyCredentialId;
        }
        if ((i & 8) != 0) {
            str3 = passkeyCreateRequest.passkey;
        }
        return passkeyCreateRequest.copy(passkeyFlowVariant, str, str2, str3);
    }
}
