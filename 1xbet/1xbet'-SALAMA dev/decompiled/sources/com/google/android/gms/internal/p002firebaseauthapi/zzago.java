package com.google.android.gms.internal.p002firebaseauthapi;

import Q0.a;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzago implements Parcelable.Creator<zzagl> {
    @Override // android.os.Parcelable.Creator
    public final zzagl createFromParcel(Parcel parcel) {
        int iA0 = a.a0(parcel);
        String strN = null;
        String strN2 = null;
        Long lQ = null;
        String strN3 = null;
        Long lQ2 = null;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            char c3 = (char) i7;
            if (c3 == 2) {
                strN = a.n(i7, parcel);
            } else if (c3 == 3) {
                strN2 = a.n(i7, parcel);
            } else if (c3 == 4) {
                lQ = a.Q(i7, parcel);
            } else if (c3 == 5) {
                strN3 = a.n(i7, parcel);
            } else if (c3 != 6) {
                a.X(i7, parcel);
            } else {
                lQ2 = a.Q(i7, parcel);
            }
        }
        a.y(iA0, parcel);
        return new zzagl(strN, strN2, lQ, strN3, lQ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagl[] newArray(int i7) {
        return new zzagl[i7];
    }
}
