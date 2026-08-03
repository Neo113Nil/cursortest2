package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzewa implements com.google.android.gms.internal.ads.zzfck {
    final android.content.Context zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final long zzd;
    private final com.google.android.gms.internal.ads.zzczj zze;
    private final com.google.android.gms.internal.ads.zzfmg zzf;
    private final com.google.android.gms.internal.ads.zzfky zzg;
    private final com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzt.zzh().zzo();
    private final com.google.android.gms.internal.ads.zzdzg zzi;
    private final com.google.android.gms.internal.ads.zzczx zzj;

    public zzewa(android.content.Context context, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzczj zzczjVar, com.google.android.gms.internal.ads.zzfmg zzfmgVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, com.google.android.gms.internal.ads.zzdzg zzdzgVar, com.google.android.gms.internal.ads.zzczx zzczxVar, long j) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzczjVar;
        this.zzf = zzfmgVar;
        this.zzg = zzfkyVar;
        this.zzi = zzdzgVar;
        this.zzj = zzczxVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        android.os.Bundle bundle = new android.os.Bundle();
        com.google.android.gms.internal.ads.zzdzg zzdzgVar = this.zzi;
        java.util.Map zzc = zzdzgVar.zzc();
        java.lang.String str = this.zzb;
        zzc.put("seq_num", str);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcN)).booleanValue()) {
            zzdzgVar.zzd("tsacc", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzd));
            com.google.android.gms.ads.internal.zzt.zzc();
            zzdzgVar.zzd("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzJ(this.zza) ? "1" : "0");
        }
        com.google.android.gms.internal.ads.zzczj zzczjVar = this.zze;
        com.google.android.gms.internal.ads.zzfky zzfkyVar = this.zzg;
        zzczjVar.zzi(zzfkyVar.zzd);
        bundle.putAll(this.zzf.zzc());
        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzewb(this.zza, bundle, str, this.zzc, this.zzh, zzfkyVar.zzg, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 12;
    }
}
