package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzdfq implements java.lang.Runnable {
    private final java.lang.ref.WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzdfs zzdfsVar = (com.google.android.gms.internal.ads.zzdfs) this.zza.get();
        if (zzdfsVar != null) {
            zzdfsVar.zzs(com.google.android.gms.internal.ads.zzdfp.zza);
        }
    }
}
