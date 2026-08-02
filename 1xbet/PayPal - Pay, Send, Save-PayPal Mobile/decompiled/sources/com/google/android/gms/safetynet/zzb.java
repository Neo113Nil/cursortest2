package com.google.android.gms.safetynet;

/* loaded from: classes8.dex */
public final class zzb implements android.os.Parcelable.Creator<com.google.android.gms.safetynet.zza> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.safetynet.zza createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        java.lang.String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            if (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader) != 2) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.safetynet.zza(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ com.google.android.gms.safetynet.zza[] newArray(int i) {
        return new com.google.android.gms.safetynet.zza[i];
    }
}
