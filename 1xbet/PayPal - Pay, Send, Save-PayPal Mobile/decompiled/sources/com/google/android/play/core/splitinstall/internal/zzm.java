package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzm {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.ClassLoader zzb = com.google.android.play.core.splitinstall.internal.zzm.class.getClassLoader();

    public static android.os.Parcelable zza(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (android.os.Parcelable) creator.createFromParcel(parcel);
    }

    public static void zzb(android.os.Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Parcel data not fully consumed, unread size: ");
        sb.append(dataAvail);
        throw new android.os.BadParcelableException(sb.toString());
    }

    public static void zzc(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    private zzm() {
    }
}
