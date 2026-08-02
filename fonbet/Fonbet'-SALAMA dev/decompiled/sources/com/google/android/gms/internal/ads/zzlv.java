package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class zzlv implements zzkn {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzbb zzd = zzbb.zza;

    public zzlv(zzcz zzczVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final long zza() {
        long j = this.zzb;
        if (!this.zza) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzbb zzbbVar = this.zzd;
        return j + (zzbbVar.zzb == 1.0f ? zzen.zzs(elapsedRealtime) : zzbbVar.zza(elapsedRealtime));
    }

    public final void zzb(long j) {
        this.zzb = j;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final zzbb zzc() {
        return this.zzd;
    }

    public final void zzd() {
        if (this.zza) {
            return;
        }
        this.zzc = SystemClock.elapsedRealtime();
        this.zza = true;
    }

    public final void zze() {
        if (this.zza) {
            zzb(zza());
            this.zza = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zzg(zzbb zzbbVar) {
        if (this.zza) {
            zzb(zza());
        }
        this.zzd = zzbbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final /* synthetic */ boolean zzj() {
        return false;
    }
}
