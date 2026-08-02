package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/google/android/gms/identitycredentials/ExportCredentialsToDeviceSetupResponse;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "Landroid/os/Bundle;", "responseBundle", "<init>", "(Landroid/os/Bundle;)V", "Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;", "getProviderAppInfo", "()Lcom/google/android/gms/identitycredentials/CallingAppInfoParcelable;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "getNumSuccess", "()Ljava/lang/Integer;", "getNumFailure", "getNumIgnored", "Landroid/os/Bundle;", "getResponseBundle", "()Landroid/os/Bundle;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ExportCredentialsToDeviceSetupResponseCreator")
/* loaded from: classes8.dex */
public final class ExportCredentialsToDeviceSetupResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getResponseBundle", id = 1)
    private final android.os.Bundle responseBundle;
    public static final android.os.Parcelable.Creator<com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse> CREATOR = new com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponseCreator();

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public ExportCredentialsToDeviceSetupResponse(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        this.responseBundle = bundle;
    }

    public final java.lang.Integer getNumFailure() {
        if (this.responseBundle.containsKey("NUM_FAILURE")) {
            return java.lang.Integer.valueOf(this.responseBundle.getInt("NUM_FAILURE"));
        }
        return null;
    }

    public final java.lang.Integer getNumIgnored() {
        if (this.responseBundle.containsKey("NUM_IGNORED")) {
            return java.lang.Integer.valueOf(this.responseBundle.getInt("NUM_IGNORED"));
        }
        return null;
    }

    public final java.lang.Integer getNumSuccess() {
        if (this.responseBundle.containsKey("NUM_SUCCESS")) {
            return java.lang.Integer.valueOf(this.responseBundle.getInt("NUM_SUCCESS"));
        }
        return null;
    }

    public final com.google.android.gms.identitycredentials.CallingAppInfoParcelable getProviderAppInfo() {
        return (com.google.android.gms.identitycredentials.CallingAppInfoParcelable) this.responseBundle.getParcelable("PROVIDER_APP_INFO");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponseCreator.writeToParcel(this, dest, flags);
    }

    public final android.os.Bundle getResponseBundle() {
        return this.responseBundle;
    }
}
