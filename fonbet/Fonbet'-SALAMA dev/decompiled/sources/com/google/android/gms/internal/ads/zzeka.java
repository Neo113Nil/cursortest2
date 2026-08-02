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

/* loaded from: classes.dex */
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
                    zzeka.this.zzd.zza().zzdz(zzfcb.zzd(4, null, null));
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
                    zzeka.this.zzd.zza().zzdz(zzfcb.zzd(6, null, null));
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
        long currentTimeMillis = System.currentTimeMillis();
        String zza = zzdpy.PUBLIC_API_CALL.zza();
        Long valueOf = Long.valueOf(currentTimeMillis);
        Bundle zza2 = zzdqa.zza(new Pair(zza, valueOf), new Pair(zzdpy.DYNAMITE_ENTER.zza(), valueOf));
        zzfay zzfayVar = this.zza;
        zzfayVar.zzH(zzmVar);
        zzfayVar.zzA(zza2);
        zzfayVar.zzC(i9);
        Context context = this.zzc;
        zzfba zzJ = zzfayVar.zzJ();
        zzffn zzb = zzffm.zzb(context, zzffx.zzf(zzJ), 8, zzmVar);
        Z z4 = zzJ.zzn;
        if (z4 != null) {
            this.zzd.zzd().zzm(z4);
        }
        zzdfm zzg = this.zzb.zzg();
        zzctx zzctxVar = new zzctx();
        zzctxVar.zzf(this.zzc);
        zzctxVar.zzk(zzJ);
        zzg.zzf(zzctxVar.zzl());
        zzdah zzdahVar = new zzdah();
        zzdahVar.zzk(this.zzd.zzd(), this.zzb.zzA());
        zzg.zze(zzdahVar.zzn());
        zzg.zzd(this.zzd.zzc());
        zzg.zzc(new zzcnm(null));
        zzdfn zzg2 = zzg.zzg();
        if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
            zzffy zzf = zzg2.zzf();
            zzf.zzi(8);
            zzf.zzb(zzmVar.f10745G);
            zzf.zzf(zzmVar.f10742D);
            zzffyVar = zzf;
        } else {
            zzffyVar = null;
        }
        this.zzb.zzx().zzc(1);
        zzcgb zzcgbVar = this.zzb;
        zzgbn zzc = zzfdy.zzc();
        ScheduledExecutorService zzB = zzcgbVar.zzB();
        zzcra zza3 = zzg2.zza();
        zzcql zzcqlVar = new zzcql(zzc, zzB, zza3.zzh(zza3.zzi()));
        this.zzf = zzcqlVar;
        zzcqlVar.zze(new zzejz(this, zzejsVar, zzffyVar, zzb, zzg2));
        return true;
    }
}
