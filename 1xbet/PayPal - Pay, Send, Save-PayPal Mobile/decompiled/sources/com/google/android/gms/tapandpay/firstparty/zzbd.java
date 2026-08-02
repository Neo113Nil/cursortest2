package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzbd extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzbd> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzbe();
    private int zza;
    private java.lang.String zzb;
    private java.lang.String zzc;
    private java.lang.String zzd;
    private java.lang.String zze;
    private int zzf;
    private int zzg;
    private java.lang.String zzh;

    private zzbd() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.zzbd)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.zzbd zzbdVar = (com.google.android.gms.tapandpay.firstparty.zzbd) obj;
        return com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(zzbdVar.zza)) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzbdVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzbdVar.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzbdVar.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, zzbdVar.zze) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzf), java.lang.Integer.valueOf(zzbdVar.zzf)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zzg), java.lang.Integer.valueOf(zzbdVar.zzg)) && com.google.android.gms.common.internal.Objects.equal(this.zzh, zzbdVar.zzh);
    }

    public final int hashCode() {
        int i = this.zza;
        java.lang.String str = this.zzb;
        java.lang.String str2 = this.zzc;
        java.lang.String str3 = this.zzd;
        java.lang.String str4 = this.zze;
        int i2 = this.zzf;
        int i3 = this.zzg;
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(i), str, str2, str3, str4, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), this.zzh);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzbd(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2, int i3, java.lang.String str5) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = i2;
        this.zzg = i3;
        this.zzh = str5;
    }
}
