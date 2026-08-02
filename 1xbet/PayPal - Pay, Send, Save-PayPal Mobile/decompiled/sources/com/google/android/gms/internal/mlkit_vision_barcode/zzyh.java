package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzyh implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.internal.mlkit_vision_barcode.zzxw zzxwVar = null;
        java.lang.String str = null;
        java.lang.String str2 = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzxx[] zzxxVarArr = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzxu[] zzxuVarArr = null;
        java.lang.String[] strArr = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzxp[] zzxpVarArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    zzxwVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzxw) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzxw.CREATOR);
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    zzxxVarArr = (com.google.android.gms.internal.mlkit_vision_barcode.zzxx[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzxx.CREATOR);
                    break;
                case 5:
                    zzxuVarArr = (com.google.android.gms.internal.mlkit_vision_barcode.zzxu[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzxu.CREATOR);
                    break;
                case 6:
                    strArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(parcel, readHeader);
                    break;
                case 7:
                    zzxpVarArr = (com.google.android.gms.internal.mlkit_vision_barcode.zzxp[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzxp.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzxs(zzxwVar, str, str2, zzxxVarArr, zzxuVarArr, strArr, zzxpVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzxs[i];
    }
}
