package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbpz implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ java.util.Map zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbqd zzd;

    zzbpz(com.google.android.gms.internal.ads.zzbqd zzbqdVar, java.util.Map map, com.google.android.gms.ads.internal.client.zza zzaVar, java.lang.String str) {
        this.zza = map;
        this.zzb = zzaVar;
        this.zzc = str;
        java.util.Objects.requireNonNull(zzbqdVar);
        this.zzd = zzbqdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlx)).booleanValue()) {
            this.zza.put("u", str);
        }
        this.zzd.zzf(str, this.zzb, this.zza, this.zzc);
    }
}
