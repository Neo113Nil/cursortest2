package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        String strN = null;
        boolean zK = false;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            char c3 = (char) i7;
            if (c3 == 1) {
                zK = Q0.a.K(i7, parcel);
            } else if (c3 != 2) {
                Q0.a.X(i7, parcel);
            } else {
                strN = Q0.a.n(i7, parcel);
            }
        }
        Q0.a.y(iA0, parcel);
        return new BeginSignInRequest.PasskeyJsonRequestOptions(zK, strN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new BeginSignInRequest.PasskeyJsonRequestOptions[i7];
    }
}
