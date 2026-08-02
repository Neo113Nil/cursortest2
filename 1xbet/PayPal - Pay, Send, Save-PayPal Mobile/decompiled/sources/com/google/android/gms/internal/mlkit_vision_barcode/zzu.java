package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_barcode.zzu> CREATOR = new com.google.android.gms.internal.mlkit_vision_barcode.zzv();
    public int zza;
    public java.lang.String zzb;
    public java.lang.String zzc;
    public int zzd;
    public android.graphics.Point[] zze;
    public com.google.android.gms.internal.mlkit_vision_barcode.zzn zzf;
    public com.google.android.gms.internal.mlkit_vision_barcode.zzq zzg;
    public com.google.android.gms.internal.mlkit_vision_barcode.zzr zzh;
    public com.google.android.gms.internal.mlkit_vision_barcode.zzt zzi;
    public com.google.android.gms.internal.mlkit_vision_barcode.zzs zzj;
    public com.google.android.gms.internal.mlkit_vision_barcode.zzo zzk;
    public com.google.android.gms.internal.mlkit_vision_barcode.zzk zzl;
    public com.google.android.gms.internal.mlkit_vision_barcode.zzl zzm;
    public com.google.android.gms.internal.mlkit_vision_barcode.zzm zzn;
    public byte[] zzo;
    public boolean zzp;
    public double zzq;

    public zzu() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 6, this.zze, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 11, this.zzj, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 13, this.zzl, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 15, this.zzn, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 16, this.zzo, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 17, this.zzp);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 18, this.zzq);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzu(int i, java.lang.String str, java.lang.String str2, int i2, android.graphics.Point[] pointArr, com.google.android.gms.internal.mlkit_vision_barcode.zzn zznVar, com.google.android.gms.internal.mlkit_vision_barcode.zzq zzqVar, com.google.android.gms.internal.mlkit_vision_barcode.zzr zzrVar, com.google.android.gms.internal.mlkit_vision_barcode.zzt zztVar, com.google.android.gms.internal.mlkit_vision_barcode.zzs zzsVar, com.google.android.gms.internal.mlkit_vision_barcode.zzo zzoVar, com.google.android.gms.internal.mlkit_vision_barcode.zzk zzkVar, com.google.android.gms.internal.mlkit_vision_barcode.zzl zzlVar, com.google.android.gms.internal.mlkit_vision_barcode.zzm zzmVar, byte[] bArr, boolean z, double d) {
        this.zza = i;
        this.zzb = str;
        this.zzo = bArr;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = pointArr;
        this.zzp = z;
        this.zzq = d;
        this.zzf = zznVar;
        this.zzg = zzqVar;
        this.zzh = zzrVar;
        this.zzi = zztVar;
        this.zzj = zzsVar;
        this.zzk = zzoVar;
        this.zzl = zzkVar;
        this.zzm = zzlVar;
        this.zzn = zzmVar;
    }
}
