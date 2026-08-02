package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public final class zzar implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        byte[] bArr = null;
        java.lang.Double d = null;
        java.lang.String str = null;
        java.util.ArrayList arrayList = null;
        java.lang.Integer num = null;
        com.google.android.gms.fido.fido2.api.common.TokenBinding tokenBinding = null;
        java.lang.String str2 = null;
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions authenticationExtensions = null;
        java.lang.Long l = null;
        java.lang.String str3 = null;
        android.os.ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    bArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 3:
                    d = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDoubleObject(parcel, readHeader);
                    break;
                case 4:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    arrayList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 6:
                    num = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(parcel, readHeader);
                    break;
                case 7:
                    tokenBinding = (com.google.android.gms.fido.fido2.api.common.TokenBinding) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.TokenBinding.CREATOR);
                    break;
                case 8:
                    str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    authenticationExtensions = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.CREATOR);
                    break;
                case 10:
                    l = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLongObject(parcel, readHeader);
                    break;
                case 11:
                    str3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 12:
                    resultReceiver = (android.os.ResultReceiver) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, android.os.ResultReceiver.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions(bArr, d, str, arrayList, num, tokenBinding, str2, authenticationExtensions, l, str3, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions[i];
    }
}
