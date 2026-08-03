package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcna extends java.lang.Thread {
    final /* synthetic */ java.lang.Runnable zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcnb zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcna(com.google.android.gms.internal.ads.zzcnb zzcnbVar, java.lang.Runnable runnable, java.lang.String str, java.lang.Runnable runnable2) {
        super(runnable, str);
        this.zza = runnable2;
        java.util.Objects.requireNonNull(zzcnbVar);
        this.zzb = zzcnbVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(this.zzb.zza());
        this.zza.run();
    }
}
