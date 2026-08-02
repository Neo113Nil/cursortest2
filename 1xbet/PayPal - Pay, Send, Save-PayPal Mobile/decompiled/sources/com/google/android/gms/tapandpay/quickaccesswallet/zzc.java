package com.google.android.gms.tapandpay.quickaccesswallet;

/* loaded from: classes8.dex */
public final class zzc implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = null;
        android.graphics.Bitmap bitmap = null;
        java.lang.String str2 = null;
        com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent[] walletCardIntentArr = null;
        com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage[] cardIconMessageArr = null;
        java.lang.String str3 = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    bitmap = (android.graphics.Bitmap) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, android.graphics.Bitmap.CREATOR);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    walletCardIntentArr = (com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, readHeader, com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent.CREATOR);
                    break;
                case 5:
                    cardIconMessageArr = (com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, readHeader, com.google.android.gms.tapandpay.quickaccesswallet.CardIconMessage.CREATOR);
                    break;
                case 6:
                    j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 7:
                    j2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 8:
                    str3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard(str, bitmap, str2, walletCardIntentArr, cardIconMessageArr, j, j2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletCard[i];
    }
}
