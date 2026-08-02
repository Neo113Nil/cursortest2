package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbsu implements com.google.android.libraries.places.internal.zzbzx {
    @Override // com.google.android.libraries.places.internal.zzbzx
    public final /* synthetic */ void zza(java.lang.Object obj) {
        ((java.util.concurrent.ScheduledExecutorService) obj).shutdown();
    }

    @Override // com.google.android.libraries.places.internal.zzbzx
    public final /* synthetic */ java.lang.Object zzb() {
        java.util.concurrent.ScheduledExecutorService newScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(1, com.google.android.libraries.places.internal.zzbsz.zzd("grpc-timer-%d", true));
        try {
            newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", java.lang.Boolean.TYPE).invoke(newScheduledThreadPool, java.lang.Boolean.TRUE);
        } catch (java.lang.NoSuchMethodException unused) {
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
        return java.util.concurrent.Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
    }

    zzbsu() {
    }
}
