package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public final class zzu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzu> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzv();

    public zzu(boolean z) {
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.zzu)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }
}
