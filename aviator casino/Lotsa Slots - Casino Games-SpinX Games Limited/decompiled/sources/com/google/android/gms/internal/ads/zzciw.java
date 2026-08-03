package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzciw implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ int zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcja zzj;

    zzciw(com.google.android.gms.internal.ads.zzcja zzcjaVar, java.lang.String str, java.lang.String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = j;
        this.zzf = j2;
        this.zzg = z;
        this.zzh = i3;
        this.zzi = i4;
        java.util.Objects.requireNonNull(zzcjaVar);
        this.zzj = zzcjaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", java.lang.Integer.toString(this.zzc));
        hashMap.put("totalBytes", java.lang.Integer.toString(this.zzd));
        hashMap.put("bufferedDuration", java.lang.Long.toString(this.zze));
        hashMap.put("totalDuration", java.lang.Long.toString(this.zzf));
        hashMap.put("cacheReady", true != this.zzg ? "0" : "1");
        hashMap.put("playerCount", java.lang.Integer.toString(this.zzh));
        hashMap.put("playerPreparedCount", java.lang.Integer.toString(this.zzi));
        this.zzj.zzw("onPrecacheEvent", hashMap);
    }
}
