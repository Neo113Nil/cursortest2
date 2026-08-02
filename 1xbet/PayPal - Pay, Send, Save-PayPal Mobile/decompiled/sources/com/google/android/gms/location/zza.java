package com.google.android.gms.location;

/* loaded from: classes8.dex */
public final class zza {
    private long zza = Long.MIN_VALUE;

    public final com.google.android.gms.location.zza zza(long j) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0, "intervalMillis can't be negative.");
        this.zza = j;
        return this;
    }

    public final com.google.android.gms.location.zzb zzb() {
        com.google.android.gms.common.internal.Preconditions.checkState(this.zza != Long.MIN_VALUE, "Must set intervalMillis.");
        return new com.google.android.gms.location.zzb(this.zza, true, null, null, null, false, null, 0L, null);
    }
}
