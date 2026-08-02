package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzi extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzi> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzj();
    final long zza;
    final java.lang.String zzb;
    final java.lang.String zzc;
    final java.lang.String zzd;
    final java.lang.String zze;

    zzi(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.zza = j;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.zzi)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.zzi zziVar = (com.google.android.gms.tapandpay.firstparty.zzi) obj;
        return com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(zziVar.zza)) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zziVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zziVar.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zziVar.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, zziVar.zze);
    }

    public final int hashCode() {
        long j = this.zza;
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(j), this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("expirationTimestamp", java.lang.Long.valueOf(this.zza)).add("websiteUrl", this.zzb).add("websiteRedirectText", this.zzc).add("legalDisclaimer", this.zzd).add(org.bouncycastle.i18n.ErrorBundle.SUMMARY_ENTRY, this.zze).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
