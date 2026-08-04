package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
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
        zzffy zzffyVar;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfL)).booleanValue()) {
            J.l("Rewarded ad failed to load", th);
        }
        zzdmz zzdmzVar = (zzdmz) this.zze.zze.zzd();
        final com.google.android.gms.ads.internal.client.zze zzeVarZzb = zzdmzVar == null ? zzfcb.zzb(th, null) : zzdmzVar.zzb().zza(th);
        synchronized (this.zze) {
            try {
                if (zzdmzVar != null) {
                    zzdmzVar.zza().zzdz(zzeVarZzb);
                    this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezn
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzdz(zzeVarZzb);
                        }
                    });
                } else {
                    this.zze.zzd.zzdz(zzeVarZzb);
                    this.zze.zzk(this.zzd).zzh().zzb().zzc().zzh();
                }
                zzfbx.zzb(zzeVarZzb.f10720a, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbdr.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                    zzfgb zzfgbVar = this.zze.zzg;
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
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzffy zzffyVar;
        zzdmu zzdmuVar = (zzdmu) obj;
        synchronized (this.zze) {
            try {
                zzdmuVar.zzn().zzd(this.zze.zzd);
                this.zza.zzb(zzdmuVar);
                zzezs zzezsVar = this.zze;
                Executor executor = zzezsVar.zzb;
                final zzezi zzeziVar = zzezsVar.zzd;
                Objects.requireNonNull(zzeziVar);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezo
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeziVar.zzs();
                    }
                });
                this.zze.zzd.onAdMetadataChanged();
                if (!((Boolean) zzbdr.zzc.zze()).booleanValue() || (zzffyVar = this.zzb) == null) {
                    zzfgb zzfgbVar = this.zze.zzg;
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
