package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        boolean zK = false;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            if (((char) i7) != 1) {
                Q0.a.X(i7, parcel);
            } else {
                zK = Q0.a.K(i7, parcel);
            }
        }
        Q0.a.y(iA0, parcel);
        return new BeginSignInRequest.PasswordRequestOptions(zK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new BeginSignInRequest.PasswordRequestOptions[i7];
    }
}
