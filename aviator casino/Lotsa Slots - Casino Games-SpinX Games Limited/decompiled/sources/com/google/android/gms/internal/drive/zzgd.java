package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzgd extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgd> CREATOR = new com.google.android.gms.internal.drive.zzge();
    private final java.util.List<java.lang.String> zzim;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 2, this.zzim, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzgd(java.util.List<java.lang.String> list) {
        this.zzim = list;
    }
}
