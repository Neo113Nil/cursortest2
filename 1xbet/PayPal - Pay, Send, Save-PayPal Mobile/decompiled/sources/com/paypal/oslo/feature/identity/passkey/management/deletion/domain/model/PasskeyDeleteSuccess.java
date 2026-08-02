package com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/model/PasskeyDeleteSuccess;", "", "", "passkeyCredentialId", "rawPasskeyCredentialId", "", "success", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/model/PasskeyDeleteSuccess;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPasskeyCredentialId", "getRawPasskeyCredentialId", "Z", "getSuccess", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PasskeyDeleteSuccess {
    public static final int $stable = 0;
    private final java.lang.String message;
    private final java.lang.String passkeyCredentialId;
    private final java.lang.String rawPasskeyCredentialId;
    private final boolean success;

    public PasskeyDeleteSuccess(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.passkeyCredentialId = str;
        this.rawPasskeyCredentialId = str2;
        this.success = z;
        this.message = str3;
    }

    public final java.lang.String getPasskeyCredentialId() {
        return this.passkeyCredentialId;
    }

    public final java.lang.String getRawPasskeyCredentialId() {
        return this.rawPasskeyCredentialId;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.passkeyCredentialId;
        java.lang.String str2 = this.rawPasskeyCredentialId;
        boolean z = this.success;
        java.lang.String str3 = this.message;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyDeleteSuccess(passkeyCredentialId=");
        sb.append(str);
        sb.append(", rawPasskeyCredentialId=");
        sb.append(str2);
        sb.append(", success=");
        sb.append(z);
        sb.append(", message=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.passkeyCredentialId.hashCode();
        java.lang.String str = this.rawPasskeyCredentialId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.success);
        java.lang.String str2 = this.message;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteSuccess)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteSuccess passkeyDeleteSuccess = (com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteSuccess) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.passkeyCredentialId, passkeyDeleteSuccess.passkeyCredentialId) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawPasskeyCredentialId, passkeyDeleteSuccess.rawPasskeyCredentialId) && this.success == passkeyDeleteSuccess.success && kotlin.jvm.internal.Intrinsics.areEqual(this.message, passkeyDeleteSuccess.message);
    }

    public final com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteSuccess copy(java.lang.String passkeyCredentialId, java.lang.String rawPasskeyCredentialId, boolean success, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCredentialId, "");
        return new com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteSuccess(passkeyCredentialId, rawPasskeyCredentialId, success, message);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRawPasskeyCredentialId() {
        return this.rawPasskeyCredentialId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPasskeyCredentialId() {
        return this.passkeyCredentialId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteSuccess copy$default(com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteSuccess passkeyDeleteSuccess, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = passkeyDeleteSuccess.passkeyCredentialId;
        }
        if ((i & 2) != 0) {
            str2 = passkeyDeleteSuccess.rawPasskeyCredentialId;
        }
        if ((i & 4) != 0) {
            z = passkeyDeleteSuccess.success;
        }
        if ((i & 8) != 0) {
            str3 = passkeyDeleteSuccess.message;
        }
        return passkeyDeleteSuccess.copy(str, str2, z, str3);
    }
}
