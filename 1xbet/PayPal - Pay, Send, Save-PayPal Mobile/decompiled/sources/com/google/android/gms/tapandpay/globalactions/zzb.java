package com.google.android.gms.tapandpay.globalactions;

/* loaded from: classes8.dex */
public final class zzb implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        com.google.android.gms.tapandpay.globalactions.GlobalActionCard[] globalActionCardArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                globalActionCardArr = (com.google.android.gms.tapandpay.globalactions.GlobalActionCard[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, readHeader, com.google.android.gms.tapandpay.globalactions.GlobalActionCard.CREATOR);
            } else if (fieldId != 2) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse(globalActionCardArr, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse[i];
    }
}
