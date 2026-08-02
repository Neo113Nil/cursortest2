package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class zzp implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.maps.model.LatLng latLng = null;
        java.lang.String str = null;
        java.lang.String str2 = null;
        android.os.IBinder iBinder = null;
        android.os.IBinder iBinder2 = null;
        java.lang.String str3 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.5f;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    latLng = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.maps.model.LatLng.CREATOR);
                    break;
                case 3:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    iBinder = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 6:
                    f = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 7:
                    f2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 8:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    z3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    f3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 12:
                    f7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 13:
                    f4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 14:
                    f6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 15:
                    f5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 16:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 17:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 18:
                    iBinder2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 19:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 20:
                    str3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.maps.model.MarkerOptions(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f7, f4, f6, f5, i, iBinder2, i2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.maps.model.MarkerOptions[i];
    }
}
