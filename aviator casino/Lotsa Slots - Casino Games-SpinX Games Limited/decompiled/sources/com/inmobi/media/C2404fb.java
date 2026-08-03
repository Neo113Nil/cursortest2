package com.inmobi.media;

/* renamed from: com.inmobi.media.fb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2404fb implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "parcel");
        long readLong = parcel.readLong();
        java.lang.String readString = parcel.readString();
        java.lang.String str = readString == null ? "" : readString;
        java.lang.String readString2 = parcel.readString();
        java.lang.String str2 = readString2 == null ? "" : readString2;
        java.lang.String readString3 = parcel.readString();
        java.lang.String str3 = readString3 == null ? "" : readString3;
        java.lang.String readString4 = parcel.readString();
        java.lang.String str4 = readString4 == null ? "" : readString4;
        java.lang.String readString5 = parcel.readString();
        java.lang.String str5 = readString5 == null ? "" : readString5;
        java.lang.String readString6 = parcel.readString();
        java.lang.String str6 = readString6 == null ? "" : readString6;
        boolean z = parcel.readByte() != 0;
        java.lang.String readString7 = parcel.readString();
        com.inmobi.media.C2457hb c2457hb = new com.inmobi.media.C2457hb(readLong, str, str2, str3, str4, str5, str6, z, readString7 == null ? "" : readString7);
        java.lang.String readString8 = parcel.readString();
        com.inmobi.media.C2431gb c2431gb = new com.inmobi.media.C2431gb(c2457hb, readString8 == null ? "" : readString8, parcel.readInt(), parcel.readLong());
        c2431gb.e = parcel.readInt();
        c2431gb.f = parcel.readString();
        return c2431gb;
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i) {
        return new com.inmobi.media.C2431gb[i];
    }
}
