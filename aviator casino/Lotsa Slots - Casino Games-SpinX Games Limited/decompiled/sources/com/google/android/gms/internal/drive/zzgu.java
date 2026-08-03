package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzgu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgu> CREATOR = new com.google.android.gms.internal.drive.zzgv();
    private final com.google.android.gms.internal.drive.zzei zzhw;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzhw, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzgu(com.google.android.gms.internal.drive.zzei zzeiVar) {
        this.zzhw = zzeiVar;
    }
}
