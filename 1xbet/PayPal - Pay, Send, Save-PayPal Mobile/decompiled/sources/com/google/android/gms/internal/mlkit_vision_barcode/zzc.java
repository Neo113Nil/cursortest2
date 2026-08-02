package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzc {
    static {
        com.google.android.gms.internal.mlkit_vision_barcode.zzc.class.getClassLoader();
    }

    public static void zza(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void zzb(android.os.Parcel parcel, android.os.IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    private zzc() {
    }
}
