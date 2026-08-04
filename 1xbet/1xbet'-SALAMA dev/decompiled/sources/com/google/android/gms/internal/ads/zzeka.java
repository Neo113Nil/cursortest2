package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import F2.Z;
import I2.J;
import I2.P;
import J2.j;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzeka implements zzejt {
    private final zzfay zza;
    private final zzcgb zzb;
    private final Context zzc;
    private final zzejq zzd;
    private final zzfgb zze;
    private zzcql zzf;

    public zzeka(zzcgb zzcgbVar, Context context, zzejq zzejqVar, zzfay zzfayVar) {
        this.zzb = zzcgbVar;
        this.zzc = context;
        this.zzd = zzejqVar;
        this.zza = zzfayVar;
        this.zze = zzcgbVar.zzy();
        zzfayVar.zzv(zzejqVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzejt
    public final boolean zza() {
        zzcql zzcqlVar = this.zzf;
        return zzcqlVar != null && zzcqlVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzejt
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzejr zzejrVar, zzejs zzejsVar) {
        zzffy zzffyVar;
        o oVar = o.f1952C;
        P p5 = oVar.f1957c;
        if (P.g(this.zzc) && zzmVar.f10748J == null) {
            int i7 = J.f3546b;
            j.d("Failed to load the ad because app ID is missing.");
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejv
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.zza().zzdz(zzfcb.zzd(4, null, null));
                }
            });
            return false;
        }
        if (str == null) {
            int i8 = J.f3546b;
            j.d("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.zza().zzdz(zzfcb.zzd(6, null, null));
                }
            });
            return false;
        }
        zzfbx.zza(this.zzc, zzmVar.f10761f);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziU)).booleanValue() && zzmVar.f10761f) {
            this.zzb.zzk().zzo(true);
        }
        int i9 = ((zzeju) zzejrVar).zza;
        oVar.j.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzdpy.PUBLIC_API_CALL.zza();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        Bundle bundleZza = zzdqa.zza(new Pair(strZza, lValueOf), new Pair(zzdpy.DYNAMITE_ENTER.zza(), lValueOf));
        zzfay zzfayVar = this.zza;
        zzfayVar.zzH(zzmVar);
        zzfayVar.zzA(bundleZza);
        zzfayVar.zzC(i9);
        Context context = this.zzc;
        zzfba zzfbaVarZzJ = zzfayVar.zzJ();
        zzffn zzffnVarZzb = zzffm.zzb(context, zzffx.zzf(zzfbaVarZzJ), 8, zzmVar);
        Z z4 = zzfbaVarZzJ.zzn;
        if (z4 != null) {
            this.zzd.zzd().zzm(z4);
        }
        zzdfm zzdfmVarZzg = this.zzb.zzg();
        zzctx zzctxVar = new zzctx();
        zzctxVar.zzf(this.zzc);
        zzctxVar.zzk(zzfbaVarZzJ);
        zzdfmVarZzg.zzf(zzctxVar.zzl());
        zzdah zzdahVar = new zzdah();
        zzdahVar.zzk(this.zzd.zzd(), this.zzb.zzA());
        zzdfmVarZzg.zze(zzdahVar.zzn());
        zzdfmVarZzg.zzd(this.zzd.zzc());
        zzdfmVarZzg.zzc(new zzcnm(null));
        zzdfn zzdfnVarZzg = zzdfmVarZzg.zzg();
        if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
            zzffy zzffyVarZzf = zzdfnVarZzg.zzf();
            zzffyVarZzf.zzi(8);
            zzffyVarZzf.zzb(zzmVar.f10745G);
            zzffyVarZzf.zzf(zzmVar.f10742D);
            zzffyVar = zzffyVarZzf;
        } else {
            zzffyVar = null;
        }
        this.zzb.zzx().zzc(1);
        zzcgb zzcgbVar = this.zzb;
        zzgbn zzgbnVarZzc = zzfdy.zzc();
        ScheduledExecutorService scheduledExecutorServiceZzB = zzcgbVar.zzB();
        zzcra zzcraVarZza = zzdfnVarZzg.zza();
        zzcql zzcqlVar = new zzcql(zzgbnVarZzc, scheduledExecutorServiceZzB, zzcraVarZza.zzh(zzcraVarZza.zzi()));
        this.zzf = zzcqlVar;
        zzcqlVar.zze(new zzejz(this, zzejsVar, zzffyVar, zzffnVarZzb, zzdfnVarZzg));
        return true;
    }
}
