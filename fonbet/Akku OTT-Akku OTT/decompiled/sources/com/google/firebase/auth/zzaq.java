package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzaq implements Parcelable.Creator<PhoneMultiFactorInfo> {
    @Override // android.os.Parcelable.Creator
    public final PhoneMultiFactorInfo createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = b.g(parcel, readInt);
            } else if (c == 2) {
                str2 = b.g(parcel, readInt);
            } else if (c == 3) {
                j = b.v(parcel, readInt);
            } else if (c != 4) {
                b.y(parcel, readInt);
            } else {
                str3 = b.g(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new PhoneMultiFactorInfo(str, str2, j, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PhoneMultiFactorInfo[] newArray(int i) {
        return new PhoneMultiFactorInfo[i];
    }
}
