package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzciv implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcja zzk;

    zzciv(com.google.android.gms.internal.ads.zzcja zzcjaVar, java.lang.String str, java.lang.String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = j5;
        this.zzh = z;
        this.zzi = i;
        this.zzj = i2;
        java.util.Objects.requireNonNull(zzcjaVar);
        this.zzk = zzcjaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bufferedDuration", java.lang.Long.toString(this.zzc));
        hashMap.put("totalDuration", java.lang.Long.toString(this.zzd));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcB)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", java.lang.Long.toString(this.zze));
            hashMap.put("qoeCachedBytes", java.lang.Long.toString(this.zzf));
            hashMap.put("totalBytes", java.lang.Long.toString(this.zzg));
            hashMap.put("reportTime", java.lang.Long.toString(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        }
        hashMap.put("cacheReady", true != this.zzh ? "0" : "1");
        hashMap.put("playerCount", java.lang.Integer.toString(this.zzi));
        hashMap.put("playerPreparedCount", java.lang.Integer.toString(this.zzj));
        this.zzk.zzw("onPrecacheEvent", hashMap);
    }
}
