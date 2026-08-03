package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzfg implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzff> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzff[] newArray(int i) {
        return new com.google.android.gms.internal.drive.zzff[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzff createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.common.data.DataHolder dataHolder = null;
        java.util.ArrayList arrayList = null;
        com.google.android.gms.drive.zza zzaVar = null;
        boolean z = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                dataHolder = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.common.data.DataHolder.CREATOR);
            } else if (fieldId == 3) {
                arrayList = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(parcel, readHeader, com.google.android.gms.drive.DriveId.CREATOR);
            } else if (fieldId == 4) {
                zzaVar = (com.google.android.gms.drive.zza) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.drive.zza.CREATOR);
            } else if (fieldId == 5) {
                z = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, readHeader);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.internal.drive.zzff(dataHolder, arrayList, zzaVar, z);
    }
}
