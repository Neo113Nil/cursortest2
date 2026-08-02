package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public class FidoCredentialDetails extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzy();
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.fido.zzgx zzc;
    private final com.google.android.gms.internal.fido.zzgx zzd;
    private final boolean zze;
    private final boolean zzf;
    private final long zzg;
    private final android.accounts.Account zzh;
    private final boolean zzi;

    public static com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails deserializeFromBytes(byte[] bArr) {
        return (com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails fidoCredentialDetails = (com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, fidoCredentialDetails.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, fidoCredentialDetails.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, fidoCredentialDetails.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, fidoCredentialDetails.zzd) && this.zze == fidoCredentialDetails.zze && this.zzf == fidoCredentialDetails.zzf && this.zzi == fidoCredentialDetails.zzi && this.zzg == fidoCredentialDetails.zzg && com.google.android.gms.common.internal.Objects.equal(this.zzh, fidoCredentialDetails.zzh);
    }

    public byte[] getCredentialId() {
        return this.zzd.zzm();
    }

    public byte[] getUserId() {
        com.google.android.gms.internal.fido.zzgx zzgxVar = this.zzc;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    public int hashCode() {
        java.lang.String str = this.zza;
        java.lang.String str2 = this.zzb;
        com.google.android.gms.internal.fido.zzgx zzgxVar = this.zzc;
        com.google.android.gms.internal.fido.zzgx zzgxVar2 = this.zzd;
        boolean z = this.zze;
        boolean z2 = this.zzf;
        boolean z3 = this.zzi;
        long j = this.zzg;
        return com.google.android.gms.common.internal.Objects.hashCode(str, str2, zzgxVar, zzgxVar2, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(z3), java.lang.Long.valueOf(j), this.zzh);
    }

    public byte[] serializeToBytes() {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getUserName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getUserDisplayName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, getUserId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, getCredentialId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, getIsDiscoverable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, getIsPaymentCredential());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 7, getLastUsedTime());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    FidoCredentialDetails(java.lang.String str, java.lang.String str2, byte[] bArr, byte[] bArr2, boolean z, boolean z2, long j, android.accounts.Account account, boolean z3) {
        com.google.android.gms.internal.fido.zzgx zzl = bArr == null ? null : com.google.android.gms.internal.fido.zzgx.zzl(bArr, 0, bArr.length);
        com.google.android.gms.internal.fido.zzgx zzgxVar = com.google.android.gms.internal.fido.zzgx.zzb;
        com.google.android.gms.internal.fido.zzgx zzl2 = com.google.android.gms.internal.fido.zzgx.zzl(bArr2, 0, bArr2.length);
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzl;
        this.zzd = zzl2;
        this.zze = z;
        this.zzf = z2;
        this.zzg = j;
        this.zzh = account;
        this.zzi = z3;
    }

    public java.lang.String getUserName() {
        return this.zza;
    }

    public com.google.android.gms.internal.fido.zzgx getUserIdAsByteString() {
        return this.zzc;
    }

    public java.lang.String getUserDisplayName() {
        return this.zzb;
    }

    public long getLastUsedTime() {
        return this.zzg;
    }

    public boolean getIsPaymentCredential() {
        return this.zzf;
    }

    public boolean getIsDiscoverable() {
        return this.zze;
    }

    public com.google.android.gms.internal.fido.zzgx getCredentialIdAsByteString() {
        return this.zzd;
    }
}
