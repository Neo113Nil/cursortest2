package com.google.android.gms.fido.u2f.api.common;

/* loaded from: classes8.dex */
public final class zzk implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.Integer num = null;
        java.lang.Double d = null;
        android.net.Uri uri = null;
        byte[] bArr = null;
        java.util.ArrayList arrayList = null;
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue channelIdValue = null;
        java.lang.String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    num = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(parcel, readHeader);
                    break;
                case 3:
                    d = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDoubleObject(parcel, readHeader);
                    break;
                case 4:
                    uri = (android.net.Uri) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, android.net.Uri.CREATOR);
                    break;
                case 5:
                    bArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 6:
                    arrayList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, readHeader, com.google.android.gms.fido.u2f.api.common.RegisteredKey.CREATOR);
                    break;
                case 7:
                    channelIdValue = (com.google.android.gms.fido.u2f.api.common.ChannelIdValue) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.u2f.api.common.ChannelIdValue.CREATOR);
                    break;
                case 8:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.fido.u2f.api.common.SignRequestParams(num, d, uri, bArr, arrayList, channelIdValue, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.fido.u2f.api.common.SignRequestParams[i];
    }
}
