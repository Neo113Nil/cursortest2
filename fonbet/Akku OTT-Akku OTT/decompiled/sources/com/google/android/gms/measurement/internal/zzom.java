package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class zzom extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<zzom> CREATOR = new zzon();
    public final long zza;
    public byte[] zzb;
    public final String zzc;
    public final Bundle zzd;
    public final int zze;
    public final long zzf;
    public String zzg;

    public zzom(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.zza = j;
        this.zzb = bArr;
        this.zzc = str;
        this.zzd = bundle;
        this.zze = i;
        this.zzf = j2;
        this.zzg = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.zza;
        int q = c.q(parcel, 20293);
        c.s(parcel, 1, 8);
        parcel.writeLong(j);
        c.c(parcel, 2, this.zzb, false);
        c.l(parcel, 3, this.zzc, false);
        c.b(parcel, 4, this.zzd, false);
        int i2 = this.zze;
        c.s(parcel, 5, 4);
        parcel.writeInt(i2);
        long j2 = this.zzf;
        c.s(parcel, 6, 8);
        parcel.writeLong(j2);
        c.l(parcel, 7, this.zzg, false);
        c.r(parcel, q);
    }
}
