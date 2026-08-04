package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
final class zzgaz implements Runnable {
    final Future zza;
    final zzgay zzb;

    public zzgaz(Future future, zzgay zzgayVar) {
        this.zza = future;
        this.zzb = zzgayVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Object obj = this.zza;
        if ((obj instanceof zzgcg) && (thZza = zzgch.zza((zzgcg) obj)) != null) {
            this.zzb.zza(thZza);
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
        zzftb zzftbVarZza = zzftd.zza(this);
        zzftbVarZza.zza(this.zzb);
        return zzftbVarZza.toString();
    }
}
