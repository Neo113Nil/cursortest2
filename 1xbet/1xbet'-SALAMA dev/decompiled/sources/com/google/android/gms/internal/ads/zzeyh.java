package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;

/* JADX INFO: loaded from: classes.dex */
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
        zzffy zzffyVar;
        zzbbp zzbbpVar = zzbby.zzfL;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            J.l("Interstitial ad failed to load", th);
        }
        final com.google.android.gms.ads.internal.client.zze zzeVarZza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            try {
                this.zze.zzi = null;
                this.zzd.zzb().zzdz(zzeVarZza);
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzii)).booleanValue()) {
                    this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyd
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzdz(zzeVarZza);
                        }
                    });
                    this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeye
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zze.zzdz(zzeVarZza);
                        }
                    });
                }
                zzfbx.zzb(zzeVarZza.f10720a, th, "InterstitialAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbdr.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                    zzfgb zzfgbVar = this.zze.zzg;
                    zzffn zzffnVar = this.zzc;
                    zzffnVar.zza(zzeVarZza);
                    zzffnVar.zzh(th);
                    zzffnVar.zzg(false);
                    zzfgbVar.zzc(zzffnVar.zzm());
                } else {
                    zzffyVar.zzc(zzeVarZza);
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
        zzffy zzffyVar;
        zzddn zzddnVar = (zzddn) obj;
        synchronized (this.zze) {
            try {
                this.zze.zzi = null;
                zzbbp zzbbpVar = zzbby.zzii;
                C0254t c0254t = C0254t.f2723d;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                    zzcyw zzcywVarZzn = zzddnVar.zzn();
                    zzcywVarZzn.zza(this.zze.zzd);
                    zzcywVarZzn.zzd(this.zze.zze);
                }
                this.zza.zzb(zzddnVar);
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                    this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyf
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzs();
                        }
                    });
                    this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyg
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zze.zzs();
                        }
                    });
                }
                if (!((Boolean) zzbdr.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                    zzfgb zzfgbVar = this.zze.zzg;
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
