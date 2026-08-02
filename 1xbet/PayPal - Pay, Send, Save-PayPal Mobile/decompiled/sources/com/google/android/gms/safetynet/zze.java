package com.google.android.gms.safetynet;

/* loaded from: classes8.dex */
public final class zze implements android.os.Parcelable.Creator<com.google.android.gms.safetynet.zzd> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.safetynet.zzd createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        com.google.android.gms.safetynet.HarmfulAppsData[] harmfulAppsDataArr = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
            } else if (fieldId == 3) {
                harmfulAppsDataArr = (com.google.android.gms.safetynet.HarmfulAppsData[]) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(parcel, readHeader, com.google.android.gms.safetynet.HarmfulAppsData.CREATOR);
            } else if (fieldId == 4) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId != 5) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.safetynet.zzd(j, harmfulAppsDataArr, i, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.safetynet.zzd[] newArray(int i) {
        return new com.google.android.gms.safetynet.zzd[i];
    }
}
