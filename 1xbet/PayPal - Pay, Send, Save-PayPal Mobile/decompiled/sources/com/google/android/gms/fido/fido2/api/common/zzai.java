package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public final class zzai extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzai> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzaj();
    static final com.google.android.gms.internal.fido.zzhp zza = com.google.android.gms.internal.fido.zzhp.zzg(1);
    static final com.google.android.gms.internal.fido.zzhp zzb = com.google.android.gms.internal.fido.zzhp.zzg(2);
    static final com.google.android.gms.internal.fido.zzhp zzc = com.google.android.gms.internal.fido.zzhp.zzg(3);
    static final com.google.android.gms.internal.fido.zzhp zzd = com.google.android.gms.internal.fido.zzhp.zzg(4);
    private final com.google.android.gms.internal.fido.zzgx zze;
    private final com.google.android.gms.internal.fido.zzgx zzf;
    private final com.google.android.gms.internal.fido.zzgx zzg;
    private final int zzh;

    zzai(com.google.android.gms.internal.fido.zzgx zzgxVar, com.google.android.gms.internal.fido.zzgx zzgxVar2, com.google.android.gms.internal.fido.zzgx zzgxVar3, int i) {
        this.zze = zzgxVar;
        this.zzf = zzgxVar2;
        this.zzg = zzgxVar3;
        this.zzh = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.zzai)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.zzai zzaiVar = (com.google.android.gms.fido.fido2.api.common.zzai) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zze, zzaiVar.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, zzaiVar.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzg, zzaiVar.zzg) && this.zzh == zzaiVar.zzh;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zze, this.zzf, this.zzg, java.lang.Integer.valueOf(this.zzh));
    }

    public final java.lang.String toString() {
        return "HmacSecretExtension{coseKeyAgreement=" + com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(zza()) + ", saltEnc=" + com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(zzc()) + ", saltAuth=" + com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(zzb()) + ", getPinUvAuthProtocol=" + this.zzh + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 1, zza(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, zzc(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, zzb(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final byte[] zza() {
        com.google.android.gms.internal.fido.zzgx zzgxVar = this.zze;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    public final byte[] zzb() {
        com.google.android.gms.internal.fido.zzgx zzgxVar = this.zzg;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    public final byte[] zzc() {
        com.google.android.gms.internal.fido.zzgx zzgxVar = this.zzf;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }
}
