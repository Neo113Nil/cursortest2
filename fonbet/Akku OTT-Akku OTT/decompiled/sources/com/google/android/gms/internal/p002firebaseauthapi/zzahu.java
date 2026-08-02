package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.b;

/* loaded from: classes4.dex */
public final class zzahu implements Parcelable.Creator<zzahv> {
    @Override // android.os.Parcelable.Creator
    public final zzahv createFromParcel(Parcel parcel) {
        int z = b.z(parcel);
        String str = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        Long l2 = null;
        while (parcel.dataPosition() < z) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = b.g(parcel, readInt);
            } else if (c == 3) {
                str2 = b.g(parcel, readInt);
            } else if (c == 4) {
                l = b.w(parcel, readInt);
            } else if (c == 5) {
                str3 = b.g(parcel, readInt);
            } else if (c != 6) {
                b.y(parcel, readInt);
            } else {
                l2 = b.w(parcel, readInt);
            }
        }
        b.l(parcel, z);
        return new zzahv(str, str2, l, str3, l2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahv[] newArray(int i) {
        return new zzahv[i];
    }
}
