package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzecc implements zzebr {
    private final zzcnd zza;
    private final Context zzb;
    private final zzdnq zzc;
    private final zzfba zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbjc zzg;
    private final boolean zzh = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziT)).booleanValue();
    private final zzeaq zzi;
    private final zzdqk zzj;
    private final zzdqq zzk;

    public zzecc(zzcnd zzcndVar, Context context, Executor executor, zzdnq zzdnqVar, zzfba zzfbaVar, VersionInfoParcel versionInfoParcel, zzbjc zzbjcVar, zzeaq zzeaqVar, zzdqk zzdqkVar, zzdqq zzdqqVar) {
        this.zzb = context;
        this.zza = zzcndVar;
        this.zze = executor;
        this.zzc = zzdnqVar;
        this.zzd = zzfbaVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzbjcVar;
        this.zzi = zzeaqVar;
        this.zzj = zzdqkVar;
        this.zzk = zzdqqVar;
    }

    public static I3.b zzc(zzecc zzeccVar, final zzfaf zzfafVar, zzfar zzfarVar, zzdnu zzdnuVar, Object obj) {
        final zzecc zzeccVar2;
        zzbbp zzbbpVar = zzbby.zzcq;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            AbstractC1663a.n(o.f1952C.j, zzeccVar.zzj.zza(), zzdpy.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        final zzceb zza = zzeccVar.zzc.zza(zzeccVar.zzd.zze, zzfafVar, zzfarVar.zzb.zzb);
        zza.zzac(zzfafVar.zzW);
        zzdnuVar.zza(zzeccVar.zzb, zza.zzF());
        zzbbw zzbbwVar = c0254t.f2726c;
        if (((Boolean) zzbbwVar.zzb(zzbbpVar)).booleanValue()) {
            AbstractC1663a.n(o.f1952C.j, zzeccVar.zzj.zza(), zzdpy.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzbzf zzbzfVar = new zzbzf();
        final zzcna zza2 = zzeccVar.zza.zza(new zzcqm(zzfarVar, zzfafVar, null), new zzddr(new zzece(zzeccVar.zzf, zzbzfVar, zzfafVar, zza, zzeccVar.zzd, zzeccVar.zzh, zzeccVar.zzg, zzeccVar.zzi, zzeccVar.zzk), zza), new zzcnb(zzfafVar.zzaa));
        if (((Boolean) zzbbwVar.zzb(zzbbpVar)).booleanValue()) {
            zzeccVar2 = zzeccVar;
            AbstractC1663a.n(o.f1952C.j, zzeccVar2.zzj.zza(), zzdpy.RENDERING_AD_COMPONENT_CREATION_END.zza());
        } else {
            zzeccVar2 = zzeccVar;
        }
        zza2.zzh().zzi(zza, false, zzeccVar2.zzh ? zzeccVar2.zzg : null, zzeccVar2.zzj.zza());
        zzbzfVar.zzc(zza2);
        zza2.zzc().zzo(new zzcvk() { // from class: com.google.android.gms.internal.ads.zzeca
            @Override // com.google.android.gms.internal.ads.zzcvk
            public final void zzr() {
                zzceb zzcebVar = zzceb.this;
                if (zzcebVar.zzN() != null) {
                    zzcebVar.zzN().zzs();
                }
            }
        }, zzbza.zzg);
        String str = zzfafVar.zzs.zza;
        if (((Boolean) zzbbwVar.zzb(zzbby.zzfn)).booleanValue() && zza2.zzi().zze(true)) {
            str = zzcfm.zzb(str, zzcfm.zza(zzfafVar));
        }
        zza2.zzh();
        return zzgbc.zzm(zzdnp.zzj(zza, zzfafVar.zzs.zzb, str, zzeccVar2.zzj.zza()), new zzfsw(zzeccVar2) { // from class: com.google.android.gms.internal.ads.zzecb
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj2) {
                zzceb zzcebVar = zza;
                if (zzfafVar.zzM) {
                    zzcebVar.zzah();
                }
                zzcna zzcnaVar = zza2;
                zzcebVar.zzab();
                zzcebVar.onPause();
                return zzcnaVar.zza();
            }
        }, zzeccVar2.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final I3.b zza(final zzfar zzfarVar, final zzfaf zzfafVar) {
        final zzdnu zzdnuVar = new zzdnu();
        I3.b zzn = zzgbc.zzn(zzgbc.zzh(null), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzeby
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzecc.zzc(zzecc.this, zzfafVar, zzfarVar, zzdnuVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebz
            @Override // java.lang.Runnable
            public final void run() {
                zzdnu.this.zzb();
            }
        }, this.zze);
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final boolean zzb(zzfar zzfarVar, zzfaf zzfafVar) {
        zzfak zzfakVar = zzfafVar.zzs;
        return (zzfakVar == null || zzfakVar.zza == null) ? false : true;
    }
}
