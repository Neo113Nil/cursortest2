package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class zzi implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.Integer num = null;
        java.lang.Integer num2 = null;
        java.lang.Float f = null;
        java.lang.Float f2 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                num = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(parcel, readHeader);
            } else if (fieldId == 2) {
                num2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(parcel, readHeader);
            } else if (fieldId == 3) {
                f = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloatObject(parcel, readHeader);
            } else if (fieldId != 4) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                f2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloatObject(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.maps.model.FeatureStyle(num, num2, f, f2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.maps.model.FeatureStyle[i];
    }
}
