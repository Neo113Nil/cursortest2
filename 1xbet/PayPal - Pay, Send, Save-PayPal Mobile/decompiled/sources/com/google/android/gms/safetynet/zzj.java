package com.google.android.gms.safetynet;

/* loaded from: classes8.dex */
public final class zzj implements android.os.Parcelable.Creator<com.google.android.gms.safetynet.SafeBrowsingData> {
    static void zza(com.google.android.gms.safetynet.SafeBrowsingData safeBrowsingData, android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, safeBrowsingData.getMetadata(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, safeBrowsingData.getListsDataHolder(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, safeBrowsingData.getFileDescriptor(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, safeBrowsingData.getLastUpdateTimeMs());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 6, safeBrowsingData.getState(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.safetynet.SafeBrowsingData createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = null;
        com.google.android.gms.common.data.DataHolder dataHolder = null;
        android.os.ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 3) {
                dataHolder = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.common.data.DataHolder.CREATOR);
            } else if (fieldId == 4) {
                parcelFileDescriptor = (android.os.ParcelFileDescriptor) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, android.os.ParcelFileDescriptor.CREATOR);
            } else if (fieldId == 5) {
                j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
            } else if (fieldId != 6) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                bArr = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.safetynet.SafeBrowsingData(str, dataHolder, parcelFileDescriptor, j, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.safetynet.SafeBrowsingData[] newArray(int i) {
        return new com.google.android.gms.safetynet.SafeBrowsingData[i];
    }
}
