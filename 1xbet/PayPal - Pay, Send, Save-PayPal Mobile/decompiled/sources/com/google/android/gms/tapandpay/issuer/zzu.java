package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class zzu implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.ExtraOptions defaultOptions = com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.ExtraOptions.defaultOptions();
        com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext pushProvisionSessionContext = null;
        java.lang.String str = null;
        com.google.android.gms.tapandpay.issuer.UserAddress userAddress = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                pushProvisionSessionContext = (com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext.CREATOR);
            } else if (fieldId == 2) {
                str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                userAddress = (com.google.android.gms.tapandpay.issuer.UserAddress) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.tapandpay.issuer.UserAddress.CREATOR);
            } else if (fieldId != 4) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                defaultOptions = (com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.ExtraOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.ExtraOptions.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest(pushProvisionSessionContext, str, userAddress, defaultOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest[i];
    }
}
