package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzaja implements Parcelable.Creator<zzajb> {
    @Override // android.os.Parcelable.Creator
    public final zzajb createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
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
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = b.g(parcel, readInt);
                    break;
                case 3:
                    str2 = b.g(parcel, readInt);
                    break;
                case 4:
                    str3 = b.g(parcel, readInt);
                    break;
                case 5:
                    str4 = b.g(parcel, readInt);
                    break;
                case 6:
                    str5 = b.g(parcel, readInt);
                    break;
                case 7:
                    str6 = b.g(parcel, readInt);
                    break;
                case '\b':
                    str7 = b.g(parcel, readInt);
                    break;
                case '\t':
                    str8 = b.g(parcel, readInt);
                    break;
                case '\n':
                    z2 = b.m(parcel, readInt);
                    break;
                case 11:
                    z3 = b.m(parcel, readInt);
                    break;
                case '\f':
                    str9 = b.g(parcel, readInt);
                    break;
                case '\r':
                    str10 = b.g(parcel, readInt);
                    break;
                case 14:
                    str11 = b.g(parcel, readInt);
                    break;
                case 15:
                    str12 = b.g(parcel, readInt);
                    break;
                case 16:
                    z4 = b.m(parcel, readInt);
                    break;
                case 17:
                    str13 = b.g(parcel, readInt);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new zzajb(str, str2, str3, str4, str5, str6, str7, str8, z2, z3, str9, str10, str11, str12, z4, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzajb[] newArray(int i) {
        return new zzajb[i];
    }
}
