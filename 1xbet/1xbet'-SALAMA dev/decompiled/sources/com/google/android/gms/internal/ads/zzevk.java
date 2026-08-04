package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;

/* JADX INFO: loaded from: classes.dex */
final class zzevk implements zzgay {
    final /* synthetic */ zzejs zza;
    final /* synthetic */ zzffy zzb;
    final /* synthetic */ zzffn zzc;
    final /* synthetic */ zzevl zzd;
    final /* synthetic */ zzevn zze;

    public zzevk(zzevn zzevnVar, zzejs zzejsVar, zzffy zzffyVar, zzffn zzffnVar, zzevl zzevlVar) {
        this.zza = zzejsVar;
        this.zzb = zzffyVar;
        this.zzc = zzffnVar;
        this.zzd = zzevlVar;
        this.zze = zzevnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        zzffy zzffyVar;
        zzbbp zzbbpVar = zzbby.zzfL;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            J.l("App open ad failed to load", th);
        }
        zzcmz zzcmzVar = (zzcmz) this.zze.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzcmzVar == null ? zzfcb.zzb(th, null) : zzcmzVar.zzb().zza(th);
        synchronized (this.zze) {
            try {
                this.zze.zzj = null;
                if (zzcmzVar != null) {
                    zzcmzVar.zzc().zzdz(zzeVarZzb);
                    if (((Boolean) c0254t.f2726c.zzb(zzbby.zzih)).booleanValue()) {
                        this.zze.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevj
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zze.zzd.zzdz(zzeVarZzb);
                            }
                        });
                    }
                } else {
                    this.zze.zzd.zzdz(zzeVarZzb);
                    ((zzcmz) this.zze.zzm(this.zzd).zzh()).zzb().zzc().zzh();
                }
                zzfbx.zzb(zzeVarZzb.f10720a, th, "AppOpenAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbdr.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                    zzfgb zzfgbVar = this.zze.zzh;
                    zzffn zzffnVar = this.zzc;
                    zzffnVar.zza(zzeVarZzb);
                    zzffnVar.zzh(th);
                    zzffnVar.zzg(false);
                    zzfgbVar.zzc(zzffnVar.zzm());
                } else {
                    zzffyVar.zzc(zzeVarZzb);
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
        zzcpw zzcpwVar = (zzcpw) obj;
        synchronized (this.zze) {
            try {
                this.zze.zzj = null;
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzih)).booleanValue()) {
                    zzcpwVar.zzn().zzb(this.zze.zzd);
                }
                this.zza.zzb(zzcpwVar);
                if (!((Boolean) zzbdr.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                    zzfgb zzfgbVar = this.zze.zzh;
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
