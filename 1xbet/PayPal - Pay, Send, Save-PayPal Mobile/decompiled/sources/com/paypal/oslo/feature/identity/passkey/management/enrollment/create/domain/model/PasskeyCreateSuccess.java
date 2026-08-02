package com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateSuccess;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateResult;", "", "passkeyCredentialId", "rawPasskeyCredentialId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPasskeyCredentialId", "getRawPasskeyCredentialId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PasskeyCreateSuccess extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateResult {
    public static final int $stable = 0;
    private final java.lang.String passkeyCredentialId;
    private final java.lang.String rawPasskeyCredentialId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyCreateSuccess(java.lang.String str, java.lang.String str2) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.passkeyCredentialId = str;
        this.rawPasskeyCredentialId = str2;
    }

    public final java.lang.String getPasskeyCredentialId() {
        return this.passkeyCredentialId;
    }

    public final java.lang.String getRawPasskeyCredentialId() {
        return this.rawPasskeyCredentialId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.passkeyCredentialId;
        java.lang.String str2 = this.rawPasskeyCredentialId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyCreateSuccess(passkeyCredentialId=");
        sb.append(str);
        sb.append(", rawPasskeyCredentialId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.passkeyCredentialId.hashCode();
        java.lang.String str = this.rawPasskeyCredentialId;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess passkeyCreateSuccess = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.passkeyCredentialId, passkeyCreateSuccess.passkeyCredentialId) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawPasskeyCredentialId, passkeyCreateSuccess.rawPasskeyCredentialId);
    }

    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess copy(java.lang.String passkeyCredentialId, java.lang.String rawPasskeyCredentialId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCredentialId, "");
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess(passkeyCredentialId, rawPasskeyCredentialId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRawPasskeyCredentialId() {
        return this.rawPasskeyCredentialId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPasskeyCredentialId() {
        return this.passkeyCredentialId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess copy$default(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess passkeyCreateSuccess, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = passkeyCreateSuccess.passkeyCredentialId;
        }
        if ((i & 2) != 0) {
            str2 = passkeyCreateSuccess.rawPasskeyCredentialId;
        }
        return passkeyCreateSuccess.copy(str, str2);
    }
}
