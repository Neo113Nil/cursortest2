package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public final class zzz extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzz> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzaa();
    private final boolean zza;

    public zzz(boolean z) {
        this.zza = ((java.lang.Boolean) com.google.android.gms.common.internal.Preconditions.checkNotNull(java.lang.Boolean.valueOf(z))).booleanValue();
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.gms.fido.fido2.api.common.zzz) && this.zza == ((com.google.android.gms.fido.fido2.api.common.zzz) obj).zza;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        boolean z = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, z);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
