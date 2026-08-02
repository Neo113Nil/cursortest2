package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
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
        zzder zzh;
        zzffy zzffyVar;
        if (str == null) {
            int i7 = J.f3546b;
            j.d("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyc
                @Override // java.lang.Runnable
                public final void run() {
                    zzeyi.this.zzd.zzdz(zzfcb.zzd(6, null, null));
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
        String zza = zzdpy.DYNAMITE_ENTER.zza();
        o.f1952C.j.getClass();
        Bundle zza2 = zzdqa.zza(pair, new Pair(zza, Long.valueOf(System.currentTimeMillis())));
        zzfay zzfayVar = this.zzh;
        zzfayVar.zzt(str);
        zzfayVar.zzs(zzrVar);
        zzfayVar.zzH(zzmVar);
        zzfayVar.zzA(zza2);
        Context context = this.zza;
        zzfba zzJ = zzfayVar.zzJ();
        zzffn zzb = zzffm.zzb(context, zzffx.zzf(zzJ), 4, zzmVar);
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzii)).booleanValue()) {
            zzdeq zzf = this.zzc.zzf();
            zzctx zzctxVar = new zzctx();
            zzctxVar.zzf(this.zza);
            zzctxVar.zzk(zzJ);
            zzf.zze(zzctxVar.zzl());
            zzdah zzdahVar = new zzdah();
            zzdahVar.zzj(this.zzd, this.zzb);
            zzdahVar.zzk(this.zzd, this.zzb);
            zzf.zzd(zzdahVar.zzn());
            zzf.zzc(new zzehm(this.zzf));
            zzh = zzf.zzh();
        } else {
            zzdah zzdahVar2 = new zzdah();
            zzezi zzeziVar = this.zze;
            if (zzeziVar != null) {
                zzdahVar2.zze(zzeziVar, this.zzb);
                zzdahVar2.zzf(this.zze, this.zzb);
                zzdahVar2.zzb(this.zze, this.zzb);
            }
            zzdeq zzf2 = this.zzc.zzf();
            zzctx zzctxVar2 = new zzctx();
            zzctxVar2.zzf(this.zza);
            zzctxVar2.zzk(zzJ);
            zzf2.zze(zzctxVar2.zzl());
            zzdahVar2.zzj(this.zzd, this.zzb);
            zzdahVar2.zze(this.zzd, this.zzb);
            zzdahVar2.zzf(this.zzd, this.zzb);
            zzdahVar2.zzb(this.zzd, this.zzb);
            zzdahVar2.zza(this.zzd, this.zzb);
            zzdahVar2.zzl(this.zzd, this.zzb);
            zzdahVar2.zzk(this.zzd, this.zzb);
            zzdahVar2.zzi(this.zzd, this.zzb);
            zzdahVar2.zzc(this.zzd, this.zzb);
            zzf2.zzd(zzdahVar2.zzn());
            zzf2.zzc(new zzehm(this.zzf));
            zzh = zzf2.zzh();
        }
        zzder zzderVar = zzh;
        if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
            zzffy zze = zzderVar.zze();
            zze.zzi(4);
            zze.zzb(zzmVar.f10745G);
            zze.zzf(zzmVar.f10742D);
            zzffyVar = zze;
        } else {
            zzffyVar = null;
        }
        zzcra zza3 = zzderVar.zza();
        I3.b zzh2 = zza3.zzh(zza3.zzi());
        this.zzi = zzh2;
        zzgbc.zzr(zzh2, new zzeyh(this, zzejsVar, zzffyVar, zzb, zzderVar), this.zzb);
        return true;
    }

    public final void zzi(zzbct zzbctVar) {
        this.zzf = zzbctVar;
    }
}
