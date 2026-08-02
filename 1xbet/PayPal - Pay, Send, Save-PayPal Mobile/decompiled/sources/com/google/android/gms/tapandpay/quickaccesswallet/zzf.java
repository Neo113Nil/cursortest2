package com.google.android.gms.tapandpay.quickaccesswallet;

/* loaded from: classes8.dex */
public final class zzf implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = null;
        java.lang.String str2 = null;
        com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra[] walletCardIntentExtraArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId != 3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                walletCardIntentExtraArr = (com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, readHeader, com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntentExtra.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent(str, str2, walletCardIntentExtraArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.tapandpay.quickaccesswallet.WalletCardIntent[i];
    }
}
