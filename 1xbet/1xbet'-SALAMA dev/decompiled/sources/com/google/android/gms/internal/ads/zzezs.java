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
public final class zzezs implements zzejt {
    private final Context zza;
    private final Executor zzb;
    private final zzcgb zzc;
    private final zzezi zzd;
    private final zzexw zze;
    private final zzfas zzf;
    private final zzfgb zzg;
    private final zzfay zzh;
    private I3.b zzi;

    public zzezs(Context context, Executor executor, zzcgb zzcgbVar, zzexw zzexwVar, zzezi zzeziVar, zzfay zzfayVar, zzfas zzfasVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgbVar;
        this.zze = zzexwVar;
        this.zzd = zzeziVar;
        this.zzh = zzfayVar;
        this.zzf = zzfasVar;
        this.zzg = zzcgbVar.zzy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdmy zzk(zzexu zzexuVar) {
        zzdmy zzdmyVarZzh = this.zzc.zzh();
        zzctx zzctxVar = new zzctx();
        zzctxVar.zzf(this.zza);
        zzctxVar.zzk(((zzezq) zzexuVar).zza);
        zzctxVar.zzj(this.zzf);
        zzdmyVarZzh.zzd(zzctxVar.zzl());
        zzdmyVarZzh.zzc(new zzdah().zzn());
        return zzdmyVarZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzejt
    public final boolean zza() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0068  */
    @Override // com.google.android.gms.internal.ads.zzejt
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzejr zzejrVar, zzejs zzejsVar) {
        zzffy zzffyVar;
        zzbvh zzbvhVar = new zzbvh(zzmVar, str);
        if (zzbvhVar.zzb == null) {
            int i7 = J.f3546b;
            j.d("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezl
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.zzdz(zzfcb.zzd(6, null, null));
                }
            });
            return false;
        }
        I3.b bVar = this.zzi;
        if (bVar != null && !bVar.isDone()) {
            return false;
        }
        if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
            zzexw zzexwVar = this.zze;
            if (zzexwVar.zzd() != null) {
                zzffy zzffyVarZzg = ((zzdmz) zzexwVar.zzd()).zzg();
                zzffyVarZzg.zzi(5);
                zzffyVarZzg.zzb(zzbvhVar.zza.f10745G);
                zzffyVarZzg.zzf(zzbvhVar.zza.f10742D);
                zzffyVar = zzffyVarZzg;
            } else {
                zzffyVar = null;
            }
        } else {
            zzffyVar = null;
        }
        zzfbx.zza(this.zza, zzbvhVar.zza.f10761f);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziU)).booleanValue() && zzbvhVar.zza.f10761f) {
            this.zzc.zzk().zzo(true);
        }
        Pair pair = new Pair(zzdpy.PUBLIC_API_CALL.zza(), Long.valueOf(zzbvhVar.zza.f10755Q));
        String strZza = zzdpy.DYNAMITE_ENTER.zza();
        o.f1952C.j.getClass();
        Bundle bundleZza = zzdqa.zza(pair, new Pair(strZza, Long.valueOf(System.currentTimeMillis())));
        zzfay zzfayVar = this.zzh;
        zzfayVar.zzt(zzbvhVar.zzb);
        zzfayVar.zzs(new com.google.android.gms.ads.internal.client.zzr("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false));
        zzfayVar.zzH(zzbvhVar.zza);
        zzfayVar.zzA(bundleZza);
        Context context = this.zza;
        zzfba zzfbaVarZzJ = zzfayVar.zzJ();
        zzffn zzffnVarZzb = zzffm.zzb(context, zzffx.zzf(zzfbaVarZzJ), 5, zzbvhVar.zza);
        zzezq zzezqVar = new zzezq(null);
        zzezqVar.zza = zzfbaVarZzJ;
        I3.b bVarZzc = this.zze.zzc(new zzexx(zzezqVar, null), new zzexv() { // from class: com.google.android.gms.internal.ads.zzezm
            @Override // com.google.android.gms.internal.ads.zzexv
            public final zzctv zza(zzexu zzexuVar) {
                return this.zza.zzk(zzexuVar);
            }
        }, null);
        this.zzi = bVarZzc;
        zzgbc.zzr(bVarZzc, new zzezp(this, zzejsVar, zzffyVar, zzffnVarZzb, zzezqVar), this.zzb);
        return true;
    }

    public final void zzj(int i7) {
        this.zzh.zzp().zza(i7);
    }
}
