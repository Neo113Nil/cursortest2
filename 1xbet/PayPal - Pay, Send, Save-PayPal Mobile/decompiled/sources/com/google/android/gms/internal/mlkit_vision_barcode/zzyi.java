package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzyi implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        java.lang.String str4 = null;
        java.lang.String str5 = null;
        java.lang.String str6 = null;
        java.lang.String str7 = null;
        java.lang.String str8 = null;
        java.lang.String str9 = null;
        java.lang.String str10 = null;
        java.lang.String str11 = null;
        java.lang.String str12 = null;
        java.lang.String str13 = null;
        java.lang.String str14 = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    str4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    str5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    str6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 7:
                    str7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    str8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    str9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 10:
                    str10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 11:
                    str11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 12:
                    str12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 13:
                    str13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 14:
                    str14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzxt(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzxt[i];
    }
}
