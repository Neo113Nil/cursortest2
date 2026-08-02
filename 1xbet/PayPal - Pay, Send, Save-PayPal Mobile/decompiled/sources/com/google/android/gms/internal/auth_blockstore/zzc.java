package com.google.android.gms.internal.auth_blockstore;

/* loaded from: classes8.dex */
public final class zzc {
    public static final /* synthetic */ int zza = 0;

    static {
        com.google.android.gms.internal.auth_blockstore.zzc.class.getClassLoader();
    }

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

    public static boolean zzd(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }

    private zzc() {
    }
}
