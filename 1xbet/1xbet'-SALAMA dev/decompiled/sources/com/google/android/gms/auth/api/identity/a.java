package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iA0 = Q0.a.a0(parcel);
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        String strN = null;
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = null;
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = null;
        boolean zK = false;
        int iN = 0;
        while (parcel.dataPosition() < iA0) {
            int i7 = parcel.readInt();
            switch ((char) i7) {
                case 1:
                    passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) Q0.a.m(parcel, i7, BeginSignInRequest.PasswordRequestOptions.CREATOR);
                    break;
                case 2:
                    googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) Q0.a.m(parcel, i7, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
                    break;
                case 3:
                    strN = Q0.a.n(i7, parcel);
                    break;
                case 4:
                    zK = Q0.a.K(i7, parcel);
                    break;
                case 5:
                    iN = Q0.a.N(i7, parcel);
                    break;
                case 6:
                    passkeysRequestOptions = (BeginSignInRequest.PasskeysRequestOptions) Q0.a.m(parcel, i7, BeginSignInRequest.PasskeysRequestOptions.CREATOR);
                    break;
                case 7:
                    passkeyJsonRequestOptions = (BeginSignInRequest.PasskeyJsonRequestOptions) Q0.a.m(parcel, i7, BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR);
                    break;
                default:
                    Q0.a.X(i7, parcel);
                    break;
            }
        }
        Q0.a.y(iA0, parcel);
        return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, strN, zK, iN, passkeysRequestOptions, passkeyJsonRequestOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new BeginSignInRequest[i7];
    }
}
