package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzxt extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_barcode.zzxt> CREATOR = new com.google.android.gms.internal.mlkit_vision_barcode.zzyi();
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final java.lang.String zzg;
    private final java.lang.String zzh;
    private final java.lang.String zzi;
    private final java.lang.String zzj;
    private final java.lang.String zzk;
    private final java.lang.String zzl;
    private final java.lang.String zzm;
    private final java.lang.String zzn;

    public zzxt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = str13;
        this.zzn = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, this.zzj, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 11, this.zzk, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 12, this.zzl, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 13, this.zzm, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 14, this.zzn, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String zzn() {
        return this.zzc;
    }

    public final java.lang.String zzm() {
        return this.zzj;
    }

    public final java.lang.String zzl() {
        return this.zzd;
    }

    public final java.lang.String zzk() {
        return this.zzn;
    }

    public final java.lang.String zzj() {
        return this.zzk;
    }

    public final java.lang.String zzi() {
        return this.zze;
    }

    public final java.lang.String zzh() {
        return this.zzb;
    }

    public final java.lang.String zzg() {
        return this.zzl;
    }

    public final java.lang.String zzf() {
        return this.zza;
    }

    public final java.lang.String zze() {
        return this.zzm;
    }

    public final java.lang.String zzd() {
        return this.zzi;
    }

    public final java.lang.String zzc() {
        return this.zzf;
    }

    public final java.lang.String zzb() {
        return this.zzh;
    }

    public final java.lang.String zza() {
        return this.zzg;
    }
}
