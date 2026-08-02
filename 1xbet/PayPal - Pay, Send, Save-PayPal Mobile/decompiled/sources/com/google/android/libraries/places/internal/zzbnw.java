package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbnw {
    private final com.google.android.libraries.places.internal.zzbnv zza;
    private final java.util.concurrent.ScheduledFuture zzb;

    /* synthetic */ zzbnw(com.google.android.libraries.places.internal.zzbnv zzbnvVar, java.util.concurrent.ScheduledFuture scheduledFuture, byte[] bArr) {
        this.zza = (com.google.android.libraries.places.internal.zzbnv) com.google.common.base.Preconditions.checkNotNull(zzbnvVar, "runnable");
        this.zzb = (java.util.concurrent.ScheduledFuture) com.google.common.base.Preconditions.checkNotNull(scheduledFuture, "future");
    }

    public final void zza() {
        this.zza.zzb = true;
        this.zzb.cancel(false);
    }

    public final boolean zzb() {
        com.google.android.libraries.places.internal.zzbnv zzbnvVar = this.zza;
        return (zzbnvVar.zzc || zzbnvVar.zzb) ? false : true;
    }
}
