package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class zzaf extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzag();
    public final long zza;
    public final int zzb;
    public final long zzc;

    public zzaf(long j, int i, long j2) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.zza;
        int q = c.q(parcel, 20293);
        c.s(parcel, 1, 8);
        parcel.writeLong(j);
        int i2 = this.zzb;
        c.s(parcel, 2, 4);
        parcel.writeInt(i2);
        long j2 = this.zzc;
        c.s(parcel, 3, 8);
        parcel.writeLong(j2);
        c.r(parcel, q);
    }
}
