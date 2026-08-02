package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzej implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.internal.identity.zzeg zzegVar = null;
        android.os.IBinder iBinder = null;
        android.os.IBinder iBinder2 = null;
        android.app.PendingIntent pendingIntent = null;
        android.os.IBinder iBinder3 = null;
        java.lang.String str = null;
        int i = 1;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    zzegVar = (com.google.android.gms.internal.identity.zzeg) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.internal.identity.zzeg.CREATOR);
                    break;
                case 3:
                    iBinder = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 4:
                    pendingIntent = (android.app.PendingIntent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, android.app.PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 6:
                    iBinder3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 7:
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 8:
                    str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.internal.identity.zzei(i, zzegVar, iBinder, iBinder2, pendingIntent, iBinder3, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.internal.identity.zzei[i];
    }
}
