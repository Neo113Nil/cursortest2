package com.google.android.gms.common.util.concurrent;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
final class zza implements java.lang.Runnable {
    private final java.lang.Runnable zza;

    public zza(java.lang.Runnable runnable, int i) {
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(0);
        this.zza.run();
    }
}
