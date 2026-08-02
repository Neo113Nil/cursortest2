package com.google.android.gms.auth.api.identity;

/* loaded from: classes8.dex */
public final class zbd implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        java.lang.String str = null;
        com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = null;
        com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    passwordRequestOptions = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.auth.api.identity.BeginSignInRequest.PasswordRequestOptions.CREATOR);
                    break;
                case 2:
                    googleIdTokenRequestOptions = (com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.auth.api.identity.BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
                    break;
                case 3:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 5:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    passkeysRequestOptions = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeysRequestOptions.CREATOR);
                    break;
                case 7:
                    passkeyJsonRequestOptions = (com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.auth.api.identity.BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR);
                    break;
                case 8:
                    z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.auth.api.identity.BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, str, z, i, passkeysRequestOptions, passkeyJsonRequestOptions, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.auth.api.identity.BeginSignInRequest[i];
    }
}
