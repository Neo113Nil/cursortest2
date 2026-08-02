package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public final class zzc {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.ClassLoader zzb = com.google.android.gms.internal.maps.zzc.class.getClassLoader();

    public static android.os.Parcelable zza(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (android.os.Parcelable) creator.createFromParcel(parcel);
    }

    public static java.util.ArrayList zzb(android.os.Parcel parcel) {
        return parcel.readArrayList(zzb);
    }

    public static java.util.HashMap zzc(android.os.Parcel parcel) {
        return parcel.readHashMap(zzb);
    }

    public static void zzd(android.os.Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new android.os.BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
    }

    public static void zze(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void zzf(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    public static void zzg(android.os.Parcel parcel, android.os.IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static boolean zzh(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }

    private zzc() {
    }
}
