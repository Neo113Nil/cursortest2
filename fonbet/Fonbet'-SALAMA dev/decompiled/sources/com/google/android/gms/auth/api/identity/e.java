package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        boolean z4 = false;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                Q0.a.X(readInt, parcel);
            } else {
                z4 = Q0.a.K(readInt, parcel);
            }
        }
        Q0.a.y(a02, parcel);
        return new BeginSignInRequest.PasswordRequestOptions(z4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new BeginSignInRequest.PasswordRequestOptions[i7];
    }
}
