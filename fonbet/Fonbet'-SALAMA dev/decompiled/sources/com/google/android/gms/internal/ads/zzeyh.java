package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzeyh implements zzgay {
    final /* synthetic */ zzejs zza;
    final /* synthetic */ zzffy zzb;
    final /* synthetic */ zzffn zzc;
    final /* synthetic */ zzder zzd;
    final /* synthetic */ zzeyi zze;

    public zzeyh(zzeyi zzeyiVar, zzejs zzejsVar, zzffy zzffyVar, zzffn zzffnVar, zzder zzderVar) {
        this.zza = zzejsVar;
        this.zzb = zzffyVar;
        this.zzc = zzffnVar;
        this.zzd = zzderVar;
        this.zze = zzeyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        zzfgb zzfgbVar;
        zzffy zzffyVar;
        Executor executor;
        Executor executor2;
        zzbbp zzbbpVar = zzbby.zzfL;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            J.l("Interstitial ad failed to load", th);
        }
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            try {
                this.zze.zzi = null;
                this.zzd.zzb().zzdz(zza);
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzii)).booleanValue()) {
                    executor = this.zze.zzb;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyd
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzejd zzejdVar;
                            zzejdVar = zzeyh.this.zze.zzd;
                            zzejdVar.zzdz(zza);
                        }
                    });
                    executor2 = this.zze.zzb;
                    executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeye
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzezi zzeziVar;
                            zzeziVar = zzeyh.this.zze.zze;
                            zzeziVar.zzdz(zza);
                        }
                    });
                }
                zzfbx.zzb(zza.f10720a, th, "InterstitialAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbdr.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                    zzfgbVar = this.zze.zzg;
                    zzffn zzffnVar = this.zzc;
                    zzffnVar.zza(zza);
                    zzffnVar.zzh(th);
                    zzffnVar.zzg(false);
                    zzfgbVar.zzc(zzffnVar.zzm());
                } else {
                    zzffyVar.zzc(zza);
                    zzffn zzffnVar2 = this.zzc;
                    zzffnVar2.zzh(th);
                    zzffnVar2.zzg(false);
                    zzffyVar.zza(zzffnVar2);
                    zzffyVar.zzh();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzb(Object obj) {
        zzfgb zzfgbVar;
        zzffy zzffyVar;
        Executor executor;
        Executor executor2;
        zzejd zzejdVar;
        zzezi zzeziVar;
        zzddn zzddnVar = (zzddn) obj;
        synchronized (this.zze) {
            try {
                this.zze.zzi = null;
                zzbbp zzbbpVar = zzbby.zzii;
                C0254t c0254t = C0254t.f2723d;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                    zzcyw zzn = zzddnVar.zzn();
                    zzejdVar = this.zze.zzd;
                    zzn.zza(zzejdVar);
                    zzeziVar = this.zze.zze;
                    zzn.zzd(zzeziVar);
                }
                this.zza.zzb(zzddnVar);
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                    executor = this.zze.zzb;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyf
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzejd zzejdVar2;
                            zzejdVar2 = zzeyh.this.zze.zzd;
                            zzejdVar2.zzs();
                        }
                    });
                    executor2 = this.zze.zzb;
                    executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzezi zzeziVar2;
                            zzeziVar2 = zzeyh.this.zze.zze;
                            zzeziVar2.zzs();
                        }
                    });
                }
                if (!((Boolean) zzbdr.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                    zzfgbVar = this.zze.zzg;
                    zzffn zzffnVar = this.zzc;
                    zzffnVar.zzb(zzddnVar.zzp().zzb);
                    zzffnVar.zzd(zzddnVar.zzl().zzg());
                    zzffnVar.zzg(true);
                    zzfgbVar.zzc(zzffnVar.zzm());
                } else {
                    zzffyVar.zzg(zzddnVar.zzp().zzb);
                    zzffyVar.zze(zzddnVar.zzl().zzg());
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
