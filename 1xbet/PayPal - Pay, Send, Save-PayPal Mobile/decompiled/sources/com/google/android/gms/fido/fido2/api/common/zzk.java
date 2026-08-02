package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public final class zzk implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        java.lang.String[] strArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                bArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
            } else if (fieldId == 3) {
                bArr2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
            } else if (fieldId == 4) {
                bArr3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
            } else if (fieldId != 5) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                strArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse(bArr, bArr2, bArr3, strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse[i];
    }
}
