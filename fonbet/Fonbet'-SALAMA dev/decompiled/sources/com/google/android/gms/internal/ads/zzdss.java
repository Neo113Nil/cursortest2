package com.google.android.gms.internal.ads;

import E2.o;
import android.os.SystemClock;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzdss implements zzgay {
    final /* synthetic */ zzdsu zza;

    public zzdss(zzdsu zzdsuVar) {
        this.zza = zzdsuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        long j;
        zzbzf zzbzfVar;
        synchronized (this) {
            this.zza.zzc = true;
            zzdsu zzdsuVar = this.zza;
            o.f1952C.j.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j = this.zza.zzd;
            zzdsuVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j));
            zzbzfVar = this.zza.zze;
            zzbzfVar.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzb(Object obj) {
        long j;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdsu zzdsuVar = this.zza;
            o.f1952C.j.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j = this.zza.zzd;
            zzdsuVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j));
            executor = this.zza.zzi;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsr
                @Override // java.lang.Runnable
                public final void run() {
                    zzdsu.zzo(zzdss.this.zza, str);
                }
            });
        }
    }
}
