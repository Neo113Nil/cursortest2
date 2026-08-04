package com.google.android.gms.internal.ads;

import E2.e;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class zzehe implements e {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcuo zzb;
    private final zzcvi zzc;
    private final zzdcr zzd;
    private final zzdcj zze;
    private final zzcmk zzf;

    public zzehe(zzcuo zzcuoVar, zzcvi zzcviVar, zzdcr zzdcrVar, zzdcj zzdcjVar, zzcmk zzcmkVar) {
        this.zzb = zzcuoVar;
        this.zzc = zzcviVar;
        this.zzd = zzdcrVar;
        this.zze = zzdcjVar;
        this.zzf = zzcmkVar;
    }

    @Override // E2.e
    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzr();
            this.zze.zza(view);
        }
    }

    @Override // E2.e
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // E2.e
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
