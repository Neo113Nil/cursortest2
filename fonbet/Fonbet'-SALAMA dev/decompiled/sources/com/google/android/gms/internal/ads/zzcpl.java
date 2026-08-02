package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzcpl implements zzcwe, zzaxx {
    private final zzfaf zza;
    private final zzcvi zzb;
    private final zzcwn zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcpl(zzfaf zzfafVar, zzcvi zzcviVar, zzcwn zzcwnVar) {
        this.zza = zzfafVar;
        this.zzb = zzcviVar;
        this.zzc = zzcwnVar;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    public final void zzdn(zzaxw zzaxwVar) {
        if (this.zza.zze == 1 && zzaxwVar.zzj) {
            zza();
        }
        if (zzaxwVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final synchronized void zzs() {
        if (this.zza.zze != 1) {
            zza();
        }
    }
}
