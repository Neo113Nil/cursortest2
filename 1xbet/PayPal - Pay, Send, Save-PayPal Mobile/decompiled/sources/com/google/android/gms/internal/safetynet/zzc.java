package com.google.android.gms.internal.safetynet;

/* loaded from: classes8.dex */
public final class zzc {
    private static final java.lang.ClassLoader zza = com.google.android.gms.internal.safetynet.zzc.class.getClassLoader();

    public static <T extends android.os.Parcelable> T zza(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void zzb(android.os.Parcel parcel, android.os.IInterface iInterface) {
        if (iInterface == 0) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface);
        }
    }

    public static boolean zzc(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }

    private zzc() {
    }
}
