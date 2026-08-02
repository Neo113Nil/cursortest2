package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzxu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_barcode.zzxu> CREATOR = new com.google.android.gms.internal.mlkit_vision_barcode.zzyj();
    private final int zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;

    public zzxu(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String zzd() {
        return this.zzc;
    }

    public final java.lang.String zzc() {
        return this.zzd;
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final int zza() {
        return this.zza;
    }
}
