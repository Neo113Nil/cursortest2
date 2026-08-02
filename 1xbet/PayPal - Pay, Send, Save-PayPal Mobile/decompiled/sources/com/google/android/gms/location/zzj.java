package com.google.android.gms.location;

/* loaded from: classes8.dex */
public final class zzj implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        android.os.WorkSource workSource = new android.os.WorkSource();
        com.google.android.gms.internal.identity.ClientIdentity clientIdentity = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        int i3 = 102;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 2:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 3:
                    i3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    j2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 5:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 6:
                    workSource = (android.os.WorkSource) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, android.os.WorkSource.CREATOR);
                    break;
                case 7:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 9:
                    clientIdentity = (com.google.android.gms.internal.identity.ClientIdentity) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.identity.ClientIdentity.CREATOR);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.location.CurrentLocationRequest(j, i, i3, j2, z, i2, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.location.CurrentLocationRequest[i];
    }
}
