package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
public final class c {
    public static android.os.Parcelable a(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (android.os.Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(android.os.Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Parcel data not fully consumed, unread size: ");
        sb.append(dataAvail);
        throw new android.os.BadParcelableException(sb.toString());
    }

    public static void c(android.os.Parcel parcel, android.os.Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    private c() {
    }
}
