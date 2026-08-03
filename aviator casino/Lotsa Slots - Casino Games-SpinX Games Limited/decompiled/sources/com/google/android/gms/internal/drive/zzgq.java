package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzgq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgq> CREATOR = new com.google.android.gms.internal.drive.zzgr();
    private final com.google.android.gms.drive.query.Query zzir;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzir, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzgq(com.google.android.gms.drive.query.Query query) {
        this.zzir = query;
    }
}
