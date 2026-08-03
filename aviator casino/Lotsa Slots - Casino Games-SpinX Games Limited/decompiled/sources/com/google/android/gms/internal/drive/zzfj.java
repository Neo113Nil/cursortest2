package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzfj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzfj> CREATOR = new com.google.android.gms.internal.drive.zzfk();
    final com.google.android.gms.internal.drive.zzei zzhw;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzhw, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzfj(com.google.android.gms.internal.drive.zzei zzeiVar) {
        this.zzhw = zzeiVar;
    }

    public final com.google.android.gms.internal.drive.zzei zzas() {
        return this.zzhw;
    }
}
