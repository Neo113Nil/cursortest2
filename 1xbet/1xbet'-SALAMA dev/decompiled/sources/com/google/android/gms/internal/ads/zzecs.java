package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import F2.I0;
import I2.C0303k;
import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzecs implements zzebr {
    private final zzcot zza;
    private final Context zzb;
    private final zzdnq zzc;
    private final zzfba zzd;
    private final Executor zze;
    private final zzfsw zzf;
    private final zzdqk zzg;

    public zzecs(zzcot zzcotVar, Context context, Executor executor, zzdnq zzdnqVar, zzfba zzfbaVar, zzfsw zzfswVar, zzdqk zzdqkVar) {
        this.zzb = context;
        this.zza = zzcotVar;
        this.zze = executor;
        this.zzc = zzdnqVar;
        this.zzd = zzfbaVar;
        this.zzf = zzfswVar;
        this.zzg = zzdqkVar;
    }

    public static I3.b zzc(final zzecs zzecsVar, zzfar zzfarVar, zzfaf zzfafVar, Object obj) {
        zzbbp zzbbpVar = zzbby.zzcq;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            p150v0.a.n(o.f1952C.j, zzecsVar.zzg.zza(), zzdpy.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        com.google.android.gms.ads.internal.client.zzr zzrVarZza = zzfbg.zza(zzecsVar.zzb, zzfafVar.zzu);
        final zzceb zzcebVarZza = zzecsVar.zzc.zza(zzrVarZza, zzfafVar, zzfarVar.zzb.zzb);
        zzcebVarZza.zzac(zzfafVar.zzW);
        zzbbp zzbbpVar2 = zzbby.zzhQ;
        zzbbw zzbbwVar = c0254t.f2726c;
        View viewZza = (((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue() && zzfafVar.zzag) ? zzcpi.zza(zzecsVar.zzb, zzcebVarZza.zzF(), zzfafVar) : new zzdnt(zzecsVar.zzb, zzcebVarZza.zzF(), (C0303k) zzecsVar.zzf.apply(zzfafVar));
        if (((Boolean) zzbbwVar.zzb(zzbbpVar)).booleanValue()) {
            p150v0.a.n(o.f1952C.j, zzecsVar.zzg.zza(), zzdpy.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        final zzcnq zzcnqVarZza = zzecsVar.zza.zza(new zzcqm(zzfarVar, zzfafVar, null), new zzcnw(viewZza, zzcebVarZza, new zzcpu() { // from class: com.google.android.gms.internal.ads.zzecm
            @Override // com.google.android.gms.internal.ads.zzcpu
            public final I0 zza() {
                return zzcebVarZza.zzq();
            }
        }, zzfbg.zzb(zzrVarZza)));
        if (((Boolean) zzbbwVar.zzb(zzbbpVar)).booleanValue()) {
            p150v0.a.n(o.f1952C.j, zzecsVar.zzg.zza(), zzdpy.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzcnqVarZza.zzi().zzi(zzcebVarZza, false, null, zzecsVar.zzg.zza());
        zzcvi zzcviVarZzc = zzcnqVarZza.zzc();
        zzcvk zzcvkVar = new zzcvk() { // from class: com.google.android.gms.internal.ads.zzecn
            @Override // com.google.android.gms.internal.ads.zzcvk
            public final void zzr() {
                zzceb zzcebVar = zzcebVarZza;
                if (zzcebVar.zzN() != null) {
                    zzcebVar.zzN().zzs();
                }
            }
        };
        zzgbn zzgbnVar = zzbza.zzg;
        zzcviVarZzc.zzo(zzcvkVar, zzgbnVar);
        String strZzb = zzfafVar.zzs.zza;
        if (((Boolean) zzbbwVar.zzb(zzbby.zzfn)).booleanValue() && zzcnqVarZza.zzl().zze(true)) {
            strZzb = zzcfm.zzb(strZzb, zzcfm.zza(zzfafVar));
        }
        zzcnqVarZza.zzi();
        I3.b bVarZzj = zzdnp.zzj(zzcebVarZza, zzfafVar.zzs.zzb, strZzb, zzecsVar.zzg.zza());
        if (zzfafVar.zzM) {
            bVarZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeco
                @Override // java.lang.Runnable
                public final void run() {
                    zzcebVarZza.zzah();
                }
            }, zzecsVar.zze);
        }
        bVarZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecp
            @Override // java.lang.Runnable
            public final void run() {
                zzecs.zzd(this.zza, zzcebVarZza);
            }
        }, zzecsVar.zze);
        return zzgbc.zzm(bVarZzj, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzecq
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj2) {
                return zzcnqVarZza.zza();
            }
        }, zzgbnVar);
    }

    public static void zzd(zzecs zzecsVar, zzceb zzcebVar) {
        zzcebVar.zzab();
        zzfba zzfbaVar = zzecsVar.zzd;
        zzcfd zzcfdVarZzq = zzcebVar.zzq();
        com.google.android.gms.ads.internal.client.zzfx zzfxVar = zzfbaVar.zza;
        if (zzfxVar != null && zzcfdVarZzq != null) {
            zzcfdVarZzq.zzs(zzfxVar);
        }
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbu)).booleanValue() || zzcebVar.isAttachedToWindow()) {
            return;
        }
        zzcebVar.onPause();
        zzcebVar.zzav(true);
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final I3.b zza(final zzfar zzfarVar, final zzfaf zzfafVar) {
        return zzgbc.zzn(zzgbc.zzh(null), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzecr
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzecs.zzc(this.zza, zzfarVar, zzfafVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final boolean zzb(zzfar zzfarVar, zzfaf zzfafVar) {
        zzfak zzfakVar = zzfafVar.zzs;
        return (zzfakVar == null || zzfakVar.zza == null) ? false : true;
    }
}
