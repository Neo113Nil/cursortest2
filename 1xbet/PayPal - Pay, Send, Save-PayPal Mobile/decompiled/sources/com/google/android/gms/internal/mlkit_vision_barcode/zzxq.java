package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzxq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_barcode.zzxq> CREATOR = new com.google.android.gms.internal.mlkit_vision_barcode.zzyf();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;
    private final boolean zzg;
    private final java.lang.String zzh;

    public zzxq(int i, int i2, int i3, int i4, int i5, int i6, boolean z, java.lang.String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = z;
        this.zzh = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean zzh() {
        return this.zzg;
    }

    public final java.lang.String zzg() {
        return this.zzh;
    }

    public final int zzf() {
        return this.zza;
    }

    public final int zze() {
        return this.zzf;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final int zza() {
        return this.zzc;
    }
}
