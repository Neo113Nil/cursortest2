package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzk extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_barcode.zzk> CREATOR = new com.google.android.gms.internal.mlkit_vision_barcode.zzx();
    public java.lang.String zza;
    public java.lang.String zzb;
    public java.lang.String zzc;
    public java.lang.String zzd;
    public java.lang.String zze;
    public com.google.android.gms.internal.mlkit_vision_barcode.zzj zzf;
    public com.google.android.gms.internal.mlkit_vision_barcode.zzj zzg;

    public zzk() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzk(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.google.android.gms.internal.mlkit_vision_barcode.zzj zzjVar, com.google.android.gms.internal.mlkit_vision_barcode.zzj zzjVar2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = zzjVar;
        this.zzg = zzjVar2;
    }
}
