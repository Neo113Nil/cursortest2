package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzati implements java.util.concurrent.Executor {
    private volatile java.util.concurrent.Executor zza;

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.zza.execute(runnable);
    }

    public final void zza() {
        this.zza = com.google.common.util.concurrent.MoreExecutors.directExecutor();
    }

    public zzati(java.util.concurrent.Executor executor) {
        this.zza = executor;
    }
}
