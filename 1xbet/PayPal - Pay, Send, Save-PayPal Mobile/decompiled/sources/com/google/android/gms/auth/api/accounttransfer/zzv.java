package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes8.dex */
public final class zzv implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.util.HashSet hashSet = new java.util.HashSet();
        com.google.android.gms.auth.api.accounttransfer.zzw zzwVar = null;
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                hashSet.add(1);
            } else if (fieldId == 2) {
                zzwVar = (com.google.android.gms.auth.api.accounttransfer.zzw) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.auth.api.accounttransfer.zzw.CREATOR);
                hashSet.add(2);
            } else if (fieldId == 3) {
                str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                hashSet.add(3);
            } else if (fieldId == 4) {
                str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                hashSet.add(4);
            } else if (fieldId != 5) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == validateObjectHeader) {
            return new com.google.android.gms.auth.api.accounttransfer.zzu(hashSet, i, zzwVar, str, str2, str3);
        }
        throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException("Overread allowed size end=" + validateObjectHeader, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.auth.api.accounttransfer.zzu[i];
    }
}
