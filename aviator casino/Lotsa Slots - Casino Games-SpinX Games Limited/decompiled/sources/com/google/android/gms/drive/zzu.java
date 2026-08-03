package com.google.android.gms.drive;

/* loaded from: classes3.dex */
public abstract class zzu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    private volatile transient boolean zzbt = false;

    protected abstract void zza(android.os.Parcel parcel, int i);

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.Preconditions.checkState(!this.zzbt);
        this.zzbt = true;
        zza(parcel, i);
    }
}
