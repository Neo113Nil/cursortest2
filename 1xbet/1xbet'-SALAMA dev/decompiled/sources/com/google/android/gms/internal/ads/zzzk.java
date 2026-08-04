package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzzk {
    public static final zzzd zza = new zzzd(2, -9223372036854775807L, null);
    public static final zzzd zzb = new zzzd(3, -9223372036854775807L, null);
    private final zzzs zzc = zzzq.zza(zzen.zzF("ExoPlayer:Loader:ProgressiveMediaPeriod"), new zzdd() { // from class: com.google.android.gms.internal.ads.zzzb
        @Override // com.google.android.gms.internal.ads.zzdd
        public final void zza(Object obj) {
            ((ExecutorService) obj).shutdown();
        }
    });
    private zzze zzd;
    private IOException zze;

    public zzzk(String str) {
    }

    public static zzzd zzb(boolean z4, long j) {
        return new zzzd(z4 ? 1 : 0, j, null);
    }

    public final long zza(zzzf zzzfVar, zzzc zzzcVar, int i7) {
        Looper looperMyLooper = Looper.myLooper();
        zzcv.zzb(looperMyLooper);
        this.zze = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzze(this, looperMyLooper, zzzfVar, zzzcVar, i7, jElapsedRealtime).zzc(0L);
        return jElapsedRealtime;
    }

    public final void zzg() {
        zzze zzzeVar = this.zzd;
        zzcv.zzb(zzzeVar);
        zzzeVar.zza(false);
    }

    public final void zzh() {
        this.zze = null;
    }

    public final void zzi(int i7) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzze zzzeVar = this.zzd;
        if (zzzeVar != null) {
            zzzeVar.zzb(i7);
        }
    }

    public final void zzj(zzzg zzzgVar) {
        zzze zzzeVar = this.zzd;
        if (zzzeVar != null) {
            zzzeVar.zza(true);
        }
        this.zzc.execute(new zzzh(zzzgVar));
        this.zzc.zza();
    }

    public final boolean zzk() {
        return this.zze != null;
    }

    public final boolean zzl() {
        return this.zzd != null;
    }
}
