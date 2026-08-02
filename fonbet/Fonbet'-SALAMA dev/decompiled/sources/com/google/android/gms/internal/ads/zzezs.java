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
        zzdmy zzh = this.zzc.zzh();
        zzctx zzctxVar = new zzctx();
        zzctxVar.zzf(this.zza);
        zzctxVar.zzk(((zzezq) zzexuVar).zza);
        zzctxVar.zzj(this.zzf);
        zzh.zzd(zzctxVar.zzl());
        zzh.zzc(new zzdah().zzn());
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzejt
    public final boolean zza() {
        throw null;
    }

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
                    zzezs.this.zzd.zzdz(zzfcb.zzd(6, null, null));
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
                zzffy zzg = ((zzdmz) zzexwVar.zzd()).zzg();
                zzg.zzi(5);
                zzg.zzb(zzbvhVar.zza.f10745G);
                zzg.zzf(zzbvhVar.zza.f10742D);
                zzffyVar = zzg;
                zzfbx.zza(this.zza, zzbvhVar.zza.f10761f);
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziU)).booleanValue() && zzbvhVar.zza.f10761f) {
                    this.zzc.zzk().zzo(true);
                }
                Pair pair = new Pair(zzdpy.PUBLIC_API_CALL.zza(), Long.valueOf(zzbvhVar.zza.f10755Q));
                String zza = zzdpy.DYNAMITE_ENTER.zza();
                o.f1952C.j.getClass();
                Bundle zza2 = zzdqa.zza(pair, new Pair(zza, Long.valueOf(System.currentTimeMillis())));
                zzfay zzfayVar = this.zzh;
                zzfayVar.zzt(zzbvhVar.zzb);
                zzfayVar.zzs(new com.google.android.gms.ads.internal.client.zzr("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false));
                zzfayVar.zzH(zzbvhVar.zza);
                zzfayVar.zzA(zza2);
                Context context = this.zza;
                zzfba zzJ = zzfayVar.zzJ();
                zzffn zzb = zzffm.zzb(context, zzffx.zzf(zzJ), 5, zzbvhVar.zza);
                zzezq zzezqVar = new zzezq(null);
                zzezqVar.zza = zzJ;
                I3.b zzc = this.zze.zzc(new zzexx(zzezqVar, null), new zzexv() { // from class: com.google.android.gms.internal.ads.zzezm
                    @Override // com.google.android.gms.internal.ads.zzexv
                    public final zzctv zza(zzexu zzexuVar) {
                        zzdmy zzk;
                        zzk = zzezs.this.zzk(zzexuVar);
                        return zzk;
                    }
                }, null);
                this.zzi = zzc;
                zzgbc.zzr(zzc, new zzezp(this, zzejsVar, zzffyVar, zzb, zzezqVar), this.zzb);
                return true;
            }
        }
        zzffyVar = null;
        zzfbx.zza(this.zza, zzbvhVar.zza.f10761f);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziU)).booleanValue()) {
            this.zzc.zzk().zzo(true);
        }
        Pair pair2 = new Pair(zzdpy.PUBLIC_API_CALL.zza(), Long.valueOf(zzbvhVar.zza.f10755Q));
        String zza3 = zzdpy.DYNAMITE_ENTER.zza();
        o.f1952C.j.getClass();
        Bundle zza22 = zzdqa.zza(pair2, new Pair(zza3, Long.valueOf(System.currentTimeMillis())));
        zzfay zzfayVar2 = this.zzh;
        zzfayVar2.zzt(zzbvhVar.zzb);
        zzfayVar2.zzs(new com.google.android.gms.ads.internal.client.zzr("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false));
        zzfayVar2.zzH(zzbvhVar.zza);
        zzfayVar2.zzA(zza22);
        Context context2 = this.zza;
        zzfba zzJ2 = zzfayVar2.zzJ();
        zzffn zzb2 = zzffm.zzb(context2, zzffx.zzf(zzJ2), 5, zzbvhVar.zza);
        zzezq zzezqVar2 = new zzezq(null);
        zzezqVar2.zza = zzJ2;
        I3.b zzc2 = this.zze.zzc(new zzexx(zzezqVar2, null), new zzexv() { // from class: com.google.android.gms.internal.ads.zzezm
            @Override // com.google.android.gms.internal.ads.zzexv
            public final zzctv zza(zzexu zzexuVar) {
                zzdmy zzk;
                zzk = zzezs.this.zzk(zzexuVar);
                return zzk;
            }
        }, null);
        this.zzi = zzc2;
        zzgbc.zzr(zzc2, new zzezp(this, zzejsVar, zzffyVar, zzb2, zzezqVar2), this.zzb);
        return true;
    }

    public final void zzj(int i7) {
        this.zzh.zzp().zza(i7);
    }
}
