package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public final class zzaw extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzaw> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzax();
    private final java.lang.String zza;

    zzaw(java.lang.String str) {
        this.zza = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.fido.fido2.api.common.zzaw) {
            return com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.fido.fido2.api.common.zzaw) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
