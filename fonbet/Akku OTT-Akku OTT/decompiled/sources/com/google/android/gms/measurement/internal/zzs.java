package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        boolean z2 = false;
        int i = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i2 = 0;
        int i3 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str11 = null;
        String str12 = null;
        int i4 = 100;
        boolean z5 = true;
        boolean z6 = true;
        long j8 = -2147483648L;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str5 = b.g(parcel, readInt);
                    break;
                case 3:
                    str6 = b.g(parcel, readInt);
                    break;
                case 4:
                    str7 = b.g(parcel, readInt);
                    break;
                case 5:
                    str8 = b.g(parcel, readInt);
                    break;
                case 6:
                    j = b.v(parcel, readInt);
                    break;
                case 7:
                    j2 = b.v(parcel, readInt);
                    break;
                case '\b':
                    str9 = b.g(parcel, readInt);
                    break;
                case '\t':
                    z5 = b.m(parcel, readInt);
                    break;
                case '\n':
                    z2 = b.m(parcel, readInt);
                    break;
                case 11:
                    j8 = b.v(parcel, readInt);
                    break;
                case '\f':
                    str10 = b.g(parcel, readInt);
                    break;
                case '\r':
                case 17:
                case 19:
                case 20:
                case 24:
                case '!':
                default:
                    b.y(parcel, readInt);
                    break;
                case 14:
                    j3 = b.v(parcel, readInt);
                    break;
                case 15:
                    i = b.t(parcel, readInt);
                    break;
                case 16:
                    z6 = b.m(parcel, readInt);
                    break;
                case 18:
                    z3 = b.m(parcel, readInt);
                    break;
                case 21:
                    bool = b.n(parcel, readInt);
                    break;
                case 22:
                    j4 = b.v(parcel, readInt);
                    break;
                case 23:
                    arrayList = b.i(parcel, readInt);
                    break;
                case 25:
                    str = b.g(parcel, readInt);
                    break;
                case 26:
                    str2 = b.g(parcel, readInt);
                    break;
                case 27:
                    str11 = b.g(parcel, readInt);
                    break;
                case 28:
                    z4 = b.m(parcel, readInt);
                    break;
                case 29:
                    j5 = b.v(parcel, readInt);
                    break;
                case 30:
                    i4 = b.t(parcel, readInt);
                    break;
                case 31:
                    str3 = b.g(parcel, readInt);
                    break;
                case ' ':
                    i2 = b.t(parcel, readInt);
                    break;
                case '\"':
                    j6 = b.v(parcel, readInt);
                    break;
                case '#':
                    str12 = b.g(parcel, readInt);
                    break;
                case '$':
                    str4 = b.g(parcel, readInt);
                    break;
                case '%':
                    j7 = b.v(parcel, readInt);
                    break;
                case '&':
                    i3 = b.t(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new zzr(str5, str6, str7, str8, j, j2, str9, z5, z2, j8, str10, j3, i, z6, z3, bool, j4, arrayList, str, str2, str11, z4, j5, i4, str3, i2, j6, str12, str4, j7, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
