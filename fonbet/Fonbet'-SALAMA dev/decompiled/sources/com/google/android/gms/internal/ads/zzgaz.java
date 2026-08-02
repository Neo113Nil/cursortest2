package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
final class zzgaz implements Runnable {
    final Future zza;
    final zzgay zzb;

    public zzgaz(Future future, zzgay zzgayVar) {
        this.zza = future;
        this.zzb = zzgayVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Object obj = this.zza;
        if ((obj instanceof zzgcg) && (zza = zzgch.zza((zzgcg) obj)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzgbc.zzp(this.zza));
        } catch (ExecutionException e7) {
            this.zzb.zza(e7.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzftb zza = zzftd.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
