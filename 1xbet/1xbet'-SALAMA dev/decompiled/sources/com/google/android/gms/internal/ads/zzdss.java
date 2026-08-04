package com.google.android.gms.internal.ads;

import E2.o;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
final class zzdss implements zzgay {
    final /* synthetic */ zzdsu zza;

    public zzdss(zzdsu zzdsuVar) {
        this.zza = zzdsuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        synchronized (this) {
            this.zza.zzc = true;
            zzdsu zzdsuVar = this.zza;
            o.f1952C.j.getClass();
            zzdsuVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (SystemClock.elapsedRealtime() - this.zza.zzd));
            this.zza.zze.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzb(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            this.zza.zzc = true;
            zzdsu zzdsuVar = this.zza;
            o.f1952C.j.getClass();
            zzdsuVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (SystemClock.elapsedRealtime() - this.zza.zzd));
            this.zza.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsr
                @Override // java.lang.Runnable
                public final void run() {
                    zzdsu.zzo(this.zza.zza, str);
                }
            });
        }
    }
}
