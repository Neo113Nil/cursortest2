package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzedp implements zzebr {
    private final Context zza;
    private final zzdnq zzb;
    private final zzder zzc;
    private final zzfba zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbjc zzg;
    private final boolean zzh = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziT)).booleanValue();
    private final zzeaq zzi;
    private final zzdqk zzj;
    private final zzdqq zzk;

    public zzedp(Context context, VersionInfoParcel versionInfoParcel, zzfba zzfbaVar, Executor executor, zzder zzderVar, zzdnq zzdnqVar, zzbjc zzbjcVar, zzeaq zzeaqVar, zzdqk zzdqkVar, zzdqq zzdqqVar) {
        this.zza = context;
        this.zzd = zzfbaVar;
        this.zzc = zzderVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdnqVar;
        this.zzg = zzbjcVar;
        this.zzi = zzeaqVar;
        this.zzj = zzdqkVar;
        this.zzk = zzdqqVar;
    }

    public static I3.b zzc(zzedp zzedpVar, final zzfaf zzfafVar, zzfar zzfarVar, zzdnu zzdnuVar, Object obj) {
        final zzedp zzedpVar2;
        zzbbp zzbbpVar = zzbby.zzcq;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            AbstractC1663a.n(o.f1952C.j, zzedpVar.zzj.zza(), zzdpy.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        final zzceb zza = zzedpVar.zzb.zza(zzedpVar.zzd.zze, zzfafVar, zzfarVar.zzb.zzb);
        zza.zzac(zzfafVar.zzW);
        zzdnuVar.zza(zzedpVar.zza, zza.zzF());
        zzbbw zzbbwVar = c0254t.f2726c;
        if (((Boolean) zzbbwVar.zzb(zzbbpVar)).booleanValue()) {
            AbstractC1663a.n(o.f1952C.j, zzedpVar.zzj.zza(), zzdpy.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzbzf zzbzfVar = new zzbzf();
        final zzddo zzd = zzedpVar.zzc.zzd(new zzcqm(zzfarVar, zzfafVar, null), new zzddr(new zzedo(zzedpVar.zza, zzedpVar.zzf, zzbzfVar, zzfafVar, zza, zzedpVar.zzd, zzedpVar.zzh, zzedpVar.zzg, zzedpVar.zzi, zzedpVar.zzk), zza));
        zzbzfVar.zzc(zzd);
        if (((Boolean) zzbbwVar.zzb(zzbbpVar)).booleanValue()) {
            zzedpVar2 = zzedpVar;
            AbstractC1663a.n(o.f1952C.j, zzedpVar2.zzj.zza(), zzdpy.RENDERING_AD_COMPONENT_CREATION_END.zza());
        } else {
            zzedpVar2 = zzedpVar;
        }
        zzd.zzc().zzo(new zzcvk() { // from class: com.google.android.gms.internal.ads.zzedm
            @Override // com.google.android.gms.internal.ads.zzcvk
            public final void zzr() {
                zzceb zzcebVar = zzceb.this;
                if (zzcebVar.zzN() != null) {
                    zzcebVar.zzN().zzs();
                }
            }
        }, zzbza.zzg);
        String str = zzfafVar.zzs.zza;
        if (((Boolean) zzbbwVar.zzb(zzbby.zzfn)).booleanValue() && zzd.zzl().zze(true)) {
            str = zzcfm.zzb(str, zzcfm.zza(zzfafVar));
        }
        zzd.zzi().zzi(zza, true, zzedpVar2.zzh ? zzedpVar2.zzg : null, zzedpVar2.zzj.zza());
        zzd.zzi();
        return zzgbc.zzm(zzdnp.zzj(zza, zzfafVar.zzs.zzb, str, zzedpVar2.zzj.zza()), new zzfsw(zzedpVar2) { // from class: com.google.android.gms.internal.ads.zzedn
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj2) {
                zzceb zzcebVar = zza;
                if (zzfafVar.zzM) {
                    zzcebVar.zzah();
                }
                zzddo zzddoVar = zzd;
                zzcebVar.zzab();
                zzcebVar.onPause();
                return zzddoVar.zzg();
            }
        }, zzedpVar2.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final I3.b zza(final zzfar zzfarVar, final zzfaf zzfafVar) {
        final zzdnu zzdnuVar = new zzdnu();
        I3.b zzn = zzgbc.zzn(zzgbc.zzh(null), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzedk
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzedp.zzc(zzedp.this, zzfafVar, zzfarVar, zzdnuVar, obj);
            }
        }, this.zze);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedl
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
