package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzs implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.tapandpay.firstparty.CardInfo[] cardInfoArr = null;
        com.google.android.gms.tapandpay.firstparty.AccountInfo accountInfo = null;
        java.lang.String str = null;
        java.lang.String str2 = null;
        android.util.SparseArray<java.lang.String> sparseArray = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    cardInfoArr = (com.google.android.gms.tapandpay.firstparty.CardInfo[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, readHeader, com.google.android.gms.tapandpay.firstparty.CardInfo.CREATOR);
                    break;
                case 3:
                    accountInfo = (com.google.android.gms.tapandpay.firstparty.AccountInfo) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.tapandpay.firstparty.AccountInfo.CREATOR);
                    break;
                case 4:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    sparseArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringSparseArray(parcel, readHeader);
                    break;
                case 7:
                    bArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.tapandpay.firstparty.zzr(cardInfoArr, accountInfo, str, str2, sparseArray, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.tapandpay.firstparty.zzr[i];
    }
}
