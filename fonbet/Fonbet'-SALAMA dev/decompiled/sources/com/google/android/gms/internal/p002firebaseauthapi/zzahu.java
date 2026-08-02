package com.google.android.gms.internal.p002firebaseauthapi;

import Q0.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzahu implements Parcelable.Creator<zzahr> {
    @Override // android.os.Parcelable.Creator
    public final zzahr createFromParcel(Parcel parcel) {
        int a02 = a.a0(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z4 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = a.n(readInt, parcel);
                    break;
                case 3:
                    str2 = a.n(readInt, parcel);
                    break;
                case 4:
                    str3 = a.n(readInt, parcel);
                    break;
                case 5:
                    str4 = a.n(readInt, parcel);
                    break;
                case 6:
                    str5 = a.n(readInt, parcel);
                    break;
                case 7:
                    str6 = a.n(readInt, parcel);
                    break;
                case '\b':
                    str7 = a.n(readInt, parcel);
                    break;
                case '\t':
                    str8 = a.n(readInt, parcel);
                    break;
                case '\n':
                    z4 = a.K(readInt, parcel);
                    break;
                case 11:
                    z7 = a.K(readInt, parcel);
                    break;
                case '\f':
                    str9 = a.n(readInt, parcel);
                    break;
                case '\r':
                    str10 = a.n(readInt, parcel);
                    break;
                case 14:
                    str11 = a.n(readInt, parcel);
                    break;
                case 15:
                    str12 = a.n(readInt, parcel);
                    break;
                case 16:
                    z8 = a.K(readInt, parcel);
                    break;
                case 17:
                    str13 = a.n(readInt, parcel);
                    break;
                default:
                    a.X(readInt, parcel);
                    break;
            }
        }
        a.y(a02, parcel);
        return new zzahr(str, str2, str3, str4, str5, str6, str7, str8, z4, z7, str9, str10, str11, str12, z8, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahr[] newArray(int i7) {
        return new zzahr[i7];
    }
}
