package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfq {
    private final android.content.Context zza;
    private android.os.PowerManager.WakeLock zzb;

    public zzfq(android.content.Context context) {
        this.zza = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzb(boolean z, boolean z2) {
        boolean zzh;
        if (z) {
            if (this.zzb == null) {
                android.content.Context context = this.zza;
                if (context.checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                    com.google.android.gms.internal.ads.zzeg.zzc("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                    return;
                }
                android.os.PowerManager powerManager = (android.os.PowerManager) context.getSystemService("power");
                if (powerManager == null) {
                    com.google.android.gms.internal.ads.zzeg.zzc("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    android.os.PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.zzb = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
        }
        android.os.PowerManager.WakeLock wakeLock = this.zzb;
        if (wakeLock == null) {
            return;
        }
        zzh = com.google.android.gms.internal.ads.zzfr.zzh(z, z2);
        if (zzh) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final synchronized void zza(java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        android.os.PowerManager.WakeLock wakeLock;
        if (!atomicBoolean.get() || (wakeLock = this.zzb) == null) {
            return;
        }
        wakeLock.release();
    }
}
