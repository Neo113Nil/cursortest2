package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbzv implements java.lang.Thread.UncaughtExceptionHandler {
    final /* synthetic */ java.lang.Thread.UncaughtExceptionHandler zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbzy zzb;

    zzbzv(com.google.android.gms.internal.ads.zzbzy zzbzyVar, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zza = uncaughtExceptionHandler;
        java.util.Objects.requireNonNull(zzbzyVar);
        this.zzb = zzbzyVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        try {
            try {
                this.zzb.zzg(thread, th);
            } catch (java.lang.Throwable th2) {
                java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zza;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
                throw th2;
            }
        } catch (java.lang.Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("AdMob exception reporter failed reporting the exception.");
        }
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.zza;
        if (uncaughtExceptionHandler2 != null) {
            uncaughtExceptionHandler2.uncaughtException(thread, th);
        }
    }
}
