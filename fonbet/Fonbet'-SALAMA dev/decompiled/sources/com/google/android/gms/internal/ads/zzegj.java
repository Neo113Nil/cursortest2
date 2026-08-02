package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzegj implements zzebr {
    private final Context zza;
    private final zzdnq zzb;
    private final zzdmz zzc;
    private final zzfba zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbjc zzg;
    private final boolean zzh = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziT)).booleanValue();
    private final zzeaq zzi;
    private final zzdqk zzj;
    private final zzdqq zzk;

    public zzegj(Context context, VersionInfoParcel versionInfoParcel, zzfba zzfbaVar, Executor executor, zzdmz zzdmzVar, zzdnq zzdnqVar, zzbjc zzbjcVar, zzeaq zzeaqVar, zzdqk zzdqkVar, zzdqq zzdqqVar) {
        this.zza = context;
        this.zzd = zzfbaVar;
        this.zzc = zzdmzVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdnqVar;
        this.zzg = zzbjcVar;
        this.zzi = zzeaqVar;
        this.zzj = zzdqkVar;
        this.zzk = zzdqqVar;
    }

    public static I3.b zzc(zzegj zzegjVar, final zzfaf zzfafVar, zzfar zzfarVar, zzdnu zzdnuVar, Object obj) {
        final zzegj zzegjVar2;
        zzbbp zzbbpVar = zzbby.zzcq;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            AbstractC1663a.n(o.f1952C.j, zzegjVar.zzj.zza(), zzdpy.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        final zzceb zza = zzegjVar.zzb.zza(zzegjVar.zzd.zze, zzfafVar, zzfarVar.zzb.zzb);
        zza.zzac(zzfafVar.zzW);
        zzdnuVar.zza(zzegjVar.zza, zza.zzF());
        zzbbw zzbbwVar = c0254t.f2726c;
        if (((Boolean) zzbbwVar.zzb(zzbbpVar)).booleanValue()) {
            AbstractC1663a.n(o.f1952C.j, zzegjVar.zzj.zza(), zzdpy.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzbzf zzbzfVar = new zzbzf();
        final zzdmv zzd = zzegjVar.zzc.zzd(new zzcqm(zzfarVar, zzfafVar, null), new zzdmw(new zzegi(zzegjVar.zza, zzegjVar.zzb, zzegjVar.zzd, zzegjVar.zzf, zzfafVar, zzbzfVar, zza, zzegjVar.zzg, zzegjVar.zzh, zzegjVar.zzi, zzegjVar.zzj, zzegjVar.zzk), zza));
        zzbzfVar.zzc(zzd);
        if (((Boolean) zzbbwVar.zzb(zzbbpVar)).booleanValue()) {
            zzegjVar2 = zzegjVar;
            AbstractC1663a.n(o.f1952C.j, zzegjVar2.zzj.zza(), zzdpy.RENDERING_AD_COMPONENT_CREATION_END.zza());
        } else {
            zzegjVar2 = zzegjVar;
        }
        zzbjr.zzb(zza, zzd.zzg());
        zzd.zzc().zzo(new zzcvk() { // from class: com.google.android.gms.internal.ads.zzegc
            @Override // com.google.android.gms.internal.ads.zzcvk
            public final void zzr() {
                zzceb zzcebVar = zzceb.this;
                if (zzcebVar.zzN() != null) {
                    zzcebVar.zzN().zzs();
                }
            }
        }, zzbza.zzg);
        zzd.zzl().zzi(zza, true, zzegjVar2.zzh ? zzegjVar2.zzg : null, zzegjVar2.zzj.zza());
        String str = zzfafVar.zzs.zza;
        if (((Boolean) zzbbwVar.zzb(zzbby.zzfn)).booleanValue() && zzd.zzm().zze(true)) {
            str = zzcfm.zzb(str, zzcfm.zza(zzfafVar));
        }
        zzd.zzl();
        return zzgbc.zzm(zzdnp.zzj(zza, zzfafVar.zzs.zzb, str, zzegjVar2.zzj.zza()), new zzfsw(zzegjVar2) { // from class: com.google.android.gms.internal.ads.zzegd
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj2) {
                zzceb zzcebVar = zza;
                if (zzfafVar.zzM) {
                    zzcebVar.zzah();
                }
                zzdmv zzdmvVar = zzd;
                zzcebVar.zzab();
                zzcebVar.onPause();
                return zzdmvVar.zzi();
            }
        }, zzegjVar2.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final I3.b zza(final zzfar zzfarVar, final zzfaf zzfafVar) {
        final zzdnu zzdnuVar = new zzdnu();
        I3.b zzn = zzgbc.zzn(zzgbc.zzh(null), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzege
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzegj.zzc(zzegj.this, zzfafVar, zzfarVar, zzdnuVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegf
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
