package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class zzoh extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<zzoh> CREATOR = new zzoi();
    public final String zza;
    public final long zzb;
    public final int zzc;

    public zzoh(String str, long j, int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int q = c.q(parcel, 20293);
        c.l(parcel, 1, str, false);
        long j = this.zzb;
        c.s(parcel, 2, 8);
        parcel.writeLong(j);
        int i2 = this.zzc;
        c.s(parcel, 3, 4);
        parcel.writeInt(i2);
        c.r(parcel, q);
    }
}
