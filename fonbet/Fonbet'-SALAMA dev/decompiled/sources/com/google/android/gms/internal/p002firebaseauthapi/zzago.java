package com.google.android.gms.internal.p002firebaseauthapi;

import Q0.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzago implements Parcelable.Creator<zzagl> {
    @Override // android.os.Parcelable.Creator
    public final zzagl createFromParcel(Parcel parcel) {
        int a02 = a.a0(parcel);
        String str = null;
        String str2 = null;
        Long l7 = null;
        String str3 = null;
        Long l8 = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 2) {
                str = a.n(readInt, parcel);
            } else if (c3 == 3) {
                str2 = a.n(readInt, parcel);
            } else if (c3 == 4) {
                l7 = a.Q(readInt, parcel);
            } else if (c3 == 5) {
                str3 = a.n(readInt, parcel);
            } else if (c3 != 6) {
                a.X(readInt, parcel);
            } else {
                l8 = a.Q(readInt, parcel);
            }
        }
        a.y(a02, parcel);
        return new zzagl(str, str2, l7, str3, l8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagl[] newArray(int i7) {
        return new zzagl[i7];
    }
}
