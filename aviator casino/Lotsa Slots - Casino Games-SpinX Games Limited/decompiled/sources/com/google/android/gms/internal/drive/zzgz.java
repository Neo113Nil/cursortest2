package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzgz extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgz> CREATOR = new com.google.android.gms.internal.drive.zzha();
    private final java.util.List<java.lang.String> zziu;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 2, this.zziu, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzgz(java.util.List<java.lang.String> list) {
        this.zziu = list;
    }
}
