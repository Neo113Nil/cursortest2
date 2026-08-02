package com.google.android.gms.internal.mlkit_vision_barcode;

/* loaded from: classes8.dex */
public final class zzy implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.internal.mlkit_vision_barcode.zzp zzpVar = null;
        java.lang.String str = null;
        java.lang.String str2 = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzq[] zzqVarArr = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzn[] zznVarArr = null;
        java.lang.String[] strArr = null;
        com.google.android.gms.internal.mlkit_vision_barcode.zzi[] zziVarArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    zzpVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzp) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzp.CREATOR);
                    break;
                case 3:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    zzqVarArr = (com.google.android.gms.internal.mlkit_vision_barcode.zzq[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzq.CREATOR);
                    break;
                case 6:
                    zznVarArr = (com.google.android.gms.internal.mlkit_vision_barcode.zzn[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzn.CREATOR);
                    break;
                case 7:
                    strArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(parcel, readHeader);
                    break;
                case 8:
                    zziVarArr = (com.google.android.gms.internal.mlkit_vision_barcode.zzi[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, readHeader, com.google.android.gms.internal.mlkit_vision_barcode.zzi.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzl(zzpVar, str, str2, zzqVarArr, zznVarArr, strArr, zziVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.internal.mlkit_vision_barcode.zzl[i];
    }
}
