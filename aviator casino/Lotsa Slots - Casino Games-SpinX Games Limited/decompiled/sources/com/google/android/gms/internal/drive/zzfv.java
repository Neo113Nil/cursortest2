package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzfv extends com.google.android.gms.drive.zzu {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzfv> CREATOR = new com.google.android.gms.internal.drive.zzfw();
    final com.google.android.gms.common.data.DataHolder zzij;

    @Override // com.google.android.gms.drive.zzu
    protected final void zza(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzij, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzfv(com.google.android.gms.common.data.DataHolder dataHolder) {
        this.zzij = dataHolder;
    }

    public final com.google.android.gms.common.data.DataHolder zzav() {
        return this.zzij;
    }
}
