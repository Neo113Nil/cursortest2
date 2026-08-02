package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public final class zzq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzq> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzr();
    private final long zza;
    private final com.google.android.gms.internal.fido.zzgx zzb;
    private final com.google.android.gms.internal.fido.zzgx zzc;
    private final com.google.android.gms.internal.fido.zzgx zzd;

    zzq(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
        com.google.android.gms.internal.fido.zzgx zzgxVar = com.google.android.gms.internal.fido.zzgx.zzb;
        com.google.android.gms.internal.fido.zzgx zzl = com.google.android.gms.internal.fido.zzgx.zzl(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr2);
        com.google.android.gms.internal.fido.zzgx zzl2 = com.google.android.gms.internal.fido.zzgx.zzl(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr3);
        com.google.android.gms.internal.fido.zzgx zzl3 = com.google.android.gms.internal.fido.zzgx.zzl(bArr6, 0, bArr6.length);
        this.zza = j;
        this.zzb = (com.google.android.gms.internal.fido.zzgx) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzl);
        this.zzc = (com.google.android.gms.internal.fido.zzgx) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzl2);
        this.zzd = (com.google.android.gms.internal.fido.zzgx) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzl3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.zzq)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.zzq zzqVar = (com.google.android.gms.fido.fido2.api.common.zzq) obj;
        return this.zza == zzqVar.zza && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzqVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzqVar.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzqVar.zzd);
    }

    public final int hashCode() {
        long j = this.zza;
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(j), this.zzb, this.zzc, this.zzd);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        long j = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, j);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, this.zzb.zzm(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, this.zzc.zzm(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, this.zzd.zzm(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
