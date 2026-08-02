package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_barcode.zzo> CREATOR = new com.google.android.gms.internal.mlkit_vision_barcode.zzab();
    public double zza;
    public double zzb;

    public zzo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 2, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzo(double d, double d2) {
        this.zza = d;
        this.zzb = d2;
    }
}
