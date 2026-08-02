package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public final class zzn implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
        android.net.Uri uri = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                publicKeyCredentialCreationOptions = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.CREATOR);
            } else if (fieldId == 3) {
                uri = (android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, android.net.Uri.CREATOR);
            } else if (fieldId != 4) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                bArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialCreationOptions, uri, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions[i];
    }
}
