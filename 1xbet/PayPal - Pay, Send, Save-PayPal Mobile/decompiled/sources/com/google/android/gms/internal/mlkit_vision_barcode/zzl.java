package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzl extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_barcode.zzl> CREATOR = new com.google.android.gms.internal.mlkit_vision_barcode.zzy();
    public com.google.android.gms.internal.mlkit_vision_barcode.zzp zza;
    public java.lang.String zzb;
    public java.lang.String zzc;
    public com.google.android.gms.internal.mlkit_vision_barcode.zzq[] zzd;
    public com.google.android.gms.internal.mlkit_vision_barcode.zzn[] zze;
    public java.lang.String[] zzf;
    public com.google.android.gms.internal.mlkit_vision_barcode.zzi[] zzg;

    public zzl() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 5, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 6, this.zze, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(parcel, 7, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzl(com.google.android.gms.internal.mlkit_vision_barcode.zzp zzpVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.mlkit_vision_barcode.zzq[] zzqVarArr, com.google.android.gms.internal.mlkit_vision_barcode.zzn[] zznVarArr, java.lang.String[] strArr, com.google.android.gms.internal.mlkit_vision_barcode.zzi[] zziVarArr) {
        this.zza = zzpVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzqVarArr;
        this.zze = zznVarArr;
        this.zzf = strArr;
        this.zzg = zziVarArr;
    }
}
