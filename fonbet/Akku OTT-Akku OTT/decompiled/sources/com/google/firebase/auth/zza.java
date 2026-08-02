package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zza implements Parcelable.Creator<ActionCodeSettings> {
    @Override // android.os.Parcelable.Creator
    public final ActionCodeSettings createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = b.g(parcel, readInt);
                    break;
                case 2:
                    str2 = b.g(parcel, readInt);
                    break;
                case 3:
                    str3 = b.g(parcel, readInt);
                    break;
                case 4:
                    str4 = b.g(parcel, readInt);
                    break;
                case 5:
                    z2 = b.m(parcel, readInt);
                    break;
                case 6:
                    str5 = b.g(parcel, readInt);
                    break;
                case 7:
                    z3 = b.m(parcel, readInt);
                    break;
                case '\b':
                    str6 = b.g(parcel, readInt);
                    break;
                case '\t':
                    i = b.t(parcel, readInt);
                    break;
                case '\n':
                    str7 = b.g(parcel, readInt);
                    break;
                case 11:
                    str8 = b.g(parcel, readInt);
                    break;
                default:
                    b.y(parcel, readInt);
                    break;
            }
        }
        b.l(parcel, z);
        return new ActionCodeSettings(str, str2, str3, str4, z2, str5, z3, str6, i, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ActionCodeSettings[] newArray(int i) {
        return new ActionCodeSettings[i];
    }
}
