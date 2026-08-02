package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;

/* loaded from: classes.dex */
final class zzewq implements zzgay {
    final /* synthetic */ zzffy zza;
    final /* synthetic */ zzffn zzb;
    final /* synthetic */ zzcot zzc;
    final /* synthetic */ zzewr zzd;

    public zzewq(zzewr zzewrVar, zzffy zzffyVar, zzffn zzffnVar, zzcot zzcotVar) {
        this.zza = zzffyVar;
        this.zzb = zzffnVar;
        this.zzc = zzcotVar;
        this.zzd = zzewrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        boolean z4;
        zzfgb zzfgbVar;
        zzffy zzffyVar;
        zzcxi zzcxiVar;
        zzczo zzczoVar;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfL)).booleanValue()) {
            J.l("Banner ad failed to load", th);
        }
        synchronized (this.zzd) {
            try {
                com.google.android.gms.ads.internal.client.zze zza = this.zzc.zzc().zza(th);
                this.zzd.zzn = zza;
                this.zzc.zze().zzdz(zza);
                zzfbx.zzb(zza.f10720a, th, "BannerAdLoader.onFailure");
                zzewr zzewrVar = this.zzd;
                z4 = zzewrVar.zzm;
                if (z4) {
                    zzewrVar.zzt();
                    zzewr zzewrVar2 = this.zzd;
                    zzcxiVar = zzewrVar2.zzh;
                    zzczoVar = zzewrVar2.zzj;
                    zzcxiVar.zzd(zzczoVar.zzc());
                }
                if (!((Boolean) zzbdr.zzc.zze()).booleanValue() || (zzffyVar = this.zza) == null) {
                    zzfgbVar = this.zzd.zzi;
                    zzffn zzffnVar = this.zzb;
                    zzffnVar.zza(zza);
                    zzffnVar.zzh(th);
                    zzffnVar.zzg(false);
                    zzfgbVar.zzc(zzffnVar.zzm());
                } else {
                    zzffyVar.zzc(zza);
                    zzffn zzffnVar2 = this.zzb;
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
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean z4;
        zzfgb zzfgbVar;
        zzffy zzffyVar;
        zzcnp zzcnpVar = (zzcnp) obj;
        synchronized (this.zzd) {
            try {
                zzewr zzewrVar = this.zzd;
                z4 = zzewrVar.zzm;
                if (z4) {
                    zzewrVar.zzq();
                }
                if (!((Boolean) zzbdr.zzc.zze()).booleanValue() || (zzffyVar = this.zza) == null) {
                    zzfgbVar = this.zzd.zzi;
                    zzffn zzffnVar = this.zzb;
                    zzffnVar.zzb(zzcnpVar.zzp().zzb);
                    zzffnVar.zzd(zzcnpVar.zzl().zzg());
                    zzffnVar.zzg(true);
                    zzfgbVar.zzc(zzffnVar.zzm());
                } else {
                    zzffyVar.zzg(zzcnpVar.zzp().zzb);
                    zzffyVar.zze(zzcnpVar.zzl().zzg());
                    zzffn zzffnVar2 = this.zzb;
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
