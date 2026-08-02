package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
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
        zzexw zzexwVar;
        zzewd zzewdVar;
        zzctv zzm;
        zzfgb zzfgbVar;
        zzffy zzffyVar;
        Executor executor;
        zzbbp zzbbpVar = zzbby.zzfL;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            J.l("App open ad failed to load", th);
        }
        zzexwVar = this.zze.zze;
        zzcmz zzcmzVar = (zzcmz) zzexwVar.zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzcmzVar == null ? zzfcb.zzb(th, null) : zzcmzVar.zzb().zza(th);
        synchronized (this.zze) {
            try {
                this.zze.zzj = null;
                if (zzcmzVar != null) {
                    zzcmzVar.zzc().zzdz(zzb);
                    if (((Boolean) c0254t.f2726c.zzb(zzbby.zzih)).booleanValue()) {
                        executor = this.zze.zzc;
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevj
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzewd zzewdVar2;
                                zzewdVar2 = zzevk.this.zze.zzd;
                                zzewdVar2.zzdz(zzb);
                            }
                        });
                    }
                } else {
                    zzewdVar = this.zze.zzd;
                    zzewdVar.zzdz(zzb);
                    zzm = this.zze.zzm(this.zzd);
                    ((zzcmz) zzm.zzh()).zzb().zzc().zzh();
                }
                zzfbx.zzb(zzb.f10720a, th, "AppOpenAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbdr.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                    zzfgbVar = this.zze.zzh;
                    zzffn zzffnVar = this.zzc;
                    zzffnVar.zza(zzb);
                    zzffnVar.zzh(th);
                    zzffnVar.zzg(false);
                    zzfgbVar.zzc(zzffnVar.zzm());
                } else {
                    zzffyVar.zzc(zzb);
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
        zzewd zzewdVar;
        zzcpw zzcpwVar = (zzcpw) obj;
        synchronized (this.zze) {
            try {
                this.zze.zzj = null;
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzih)).booleanValue()) {
                    zzcyw zzn = zzcpwVar.zzn();
                    zzewdVar = this.zze.zzd;
                    zzn.zzb(zzewdVar);
                }
                this.zza.zzb(zzcpwVar);
                if (!((Boolean) zzbdr.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                    zzfgbVar = this.zze.zzh;
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
