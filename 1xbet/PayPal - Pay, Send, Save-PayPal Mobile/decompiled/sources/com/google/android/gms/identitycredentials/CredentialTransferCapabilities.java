package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/google/android/gms/identitycredentials/CredentialTransferCapabilities;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "Landroid/os/Bundle;", "responseBundle", "<init>", "(Landroid/os/Bundle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "getTotalNumCredentials", "()Ljava/lang/Integer;", "getNumPasswords", "getNumPasskeys", "", "key", "getNumCustomCredentials", "(Ljava/lang/String;)Ljava/lang/Integer;", "", "getTotalSizeBytes", "()Ljava/lang/Long;", "Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;", "getProviderAppInfo", "()Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;", "Landroid/os/Bundle;", "getResponseBundle", "()Landroid/os/Bundle;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "CredentialTransferCapabilitiesCreator")
/* loaded from: classes8.dex */
public final class CredentialTransferCapabilities extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getResponseBundle", id = 1)
    private final android.os.Bundle responseBundle;
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.CredentialTransferCapabilities> CREATOR = new com.google.android.gms.identitycredentials.CredentialTransferCapabilitiesCreator();

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public CredentialTransferCapabilities(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        this.responseBundle = bundle;
    }

    public final java.lang.Integer getNumCustomCredentials(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        if (this.responseBundle.containsKey(key)) {
            return java.lang.Integer.valueOf(this.responseBundle.getInt(key));
        }
        return null;
    }

    public final java.lang.Integer getNumPasskeys() {
        if (this.responseBundle.containsKey("NUM_PASSKEYS")) {
            return java.lang.Integer.valueOf(this.responseBundle.getInt("NUM_PASSKEYS"));
        }
        return null;
    }

    public final java.lang.Integer getNumPasswords() {
        if (this.responseBundle.containsKey("NUM_PASSWORDS")) {
            return java.lang.Integer.valueOf(this.responseBundle.getInt("NUM_PASSWORDS"));
        }
        return null;
    }

    public final com.google.android.gms.identitycredentials.CallingAppInfoParcelable getProviderAppInfo() {
        return (com.google.android.gms.identitycredentials.CallingAppInfoParcelable) this.responseBundle.getParcelable("PROVIDER_APP_INFO");
    }

    public final java.lang.Integer getTotalNumCredentials() {
        if (this.responseBundle.containsKey("TOTAL_NUM_CREDENTIALS")) {
            return java.lang.Integer.valueOf(this.responseBundle.getInt("TOTAL_NUM_CREDENTIALS"));
        }
        return null;
    }

    public final java.lang.Long getTotalSizeBytes() {
        if (this.responseBundle.containsKey("TOTAL_SIZE_BYTES")) {
            return java.lang.Long.valueOf(this.responseBundle.getLong("TOTAL_SIZE_BYTES"));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.gms.identitycredentials.CredentialTransferCapabilitiesCreator.writeToParcel(this, dest, flags);
    }

    public final android.os.Bundle getResponseBundle() {
        return this.responseBundle;
    }
}
