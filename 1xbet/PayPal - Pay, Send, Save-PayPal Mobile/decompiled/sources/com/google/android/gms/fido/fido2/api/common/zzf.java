package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public final class zzf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzf> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzg();
    private final com.google.android.gms.internal.fido.zzgx zza;
    private final com.google.android.gms.internal.fido.zzgx zzb;

    public zzf(com.google.android.gms.internal.fido.zzgx zzgxVar, com.google.android.gms.internal.fido.zzgx zzgxVar2) {
        this.zza = zzgxVar;
        this.zzb = zzgxVar2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.zzf)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.zzf zzfVar = (com.google.android.gms.fido.fido2.api.common.zzf) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, zzfVar.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzfVar.zzb);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.internal.fido.zzgx zzgxVar = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 1, zzgxVar == null ? null : zzgxVar.zzm(), false);
        com.google.android.gms.internal.fido.zzgx zzgxVar2 = this.zzb;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, zzgxVar2 != null ? zzgxVar2.zzm() : null, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
