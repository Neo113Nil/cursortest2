package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
final class zzemy {
    public final I3.b zza;
    private final long zzb;
    private final p090m3.a zzc;

    public zzemy(I3.b bVar, long j, p090m3.a aVar) {
        this.zza = bVar;
        this.zzc = aVar;
        ((p090m3.b) aVar).getClass();
        this.zzb = SystemClock.elapsedRealtime() + j;
    }

    public final boolean zza() {
        p090m3.a aVar = this.zzc;
        long j = this.zzb;
        ((p090m3.b) aVar).getClass();
        return j < SystemClock.elapsedRealtime();
    }
}
