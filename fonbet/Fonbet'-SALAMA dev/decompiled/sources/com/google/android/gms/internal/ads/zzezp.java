package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzezp implements zzgay {
    final /* synthetic */ zzejs zza;
    final /* synthetic */ zzffy zzb;
    final /* synthetic */ zzffn zzc;
    final /* synthetic */ zzezq zzd;
    final /* synthetic */ zzezs zze;

    public zzezp(zzezs zzezsVar, zzejs zzejsVar, zzffy zzffyVar, zzffn zzffnVar, zzezq zzezqVar) {
        this.zza = zzejsVar;
        this.zzb = zzffyVar;
        this.zzc = zzffnVar;
        this.zzd = zzezqVar;
        this.zze = zzezsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        zzexw zzexwVar;
        zzezi zzeziVar;
        zzdmy zzk;
        zzfgb zzfgbVar;
        zzffy zzffyVar;
        Executor executor;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfL)).booleanValue()) {
            J.l("Rewarded ad failed to load", th);
        }
        zzexwVar = this.zze.zze;
        zzdmz zzdmzVar = (zzdmz) zzexwVar.zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzdmzVar == null ? zzfcb.zzb(th, null) : zzdmzVar.zzb().zza(th);
        synchronized (this.zze) {
            try {
                if (zzdmzVar != null) {
                    zzdmzVar.zza().zzdz(zzb);
                    executor = this.zze.zzb;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezn
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzezi zzeziVar2;
                            zzeziVar2 = zzezp.this.zze.zzd;
                            zzeziVar2.zzdz(zzb);
                        }
                    });
                } else {
                    zzeziVar = this.zze.zzd;
                    zzeziVar.zzdz(zzb);
                    zzk = this.zze.zzk(this.zzd);
                    zzk.zzh().zzb().zzc().zzh();
                }
                zzfbx.zzb(zzb.f10720a, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbdr.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                    zzfgbVar = this.zze.zzg;
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
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzezi zzeziVar;
        Executor executor;
        final zzezi zzeziVar2;
        zzezi zzeziVar3;
        zzfgb zzfgbVar;
        zzffy zzffyVar;
        zzdmu zzdmuVar = (zzdmu) obj;
        synchronized (this.zze) {
            try {
                zzcyw zzn = zzdmuVar.zzn();
                zzeziVar = this.zze.zzd;
                zzn.zzd(zzeziVar);
                this.zza.zzb(zzdmuVar);
                zzezs zzezsVar = this.zze;
                executor = zzezsVar.zzb;
                zzeziVar2 = zzezsVar.zzd;
                Objects.requireNonNull(zzeziVar2);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezo
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzezi.this.zzs();
                    }
                });
                zzeziVar3 = this.zze.zzd;
                zzeziVar3.onAdMetadataChanged();
                if (!((Boolean) zzbdr.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                    zzfgbVar = this.zze.zzg;
                    zzffn zzffnVar = this.zzc;
                    zzffnVar.zzb(zzdmuVar.zzp().zzb);
                    zzffnVar.zzd(zzdmuVar.zzl().zzg());
                    zzffnVar.zzg(true);
                    zzfgbVar.zzc(zzffnVar.zzm());
                } else {
                    zzffyVar.zzg(zzdmuVar.zzp().zzb);
                    zzffyVar.zze(zzdmuVar.zzl().zzg());
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
