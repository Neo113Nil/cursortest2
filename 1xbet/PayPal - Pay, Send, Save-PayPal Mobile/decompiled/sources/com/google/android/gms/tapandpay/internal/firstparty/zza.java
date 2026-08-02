package com.google.android.gms.tapandpay.internal.firstparty;

/* loaded from: classes8.dex */
public final class zza implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader) != 1) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.tapandpay.internal.firstparty.GetLinkingTokenRequest(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.tapandpay.internal.firstparty.GetLinkingTokenRequest[i];
    }
}
