package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;

/* loaded from: classes.dex */
final class zzejz implements zzgay {
    final /* synthetic */ zzejs zza;
    final /* synthetic */ zzffy zzb;
    final /* synthetic */ zzffn zzc;
    final /* synthetic */ zzdfn zzd;
    final /* synthetic */ zzeka zze;

    public zzejz(zzeka zzekaVar, zzejs zzejsVar, zzffy zzffyVar, zzffn zzffnVar, zzdfn zzdfnVar) {
        this.zza = zzejsVar;
        this.zzb = zzffyVar;
        this.zzc = zzffnVar;
        this.zzd = zzdfnVar;
        this.zze = zzekaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        zzcgb zzcgbVar;
        zzfgb zzfgbVar;
        zzffy zzffyVar;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfL)).booleanValue()) {
            J.l("Native ad failed to load", th);
        }
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        this.zzd.zzb().zzdz(zza);
        zzcgbVar = this.zze.zzb;
        zzcgbVar.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejy
            @Override // java.lang.Runnable
            public final void run() {
                zzejq zzejqVar;
                zzejqVar = zzejz.this.zze.zzd;
                zzejqVar.zza().zzdz(zza);
            }
        });
        zzfbx.zzb(zza.f10720a, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (((Boolean) zzbdr.zzc.zze()).booleanValue() && (zzffyVar = this.zzb) != null) {
            zzffyVar.zzc(zza);
            zzffn zzffnVar = this.zzc;
            zzffnVar.zzh(th);
            zzffnVar.zzg(false);
            zzffyVar.zza(zzffnVar);
            zzffyVar.zzh();
            return;
        }
        zzeka zzekaVar = this.zze;
        zzffn zzffnVar2 = this.zzc;
        zzfgbVar = zzekaVar.zze;
        zzffnVar2.zza(zza);
        zzffnVar2.zzh(th);
        zzffnVar2.zzg(false);
        zzfgbVar.zzc(zzffnVar2.zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzejq zzejqVar;
        zzcgb zzcgbVar;
        zzfgb zzfgbVar;
        zzffy zzffyVar;
        zzcpw zzcpwVar = (zzcpw) obj;
        synchronized (this.zze) {
            try {
                zzcyw zzn = zzcpwVar.zzn();
                zzejqVar = this.zze.zzd;
                zzn.zza(zzejqVar.zzd());
                this.zza.zzb(zzcpwVar);
                zzcgbVar = this.zze.zzb;
                zzcgbVar.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzejq zzejqVar2;
                        zzejqVar2 = zzejz.this.zze.zzd;
                        zzejqVar2.zzb().zzs();
                    }
                });
                if (!((Boolean) zzbdr.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                    zzfgbVar = this.zze.zze;
                    zzffn zzffnVar = this.zzc;
                    zzffnVar.zzb(zzcpwVar.zzp().zzb);
                    zzffnVar.zzd(zzcpwVar.zzl().zzg());
                    zzffnVar.zzg(true);
                    zzfgbVar.zzc(zzffnVar.zzm());
                } else {
                    zzffyVar.zzg(zzcpwVar.zzp().zzb);
                    zzffyVar.zze(zzcpwVar.zzl().zzg());
                    zzffn zzffnVar2 = this.zzc;
                    zzffnVar2.zzg(true);
                    zzffyVar.zza(zzffnVar2);
                    zzffyVar.zzh();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
