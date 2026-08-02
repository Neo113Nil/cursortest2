package com.google.mlkit.vision.common.internal;

/* loaded from: classes9.dex */
public final class zzg implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 2) {
                i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 3) {
                i3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 4) {
                j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
            } else if (fieldId != 5) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                i4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.mlkit.vision.common.internal.VisionImageMetadataParcel(i, i2, i3, j, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.mlkit.vision.common.internal.VisionImageMetadataParcel[i];
    }
}
