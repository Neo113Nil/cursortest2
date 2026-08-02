package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzyb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_barcode.zzyb> CREATOR = new com.google.android.gms.internal.mlkit_vision_barcode.zzyc();
    private final int zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final byte[] zzd;
    private final android.graphics.Point[] zze;
    private final int zzf;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzxu zzg;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzxx zzh;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzxy zzi;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzya zzj;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzxz zzk;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzxv zzl;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzxr zzm;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzxs zzn;
    private final com.google.android.gms.internal.mlkit_vision_barcode.zzxt zzo;

    public zzyb(int i, java.lang.String str, java.lang.String str2, byte[] bArr, android.graphics.Point[] pointArr, int i2, com.google.android.gms.internal.mlkit_vision_barcode.zzxu zzxuVar, com.google.android.gms.internal.mlkit_vision_barcode.zzxx zzxxVar, com.google.android.gms.internal.mlkit_vision_barcode.zzxy zzxyVar, com.google.android.gms.internal.mlkit_vision_barcode.zzya zzyaVar, com.google.android.gms.internal.mlkit_vision_barcode.zzxz zzxzVar, com.google.android.gms.internal.mlkit_vision_barcode.zzxv zzxvVar, com.google.android.gms.internal.mlkit_vision_barcode.zzxr zzxrVar, com.google.android.gms.internal.mlkit_vision_barcode.zzxs zzxsVar, com.google.android.gms.internal.mlkit_vision_barcode.zzxt zzxtVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = pointArr;
        this.zzf = i2;
        this.zzg = zzxuVar;
        this.zzh = zzxxVar;
        this.zzi = zzxyVar;
        this.zzj = zzyaVar;
        this.zzk = zzxzVar;
        this.zzl = zzxvVar;
        this.zzm = zzxrVar;
        this.zzn = zzxsVar;
        this.zzo = zzxtVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 5, this.zze, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 10, this.zzj, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 12, this.zzl, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 13, this.zzm, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 14, this.zzn, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 15, this.zzo, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final android.graphics.Point[] zzo() {
        return this.zze;
    }

    public final byte[] zzn() {
        return this.zzd;
    }

    public final java.lang.String zzm() {
        return this.zzc;
    }

    public final java.lang.String zzl() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzya zzk() {
        return this.zzj;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxz zzj() {
        return this.zzk;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxy zzi() {
        return this.zzi;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxx zzh() {
        return this.zzh;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxv zzg() {
        return this.zzl;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxu zzf() {
        return this.zzg;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxt zze() {
        return this.zzo;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxs zzd() {
        return this.zzn;
    }

    public final com.google.android.gms.internal.mlkit_vision_barcode.zzxr zzc() {
        return this.zzm;
    }

    public final int zzb() {
        return this.zzf;
    }

    public final int zza() {
        return this.zza;
    }
}
