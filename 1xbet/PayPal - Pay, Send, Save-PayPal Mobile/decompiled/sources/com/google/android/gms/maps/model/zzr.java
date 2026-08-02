package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class zzr implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.maps.model.PinConfig.Glyph glyph = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 3) {
                i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId != 4) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                glyph = (com.google.android.gms.maps.model.PinConfig.Glyph) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.maps.model.PinConfig.Glyph.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.maps.model.PinConfig(i, i2, glyph);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.maps.model.PinConfig[i];
    }
}
