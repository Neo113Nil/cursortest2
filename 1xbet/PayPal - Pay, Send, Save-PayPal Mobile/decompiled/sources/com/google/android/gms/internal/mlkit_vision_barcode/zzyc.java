package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzyc implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = null;
        java.lang.String str2 = null;
        byte[] bArr = null;
        android.graphics.Point[] pointArr = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzxu zzxuVar = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzxx zzxxVar = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzxy zzxyVar = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzya zzyaVar = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzxz zzxzVar = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzxv zzxvVar = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzxr zzxrVar = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzxs zzxsVar = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzxt zzxtVar = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    bArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 5:
                    pointArr = (android.graphics.Point[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, readHeader, android.graphics.Point.CREATOR);
                    break;
                case 6:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    zzxuVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzxu) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzxu.CREATOR);
                    break;
                case 8:
                    zzxxVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzxx) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzxx.CREATOR);
                    break;
                case 9:
                    zzxyVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzxy) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzxy.CREATOR);
                    break;
                case 10:
                    zzyaVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzya) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzya.CREATOR);
                    break;
                case 11:
                    zzxzVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzxz) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzxz.CREATOR);
                    break;
                case 12:
                    zzxvVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzxv) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzxv.CREATOR);
                    break;
                case 13:
                    zzxrVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzxr) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzxr.CREATOR);
                    break;
                case 14:
                    zzxsVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzxs) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzxs.CREATOR);
                    break;
                case 15:
                    zzxtVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzxt) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzxt.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzyb(i, str, str2, bArr, pointArr, i2, zzxuVar, zzxxVar, zzxyVar, zzyaVar, zzxzVar, zzxvVar, zzxrVar, zzxsVar, zzxtVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzyb[i];
    }
}
