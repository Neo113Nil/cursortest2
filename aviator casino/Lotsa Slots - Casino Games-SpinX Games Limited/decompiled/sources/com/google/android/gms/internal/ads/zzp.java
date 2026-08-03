package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzp implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzp> CREATOR = new com.google.android.gms.internal.ads.zzo();
    public final java.util.UUID zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final byte[] zzd;
    private int zze;

    zzp(android.os.Parcel parcel) {
        this.zza = new java.util.UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        java.lang.String readString = parcel.readString();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        this.zzc = readString;
        this.zzd = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzp)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.google.android.gms.internal.ads.zzp zzpVar = (com.google.android.gms.internal.ads.zzp) obj;
        return java.util.Objects.equals(this.zzb, zzpVar.zzb) && java.util.Objects.equals(this.zzc, zzpVar.zzc) && java.util.Objects.equals(this.zza, zzpVar.zza) && java.util.Arrays.equals(this.zzd, zzpVar.zzd);
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int hashCode = this.zza.hashCode() * 31;
        java.lang.String str = this.zzb;
        int hashCode2 = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.zzc.hashCode()) * 31) + java.util.Arrays.hashCode(this.zzd);
        this.zze = hashCode2;
        return hashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.UUID uuid = this.zza;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzp(java.util.UUID uuid, java.lang.String str, java.lang.String str2, byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = com.google.android.gms.internal.ads.zzas.zzh(str2);
        this.zzd = bArr;
    }
}
