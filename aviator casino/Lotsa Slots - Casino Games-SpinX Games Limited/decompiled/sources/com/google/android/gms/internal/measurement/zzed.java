package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.5.0 */
/* loaded from: classes4.dex */
final class zzed implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.ThreadFactory zza;

    zzed(com.google.android.gms.internal.measurement.zzfb zzfbVar) {
        java.util.Objects.requireNonNull(zzfbVar);
        this.zza = java.util.concurrent.Executors.defaultThreadFactory();
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread newThread = this.zza.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
