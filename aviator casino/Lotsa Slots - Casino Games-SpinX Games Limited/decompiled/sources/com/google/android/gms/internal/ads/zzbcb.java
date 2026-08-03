package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbcb {
    private static final java.lang.String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private long zzb = 0;
    private long zzc = 0;
    private long zzd = -1;
    private boolean zze = false;

    zzbcb(android.content.Context context, java.util.concurrent.Executor executor, java.lang.String[] strArr) {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((android.app.AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new com.google.android.gms.internal.ads.zzbca(this));
        } catch (java.lang.IllegalArgumentException | java.lang.NoSuchMethodError unused) {
        }
    }

    public static com.google.android.gms.internal.ads.zzbcb zza(android.content.Context context, java.util.concurrent.Executor executor) {
        return new com.google.android.gms.internal.ads.zzbcb(context, executor, zza);
    }

    public final void zzb() {
        if (this.zze) {
            this.zzc = java.lang.System.currentTimeMillis();
        }
    }

    public final long zzc() {
        if (this.zze) {
            return this.zzc - this.zzb;
        }
        return -1L;
    }

    public final long zzd() {
        long j = this.zzd;
        this.zzd = -1L;
        return j;
    }

    final /* synthetic */ void zze(long j) {
        this.zzb = j;
    }

    final /* synthetic */ long zzf() {
        return this.zzc;
    }

    final /* synthetic */ void zzg(long j) {
        this.zzd = j;
    }

    final /* synthetic */ void zzh(boolean z) {
        this.zze = z;
    }
}
