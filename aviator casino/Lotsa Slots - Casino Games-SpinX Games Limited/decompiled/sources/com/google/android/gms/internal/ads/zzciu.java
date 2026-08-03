package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzciu implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcja zze;

    zzciu(com.google.android.gms.internal.ads.zzcja zzcjaVar, java.lang.String str, java.lang.String str2, int i, int i2, boolean z) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
        java.util.Objects.requireNonNull(zzcjaVar);
        this.zze = zzcjaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", java.lang.Integer.toString(this.zzc));
        hashMap.put("totalBytes", java.lang.Integer.toString(this.zzd));
        hashMap.put("cacheReady", "0");
        this.zze.zzw("onPrecacheEvent", hashMap);
    }
}
