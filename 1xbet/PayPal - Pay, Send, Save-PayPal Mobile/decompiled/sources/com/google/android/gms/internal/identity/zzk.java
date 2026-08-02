package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzk implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.internal.identity.zzh zzhVar = null;
        android.os.IBinder iBinder = null;
        android.os.IBinder iBinder2 = null;
        int i = 1;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 2) {
                zzhVar = (com.google.android.gms.internal.identity.zzh) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.identity.zzh.CREATOR);
            } else if (fieldId == 3) {
                iBinder = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, readHeader);
            } else if (fieldId != 4) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                iBinder2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.internal.identity.zzj(i, zzhVar, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.internal.identity.zzj[i];
    }
}
