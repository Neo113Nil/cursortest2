package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzah extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_barcode.zzah> CREATOR = new com.google.android.gms.internal.mlkit_vision_barcode.zzai();
    public int zza;
    public boolean zzb;

    public zzah() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.mlkit_vision_barcode.zzah)) {
            return false;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzah zzahVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzah) obj;
        return this.zza == zzahVar.zza && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzb), java.lang.Boolean.valueOf(zzahVar.zzb));
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Boolean.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzah(int i, boolean z) {
        this.zza = i;
        this.zzb = z;
    }
}
