package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzv implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        java.lang.String str = null;
        java.lang.String str2 = null;
        android.graphics.Point[] pointArr = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzn zznVar = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzq zzqVar = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzr zzrVar = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzt zztVar = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzs zzsVar = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzo zzoVar = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzk zzkVar = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzl zzlVar = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzm zzmVar = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 3:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 6:
                    pointArr = (android.graphics.Point[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, readHeader, android.graphics.Point.CREATOR);
                    break;
                case 7:
                    zznVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzn) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzn.CREATOR);
                    break;
                case 8:
                    zzqVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzq) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzq.CREATOR);
                    break;
                case 9:
                    zzrVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzr) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzr.CREATOR);
                    break;
                case 10:
                    zztVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzt) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzt.CREATOR);
                    break;
                case 11:
                    zzsVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzs) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzs.CREATOR);
                    break;
                case 12:
                    zzoVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzo) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzo.CREATOR);
                    break;
                case 13:
                    zzkVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzk) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzk.CREATOR);
                    break;
                case 14:
                    zzlVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzl) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzl.CREATOR);
                    break;
                case 15:
                    zzmVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzm) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzm.CREATOR);
                    break;
                case 16:
                    bArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 17:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 18:
                    d = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzu(i, str, str2, i2, pointArr, zznVar, zzqVar, zzrVar, zztVar, zzsVar, zzoVar, zzkVar, zzlVar, zzmVar, bArr, z, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzu[i];
    }
}
