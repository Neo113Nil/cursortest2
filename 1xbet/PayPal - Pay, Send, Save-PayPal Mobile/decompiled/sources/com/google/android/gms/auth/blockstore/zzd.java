package com.google.android.gms.auth.blockstore;

/* loaded from: classes8.dex */
public final class zzd implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        android.os.Bundle bundle = null;
        java.util.ArrayList arrayList = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                bundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, readHeader);
            } else if (fieldId != 2) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                arrayList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, readHeader, com.google.android.gms.auth.blockstore.RetrieveBytesResponse.BlockstoreData.CREATOR);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.auth.blockstore.RetrieveBytesResponse(bundle, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.auth.blockstore.RetrieveBytesResponse[i];
    }
}
