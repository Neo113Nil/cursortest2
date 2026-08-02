package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzel implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        int i = -1;
        int i2 = 0;
        short s = 0;
        int i3 = 0;
        long j = 0;
        float f = 0.0f;
        double d = 0.0d;
        double d2 = 0.0d;
        java.lang.String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    s = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readShort(parcel, readHeader);
                    break;
                case 4:
                    d = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 5:
                    d2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 6:
                    f = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 7:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    i3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 9:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.internal.identity.zzek(str, i2, s, d, d2, f, j, i3, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.internal.identity.zzek[i];
    }
}
