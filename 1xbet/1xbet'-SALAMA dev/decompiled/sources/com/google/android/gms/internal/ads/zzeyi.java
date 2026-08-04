package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzeyi implements zzejt {
    private final Context zza;
    private final Executor zzb;
    private final zzcgb zzc;
    private final zzejd zzd;
    private final zzezi zze;
    private zzbct zzf;
    private final zzfgb zzg;
    private final zzfay zzh;
    private I3.b zzi;

    public zzeyi(Context context, Executor executor, zzcgb zzcgbVar, zzejd zzejdVar, zzezi zzeziVar, zzfay zzfayVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgbVar;
        this.zzd = zzejdVar;
        this.zzh = zzfayVar;
        this.zze = zzeziVar;
        this.zzg = zzcgbVar.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzejt
    public final boolean zza() {
        I3.b bVar = this.zzi;
        return (bVar == null || bVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzejt
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzejr zzejrVar, zzejs zzejsVar) {
        zzder zzderVarZzf;
        zzffy zzffyVar;
        if (str == null) {
            int i7 = J.f3546b;
            j.d("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyc
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.zzdz(zzfcb.zzd(6, null, null));
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        zzbbp zzbbpVar = zzbby.zziU;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && zzmVar.f10761f) {
            this.zzc.zzk().zzo(true);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar = ((zzeyb) zzejrVar).zza;
        Pair pair = new Pair(zzdpy.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.f10755Q));
        String strZza = zzdpy.DYNAMITE_ENTER.zza();
        o.f1952C.j.getClass();
        Bundle bundleZza = zzdqa.zza(pair, new Pair(strZza, Long.valueOf(System.currentTimeMillis())));
        zzfay zzfayVar = this.zzh;
        zzfayVar.zzt(str);
        zzfayVar.zzs(zzrVar);
        zzfayVar.zzH(zzmVar);
        zzfayVar.zzA(bundleZza);
        Context context = this.zza;
        zzfba zzfbaVarZzJ = zzfayVar.zzJ();
        zzffn zzffnVarZzb = zzffm.zzb(context, zzffx.zzf(zzfbaVarZzJ), 4, zzmVar);
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzii)).booleanValue()) {
            zzdeq zzdeqVarZzf = this.zzc.zzf();
            zzctx zzctxVar = new zzctx();
            zzctxVar.zzf(this.zza);
            zzctxVar.zzk(zzfbaVarZzJ);
            zzdeqVarZzf.zze(zzctxVar.zzl());
            zzdah zzdahVar = new zzdah();
            zzdahVar.zzj(this.zzd, this.zzb);
            zzdahVar.zzk(this.zzd, this.zzb);
            zzdeqVarZzf.zzd(zzdahVar.zzn());
            zzdeqVarZzf.zzc(new zzehm(this.zzf));
            zzderVarZzf = zzdeqVarZzf.zzh();
        } else {
            zzdah zzdahVar2 = new zzdah();
            zzezi zzeziVar = this.zze;
            if (zzeziVar != null) {
                zzdahVar2.zze(zzeziVar, this.zzb);
                zzdahVar2.zzf(this.zze, this.zzb);
                zzdahVar2.zzb(this.zze, this.zzb);
            }
            zzdeq zzdeqVarZzf2 = this.zzc.zzf();
            zzctx zzctxVar2 = new zzctx();
            zzctxVar2.zzf(this.zza);
            zzctxVar2.zzk(zzfbaVarZzJ);
            zzdeqVarZzf2.zze(zzctxVar2.zzl());
            zzdahVar2.zzj(this.zzd, this.zzb);
            zzdahVar2.zze(this.zzd, this.zzb);
            zzdahVar2.zzf(this.zzd, this.zzb);
            zzdahVar2.zzb(this.zzd, this.zzb);
            zzdahVar2.zza(this.zzd, this.zzb);
            zzdahVar2.zzl(this.zzd, this.zzb);
            zzdahVar2.zzk(this.zzd, this.zzb);
            zzdahVar2.zzi(this.zzd, this.zzb);
            zzdahVar2.zzc(this.zzd, this.zzb);
            zzdeqVarZzf2.zzd(zzdahVar2.zzn());
            zzdeqVarZzf2.zzc(new zzehm(this.zzf));
            zzderVarZzf = zzdeqVarZzf2.zzh();
        }
        zzder zzderVar = zzderVarZzf;
        if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
            zzffy zzffyVarZze = zzderVar.zze();
            zzffyVarZze.zzi(4);
            zzffyVarZze.zzb(zzmVar.f10745G);
            zzffyVarZze.zzf(zzmVar.f10742D);
            zzffyVar = zzffyVarZze;
        } else {
            zzffyVar = null;
        }
        zzcra zzcraVarZza = zzderVar.zza();
        I3.b bVarZzh = zzcraVarZza.zzh(zzcraVarZza.zzi());
        this.zzi = bVarZzh;
        zzgbc.zzr(bVarZzh, new zzeyh(this, zzejsVar, zzffyVar, zzffnVarZzb, zzderVar), this.zzb);
        return true;
    }

    public final void zzi(zzbct zzbctVar) {
        this.zzf = zzbctVar;
    }
}
