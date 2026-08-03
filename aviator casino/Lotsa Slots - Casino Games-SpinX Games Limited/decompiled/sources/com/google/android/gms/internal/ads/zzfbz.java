package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfbz implements com.google.android.gms.internal.ads.zzfci {
    public final boolean zza;
    public final boolean zzb;
    public final java.lang.String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final java.lang.String zzh;

    zzfbz(boolean z, boolean z2, java.lang.String str, boolean z3, int i, int i2, int i3, java.lang.String str2) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = i;
        this.zzf = i2;
        this.zzg = i3;
        this.zzh = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        bundle.putString("js", this.zzc);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeE));
        bundle.putInt("target_api", this.zze);
        bundle.putInt("dv", this.zzf);
        bundle.putInt("lv", this.zzg);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgT)).booleanValue()) {
            java.lang.String str = this.zzh;
            if (!android.text.TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        android.os.Bundle zza = com.google.android.gms.internal.ads.zzfln.zza(bundle, "sdk_env");
        zza.putBoolean("mf", ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkq.zzg.zze()).booleanValue());
        zza.putBoolean("instant_app", this.zza);
        zza.putBoolean("lite", this.zzb);
        zza.putBoolean("is_privileged_process", this.zzd);
        bundle.putBundle("sdk_env", zza);
        android.os.Bundle zza2 = com.google.android.gms.internal.ads.zzfln.zza(zza, "build_meta");
        zza2.putString("cl", "885195211");
        zza2.putString("rapid_rc", "dev");
        zza2.putString("rapid_rollup", "HEAD");
        zza.putBundle("build_meta", zza2);
    }
}
