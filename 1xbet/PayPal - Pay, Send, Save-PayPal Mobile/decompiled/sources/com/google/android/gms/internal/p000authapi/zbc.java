package com.google.android.gms.internal.p000authapi;

/* loaded from: classes8.dex */
public final class zbc {
    static {
        com.google.android.gms.internal.p000authapi.zbc.class.getClassLoader();
    }

    public static android.os.Parcelable zba(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (android.os.Parcelable) creator.createFromParcel(parcel);
    }

    public static void zbb(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void zbc(android.os.Parcel parcel, android.os.IInterface iInterface) {
        parcel.writeStrongBinder(iInterface.asBinder());
    }

    public static void zbd(android.os.Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(dataAvail).length() + 45);
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(dataAvail);
        throw new android.os.BadParcelableException(sb.toString());
    }

    private zbc() {
    }
}
