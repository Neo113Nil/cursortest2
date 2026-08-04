package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.D;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzevn implements zzejt {
    protected final zzcgb zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzewd zzd;
    private final zzexw zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    private final zzfgb zzh;
    private final zzfay zzi;
    private I3.b zzj;

    public zzevn(Context context, Executor executor, zzcgb zzcgbVar, zzexw zzexwVar, zzewd zzewdVar, zzfay zzfayVar, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcgbVar;
        this.zze = zzexwVar;
        this.zzd = zzewdVar;
        this.zzi = zzfayVar;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcgbVar.zzy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzctv zzm(zzexu zzexuVar) {
        zzevl zzevlVar = (zzevl) zzexuVar;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzih)).booleanValue()) {
            zzcnm zzcnmVar = new zzcnm(this.zzg);
            zzctx zzctxVar = new zzctx();
            zzctxVar.zzf(this.zzb);
            zzctxVar.zzk(zzevlVar.zza);
            zzctz zzctzVarZzl = zzctxVar.zzl();
            zzdah zzdahVar = new zzdah();
            zzdahVar.zzc(this.zzd, this.zzc);
            zzdahVar.zzl(this.zzd, this.zzc);
            return zze(zzcnmVar, zzctzVarZzl, zzdahVar.zzn());
        }
        zzewd zzewdVarZzi = zzewd.zzi(this.zzd);
        zzdah zzdahVar2 = new zzdah();
        zzdahVar2.zzb(zzewdVarZzi, this.zzc);
        zzdahVar2.zzg(zzewdVarZzi, this.zzc);
        zzdahVar2.zzh(zzewdVarZzi, this.zzc);
        zzdahVar2.zzi(zzewdVarZzi, this.zzc);
        zzdahVar2.zzc(zzewdVarZzi, this.zzc);
        zzdahVar2.zzl(zzewdVarZzi, this.zzc);
        zzdahVar2.zzm(zzewdVarZzi);
        zzcnm zzcnmVar2 = new zzcnm(this.zzg);
        zzctx zzctxVar2 = new zzctx();
        zzctxVar2.zzf(this.zzb);
        zzctxVar2.zzk(zzevlVar.zza);
        return zze(zzcnmVar2, zzctxVar2.zzl(), zzdahVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzejt
    public final boolean zza() {
        I3.b bVar = this.zzj;
        return (bVar == null || bVar.isDone()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    @Override // com.google.android.gms.internal.ads.zzejt
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzejr zzejrVar, zzejs zzejsVar) {
        boolean z4;
        zzffy zzffyVar;
        zzcmz zzcmzVar;
        try {
            if (!zzmVar.f10758c.getBoolean("is_sdk_preload", false)) {
                if (!((Boolean) zzbdw.zzd.zze()).booleanValue()) {
                    z4 = false;
                } else if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.zzf.f10836c < ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzli)).intValue() || !z4) {
                    D.d("loadAd must be called on the main UI thread.");
                }
            }
            if (str == null) {
                int i7 = J.f3546b;
                j.d("Ad unit ID should not be null for app open ad.");
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzd.zzdz(zzfcb.zzd(6, null, null));
                    }
                });
                return false;
            }
            if (this.zzj != null) {
                return false;
            }
            if (!((Boolean) zzbdr.zzc.zze()).booleanValue() || (zzcmzVar = (zzcmz) this.zze.zzd()) == null) {
                zzffyVar = null;
            } else {
                zzffy zzffyVarZzg = zzcmzVar.zzg();
                zzffyVarZzg.zzi(7);
                zzffyVarZzg.zzb(zzmVar.f10745G);
                zzffyVarZzg.zzf(zzmVar.f10742D);
                zzffyVar = zzffyVarZzg;
            }
            zzfbx.zza(this.zzb, zzmVar.f10761f);
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziU)).booleanValue() && zzmVar.f10761f) {
                this.zza.zzk().zzo(true);
            }
            Pair pair = new Pair(zzdpy.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.f10755Q));
            String strZza = zzdpy.DYNAMITE_ENTER.zza();
            o.f1952C.j.getClass();
            Bundle bundleZza = zzdqa.zza(pair, new Pair(strZza, Long.valueOf(System.currentTimeMillis())));
            zzfay zzfayVar = this.zzi;
            zzfayVar.zzt(str);
            zzfayVar.zzs(com.google.android.gms.ads.internal.client.zzr.j());
            zzfayVar.zzH(zzmVar);
            zzfayVar.zzA(bundleZza);
            Context context = this.zzb;
            zzfba zzfbaVarZzJ = zzfayVar.zzJ();
            zzffn zzffnVarZzb = zzffm.zzb(context, zzffx.zzf(zzfbaVarZzJ), 7, zzmVar);
            zzevl zzevlVar = new zzevl(null);
            zzevlVar.zza = zzfbaVarZzJ;
            I3.b bVarZzc = this.zze.zzc(new zzexx(zzevlVar, null), new zzexv() { // from class: com.google.android.gms.internal.ads.zzevi
                @Override // com.google.android.gms.internal.ads.zzexv
                public final zzctv zza(zzexu zzexuVar) {
                    return this.zza.zzm(zzexuVar);
                }
            }, null);
            this.zzj = bVarZzc;
            zzgbc.zzr(bVarZzc, new zzevk(this, zzejsVar, zzffyVar, zzffnVarZzb, zzevlVar), this.zzc);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract zzctv zze(zzcnm zzcnmVar, zzctz zzctzVar, zzdaj zzdajVar);

    public final void zzl(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzi.zzu(zzxVar);
    }
}
