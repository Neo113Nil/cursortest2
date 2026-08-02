package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzeh implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        long j = Long.MAX_VALUE;
        com.google.android.gms.location.LocationRequest locationRequest = null;
        java.util.ArrayList arrayList = null;
        java.lang.String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                locationRequest = (com.google.android.gms.location.LocationRequest) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.location.LocationRequest.CREATOR);
            } else if (fieldId == 5) {
                arrayList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, readHeader, com.google.android.gms.common.internal.ClientIdentity.CREATOR);
            } else if (fieldId == 8) {
                z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
            } else if (fieldId != 9) {
                switch (fieldId) {
                    case 11:
                        z3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 12:
                        z4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                        break;
                    case 13:
                        str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                        break;
                    case 14:
                        j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                        break;
                    default:
                        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                        break;
                }
            } else {
                z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.internal.identity.zzeg(locationRequest, arrayList, z, z2, z3, z4, str, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.internal.identity.zzeg[i];
    }
}
