package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfbv implements com.google.android.gms.internal.ads.zzfci {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final java.lang.String zzd;
    public final java.lang.Long zze;

    public zzfbv(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Long l) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.google.android.gms.internal.ads.zzfln.zze(bundle, "gmp_app_id", this.zza);
        com.google.android.gms.internal.ads.zzfln.zze(bundle, "fbs_aiid", this.zzb);
        com.google.android.gms.internal.ads.zzfln.zze(bundle, "fbs_aeid", this.zzc);
        com.google.android.gms.internal.ads.zzfln.zze(bundle, "apm_id_origin", this.zzd);
        java.lang.Long l = this.zze;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
