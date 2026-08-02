package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class zzp implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions defaultOptions = com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions.defaultOptions();
        byte[] bArr = null;
        java.lang.String str = null;
        java.lang.String str2 = null;
        com.google.android.gms.tapandpay.issuer.UserAddress userAddress = null;
        int[] iArr = null;
        android.os.IBinder iBinder = null;
        com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo cobadgedTokenInfo = null;
        com.google.android.gms.tapandpay.issuer.SupervisedUserInfo supervisedUserInfo = null;
        java.lang.String[] strArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 3:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    bArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 5:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 7:
                    userAddress = (com.google.android.gms.tapandpay.issuer.UserAddress) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.tapandpay.issuer.UserAddress.CREATOR);
                    break;
                case 8:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    iArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(parcel, readHeader);
                    break;
                case 10:
                    iBinder = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 11:
                    cobadgedTokenInfo = (com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo.CREATOR);
                    break;
                case 12:
                    supervisedUserInfo = (com.google.android.gms.tapandpay.issuer.SupervisedUserInfo) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.tapandpay.issuer.SupervisedUserInfo.CREATOR);
                    break;
                case 13:
                    strArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(parcel, readHeader);
                    break;
                case 14:
                    defaultOptions = (com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.tapandpay.issuer.PushTokenizeRequest(i, i2, bArr, str, str2, userAddress, z, iArr, iBinder, cobadgedTokenInfo, supervisedUserInfo, strArr, defaultOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.tapandpay.issuer.PushTokenizeRequest[i];
    }
}
