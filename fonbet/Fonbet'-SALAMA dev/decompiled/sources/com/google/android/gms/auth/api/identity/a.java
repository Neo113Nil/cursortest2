package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int a02 = Q0.a.a0(parcel);
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        String str = null;
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = null;
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = null;
        boolean z4 = false;
        int i7 = 0;
        while (parcel.dataPosition() < a02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) Q0.a.m(parcel, readInt, BeginSignInRequest.PasswordRequestOptions.CREATOR);
                    break;
                case 2:
                    googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) Q0.a.m(parcel, readInt, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
                    break;
                case 3:
                    str = Q0.a.n(readInt, parcel);
                    break;
                case 4:
                    z4 = Q0.a.K(readInt, parcel);
                    break;
                case 5:
                    i7 = Q0.a.N(readInt, parcel);
                    break;
                case 6:
                    passkeysRequestOptions = (BeginSignInRequest.PasskeysRequestOptions) Q0.a.m(parcel, readInt, BeginSignInRequest.PasskeysRequestOptions.CREATOR);
                    break;
                case 7:
                    passkeyJsonRequestOptions = (BeginSignInRequest.PasskeyJsonRequestOptions) Q0.a.m(parcel, readInt, BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR);
                    break;
                default:
                    Q0.a.X(readInt, parcel);
                    break;
            }
        }
        Q0.a.y(a02, parcel);
        return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, str, z4, i7, passkeysRequestOptions, passkeyJsonRequestOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new BeginSignInRequest[i7];
    }
}
