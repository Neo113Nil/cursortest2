package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzhb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzhb> CREATOR = new com.google.android.gms.internal.drive.zzhc();
    private final com.google.android.gms.drive.DriveId zzdd;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzdd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzhb(com.google.android.gms.drive.DriveId driveId) {
        this.zzdd = driveId;
    }
}
