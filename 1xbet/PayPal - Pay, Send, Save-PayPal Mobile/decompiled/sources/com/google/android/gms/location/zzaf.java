package com.google.android.gms.location;

/* loaded from: classes8.dex */
public final class zzaf implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        android.os.WorkSource workSource = new android.os.WorkSource();
        com.google.android.gms.internal.identity.ClientIdentity clientIdentity = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        long j = -1;
        float f = 0.0f;
        int i3 = Integer.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        long j5 = 600000;
        long j6 = 3600000;
        int i4 = 102;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    j6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    j5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 4:
                case 14:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 5:
                    j2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 6:
                    i3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    f = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 8:
                    j4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 9:
                    z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 10:
                    j3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 11:
                    j = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 12:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 13:
                    i2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 15:
                    z2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 16:
                    workSource = (android.os.WorkSource) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, android.os.WorkSource.CREATOR);
                    break;
                case 17:
                    clientIdentity = (com.google.android.gms.internal.identity.ClientIdentity) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.identity.ClientIdentity.CREATOR);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.location.LocationRequest(i4, j6, j5, j4, j2, j3, i3, f, z, j, i, i2, z2, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.location.LocationRequest[i];
    }
}
