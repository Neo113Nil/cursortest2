package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzac implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.tapandpay.firstparty.zzaw zzawVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader) != 1) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                zzawVar = (com.google.android.gms.tapandpay.firstparty.zzaw) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.tapandpay.firstparty.zzaw.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.tapandpay.firstparty.zzab(zzawVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.tapandpay.firstparty.zzab[i];
    }
}
