package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzyg implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        java.lang.String str4 = null;
        java.lang.String str5 = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzxq zzxqVar = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzxq zzxqVar2 = null;
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
                    zzxqVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzxq) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzxq.CREATOR);
                    break;
                case 7:
                    zzxqVar2 = (com.google.android.gms.internal.mlkit_vision_barcode.zzxq) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzxq.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzxr(str, str2, str3, str4, str5, zzxqVar, zzxqVar2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzxr[i];
    }
}
