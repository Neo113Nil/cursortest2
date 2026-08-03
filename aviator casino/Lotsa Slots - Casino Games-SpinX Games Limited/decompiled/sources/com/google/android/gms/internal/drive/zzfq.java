package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzfq implements android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzfp> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzfp[] newArray(int i) {
        return new com.google.android.gms.internal.drive.zzfp[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.internal.drive.zzfp createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.drive.events.ChangeEvent changeEvent = null;
        com.google.android.gms.drive.events.CompletionEvent completionEvent = null;
        com.google.android.gms.drive.events.zzo zzoVar = null;
        com.google.android.gms.drive.events.zzb zzbVar = null;
        com.google.android.gms.drive.events.zzv zzvVar = null;
        com.google.android.gms.drive.events.zzr zzrVar = null;
        int i = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 2) {
                i = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 3) {
                changeEvent = (com.google.android.gms.drive.events.ChangeEvent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.drive.events.ChangeEvent.CREATOR);
            } else if (fieldId == 5) {
                completionEvent = (com.google.android.gms.drive.events.CompletionEvent) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.drive.events.CompletionEvent.CREATOR);
            } else if (fieldId == 6) {
                zzoVar = (com.google.android.gms.drive.events.zzo) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.drive.events.zzo.CREATOR);
            } else if (fieldId == 7) {
                zzbVar = (com.google.android.gms.drive.events.zzb) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.drive.events.zzb.CREATOR);
            } else if (fieldId == 9) {
                zzvVar = (com.google.android.gms.drive.events.zzv) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.drive.events.zzv.CREATOR);
            } else if (fieldId == 10) {
                zzrVar = (com.google.android.gms.drive.events.zzr) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.drive.events.zzr.CREATOR);
            } else {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.internal.drive.zzfp(i, changeEvent, completionEvent, zzoVar, zzbVar, zzvVar, zzrVar);
    }
}
