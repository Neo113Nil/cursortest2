package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzya extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_barcode.zzya> CREATOR = new com.google.android.gms.internal.mlkit_vision_barcode.zzyt();
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final int zzc;

    public zzya(java.lang.String str, java.lang.String str2, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.lang.String zzc() {
        return this.zza;
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final int zza() {
        return this.zzc;
    }
}
