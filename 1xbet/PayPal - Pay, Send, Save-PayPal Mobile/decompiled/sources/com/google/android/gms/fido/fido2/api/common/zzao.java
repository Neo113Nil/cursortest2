package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public final class zzao implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = null;
        java.lang.String str2 = null;
        byte[] bArr = null;
        com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
        com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
        com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse authenticatorErrorResponse = null;
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
        java.lang.String str3 = null;
        java.lang.String str4 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    bArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 4:
                    authenticatorAttestationResponse = (com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse.CREATOR);
                    break;
                case 5:
                    authenticatorAssertionResponse = (com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse.CREATOR);
                    break;
                case 6:
                    authenticatorErrorResponse = (com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse.CREATOR);
                    break;
                case 7:
                    authenticationExtensionsClientOutputs = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs.CREATOR);
                    break;
                case 8:
                    str3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    str4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredential(str, str2, bArr, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, str3, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredential[i];
    }
}
