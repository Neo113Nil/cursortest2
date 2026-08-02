package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzxs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_barcode.zzxs> CREATOR = new com.google.android.gms.internal.mlkit_vision_barcode.zzyh();
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzxw zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzxx[] zzd;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzxu[] zze;
    private final java.lang.String[] zzf;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzxp[] zzg;

    public zzxs(com.google.android.gms.internal.mlkit_vision_barcode.zzxw zzxwVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.mlkit_vision_barcode.zzxx[] zzxxVarArr, com.google.android.gms.internal.mlkit_vision_barcode.zzxu[] zzxuVarArr, java.lang.String[] strArr, com.google.android.gms.internal.mlkit_vision_barcode.zzxp[] zzxpVarArr) {
        this.zza = zzxwVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzxxVarArr;
        this.zze = zzxuVarArr;
        this.zzf = strArr;
        this.zzg = zzxpVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 5, this.zze, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 6, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 7, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String[] zzg() {
        return this.zzf;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxx[] zzf() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxu[] zze() {
        return this.zze;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxp[] zzd() {
        return this.zzg;
    }

    public final java.lang.String zzc() {
        return this.zzc;
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxw zza() {
        return this.zza;
    }
}
