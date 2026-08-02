package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes8.dex */
public final class zzp implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.HashSet hashSet = new java.util.HashSet();
        int i = 0;
        java.util.ArrayList arrayList = null;
        com.google.android.gms.auth.api.accounttransfer.zzs zzsVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                hashSet.add(1);
            } else if (fieldId == 2) {
                arrayList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, readHeader, com.google.android.gms.auth.api.accounttransfer.zzu.CREATOR);
                hashSet.add(2);
            } else if (fieldId == 3) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                hashSet.add(3);
            } else if (fieldId != 4) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                zzsVar = (com.google.android.gms.auth.api.accounttransfer.zzs) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.auth.api.accounttransfer.zzs.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == validateObjectHeader) {
            return new com.google.android.gms.auth.api.accounttransfer.zzo(hashSet, i2, arrayList, i, zzsVar);
        }
        throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException("Overread allowed size end=" + validateObjectHeader, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.auth.api.accounttransfer.zzo[i];
    }
}
