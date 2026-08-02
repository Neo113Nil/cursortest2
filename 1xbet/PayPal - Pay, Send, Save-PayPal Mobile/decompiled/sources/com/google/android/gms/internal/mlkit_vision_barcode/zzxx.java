package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzxx extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_barcode.zzxx> CREATOR = new com.google.android.gms.internal.mlkit_vision_barcode.zzyq();
    private final int zza;
    private final java.lang.String zzb;

    public zzxx(int i, java.lang.String str) {
        this.zza = i;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final int zza() {
        return this.zza;
    }
}
