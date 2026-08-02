package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class zzdd extends a {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();
    public final long zza;
    public final long zzb;
    public final boolean zzc;

    @Nullable
    public final Bundle zzd;

    @Nullable
    public final String zze;

    public zzdd(long j, long j2, boolean z, @Nullable Bundle bundle, @Nullable String str) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = z;
        this.zzd = bundle;
        this.zze = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.zza;
        int q = c.q(parcel, 20293);
        c.s(parcel, 1, 8);
        parcel.writeLong(j);
        long j2 = this.zzb;
        c.s(parcel, 2, 8);
        parcel.writeLong(j2);
        boolean z = this.zzc;
        c.s(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        c.b(parcel, 7, this.zzd, false);
        c.l(parcel, 8, this.zze, false);
        c.r(parcel, q);
    }
}
