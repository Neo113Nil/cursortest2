package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzf> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzg();
    final java.lang.String zza;
    final byte[] zzb;
    final int zzc;
    final com.google.android.gms.tapandpay.firstparty.TokenStatus zzd;
    final java.lang.String zze;
    final com.google.android.gms.tapandpay.firstparty.zzbo zzf;

    zzf(java.lang.String str, byte[] bArr, int i, com.google.android.gms.tapandpay.firstparty.TokenStatus tokenStatus, java.lang.String str2, com.google.android.gms.tapandpay.firstparty.zzbo zzboVar) {
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = tokenStatus;
        this.zze = str2;
        this.zzf = zzboVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.zzf)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.zzf zzfVar = (com.google.android.gms.tapandpay.firstparty.zzf) obj;
        return this.zzc == zzfVar.zzc && com.google.android.gms.common.internal.Objects.equal(this.zza, zzfVar.zza) && java.util.Arrays.equals(this.zzb, zzfVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzfVar.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, zzfVar.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, zzfVar.zzf);
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        byte[] bArr = this.zzb;
        int i = this.zzc;
        return com.google.android.gms.common.internal.Objects.hashCode(str, bArr, java.lang.Integer.valueOf(i), this.zzd, this.zze, this.zzf);
    }

    public final java.lang.String toString() {
        com.google.android.gms.common.internal.Objects.ToStringHelper add = com.google.android.gms.common.internal.Objects.toStringHelper(this).add("clientTokenId", this.zza);
        byte[] bArr = this.zzb;
        return add.add("serverToken", bArr == null ? null : java.util.Arrays.toString(bArr)).add("cardNetwork", java.lang.Integer.valueOf(this.zzc)).add(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo, this.zzd).add("tokenLastDigits", this.zze).add("transactionInfo", this.zzf).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
