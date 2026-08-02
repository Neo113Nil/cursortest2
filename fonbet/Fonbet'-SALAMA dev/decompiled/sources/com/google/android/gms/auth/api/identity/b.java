package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        boolean z4 = false;
        boolean z7 = false;
        boolean z8 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    z4 = Q0.a.K(readInt, parcel);
                    break;
                case 2:
                    str = Q0.a.n(readInt, parcel);
                    break;
                case 3:
                    str2 = Q0.a.n(readInt, parcel);
                    break;
                case 4:
                    z7 = Q0.a.K(readInt, parcel);
                    break;
                case 5:
                    str3 = Q0.a.n(readInt, parcel);
                    break;
                case 6:
                    arrayList = Q0.a.p(readInt, parcel);
                    break;
                case 7:
                    z8 = Q0.a.K(readInt, parcel);
                    break;
                default:
                    Q0.a.X(readInt, parcel);
                    break;
            }
        }
        Q0.a.y(a02, parcel);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(z4, str, str2, z7, str3, arrayList, z8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i7];
    }
}
