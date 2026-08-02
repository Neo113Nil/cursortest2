package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class TimeInterval extends a {

    @NonNull
    public static final Parcelable.Creator<TimeInterval> CREATOR = new zzl();
    long zza;
    long zzb;

    public TimeInterval() {
    }

    public long getEndTimestamp() {
        return this.zzb;
    }

    public long getStartTimestamp() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        long j = this.zza;
        c.s(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.zzb;
        c.s(parcel, 3, 8);
        parcel.writeLong(j2);
        c.r(parcel, q);
    }

    public TimeInterval(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }
}
