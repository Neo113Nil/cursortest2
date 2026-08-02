package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzc {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.ClassLoader zzb = com.google.android.gms.internal.identity.zzc.class.getClassLoader();

    public static android.os.Parcelable zza(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (android.os.Parcelable) creator.createFromParcel(parcel);
    }

    public static void zzb(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void zzc(android.os.Parcel parcel, android.os.IInterface iInterface) {
        parcel.writeStrongBinder(iInterface.asBinder());
    }

    public static void zzd(android.os.Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(dataAvail).length() + 45);
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(dataAvail);
        throw new android.os.BadParcelableException(sb.toString());
    }

    private zzc() {
    }
}
