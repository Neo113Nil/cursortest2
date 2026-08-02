package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzh implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = null;
        java.lang.String str2 = null;
        byte[] bArr = null;
        java.lang.String str3 = null;
        java.lang.String str4 = null;
        com.google.android.gms.tapandpay.firstparty.TokenStatus tokenStatus = null;
        java.lang.String str5 = null;
        android.net.Uri uri = null;
        com.google.android.gms.tapandpay.firstparty.zzau zzauVar = null;
        java.lang.String str6 = null;
        com.google.android.gms.tapandpay.firstparty.zzbo zzboVar = null;
        java.lang.String str7 = null;
        byte[] bArr2 = null;
        com.google.android.gms.tapandpay.firstparty.zzaq zzaqVar = null;
        com.google.android.gms.tapandpay.firstparty.zzao zzaoVar = null;
        java.lang.String str8 = null;
        com.google.android.gms.tapandpay.firstparty.zzay[] zzayVarArr = null;
        java.util.ArrayList arrayList = null;
        java.lang.String str9 = null;
        java.lang.String str10 = null;
        com.google.android.gms.tapandpay.firstparty.zzi zziVar = null;
        java.lang.String str11 = null;
        java.lang.String str12 = null;
        java.util.ArrayList<java.lang.Integer> arrayList2 = null;
        com.google.android.gms.tapandpay.firstparty.zzbf zzbfVar = null;
        java.lang.String str13 = null;
        java.lang.String str14 = null;
        java.lang.String str15 = null;
        byte[] bArr3 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 0;
        boolean z5 = false;
        int i8 = 0;
        boolean z6 = false;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    bArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 4:
                    str3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    str4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    tokenStatus = (com.google.android.gms.tapandpay.firstparty.TokenStatus) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.tapandpay.firstparty.TokenStatus.CREATOR);
                    break;
                case 8:
                    str5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    uri = (android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, android.net.Uri.CREATOR);
                    break;
                case 10:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 11:
                    i3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 12:
                    zzauVar = (com.google.android.gms.tapandpay.firstparty.zzau) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.tapandpay.firstparty.zzau.CREATOR);
                    break;
                case 13:
                    str6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 14:
                case 19:
                case 46:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 15:
                    zzboVar = (com.google.android.gms.tapandpay.firstparty.zzbo) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.tapandpay.firstparty.zzbo.CREATOR);
                    break;
                case 16:
                    str7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 17:
                    bArr2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 18:
                    i4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 20:
                    i5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 21:
                    i6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 22:
                    zzaqVar = (com.google.android.gms.tapandpay.firstparty.zzaq) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.tapandpay.firstparty.zzaq.CREATOR);
                    break;
                case 23:
                    zzaoVar = (com.google.android.gms.tapandpay.firstparty.zzao) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.tapandpay.firstparty.zzao.CREATOR);
                    break;
                case 24:
                    str8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 25:
                    zzayVarArr = (com.google.android.gms.tapandpay.firstparty.zzay[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, readHeader, com.google.android.gms.tapandpay.firstparty.zzay.CREATOR);
                    break;
                case 26:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 27:
                    arrayList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, readHeader, com.google.android.gms.tapandpay.firstparty.zzf.CREATOR);
                    break;
                case 28:
                    z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 29:
                    z3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 30:
                    j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 31:
                    j2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 32:
                    z4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 33:
                    j3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 34:
                    str9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 35:
                    str10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 36:
                    zziVar = (com.google.android.gms.tapandpay.firstparty.zzi) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.tapandpay.firstparty.zzi.CREATOR);
                    break;
                case 37:
                    i7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 38:
                    z5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 39:
                    str11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 40:
                    i8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 41:
                    z6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 42:
                    j4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 43:
                    str12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 44:
                    i9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 45:
                    str2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 47:
                    arrayList2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntegerList(parcel, readHeader);
                    break;
                case 48:
                    zzbfVar = (com.google.android.gms.tapandpay.firstparty.zzbf) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.tapandpay.firstparty.zzbf.CREATOR);
                    break;
                case 49:
                    str13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 50:
                    str14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 51:
                    str15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 52:
                    j5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 53:
                    i10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 54:
                    i11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 55:
                    i12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 56:
                    bArr3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.tapandpay.firstparty.CardInfo(str, str2, bArr, str3, str4, i, tokenStatus, str5, uri, i2, i3, zzauVar, str6, zzboVar, str7, bArr2, i4, i5, i6, zzaqVar, zzaoVar, str8, zzayVarArr, z, arrayList, z2, z3, j, j2, z4, j3, str9, str10, zziVar, i7, z5, str11, i8, z6, j4, str12, i9, arrayList2, zzbfVar, str13, str14, str15, j5, i10, i11, i12, bArr3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.tapandpay.firstparty.CardInfo[i];
    }
}
