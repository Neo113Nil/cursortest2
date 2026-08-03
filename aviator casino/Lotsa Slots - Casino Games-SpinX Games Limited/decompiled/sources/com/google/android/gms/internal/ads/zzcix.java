package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcix implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcja zzd;

    zzcix(com.google.android.gms.internal.ads.zzcja zzcjaVar, java.lang.String str, java.lang.String str2, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        java.util.Objects.requireNonNull(zzcjaVar);
        this.zzd = zzcjaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalBytes", java.lang.Integer.toString(this.zzc));
        this.zzd.zzw("onPrecacheEvent", hashMap);
    }
}
