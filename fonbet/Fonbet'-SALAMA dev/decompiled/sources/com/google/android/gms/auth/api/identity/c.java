package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        String str = null;
        boolean z4 = false;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                z4 = Q0.a.K(readInt, parcel);
            } else if (c3 != 2) {
                Q0.a.X(readInt, parcel);
            } else {
                str = Q0.a.n(readInt, parcel);
            }
        }
        Q0.a.y(a02, parcel);
        return new BeginSignInRequest.PasskeyJsonRequestOptions(z4, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new BeginSignInRequest.PasskeyJsonRequestOptions[i7];
    }
}
