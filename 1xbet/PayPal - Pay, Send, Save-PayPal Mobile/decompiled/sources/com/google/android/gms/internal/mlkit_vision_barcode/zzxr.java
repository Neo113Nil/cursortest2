package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzxr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_barcode.zzxr> CREATOR = new com.google.android.gms.internal.mlkit_vision_barcode.zzyg();
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzxq zzf;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzxq zzg;

    public zzxr(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.google.android.gms.internal.mlkit_vision_barcode.zzxq zzxqVar, com.google.android.gms.internal.mlkit_vision_barcode.zzxq zzxqVar2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = zzxqVar;
        this.zzg = zzxqVar2;
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
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String zzg() {
        return this.zza;
    }

    public final java.lang.String zzf() {
        return this.zze;
    }

    public final java.lang.String zze() {
        return this.zzd;
    }

    public final java.lang.String zzd() {
        return this.zzc;
    }

    public final java.lang.String zzc() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxq zzb() {
        return this.zzf;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxq zza() {
        return this.zzg;
    }
}
