package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzbh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzbh> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzbi();
    final long zza;
    final java.math.BigDecimal zzb;
    final java.lang.String zzc;
    final long zzd;
    final int zze;

    public zzbh(long j, java.math.BigDecimal bigDecimal, java.lang.String str, long j2, int i) {
        this.zza = j;
        this.zzb = bigDecimal;
        this.zzc = str;
        this.zzd = j2;
        this.zze = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.zzbh)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.zzbh zzbhVar = (com.google.android.gms.tapandpay.firstparty.zzbh) obj;
        return this.zza == zzbhVar.zza && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzbhVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzbhVar.zzc) && this.zzd == zzbhVar.zzd && this.zze == zzbhVar.zze;
    }

    public final int hashCode() {
        long j = this.zza;
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(j), this.zzb, this.zzc, java.lang.Long.valueOf(this.zzd), java.lang.Integer.valueOf(this.zze));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("transactionId", java.lang.Long.valueOf(this.zza)).add("amount", this.zzb).add("currency", this.zzc).add("transactionTimeMillis", java.lang.Long.valueOf(this.zzd)).add("type", java.lang.Integer.valueOf(this.zze)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigDecimal(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
