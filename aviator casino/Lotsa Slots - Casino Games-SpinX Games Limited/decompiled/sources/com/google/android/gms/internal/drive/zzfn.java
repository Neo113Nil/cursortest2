package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzfn extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzfn> CREATOR = new com.google.android.gms.internal.drive.zzfo();
    com.google.android.gms.drive.DriveId zzdd;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzdd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzfn(com.google.android.gms.drive.DriveId driveId) {
        this.zzdd = driveId;
    }

    public final com.google.android.gms.drive.DriveId getDriveId() {
        return this.zzdd;
    }
}
