package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class zzerw implements zzesg {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;

    public zzerw(boolean z4, boolean z7, String str, boolean z8, int i7, int i8, int i9, String str2) {
        this.zza = z4;
        this.zzb = z7;
        this.zzc = str;
        this.zzd = z8;
        this.zze = i7;
        this.zzf = i8;
        this.zzg = i9;
        this.zzh = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzcts zzctsVar = (zzcts) obj;
        zzctsVar.zzb.putString("js", this.zzc);
        zzctsVar.zzb.putInt("target_api", this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final void zzb(Object obj) {
        Bundle bundle = ((zzcts) obj).zza;
        bundle.putString("js", this.zzc);
        bundle.putBoolean("is_nonagon", true);
        zzbbp zzbbpVar = zzbby.zzdU;
        C0254t c0254t = C0254t.f2723d;
        bundle.putString("extra_caps", (String) c0254t.f2726c.zzb(zzbbpVar));
        bundle.putInt("target_api", this.zze);
        bundle.putInt("dv", this.zzf);
        bundle.putInt("lv", this.zzg);
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzfT)).booleanValue() && !TextUtils.isEmpty(this.zzh)) {
            bundle.putString("ev", this.zzh);
        }
        Bundle bundleZza = zzfbo.zza(bundle, "sdk_env");
        bundleZza.putBoolean("mf", ((Boolean) zzbdy.zzc.zze()).booleanValue());
        bundleZza.putBoolean("instant_app", this.zza);
        bundleZza.putBoolean("lite", this.zzb);
        bundleZza.putBoolean("is_privileged_process", this.zzd);
        bundle.putBundle("sdk_env", bundleZza);
        Bundle bundleZza2 = zzfbo.zza(bundleZza, "build_meta");
        bundleZza2.putString("cl", "730675337");
        bundleZza2.putString("rapid_rc", "dev");
        bundleZza2.putString("rapid_rollup", "HEAD");
        bundleZza.putBundle("build_meta", bundleZza2);
    }
}
