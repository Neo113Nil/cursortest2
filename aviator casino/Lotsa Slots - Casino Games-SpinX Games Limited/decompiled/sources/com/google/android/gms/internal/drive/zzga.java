package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public final class zzga extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzga> CREATOR = new com.google.android.gms.internal.drive.zzgb();
    private final com.google.android.gms.internal.drive.zzgo zzil;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzil, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzga(com.google.android.gms.internal.drive.zzgo zzgoVar) {
        this.zzil = zzgoVar;
    }

    public final com.google.android.gms.drive.TransferPreferences zzax() {
        return this.zzil;
    }
}
