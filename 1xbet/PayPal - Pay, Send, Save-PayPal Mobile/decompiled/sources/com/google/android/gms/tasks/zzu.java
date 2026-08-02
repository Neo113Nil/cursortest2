package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
final class zzu implements java.util.concurrent.Executor {
    private final android.os.Handler zza = new com.google.android.gms.internal.tasks.zza(android.os.Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zza.post(runnable);
    }
}
