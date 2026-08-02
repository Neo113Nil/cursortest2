package com.google.android.gms.auth.blockstore;

/* loaded from: classes8.dex */
public final class zze implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = com.google.android.gms.auth.blockstore.BlockstoreClient.DEFAULT_BYTES_DATA_KEY;
        boolean z = false;
        byte[] bArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                bArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
            } else if (fieldId == 2) {
                z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId != 3) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.auth.blockstore.StoreBytesData(bArr, z, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.auth.blockstore.StoreBytesData[i];
    }
}
