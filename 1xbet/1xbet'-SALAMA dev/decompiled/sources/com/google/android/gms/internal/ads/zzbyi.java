package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
final class zzbyi {
    final /* synthetic */ zzbyj zza;
    private long zzb = -1;
    private long zzc = -1;

    public zzbyi(zzbyj zzbyjVar) {
        this.zza = zzbyjVar;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }

    public final void zzc() {
        ((p090m3.b) this.zza.zza).getClass();
        this.zzc = SystemClock.elapsedRealtime();
    }

    public final void zzd() {
        ((p090m3.b) this.zza.zza).getClass();
        this.zzb = SystemClock.elapsedRealtime();
    }
}
