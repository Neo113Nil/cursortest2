package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfje implements zzhcv {
    final /* synthetic */ zzeup zza;
    final /* synthetic */ zzfrg zzb;
    final /* synthetic */ zzfqw zzc;
    final /* synthetic */ zzdoe zzd;
    final /* synthetic */ zzfjg zze;

    zzfje(zzfjg zzfjgVar, zzeup zzeupVar, zzfrg zzfrgVar, zzfqw zzfqwVar, zzdoe zzdoeVar) {
        this.zza = zzeupVar;
        this.zzb = zzfrgVar;
        this.zzc = zzfqwVar;
        this.zzd = zzdoeVar;
        Objects.requireNonNull(zzfjgVar);
        this.zze = zzfjgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        zzfrg zzfrgVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgR)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th);
        }
        zzdoe zzdoeVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzg = zzdoeVar.zzb().zzg(th);
        zzfjg zzfjgVar = this.zze;
        synchronized (zzfjgVar) {
            zzfjgVar.zzi(null);
            zzdoeVar.zza().zzdJ(zzg);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjC)).booleanValue()) {
                zzfjgVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfje.this.zze.zzf().zzdJ(zzg);
                    }
                });
                zzfjgVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfje.this.zze.zzg().zzdJ(zzg);
                    }
                });
            }
            zzfmt.zza(zzg.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbla.zzc.zze()).booleanValue() || (zzfrgVar = this.zzb) == null) {
                zzfrj zzh = zzfjgVar.zzh();
                zzfqw zzfqwVar = this.zzc;
                zzfqwVar.zzh(zzg);
                zzfqwVar.zzj(th);
                zzfqwVar.zzd(false);
                zzh.zzb(zzfqwVar.zzm());
            } else {
                zzfrgVar.zzf(zzg);
                zzfqw zzfqwVar2 = this.zzc;
                zzfqwVar2.zzj(th);
                zzfqwVar2.zzd(false);
                zzfrgVar.zza(zzfqwVar2);
                zzfrgVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfrg zzfrgVar;
        zzfjg zzfjgVar = this.zze;
        zzdmx zzdmxVar = (zzdmx) obj;
        synchronized (zzfjgVar) {
            if (zzdmxVar != null) {
                zzdmxVar.zzt();
            }
            zzfjgVar.zzi(null);
            zzbix zzbixVar = zzbjg.zzjC;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
                zzdhf zzq = zzdmxVar.zzq();
                zzq.zza(zzfjgVar.zzf());
                zzq.zzd(zzfjgVar.zzg());
            }
            this.zza.zzb(zzdmxVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
                zzfjgVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfjd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfje.this.zze.zzf().zzg();
                    }
                });
                zzfjgVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfja
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfje.this.zze.zzg().zzg();
                    }
                });
            }
            if (!((Boolean) zzbla.zzc.zze()).booleanValue() || (zzfrgVar = this.zzb) == null) {
                zzfrj zzh = zzfjgVar.zzh();
                zzfqw zzfqwVar = this.zzc;
                zzfqwVar.zzg(zzdmxVar.zzr().zzb);
                zzfqwVar.zzi(zzdmxVar.zzn().zze());
                zzfqwVar.zzd(true);
                zzh.zzb(zzfqwVar.zzm());
            } else {
                zzfrgVar.zze(zzdmxVar.zzr().zzb);
                zzfrgVar.zzg(zzdmxVar.zzn().zze());
                zzfqw zzfqwVar2 = this.zzc;
                zzfqwVar2.zzd(true);
                zzfrgVar.zza(zzfqwVar2);
                zzfrgVar.zzh();
            }
        }
    }
}
