package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public final class zzan implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        byte[] bArr = null;
        java.util.ArrayList arrayList = null;
        java.lang.Double d = null;
        java.util.ArrayList arrayList2 = null;
        com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        java.lang.Integer num = null;
        com.google.android.gms.fido.fido2.api.common.TokenBinding tokenBinding = null;
        java.lang.String str = null;
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions authenticationExtensions = null;
        java.lang.String str2 = null;
        android.os.ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    publicKeyCredentialRpEntity = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity.CREATOR);
                    break;
                case 3:
                    publicKeyCredentialUserEntity = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity.CREATOR);
                    break;
                case 4:
                    bArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 5:
                    arrayList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    d = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDoubleObject(parcel, readHeader);
                    break;
                case 7:
                    arrayList2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 8:
                    authenticatorSelectionCriteria = (com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.CREATOR);
                    break;
                case 9:
                    num = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(parcel, readHeader);
                    break;
                case 10:
                    tokenBinding = (com.google.android.gms.fido.fido2.api.common.TokenBinding) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.TokenBinding.CREATOR);
                    break;
                case 11:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 12:
                    authenticationExtensions = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.CREATOR);
                    break;
                case 13:
                    str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 14:
                    resultReceiver = (android.os.ResultReceiver) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, android.os.ResultReceiver.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, arrayList, d, arrayList2, authenticatorSelectionCriteria, num, tokenBinding, str, authenticationExtensions, str2, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions[i];
    }
}
