package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public final class zzag extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzag> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzah();
    private final java.lang.String zza;

    public zzag(java.lang.String str) {
        this.zza = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.fido.fido2.api.common.zzag) {
            return this.zza.equals(((com.google.android.gms.fido.fido2.api.common.zzag) obj).zza);
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
