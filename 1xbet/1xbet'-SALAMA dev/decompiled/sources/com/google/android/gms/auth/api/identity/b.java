package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        boolean zK = false;
        boolean zK2 = false;
        boolean zK3 = false;
        String strN = null;
        String strN2 = null;
        String strN3 = null;
        ArrayList arrayListP = null;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            switch ((char) i7) {
                case 1:
                    zK = Q0.a.K(i7, parcel);
                    break;
                case 2:
                    strN = Q0.a.n(i7, parcel);
                    break;
                case 3:
                    strN2 = Q0.a.n(i7, parcel);
                    break;
                case 4:
                    zK2 = Q0.a.K(i7, parcel);
                    break;
                case 5:
                    strN3 = Q0.a.n(i7, parcel);
                    break;
                case 6:
                    arrayListP = Q0.a.p(i7, parcel);
                    break;
                case 7:
                    zK3 = Q0.a.K(i7, parcel);
                    break;
                default:
                    Q0.a.X(i7, parcel);
                    break;
            }
        }
        Q0.a.y(iA0, parcel);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(zK, strN, strN2, zK2, strN3, arrayListP, zK3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i7];
    }
}
